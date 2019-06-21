package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.a;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.protocal.protobuf.fl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$3
  implements p.a
{
  BankRemitBankcardInputUI$3(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, a parama)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44515);
    BankRemitBankcardInputUI.c(this.pMO, this.pMP.pLs.vHu);
    BankRemitBankcardInputUI.a(this.pMO, new BankcardElemParcel(this.pMP.pLs.vHt));
    if (BankRemitBankcardInputUI.v(this.pMO) != null);
    for (paramString = BankRemitBankcardInputUI.v(this.pMO).nuL; ; paramString = "")
    {
      ab.i("MicroMsg.BankRemitBankcardInputUI", "response bank: %s", new Object[] { paramString });
      BankRemitBankcardInputUI.H(this.pMO);
      BankRemitBankcardInputUI.I(this.pMO);
      BankRemitBankcardInputUI.J(this.pMO);
      BankRemitBankcardInputUI.K(this.pMO);
      BankRemitBankcardInputUI.k(this.pMO);
      AppMethodBeat.o(44515);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.3
 * JD-Core Version:    0.6.2
 */