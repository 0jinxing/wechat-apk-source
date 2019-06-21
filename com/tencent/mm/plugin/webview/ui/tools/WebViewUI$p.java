package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$p
  implements b
{
  private WebViewUI$p(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7961);
    paramString = paramString.substring(17);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.WebViewUI", "handleUrl fail, username is null");
      AppMethodBeat.o(7961);
    }
    while (true)
    {
      return true;
      if ((this.uxp.icz != null) && (this.uxp.icz.cZS() != null) && (this.uxp.icz.cZS().jB(2)))
        this.uxp.uhz.ago(paramString);
      AppMethodBeat.o(7961);
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7960);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7960);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://profile/");
      AppMethodBeat.o(7960);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.p
 * JD-Core Version:    0.6.2
 */