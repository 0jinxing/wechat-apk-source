package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.k;
import com.tencent.mm.protocal.protobuf.bho;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$15
  implements p.a
{
  BankRemitBankcardInputUI$15(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, k paramk)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44529);
    ab.e("MicroMsg.BankRemitBankcardInputUI", "operation response error: %s, %s", new Object[] { Integer.valueOf(this.pMU.pLC.kCl), this.pMU.pLC.kCm });
    if (!bo.isNullOrNil(this.pMU.pLC.kCm))
      Toast.makeText(this.pMO, this.pMU.pLC.kCm, 1).show();
    this.pMO.finish();
    AppMethodBeat.o(44529);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.15
 * JD-Core Version:    0.6.2
 */