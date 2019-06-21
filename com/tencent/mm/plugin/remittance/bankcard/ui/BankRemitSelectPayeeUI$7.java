package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.j;
import com.tencent.mm.protocal.protobuf.bcv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitSelectPayeeUI$7
  implements p.a
{
  BankRemitSelectPayeeUI$7(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI, j paramj)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44678);
    ab.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", new Object[] { Integer.valueOf(this.pOs.pLB.kCl), this.pOs.pLB.kCm });
    if (!bo.isNullOrNil(this.pOs.pLB.kCm))
      Toast.makeText(this.pOo, this.pOs.pLB.kCm, 1).show();
    AppMethodBeat.o(44678);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.7
 * JD-Core Version:    0.6.2
 */