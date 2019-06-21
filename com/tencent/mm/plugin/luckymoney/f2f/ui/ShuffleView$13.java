package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class ShuffleView$13
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$13(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42238);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    int i;
    if (f == 0.0F)
    {
      ShuffleView.b(this.nWl).clear();
      ShuffleView.c(this.nWl).clear();
      for (i = 0; i < ShuffleView.d(this.nWl); i++)
      {
        ShuffleView.b(this.nWl).add(Float.valueOf(((View)ShuffleView.e(this.nWl).get(i)).getTranslationX()));
        ShuffleView.c(this.nWl).add(Float.valueOf(((View)ShuffleView.e(this.nWl).get(i)).getTranslationY()));
      }
      AppMethodBeat.o(42238);
    }
    while (true)
    {
      return;
      ((View)ShuffleView.e(this.nWl).get(0)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(0)).floatValue() * (1.0F - f) + this.nWl.xM(0) * f);
      ((View)ShuffleView.e(this.nWl).get(0)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(0)).floatValue() * (1.0F - f) + this.nWl.xN(0) * f);
      for (i = 1; i < ShuffleView.d(this.nWl); i++)
      {
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xM(i) * f);
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
      }
      AppMethodBeat.o(42238);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.13
 * JD-Core Version:    0.6.2
 */