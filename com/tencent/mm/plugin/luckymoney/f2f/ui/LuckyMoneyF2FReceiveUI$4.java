package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyF2FReceiveUI$4
  implements Animator.AnimatorListener
{
  LuckyMoneyF2FReceiveUI$4(LuckyMoneyF2FReceiveUI paramLuckyMoneyF2FReceiveUI)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(42214);
    ab.i("LuckyMoneyF2FReceiveUI", "packet exit animator end");
    if (LuckyMoneyF2FReceiveUI.d(this.nVO) != null)
      LuckyMoneyF2FReceiveUI.a(this.nVO, LuckyMoneyBeforeDetailUI.class, LuckyMoneyF2FReceiveUI.d(this.nVO));
    this.nVO.setResult(-1, null);
    this.nVO.finish();
    if (LuckyMoneyF2FReceiveUI.d(this.nVO) != null)
      this.nVO.overridePendingTransition(2131034216, 2131034221);
    AppMethodBeat.o(42214);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI.4
 * JD-Core Version:    0.6.2
 */