package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyF2FReceiveUI$2
  implements ValueAnimator.AnimatorUpdateListener
{
  LuckyMoneyF2FReceiveUI$2(LuckyMoneyF2FReceiveUI paramLuckyMoneyF2FReceiveUI)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42212);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    LuckyMoneyF2FReceiveUI.c(this.nVO).setTranslationY(-f * LuckyMoneyF2FReceiveUI.b(this.nVO).heightPixels);
    AppMethodBeat.o(42212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI.2
 * JD-Core Version:    0.6.2
 */