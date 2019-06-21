package com.tencent.mm.plugin.imgenc;

public class MMIMAGEENCJNI
{
  public static final String TAG = "MMIMAGEENCJNI";

  public static native long free(long paramLong);

  public static native long open(long paramLong);

  public static native long open(String paramString);

  public static native byte[] readByte(long paramLong, byte[] paramArrayOfByte);

  public static native long seek(long paramLong1, long paramLong2, int paramInt);

  public static native long transFor(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.imgenc.MMIMAGEENCJNI
 * JD-Core Version:    0.6.2
 */