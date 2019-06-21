package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bdy;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtDetailUI$5
  implements View.OnClickListener
{
  WalletLqtDetailUI$5(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45526);
    ab.i("MicroMsg.WalletLqtDetailUI", "click top biz");
    if (WalletLqtDetailUI.c(this.tiH).wQO.wHE == 2)
    {
      if (bo.isNullOrNil(WalletLqtDetailUI.c(this.tiH).wQO.wdd))
        break label265;
      e.n(this.tiH, WalletLqtDetailUI.c(this.tiH).wQO.wdd, false);
      h.pYm.e(16807, new Object[] { Integer.valueOf(1), Integer.valueOf(2), WalletLqtDetailUI.c(this.tiH).wQO.wdd });
      AppMethodBeat.o(45526);
    }
    while (true)
    {
      return;
      if ((WalletLqtDetailUI.c(this.tiH).wQO.wHE == 3) && (!bo.isNullOrNil(WalletLqtDetailUI.c(this.tiH).wQO.vTT)) && (!bo.isNullOrNil(WalletLqtDetailUI.c(this.tiH).wQO.wdd)))
      {
        e.p(WalletLqtDetailUI.c(this.tiH).wQO.vTT, WalletLqtDetailUI.c(this.tiH).wQO.wdd, 0, 1061);
        h.pYm.e(16807, new Object[] { Integer.valueOf(1), Integer.valueOf(3), WalletLqtDetailUI.c(this.tiH).wQO.wdd, WalletLqtDetailUI.c(this.tiH).wQO.vTT });
      }
      label265: AppMethodBeat.o(45526);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.5
 * JD-Core Version:    0.6.2
 */