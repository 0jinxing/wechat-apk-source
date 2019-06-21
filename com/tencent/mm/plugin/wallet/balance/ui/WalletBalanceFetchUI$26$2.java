package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.plugin.wallet_core.model.b.a;
import com.tencent.mm.plugin.wallet_core.model.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class WalletBalanceFetchUI$26$2
  implements n.d
{
  WalletBalanceFetchUI$26$2(WalletBalanceFetchUI.26 param26)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45384);
    paramInt = paramMenuItem.getItemId();
    if ((this.thq.thp.twB.twD != null) && (paramInt < this.thq.thp.twB.twD.length))
    {
      paramMenuItem = this.thq.thp.twB.twD[paramInt];
      ab.i("MicroMsg.WalletBalanceFetchUI", "jump type: %s, url: %s", new Object[] { Integer.valueOf(paramMenuItem.ttd), paramMenuItem.kdF });
      switch (paramMenuItem.ttd)
      {
      default:
      case 1:
      }
    }
    while (true)
    {
      AppMethodBeat.o(45384);
      return;
      e.n(this.thq.the.mController.ylL, paramMenuItem.kdF, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.26.2
 * JD-Core Version:    0.6.2
 */