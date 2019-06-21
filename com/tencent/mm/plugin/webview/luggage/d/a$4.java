package com.tencent.mm.plugin.webview.luggage.d;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.webkit.WebResourceResponse;
import com.tencent.luggage.g.d;
import com.tencent.luggage.webview.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.DownloadChecker;
import com.tencent.mm.plugin.webview.luggage.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;

final class a$4 extends f
{
  a$4(a parama, a.a parama1)
  {
  }

  private o a(n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(6517);
    paramn = new b(paramn.getUrl(), paramn.isForMainFrame(), paramn.hasGesture(), paramn.getMethod(), paramn.getRequestHeaders());
    paramn = this.bRL.a(paramn, paramBundle);
    if (paramn != null)
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramn = new o(paramn.getMimeType(), paramn.getEncoding(), paramn.getStatusCode(), paramn.getReasonPhrase(), paramn.getResponseHeaders(), paramn.getData());
        AppMethodBeat.o(6517);
      }
    while (true)
    {
      return paramn;
      paramn = new o(paramn.getMimeType(), paramn.getEncoding(), paramn.getData());
      AppMethodBeat.o(6517);
      continue;
      paramn = null;
      AppMethodBeat.o(6517);
    }
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(6514);
    d.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", new Object[] { paramn.getUrl().toString() });
    o localo = a(paramn, new Bundle());
    if (localo != null)
    {
      AppMethodBeat.o(6514);
      paramWebView = localo;
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(6514);
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(6516);
    d.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", new Object[] { paramn.getUrl().toString() });
    paramBundle = a(paramn, paramBundle);
    if (paramBundle != null)
    {
      AppMethodBeat.o(6516);
      paramWebView = paramBundle;
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.c(paramWebView, paramn.getUrl().toString());
      AppMethodBeat.o(6516);
    }
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(6510);
    if (DownloadChecker.a(paramString, this.ulz.nHU, paramWebView))
    {
      ab.i("MicroMsg.LuggageMMWebViewCoreImpl", "use the downloader to download");
      AppMethodBeat.o(6510);
    }
    while (true)
    {
      return bool;
      if ((this.bRL.bD(paramString)) || (super.a(paramWebView, paramString)))
      {
        AppMethodBeat.o(6510);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(6510);
      }
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6512);
    this.bRL.bF(paramString);
    super.b(paramWebView, paramString);
    AppMethodBeat.o(6512);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(6511);
    this.bRL.bE(paramString);
    super.b(paramWebView, paramString, paramBitmap);
    AppMethodBeat.o(6511);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6515);
    d.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", new Object[] { paramString });
    Object localObject = this.bRL.bG(paramString);
    if (localObject != null)
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = new o(((WebResourceResponse)localObject).getMimeType(), ((WebResourceResponse)localObject).getEncoding(), ((WebResourceResponse)localObject).getStatusCode(), ((WebResourceResponse)localObject).getReasonPhrase(), ((WebResourceResponse)localObject).getResponseHeaders(), ((WebResourceResponse)localObject).getData());
        if (localObject == null)
          break label116;
        AppMethodBeat.o(6515);
      }
    while (true)
    {
      return localObject;
      localObject = new o(((WebResourceResponse)localObject).getMimeType(), ((WebResourceResponse)localObject).getEncoding(), ((WebResourceResponse)localObject).getData());
      break;
      localObject = null;
      break;
      label116: localObject = super.c(paramWebView, paramString);
      AppMethodBeat.o(6515);
    }
  }

  public final void h(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6513);
    this.bRL.bI(paramString);
    super.h(paramWebView, paramString);
    AppMethodBeat.o(6513);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.a.4
 * JD-Core Version:    0.6.2
 */