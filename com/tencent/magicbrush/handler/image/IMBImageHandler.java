package com.tencent.magicbrush.handler.image;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.github.henryye.nativeiv.bitmap.IBitmap;

public abstract interface IMBImageHandler
{
  @Keep
  public abstract String encodeToBase64(Bitmap paramBitmap, int paramInt, float paramFloat);

  @Keep
  public abstract byte[] encodeToBuffer(Bitmap paramBitmap, int paramInt, float paramFloat);

  @Keep
  public abstract Bitmap getBitmap(int paramInt1, int paramInt2);

  @Keep
  public abstract void init();

  @Keep
  public abstract void loadBitmapAsync(String paramString);

  @Keep
  public abstract IBitmap loadBitmapSync(String paramString);

  @Keep
  public abstract void release();

  @Keep
  public abstract void releaseBitmap(Bitmap paramBitmap);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.image.IMBImageHandler
 * JD-Core Version:    0.6.2
 */