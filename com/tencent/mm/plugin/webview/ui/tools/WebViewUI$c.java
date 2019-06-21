package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$c
  implements b
{
  private WebViewUI$c(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7890);
    if (!this.uxp.icz.cZS().jB(17))
    {
      ab.e("MicroMsg.WebViewUI", "close window permission fail");
      AppMethodBeat.o(7890);
    }
    while (true)
    {
      return true;
      this.uxp.finish();
      AppMethodBeat.o(7890);
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7889);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7889);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://webview/close/");
      AppMethodBeat.o(7889);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.c
 * JD-Core Version:    0.6.2
 */