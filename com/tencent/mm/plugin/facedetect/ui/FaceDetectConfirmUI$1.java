package com.tencent.mm.plugin.facedetect.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectConfirmUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FaceDetectConfirmUI$1(FaceDetectConfirmUI paramFaceDetectConfirmUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(363);
    ab.i("MicroMsg.FaceDetectConfirmUI", "alvinluo cancel with back button");
    FaceDetectConfirmUI.a(this.lWx);
    AppMethodBeat.o(363);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.1
 * JD-Core Version:    0.6.2
 */