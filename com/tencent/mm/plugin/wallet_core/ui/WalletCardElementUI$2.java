package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletCardElementUI$2
  implements View.OnClickListener
{
  WalletCardElementUI$2(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47212);
    paramView = new Intent();
    paramView.setClassName(this.tGf.mController.ylL, "com.tencent.mm.ui.tools.CountryCodeUI");
    paramView.putExtra("exclude_countries_iso", WalletCardElementUI.t(this.tGf));
    paramView.putExtra("CountryCodeUI_isShowCountryCode", false);
    paramView.putExtra("ui_title", this.tGf.getString(2131305347));
    this.tGf.startActivityForResult(paramView, 6);
    AppMethodBeat.o(47212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.2
 * JD-Core Version:    0.6.2
 */