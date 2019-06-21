package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSuccPageAwardWidget$8$1$1
  implements Runnable
{
  WalletSuccPageAwardWidget$8$1$1(WalletSuccPageAwardWidget.8.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47948);
    ViewGroup.LayoutParams localLayoutParams = WalletSuccPageAwardWidget.i(this.tON.tOM.tOK).getLayoutParams();
    localLayoutParams.height = WalletSuccPageAwardWidget.b(this.tON.tOM.tOK).getHeight();
    localLayoutParams.width = WalletSuccPageAwardWidget.b(this.tON.tOM.tOK).getWidth();
    WalletSuccPageAwardWidget.i(this.tON.tOM.tOK).setLayoutParams(localLayoutParams);
    this.tON.tOM.tOK.findViewById(2131826989).setVisibility(8);
    this.tON.tOM.tOK.findViewById(2131826994).setVisibility(8);
    AppMethodBeat.o(47948);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.8.1.1
 * JD-Core Version:    0.6.2
 */