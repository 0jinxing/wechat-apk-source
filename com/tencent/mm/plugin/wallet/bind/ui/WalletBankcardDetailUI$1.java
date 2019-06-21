package com.tencent.mm.plugin.wallet.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBankcardDetailUI$1
  implements View.OnClickListener
{
  WalletBankcardDetailUI$1(WalletBankcardDetailUI paramWalletBankcardDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45740);
    e.n(this.tlK, this.tlK.thJ.field_repay_url, false);
    AppMethodBeat.o(45740);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.1
 * JD-Core Version:    0.6.2
 */