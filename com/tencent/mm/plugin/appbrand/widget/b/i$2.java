package com.tencent.mm.plugin.appbrand.widget.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$2
  implements ValueAnimator.AnimatorUpdateListener
{
  i$2(i parami)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(77421);
    if (this.jcR.view != null)
      this.jcR.view.setBackgroundColor(((Integer)paramValueAnimator.getAnimatedValue()).intValue());
    AppMethodBeat.o(77421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.i.2
 * JD-Core Version:    0.6.2
 */