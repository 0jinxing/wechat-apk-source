package com.tencent.xweb.x5;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.WebView;
import com.tencent.xweb.c.e;
import com.tencent.xweb.g;
import com.tencent.xweb.h;

public final class i
  implements e
{
  c AQF;
  b AQG;
  WebView AQH;

  public i(WebView paramWebView)
  {
    AppMethodBeat.i(84853);
    this.AQH = paramWebView;
    this.AQF = new c();
    this.AQG = new b();
    AppMethodBeat.o(84853);
  }

  public final boolean a(String paramString1, String paramString2, h paramh)
  {
    return false;
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, g paramg)
  {
    return false;
  }

  public final boolean b(String paramString1, String paramString2, h paramh)
  {
    return false;
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(84855);
    this.AQG.dVA();
    AppMethodBeat.o(84855);
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
  }

  public final void w(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(84854);
    this.AQF.b(this.AQH, paramString, paramBitmap);
    AppMethodBeat.o(84854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.i
 * JD-Core Version:    0.6.2
 */