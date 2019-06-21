package com.tencent.mm.plugin.facedetect.views;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.plugin.facedetect.model.q;

final class FaceDetectView$5
  implements Runnable
{
  FaceDetectView$5(FaceDetectView paramFaceDetectView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(624);
    this.maS.maA.btD();
    if (this.lVX != null)
    {
      FaceProNative.FaceResult localFaceResult = FaceDetectView.j(this.maS).btF();
      this.lVX.b(localFaceResult);
    }
    AppMethodBeat.o(624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectView.5
 * JD-Core Version:    0.6.2
 */