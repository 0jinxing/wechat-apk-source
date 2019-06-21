package com.tencent.mm.plugin.facedetect.views;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceDetectCameraView$1
  implements Runnable
{
  FaceDetectCameraView$1(FaceDetectCameraView paramFaceDetectCameraView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(572);
    this.mai.a(FaceDetectCameraView.b(this.mai), FaceDetectCameraView.c(this.mai));
    FaceDetectCameraView.a(this.mai, false);
    AppMethodBeat.o(572);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.1
 * JD-Core Version:    0.6.2
 */