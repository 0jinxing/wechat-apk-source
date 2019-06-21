package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.g;
import com.tencent.mm.protocal.protobuf.afa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$5
  implements p.a
{
  BankRemitBankcardInputUI$5(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, g paramg)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44517);
    ab.e("MicroMsg.BankRemitBankcardInputUI", "bank info reponse error: %s, msg: %s", new Object[] { Integer.valueOf(this.pMQ.pLy.kCl), this.pMQ.pLy.kCm });
    BankRemitBankcardInputUI.t(this.pMO);
    AppMethodBeat.o(44517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.5
 * JD-Core Version:    0.6.2
 */