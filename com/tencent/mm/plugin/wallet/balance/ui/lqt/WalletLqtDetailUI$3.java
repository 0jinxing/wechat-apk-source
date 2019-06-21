package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.protocal.protobuf.xg;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtDetailUI$3
  implements View.OnClickListener
{
  WalletLqtDetailUI$3(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45524);
    e.n(this.tiH, WalletLqtDetailUI.c(this.tiH).wQA.wdd, false);
    AppMethodBeat.o(45524);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.3
 * JD-Core Version:    0.6.2
 */