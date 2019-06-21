package com.tencent.filter;

import android.graphics.Bitmap;

public class FilterAlgorithm
{
  public static native void nativeDrawBitmapWithBlendmode(Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt1, int paramInt2, int paramInt3);

  public static native void nativeFastBlur(QImage paramQImage, float paramFloat);

  public static native float[] nativeGetMaxAndMin(QImage paramQImage);

  public static native void nativeImageAutoContrast(QImage paramQImage, float paramFloat);

  public static native void nativeImageAutoTone(QImage paramQImage);

  public static native void nativeImageHistogramStretch(QImage paramQImage, float paramFloat);

  public static native void nativeUpdateLookupBitmap(QImage paramQImage, float paramFloat);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.FilterAlgorithm
 * JD-Core Version:    0.6.2
 */