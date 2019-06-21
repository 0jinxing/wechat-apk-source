package com.tencent.mm.plugin.webview.stub;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubService$7
  implements Runnable
{
  WebViewStubService$7(WebViewStubService paramWebViewStubService, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7205);
    this.uqB.startActivity(this.val$intent);
    AppMethodBeat.o(7205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubService.7
 * JD-Core Version:    0.6.2
 */