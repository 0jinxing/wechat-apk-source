package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class ShowWxPayAgreementsUI$1
  implements View.OnClickListener
{
  ShowWxPayAgreementsUI$1(ShowWxPayAgreementsUI paramShowWxPayAgreementsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47132);
    h.pYm.e(15236, new Object[] { Integer.valueOf(2) });
    this.tEb.setResult(-1);
    this.tEb.finish();
    AppMethodBeat.o(47132);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI.1
 * JD-Core Version:    0.6.2
 */