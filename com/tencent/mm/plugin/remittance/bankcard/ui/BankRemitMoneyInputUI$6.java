package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.o;
import com.tencent.mm.protocal.protobuf.bst;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitMoneyInputUI$6
  implements p.a
{
  BankRemitMoneyInputUI$6(BankRemitMoneyInputUI paramBankRemitMoneyInputUI, o paramo)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44635);
    ab.e("MicroMsg.BankRemitMoneyInputUI", "request order error: %s, %s", new Object[] { Integer.valueOf(this.pNV.pLG.kCl), this.pNV.pLG.kCm });
    BankRemitMoneyInputUI.a(this.pNT, this.pNV);
    AppMethodBeat.o(44635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.6
 * JD-Core Version:    0.6.2
 */