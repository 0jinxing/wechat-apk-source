package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.g;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.protocal.protobuf.afa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$6
  implements p.a
{
  BankRemitBankcardInputUI$6(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, g paramg)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44518);
    if (this.pMQ.pLy.vHt == null)
    {
      ab.w("MicroMsg.BankRemitBankcardInputUI", "bank_elem is null");
      BankRemitBankcardInputUI.t(this.pMO);
      AppMethodBeat.o(44518);
    }
    while (true)
    {
      return;
      BankRemitBankcardInputUI.a(this.pMO, new BankcardElemParcel(this.pMQ.pLy.vHt));
      BankRemitBankcardInputUI.H(this.pMO);
      BankRemitBankcardInputUI.I(this.pMO);
      BankRemitBankcardInputUI.J(this.pMO);
      BankRemitBankcardInputUI.K(this.pMO);
      BankRemitBankcardInputUI.k(this.pMO);
      AppMethodBeat.o(44518);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.6
 * JD-Core Version:    0.6.2
 */