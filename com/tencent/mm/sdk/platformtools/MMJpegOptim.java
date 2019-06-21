package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;

public class MMJpegOptim
{
  public static native boolean checkIntegrity(String paramString);

  public static native int compressByQuality(Bitmap paramBitmap, int paramInt, boolean paramBoolean, String paramString);

  public static native int compressByQualityOptim(Bitmap paramBitmap, int paramInt, boolean paramBoolean, String paramString);

  public static native int convertToProgressive(String paramString1, String paramString2, int paramInt);

  public static native int decodeToBitmap(String paramString, Bitmap paramBitmap, int paramInt);

  public static native int isProgressiveFile(String paramString);

  public static native int queryQuality(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.MMJpegOptim
 * JD-Core Version:    0.6.2
 */