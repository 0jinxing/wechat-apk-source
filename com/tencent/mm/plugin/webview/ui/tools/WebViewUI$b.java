package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$b
  implements b
{
  public final String uxA = "weixin://addfriend/";

  private WebViewUI$b(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(7888);
    if (!this.uxp.icz.cZS().jB(5))
    {
      ab.e("MicroMsg.WebViewUI", "AddFriendHandler, permission fail");
      AppMethodBeat.o(7888);
    }
    while (true)
    {
      return bool;
      paramString = paramString.substring(19);
      if (bo.isNullOrNil(paramString))
      {
        bool = false;
        AppMethodBeat.o(7888);
        continue;
      }
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("from_webview", true);
      localBundle.putString("userName", paramString);
      try
      {
        this.uxp.icy.a(8, localBundle, this.uxp.hashCode());
        AppMethodBeat.o(7888);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.w("MicroMsg.WebViewUI", "AddFriendHandler, ex = " + paramString.getMessage());
      }
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7887);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7887);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://addfriend/");
      AppMethodBeat.o(7887);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.b
 * JD-Core Version:    0.6.2
 */