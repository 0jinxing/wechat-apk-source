package com.tencent.mm.plugin.radar.ui;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.l;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "invoke"})
final class RadarStateView$b extends k
  implements a<Animation>
{
  RadarStateView$b(RadarStateView paramRadarStateView)
  {
    super(0);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarStateView$slideInAnim$2$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "plugin-radar_release"})
  public static final class a
    implements Animation.AnimationListener
  {
    a(RadarStateView.b paramb)
    {
    }

    public final void onAnimationEnd(Animation paramAnimation)
    {
      AppMethodBeat.i(103034);
      j.p(paramAnimation, "animation");
      RadarStateView.b(this.pDh.pDg);
      this.pDh.pDg.setVisibility(8);
      AppMethodBeat.o(103034);
    }

    public final void onAnimationRepeat(Animation paramAnimation)
    {
      AppMethodBeat.i(103035);
      j.p(paramAnimation, "animation");
      AppMethodBeat.o(103035);
    }

    public final void onAnimationStart(Animation paramAnimation)
    {
      AppMethodBeat.i(103033);
      j.p(paramAnimation, "animation");
      AppMethodBeat.o(103033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarStateView.b
 * JD-Core Version:    0.6.2
 */