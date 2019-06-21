package com.tencent.mm.plugin.wallet.bind.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.pay.a.a;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletResetInfoUI$1
  implements View.OnClickListener
{
  WalletResetInfoUI$1(WalletResetInfoUI paramWalletResetInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45818);
    if (!WalletResetInfoUI.a(this.tmu))
    {
      ab.w("Micromsg.WalletResetInfoUI", "input format illegal!");
      AppMethodBeat.o(45818);
    }
    while (true)
    {
      return;
      if (WalletResetInfoUI.b(this.tmu).getVisibility() == 0)
        WalletResetInfoUI.c(this.tmu).twh = WalletResetInfoUI.b(this.tmu).getText();
      if (WalletResetInfoUI.d(this.tmu).getVisibility() == 0)
        WalletResetInfoUI.c(this.tmu).twi = bo.bc(WalletResetInfoUI.d(this.tmu).getText(), "");
      if (WalletResetInfoUI.e(this.tmu).getVisibility() == 0)
      {
        WalletResetInfoUI.c(this.tmu).tuk = bo.bc(WalletResetInfoUI.f(this.tmu).getText(), "");
        paramView = e.atu(WalletResetInfoUI.c(this.tmu).tuk);
        this.tmu.mBundle.putString("key_mobile", paramView);
      }
      ab.d("Micromsg.WalletResetInfoUI", "tft: bank_type: %s, bank_serial: %s", new Object[] { WalletResetInfoUI.c(this.tmu).pbn, WalletResetInfoUI.c(this.tmu).pbo });
      WalletResetInfoUI.c(this.tmu).twb = 1;
      WalletResetInfoUI.c(this.tmu).twt = ("+" + WalletResetInfoUI.e(this.tmu).getCountryCode());
      if (this.tmu.mBundle.getBoolean("key_is_changing_balance_phone_num", false))
      {
        this.tmu.a(a.b(WalletResetInfoUI.c(this.tmu), WalletResetInfoUI.g(this.tmu), this.tmu.mBundle.getBoolean("key_isbalance", false)), true, true);
        AppMethodBeat.o(45818);
      }
      else
      {
        paramView = a.a(WalletResetInfoUI.c(this.tmu), WalletResetInfoUI.g(this.tmu), false);
        if (paramView != null)
          this.tmu.a(paramView, true, true);
        AppMethodBeat.o(45818);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI.1
 * JD-Core Version:    0.6.2
 */