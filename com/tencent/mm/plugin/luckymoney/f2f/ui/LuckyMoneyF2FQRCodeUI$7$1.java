package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyF2FQRCodeUI$7$1
  implements ValueAnimator.AnimatorUpdateListener
{
  LuckyMoneyF2FQRCodeUI$7$1(LuckyMoneyF2FQRCodeUI.7 param7)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42178);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    LuckyMoneyF2FQRCodeUI.N(this.nVE.nVw).setPadding(LuckyMoneyF2FQRCodeUI.N(this.nVE.nVw).getPaddingLeft(), (int)f, LuckyMoneyF2FQRCodeUI.N(this.nVE.nVw).getPaddingRight(), LuckyMoneyF2FQRCodeUI.N(this.nVE.nVw).getPaddingBottom());
    f /= this.nVE.nVC;
    if (f <= 1.0F)
    {
      LuckyMoneyF2FQRCodeUI.P(this.nVE.nVw).setAlpha(1.0F - f + LuckyMoneyF2FQRCodeUI.O(this.nVE.nVw));
      LuckyMoneyF2FQRCodeUI.Q(this.nVE.nVw).setAlpha(f * LuckyMoneyF2FQRCodeUI.O(this.nVE.nVw));
      AppMethodBeat.o(42178);
    }
    while (true)
    {
      return;
      LuckyMoneyF2FQRCodeUI.P(this.nVE.nVw).setAlpha(LuckyMoneyF2FQRCodeUI.O(this.nVE.nVw));
      LuckyMoneyF2FQRCodeUI.Q(this.nVE.nVw).setAlpha(LuckyMoneyF2FQRCodeUI.O(this.nVE.nVw));
      AppMethodBeat.o(42178);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.7.1
 * JD-Core Version:    0.6.2
 */