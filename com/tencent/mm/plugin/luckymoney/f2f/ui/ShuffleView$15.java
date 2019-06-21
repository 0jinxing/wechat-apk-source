package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class ShuffleView$15
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$15(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = 0;
    AppMethodBeat.i(42243);
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f1 == 0.0F)
    {
      ShuffleView.b(this.nWl).clear();
      ShuffleView.c(this.nWl).clear();
      while (i < ShuffleView.d(this.nWl))
      {
        ShuffleView.b(this.nWl).add(Float.valueOf(((View)ShuffleView.e(this.nWl).get(i)).getTranslationX()));
        ShuffleView.c(this.nWl).add(Float.valueOf(((View)ShuffleView.e(this.nWl).get(i)).getTranslationY()));
        i++;
      }
      AppMethodBeat.o(42243);
    }
    while (true)
    {
      return;
      i = 0;
      if (i < ShuffleView.d(this.nWl))
      {
        View localView = (View)ShuffleView.e(this.nWl).get(i);
        float f2;
        float f3;
        if (ShuffleView.l(this.nWl).nWp == 1)
        {
          f2 = ShuffleView.l(this.nWl).scaleX;
          f3 = i + 1;
          localView.setScaleX(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(this.nWl).scaleX + (1.0F - f2 * f3));
          f3 = this.nWl.xN(i);
          localView.setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f1) + f1 * f3);
        }
        while (true)
        {
          i++;
          break;
          if (ShuffleView.l(this.nWl).nWp == 2)
          {
            f3 = ShuffleView.l(this.nWl).scaleY;
            f2 = i + 1;
            localView.setScaleY(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(this.nWl).scaleY + (1.0F - f3 * f2));
            f3 = this.nWl.xM(i);
            localView.setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f1) + f1 * f3);
          }
        }
      }
      AppMethodBeat.o(42243);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.15
 * JD-Core Version:    0.6.2
 */