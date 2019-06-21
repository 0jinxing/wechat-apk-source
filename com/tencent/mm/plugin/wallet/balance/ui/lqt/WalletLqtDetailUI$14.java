package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtDetailUI$14
  implements View.OnClickListener
{
  WalletLqtDetailUI$14(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45539);
    if (!bo.isNullOrNil(WalletLqtDetailUI.c(this.tiH).wQI))
    {
      e.n(this.tiH, WalletLqtDetailUI.c(this.tiH).wQI, false);
      h.pYm.e(17084, new Object[] { Integer.valueOf(2) });
    }
    AppMethodBeat.o(45539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.14
 * JD-Core Version:    0.6.2
 */