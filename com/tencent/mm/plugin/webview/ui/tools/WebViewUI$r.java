package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$r
  implements b
{
  private WebViewUI$r(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7963);
    h.pYm.a(405L, 26L, 1L, true);
    WebViewUI.f(this.uxp, 3);
    AppMethodBeat.o(7963);
    return true;
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7962);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7962);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://manual_update/");
      AppMethodBeat.o(7962);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.r
 * JD-Core Version:    0.6.2
 */