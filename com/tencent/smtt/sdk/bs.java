package com.tencent.smtt.sdk;

import android.graphics.Picture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener;

class bs
  implements IX5WebViewBase.PictureListener
{
  bs(WebView paramWebView, WebView.PictureListener paramPictureListener)
  {
  }

  public void onNewPicture(IX5WebViewBase paramIX5WebViewBase, Picture paramPicture, boolean paramBoolean)
  {
    AppMethodBeat.i(64837);
    this.b.a(paramIX5WebViewBase);
    this.a.onNewPicture(this.b, paramPicture);
    AppMethodBeat.o(64837);
  }

  public void onNewPictureIfHaveContent(IX5WebViewBase paramIX5WebViewBase, Picture paramPicture)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bs
 * JD-Core Version:    0.6.2
 */