package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;

final class WebViewUI$t
  implements b
{
  private WebViewUI$t(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7968);
    String str = this.uxp.getString(2131302153);
    paramString = this.uxp;
    h.c local1 = new h.c()
    {
      public final void iE(int paramAnonymousInt)
      {
        AppMethodBeat.i(7966);
        WebViewUI.t localt;
        if (paramAnonymousInt == 0)
          localt = WebViewUI.t.this;
        while (true)
        {
          try
          {
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putString("shortUrl", localt.uxp.getIntent().getStringExtra("shortUrl"));
            localBundle.putInt("type", localt.uxp.getIntent().getIntExtra("type", 0));
            localt.uxp.icy.a(4, localBundle, localt.hashCode());
            AppMethodBeat.o(7966);
            return;
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.WebViewUI", "share fail, ex = " + localException.getMessage());
          }
          AppMethodBeat.o(7966);
        }
      }
    };
    h.a(paramString, "", new String[] { str }, "", local1);
    AppMethodBeat.o(7968);
    return true;
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7967);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7967);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://readershare/");
      AppMethodBeat.o(7967);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.t
 * JD-Core Version:    0.6.2
 */