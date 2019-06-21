package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$y
  implements b
{
  private WebViewUI$y(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(7979);
    try
    {
      if (!this.uxp.icy.isSDCardAvailable())
      {
        this.uxp.icy.a(2, null, this.uxp.hashCode());
        AppMethodBeat.o(7979);
        return bool;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "edw handleUrl, ex = " + paramString.getMessage());
        bool = false;
        AppMethodBeat.o(7979);
        continue;
        WebViewUI.f(this.uxp, paramString.substring(19));
        ab.i("MicroMsg.WebViewUI", "viewimage currentUrl :" + WebViewUI.R(this.uxp));
        u.a(this.uxp.pzf, "weixin://private/gethtml/", "'<head>' + document.getElementsByTagName('head')[0].innerHTML + '</head><body>' + document.getElementsByTagName('body')[0].innerHTML + '</body>'", WebViewUI.S(this.uxp));
        AppMethodBeat.o(7979);
      }
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7978);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7978);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://viewimage/");
      AppMethodBeat.o(7978);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.y
 * JD-Core Version:    0.6.2
 */