package com.tencent.mm.plugin.wallet.pay.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.nd;
import com.tencent.mm.protocal.protobuf.ne;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;

public class a extends u
{
  private b ehh;
  private f ehi;

  public a(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(45933);
    b.a locala = new b.a();
    nd localnd = new nd();
    localnd.vHD = paramString;
    localnd.vRK = paramInt1;
    localnd.vRL = paramInt2;
    locala.fsJ = localnd;
    locala.fsK = new ne();
    locala.uri = getUri();
    locala.fsI = ZU();
    locala.fsL = 0;
    locala.fsM = 0;
    locala.fsO = com.tencent.mm.wallet_core.ui.e.atB(paramString);
    this.ehh = locala.acD();
    ab.i("MicroMsg.NetSceneCancelPay", "request uri: %s, reqKey: %s, payScene: %d, payChannel:%d", new Object[] { getUri(), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(45933);
  }

  public int ZU()
  {
    return 2823;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(45934);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(45934);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(45935);
    ab.d("MicroMsg.NetSceneCancelPay", "response uri: %s, errType: %d, errCode: %d, errMsg: %s", new Object[] { getUri(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0));
    try
    {
      paramq = (ne)((b)paramq).fsH.fsP;
      ab.i("MicroMsg.NetSceneCancelPay", "NetSceneCancelPay BaseResponse.Ret is %d, BaseResponse.ErrMsg is %s", new Object[] { Integer.valueOf(paramq.BaseResponse.Ret), paramq.BaseResponse.ErrMsg });
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(45935);
      return;
    }
    catch (Exception paramq)
    {
      while (true)
        ab.i("MicroMsg.NetSceneCancelPay", paramq.getMessage());
    }
  }

  public final int getType()
  {
    AppMethodBeat.i(138553);
    int i = ZU();
    AppMethodBeat.o(138553);
    return i;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/ts_cancelpay";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.b.a
 * JD-Core Version:    0.6.2
 */