package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUPayUI$5
  implements DialogInterface.OnClickListener
{
  WalletPayUPayUI$5(WalletPayUPayUI paramWalletPayUPayUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48487);
    if (this.tUe.bwP())
      this.tUe.finish();
    AppMethodBeat.o(48487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI.5
 * JD-Core Version:    0.6.2
 */