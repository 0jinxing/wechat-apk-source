package com.microrapid.opencv;

import android.graphics.Bitmap;
import com.tencent.filter.QImage;

public class OpencvAlgorithm
{
  public static native void nativeDehazeProcess(QImage paramQImage, float paramFloat);

  public static native void nativeDetailEnhanceFilter(QImage paramQImage, float paramFloat);

  public static native int nativeGlowFilterDropShadow(QImage paramQImage, int paramInt1, int paramInt2, int paramInt3, float paramFloat);

  public static native int nativeGlowFilterGlow(QImage paramQImage, int paramInt1, int paramInt2, float paramFloat);

  public static native int nativeGlowFilterPolyFit(QImage paramQImage, Bitmap paramBitmap, int paramInt, float paramFloat);

  public static native void nativeImageHdrContrastEnhance(QImage paramQImage);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.microrapid.opencv.OpencvAlgorithm
 * JD-Core Version:    0.6.2
 */