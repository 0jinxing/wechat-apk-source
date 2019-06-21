package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.s;

final class aa$5 extends s
{
  aa$5(aa paramaa)
  {
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(132448);
    if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
    {
      paramWebView = null;
      AppMethodBeat.o(132448);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = paramn.getUrl().toString();
      paramWebView = aa.a(this.iuq, paramWebView);
      AppMethodBeat.o(132448);
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(132449);
    if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
    {
      paramWebView = null;
      AppMethodBeat.o(132449);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = paramn.getUrl().toString();
      paramWebView = aa.a(this.iuq, paramWebView);
      AppMethodBeat.o(132449);
    }
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(132450);
    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandWebView", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    AppMethodBeat.o(132450);
  }

  public final void a(WebView paramWebView, j paramj, SslError paramSslError)
  {
    AppMethodBeat.i(132446);
    if (paramSslError.getPrimaryError() == 3)
      if (aa.a(this.iuq).a(paramSslError.getCertificate()))
      {
        paramj.proceed();
        AppMethodBeat.o(132446);
      }
    while (true)
    {
      return;
      paramj.cancel();
      AppMethodBeat.o(132446);
      continue;
      paramj.cancel();
      AppMethodBeat.o(132446);
    }
  }

  public final void a(WebView paramWebView, n paramn, o paramo)
  {
    AppMethodBeat.i(132451);
    paramWebView = paramn.getUrl();
    if (paramWebView == null);
    for (paramWebView = "null"; ; paramWebView = paramWebView.toString())
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandWebView", "onReceivedHttpError, WebResourceRequest url = %s, ErrWebResourceResponse mimeType = %s, status = %d", new Object[] { paramWebView, paramo.mMimeType, Integer.valueOf(paramo.mStatusCode) });
      AppMethodBeat.o(132451);
      return;
    }
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(132445);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandWebView", "shouldOverrideUrlLoading, url = %s", new Object[] { paramString });
    AppMethodBeat.o(132445);
    return true;
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(132444);
    aa.a(this.iuq).hTn.aJM();
    AppMethodBeat.o(132444);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(132443);
    aa.a(this.iuq);
    AppMethodBeat.o(132443);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(132447);
    if (bo.isNullOrNil(paramString))
    {
      paramWebView = null;
      AppMethodBeat.o(132447);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = aa.a(this.iuq, paramString);
      AppMethodBeat.o(132447);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.aa.5
 * JD-Core Version:    0.6.2
 */