package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

final class d$58
  implements Runnable
{
  d$58(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8922);
    try
    {
      d.d(this.uFI).evaluateJavascript(this.uFO, null);
      AppMethodBeat.o(8922);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8922);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.58
 * JD-Core Version:    0.6.2
 */