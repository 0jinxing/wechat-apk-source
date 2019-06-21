package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBankcardDetailUI$6
  implements DialogInterface.OnClickListener
{
  WalletBankcardDetailUI$6(WalletBankcardDetailUI paramWalletBankcardDetailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45746);
    ((b)g.K(b.class)).h(this.tlK, 1);
    e.QS(1);
    AppMethodBeat.o(45746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.6
 * JD-Core Version:    0.6.2
 */