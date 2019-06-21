package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLDecoder;

final class WebViewUI$x
  implements b
{
  private WebViewUI$x(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(7977);
    paramString = paramString.substring(25);
    try
    {
      paramString = URLDecoder.decode(paramString);
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("nowUrl", WebViewUI.R(this.uxp));
      localBundle.putString("tweetid", bo.nullAsNil(this.uxp.getIntent().getStringExtra("tweetid")));
      localBundle.putString("htmlData", paramString);
      localBundle.putInt("type", this.uxp.getIntent().getIntExtra("type", 0));
      this.uxp.icy.a(3, localBundle, this.uxp.hashCode());
      bool = true;
      AppMethodBeat.o(7977);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "edw ViewImageGetHtmlHandler handleUrl, ex = " + paramString.getMessage());
        AppMethodBeat.o(7977);
      }
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7976);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7976);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://private/gethtml/");
      AppMethodBeat.o(7976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.x
 * JD-Core Version:    0.6.2
 */