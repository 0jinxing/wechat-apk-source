package com.davemorrissey.labs.subscaleview.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

public abstract interface d
{
  public abstract Bitmap b(Rect paramRect, int paramInt);

  public abstract Point c(Context paramContext, Uri paramUri);

  public abstract boolean isReady();

  public abstract void recycle();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.a.d
 * JD-Core Version:    0.6.2
 */