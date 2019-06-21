package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.af.d;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$43
  implements af.d
{
  WebViewUI$43(WebViewUI paramWebViewUI)
  {
  }

  public final void aeq(String paramString)
  {
    AppMethodBeat.i(7866);
    WebViewUI.a(this.uxp, paramString, true, 9);
    AppMethodBeat.o(7866);
  }

  public final void blb()
  {
    AppMethodBeat.i(7869);
    if (WebViewUI.P(this.uxp) != null)
      WebViewUI.P(this.uxp).dismiss();
    AppMethodBeat.o(7869);
  }

  public final void d(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(7868);
    if (WebViewUI.P(this.uxp) != null)
      WebViewUI.P(this.uxp).dismiss();
    WebViewUI.a(this.uxp, h.b(this.uxp, this.uxp.getString(2131301856), true, paramOnCancelListener));
    AppMethodBeat.o(7868);
  }

  public final void goBack()
  {
    AppMethodBeat.i(7867);
    if (this.uxp.pzf == null)
      AppMethodBeat.o(7867);
    while (true)
    {
      return;
      if (WebViewUI.H(this.uxp))
      {
        AppMethodBeat.o(7867);
      }
      else if ((this.uxp.pzf.canGoBack()) && (this.uxp.uvn))
      {
        this.uxp.dai();
        AppMethodBeat.o(7867);
      }
      else
      {
        m.uuj.close();
        this.uxp.finish();
        AppMethodBeat.o(7867);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.43
 * JD-Core Version:    0.6.2
 */