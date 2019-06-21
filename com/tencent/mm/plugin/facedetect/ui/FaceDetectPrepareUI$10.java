package com.tencent.mm.plugin.facedetect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.c.a;

final class FaceDetectPrepareUI$10
  implements FaceDetectPrepareUI.c
{
  FaceDetectPrepareUI$10(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
  }

  public final void p(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(413);
    if (FaceDetectPrepareUI.b(this.lXp) != null)
      FaceDetectPrepareUI.b(this.lXp).c(paramInt1, paramInt2, paramString, FaceDetectPrepareUI.i(this.lXp).extras);
    AppMethodBeat.o(413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.10
 * JD-Core Version:    0.6.2
 */