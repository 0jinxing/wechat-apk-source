package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUI$13
  implements DialogInterface.OnClickListener
{
  WalletPayUI$13(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46049);
    if (this.tqj.bwP())
      this.tqj.finish();
    AppMethodBeat.o(46049);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.13
 * JD-Core Version:    0.6.2
 */