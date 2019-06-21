package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.protocal.protobuf.bof;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;
import java.util.ArrayList;

final class BankRemitBankcardInputUI$9
  implements p.a
{
  BankRemitBankcardInputUI$9(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, com.tencent.mm.plugin.remittance.bankcard.a.m paramm)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(44521);
    BankRemitBankcardInputUI.c(this.pMO, false);
    BankRemitBankcardInputUI.d(this.pMO, this.pMR.pLE.vHs);
    ab.d("MicroMsg.BankRemitBankcardInputUI", "timing_id: %s", new Object[] { BankRemitBankcardInputUI.L(this.pMO) });
    BankRemitBankcardInputUI.a(this.pMO, TransferRecordParcel.cO(this.pMR.pLE.wRg));
    BankRemitBankcardInputUI.b(this.pMO, TransferRecordParcel.cO(this.pMR.pLE.wRf));
    ab.i("MicroMsg.BankRemitBankcardInputUI", "selfList: %d, freqList: %d", new Object[] { Integer.valueOf(BankRemitBankcardInputUI.M(this.pMO).size()), Integer.valueOf(BankRemitBankcardInputUI.N(this.pMO).size()) });
    BankRemitBankcardInputUI.O(this.pMO);
    AppMethodBeat.o(44521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.9
 * JD-Core Version:    0.6.2
 */