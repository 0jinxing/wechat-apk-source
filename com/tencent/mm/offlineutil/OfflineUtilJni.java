package com.tencent.mm.offlineutil;

public class OfflineUtilJni
{
  public static native char[] CheckSumWithBase91(String paramString);

  public static native String DecodeBase91(String paramString);

  public static native String EncodeBase91(String paramString);

  public static native String GenOffLineQrcode(String paramString, byte[] paramArrayOfByte);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.offlineutil.OfflineUtilJni
 * JD-Core Version:    0.6.2
 */