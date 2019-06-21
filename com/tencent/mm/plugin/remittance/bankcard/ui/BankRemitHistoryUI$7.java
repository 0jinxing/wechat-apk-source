package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.e;
import com.tencent.mm.protocal.protobuf.wq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitHistoryUI$7
  implements p.a
{
  BankRemitHistoryUI$7(BankRemitHistoryUI paramBankRemitHistoryUI, e parame)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44612);
    ab.e("MicroMsg.BankRemitHistoryUI", "history response: %s, %s", new Object[] { Integer.valueOf(this.pNu.pLw.kCl), this.pNu.pLw.kCm });
    AppMethodBeat.o(44612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI.7
 * JD-Core Version:    0.6.2
 */