package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitSelectBankUI$2
  implements p.a
{
  BankRemitSelectBankUI$2(BankRemitSelectBankUI paramBankRemitSelectBankUI, h paramh)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44664);
    ab.e("MicroMsg.BankRemitSelectBankUI", "net error: %s", new Object[] { this.pOf });
    AppMethodBeat.o(44664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI.2
 * JD-Core Version:    0.6.2
 */