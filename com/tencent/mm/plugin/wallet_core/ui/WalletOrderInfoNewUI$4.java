package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletOrderInfoNewUI$4
  implements View.OnClickListener
{
  WalletOrderInfoNewUI$4(WalletOrderInfoNewUI paramWalletOrderInfoNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47429);
    ab.i("MicroMsg.WalletOrderInfoNewUI", "click activity button");
    WalletOrderInfoNewUI.q(this.tIz);
    AppMethodBeat.o(47429);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.4
 * JD-Core Version:    0.6.2
 */