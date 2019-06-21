package com.tencent.mm.plugin.webview.ui.tools.game;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.wepkg.c;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;

final class GameWebViewUI$c extends GameBaseWebViewUI.a
{
  private GameWebViewUI$c(GameWebViewUI paramGameWebViewUI)
  {
    super(paramGameWebViewUI);
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(8738);
    if ((paramn == null) || (paramn.getUrl() == null))
    {
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(8738);
    }
    while (true)
    {
      return paramWebView;
      o localo = GameWebViewUI.j(this.uEh).ahA(paramn.getUrl().toString());
      if (localo != null)
      {
        AppMethodBeat.o(8738);
        paramWebView = localo;
      }
      else
      {
        paramWebView = super.a(paramWebView, paramn);
        AppMethodBeat.o(8738);
      }
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(8739);
    if ((paramn == null) || (paramn.getUrl() == null))
    {
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(8739);
    }
    while (true)
    {
      return paramWebView;
      o localo = GameWebViewUI.j(this.uEh).ahA(paramn.getUrl().toString());
      if (localo != null)
      {
        AppMethodBeat.o(8739);
        paramWebView = localo;
      }
      else
      {
        paramWebView = super.a(paramWebView, paramn, paramBundle);
        AppMethodBeat.o(8739);
      }
    }
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(8736);
    GameWebViewUI.O(this.uEh);
    super.a(paramWebView, paramInt, paramString1, paramString2);
    AppMethodBeat.o(8736);
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(8735);
    if (GameWebViewUI.M(this.uEh).eCg == 0L)
      GameWebViewUI.M(this.uEh).eCg = System.currentTimeMillis();
    if (GameWebViewUI.N(this.uEh).uDN == 0L)
      GameWebViewUI.N(this.uEh).uDN = System.currentTimeMillis();
    GameWebViewUI.O(this.uEh);
    GameWebViewUI.j(this.uEh).k(paramWebView, paramString);
    super.b(paramWebView, paramString);
    AppMethodBeat.o(8735);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(8734);
    if (GameWebViewUI.M(this.uEh).eCf == 0L)
      GameWebViewUI.M(this.uEh).eCf = System.currentTimeMillis();
    if (GameWebViewUI.N(this.uEh).uDM == 0L)
      GameWebViewUI.N(this.uEh).uDM = System.currentTimeMillis();
    GameWebViewUI.j(this.uEh).j(paramWebView, paramString);
    super.b(paramWebView, paramString, paramBitmap);
    AppMethodBeat.o(8734);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(8737);
    o localo = GameWebViewUI.j(this.uEh).ahA(paramString);
    if (localo != null)
    {
      AppMethodBeat.o(8737);
      paramWebView = localo;
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.c(paramWebView, paramString);
      AppMethodBeat.o(8737);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.c
 * JD-Core Version:    0.6.2
 */