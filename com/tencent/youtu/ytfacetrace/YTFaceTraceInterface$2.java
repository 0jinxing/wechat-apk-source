package com.tencent.youtu.ytfacetrace;

import android.graphics.Rect;
import android.hardware.Camera;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytfacetrace.jni.YTFaceTraceJNIInterface.FaceStatus;

final class YTFaceTraceInterface$2
  implements YTFaceTraceInterface.FaceTraceingNotice
{
  public final void onTracing(int paramInt, YTFaceTraceJNIInterface.FaceStatus paramFaceStatus, Rect paramRect, byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(117790);
    YTFaceTraceInterface.access$300(paramInt, paramFaceStatus, paramRect, paramArrayOfByte, paramCamera);
    AppMethodBeat.o(117790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytfacetrace.YTFaceTraceInterface.2
 * JD-Core Version:    0.6.2
 */