package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.a.a;

final class d$3
  implements ValueAnimator.AnimatorUpdateListener
{
  d$3(d paramd)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40055);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGw.rGu.rIG.setAlpha(f);
    AppMethodBeat.o(40055);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.d.3
 * JD-Core Version:    0.6.2
 */