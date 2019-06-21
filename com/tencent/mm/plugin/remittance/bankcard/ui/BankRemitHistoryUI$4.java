package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.i;
import com.tencent.mm.protocal.protobuf.boa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitHistoryUI$4
  implements p.a
{
  BankRemitHistoryUI$4(BankRemitHistoryUI paramBankRemitHistoryUI, i parami)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44609);
    ab.e("MicroMsg.BankRemitHistoryUI", "history response error: %s, %s", new Object[] { Integer.valueOf(this.pNt.pLA.kCl), this.pNt.pLA.kCm });
    AppMethodBeat.o(44609);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI.4
 * JD-Core Version:    0.6.2
 */