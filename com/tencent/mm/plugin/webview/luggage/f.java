package com.tencent.mm.plugin.webview.luggage;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.s;

public class f extends s
{
  private s pih;

  public f()
  {
    AppMethodBeat.i(6106);
    this.pih = new s();
    AppMethodBeat.o(6106);
  }

  public o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(6113);
    paramWebView = this.pih.a(paramWebView, paramn);
    AppMethodBeat.o(6113);
    return paramWebView;
  }

  public o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(6114);
    paramWebView = this.pih.a(paramWebView, paramn, paramBundle);
    AppMethodBeat.o(6114);
    return paramWebView;
  }

  public final void a(WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(6117);
    this.pih.a(paramWebView, paramFloat1, paramFloat2);
    AppMethodBeat.o(6117);
  }

  public void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(6110);
    this.pih.a(paramWebView, paramInt, paramString1, paramString2);
    AppMethodBeat.o(6110);
  }

  public void a(WebView paramWebView, j paramj, SslError paramSslError)
  {
    AppMethodBeat.i(6116);
    this.pih.a(paramWebView, paramj, paramSslError);
    AppMethodBeat.o(6116);
  }

  public void a(WebView paramWebView, n paramn, o paramo)
  {
    AppMethodBeat.i(6118);
    this.pih.a(paramWebView, paramn, paramo);
    AppMethodBeat.o(6118);
  }

  public final void a(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(6115);
    this.pih.a(paramWebView, paramString, paramBoolean);
    AppMethodBeat.o(6115);
  }

  public final void a(s params)
  {
    if (params != null)
      this.pih = params;
  }

  public boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6111);
    boolean bool = this.pih.a(paramWebView, paramString);
    AppMethodBeat.o(6111);
    return bool;
  }

  public void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6109);
    this.pih.b(paramWebView, paramString);
    AppMethodBeat.o(6109);
  }

  public void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(6108);
    this.pih.b(paramWebView, paramString, paramBitmap);
    AppMethodBeat.o(6108);
  }

  public o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6112);
    paramWebView = this.pih.c(paramWebView, paramString);
    AppMethodBeat.o(6112);
    return paramWebView;
  }

  public void h(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6107);
    this.pih.h(paramWebView, paramString);
    AppMethodBeat.o(6107);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.f
 * JD-Core Version:    0.6.2
 */