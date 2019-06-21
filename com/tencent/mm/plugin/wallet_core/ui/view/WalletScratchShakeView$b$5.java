package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletScratchShakeView$b$5
  implements Runnable
{
  WalletScratchShakeView$b$5(WalletScratchShakeView.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47927);
    this.tOt.animate().alpha(0.0F).setDuration(100L);
    if (WalletScratchShakeView.a(this.tOt.tOs) != null)
      WalletScratchShakeView.a(this.tOt.tOs).cSD();
    AppMethodBeat.o(47927);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView.b.5
 * JD-Core Version:    0.6.2
 */