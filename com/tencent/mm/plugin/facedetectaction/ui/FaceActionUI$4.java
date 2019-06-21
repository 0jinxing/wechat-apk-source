package com.tencent.mm.plugin.facedetectaction.ui;

import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.aj;

final class FaceActionUI$4
  implements Runnable
{
  FaceActionUI$4(FaceActionUI paramFaceActionUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(721);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)FaceActionUI.m(this.mde).getLayoutParams();
    int i = (int)(FaceActionUI.l(this.mde).getHeight() * 0.4D) + (int)(FaceActionUI.l(this.mde).getWidth() * 0.35D) + aj.fromDPToPix(this.mde, 30);
    localMarginLayoutParams.topMargin = i;
    ab.i("MicroMsg.FaceActionUI", "topMargin：%d", new Object[] { Integer.valueOf(i) });
    FaceActionUI.m(this.mde).setLayoutParams(localMarginLayoutParams);
    FaceActionUI.m(this.mde).setVisibility(0);
    AppMethodBeat.o(721);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.4
 * JD-Core Version:    0.6.2
 */