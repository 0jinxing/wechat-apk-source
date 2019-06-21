package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.d;
import com.tencent.mm.protocal.protobuf.qj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$11
  implements p.a
{
  BankRemitBankcardInputUI$11(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, d paramd)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44523);
    ab.e("MicroMsg.BankRemitBankcardInputUI", "check response error: %s, %s", new Object[] { Integer.valueOf(this.pMS.pLv.kCl), this.pMS.pLv.kCm });
    if (!bo.isNullOrNil(this.pMS.pLv.kCm))
      Toast.makeText(this.pMO, this.pMS.pLv.kCm, 1).show();
    AppMethodBeat.o(44523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.11
 * JD-Core Version:    0.6.2
 */