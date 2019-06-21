package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletPayDeductUI$4
  implements View.OnClickListener
{
  WalletPayDeductUI$4(WalletPayDeductUI paramWalletPayDeductUI, Orders.DeductShowInfo paramDeductShowInfo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46021);
    ab.i("MicroMsg.WalletPayDeductUI", "click link_type: %s", new Object[] { Integer.valueOf(this.tpq.tBi) });
    if (this.tpq.tBi == 1)
    {
      if (bo.isNullOrNil(this.tpq.tBl))
        break label179;
      paramView = new Intent();
      paramView.putExtra("rawUrl", this.tpq.tBl);
      paramView.putExtra("showShare", false);
      d.b(this.tpn, "webview", ".ui.tools.WebViewUI", paramView);
      AppMethodBeat.o(46021);
    }
    while (true)
    {
      return;
      if (this.tpq.tBi == 2)
      {
        paramView = new se();
        paramView.cOf.userName = this.tpq.tBj;
        paramView.cOf.cOh = bo.bc(this.tpq.tBk, "");
        paramView.cOf.scene = 1097;
        paramView.cOf.cOi = 0;
        a.xxA.m(paramView);
      }
      label179: AppMethodBeat.o(46021);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI.4
 * JD-Core Version:    0.6.2
 */