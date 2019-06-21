package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.c.p;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletSwitchWalletCurrencyUI$1
  implements AdapterView.OnItemClickListener
{
  WalletSwitchWalletCurrencyUI$1(WalletSwitchWalletCurrencyUI paramWalletSwitchWalletCurrencyUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(47680);
    paramView = WalletSwitchWalletCurrencyUI.a(this.tKW).Hz(paramInt);
    WalletSwitchWalletCurrencyUI.a(this.tKW, WalletSwitchWalletCurrencyUI.a(this.tKW).tKX);
    if ((paramView != null) && ((WalletSwitchWalletCurrencyUI.b(this.tKW) == null) || (!WalletSwitchWalletCurrencyUI.b(this.tKW).field_wallet_tpa_country.equals(paramView.field_wallet_tpa_country))))
    {
      WalletSwitchWalletCurrencyUI.b(this.tKW, paramView);
      paramAdapterView = this.tKW;
      paramView = paramView.field_wallet_tpa_country;
      ab.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doSetUserWallet walletid = ".concat(String.valueOf(paramView)));
      paramAdapterView.a(new p(paramView), true, false);
    }
    AppMethodBeat.o(47680);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI.1
 * JD-Core Version:    0.6.2
 */