package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayCustomUI$2
  implements DialogInterface.OnCancelListener
{
  WalletPayCustomUI$2(WalletPayCustomUI paramWalletPayCustomUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(46010);
    this.tpc.finish();
    AppMethodBeat.o(46010);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI.2
 * JD-Core Version:    0.6.2
 */