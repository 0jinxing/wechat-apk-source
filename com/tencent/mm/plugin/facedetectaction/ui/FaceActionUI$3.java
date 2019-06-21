package com.tencent.mm.plugin.facedetectaction.ui;

import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceActionUI$3
  implements Runnable
{
  FaceActionUI$3(FaceActionUI paramFaceActionUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(720);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)FaceActionUI.k(this.mde).getLayoutParams();
    localMarginLayoutParams.topMargin = ((int)(FaceActionUI.l(this.mde).getHeight() * 0.4D));
    FaceActionUI.k(this.mde).setLayoutParams(localMarginLayoutParams);
    FaceActionUI.k(this.mde).setVisibility(0);
    AppMethodBeat.o(720);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.3
 * JD-Core Version:    0.6.2
 */