package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bdy;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtDetailUI$17
  implements View.OnClickListener
{
  WalletLqtDetailUI$17(WalletLqtDetailUI paramWalletLqtDetailUI, bdy parambdy)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45542);
    e.p(this.tiM.vTT, this.tiM.wdd, 0, 1061);
    h.pYm.e(16807, new Object[] { Integer.valueOf(2), Integer.valueOf(2), this.tiM.wdd, this.tiM.vTT });
    AppMethodBeat.o(45542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.17
 * JD-Core Version:    0.6.2
 */