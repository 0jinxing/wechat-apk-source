package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.f;
import com.tencent.mm.protocal.protobuf.wu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitSelectPayeeUI$10
  implements p.a
{
  BankRemitSelectPayeeUI$10(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI, f paramf)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44681);
    ab.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", new Object[] { Integer.valueOf(this.pOp.pLx.kCl), this.pOp.pLx.kCm });
    if (!bo.isNullOrNil(this.pOp.pLx.kCm))
      Toast.makeText(this.pOo, this.pOp.pLx.kCm, 1).show();
    AppMethodBeat.o(44681);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.10
 * JD-Core Version:    0.6.2
 */