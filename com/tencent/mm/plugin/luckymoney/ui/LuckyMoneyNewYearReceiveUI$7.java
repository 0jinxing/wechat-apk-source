package com.tencent.mm.plugin.luckymoney.ui;

import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.an;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyNewYearReceiveUI$7
  implements LuckyMoneyAutoScrollView.a
{
  LuckyMoneyNewYearReceiveUI$7(LuckyMoneyNewYearReceiveUI paramLuckyMoneyNewYearReceiveUI, an paraman)
  {
  }

  public final void bMo()
  {
    AppMethodBeat.i(42792);
    LuckyMoneyNewYearReceiveUI.i(this.ofE).setVisibility(4);
    x.a(this.ofE.mController.ylL, LuckyMoneyNewYearReceiveUI.i(this.ofE), this.ofH.nYn.nSd);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(500L);
    localAlphaAnimation.setAnimationListener(new LuckyMoneyNewYearReceiveUI.7.1(this));
    LuckyMoneyNewYearReceiveUI.i(this.ofE).startAnimation(localAlphaAnimation);
    AppMethodBeat.o(42792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.7
 * JD-Core Version:    0.6.2
 */