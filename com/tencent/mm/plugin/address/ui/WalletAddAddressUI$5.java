package com.tencent.mm.plugin.address.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletAddAddressUI$5
  implements DialogInterface.OnClickListener
{
  WalletAddAddressUI$5(WalletAddAddressUI paramWalletAddAddressUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16934);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(16934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletAddAddressUI.5
 * JD-Core Version:    0.6.2
 */