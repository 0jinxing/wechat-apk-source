package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BankRemitSelectArriveTimeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BankRemitSelectArriveTimeUI$1(BankRemitSelectArriveTimeUI paramBankRemitSelectArriveTimeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44659);
    this.pOc.finish();
    AppMethodBeat.o(44659);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI.1
 * JD-Core Version:    0.6.2
 */