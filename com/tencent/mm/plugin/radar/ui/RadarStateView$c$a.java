package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarStateView$slideOutAnim$2$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "plugin-radar_release"})
public final class RadarStateView$c$a
  implements Animation.AnimationListener
{
  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(103038);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(103038);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    AppMethodBeat.i(103039);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(103039);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(103037);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(103037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarStateView.c.a
 * JD-Core Version:    0.6.2
 */