package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class BankRemitBankcardInputUI$1
  implements Runnable
{
  BankRemitBankcardInputUI$1(BankRemitBankcardInputUI paramBankRemitBankcardInputUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44513);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
      e.a((TextView)this.pMO.findViewById(2131821634), this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
    AppMethodBeat.o(44513);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.1
 * JD-Core Version:    0.6.2
 */