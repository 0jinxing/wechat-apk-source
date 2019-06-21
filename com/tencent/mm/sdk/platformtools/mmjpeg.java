package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;

class mmjpeg
{
  public static native int convertToProgressive(String paramString1, String paramString2);

  public static native boolean decodeToBitmap(String paramString, Bitmap paramBitmap);

  public static native int isProgressiveFile(String paramString);

  public static native JpegParams queryParams(String paramString);

  public static native int queryQuality(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.mmjpeg
 * JD-Core Version:    0.6.2
 */