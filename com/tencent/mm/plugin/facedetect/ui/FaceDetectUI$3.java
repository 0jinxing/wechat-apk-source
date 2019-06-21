package com.tencent.mm.plugin.facedetect.ui;

import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView;
import com.tencent.mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect.b;

final class FaceDetectUI$3
  implements FaceScanRect.b
{
  FaceDetectUI$3(FaceDetectUI paramFaceDetectUI)
  {
  }

  public final void btt()
  {
    AppMethodBeat.i(460);
    Object localObject = FaceDetectUI.c(this.lXO);
    RectF localRectF = new RectF(FaceDetectUI.b(this.lXO).getLeft(), FaceDetectUI.b(this.lXO).getTop(), FaceDetectUI.b(this.lXO).getRight(), FaceDetectUI.b(this.lXO).getBottom());
    localObject = ((FaceDetectView)localObject).maB;
    ((FaceDetectDecorView)localObject).mav = true;
    ((FaceDetectDecorView)localObject).maw = true;
    ((FaceDetectDecorView)localObject).may = localRectF;
    ((FaceDetectDecorView)localObject).invalidate();
    AppMethodBeat.o(460);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.3
 * JD-Core Version:    0.6.2
 */