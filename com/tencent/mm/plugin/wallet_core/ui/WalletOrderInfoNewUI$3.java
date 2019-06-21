package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletOrderInfoNewUI$3
  implements View.OnClickListener
{
  WalletOrderInfoNewUI$3(WalletOrderInfoNewUI paramWalletOrderInfoNewUI, Orders.ShowInfo paramShowInfo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47428);
    ab.i("MicroMsg.WalletOrderInfoNewUI", "onClick jump tinyApp, linkWeApp:%s, linkAddr:%s", new Object[] { this.tIA.tBH, this.tIA.tBI });
    paramView = new se();
    paramView.cOf.userName = this.tIA.tBH;
    paramView.cOf.cOh = bo.bc(this.tIA.tBI, "");
    paramView.cOf.scene = 1060;
    paramView.cOf.cst = WalletOrderInfoNewUI.m(this.tIz);
    paramView.cOf.cOi = 0;
    paramView.cOf.context = this.tIz;
    a.xxA.m(paramView);
    AppMethodBeat.o(47428);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.3
 * JD-Core Version:    0.6.2
 */