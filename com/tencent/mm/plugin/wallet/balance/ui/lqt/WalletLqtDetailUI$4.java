package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.protocal.protobuf.bbh;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletLqtDetailUI$4
  implements View.OnClickListener
{
  WalletLqtDetailUI$4(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45525);
    paramView = new se();
    paramView.cOf.userName = WalletLqtDetailUI.c(this.tiH).wQB.username;
    paramView.cOf.cOh = bo.bc(WalletLqtDetailUI.c(this.tiH).wQB.path, "");
    paramView.cOf.scene = 1061;
    paramView.cOf.cOi = 0;
    a.xxA.m(paramView);
    AppMethodBeat.o(45525);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.4
 * JD-Core Version:    0.6.2
 */