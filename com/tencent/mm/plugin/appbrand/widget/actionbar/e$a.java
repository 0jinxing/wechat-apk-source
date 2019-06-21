package com.tencent.mm.plugin.appbrand.widget.actionbar;

import a.l;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandCapsuleBarWorkaroundImpl$applyLogo$1$1"})
final class e$a
  implements ValueAnimator.AnimatorUpdateListener
{
  e$a(AppBrandOptionButton paramAppBrandOptionButton, Drawable paramDrawable)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(87598);
    this.iVa.getButtonImage().setImageDrawable(this.iVb);
    AppMethodBeat.o(87598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.e.a
 * JD-Core Version:    0.6.2
 */