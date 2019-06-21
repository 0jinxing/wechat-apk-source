package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;

final class BaseSOSWebViewUI$b extends LoadDataWebviewUI.a
{
  private BaseSOSWebViewUI$b(BaseSOSWebViewUI paramBaseSOSWebViewUI)
  {
    super(paramBaseSOSWebViewUI);
  }

  private static o aga(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(8356);
    ab.i("MicroMsg.FTS.BaseSOSWebViewUI", "url=%s | thread=%d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
    paramString = Uri.parse(paramString);
    try
    {
      paramString = e.openRead(paramString.getQueryParameter("path"));
      if (paramString != null)
      {
        paramString = new o("image/*", "utf8", paramString);
        AppMethodBeat.o(8356);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        continue;
        AppMethodBeat.o(8356);
        paramString = localObject;
      }
    }
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(8354);
    if ((paramn != null) && (paramn.getUrl() != null) && (paramn.getUrl().toString().startsWith("weixin://fts")))
    {
      o localo = aga(paramn.getUrl().toString());
      if (localo != null)
      {
        AppMethodBeat.o(8354);
        paramWebView = localo;
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(8354);
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(8353);
    if ((paramn != null) && (paramn.getUrl() != null) && (paramn.getUrl().toString().startsWith("weixin://fts")))
    {
      paramBundle = aga(paramn.getUrl().toString());
      if (paramBundle != null)
      {
        AppMethodBeat.o(8353);
        paramWebView = paramBundle;
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(8353);
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(8351);
    super.b(paramWebView, paramString);
    ab.i("MicroMsg.FTS.BaseSOSWebViewUI", "scene %d, onPageFinished %s", new Object[] { Integer.valueOf(this.uAz.scene), paramString });
    this.uAz.showOptionMenu(false);
    if ((this.uAz.uAs != null) && (!BaseSOSWebViewUI.b(this.uAz)))
    {
      this.uAz.uAs.mLL.clearFocus();
      this.uAz.aqX();
    }
    BaseSOSWebViewUI.c(this.uAz);
    this.uAz.dbv();
    AppMethodBeat.o(8351);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(8352);
    super.b(paramWebView, paramString, paramBitmap);
    ab.i("MicroMsg.FTS.BaseSOSWebViewUI", "onPageStarted %s", new Object[] { paramString });
    this.uAz.showOptionMenu(false);
    if ((this.uAz.uAs != null) && (!BaseSOSWebViewUI.b(this.uAz)))
    {
      this.uAz.uAs.mLL.clearFocus();
      this.uAz.aqX();
    }
    AppMethodBeat.o(8352);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(8355);
    if (paramString.startsWith("weixin://fts"))
    {
      o localo = aga(paramString);
      if (localo != null)
      {
        AppMethodBeat.o(8355);
        paramWebView = localo;
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.c(paramWebView, paramString);
      AppMethodBeat.o(8355);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.b
 * JD-Core Version:    0.6.2
 */