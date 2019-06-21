package com.tencent.mm.plugin.facedetect.ui;

import android.support.v4.view.ViewPager;
import android.support.v4.view.p;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

public final class FaceTutorial
{
  ViewPager MI;
  View kRR;
  Button lWE;
  Animation lWI;
  FaceTutorial.a lYq;
  p sr;

  public FaceTutorial()
  {
    AppMethodBeat.i(526);
    this.kRR = null;
    this.lWI = null;
    ab.i("MicroMsg.FaceTutorial", "initFaceTutorial");
    this.lWI = AnimationUtils.loadAnimation(ah.getContext(), 2131034126);
    this.lWI.setDuration(500L);
    AppMethodBeat.o(526);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(527);
    ab.i("MicroMsg.FaceTutorial", "dismiss()");
    if (this.kRR.getVisibility() == 0)
      al.d(new FaceTutorial.3(this));
    AppMethodBeat.o(527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceTutorial
 * JD-Core Version:    0.6.2
 */