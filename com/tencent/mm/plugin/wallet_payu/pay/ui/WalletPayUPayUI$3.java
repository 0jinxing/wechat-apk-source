package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUPayUI$3
  implements DialogInterface.OnCancelListener
{
  WalletPayUPayUI$3(WalletPayUPayUI paramWalletPayUPayUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(48485);
    WalletPayUPayUI.f(this.tUe);
    WalletPayUPayUI.g(this.tUe);
    if (this.tUe.bwP())
      this.tUe.finish();
    AppMethodBeat.o(48485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI.3
 * JD-Core Version:    0.6.2
 */