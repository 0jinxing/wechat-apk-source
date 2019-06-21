package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletIbgAdapterUI$2
  implements DialogInterface.OnClickListener
{
  WalletIbgAdapterUI$2(WalletIbgAdapterUI paramWalletIbgAdapterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47837);
    this.tMP.finish();
    AppMethodBeat.o(47837);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgAdapterUI.2
 * JD-Core Version:    0.6.2
 */