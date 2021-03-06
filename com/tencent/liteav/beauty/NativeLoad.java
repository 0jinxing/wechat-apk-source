package com.tencent.liteav.beauty;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class NativeLoad
{
  private static final String TAG = "NativeLoad";

  private NativeLoad()
  {
    AppMethodBeat.i(66824);
    OnLoadBeauty();
    AppMethodBeat.o(66824);
  }

  public static native void OnLoadBeauty();

  public static NativeLoad getInstance()
  {
    return NativeLoad.a.a;
  }

  public static native void nativeClearQueue();

  public static native void nativeDeleteYuv2Yuv();

  public static native void nativeGlMapBufferToQueue(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer);

  public static native void nativeGlReadPixs(int paramInt1, int paramInt2, byte[] paramArrayOfByte);

  public static native boolean nativeGlReadPixsFromQueue(int paramInt1, int paramInt2, byte[] paramArrayOfByte);

  public static native void nativeGlReadPixsToQueue(int paramInt1, int paramInt2);

  public static native int nativeLoadGLProgram(int paramInt);

  public static native void nativeglTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, byte[] paramArrayOfByte, int paramInt9);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.NativeLoad
 * JD-Core Version:    0.6.2
 */