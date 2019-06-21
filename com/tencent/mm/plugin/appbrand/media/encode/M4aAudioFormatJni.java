package com.tencent.mm.plugin.appbrand.media.encode;

public class M4aAudioFormatJni
{
  public static native void closeM4aFile();

  public static native int createM4aFile(String paramString, int paramInt1, int paramInt2, int paramInt3);

  public static native int writeAudioBuff(byte[] paramArrayOfByte, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.encode.M4aAudioFormatJni
 * JD-Core Version:    0.6.2
 */