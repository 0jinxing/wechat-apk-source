package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.a.a.r;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;

final class WalletLqtDetailUI$7
  implements View.OnClickListener
{
  WalletLqtDetailUI$7(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45528);
    paramView = WalletLqtDetailUI.f(this.tiH).tfE;
    f.D(Integer.valueOf(WalletLqtDetailUI.c(this.tiH).wao), Integer.valueOf(1)).c(paramView);
    WalletLqtDetailUI.a(this.tiH, false, WalletLqtDetailUI.c(this.tiH).wQQ);
    AppMethodBeat.o(45528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.7
 * JD-Core Version:    0.6.2
 */