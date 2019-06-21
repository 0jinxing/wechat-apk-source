package com.tencent.mm.plugin.luckymoney.ui;

import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyNewYearSendUI$11
  implements LuckyMoneyAutoScrollView.a
{
  LuckyMoneyNewYearSendUI$11(LuckyMoneyNewYearSendUI paramLuckyMoneyNewYearSendUI)
  {
  }

  public final void bMo()
  {
    AppMethodBeat.i(42820);
    if (LuckyMoneyNewYearSendUI.r(this.ogn))
    {
      LuckyMoneyNewYearSendUI.s(this.ogn).setVisibility(4);
      x.a(this.ogn.mController.ylL, LuckyMoneyNewYearSendUI.s(this.ogn), LuckyMoneyNewYearSendUI.t(this.ogn));
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
      localAlphaAnimation.setDuration(500L);
      localAlphaAnimation.setAnimationListener(new LuckyMoneyNewYearSendUI.11.1(this));
      LuckyMoneyNewYearSendUI.s(this.ogn).startAnimation(localAlphaAnimation);
      LuckyMoneyNewYearSendUI.u(this.ogn);
    }
    while (true)
    {
      LuckyMoneyNewYearSendUI.a(this.ogn, true);
      LuckyMoneyNewYearSendUI.h(this.ogn).setFocusable(true);
      LuckyMoneyNewYearSendUI.h(this.ogn).setContentDescription(LuckyMoneyNewYearSendUI.v(this.ogn) / 100.0D);
      AppMethodBeat.o(42820);
      return;
      x.a(this.ogn.mController.ylL, LuckyMoneyNewYearSendUI.s(this.ogn), LuckyMoneyNewYearSendUI.t(this.ogn));
      LuckyMoneyNewYearSendUI.s(this.ogn).invalidate();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.11
 * JD-Core Version:    0.6.2
 */