package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.g.a.lx;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.network.q;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bej;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.protocal.t.a;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.lang.reflect.Method;
import junit.framework.Assert;

public final class j extends m
  implements com.tencent.mm.network.k
{
  protected static int fHJ = 7;
  private static int fIB = 0;
  private static boolean fIy = false;
  public String TAG;
  private String aIm;
  private g.a eOm;
  private com.tencent.mm.ai.f ehi;
  private int errCode;
  private int errType;
  private int fHK;
  private long fHM;
  private boolean fHN;
  private ap fIA;
  private int fIC;
  private boolean fID;
  private String fIE;
  public t.b fIF;
  private long fIG;
  private boolean fIa;
  public p fIx;
  private boolean fIz;
  private ap frk;

  public j(int paramInt)
  {
    AppMethodBeat.i(58384);
    this.TAG = "MicroMsg.NetSceneSync";
    this.errType = 0;
    this.errCode = 0;
    this.aIm = "";
    this.fIx = null;
    this.fIz = false;
    this.fHK = 0;
    this.frk = null;
    this.fIA = null;
    this.fHM = -1L;
    this.fHN = false;
    this.fID = false;
    this.fIa = false;
    this.fIE = "";
    this.fIF = null;
    this.fIG = 0L;
    this.TAG = (this.TAG + "[" + hashCode() + "]");
    ab.i(this.TAG, "dkpush NetSceneSync scene:%d stack:%s", new Object[] { Integer.valueOf(paramInt), bo.dpG() });
    this.fIE = an.doQ();
    this.eOm = new g.a();
    if (this.fIx == null)
      this.fIx = new p();
    this.fIx.fJD = paramInt;
    com.tencent.mm.kernel.g.RQ();
    if ((com.tencent.mm.kernel.g.RP() != null) && (com.tencent.mm.kernel.g.RK()))
    {
      com.tencent.mm.kernel.g.RQ();
      if ((com.tencent.mm.kernel.g.RP().Ry() != null) && (!com.tencent.mm.kernel.a.QT()))
      {
        com.tencent.mm.kernel.g.RQ();
        long l = bo.a((Long)com.tencent.mm.kernel.g.RP().Ry().get(8196, null), 0L);
        if (l != 0L)
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(8196, Long.valueOf(0L));
          int i = (int)(l | fHJ);
          fHJ = i;
          fHJ = i & 0x5F;
        }
      }
    }
    if (paramInt == 1)
      fIy = true;
    if (paramInt == 1010)
    {
      fHJ |= 16;
      fIy = true;
      this.fIC = 7;
    }
    while (true)
    {
      if (fIB == 0)
        ahR();
      AppMethodBeat.o(58384);
      return;
      if (paramInt == 1011)
      {
        fHJ |= 64;
        fIy = true;
        this.fIC = 7;
      }
      else if (paramInt == 3)
      {
        fHJ |= 262144;
        fIy = true;
        this.fIC = 3;
        ab.i(this.TAG, "summerbadcr NetSceneSync aiScene[%d], selector[%d], syncScene[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(fHJ), Integer.valueOf(this.fIC) });
      }
      else
      {
        this.fIC = paramInt;
      }
    }
  }

  public j(t.b paramb, int paramInt, long paramLong)
  {
    this(8);
    AppMethodBeat.i(58385);
    this.fIE = an.doQ();
    ab.i(this.TAG, "dkpush NOTIFYDATA resp size:%d pushSyncFlag:%d  recvTime:%d", new Object[] { Long.valueOf(paramb.bufferSize), Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    this.fHK = paramInt;
    this.fHM = paramLong;
    this.frk = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new j.1(this, paramb), false);
    if (fIB == 0)
      ahR();
    AppMethodBeat.o(58385);
  }

  private boolean ahR()
  {
    boolean bool = false;
    AppMethodBeat.i(58390);
    Object localObject1 = new PInt();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    Object localObject2 = com.tencent.mm.booter.g.a((PInt)localObject1, com.tencent.mm.kernel.a.QF());
    String str = this.TAG;
    int i = ((PInt)localObject1).value;
    int j = hashCode();
    int k;
    if (localObject2 != null)
    {
      k = localObject2.length;
      ab.i(str, "dealWithRespData index:%d, hashcode:%d, buf.len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      fIB = ((PInt)localObject1).value;
      if ((((PInt)localObject1).value != 0) && (!bo.cb((byte[])localObject2)))
        break label131;
      fIB = 0;
      AppMethodBeat.o(58390);
    }
    while (true)
    {
      return bool;
      k = 0;
      break;
      label131: localObject1 = new t.b();
      try
      {
        ((t.b)localObject1).P((byte[])localObject2);
        localObject2 = new j.a((t.b)localObject1);
        this.fIA = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new j.2(this, (j.a)localObject2), false);
        AppMethodBeat.o(58390);
        bool = true;
      }
      catch (Exception localException)
      {
        com.tencent.mm.plugin.report.e.pXa.a(99L, 226L, 1L, false);
        ab.e(this.TAG, "dealWithRespData SyncResp fromProtoBuf failed");
        k = fIB;
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.booter.g.bO(k, com.tencent.mm.kernel.a.QF());
        fIB = 0;
        AppMethodBeat.o(58390);
      }
      catch (Error localError)
      {
        long l1 = Runtime.getRuntime().freeMemory() / 1000L;
        long l2 = Runtime.getRuntime().totalMemory() / 1000L;
        ab.i(this.TAG, "dealWithRespData memoryInfo avail/total, dalvik[%dk, %dk, user:%dk]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1) });
        Assert.assertTrue("dealWithRespData error", false);
        AppMethodBeat.o(58390);
      }
    }
  }

  private boolean ahS()
  {
    AppMethodBeat.i(58393);
    try
    {
      bool = ((Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)ah.getContext().getSystemService("power"), new Object[0])).booleanValue();
      AppMethodBeat.o(58393);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e(this.TAG, "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", new Object[] { Boolean.TRUE, bo.l(localException) });
        AppMethodBeat.o(58393);
        boolean bool = true;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    int i = -1;
    AppMethodBeat.i(58389);
    if (k.ahT())
    {
      fIB = 0;
      ab.e(this.TAG, "dkinit never do sync before init done");
      AppMethodBeat.o(58389);
    }
    while (true)
    {
      return i;
      this.ehi = paramf;
      if (this.fIx == null)
        this.fIx = new p();
      this.fIx.caA = com.tencent.mm.sdk.a.b.foreground;
      if (this.fIA != null)
      {
        ab.i(this.TAG, "pushSyncRespHandler not null");
        c(parame);
        this.fIA.ae(0L, 0L);
        AppMethodBeat.o(58389);
        i = 0;
      }
      else if (fIB > 0)
      {
        ab.w(this.TAG, "other sync is dealing with resp data :%d", new Object[] { Integer.valueOf(fIB) });
        AppMethodBeat.o(58389);
      }
      else
      {
        if (this.frk == null)
          break;
        ab.i(this.TAG, "pusher not null");
        c(parame);
        this.frk.ae(0L, 0L);
        AppMethodBeat.o(58389);
        i = 0;
      }
    }
    j.a locala = new j.a();
    bej localbej = ((t.a)locala.acF()).vyG;
    if (this.fIC == 3)
    {
      localbej.wIx = 1;
      label229: if (!this.fID)
        break label393;
    }
    label393: for (i = 6; ; i = this.fIC)
    {
      this.fIC = i;
      localbej.vTN = fHJ;
      com.tencent.mm.kernel.g.RQ();
      paramf = bo.anf(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(8195, new byte[0])));
      localbej.vTO = com.tencent.mm.platformtools.aa.ad(paramf);
      localbej.Scene = this.fIC;
      localbej.wIw = new tc();
      localbej.vIk = d.eSg;
      ab.i(this.TAG, "doScene Selector:%d Scene:%d key[%s]", new Object[] { Integer.valueOf(localbej.vTN), Integer.valueOf(localbej.Scene), com.tencent.mm.protocal.aa.bP(paramf) });
      fIy = false;
      i = a(parame, locala, this);
      AppMethodBeat.o(58389);
      break;
      localbej.wIx = 0;
      break label229;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58391);
    if ((paramq == null) || (paramq.getType() != 138))
    {
      paramString = this.TAG;
      if (paramq == null);
      for (paramInt1 = -2; ; paramInt1 = paramq.getType())
      {
        ab.e(paramString, "onGYNetEnd error type:%d", new Object[] { Integer.valueOf(paramInt1) });
        AppMethodBeat.o(58391);
        return;
      }
    }
    t.b localb = (t.b)paramq.ZS();
    paramArrayOfByte = this.TAG;
    long l = this.eOm.Mr();
    boolean bool = this.fHN;
    if (localb.vyH.vTR == null)
    {
      paramInt1 = -1;
      label121: ab.i(paramArrayOfByte, "onGYNetEnd:[%d,%d,%s] time:%d  isnotifydata:%b count:%d pusher:%s pushSyncRespHandler:%s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(l), Boolean.valueOf(bool), Integer.valueOf(paramInt1), this.frk, this.fIA });
      if (localb.vyH.vTR != null)
        break label383;
      paramInt1 = -1;
      label205: if (paramInt1 <= 0)
        break label398;
      paramInt1 = 1;
      label211: if (ahS())
        break label411;
      paramArrayOfByte = com.tencent.mm.plugin.report.e.pXa;
      if (paramInt1 == 0)
        break label403;
      l = 221L;
      label232: paramArrayOfByte.a(99L, l, 1L, false);
      this.frk = null;
      this.fIz = true;
      if ((paramInt2 != 4) || (paramInt3 != -2006))
        break label867;
      bool = true;
      paramInt2 = 0;
      paramInt3 = 0;
      com.tencent.mm.plugin.report.e.pXa.a(99L, 227L, 1L, false);
    }
    while (true)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        if (this.fIF != null)
        {
          ab.i(this.TAG, "oreh sync mIRH.processingResp is not null, and simulate not continue");
          this.errType = paramInt2;
          this.errCode = paramInt3;
          this.aIm = paramString;
          ((t.b)paramq.ZS()).vyH.vQe = 0;
        }
        while (true)
        {
          com.tencent.mm.plugin.report.e.pXa.a(99L, 232L, 1L, false);
          AppMethodBeat.o(58391);
          break;
          paramInt1 = localb.vyH.vTR.jBv;
          break label121;
          label383: paramInt1 = localb.vyH.vTR.jBv;
          break label205;
          label398: paramInt1 = 0;
          break label211;
          label403: l = 218L;
          break label232;
          label411: if (!com.tencent.mm.sdk.a.b.foreground)
          {
            paramArrayOfByte = com.tencent.mm.plugin.report.e.pXa;
            if (paramInt1 != 0);
            for (l = 220L; ; l = 217L)
            {
              paramArrayOfByte.a(99L, l, 1L, false);
              break;
            }
          }
          paramArrayOfByte = com.tencent.mm.plugin.report.e.pXa;
          if (paramInt1 != 0);
          for (l = 219L; ; l = 216L)
          {
            paramArrayOfByte.a(99L, l, 1L, false);
            break;
          }
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        }
      }
      com.tencent.mm.plugin.report.e.pXa.a(99L, 233L, 1L, false);
      paramArrayOfByte = com.tencent.mm.platformtools.aa.a(((t.a)paramq.acF()).vyG.vTO);
      paramq = com.tencent.mm.platformtools.aa.a(localb.vyH.vTO);
      ab.i(this.TAG, "onGYNetEnd replace key:%b req :%s", new Object[] { Boolean.valueOf(bool), com.tencent.mm.protocal.aa.bP(paramArrayOfByte) });
      ab.i(this.TAG, "onGYNetEnd replace key:%b resp:%s", new Object[] { Boolean.valueOf(bool), com.tencent.mm.protocal.aa.bP(paramq) });
      if (!bool)
      {
        paramString = paramArrayOfByte;
        if (bo.cb(paramArrayOfByte))
        {
          com.tencent.mm.kernel.g.RQ();
          paramString = bo.anf(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(8195, new byte[0])));
          ab.d(this.TAG, "dkpush userinfo key : %d[%s]", new Object[] { Integer.valueOf(paramString.length), bo.ca(paramString) });
        }
        paramArrayOfByte = com.tencent.mm.protocal.aa.j(paramString, paramq);
        if (paramArrayOfByte != null)
        {
          paramString = paramArrayOfByte;
          if (paramArrayOfByte.length > 0);
        }
        else
        {
          ab.w(this.TAG, "merge key failed, use server side instead");
          paramString = paramq;
        }
        localb.vyH.vTO = com.tencent.mm.platformtools.aa.ad(paramString);
      }
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RN().cd(localb.vyH.jBT, localb.vyH.wIy);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RN();
      com.tencent.mm.kernel.a.jO(localb.vyH.jBT);
      if (this.fIF == null);
      for (bool = true; ; bool = false)
      {
        Assert.assertTrue(bool);
        this.fIF = localb;
        this.fIG = bo.anU();
        new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new j.3(this), true).ae(50L, 50L);
        AppMethodBeat.o(58391);
        break;
      }
      label867: bool = false;
    }
  }

  protected final void a(t.b paramb)
  {
    AppMethodBeat.i(58392);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().Ry().set(8195, bo.cd(com.tencent.mm.platformtools.aa.a(paramb.vyH.vTO)));
    ah.getContext().getSharedPreferences("notify_sync_pref", h.Mu()).edit().putString("notify_sync_key_keybuf", bo.cd(com.tencent.mm.platformtools.aa.a(paramb.vyH.vTO))).commit();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().Ry().set(8196, Long.valueOf(paramb.vyH.vQe));
    boolean bool;
    long l;
    if (((paramb.vyH.vQe & fHJ) != 0) && (!super.acJ()))
    {
      bool = true;
      ab.i(this.TAG, "canContinue cont:%b ContinueFlag:%d selector:%d securityLimitCountReach:%b", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramb.vyH.vQe), Integer.valueOf(fHJ), Boolean.valueOf(super.acJ()) });
      if ((!bool) && ((paramb.vyH.vQe & 0x100) != 0))
      {
        localObject = new rv();
        ((rv)localObject).cNO.cvp = 1;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      if ((!bool) && ((paramb.vyH.vQe & 0x200000) != 0))
      {
        localObject = new lx();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      Object localObject = com.tencent.mm.plugin.report.e.pXa;
      if (!bool)
        break label405;
      l = 234L;
      label271: ((com.tencent.mm.plugin.report.e)localObject).a(99L, l, 1L, false);
      ab.i(this.TAG, "onRespHandled continueFlag:%d isNotifyData:%b conCont:%b notifyPending:%b pushSyncFlag:%d isContinueScene:%b respHandler:%s ", new Object[] { Integer.valueOf(paramb.vyH.vQe), Boolean.valueOf(this.fHN), Boolean.valueOf(bool), Boolean.valueOf(fIy), Integer.valueOf(this.fHK), Boolean.valueOf(this.fID), this.fIA });
      if ((this.fHN) || (!bool))
        break label413;
      this.fID = true;
      a(this.ftf, this.ehi);
      AppMethodBeat.o(58392);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label405: l = 235L;
      break label271;
      label413: int i;
      if (fIy)
      {
        ab.i(this.TAG, "dkpush new notify pending, sync now");
        if (fIB != 0)
        {
          i = fIB;
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RN();
          com.tencent.mm.booter.g.bO(i, com.tencent.mm.kernel.a.QF());
        }
        fIB = 0;
        this.fIA = null;
        fIy = false;
        this.fID = true;
        a(this.ftf, this.ehi);
        AppMethodBeat.o(58392);
      }
      else if (this.fIA != null)
      {
        i = fIB;
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.booter.g.bO(i, com.tencent.mm.kernel.a.QF());
        this.fIA = null;
        ahR();
        a(this.ftf, this.ehi);
        AppMethodBeat.o(58392);
      }
      else
      {
        if ((this.fHK & 0x1) > 0)
        {
          com.tencent.mm.kernel.g.RQ();
          paramb = bo.anf(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(8195, null)));
          com.tencent.mm.kernel.g.Rg().a(new f(this.fHM, paramb), 0);
        }
        ab.d(this.TAG, "sync or init end: reset selector : now = " + fHJ + " default = 7");
        fHJ = 7;
        this.ehi.onSceneEnd(this.errType, this.errCode, this.aIm, this);
        AppMethodBeat.o(58392);
      }
    }
  }

  public final boolean a(m paramm)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(58386);
    if (!(paramm instanceof j))
    {
      AppMethodBeat.o(58386);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      paramm = (j)paramm;
      if ((!paramm.fIz) && (fIy))
      {
        ab.e(this.TAG, "old not busy and notified, maybe cancel old scene, last dispatch=%d", new Object[] { Long.valueOf(paramm.ftg) });
        if (bo.az(paramm.ftg) > 360000L);
        while (true)
        {
          if (!bool1)
            break label156;
          ab.i(this.TAG, "summerworker NetSceneSync timeout");
          paramm = com.tencent.mm.kernel.g.RS().doN().findTaskByRunTime(0L);
          if (paramm == null)
            break label156;
          ab.e(this.TAG, "summerworker worker is just blocked by task: " + ak.dump(paramm, false));
          AppMethodBeat.o(58386);
          bool1 = bool2;
          break;
          bool1 = false;
        }
        label156: AppMethodBeat.o(58386);
      }
      else
      {
        AppMethodBeat.o(58386);
        bool1 = bool2;
      }
    }
  }

  public final boolean acI()
  {
    return true;
  }

  public final boolean acJ()
  {
    int i = 1;
    AppMethodBeat.i(58387);
    boolean bool = super.acJ();
    com.tencent.mm.plugin.report.e locale;
    if (bool)
    {
      com.tencent.mm.plugin.report.e.pXa.a(99L, 228L, 1L, false);
      locale = com.tencent.mm.plugin.report.e.pXa;
      if (!com.tencent.mm.sdk.a.b.foreground)
        break label126;
    }
    while (true)
    {
      locale.e(12063, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i), "9999" });
      AppMethodBeat.o(58387);
      return bool;
      label126: i = 2;
    }
  }

  public final int acn()
  {
    return 100;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final void cancel()
  {
    AppMethodBeat.i(58388);
    super.cancel();
    com.tencent.mm.plugin.report.e.pXa.a(99L, 229L, 1L, false);
    this.fIa = true;
    AppMethodBeat.o(58388);
  }

  public final int getType()
  {
    return 138;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.j
 * JD-Core Version:    0.6.2
 */