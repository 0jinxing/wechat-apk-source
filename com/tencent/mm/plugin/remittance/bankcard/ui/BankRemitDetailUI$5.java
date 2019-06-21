package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.l;
import com.tencent.mm.protocal.protobuf.bnw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitDetailUI$5
  implements p.a
{
  BankRemitDetailUI$5(BankRemitDetailUI paramBankRemitDetailUI, l paraml)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44598);
    ab.i("MicroMsg.BankRemitDetailUI", "state: %s, amount: %s, fee: %s, account: %s", new Object[] { Integer.valueOf(this.pNp.pLD.state), Integer.valueOf(this.pNp.pLD.nUf), Integer.valueOf(this.pNp.pLD.wQZ), this.pNp.pLD.wRa });
    BankRemitDetailUI.a(this.pNo, this.pNp.pLD.state);
    BankRemitDetailUI.a(this.pNo, this.pNp.pLD.state, this.pNp.pLD.wQY);
    BankRemitDetailUI.a(this.pNo, this.pNp.pLD);
    BankRemitDetailUI.a(this.pNo).setVisibility(0);
    AppMethodBeat.o(44598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI.5
 * JD-Core Version:    0.6.2
 */