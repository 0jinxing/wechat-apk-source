package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletOrderInfoOldUI$a$2
  implements View.OnClickListener
{
  WalletOrderInfoOldUI$a$2(WalletOrderInfoOldUI.a parama, Orders.Commodity paramCommodity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47486);
    paramView = new se();
    paramView.cOf.userName = this.tIY.tAY.tzW;
    paramView.cOf.cOh = bo.bc(this.tIY.tAY.ttg, "");
    paramView.cOf.scene = 1034;
    paramView.cOf.cOi = 0;
    a.xxA.m(paramView);
    h.pYm.e(14118, new Object[] { this.tIX.tIW.oXY, this.tIX.tIW.cNH(), Integer.valueOf(1) });
    AppMethodBeat.o(47486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.a.2
 * JD-Core Version:    0.6.2
 */