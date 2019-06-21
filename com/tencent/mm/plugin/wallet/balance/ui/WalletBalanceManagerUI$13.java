package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class WalletBalanceManagerUI$13
  implements View.OnClickListener
{
  WalletBalanceManagerUI$13(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45440);
    g.RQ();
    g.RP().Ry().set(ac.a.xSv, Integer.valueOf(-1));
    paramView = new Intent(this.thC, WalletLqtDetailUI.class);
    paramView.putExtra("key_account_type", 1);
    this.thC.startActivity(paramView);
    AppMethodBeat.o(45440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.13
 * JD-Core Version:    0.6.2
 */