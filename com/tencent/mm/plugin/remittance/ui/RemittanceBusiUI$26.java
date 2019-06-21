package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.view.a;

final class RemittanceBusiUI$26
  implements View.OnClickListener
{
  RemittanceBusiUI$26(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44923);
    if (!RemittanceBusiUI.k(this.pUd))
      this.pUd.aoB();
    h.pYm.e(15235, new Object[] { Integer.valueOf(6) });
    a.a(this.pUd, this.pUd.getString(2131302362), RemittanceBusiUI.l(this.pUd), this.pUd.getString(2131302364), 20, new RemittanceBusiUI.26.1(this), new RemittanceBusiUI.26.2(this));
    AppMethodBeat.o(44923);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.26
 * JD-Core Version:    0.6.2
 */