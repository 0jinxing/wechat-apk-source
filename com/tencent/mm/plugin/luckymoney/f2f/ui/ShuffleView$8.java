package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class ShuffleView$8
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$8(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = 0;
    AppMethodBeat.i(42233);
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
      AppMethodBeat.o(42233);
    }
    while (true)
    {
      return;
      for (i = 0; i < ShuffleView.d(this.nWl); i++)
      {
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationX(((Float)ShuffleView.b(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xM(i) * f);
        ((View)ShuffleView.e(this.nWl).get(i)).setTranslationY(((Float)ShuffleView.c(this.nWl).get(i)).floatValue() * (1.0F - f) + this.nWl.xN(i) * f);
      }
      AppMethodBeat.o(42233);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.8
 * JD-Core Version:    0.6.2
 */