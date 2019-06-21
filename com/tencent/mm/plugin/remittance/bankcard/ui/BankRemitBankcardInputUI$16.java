package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.k;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.protocal.protobuf.bho;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$16
  implements p.a
{
  BankRemitBankcardInputUI$16(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, k paramk)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44530);
    if ((BankRemitBankcardInputUI.B(this.pMO) != null) && (BankRemitBankcardInputUI.B(this.pMO).isShowing()))
      BankRemitBankcardInputUI.B(this.pMO).dismiss();
    BankRemitBankcardInputUI.P(this.pMO);
    BankRemitBankcardInputUI.C(this.pMO);
    BankRemitBankcardInputUI.h(this.pMO, this.pMU.pLC.wKP);
    BankRemitBankcardInputUI.i(this.pMO, this.pMU.pLC.wKQ);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "set uniqueId:%s", new Object[] { BankRemitBankcardInputUI.Q(this.pMO) });
    BankRemitBankcardInputUI.a(this.pMO, this.pMU.pLC.wKR);
    ab.d("MicroMsg.BankRemitBankcardInputUI", "set nameLenLimit:%s", new Object[] { Integer.valueOf(BankRemitBankcardInputUI.o(this.pMO)) });
    if (BankRemitBankcardInputUI.z(this.pMO))
    {
      if (!BankRemitBankcardInputUI.y(this.pMO))
        break label249;
      if (BankRemitBankcardInputUI.i(this.pMO))
      {
        ab.i("MicroMsg.BankRemitBankcardInputUI", "NetSceneBankRemitOperation: from record goto next direct");
        BankRemitBankcardInputUI.A(this.pMO);
        BankRemitBankcardInputUI.b(this.pMO, false);
        AppMethodBeat.o(44530);
      }
    }
    while (true)
    {
      return;
      BankRemitBankcardInputUI.b(this.pMO, BankRemitBankcardInputUI.v(this.pMO).nuL, BankRemitBankcardInputUI.v(this.pMO).pbn);
      break;
      BankRemitBankcardInputUI.k(this.pMO);
      label249: AppMethodBeat.o(44530);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.16
 * JD-Core Version:    0.6.2
 */