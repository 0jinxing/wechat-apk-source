package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarStateChooseView$slideInAnim$2$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "plugin-radar_release"})
public final class RadarStateChooseView$b$a
  implements Animation.AnimationListener
{
  RadarStateChooseView$b$a(RadarStateChooseView.b paramb)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(103018);
    j.p(paramAnimation, "animation");
    RadarStateChooseView.a(this.pDa.pCZ);
    this.pDa.pCZ.setVisibility(8);
    AppMethodBeat.o(103018);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    AppMethodBeat.i(103019);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(103019);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(103017);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(103017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarStateChooseView.b.a
 * JD-Core Version:    0.6.2
 */