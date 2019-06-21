package com.tencent.youtufacetrack;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.facedetect.FaceStatus;

public class YoutuFaceTrack
{
  private static YoutuFaceTrack ATP;
  private static long handle;

  static
  {
    AppMethodBeat.i(84510);
    ATP = null;
    handle = 0L;
    System.loadLibrary("facetrackwrap");
    nativeInit();
    AppMethodBeat.o(84510);
  }

  public YoutuFaceTrack()
  {
    AppMethodBeat.i(84508);
    NativeConstructor();
    AppMethodBeat.o(84508);
  }

  private native void NativeConstructor();

  private native void NativeDestructor();

  private static native boolean nativeInit();

  public native FaceStatus[] DoDetectionProcessRGBA(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public native FaceStatus[] DoDetectionProcessYUV(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public native boolean Init(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  protected void finalize()
  {
    AppMethodBeat.i(84509);
    NativeDestructor();
    AppMethodBeat.o(84509);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.youtufacetrack.YoutuFaceTrack
 * JD-Core Version:    0.6.2
 */