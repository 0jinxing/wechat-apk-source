package com.tencent.mm.plugin.facedetect.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.platformtools.al;

final class FaceDetectPrepareUI$15
  implements Runnable
{
  FaceDetectPrepareUI$15(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(420);
    Bitmap localBitmap = p.Lr(FaceDetectPrepareUI.c(this.lXp));
    al.d(new FaceDetectPrepareUI.15.2(this, new FaceDetectPrepareUI.15.1(this), localBitmap));
    AppMethodBeat.o(420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.15
 * JD-Core Version:    0.6.2
 */