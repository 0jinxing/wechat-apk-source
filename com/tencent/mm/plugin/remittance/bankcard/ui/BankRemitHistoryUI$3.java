package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitHistoryUI$3
  implements p.a
{
  BankRemitHistoryUI$3(BankRemitHistoryUI paramBankRemitHistoryUI)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44608);
    ab.e("MicroMsg.BankRemitHistoryUI", "net error: %s", new Object[] { paramm });
    AppMethodBeat.o(44608);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI.3
 * JD-Core Version:    0.6.2
 */