package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cnb;
import com.tencent.mm.protocal.protobuf.cnc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class t extends u
{
  private final b ehh;
  private f ehi;
  public int errCode;
  public String kWB;
  public String kWz;
  public int tRC;

  public t(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(49080);
    this.kWz = null;
    this.tRC = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cnb();
    ((b.a)localObject).fsK = new cnc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifypurchase";
    ((b.a)localObject).fsI = 414;
    ((b.a)localObject).fsL = 215;
    ((b.a)localObject).fsM = 1000000215;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cnb)this.ehh.fsG.fsP;
    this.kWz = paramString1;
    ((cnb)localObject).ProductID = paramString1;
    ((cnb)localObject).xkz = paramInt1;
    ((cnb)localObject).wOu = paramInt3;
    ((cnb)localObject).pdc = paramInt2;
    if (!bo.isNullOrNil(paramString6))
    {
      ((cnb)localObject).wOs = paramString6;
      ((cnb)localObject).wOt = paramString5;
    }
    ((cnb)localObject).wOv = paramString2;
    ((cnb)localObject).xkB = paramString4;
    if (paramString3 != null)
      paramString1 = paramString3.getBytes();
    for (((cnb)localObject).xky = new SKBuiltinBuffer_t().setBuffer(paramString1); ; ((cnb)localObject).xky = new SKBuiltinBuffer_t())
    {
      ((cnb)localObject).xkA = ((int)bo.anT());
      ab.i("MicroMsg.NetSceneVerifyPurchase", "productId:" + this.kWz + ",verifyType:" + paramInt1 + ",palyType:" + paramInt2 + ",payload:" + paramString2 + ",purchaseData:" + paramString3 + ",dataSignature:" + paramString4);
      AppMethodBeat.o(49080);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(49082);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(49082);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(49081);
    ab.e("MicroMsg.NetSceneVerifyPurchase", "ErrType:" + paramInt1 + "   errCode:" + paramInt2);
    this.errCode = 0;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.errCode = -1;
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(49081);
    }
    while (true)
    {
      return;
      paramq = (cnc)((b)paramq).fsH.fsP;
      if (paramq.BaseResponse != null)
      {
        this.tRC = paramq.xkD;
        ab.d("MicroMsg.NetSceneVerifyPurchase", " Get Series ID is " + paramq.SeriesID);
        ab.d("MicroMsg.NetSceneVerifyPurchase", " Get Biz Type is " + paramq.xkC);
        this.kWB = paramq.SeriesID;
      }
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(49081);
    }
  }

  public final int getType()
  {
    return 414;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.t
 * JD-Core Version:    0.6.2
 */