package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.a;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;

final class FTSBaseWebViewUI$b extends PreLoadWebViewUI.a
{
  private FTSBaseWebViewUI$b(FTSBaseWebViewUI paramFTSBaseWebViewUI)
  {
    super(paramFTSBaseWebViewUI);
  }

  private static o aga(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(8403);
    ab.i("MicroMsg.FTS.FTSBaseWebViewUI", "url=%s | thread=%d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
    paramString = Uri.parse(paramString);
    try
    {
      paramString = e.openRead(paramString.getQueryParameter("path"));
      if (paramString != null)
      {
        paramString = new o("image/*", "utf8", paramString);
        AppMethodBeat.o(8403);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        continue;
        AppMethodBeat.o(8403);
        paramString = localObject;
      }
    }
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(8401);
    if ((paramn != null) && (paramn.getUrl() != null) && (paramn.getUrl().toString().startsWith("weixin://fts")))
    {
      o localo = aga(paramn.getUrl().toString());
      if (localo != null)
      {
        AppMethodBeat.o(8401);
        paramWebView = localo;
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(8401);
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(8400);
    if ((paramn != null) && (paramn.getUrl() != null) && (paramn.getUrl().toString().startsWith("weixin://fts")))
    {
      paramBundle = aga(paramn.getUrl().toString());
      if (paramBundle != null)
      {
        AppMethodBeat.o(8400);
        paramWebView = paramBundle;
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(8400);
    }
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(8404);
    super.a(paramWebView, paramInt, paramString1, paramString2);
    if ((paramString2 != null) && (paramString2.equals(this.uAU.cOG)))
      an.reportIdKey649ForLook(FTSBaseWebViewUI.g(this.uAU), 16);
    AppMethodBeat.o(8404);
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(8398);
    super.b(paramWebView, paramString);
    ab.i("MicroMsg.FTS.FTSBaseWebViewUI", "onPageFinished %s", new Object[] { paramString });
    this.uAU.showOptionMenu(false);
    if ((FTSBaseWebViewUI.i(this.uAU) != null) && (!FTSBaseWebViewUI.j(this.uAU)))
    {
      FTSBaseWebViewUI.i(this.uAU).getFtsEditText().mLL.clearFocus();
      this.uAU.aqX();
    }
    AppMethodBeat.o(8398);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(8399);
    super.b(paramWebView, paramString, paramBitmap);
    ab.i("MicroMsg.FTS.FTSBaseWebViewUI", "onPageStarted %s", new Object[] { paramString });
    this.uAU.showOptionMenu(false);
    if ((FTSBaseWebViewUI.i(this.uAU) != null) && (!FTSBaseWebViewUI.j(this.uAU)))
    {
      FTSBaseWebViewUI.i(this.uAU).getFtsEditText().mLL.clearFocus();
      this.uAU.aqX();
    }
    an.reportIdKey649ForLook(FTSBaseWebViewUI.g(this.uAU), 1);
    an.gp(FTSBaseWebViewUI.g(this.uAU), 1);
    AppMethodBeat.o(8399);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(8402);
    if (paramString.startsWith("weixin://fts"))
    {
      o localo = aga(paramString);
      if (localo != null)
      {
        AppMethodBeat.o(8402);
        paramWebView = localo;
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.c(paramWebView, paramString);
      AppMethodBeat.o(8402);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.b
 * JD-Core Version:    0.6.2
 */