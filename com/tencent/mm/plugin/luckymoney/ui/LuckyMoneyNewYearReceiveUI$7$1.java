package com.tencent.mm.plugin.luckymoney.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.luckymoney.model.an;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;

final class LuckyMoneyNewYearReceiveUI$7$1
  implements Animation.AnimationListener
{
  LuckyMoneyNewYearReceiveUI$7$1(LuckyMoneyNewYearReceiveUI.7 param7)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(42791);
    if (g.Nu().getInt("PlayCoinSound", 0) > 0)
      k.a(this.ofI.ofE, k.a.oiu);
    if (this.ofI.ofH.nTN != null)
      this.ofI.ofH.nTN.b(this.ofI.ofE, null, null);
    AppMethodBeat.o(42791);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(42790);
    LuckyMoneyNewYearReceiveUI.i(this.ofI.ofE).setVisibility(0);
    AppMethodBeat.o(42790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.7.1
 * JD-Core Version:    0.6.2
 */