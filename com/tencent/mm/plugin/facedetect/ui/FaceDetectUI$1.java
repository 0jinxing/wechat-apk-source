package com.tencent.mm.plugin.facedetect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectUI$1
  implements View.OnClickListener
{
  FaceDetectUI$1(FaceDetectUI paramFaceDetectUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(458);
    ab.i("MicroMsg.FaceDetectUI", "hy: user cancelled with left button");
    FaceDetectUI.a(this.lXO);
    AppMethodBeat.o(458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.1
 * JD-Core Version:    0.6.2
 */