package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.o;
import com.tencent.mm.protocal.protobuf.bst;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitMoneyInputUI$7
  implements p.a
{
  BankRemitMoneyInputUI$7(BankRemitMoneyInputUI paramBankRemitMoneyInputUI, o paramo)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44636);
    ab.i("MicroMsg.BankRemitMoneyInputUI", "reqKey: %s, billId: %s", new Object[] { this.pNV.pLG.nYX, this.pNV.pLG.vPX });
    ab.d("MicroMsg.BankRemitMoneyInputUI", "name: %s, bank: %s", new Object[] { this.pNV.pLG.pMf, this.pNV.pLG.nuL });
    BankRemitMoneyInputUI.b(this.pNT, this.pNV.pLG.vPX);
    if (!BankRemitMoneyInputUI.a(this.pNT, this.pNV))
      BankRemitMoneyInputUI.a(this.pNT, this.pNV.pLG.nYX, this.pNV.pLG.pMf, this.pNV.pLG.nuL, this.pNV.pLG.pMe);
    AppMethodBeat.o(44636);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.7
 * JD-Core Version:    0.6.2
 */