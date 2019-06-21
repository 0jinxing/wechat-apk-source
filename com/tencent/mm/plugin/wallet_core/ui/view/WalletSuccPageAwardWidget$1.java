package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSuccPageAwardWidget$1
  implements Runnable
{
  WalletSuccPageAwardWidget$1(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47940);
    if (WalletSuccPageAwardWidget.a(this.tOK).getHeight() != this.tOK.getHeight())
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)WalletSuccPageAwardWidget.a(this.tOK).getLayoutParams();
      localLayoutParams.width = WalletSuccPageAwardWidget.b(this.tOK).getWidth();
      localLayoutParams.height = WalletSuccPageAwardWidget.b(this.tOK).getHeight();
      WalletSuccPageAwardWidget.a(this.tOK).setLayoutParams(localLayoutParams);
    }
    WalletSuccPageAwardWidget.c(this.tOK);
    AppMethodBeat.o(47940);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.1
 * JD-Core Version:    0.6.2
 */