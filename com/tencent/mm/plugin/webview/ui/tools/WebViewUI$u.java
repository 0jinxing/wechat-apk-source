package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$u
  implements b
{
  private WebViewUI$u(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7970);
    h.pYm.a(405L, 24L, 1L, true);
    WebViewUI.f(this.uxp, 2);
    AppMethodBeat.o(7970);
    return true;
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7969);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7969);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://recommend_update/");
      AppMethodBeat.o(7969);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.u
 * JD-Core Version:    0.6.2
 */