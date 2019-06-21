package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h.b;

final class BankRemitMoneyInputUI$8$1
  implements h.b
{
  BankRemitMoneyInputUI$8$1(BankRemitMoneyInputUI.8 param8)
  {
  }

  public final boolean s(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(44637);
    if (!bo.isNullOrNil(paramCharSequence.toString()))
    {
      BankRemitMoneyInputUI.c(this.pNW.pNT, paramCharSequence.toString());
      BankRemitMoneyInputUI.h(this.pNW.pNT);
    }
    while (true)
    {
      AppMethodBeat.o(44637);
      return true;
      BankRemitMoneyInputUI.c(this.pNW.pNT, null);
      BankRemitMoneyInputUI.h(this.pNW.pNT);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.8.1
 * JD-Core Version:    0.6.2
 */