package com.tencent.mm.plugin.appbrand.page;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ag$2
  implements ValueAnimator.AnimatorUpdateListener
{
  ag$2(ag paramag)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(87315);
    this.iuS.getContentView().setScrollY(((Integer)paramValueAnimator.getAnimatedValue()).intValue());
    AppMethodBeat.o(87315);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ag.2
 * JD-Core Version:    0.6.2
 */