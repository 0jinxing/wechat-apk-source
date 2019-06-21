package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$a
  implements b
{
  private WebViewUI$a(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7886);
    if (!this.uxp.icz.cZT().dmk())
    {
      ab.e("MicroMsg.WebViewUI", "ActivityJumpHandler not allow, no inner url generalcontrol, url = %s", new Object[] { paramString });
      AppMethodBeat.o(7886);
    }
    while (true)
    {
      return true;
      try
      {
        this.uxp.icy.bG(paramString, this.uxp.icz.cZS().jB(7));
        AppMethodBeat.o(7886);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.w("MicroMsg.WebViewUI", "ActivityJumpHandler, ex = " + paramString.getMessage());
      }
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7885);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7885);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://jump/");
      AppMethodBeat.o(7885);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.a
 * JD-Core Version:    0.6.2
 */