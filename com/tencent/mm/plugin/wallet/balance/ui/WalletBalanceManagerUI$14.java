package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class WalletBalanceManagerUI$14
  implements View.OnClickListener
{
  WalletBalanceManagerUI$14(WalletBalanceManagerUI paramWalletBalanceManagerUI, ak paramak)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45441);
    g.RQ();
    g.RP().Ry().set(ac.a.xSv, Integer.valueOf(-1));
    com.tencent.mm.wallet_core.ui.e.n(this.thC, this.thF.cQt(), true);
    AppMethodBeat.o(45441);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.14
 * JD-Core Version:    0.6.2
 */