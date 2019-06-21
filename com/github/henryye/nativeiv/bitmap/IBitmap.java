package com.github.henryye.nativeiv.bitmap;

import android.graphics.Bitmap.Config;
import android.support.annotation.Keep;
import java.io.InputStream;

public abstract interface IBitmap<Type>
{
  public abstract void decodeInputStream(InputStream paramInputStream, Bitmap.Config paramConfig, c paramc);

  public abstract long getDecodeTime();

  public abstract BitmapType getType();

  public abstract Type provide();

  @Keep
  public abstract void recycle();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.bitmap.IBitmap
 * JD-Core Version:    0.6.2
 */