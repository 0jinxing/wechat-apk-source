package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.drawable.NinePatchDrawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSuccPageAwardWidget$8$1
  implements Runnable
{
  WalletSuccPageAwardWidget$8$1(WalletSuccPageAwardWidget.8 param8, NinePatchDrawable paramNinePatchDrawable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47949);
    WalletSuccPageAwardWidget.i(this.tOM.tOK).setImageDrawable(this.tOL);
    WalletSuccPageAwardWidget.i(this.tOM.tOK).setVisibility(0);
    WalletSuccPageAwardWidget.i(this.tOM.tOK).post(new WalletSuccPageAwardWidget.8.1.1(this));
    AppMethodBeat.o(47949);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.8.1
 * JD-Core Version:    0.6.2
 */