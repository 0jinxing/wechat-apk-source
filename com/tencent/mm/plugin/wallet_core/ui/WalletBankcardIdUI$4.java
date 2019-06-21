package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletBankcardIdUI$4
  implements j.a
{
  WalletBankcardIdUI$4(WalletBankcardIdUI paramWalletBankcardIdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47164);
    ab.i("Micromsg.WalletInputCardIDUI", "hy: clickable span on click");
    WalletBankcardIdUI.a(this.tEv);
    AppMethodBeat.o(47164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.4
 * JD-Core Version:    0.6.2
 */