package com.tencent.mm.plugin.luckymoney.sns;

import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsLuckyMoneyPrepareUI$7
  implements Runnable
{
  SnsLuckyMoneyPrepareUI$7(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42513);
    SnsLuckyMoneyPrepareUI.l(this.obN).setVisibility(0);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setDuration(800L);
    localScaleAnimation.setStartOffset(200L);
    localScaleAnimation.setInterpolator(new BounceInterpolator());
    this.obN.findViewById(2131825634).startAnimation(localScaleAnimation);
    AppMethodBeat.o(42513);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.7
 * JD-Core Version:    0.6.2
 */