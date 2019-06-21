package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBindUI$5
  implements DialogInterface.OnClickListener
{
  WalletBindUI$5(WalletBindUI paramWalletBindUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45800);
    this.tml.finish();
    AppMethodBeat.o(45800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.5
 * JD-Core Version:    0.6.2
 */