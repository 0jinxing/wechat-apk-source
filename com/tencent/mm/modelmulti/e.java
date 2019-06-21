package com.tencent.mm.modelmulti;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.beb;
import com.tencent.mm.protocal.protobuf.bec;
import com.tencent.mm.protocal.s.a;
import com.tencent.mm.protocal.s.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import junit.framework.Assert;

public final class e extends m
  implements k
{
  g.a eOm;
  f ehi;
  final Queue<e.a> fCB;
  private StringBuilder fHL;
  WeakReference<com.tencent.mm.ai.g> fHU;
  final beb fHV;
  int fHW;
  boolean fHX;
  int fHY;
  int fHZ;
  boolean fIa;
  private final ap frk;
  private int retryCount;

  public e(com.tencent.mm.ai.g paramg)
  {
    AppMethodBeat.i(58362);
    this.fHU = null;
    this.fHV = new beb();
    this.fHL = new StringBuilder();
    this.fHW = 0;
    this.fHX = false;
    this.fHY = 0;
    this.fHZ = 0;
    this.retryCount = 3;
    this.fIa = false;
    this.fCB = new LinkedList();
    this.frk = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new e.1(this), true);
    ab.i("MicroMsg.NetSceneInit.dkInit", "NetSceneInit hash:%d stack:%s", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    this.fHL.append("stack:" + bo.dpG() + " time:" + bo.anT());
    this.fHU = new WeakReference(paramg);
    AppMethodBeat.o(58362);
  }

  private int a(com.tencent.mm.network.e parame, SKBuiltinBuffer_t paramSKBuiltinBuffer_t1, SKBuiltinBuffer_t paramSKBuiltinBuffer_t2)
  {
    AppMethodBeat.i(58364);
    this.fHL.append(" lastd:" + this.ftg + " dotime:" + bo.anT() + " net:" + at.getNetType(ah.getContext()));
    e.b localb = new e.b();
    SKBuiltinBuffer_t localSKBuiltinBuffer_t = paramSKBuiltinBuffer_t1;
    if (paramSKBuiltinBuffer_t1 == null)
    {
      com.tencent.mm.kernel.g.RQ();
      localSKBuiltinBuffer_t = com.tencent.mm.platformtools.aa.ad(bo.anf(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(8197, null))));
    }
    paramSKBuiltinBuffer_t1 = paramSKBuiltinBuffer_t2;
    if (paramSKBuiltinBuffer_t2 == null)
    {
      com.tencent.mm.kernel.g.RQ();
      paramSKBuiltinBuffer_t1 = com.tencent.mm.platformtools.aa.ad(bo.anf(bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(8198, null))));
    }
    com.tencent.mm.kernel.g.RQ();
    if ((bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(16, null)) != 0) && ((localSKBuiltinBuffer_t == null) || (localSKBuiltinBuffer_t.getILen() <= 0)))
      localb.acF().vyf = 7;
    while (true)
    {
      this.fHV.wHH = localSKBuiltinBuffer_t;
      this.fHV.wHI = paramSKBuiltinBuffer_t1;
      ((s.a)localb.acF()).vyE = this.fHV;
      ab.i("MicroMsg.NetSceneInit.dkInit", "doScene hash:%d time:%d count:%d user%s lan:%s status:%d cur[%s] max[%s]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.eOm.Mr()), Integer.valueOf(this.fHW), this.fHV.jBB, this.fHV.luQ, Integer.valueOf(localb.acF().vyf), bo.cd(com.tencent.mm.platformtools.aa.a(localSKBuiltinBuffer_t)), bo.cd(com.tencent.mm.platformtools.aa.a(paramSKBuiltinBuffer_t1)) });
      this.fHW += 1;
      int i = a(parame, localb, this);
      AppMethodBeat.o(58364);
      return i;
      com.tencent.mm.kernel.g.RQ();
      if (bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(8195, null)).length() <= 0)
        localb.acF().vyf = 3;
      else
        localb.acF().vyf = 4;
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, String paramString, bec parambec)
  {
    AppMethodBeat.i(58367);
    e.a locala = new e.a(this);
    locala.fIf = paramInt1;
    locala.errCode = paramInt3;
    locala.errType = paramInt2;
    locala.aIm = paramString;
    locala.fIe = parambec;
    this.fCB.add(locala);
    if (this.frk.doT())
      this.frk.ae(50L, 50L);
    AppMethodBeat.o(58367);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(58363);
    this.eOm = new g.a();
    this.ehi = paramf;
    paramf = this.fHV;
    com.tencent.mm.kernel.g.RQ();
    paramf.jBB = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, null));
    if (!bo.isNullOrNil(this.fHV.jBB));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("by DK: req.UserName is null", bool);
      this.fHV.luQ = com.tencent.mm.sdk.platformtools.aa.dor();
      int i = a(parame, null, null);
      AppMethodBeat.o(58363);
      return i;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58365);
    this.fHL.append(" endtime:" + bo.anT());
    ab.i("MicroMsg.NetSceneInit.dkInit", "summerinit onGYNetEnd [%d, %d, %s], tid:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(paramInt1) });
    if ((paramInt2 == 4) && (paramInt3 == -100))
    {
      ab.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR hash:%d [%d,%d] KICK OUT : %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      this.fIa = true;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(58365);
    }
    while (true)
    {
      return;
      if (((paramInt2 != 0) || (paramInt3 != 0)) && ((paramInt2 != 4) || (paramInt3 != -17)))
      {
        ab.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR retry:%d hash:%d [%d,%d] %s", new Object[] { Integer.valueOf(this.retryCount), Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
        if (this.retryCount > 0)
        {
          this.retryCount -= 1;
          if (a(this.ftf, null, null) != -1);
        }
        else
        {
          this.fIa = true;
          this.ehi.onSceneEnd(3, -1, "", this);
        }
        AppMethodBeat.o(58365);
      }
      else
      {
        paramq = ((s.b)paramq.ZS()).vyF;
        this.fHY += paramq.wHK;
        ab.i("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd hash:%d [%d,%d] time:%d cmdSum:%d doscenecount:%d conFlag:%d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(this.eOm.Mr()), Integer.valueOf(this.fHY), Integer.valueOf(this.fHW), Integer.valueOf(paramq.vQe) });
        a(this.fHW - 1, paramInt2, paramInt3, paramString, paramq);
        if (((paramq.vQe & 0x7) != 0) && (!super.acJ()))
        {
          if (a(this.ftf, paramq.wHH, paramq.wHI) == -1)
          {
            ab.e("MicroMsg.NetSceneInit.dkInit", "doScene Failed stop init");
            a(2147483647, 3, -1, "", null);
            AppMethodBeat.o(58365);
          }
        }
        else
        {
          ab.i("MicroMsg.NetSceneInit.dkInit", "NETWORK FINISH onGYNetEnd hash:%d time:%d netCnt:%d", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.eOm.Mr()), Integer.valueOf(this.fHW) });
          this.fHX = true;
          a(2147483647, 0, 0, "", null);
          AppMethodBeat.o(58365);
        }
      }
    }
  }

  public final boolean acI()
  {
    return true;
  }

  public final boolean acJ()
  {
    AppMethodBeat.i(138432);
    boolean bool = super.acJ();
    AppMethodBeat.o(138432);
    return bool;
  }

  public final int acn()
  {
    return 500;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final void cancel()
  {
    AppMethodBeat.i(58366);
    ab.w("MicroMsg.NetSceneInit.dkInit", "init cancel by :%s", new Object[] { bo.dpG() });
    super.cancel();
    this.fIa = true;
    AppMethodBeat.o(58366);
  }

  public final String getInfo()
  {
    AppMethodBeat.i(58368);
    String str = this.fHL.toString();
    AppMethodBeat.o(58368);
    return str;
  }

  public final int getType()
  {
    return 139;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.e
 * JD-Core Version:    0.6.2
 */