package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.plugin.wallet_core.ui.view.a;

final class BankRemitMoneyInputUI$8
  implements o.a
{
  BankRemitMoneyInputUI$8(BankRemitMoneyInputUI paramBankRemitMoneyInputUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(44640);
    a.a(this.pNT, this.pNT.getString(2131297476), BankRemitMoneyInputUI.g(this.pNT), this.pNT.getString(2131302384), 20, new BankRemitMoneyInputUI.8.1(this), new BankRemitMoneyInputUI.8.2(this));
    h.pYm.e(14673, new Object[] { Integer.valueOf(4) });
    AppMethodBeat.o(44640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.8
 * JD-Core Version:    0.6.2
 */