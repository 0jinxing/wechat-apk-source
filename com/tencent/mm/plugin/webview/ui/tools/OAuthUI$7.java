package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

final class OAuthUI$7
  implements e.a
{
  OAuthUI$7(OAuthUI paramOAuthUI)
  {
  }

  public final void a(e parame, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(7423);
    ab.i("MicroMsg.OAuthUI", "onResult, url = " + paramString + ", isShowLocalErrorPage = " + paramBoolean);
    parame.urO = false;
    if (paramBoolean);
    while (true)
    {
      try
      {
        parame = this.urX.getString(2131301857);
        ab.i("MicroMsg.OAuthUI", "onResult, html = ".concat(String.valueOf(parame)));
        if (this.urX.pzf != null)
        {
          this.urX.pzf.loadUrl(parame);
          if (this.urX.ulI != null)
            this.urX.ulI.cXX().cOG = parame;
        }
        AppMethodBeat.o(7423);
        return;
      }
      catch (Exception parame)
      {
        ab.printErrStackTrace("MicroMsg.OAuthUI", parame, "", new Object[0]);
        parame = null;
        continue;
      }
      if ((!bo.isNullOrNil(paramString)) && (this.urX.pzf != null))
      {
        this.urX.pzf.loadUrl(paramString);
        if (this.urX.ulI != null)
          this.urX.ulI.cXX().cOG = paramString;
      }
      AppMethodBeat.o(7423);
    }
  }

  public final void d(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(7424);
    if (paramBoolean)
    {
      OAuthUI.a(this.urX, paramString2, paramString3, paramString1);
      AppMethodBeat.o(7424);
    }
    while (true)
    {
      return;
      OAuthUI.b(this.urX, paramString3);
      AppMethodBeat.o(7424);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OAuthUI.7
 * JD-Core Version:    0.6.2
 */