package com.tencent.mm.plugin.facedetect.views;

import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectCameraView$2
  implements Runnable
{
  FaceDetectCameraView$2(FaceDetectCameraView paramFaceDetectCameraView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(573);
    int i = this.maj - this.mak;
    ab.i("MicroMsg.FaceDetectCameraView", "alvinluo restHeight: %d", new Object[] { Integer.valueOf(i) });
    if (i <= 0)
      AppMethodBeat.o(573);
    while (true)
    {
      return;
      i /= 2;
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.mal, this.mak);
      ViewGroup.MarginLayoutParams localMarginLayoutParams = new ViewGroup.MarginLayoutParams(this.mai.getLayoutParams());
      localLayoutParams.setMargins(localMarginLayoutParams.leftMargin, i, localMarginLayoutParams.rightMargin, localMarginLayoutParams.height + i);
      ab.v("MicroMsg.FaceDetectCameraView", "alvinluo margin left: %d, right: %d, top: %d, bottom: %d", new Object[] { Integer.valueOf(localMarginLayoutParams.leftMargin), Integer.valueOf(localMarginLayoutParams.rightMargin), Integer.valueOf(i), Integer.valueOf(i + localMarginLayoutParams.height) });
      this.mai.setLayoutParams(localLayoutParams);
      this.mai.invalidate();
      AppMethodBeat.o(573);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.2
 * JD-Core Version:    0.6.2
 */