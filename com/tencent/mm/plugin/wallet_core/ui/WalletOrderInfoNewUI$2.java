package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletOrderInfoNewUI$2
  implements View.OnClickListener
{
  WalletOrderInfoNewUI$2(WalletOrderInfoNewUI paramWalletOrderInfoNewUI, Orders.ShowInfo paramShowInfo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47427);
    ab.i("MicroMsg.WalletOrderInfoNewUI", "onClick showInfo, jump url: %s", new Object[] { this.tIA.tBJ });
    this.tIz.acZ(this.tIA.tBJ);
    AppMethodBeat.o(47427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.2
 * JD-Core Version:    0.6.2
 */