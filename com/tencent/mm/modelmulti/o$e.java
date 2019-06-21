package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.bej;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.protocal.t.a;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Queue;

final class o$e extends m
  implements o.c, k
{
  int fHJ;
  f fJv;
  boolean fJw;
  private boolean fJx = false;
  private q ftU;
  int scene;

  public o$e(o paramo, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.scene = paramInt1;
    this.fHJ = paramInt2;
    this.fJw = paramBoolean;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(58407);
    this.fJv = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(58407);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58408);
    if ((paramq == null) || (paramq.getType() != 138))
    {
      com.tencent.mm.plugin.report.e.pXa.a(99L, 44L, 1L, false);
      if (paramq == null)
      {
        paramInt1 = -2;
        ab.e("MicroMsg.SyncService", "%s onGYNetEnd error type:%d", new Object[] { this, Integer.valueOf(paramInt1) });
        AppMethodBeat.o(58408);
      }
    }
    while (true)
    {
      return;
      paramInt1 = paramq.getType();
      break;
      if (!this.fJx)
        break label114;
      ab.e("MicroMsg.SyncService", "%s onGYNetEnd has been callback  , give up  ", new Object[] { this });
      AppMethodBeat.o(58408);
    }
    label114: this.fJx = true;
    if (paramq == this.ftU)
    {
      bool1 = true;
      label131: o.J("Check rr failed.", bool1);
      if ((paramInt2 == 0) && (paramInt3 == 0))
        break label471;
      ab.e("MicroMsg.SyncService", "%s onGYNetEnd scene error Callback [%s,%s,%s ] rr:%s", new Object[] { this, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq });
      if ((paramInt2 != 4) || (paramInt3 != -2006))
        break label340;
      ab.w("MicroMsg.SyncService", "%s onGYNetEnd MM_ERR_KEYBUF_INVALID , not merge key buf", new Object[] { this });
      com.tencent.mm.plugin.report.e.pXa.a(99L, 42L, 1L, false);
    }
    label340: label471: for (boolean bool1 = false; ; bool1 = true)
    {
      paramString = ((t.b)paramq.ZS()).vyH;
      boolean bool2 = WXHardCoderJNI.hcReceiveMsgEnable;
      paramInt3 = WXHardCoderJNI.hcReceiveMsgDelay;
      int i = WXHardCoderJNI.hcReceiveMsgCPU;
      paramInt2 = WXHardCoderJNI.hcReceiveMsgIO;
      if (WXHardCoderJNI.hcReceiveMsgThr);
      for (paramInt1 = g.RS().doL(); ; paramInt1 = 0)
      {
        paramInt1 = WXHardCoderJNI.startPerformance(bool2, paramInt3, i, paramInt2, paramInt1, WXHardCoderJNI.hcReceiveMsgTimeout, 201, WXHardCoderJNI.hcReceiveMsgAction, "MicroMsg.SyncService");
        new o.a(this.fJl, this, bool1, paramString, new o.e.1(this, paramString, paramInt1), (byte)0);
        AppMethodBeat.o(58408);
        break;
        bool1 = false;
        break label131;
        com.tencent.mm.plugin.report.e.pXa.e(11098, new Object[] { Integer.valueOf(3501), this.scene + ";" + paramInt2 + ";" + paramInt3 + ";" + com.tencent.mm.sdk.a.b.foreground + ";" + o.ahZ() });
        com.tencent.mm.plugin.report.e.pXa.a(99L, 43L, 1L, false);
        this.fJv.onSceneEnd(paramInt2, paramInt3, paramString, this);
        o.a(this.fJl, this);
        AppMethodBeat.o(58408);
        break;
      }
    }
  }

  public final boolean acM()
  {
    return false;
  }

  public final boolean c(Queue<o.c> paramQueue)
  {
    boolean bool1 = false;
    AppMethodBeat.i(58405);
    int i = this.scene;
    int j = this.fHJ;
    boolean bool2 = this.fJw;
    Object localObject;
    boolean bool3;
    boolean bool4;
    if (paramQueue == null)
    {
      localObject = "null";
      ab.i("MicroMsg.SyncService", "%s begin run scene:%s selector:%s isContinue:%s List:%s", new Object[] { this, Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool2), localObject });
      if (paramQueue == null)
        break label272;
      o.b(paramQueue);
      bool3 = false;
      bool4 = false;
      label89: if (paramQueue.isEmpty())
        break label262;
      localObject = (e)paramQueue.poll();
      this.fHJ |= ((e)localObject).fHJ;
      if (((e)localObject).scene != 3)
        break label240;
      bool2 = true;
    }
    while (true)
    {
      ab.i("MicroMsg.SyncService", "%s pop:%s[%s] scene:%s selector:%s iscontinue:%s hashcont:%s hasBgfg:%s", new Object[] { this, Integer.valueOf(paramQueue.size()), localObject, Integer.valueOf(((e)localObject).scene), Integer.valueOf(((e)localObject).fHJ), Boolean.valueOf(((e)localObject).fJw), Boolean.valueOf(bool4), Boolean.valueOf(bool2) });
      bool3 = bool2;
      break label89;
      localObject = Integer.valueOf(paramQueue.size());
      break;
      label240: bool2 = bool3;
      if (((e)localObject).fJw)
      {
        bool4 = true;
        bool2 = bool3;
      }
    }
    label262: if (bool3)
    {
      this.scene = 3;
      label272: if ((g.RK()) && (!a.QT()))
      {
        g.RQ();
        if (g.RP() != null)
        {
          g.RQ();
          if (g.RP().Ry() != null)
            break label384;
        }
      }
      bool3 = g.RK();
      bool2 = a.QT();
      g.RQ();
      ab.e("MicroMsg.SyncService", "%s accready:%s hold:%s accstg:%s ", new Object[] { this, Boolean.valueOf(bool3), Boolean.valueOf(bool2), g.RP() });
      AppMethodBeat.o(58405);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (!bool4)
        break;
      this.scene = 6;
      break;
      label384: g.RQ();
      long l = bo.a((Long)g.RP().Ry().get(8196, null), 0L);
      if (l != 0L)
      {
        g.RQ();
        g.RP().Ry().set(8196, Long.valueOf(0L));
        this.fHJ = ((int)(this.fHJ | l));
        this.fHJ &= 95;
      }
      if (this.scene == 3)
      {
        j = 1;
        label472: if (this.scene != 1010)
          break label847;
        this.fHJ |= 16;
        this.scene = 7;
      }
      while (true)
      {
        if (this.fJw)
          this.scene = 6;
        this.ftU = new j.a();
        localObject = ((t.a)this.ftU.acF()).vyG;
        ((bej)localObject).wIx = j;
        ((bej)localObject).vTN = this.fHJ;
        ((bej)localObject).Scene = this.scene;
        g.RQ();
        paramQueue = bo.nullAsNil((String)g.RP().Ry().get(8195, new byte[0]));
        ((bej)localObject).vTO = com.tencent.mm.platformtools.aa.ad(bo.anf(paramQueue));
        ((bej)localObject).wIw = new tc();
        ((bej)localObject).vIk = d.eSg;
        ab.i("MicroMsg.SyncService", "%s continueFlag:%s SyncMsgDigest:%s Selector:%d Scene:%d device:%s", new Object[] { this, Long.valueOf(l), Integer.valueOf(((bej)localObject).wIx), Integer.valueOf(((bej)localObject).vTN), Integer.valueOf(this.scene), ((bej)localObject).vIk });
        ab.i("MicroMsg.SyncService", "%s Req synckey %s", new Object[] { this, com.tencent.mm.protocal.aa.bP(bo.anf(paramQueue)) });
        o.a(this);
        g.RQ();
        if (g.RO().eJo.a(this, 0))
          break label905;
        com.tencent.mm.plugin.report.e.pXa.e(11098, new Object[] { Integer.valueOf(3500), this.scene + ";" + com.tencent.mm.sdk.a.b.foreground + ";" + o.ahZ() });
        ab.e("MicroMsg.SyncService", "%s NetSceneQueue doScene failed. ", new Object[] { this });
        com.tencent.mm.plugin.report.e.pXa.a(99L, 41L, 1L, false);
        AppMethodBeat.o(58405);
        bool2 = bool1;
        break;
        j = 0;
        break label472;
        label847: if (this.scene == 1011)
        {
          this.fHJ |= 64;
          this.scene = 7;
        }
        else if (this.scene == 3)
        {
          this.fHJ |= 262144;
          this.scene = 3;
        }
      }
      label905: AppMethodBeat.o(58405);
      bool2 = true;
    }
  }

  public final int getType()
  {
    return 138;
  }

  public final String toString()
  {
    AppMethodBeat.i(58406);
    String str = "NetSync[" + hashCode() + "]";
    AppMethodBeat.o(58406);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.e
 * JD-Core Version:    0.6.2
 */