package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarMemberView$popup$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "plugin-radar_release"})
public final class RadarMemberView$i
  implements Animation.AnimationListener
{
  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(102957);
    j.p(paramAnimation, "animation");
    ab.d(RadarMemberView.access$getTAG$cp(), "popup animation end");
    RadarMemberView.d(this.pCy).sendEmptyMessage(RadarMemberView.cdF());
    AppMethodBeat.o(102957);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    AppMethodBeat.i(102956);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(102956);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(102955);
    j.p(paramAnimation, "animation");
    AppMethodBeat.o(102955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.i
 * JD-Core Version:    0.6.2
 */