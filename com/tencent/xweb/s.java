package com.tencent.xweb;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.e;

public class s
{
  public e AMp;

  public o a(WebView paramWebView, n paramn)
  {
    return null;
  }

  public o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    return null;
  }

  public void a(WebView paramWebView, float paramFloat1, float paramFloat2)
  {
  }

  public void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
  }

  public void a(WebView paramWebView, j paramj, SslError paramSslError)
  {
    AppMethodBeat.i(3943);
    if (paramj != null)
      paramj.cancel();
    AppMethodBeat.o(3943);
  }

  public void a(WebView paramWebView, n paramn, o paramo)
  {
  }

  public void a(WebView paramWebView, String paramString, boolean paramBoolean)
  {
  }

  public boolean a(WebView paramWebView, String paramString)
  {
    return false;
  }

  public void b(WebView paramWebView, String paramString)
  {
  }

  public void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(3942);
    if (this.AMp == null)
      AppMethodBeat.o(3942);
    while (true)
    {
      return;
      this.AMp.w(paramString, paramBitmap);
      AppMethodBeat.o(3942);
    }
  }

  public o c(WebView paramWebView, String paramString)
  {
    return null;
  }

  public void h(WebView paramWebView, String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.s
 * JD-Core Version:    0.6.2
 */