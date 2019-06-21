package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$41
  implements MessageQueue.IdleHandler
{
  WebViewUI$41(WebViewUI paramWebViewUI, String paramString, long paramLong, int paramInt)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(7864);
    Looper.myQueue().removeIdleHandler(this);
    this.uxp.m(this.uxv, this.fEG, this.uxw);
    AppMethodBeat.o(7864);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.41
 * JD-Core Version:    0.6.2
 */