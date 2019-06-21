package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$i
  implements b
{
  private final String uxL = "weixin://feedback/";

  private WebViewUI$i(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7947);
    paramString = new Bundle();
    paramString.putInt("MMActivity.OverrideEnterAnimation", 0);
    paramString.putInt("MMActivity.OverrideExitAnimation", 2131034227);
    try
    {
      this.uxp.icy.a(7, paramString, this.uxp.hashCode());
      AppMethodBeat.o(7947);
      return true;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.w("MicroMsg.WebViewUI", "FeedbackJumpHandler, ex = " + paramString.getMessage());
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7946);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7946);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://feedback/");
      AppMethodBeat.o(7946);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i
 * JD-Core Version:    0.6.2
 */