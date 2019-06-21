package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletIdCardCheckUI$2
  implements View.OnClickListener
{
  WalletIdCardCheckUI$2(WalletIdCardCheckUI paramWalletIdCardCheckUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46323);
    if (WalletIdCardCheckUI.a(this.tsc))
    {
      paramView = new bj();
      paramView.cVT = 1L;
      paramView.dcm = 1L;
      paramView.ajK();
      h.pYm.e(13731, new Object[] { Integer.valueOf(2) });
      paramView = new n(WalletIdCardCheckUI.b(this.tsc).getText(), WalletIdCardCheckUI.c(this.tsc), r.cPI().bhp());
      this.tsc.a(paramView, true, true);
    }
    AppMethodBeat.o(46323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI.2
 * JD-Core Version:    0.6.2
 */