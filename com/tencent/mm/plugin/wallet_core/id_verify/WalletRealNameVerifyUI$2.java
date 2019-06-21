package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletRealNameVerifyUI$2
  implements View.OnClickListener
{
  WalletRealNameVerifyUI$2(WalletRealNameVerifyUI paramWalletRealNameVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46621);
    paramView = new Intent();
    paramView.putExtra("GetAddress", true);
    paramView.putExtra("ShowSelectedLocation", false);
    paramView.putExtra("IsRealNameVerifyScene", true);
    paramView.putExtra("IsNeedShowSearchBar", true);
    d.b(this.tvy.mController.ylL, ".ui.tools.MultiStageCitySelectUI", paramView, 2);
    AppMethodBeat.o(46621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.2
 * JD-Core Version:    0.6.2
 */