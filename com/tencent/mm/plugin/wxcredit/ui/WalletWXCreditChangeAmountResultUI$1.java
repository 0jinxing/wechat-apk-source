package com.tencent.mm.plugin.wxcredit.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletWXCreditChangeAmountResultUI$1
  implements MenuItem.OnMenuItemClickListener
{
  WalletWXCreditChangeAmountResultUI$1(WalletWXCreditChangeAmountResultUI paramWalletWXCreditChangeAmountResultUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(48685);
    this.uYX.dOD().a(this.uYX.mController.ylL, 0, this.uYX.mBundle);
    AppMethodBeat.o(48685);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI.1
 * JD-Core Version:    0.6.2
 */