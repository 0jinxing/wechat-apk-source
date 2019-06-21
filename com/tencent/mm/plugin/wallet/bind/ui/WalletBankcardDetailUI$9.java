package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBankcardDetailUI$9
  implements DialogInterface.OnClickListener
{
  WalletBankcardDetailUI$9(WalletBankcardDetailUI paramWalletBankcardDetailUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45749);
    if (this.jvp == 2)
      WalletBankcardDetailUI.b(this.tlK);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(45749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.9
 * JD-Core Version:    0.6.2
 */