package com.github.henryye.nativeiv.comm;

import android.support.annotation.Keep;
import java.nio.ByteBuffer;

public class NativeImageJni
{
  long mNativeInst = 0L;

  @Keep
  native CommNativeBitmapStruct nativeDecodeNative(long paramLong, ByteBuffer paramByteBuffer, int paramInt);

  @Keep
  native void nativeDestroy(long paramLong);

  @Keep
  native long nativeInit();

  @Keep
  native void nativeRecycleNative(long paramLong1, long paramLong2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.comm.NativeImageJni
 * JD-Core Version:    0.6.2
 */