package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.af.c;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$s
  implements b
{
  private WebViewUI$s(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7965);
    String str = this.uxp.getIntent().getStringExtra("geta8key_username");
    boolean bool = af.c.a(paramString, str, this.uxp.afH(str), this.uxp.icy, WebViewUI.Q(this.uxp), this.uxp.uxl, this.uxp.hashCode());
    AppMethodBeat.o(7965);
    return bool;
  }

  public final boolean afS(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(7964);
    d locald = this.uxp.icy;
    if (6 == this.uxp.getIntent().getIntExtra("geta8key_scene", 0))
    {
      ab.i("MicroMsg.OauthAuthorizeLogic", "shouldNativeOauthIntercept from oauth");
      AppMethodBeat.o(7964);
    }
    while (true)
    {
      return bool;
      if ((bo.isNullOrNil(paramString)) || (locald == null) || (!af.c.a(locald)) || (!af.c.a(paramString, locald)))
        break;
      bool = true;
      AppMethodBeat.o(7964);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.s
 * JD-Core Version:    0.6.2
 */