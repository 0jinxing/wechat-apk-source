package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.a;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

final class WalletOrderInfoOldUI$10
  implements View.OnClickListener
{
  WalletOrderInfoOldUI$10(WalletOrderInfoOldUI paramWalletOrderInfoOldUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47483);
    e.n(this.tIW, ((Orders.Commodity)this.tIW.tog.tAq.get(0)).tBc.url, false);
    AppMethodBeat.o(47483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.10
 * JD-Core Version:    0.6.2
 */