package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.a;
import com.tencent.mm.protocal.protobuf.fl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitBankcardInputUI$2
  implements p.a
{
  BankRemitBankcardInputUI$2(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, a parama)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44514);
    ab.e("MicroMsg.BankRemitBankcardInputUI", "appoint reponse error: %s, msg: %s", new Object[] { Integer.valueOf(this.pMP.pLs.kCl), this.pMP.pLs.kCm });
    if (!bo.isNullOrNil(this.pMP.pLs.kCm))
      Toast.makeText(this.pMO, this.pMP.pLs.kCm, 1).show();
    AppMethodBeat.o(44514);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.2
 * JD-Core Version:    0.6.2
 */