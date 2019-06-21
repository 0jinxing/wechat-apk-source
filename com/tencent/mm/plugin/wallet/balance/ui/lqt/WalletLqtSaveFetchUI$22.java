package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.List;

final class WalletLqtSaveFetchUI$22
  implements n.d
{
  WalletLqtSaveFetchUI$22(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI, d paramd)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45675);
    if (this.gCw != null)
    {
      this.gCw.cpE();
      if (paramInt < WalletLqtSaveFetchUI.f(this.tkP).size())
      {
        paramMenuItem = (Bankcard)WalletLqtSaveFetchUI.f(this.tkP).get(paramInt);
        WalletLqtSaveFetchUI.a(this.tkP, paramMenuItem.field_bindSerial);
        WalletLqtSaveFetchUI.i(this.tkP);
        WalletLqtSaveFetchUI.c(this.tkP).cey();
        AppMethodBeat.o(45675);
      }
    }
    while (true)
    {
      return;
      if (WalletLqtSaveFetchUI.h(this.tkP) == 1)
      {
        WalletLqtSaveFetchUI.j(this.tkP);
        AppMethodBeat.o(45675);
      }
      else
      {
        if (WalletLqtSaveFetchUI.h(this.tkP) == 2)
          WalletLqtSaveFetchUI.j(this.tkP);
        AppMethodBeat.o(45675);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.22
 * JD-Core Version:    0.6.2
 */