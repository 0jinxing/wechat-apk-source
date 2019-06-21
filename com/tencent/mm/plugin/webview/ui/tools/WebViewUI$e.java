package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$e
  implements b
{
  private WebViewUI$e(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7898);
    h.pYm.a(405L, 25L, 1L, true);
    WebViewUI.f(this.uxp, 1);
    AppMethodBeat.o(7898);
    return true;
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7897);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7897);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://critical_update/");
      AppMethodBeat.o(7897);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.e
 * JD-Core Version:    0.6.2
 */