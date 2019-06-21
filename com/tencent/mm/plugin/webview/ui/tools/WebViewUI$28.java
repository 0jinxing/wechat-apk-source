package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.c;

final class WebViewUI$28
  implements h.c
{
  WebViewUI$28(WebViewUI paramWebViewUI, String paramString)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(7850);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(7850);
      while (true)
      {
        return;
        if (!WebViewUI.c(this.uxp, this.val$url))
        {
          ab.f("MicroMsg.WebViewUI", "showLoadUrlMenu, canLoadUrl fail, url = " + this.val$url);
          WebViewUI.k(this.uxp);
          AppMethodBeat.o(7850);
        }
        else
        {
          this.uxp.loadUrl(this.val$url);
          AppMethodBeat.o(7850);
        }
      }
      this.uxp.getApplicationContext();
      a.b(this.val$url, this.val$url);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.28
 * JD-Core Version:    0.6.2
 */