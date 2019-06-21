package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$14
  implements p.a
{
  BankRemitBankcardInputUI$14(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44528);
    ab.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramm });
    BankRemitBankcardInputUI.C(this.pMO);
    BankRemitBankcardInputUI.b(this.pMO, false);
    AppMethodBeat.o(44528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.14
 * JD-Core Version:    0.6.2
 */