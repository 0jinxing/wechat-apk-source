package com.tencent.mm.plugin.websearch.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$8$1
  implements ValueAnimator.AnimatorUpdateListener
{
  a$8$1(a.8 param8, ViewGroup.LayoutParams paramLayoutParams1, ViewGroup.LayoutParams paramLayoutParams2)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(91400);
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    this.udf.height = i;
    this.udh.udd.setLayoutParams(this.udf);
    this.udg.height = i;
    this.udh.ude.setLayoutParams(this.udg);
    AppMethodBeat.o(91400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.8.1
 * JD-Core Version:    0.6.2
 */