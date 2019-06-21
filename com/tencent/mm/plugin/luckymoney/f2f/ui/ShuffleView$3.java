package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ShuffleView$3
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$3(ShuffleView paramShuffleView, int paramInt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42227);
    int i = this.nWm;
    if (i < ShuffleView.d(this.nWl) - 1)
    {
      View localView = (View)ShuffleView.e(this.nWl).get(i);
      float f1;
      float f2;
      if (ShuffleView.l(this.nWl).nWp == 1)
      {
        f1 = ShuffleView.l(this.nWl).scaleX;
        f2 = i + 1;
        localView.setScaleX(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(this.nWl).scaleX + (1.0F - f1 * f2));
        if (ShuffleView.l(this.nWl).nWq == 2)
          localView.setTranslationY(this.nWl.xN(i + 1) - ((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.s(this.nWl));
      }
      while (true)
      {
        i++;
        break;
        if (ShuffleView.l(this.nWl).nWq == 1)
        {
          f2 = this.nWl.xN(i + 1);
          localView.setTranslationY(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.s(this.nWl) + f2);
          continue;
          if (ShuffleView.l(this.nWl).nWp == 2)
          {
            f1 = ShuffleView.l(this.nWl).scaleY;
            f2 = i + 1;
            localView.setScaleY(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(this.nWl).scaleY + (1.0F - f1 * f2));
            if (ShuffleView.l(this.nWl).nWq == 3)
            {
              f2 = this.nWl.xM(i + 1);
              localView.setTranslationX(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.t(this.nWl) + f2);
            }
            else if (ShuffleView.l(this.nWl).nWq == 4)
            {
              localView.setTranslationX(this.nWl.xM(i + 1) - ((Float)paramValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.t(this.nWl));
            }
          }
        }
      }
    }
    AppMethodBeat.o(42227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.3
 * JD-Core Version:    0.6.2
 */