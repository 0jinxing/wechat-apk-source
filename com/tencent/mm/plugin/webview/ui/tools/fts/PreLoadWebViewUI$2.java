package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class PreLoadWebViewUI$2
  implements Runnable
{
  PreLoadWebViewUI$2(PreLoadWebViewUI paramPreLoadWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8560);
    try
    {
      PreLoadWebViewUI.b(this.uCi).await();
      if (PreLoadWebViewUI.c(this.uCi))
      {
        ab.i("PreLoadWebViewUI", "send onUiInit to webview");
        this.uCi.dbE();
        PreLoadWebViewUI.d(this.uCi).aK(this.uCi.dbP());
      }
      AppMethodBeat.o(8560);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        ab.printErrStackTrace("PreLoadWebViewUI", localInterruptedException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI.2
 * JD-Core Version:    0.6.2
 */