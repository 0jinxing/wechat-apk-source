package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarMemberView$dismiss$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "plugin-radar_release"})
public final class RadarMemberView$c
  implements Animation.AnimationListener
{
  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(102949);
    j.p(paramAnimation, "animation");
    ab.d(RadarMemberView.access$getTAG$cp(), "dismiss animation end");
    RadarMemberView.e(this.pCy);
    RadarMemberView.d(this.pCy).sendEmptyMessage(RadarMemberView.cdG());
    AppMethodBeat.o(102949);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    AppMethodBeat.i(102948);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(102948);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(102947);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(102947);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.c
 * JD-Core Version:    0.6.2
 */