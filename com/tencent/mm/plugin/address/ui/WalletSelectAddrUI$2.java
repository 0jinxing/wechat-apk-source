package com.tencent.mm.plugin.address.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSelectAddrUI$2
  implements DialogInterface.OnClickListener
{
  WalletSelectAddrUI$2(WalletSelectAddrUI paramWalletSelectAddrUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16977);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(16977);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.2
 * JD-Core Version:    0.6.2
 */