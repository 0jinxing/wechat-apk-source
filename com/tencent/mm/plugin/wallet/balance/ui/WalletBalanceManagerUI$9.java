package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.balance.b;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;

final class WalletBalanceManagerUI$9
  implements View.OnClickListener
{
  WalletBalanceManagerUI$9(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45436);
    s.cNC();
    paramView = s.cND().cQD();
    if ((paramView == null) || (paramView.size() == 0))
    {
      ab.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is empty, do bind card to fetch");
      WalletBalanceManagerUI.c(this.thC);
      AppMethodBeat.o(45436);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is valid, to do fetch");
      a.a(this.thC, b.class, null, null);
      e.QS(15);
      AppMethodBeat.o(45436);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.9
 * JD-Core Version:    0.6.2
 */