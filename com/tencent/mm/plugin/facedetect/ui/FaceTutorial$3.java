package com.tencent.mm.plugin.facedetect.ui;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceTutorial$3
  implements Runnable
{
  FaceTutorial$3(FaceTutorial paramFaceTutorial)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(519);
    this.lYr.lWI.setAnimationListener(new FaceTutorial.3.1(this));
    this.lYr.kRR.startAnimation(this.lYr.lWI);
    AppMethodBeat.o(519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceTutorial.3
 * JD-Core Version:    0.6.2
 */