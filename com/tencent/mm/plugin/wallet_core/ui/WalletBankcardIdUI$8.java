package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.a;

final class WalletBankcardIdUI$8
  implements DialogInterface.OnClickListener
{
  WalletBankcardIdUI$8(WalletBankcardIdUI paramWalletBankcardIdUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47168);
    ((a)this.tEv.dOD()).c(this.tEv, 0);
    this.tEv.finish();
    AppMethodBeat.o(47168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.8
 * JD-Core Version:    0.6.2
 */