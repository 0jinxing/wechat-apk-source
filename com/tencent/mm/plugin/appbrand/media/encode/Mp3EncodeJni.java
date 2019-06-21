package com.tencent.mm.plugin.appbrand.media.encode;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;

public class Mp3EncodeJni
{
  static
  {
    AppMethodBeat.i(105581);
    k.a("mp3lame", Mp3EncodeJni.class.getClassLoader());
    AppMethodBeat.o(105581);
  }

  public static native void close();

  public static native int encode(short[] paramArrayOfShort1, short[] paramArrayOfShort2, int paramInt, byte[] paramArrayOfByte);

  public static native int encodeBufferInterleaved(short[] paramArrayOfShort, int paramInt, byte[] paramArrayOfByte);

  public static native int flush(byte[] paramArrayOfByte);

  public static native int getVersion();

  public static native int init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);

  public static native void setMode(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni
 * JD-Core Version:    0.6.2
 */