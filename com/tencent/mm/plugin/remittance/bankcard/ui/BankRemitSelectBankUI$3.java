package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.h;
import com.tencent.mm.protocal.protobuf.afc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitSelectBankUI$3
  implements p.a
{
  BankRemitSelectBankUI$3(BankRemitSelectBankUI paramBankRemitSelectBankUI, h paramh)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44665);
    ab.e("MicroMsg.BankRemitSelectBankUI", "response error: %s, %s", new Object[] { Integer.valueOf(this.pOf.pLz.kCl), this.pOf.pLz.kCm });
    if (!bo.isNullOrNil(this.pOf.pLz.kCm))
      Toast.makeText(this.pOe, this.pOf.pLz.kCm, 1).show();
    AppMethodBeat.o(44665);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI.3
 * JD-Core Version:    0.6.2
 */