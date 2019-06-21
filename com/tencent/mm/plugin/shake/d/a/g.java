package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.byt;
import com.tencent.mm.protocal.protobuf.byu;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class g extends e
{
  private final b ehh;
  private f ehi;

  public g(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    super(paramLong);
    AppMethodBeat.i(24616);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new byt();
    ((b.a)localObject).fsK = new byu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shaketv";
    ((b.a)localObject).fsI = 408;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (byt)this.ehh.fsG.fsP;
    ((byt)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    ((byt)localObject).wXO = paramInt2;
    if (paramBoolean)
      paramInt2 = 1;
    while (true)
    {
      ((byt)localObject).fJT = paramInt2;
      ((byt)localObject).wXP = paramInt1;
      if (com.tencent.mm.network.ab.ch(ah.getContext()))
      {
        paramInt1 = i;
        label158: ((byt)localObject).vZF = paramInt1;
        ((byt)localObject).vFE = paramInt3;
      }
      try
      {
        aw.ZK();
        f1 = bo.getFloat((String)c.Ry().get(ac.a.xKb, null), 0.0F);
      }
      catch (Exception paramArrayOfByte)
      {
        try
        {
          aw.ZK();
          f2 = bo.getFloat((String)c.Ry().get(ac.a.xKc, null), 0.0F);
        }
        catch (Exception paramArrayOfByte)
        {
          try
          {
            float f1;
            float f2;
            aw.ZK();
            paramInt1 = bo.ank((String)c.Ry().get(ac.a.xMC, null));
            while (true)
            {
              ((byt)localObject).vRq = f1;
              ((byt)localObject).wXQ = f2;
              o.a(2009, ((byt)localObject).wXQ, ((byt)localObject).vRq, paramInt1);
              AppMethodBeat.o(24616);
              return;
              paramInt2 = 0;
              break;
              paramInt1 = 2;
              break label158;
              paramArrayOfByte = paramArrayOfByte;
              f2 = 0.0F;
              f1 = 0.0F;
              paramInt1 = j;
              continue;
              paramArrayOfByte = paramArrayOfByte;
              f2 = 0.0F;
              paramInt1 = j;
            }
          }
          catch (Exception paramArrayOfByte)
          {
            while (true)
              paramInt1 = j;
          }
        }
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(24617);
    byt localbyt = (byt)this.ehh.fsG.fsP;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", new Object[] { Integer.valueOf(localbyt.wXO), Integer.valueOf(localbyt.ptz.getILen()), Integer.valueOf(localbyt.fJT), Float.valueOf(localbyt.wXP), Integer.valueOf(localbyt.vZF), Integer.valueOf(localbyt.vFE) });
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24617);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24618);
    paramArrayOfByte = (byt)this.ehh.fsG.fsP;
    paramq = (byu)this.ehh.fsH.fsP;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramArrayOfByte.wXO), Integer.valueOf(paramq.fJT) });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramq.fJT == 1))
      this.qtI = true;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24618);
  }

  public final btd ckw()
  {
    return (byu)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 408;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.g
 * JD-Core Version:    0.6.2
 */