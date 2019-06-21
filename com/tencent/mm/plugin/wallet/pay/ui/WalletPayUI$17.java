package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUI$17
  implements DialogInterface.OnClickListener
{
  WalletPayUI$17(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46055);
    this.tqj.tpC.putInt("key_pay_flag", 3);
    this.tqj.Q(this.tqj.tpC);
    AppMethodBeat.o(46055);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.17
 * JD-Core Version:    0.6.2
 */