package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.plugin.wallet_core.model.q.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletBindCardResultUI$5
  implements View.OnClickListener
{
  WalletBindCardResultUI$5(WalletBindCardResultUI paramWalletBindCardResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47190);
    ab.i("MicroMsg.WalletBindCardResultUI", "click tiny app, userName: %s, path: %s, version: %s", new Object[] { WalletBindCardResultUI.c(this.tEY), WalletBindCardResultUI.d(this.tEY), Integer.valueOf(WalletBindCardResultUI.e(this.tEY)) });
    this.tEY.jX(2);
    paramView = new se();
    paramView.cOf.userName = WalletBindCardResultUI.c(this.tEY);
    paramView.cOf.cOh = bo.bc(WalletBindCardResultUI.d(this.tEY), "");
    paramView.cOf.scene = 1034;
    paramView.cOf.cOi = 0;
    if (WalletBindCardResultUI.e(this.tEY) > 0)
      paramView.cOf.axy = WalletBindCardResultUI.e(this.tEY);
    a.xxA.m(paramView);
    if ((!bo.isNullOrNil(WalletBindCardResultUI.f(this.tEY).txP.tzX)) && (WalletBindCardResultUI.f(this.tEY).txN.ttW > 0L))
    {
      WalletBindCardResultUI.a(this.tEY, true);
      AppMethodBeat.o(47190);
    }
    while (true)
    {
      return;
      WalletBindCardResultUI.a(this.tEY, false);
      AppMethodBeat.o(47190);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.5
 * JD-Core Version:    0.6.2
 */