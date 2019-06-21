package com.tencent.mm.plugin.facedetectaction.ui;

import android.hardware.Camera;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.facedetectaction.b.a.a;
import com.tencent.mm.plugin.facedetectaction.b.d;
import com.tencent.youtu.ytfacetrace.jni.YTFaceTraceJNIInterface.FaceStatus;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;

final class FaceActionUI$1
  implements a.a
{
  FaceActionUI$1(FaceActionUI paramFaceActionUI)
  {
  }

  public final void a(YTFaceTraceJNIInterface.FaceStatus paramFaceStatus, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(709);
    Object localObject = d.mcq;
    Camera localCamera = FaceActionUI.b(this.mde).mdw.etv;
    if (((d)localObject).mcr != null)
    {
      ((d)localObject).mStatus = 1;
      localObject = ((d)localObject).mcr;
      if (paramFaceStatus != null)
      {
        ((com.tencent.mm.plugin.facedetectaction.b.b)localObject).status = 2;
        YTPoseDetectInterface.poseDetect(paramFaceStatus.xys, ((com.tencent.mm.plugin.facedetectaction.b.b)localObject).mcm, paramArrayOfByte, localCamera, paramFaceStatus.pitch, paramFaceStatus.yaw, paramFaceStatus.roll, ((com.tencent.mm.plugin.facedetectaction.b.b)localObject).mcn);
      }
    }
    AppMethodBeat.o(709);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.1
 * JD-Core Version:    0.6.2
 */