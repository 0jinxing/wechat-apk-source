package com.tencent.mm.plugin.recharge.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.cfp;
import com.tencent.mm.protocal.protobuf.cfq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.c.u;

public final class g extends u
  implements i
{
  private b ehh;
  private f ehi;
  public String mAppId;
  public PayInfo pGr;

  public g(MallRechargeProduct paramMallRechargeProduct, String paramString)
  {
    this(paramMallRechargeProduct.appId, paramMallRechargeProduct.pFP, paramMallRechargeProduct.cwg, paramString);
  }

  public g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(44205);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cfp();
    ((b.a)localObject).fsK = new cfq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/submitpayproductbuyinfo";
    ((b.a)localObject).fsI = 498;
    ((b.a)localObject).fsL = 230;
    ((b.a)localObject).fsM = 1000000230;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cfp)this.ehh.fsG.fsP;
    ab.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "remark: %s", new Object[] { paramString4 });
    this.mAppId = paramString1;
    ((cfp)localObject).wjW = paramString1;
    ((cfp)localObject).wjV = paramString2;
    ((cfp)localObject).wpE = paramString3;
    ((cfp)localObject).wjX = paramString4;
    ((cfp)localObject).wdB = c.cQT().acH(paramString2);
    AppMethodBeat.o(44205);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44207);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44207);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44206);
    this.pGr = new PayInfo();
    Object localObject = (cfq)((b)paramq).fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "resp.ReqKey " + ((cfq)localObject).vHD);
      this.pGr.appId = this.mAppId;
      this.pGr.tRb = ((cfq)localObject).wlc;
      this.pGr.czZ = ((cfq)localObject).vHD;
    }
    int i = paramInt2;
    if (paramInt2 == 0)
      i = ((cfq)localObject).wjY;
    paramq = paramString;
    if (bo.isNullOrNil(paramString))
      paramq = ((cfq)localObject).wjZ;
    this.pGr.vwg = String.valueOf(i);
    localObject = this.pGr;
    if (paramq != null);
    for (paramString = String.valueOf(paramq); ; paramString = "")
    {
      ((PayInfo)localObject).aIm = paramString;
      ab.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "errCode " + i + ", errMsg " + paramq);
      this.ehi.onSceneEnd(paramInt1, i, paramq, this);
      AppMethodBeat.o(44206);
      return;
    }
  }

  public final int getType()
  {
    return 498;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.g
 * JD-Core Version:    0.6.2
 */