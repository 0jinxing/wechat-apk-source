package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxcredit.a.j;
import com.tencent.mm.plugin.wxcredit.a.k;
import com.tencent.mm.wallet_core.ui.e;

final class WalletWXCreditDetailUI$3
  implements View.OnClickListener
{
  WalletWXCreditDetailUI$3(WalletWXCreditDetailUI paramWalletWXCreditDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48722);
    if (paramView.getId() == 2131829090)
    {
      if (WalletWXCreditDetailUI.b(this.uZx) == null)
        break label87;
      e.af(this.uZx, WalletWXCreditDetailUI.b(this.uZx).uYO.username);
      AppMethodBeat.o(48722);
    }
    while (true)
    {
      return;
      if ((paramView.getId() == 2131829091) && (WalletWXCreditDetailUI.b(this.uZx) != null))
        e.n(this.uZx, WalletWXCreditDetailUI.b(this.uZx).uYN, false);
      label87: AppMethodBeat.o(48722);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI.3
 * JD-Core Version:    0.6.2
 */