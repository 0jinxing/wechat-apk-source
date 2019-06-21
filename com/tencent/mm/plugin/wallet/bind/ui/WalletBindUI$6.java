package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBindUI$6
  implements DialogInterface.OnClickListener
{
  WalletBindUI$6(WalletBindUI paramWalletBindUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45801);
    this.tml.finish();
    AppMethodBeat.o(45801);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.6
 * JD-Core Version:    0.6.2
 */