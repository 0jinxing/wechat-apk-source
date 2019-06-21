package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitMoneyInputUI$5
  implements p.a
{
  BankRemitMoneyInputUI$5(BankRemitMoneyInputUI paramBankRemitMoneyInputUI)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44634);
    ab.e("MicroMsg.BankRemitMoneyInputUI", "net error: %s", new Object[] { paramm });
    AppMethodBeat.o(44634);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.5
 * JD-Core Version:    0.6.2
 */