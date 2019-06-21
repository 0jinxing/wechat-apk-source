package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletPayUOrderInfoUI$1
  implements DialogInterface.OnClickListener
{
  WalletPayUOrderInfoUI$1(WalletPayUOrderInfoUI paramWalletPayUOrderInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48476);
    a.b(this.tUd, this.tUd.mBundle, 0);
    AppMethodBeat.o(48476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUOrderInfoUI.1
 * JD-Core Version:    0.6.2
 */