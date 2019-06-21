package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;

final class n$43
  implements Runnable
{
  n$43(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7756);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7756);
    while (true)
    {
      return;
      WebViewUI localWebViewUI = (WebViewUI)n.a(this.uuo).get();
      if (localWebViewUI.pzf != null)
        localWebViewUI.pzf.evaluateJavascript("javascript:(function(){return window.getComputedStyle(document.body,null).backgroundColor})()", new WebViewUI.6(localWebViewUI));
      AppMethodBeat.o(7756);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.43
 * JD-Core Version:    0.6.2
 */