package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class BankRemitBankcardInputUI$12
  implements MenuItem.OnMenuItemClickListener
{
  BankRemitBankcardInputUI$12(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44526);
    ab.d("MicroMsg.BankRemitBankcardInputUI", "help click");
    BankRemitBankcardInputUI.a(this.pMO, new d(this.pMO.mController.ylL, 1, false));
    BankRemitBankcardInputUI.a(this.pMO).rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(44524);
        paramAnonymousl.add(0, 0, 0, BankRemitBankcardInputUI.12.this.pMO.getString(2131297464));
        paramAnonymousl.add(0, 1, 0, BankRemitBankcardInputUI.12.this.pMO.getString(2131297462));
        AppMethodBeat.o(44524);
      }
    };
    BankRemitBankcardInputUI.a(this.pMO).rBm = new BankRemitBankcardInputUI.12.2(this);
    this.pMO.aoB();
    BankRemitBankcardInputUI.a(this.pMO).cpD();
    h.pYm.e(14673, new Object[] { Integer.valueOf(2) });
    AppMethodBeat.o(44526);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.12
 * JD-Core Version:    0.6.2
 */