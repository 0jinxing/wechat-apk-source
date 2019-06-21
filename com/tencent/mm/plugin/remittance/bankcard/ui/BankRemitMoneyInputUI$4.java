package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.a;

final class BankRemitMoneyInputUI$4
  implements a
{
  BankRemitMoneyInputUI$4(BankRemitMoneyInputUI paramBankRemitMoneyInputUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(44633);
    if (paramBoolean)
    {
      BankRemitMoneyInputUI.e(this.pNT);
      AppMethodBeat.o(44633);
    }
    while (true)
    {
      return;
      BankRemitMoneyInputUI.f(this.pNT).scrollTo(0, 0);
      AppMethodBeat.o(44633);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.4
 * JD-Core Version:    0.6.2
 */