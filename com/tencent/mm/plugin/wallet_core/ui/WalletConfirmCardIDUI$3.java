package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tenpay.bankcard.TenpaySegmentEditText;

final class WalletConfirmCardIDUI$3
  implements View.OnClickListener
{
  WalletConfirmCardIDUI$3(WalletConfirmCardIDUI paramWalletConfirmCardIDUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47367);
    paramView = WalletConfirmCardIDUI.f(this.tHz).get3DesEncrptData();
    if ((paramView != null) && (paramView.equals(this.tHA)))
      h.pYm.e(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
    while (true)
    {
      WalletConfirmCardIDUI.g(this.tHz);
      AppMethodBeat.o(47367);
      return;
      h.pYm.e(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI.3
 * JD-Core Version:    0.6.2
 */