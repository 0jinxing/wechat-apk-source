package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BankRemitBaseUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BankRemitBaseUI$1(BankRemitBaseUI paramBankRemitBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44587);
    if (BankRemitBaseUI.a(this.pMZ))
    {
      this.pMZ.aqX();
      this.pMZ.showDialog(1000);
    }
    while (true)
    {
      AppMethodBeat.o(44587);
      return true;
      this.pMZ.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI.1
 * JD-Core Version:    0.6.2
 */