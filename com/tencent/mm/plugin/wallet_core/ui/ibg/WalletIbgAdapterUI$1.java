package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.v.a;

final class WalletIbgAdapterUI$1
  implements DialogInterface.OnClickListener
{
  WalletIbgAdapterUI$1(WalletIbgAdapterUI paramWalletIbgAdapterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47836);
    v.a.dhr();
    Toast.makeText(this.tMP, this.tMP.getString(2131305590), 1).show();
    this.tMP.finish();
    AppMethodBeat.o(47836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgAdapterUI.1
 * JD-Core Version:    0.6.2
 */