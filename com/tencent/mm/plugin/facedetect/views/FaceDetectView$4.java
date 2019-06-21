package com.tencent.mm.plugin.facedetect.views;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class FaceDetectView$4
  implements c
{
  public FaceDetectView$4(FaceDetectView paramFaceDetectView, c paramc)
  {
  }

  public final void vt(int paramInt)
  {
    AppMethodBeat.i(623);
    ab.i("MicroMsg.FaceDetectView", "hy: camera preview init done : %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 0)
    {
      FaceDetectView.a(this.maS, false);
      FaceDetectView.h(this.maS);
    }
    if (this.maV != null)
      this.maV.vt(paramInt);
    AppMethodBeat.o(623);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectView.4
 * JD-Core Version:    0.6.2
 */