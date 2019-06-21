package com.tencent.mm.plugin.wallet.balance.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class WalletBalanceManagerUI$12
  implements View.OnClickListener
{
  WalletBalanceManagerUI$12(WalletBalanceManagerUI paramWalletBalanceManagerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45439);
    g.RQ();
    g.RP().Ry().set(ac.a.xSv, Integer.valueOf(-1));
    paramView = new Bundle();
    paramView.putInt("real_name_verify_mode", 0);
    paramView.putString("realname_verify_process_jump_plugin", "wallet");
    paramView.putString("realname_verify_process_jump_activity", "com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI");
    paramView.putInt("entry_scene", 1009);
    com.tencent.mm.wallet_core.a.a(this.thC, com.tencent.mm.plugin.wallet_core.id_verify.a.class, paramView);
    AppMethodBeat.o(45439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.12
 * JD-Core Version:    0.6.2
 */