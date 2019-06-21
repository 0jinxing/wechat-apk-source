package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUPayUI$4
  implements DialogInterface.OnClickListener
{
  WalletPayUPayUI$4(WalletPayUPayUI paramWalletPayUPayUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48486);
    WalletPayUPayUI.h(this.tUe).putInt("key_pay_flag", 3);
    this.tUe.Q(WalletPayUPayUI.i(this.tUe));
    AppMethodBeat.o(48486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI.4
 * JD-Core Version:    0.6.2
 */