package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class BankRemitDetailUI$3
  implements p.a
{
  BankRemitDetailUI$3(BankRemitDetailUI paramBankRemitDetailUI)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44596);
    ab.e("MicroMsg.BankRemitDetailUI", "net error: %s", new Object[] { paramm });
    Toast.makeText(this.pNo, 2131297446, 1).show();
    AppMethodBeat.o(44596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI.3
 * JD-Core Version:    0.6.2
 */