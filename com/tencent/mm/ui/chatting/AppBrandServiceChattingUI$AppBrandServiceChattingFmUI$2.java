package com.tencent.mm.ui.chatting;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.d.a;

final class AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$2
  implements com.tencent.mm.pluginsdk.ui.e.g
{
  AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$2(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI paramAppBrandServiceChattingFmUI)
  {
  }

  public final Object a(m paramm)
  {
    AppMethodBeat.i(30349);
    switch (paramm.type)
    {
    default:
      paramm = null;
      AppMethodBeat.o(30349);
    case 1:
    case 25:
    case 30:
    case 31:
    }
    while (true)
    {
      return paramm;
      paramm = this.yGB.cgL.getTalkerUserName();
      AppMethodBeat.o(30349);
    }
  }

  public final Object b(m paramm)
  {
    Object localObject = null;
    AppMethodBeat.i(30350);
    String str1;
    String str2;
    if (paramm.type == 45)
    {
      str1 = new String(Base64.decode(paramm.url, 0));
      str2 = new String(Base64.decode(bo.bc((String)paramm.au(String.class), ""), 0));
      ab.d("MicroMsg.AppBrandServiceChattingUI", "appId:%s,path:%s", new Object[] { str1, str2 });
      if ((AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.b(this.yGB) == 2) && (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.c(this.yGB).appId.equals(str1)))
      {
        ab.i("MicroMsg.AppBrandServiceChattingUI", "onBackFromContact appId:%s path:%s", new Object[] { str1, str2 });
        AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(this.yGB, str2);
        paramm = Boolean.TRUE;
        AppMethodBeat.o(30350);
      }
    }
    while (true)
    {
      return paramm;
      paramm = new AppBrandStatObject();
      paramm.scene = 1081;
      ((e)com.tencent.mm.kernel.g.K(e.class)).a(this.yGB.getContext(), null, str1, 0, 0, str2, paramm);
      AppMethodBeat.o(30350);
      paramm = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.2
 * JD-Core Version:    0.6.2
 */