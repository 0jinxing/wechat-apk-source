package com.tencent.mm.plugin.facedetect.views;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceDetectView$2$1
  implements Runnable
{
  FaceDetectView$2$1(FaceDetectView.2 param2, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(620);
    FaceDetectView.i(this.maU.maS).setVisibility(0);
    FaceDetectView.i(this.maU.maS).setBackgroundDrawable(new BitmapDrawable(this.maT));
    AppMethodBeat.o(620);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectView.2.1
 * JD-Core Version:    0.6.2
 */