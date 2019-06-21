package com.tencent.mm.plugin.webview.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.pluginsdk.n;

final class WebViewStubService$1$2
  implements Runnable
{
  WebViewStubService$1$2(WebViewStubService.1 param1, Bundle paramBundle1, Bundle paramBundle2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7106);
    Intent localIntent = new Intent();
    localIntent.addFlags(268435456);
    localIntent.putExtras(this.cgJ);
    localIntent.putExtra("isFromWebView", true);
    localIntent.putExtra("_stat_obj", this.hxg);
    a.gkE.q(localIntent, this.uqE.uqB);
    AppMethodBeat.o(7106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubService.1.2
 * JD-Core Version:    0.6.2
 */