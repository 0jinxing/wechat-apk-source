package com.tencent.mm.plugin.facedetect.views;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class FaceDetectCameraView$c$4$1
  implements Runnable
{
  FaceDetectCameraView$c$4$1(FaceDetectCameraView.c.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(582);
    ab.v("MicroMsg.FaceDetectCameraView", "hy: on get preview");
    long l1 = bo.yz();
    long l2 = l1 - FaceDetectCameraView.p(this.mat.mar.mai);
    if (FaceDetectCameraView.p(this.mat.mar.mai) >= 0L)
      ab.v("MicroMsg.FaceDetectCameraView", "hy: tweenMillis: %d", new Object[] { Long.valueOf(l2) });
    if ((FaceDetectCameraView.p(this.mat.mar.mai) < 0L) || (l2 > FaceDetectCameraView.c(this.mat.mar.mai)))
    {
      FaceDetectCameraView.a(this.mat.mar.mai, l1);
      FaceDetectCameraView.b(this.mat.mar.mai, FaceDetectCameraView.o(this.mat.mar.mai));
    }
    AppMethodBeat.o(582);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.c.4.1
 * JD-Core Version:    0.6.2
 */