package com.tencent.mm.plugin.facedetect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.views.c;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectUI$5
  implements c
{
  FaceDetectUI$5(FaceDetectUI paramFaceDetectUI)
  {
  }

  public final void vt(int paramInt)
  {
    AppMethodBeat.i(463);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo onPreviewInitDone: %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 0)
    {
      FaceDetectUI.f(this.lXO);
      AppMethodBeat.o(463);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        FaceDetectUI.g(this.lXO);
        AppMethodBeat.o(463);
      }
      else
      {
        if (paramInt == 2)
          FaceDetectUI.a(this.lXO, "camera permission not granted", this.lXO.getString(2131301920));
        AppMethodBeat.o(463);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.5
 * JD-Core Version:    0.6.2
 */