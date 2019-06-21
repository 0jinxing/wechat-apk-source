package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPwdConfirmUI$1
  implements View.OnClickListener
{
  WalletPwdConfirmUI$1(WalletPwdConfirmUI paramWalletPwdConfirmUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47538);
    if (this.tJx.cNR())
    {
      this.tJx.aqX();
      this.tJx.showDialog(1000);
      AppMethodBeat.o(47538);
    }
    while (true)
    {
      return;
      this.tJx.finish();
      AppMethodBeat.o(47538);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.1
 * JD-Core Version:    0.6.2
 */