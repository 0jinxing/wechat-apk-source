package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarTipsView$tipsFadeOut$2$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "plugin-radar_release"})
public final class RadarTipsView$e$a
  implements Animation.AnimationListener
{
  RadarTipsView$e$a(RadarTipsView.e parame)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(103057);
    j.p(paramAnimation, "animation");
    if (!RadarTipsView.b(this.pDJ.pDI))
      RadarTipsView.c(this.pDJ.pDI).sendEmptyMessage(0);
    AppMethodBeat.o(103057);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    AppMethodBeat.i(103058);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(103058);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(103056);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(103056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarTipsView.e.a
 * JD-Core Version:    0.6.2
 */