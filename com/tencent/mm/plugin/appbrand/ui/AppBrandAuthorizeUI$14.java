package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.cmi;
import com.tencent.mm.protocal.protobuf.cwi;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandAuthorizeUI$14
  implements w.a
{
  AppBrandAuthorizeUI$14(AppBrandAuthorizeUI paramAppBrandAuthorizeUI)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(132906);
    ab.d("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      AppBrandAuthorizeUI.e(this.iFJ);
      AppMethodBeat.o(132906);
      return 0;
    }
    paramString = (cwi)paramb.fsH.fsP;
    if (paramString == null)
    {
      AppBrandAuthorizeUI.e(this.iFJ);
      ab.e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq failed, response is null!");
    }
    while (true)
    {
      AppMethodBeat.o(132906);
      break;
      paramInt1 = paramString.xsa.errCode;
      paramb = paramString.xsa.aIm;
      if (paramInt1 == 0)
      {
        this.iFJ.iFC = paramString.xsb;
        AppBrandAuthorizeUI.a(this.iFJ, this.iFJ.iFC);
      }
      else
      {
        AppBrandAuthorizeUI.e(this.iFJ);
        ab.e("MicroMsg.AppBrandAuthorizeUI", "WxaAppGetAuthInfoReq error %s", new Object[] { paramb });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.14
 * JD-Core Version:    0.6.2
 */