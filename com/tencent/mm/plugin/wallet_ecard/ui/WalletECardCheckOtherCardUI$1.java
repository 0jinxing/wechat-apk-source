package com.tencent.mm.plugin.wallet_ecard.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletECardCheckOtherCardUI$1
  implements View.OnClickListener
{
  WalletECardCheckOtherCardUI$1(WalletECardCheckOtherCardUI paramWalletECardCheckOtherCardUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48133);
    ab.i("MicroMsg.WalletECardCheckOtherCardUI", "do check card");
    if ((WalletECardCheckOtherCardUI.a(this.tQG).asa()) && (WalletECardCheckOtherCardUI.b(this.tQG).asa()))
    {
      paramView = WalletECardCheckOtherCardUI.a(this.tQG).getText();
      String str = WalletECardCheckOtherCardUI.b(this.tQG).getText();
      this.tQG.dOE().p(new Object[] { paramView, str });
      AppMethodBeat.o(48133);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.WalletECardCheckOtherCardUI", "input invalid");
      AppMethodBeat.o(48133);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI.1
 * JD-Core Version:    0.6.2
 */