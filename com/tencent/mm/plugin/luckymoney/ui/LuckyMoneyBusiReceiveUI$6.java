package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyBusiReceiveUI$6
  implements Animation.AnimationListener
{
  LuckyMoneyBusiReceiveUI$6(LuckyMoneyBusiReceiveUI paramLuckyMoneyBusiReceiveUI, View paramView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(42621);
    this.odk.setVisibility(8);
    AppMethodBeat.o(42621);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.6
 * JD-Core Version:    0.6.2
 */