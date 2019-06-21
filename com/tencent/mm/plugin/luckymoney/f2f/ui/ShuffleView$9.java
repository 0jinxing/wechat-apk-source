package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class ShuffleView$9
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$9(ShuffleView paramShuffleView, int paramInt1, int paramInt2)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = 0;
    AppMethodBeat.i(42234);
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
      AppMethodBeat.o(42234);
    }
    while (true)
    {
      return;
      if (this.nWn > 0)
      {
        for (i = 0; i < ShuffleView.f(this.nWl) - 1; i++)
        {
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + (this.nWl.xM(i) - (i + 1) * ShuffleView.g(this.nWl)) * f);
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
        }
        ((View)ShuffleView.e(this.nWl).get(ShuffleView.f(this.nWl) - 1)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(ShuffleView.f(this.nWl) - 1)).floatValue() * (1.0F - f) + (this.nWl.xM(ShuffleView.f(this.nWl) - 1) - ShuffleView.g(this.nWl) * this.nWn / 2.0F) * f);
        ((View)ShuffleView.e(this.nWl).get(ShuffleView.f(this.nWl) - 1)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(ShuffleView.f(this.nWl) - 1)).floatValue() * (1.0F - f) + this.nWl.xN(ShuffleView.f(this.nWl) - 1) * f);
      }
      while (this.nWo > 0)
      {
        ShuffleView.h(this.nWl).setTranslationX(((Float)ShuffleView.b(this.nWl).get(ShuffleView.f(this.nWl))).floatValue() * (1.0F - f) + (this.nWl.xM(ShuffleView.f(this.nWl)) + ShuffleView.g(this.nWl) * this.nWo / 2.0F) * f);
        for (i = ShuffleView.f(this.nWl) + 1; i < ShuffleView.d(this.nWl); i++)
        {
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + (this.nWl.xM(i) + (ShuffleView.d(this.nWl) - i) * ShuffleView.g(this.nWl)) * f);
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
        }
        for (i = 0; i < ShuffleView.f(this.nWl); i++)
        {
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xM(i) * f);
          ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
        }
      }
      for (i = ShuffleView.f(this.nWl); i < ShuffleView.d(this.nWl); i++)
      {
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xM(i) * f);
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
      }
      ShuffleView.h(this.nWl).setTranslationY(((Float)ShuffleView.c(this.nWl).get(ShuffleView.f(this.nWl))).floatValue() * (1.0F - f) - ShuffleView.h(this.nWl).getHeight() * f / 7.0F);
      AppMethodBeat.o(42234);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.9
 * JD-Core Version:    0.6.2
 */