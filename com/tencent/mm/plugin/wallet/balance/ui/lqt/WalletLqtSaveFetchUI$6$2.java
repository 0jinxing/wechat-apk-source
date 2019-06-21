package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;

final class WalletLqtSaveFetchUI$6$2
  implements n.d
{
  WalletLqtSaveFetchUI$6$2(WalletLqtSaveFetchUI.6 param6)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45650);
    paramInt = paramMenuItem.getItemId();
    if (paramInt < this.tkS.tkR.size())
    {
      paramMenuItem = ((java.lang.String)this.tkS.tkR.get(paramInt)).split("\\|\\|")[1];
      e.n(this.tkS.tkP, paramMenuItem, false);
    }
    AppMethodBeat.o(45650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.6.2
 * JD-Core Version:    0.6.2
 */