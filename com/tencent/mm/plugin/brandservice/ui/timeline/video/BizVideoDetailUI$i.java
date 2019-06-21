package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import a.v;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
final class BizVideoDetailUI$i
  implements ValueAnimator.AnimatorUpdateListener
{
  BizVideoDetailUI$i(BizVideoDetailUI paramBizVideoDetailUI)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(15151);
    j.o(paramValueAnimator, "valueAnimator");
    paramValueAnimator = paramValueAnimator.getAnimatedValue();
    if (paramValueAnimator == null)
    {
      paramValueAnimator = new v("null cannot be cast to non-null type kotlin.Int");
      AppMethodBeat.o(15151);
      throw paramValueAnimator;
    }
    int i = ((Integer)paramValueAnimator).intValue();
    paramValueAnimator = this.jWD.aYt();
    j.o(paramValueAnimator, "videoViewContainer");
    BizVideoDetailUI.Q((View)paramValueAnimator, i);
    paramValueAnimator = BizVideoDetailUI.b(this.jWD);
    j.o(paramValueAnimator, "animationLayout");
    BizVideoDetailUI.Q(paramValueAnimator, i);
    AppMethodBeat.o(15151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI.i
 * JD-Core Version:    0.6.2
 */