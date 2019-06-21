package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class ShuffleView$12
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$12(ShuffleView paramShuffleView, int paramInt1, int paramInt2)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = 0;
    AppMethodBeat.i(42237);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f == 0.0F)
    {
      ShuffleView.b(this.nWl).clear();
      ShuffleView.c(this.nWl).clear();
      while (i < ShuffleView.d(this.nWl))
      {
        ShuffleView.b(this.nWl).add(Float.valueOf(((View)ShuffleView.e(this.nWl).get(i)).getTranslationX()));
        ShuffleView.c(this.nWl).add(Float.valueOf(((View)ShuffleView.e(this.nWl).get(i)).getTranslationY()));
        i++;
      }
      AppMethodBeat.o(42237);
    }
    while (true)
    {
      return;
      if (this.nWn > 0)
      {
        for (i = 0; i < ShuffleView.i(this.nWl) - 1; i++)
        {
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + (this.nWl.xM(i) - (i + 1) * ShuffleView.j(this.nWl)) * f);
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
        }
        ((View)ShuffleView.e(this.nWl).get(ShuffleView.i(this.nWl) - 1)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(ShuffleView.i(this.nWl) - 1)).floatValue() * (1.0F - f) + (this.nWl.xM(ShuffleView.i(this.nWl) - 1) - ShuffleView.j(this.nWl) * this.nWn / 2.0F) * f);
      }
      while (true)
        if (this.nWo > 0)
        {
          ShuffleView.k(this.nWl).setTranslationX(((Float)ShuffleView.b(this.nWl).get(ShuffleView.i(this.nWl))).floatValue() * (1.0F - f) + (this.nWl.xM(ShuffleView.i(this.nWl)) + ShuffleView.j(this.nWl) * this.nWo / 2.0F) * f);
          ShuffleView.k(this.nWl).setTranslationY(((Float)ShuffleView.c(this.nWl).get(ShuffleView.i(this.nWl))).floatValue() * (1.0F - f) + this.nWl.xN(ShuffleView.i(this.nWl)) * f);
          i = ShuffleView.i(this.nWl) + 1;
          while (true)
            if (i < ShuffleView.d(this.nWl))
            {
              ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + (this.nWl.xM(i) + (ShuffleView.d(this.nWl) - i) * ShuffleView.j(this.nWl)) * f);
              ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
              i++;
              continue;
              for (i = 0; i < ShuffleView.i(this.nWl); i++)
              {
                ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xM(i) * f);
                ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
              }
              break;
            }
          AppMethodBeat.o(42237);
          break;
        }
      for (i = ShuffleView.i(this.nWl); i < ShuffleView.d(this.nWl); i++)
      {
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xM(i) * f);
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
      }
      AppMethodBeat.o(42237);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.12
 * JD-Core Version:    0.6.2
 */