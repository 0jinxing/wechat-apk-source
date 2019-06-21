package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletCardElementUI$16
  implements View.OnClickListener
{
  WalletCardElementUI$16(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47233);
    paramView = new Intent();
    paramView.putExtra("GetAddress", true);
    paramView.putExtra("ShowSelectedLocation", false);
    if (!Bankcard.Ho(WalletCardElementUI.n(this.tGf).tuo))
    {
      paramView.putExtra("IsRealNameVerifyScene", true);
      paramView.putExtra("IsNeedShowSearchBar", true);
    }
    d.b(this.tGf.mController.ylL, ".ui.tools.MultiStageCitySelectUI", paramView, 4);
    AppMethodBeat.o(47233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.16
 * JD-Core Version:    0.6.2
 */