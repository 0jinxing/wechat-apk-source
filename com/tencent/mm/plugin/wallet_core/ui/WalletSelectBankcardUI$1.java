package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.e;

final class WalletSelectBankcardUI$1
  implements j.a
{
  WalletSelectBankcardUI$1(WalletSelectBankcardUI paramWalletSelectBankcardUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47652);
    ab.i("MicroMsg.WalletSelectBankcardUI", "hy: user clicked the phone.go to dial");
    e.bU(this.tKF, this.tKF.getString(2131304585));
    AppMethodBeat.o(47652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.1
 * JD-Core Version:    0.6.2
 */