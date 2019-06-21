package com.tencent.mm.plugin.wxcredit.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletBindDepositUI$1
  implements View.OnClickListener
{
  WalletBindDepositUI$1(WalletBindDepositUI paramWalletBindDepositUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48672);
    paramView = WalletBindDepositUI.a(this.uYU).getText();
    if (bo.isNullOrNil(paramView))
      AppMethodBeat.o(48672);
    while (true)
    {
      return;
      if (WalletBindDepositUI.b(this.uYU))
      {
        this.uYU.dOE().x(new Object[] { paramView });
        WalletBindDepositUI.c(this.uYU);
        AppMethodBeat.o(48672);
      }
      else
      {
        paramView = new Bundle();
        paramView.putInt("key_support_bankcard", 1);
        paramView.putString("key_bank_type", WalletBindDepositUI.d(this.uYU).pbn);
        paramView.putInt("key_bankcard_type", 1);
        a.aE(this.uYU).a(this.uYU, WalletCardSelectUI.class, paramView, 1);
        AppMethodBeat.o(48672);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI.1
 * JD-Core Version:    0.6.2
 */