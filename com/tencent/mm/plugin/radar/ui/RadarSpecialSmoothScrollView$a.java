package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView$WorkspaceOvershootInterpolator;", "Landroid/view/animation/Interpolator;", "()V", "mTension", "", "getInterpolation", "t", "Companion", "plugin-radar_release"})
final class RadarSpecialSmoothScrollView$a
  implements Interpolator
{
  private static final float pCP = 1.3F;
  public static final RadarSpecialSmoothScrollView.a.a pCQ;
  private final float pCO = pCP;

  static
  {
    AppMethodBeat.i(103008);
    pCQ = new RadarSpecialSmoothScrollView.a.a((byte)0);
    pCP = 1.3F;
    AppMethodBeat.o(103008);
  }

  public final float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return (paramFloat * (this.pCO + 1.0F) + this.pCO) * (paramFloat * paramFloat) + 1.0F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarSpecialSmoothScrollView.a
 * JD-Core Version:    0.6.2
 */