package com.tencent.smtt.sdk;

import android.graphics.Picture;
import com.tencent.matrix.trace.core.AppMethodBeat;

class br
  implements android.webkit.WebView.PictureListener
{
  br(WebView paramWebView, WebView.PictureListener paramPictureListener)
  {
  }

  public void onNewPicture(android.webkit.WebView paramWebView, Picture paramPicture)
  {
    AppMethodBeat.i(64836);
    this.b.a(paramWebView);
    this.a.onNewPicture(this.b, paramPicture);
    AppMethodBeat.o(64836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.br
 * JD-Core Version:    0.6.2
 */