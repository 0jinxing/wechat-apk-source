package com.tencent.mm.plugin.wallet_core.ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletAwardShakeAnimView$4
  implements ValueAnimator.AnimatorUpdateListener
{
  WalletAwardShakeAnimView$4(WalletAwardShakeAnimView paramWalletAwardShakeAnimView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(47892);
    WalletAwardShakeAnimView.j(this.tNM).setRotation(((Float)paramValueAnimator.getAnimatedValue()).floatValue());
    AppMethodBeat.o(47892);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView.4
 * JD-Core Version:    0.6.2
 */