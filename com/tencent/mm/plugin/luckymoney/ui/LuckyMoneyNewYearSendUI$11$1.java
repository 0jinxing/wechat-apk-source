package com.tencent.mm.plugin.luckymoney.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyNewYearSendUI$11$1
  implements Animation.AnimationListener
{
  LuckyMoneyNewYearSendUI$11$1(LuckyMoneyNewYearSendUI.11 param11)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(42819);
    LuckyMoneyNewYearSendUI.s(this.ogo.ogn).setVisibility(0);
    AppMethodBeat.o(42819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.11.1
 * JD-Core Version:    0.6.2
 */