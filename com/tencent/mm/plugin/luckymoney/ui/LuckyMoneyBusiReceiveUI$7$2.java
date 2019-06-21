package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyBusiReceiveUI$7$2
  implements Animation.AnimationListener
{
  LuckyMoneyBusiReceiveUI$7$2(LuckyMoneyBusiReceiveUI.7 param7)
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
    AppMethodBeat.i(42623);
    LuckyMoneyBusiReceiveUI.k(this.odm.odj).setVisibility(0);
    AppMethodBeat.o(42623);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.7.2
 * JD-Core Version:    0.6.2
 */