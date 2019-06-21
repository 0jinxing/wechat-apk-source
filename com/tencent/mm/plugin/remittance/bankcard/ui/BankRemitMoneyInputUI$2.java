package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BankRemitMoneyInputUI$2
  implements Runnable
{
  BankRemitMoneyInputUI$2(BankRemitMoneyInputUI paramBankRemitMoneyInputUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44631);
    BankRemitMoneyInputUI.f(this.pNT).scrollBy(0, this.pNU);
    AppMethodBeat.o(44631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.2
 * JD-Core Version:    0.6.2
 */