package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$h$4
  implements Runnable
{
  WebViewUI$h$4(WebViewUI.h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7930);
    if (this.uxI.uxp.pzf != null)
      this.uxI.uxp.pzf.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", null);
    WebViewUI localWebViewUI = this.uxI.uxp;
    WebViewUI.2 local2 = new WebViewUI.2(localWebViewUI);
    if (Thread.currentThread().getId() == localWebViewUI.handler.getLooper().getThread().getId())
    {
      local2.run();
      AppMethodBeat.o(7930);
    }
    while (true)
    {
      return;
      localWebViewUI.handler.post(local2);
      AppMethodBeat.o(7930);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h.4
 * JD-Core Version:    0.6.2
 */