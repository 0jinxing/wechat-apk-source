package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUChangeBankcardUI$3
  implements DialogInterface.OnCancelListener
{
  WalletPayUChangeBankcardUI$3(WalletPayUChangeBankcardUI paramWalletPayUChangeBankcardUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(48463);
    WalletPayUChangeBankcardUI.j(this.tUc);
    if (WalletPayUChangeBankcardUI.k(this.tUc).getVisibility() != 0)
      WalletPayUChangeBankcardUI.l(this.tUc);
    AppMethodBeat.o(48463);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUChangeBankcardUI.3
 * JD-Core Version:    0.6.2
 */