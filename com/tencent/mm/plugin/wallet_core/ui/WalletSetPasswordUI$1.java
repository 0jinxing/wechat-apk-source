package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSetPasswordUI$1
  implements View.OnClickListener
{
  WalletSetPasswordUI$1(WalletSetPasswordUI paramWalletSetPasswordUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47664);
    if (this.tKL.cNR())
    {
      this.tKL.aqX();
      this.tKL.showDialog(1000);
      AppMethodBeat.o(47664);
    }
    while (true)
    {
      return;
      this.tKL.finish();
      AppMethodBeat.o(47664);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.1
 * JD-Core Version:    0.6.2
 */