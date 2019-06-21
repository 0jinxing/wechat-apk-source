package com.tencent.qqpinyin.voicerecoapi;

public class TRSpeexNative
{
  public native int nativeTRSpeexDecode(int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2);

  public native int nativeTRSpeexDecodeInit();

  public native int nativeTRSpeexDecodeRelease(int paramInt);

  native int nativeTRSpeexEncode(int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2);

  native int nativeTRSpeexInit();

  native int nativeTRSpeexRelease(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqpinyin.voicerecoapi.TRSpeexNative
 * JD-Core Version:    0.6.2
 */