package com.tencent.mm.plugin.facedetect.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

final class FaceDetectUI$7
  implements Runnable
{
  FaceDetectUI$7(FaceDetectUI paramFaceDetectUI, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(466);
    ah.getContext();
    al.d(new FaceDetectUI.7.1(this, p.n(FaceDetectUI.i(this.lXO), this.lXP)));
    AppMethodBeat.o(466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.7
 * JD-Core Version:    0.6.2
 */