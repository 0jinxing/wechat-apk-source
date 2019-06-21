package com.tencent.xweb.extension.video;

import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;

public abstract interface b
{
  public abstract void am(boolean paramBoolean1, boolean paramBoolean2);

  public abstract void dh(Object paramObject);

  public abstract boolean hasEnteredFullscreen();

  public abstract void onHideCustomView();

  public abstract void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.b
 * JD-Core Version:    0.6.2
 */