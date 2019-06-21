package com.tencent.mm.plugin.appbrand.weishi;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Color;
import android.view.View;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$4$1
  implements ValueAnimator.AnimatorUpdateListener
{
  b$4$1(b.4 param4, ViewParent paramViewParent)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(133628);
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    int j = Color.argb(i, 0, 0, 0);
    b.b(this.iTS.iTR).setBackgroundColor(j);
    if (i == 0)
      this.iTS.iTR.post(new b.4.1.1(this));
    AppMethodBeat.o(133628);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.b.4.1
 * JD-Core Version:    0.6.2
 */