package com.tencent.mm.plugin.appbrand.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Color;
import android.view.View;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$1$1
  implements ValueAnimator.AnimatorUpdateListener
{
  j$1$1(j.1 param1, ViewParent paramViewParent)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(102321);
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    int j = Color.argb(i, 255, 255, 255);
    j.a(this.iJk.iJj).setBackgroundColor(j);
    j.a(this.iJk.iJj, j);
    if (i == 0)
      this.iJk.iJj.post(new j.1.1.1(this));
    AppMethodBeat.o(102321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.j.1.1
 * JD-Core Version:    0.6.2
 */