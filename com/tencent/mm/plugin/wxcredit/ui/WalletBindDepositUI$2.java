package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletBindDepositUI$2
  implements View.OnClickListener
{
  WalletBindDepositUI$2(WalletBindDepositUI paramWalletBindDepositUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48673);
    if (WalletBindDepositUI.e(this.uYU))
      this.uYU.dOE().p(new Object[] { WalletBindDepositUI.a(this.uYU).getText(), WalletBindDepositUI.d(this.uYU).pbn, WalletBindDepositUI.f(this.uYU).getText(), WalletBindDepositUI.d(this.uYU).tyH, Boolean.FALSE });
    AppMethodBeat.o(48673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI.2
 * JD-Core Version:    0.6.2
 */