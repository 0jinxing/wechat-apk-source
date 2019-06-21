package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class ShowWxPayAgreementsUI$2
  implements View.OnClickListener
{
  ShowWxPayAgreementsUI$2(ShowWxPayAgreementsUI paramShowWxPayAgreementsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47133);
    h.pYm.e(15236, new Object[] { Integer.valueOf(3) });
    this.tEb.finish();
    AppMethodBeat.o(47133);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI.2
 * JD-Core Version:    0.6.2
 */