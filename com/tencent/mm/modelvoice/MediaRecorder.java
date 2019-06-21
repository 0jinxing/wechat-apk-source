package com.tencent.mm.modelvoice;

import com.tencent.mm.pointers.PByteArray;

public class MediaRecorder
{
  public static final int[] fYW = { 13, 14, 16, 18, 20, 21, 27, 32 };

  public static native int SetVoiceSilkControl(int paramInt1, int paramInt2);

  public static native int SetVoiceSilkDecControl(int paramInt1, byte[] paramArrayOfByte, int paramInt2);

  public static native int SilkDecInit(int paramInt1, byte[] paramArrayOfByte, int paramInt2);

  public static native int SilkDecUnInit();

  public static native int SilkDoDec(byte[] paramArrayOfByte, short paramShort);

  public static native int SilkDoEnc(byte[] paramArrayOfByte1, short paramShort, byte[] paramArrayOfByte2, short[] paramArrayOfShort, boolean paramBoolean);

  public static native int SilkEncInit(int paramInt1, int paramInt2, int paramInt3);

  public static native int SilkEncUnInit();

  public static native int SilkGetEncSampleRate(byte[] paramArrayOfByte);

  public static native boolean native_init();

  public static native boolean native_pcm2amr(int paramInt1, byte[] paramArrayOfByte, int paramInt2, PByteArray paramPByteArray, int paramInt3);

  public static native boolean native_pcmresamp(byte[] paramArrayOfByte, int paramInt, PByteArray paramPByteArray);

  public static native boolean native_release();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.MediaRecorder
 * JD-Core Version:    0.6.2
 */