package com.tencent.mm.plugin.address.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletAddAddressUI$6
  implements DialogInterface.OnClickListener
{
  WalletAddAddressUI$6(WalletAddAddressUI paramWalletAddAddressUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16935);
    paramDialogInterface.dismiss();
    this.gKV.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    AppMethodBeat.o(16935);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletAddAddressUI.6
 * JD-Core Version:    0.6.2
 */