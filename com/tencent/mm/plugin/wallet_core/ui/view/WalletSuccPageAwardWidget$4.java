package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class WalletSuccPageAwardWidget$4
  implements Runnable
{
  WalletSuccPageAwardWidget$4(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47944);
    if (WalletSuccPageAwardWidget.d(this.tOK).getHeight() != this.tOK.getHeight())
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)WalletSuccPageAwardWidget.d(this.tOK).getLayoutParams();
      localLayoutParams.width = WalletSuccPageAwardWidget.b(this.tOK).getWidth();
      localLayoutParams.height = (WalletSuccPageAwardWidget.b(this.tOK).getHeight() - a.fromDPToPix(this.tOK.getContext(), 2));
      localLayoutParams.topMargin = a.fromDPToPix(this.tOK.getContext(), 1);
      localLayoutParams.bottomMargin = a.fromDPToPix(this.tOK.getContext(), 1);
      WalletSuccPageAwardWidget.d(this.tOK).setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(47944);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.4
 * JD-Core Version:    0.6.2
 */