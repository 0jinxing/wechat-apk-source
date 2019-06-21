package com.tencent.mm.plugin.facedetect.ui;

import android.graphics.Bitmap;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceDetectPrepareUI$15$2
  implements Runnable
{
  FaceDetectPrepareUI$15$2(FaceDetectPrepareUI.15 param15, View.OnClickListener paramOnClickListener, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(419);
    c localc = a.a(this.lXu.lXp, this.lXv);
    localc.lYE = this.lXw;
    this.lXu.lXp.a(false, false, localc);
    AppMethodBeat.o(419);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.15.2
 * JD-Core Version:    0.6.2
 */