package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUI$14
  implements DialogInterface.OnClickListener
{
  WalletPayUI$14(WalletPayUI paramWalletPayUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46050);
    if (WalletPayUI.l(this.tqj))
    {
      this.tqj.mZ(true);
      AppMethodBeat.o(46050);
    }
    while (true)
    {
      return;
      this.tqj.ap(this.tqk, false);
      AppMethodBeat.o(46050);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.14
 * JD-Core Version:    0.6.2
 */