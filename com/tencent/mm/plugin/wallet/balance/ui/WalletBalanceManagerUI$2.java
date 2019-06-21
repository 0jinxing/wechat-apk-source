package com.tencent.mm.plugin.wallet.balance.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.utils.e.8;
import com.tencent.mm.plugin.wallet_core.utils.e.9;
import com.tencent.mm.protocal.protobuf.ba;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;
import java.util.LinkedList;

final class WalletBalanceManagerUI$2
  implements MenuItem.OnMenuItemClickListener
{
  WalletBalanceManagerUI$2(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45428);
    d locald = new d(this.thC.mController.ylL, 1, false);
    AppCompatActivity localAppCompatActivity = this.thC.mController.ylL;
    paramMenuItem = WalletBalanceManagerUI.d(this.thC);
    WalletBalanceManagerUI.2.1 local1 = new WalletBalanceManagerUI.2.1(this);
    if ((paramMenuItem == null) || (paramMenuItem.vCQ == null) || (paramMenuItem.vCQ.isEmpty()));
    while (true)
    {
      locald.cpD();
      h.pYm.e(16503, new Object[] { Integer.valueOf(1) });
      AppMethodBeat.o(45428);
      return false;
      locald.rBl = new e.8(paramMenuItem, localAppCompatActivity);
      locald.rBm = new e.9(paramMenuItem, localAppCompatActivity, local1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.2
 * JD-Core Version:    0.6.2
 */