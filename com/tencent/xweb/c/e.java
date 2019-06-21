package com.tencent.xweb.c;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.xweb.g;
import com.tencent.xweb.h;

public abstract interface e
{
  public abstract boolean a(String paramString1, String paramString2, h paramh);

  public abstract boolean a(String paramString1, String paramString2, String paramString3, g paramg);

  public abstract boolean b(String paramString1, String paramString2, h paramh);

  public abstract void onHideCustomView();

  public abstract void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback);

  public abstract void w(String paramString, Bitmap paramBitmap);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.c.e
 * JD-Core Version:    0.6.2
 */