package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitSelectPayeeUI$6
  implements p.a
{
  BankRemitSelectPayeeUI$6(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44677);
    ab.e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", new Object[] { paramm });
    AppMethodBeat.o(44677);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.6
 * JD-Core Version:    0.6.2
 */