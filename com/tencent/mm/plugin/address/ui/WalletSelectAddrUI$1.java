package com.tencent.mm.plugin.address.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSelectAddrUI$1
  implements DialogInterface.OnClickListener
{
  WalletSelectAddrUI$1(WalletSelectAddrUI paramWalletSelectAddrUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16976);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(16976);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.1
 * JD-Core Version:    0.6.2
 */