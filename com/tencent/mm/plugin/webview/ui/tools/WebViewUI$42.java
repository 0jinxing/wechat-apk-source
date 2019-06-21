package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$42
  implements Runnable
{
  WebViewUI$42(WebViewUI paramWebViewUI, Uri paramUri)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7865);
    WebViewUI localWebViewUI = this.uxp;
    Object localObject = this.ijb;
    if ((localWebViewUI == null) || (localObject == null))
    {
      ab.i("MicroMsg.AppInfoLogic", "launchApp failed, context or uri is null.");
      AppMethodBeat.o(7865);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppInfoLogic", "try to launchApp with uri.");
      localObject = new Intent("android.intent.action.VIEW", (Uri)localObject);
      ((Intent)localObject).addFlags(268435456);
      g.a(localWebViewUI, (Intent)localObject, null, null, null);
      AppMethodBeat.o(7865);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.42
 * JD-Core Version:    0.6.2
 */