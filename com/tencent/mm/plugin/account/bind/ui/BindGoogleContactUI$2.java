package com.tencent.mm.plugin.account.bind.ui;

import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;

final class BindGoogleContactUI$2 extends s
{
  BindGoogleContactUI$2(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(13349);
    ab.d("MicroMsg.GoogleContact.BindGoogleContactUI", "shouldOverrideUrlLoading, url = %s", new Object[] { paramString });
    if (paramString.toLowerCase().startsWith("weixin://private/googlegetcode"))
    {
      BindGoogleContactUI.a(this.gqC, paramString);
      AppMethodBeat.o(13349);
    }
    while (true)
    {
      return bool;
      bool = super.a(paramWebView, paramString);
      AppMethodBeat.o(13349);
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(13348);
    ab.d("MicroMsg.GoogleContact.BindGoogleContactUI", "onPageFinished URL:".concat(String.valueOf(paramString)));
    if ((BindGoogleContactUI.a(this.gqC) != null) && (BindGoogleContactUI.a(this.gqC).getVisibility() != 0))
    {
      BindGoogleContactUI.a(this.gqC).setVisibility(0);
      if (BindGoogleContactUI.b(this.gqC) != null)
        BindGoogleContactUI.b(this.gqC).setVisibility(4);
    }
    BindGoogleContactUI.c(this.gqC);
    if (paramWebView != null)
    {
      paramWebView = paramWebView.getTitle();
      ab.d("MicroMsg.GoogleContact.BindGoogleContactUI", "title:%s", new Object[] { paramWebView });
      if (!TextUtils.isEmpty(paramWebView))
        if (paramWebView.toLowerCase().contains("success"))
        {
          if (BindGoogleContactUI.a(this.gqC) != null)
            BindGoogleContactUI.a(this.gqC).setVisibility(4);
          u.a(BindGoogleContactUI.a(this.gqC), "weixin://private/googlegetcode", "document.getElementById('code').value");
          AppMethodBeat.o(13348);
        }
    }
    while (true)
    {
      return;
      if (paramWebView.toLowerCase().contains("error"))
        ab.w("MicroMsg.GoogleContact.BindGoogleContactUI", "failed." + paramWebView.substring(paramWebView.indexOf("=")));
      AppMethodBeat.o(13348);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.2
 * JD-Core Version:    0.6.2
 */