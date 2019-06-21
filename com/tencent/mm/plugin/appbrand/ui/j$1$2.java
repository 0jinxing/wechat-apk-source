package com.tencent.mm.plugin.appbrand.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class j$1$2
  implements ValueAnimator.AnimatorUpdateListener
{
  j$1$2(j.1 param1)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(102322);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    j.b(this.iJk.iJj).setTextColor(Color.argb(Math.round(255.0F * f), 0, 0, 0));
    j.c(this.iJk.iJj).setAlpha(f);
    j.d(this.iJk.iJj).setAlpha(f);
    j.d(this.iJk.iJj).setScaleY(f);
    j.d(this.iJk.iJj).setScaleX(f);
    this.iJk.iJj.K(-1, true);
    AppMethodBeat.o(102322);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.j.1.2
 * JD-Core Version:    0.6.2
 */