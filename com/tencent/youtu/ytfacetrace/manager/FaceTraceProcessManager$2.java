package com.tencent.youtu.ytfacetrace.manager;

import android.hardware.Camera;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytcommon.tools.YTThreadOperate.UiThreadCallback;
import com.tencent.youtu.ytfacetrace.jni.YTFaceTraceJNIInterface.FaceStatus;

class FaceTraceProcessManager$2
  implements YTThreadOperate.UiThreadCallback<YTFaceTraceJNIInterface.FaceStatus>
{
  FaceTraceProcessManager$2(FaceTraceProcessManager paramFaceTraceProcessManager, byte[] paramArrayOfByte, Camera paramCamera)
  {
  }

  public void callback(YTFaceTraceJNIInterface.FaceStatus paramFaceStatus)
  {
    AppMethodBeat.i(117810);
    FaceTraceProcessManager.access$100(this.this$0, this.val$data, this.val$camera);
    AppMethodBeat.o(117810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytfacetrace.manager.FaceTraceProcessManager.2
 * JD-Core Version:    0.6.2
 */