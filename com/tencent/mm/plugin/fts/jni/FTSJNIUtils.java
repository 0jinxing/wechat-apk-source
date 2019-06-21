package com.tencent.mm.plugin.fts.jni;

public class FTSJNIUtils
{
  public static native int countTokens(String paramString);

  public static native int icuInitialize(String paramString);

  public static native String icuTokenizer(String paramString);

  public static native void nativeInitFts(long paramLong, byte[] paramArrayOfByte);

  public static native int stringCompareUtfBinary(String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.jni.FTSJNIUtils
 * JD-Core Version:    0.6.2
 */