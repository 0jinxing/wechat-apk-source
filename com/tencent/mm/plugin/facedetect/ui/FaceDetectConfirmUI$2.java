package com.tencent.mm.plugin.facedetect.ui;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceDetectConfirmUI$2
  implements CompoundButton.OnCheckedChangeListener
{
  FaceDetectConfirmUI$2(FaceDetectConfirmUI paramFaceDetectConfirmUI)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(364);
    if (paramBoolean)
    {
      FaceDetectConfirmUI.b(this.lWx).setEnabled(true);
      AppMethodBeat.o(364);
    }
    while (true)
    {
      return;
      FaceDetectConfirmUI.b(this.lWx).setEnabled(false);
      AppMethodBeat.o(364);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.2
 * JD-Core Version:    0.6.2
 */