package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.aw.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.byp;
import com.tencent.mm.protocal.protobuf.byq;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class f extends e
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    super(paramLong);
    AppMethodBeat.i(24613);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new byp();
    ((b.a)localObject).fsK = new byq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakemusic";
    ((b.a)localObject).fsI = 367;
    ((b.a)localObject).fsL = 177;
    ((b.a)localObject).fsM = 1000000177;
    this.ehh = ((b.a)localObject).acD();
    localObject = (byp)this.ehh.fsG.fsP;
    ((byp)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    ((byp)localObject).wXO = paramInt2;
    if (paramBoolean)
      paramInt2 = 1;
    while (true)
    {
      ((byp)localObject).fJT = paramInt2;
      ((byp)localObject).wXP = paramInt1;
      float f1;
      float f2;
      float f3;
      float f4;
      if (com.tencent.mm.network.ab.ch(ah.getContext()))
      {
        paramInt1 = 1;
        ((byp)localObject).vZF = paramInt1;
        ((byp)localObject).vFE = paramInt3;
        f1 = 0.0F;
        f2 = 0.0F;
        f3 = f2;
        f4 = f1;
      }
      try
      {
        aw.ZK();
        f3 = f2;
        f4 = f1;
        f1 = bo.getFloat((String)c.Ry().get(ac.a.xKb, null), 0.0F);
        f3 = f2;
        f4 = f1;
        aw.ZK();
        f3 = f2;
        f4 = f1;
        f2 = bo.getFloat((String)c.Ry().get(ac.a.xKc, null), 0.0F);
        f3 = f2;
        f4 = f1;
        aw.ZK();
        f3 = f2;
        f4 = f1;
        paramInt1 = bo.ank((String)c.Ry().get(ac.a.xMC, null));
        f4 = f1;
        f3 = f2;
        ((byp)localObject).vRq = f4;
        ((byp)localObject).wXQ = f3;
        if (d.aio())
        {
          paramInt2 = 0;
          ((byp)localObject).wrA = paramInt2;
          if (!d.ain())
            break label389;
          paramInt2 = 1;
          ((byp)localObject).wrB = paramInt2;
          o.a(2014, ((byp)localObject).wXQ, ((byp)localObject).vRq, paramInt1);
          AppMethodBeat.o(24613);
          return;
          paramInt2 = 0;
          continue;
          paramInt1 = 2;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        while (true)
        {
          paramInt1 = 0;
          continue;
          paramInt2 = 1;
          continue;
          label389: paramInt2 = 0;
        }
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(24614);
    byp localbyp = (byp)this.ehh.fsG.fsP;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", new Object[] { Integer.valueOf(localbyp.wXO), Integer.valueOf(localbyp.ptz.getILen()), Integer.valueOf(localbyp.fJT), Float.valueOf(localbyp.wXP), Integer.valueOf(localbyp.vZF), Integer.valueOf(localbyp.vFE) });
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24614);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24615);
    paramArrayOfByte = (byp)this.ehh.fsG.fsP;
    paramq = (byq)this.ehh.fsH.fsP;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramArrayOfByte.wXO), Integer.valueOf(paramq.fJT) });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramq.fJT == 1))
      this.qtI = true;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24615);
  }

  public final btd ckw()
  {
    return (byq)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 367;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.f
 * JD-Core Version:    0.6.2
 */