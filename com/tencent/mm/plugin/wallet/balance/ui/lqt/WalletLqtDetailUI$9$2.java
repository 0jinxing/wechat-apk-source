package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.protocal.protobuf.xg;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.ui.e;
import java.util.LinkedList;

final class WalletLqtDetailUI$9$2
  implements n.d
{
  WalletLqtDetailUI$9$2(WalletLqtDetailUI.9 param9)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45532);
    if ((paramMenuItem.getItemId() == -1) && (!WalletLqtDetailUI.c(this.tiJ.tiH).wQG))
      if (!bo.isNullOrNil(WalletLqtDetailUI.c(this.tiJ.tiH).wQL))
      {
        paramMenuItem = WalletLqtDetailUI.c(this.tiJ.tiH).wQL;
        h.a(this.tiJ.tiH, paramMenuItem, "", this.tiJ.tiH.getString(2131298338), new WalletLqtDetailUI.9.2.1(this));
        AppMethodBeat.o(45532);
      }
    while (true)
    {
      return;
      if (WalletLqtDetailUI.c(this.tiJ.tiH).wao == 0)
      {
        paramMenuItem = this.tiJ.tiH.getString(2131304916);
        break;
      }
      paramMenuItem = this.tiJ.tiH.getString(2131304907);
      break;
      if ((WalletLqtDetailUI.c(this.tiJ.tiH).wQz != null) && (WalletLqtDetailUI.c(this.tiJ.tiH).wQz.size() > 0) && (paramMenuItem.getItemId() < WalletLqtDetailUI.c(this.tiJ.tiH).wQz.size()))
      {
        paramMenuItem = (xg)WalletLqtDetailUI.c(this.tiJ.tiH).wQz.get(paramMenuItem.getItemId());
        e.n(this.tiJ.tiH, paramMenuItem.wdd, false);
      }
      AppMethodBeat.o(45532);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.9.2
 * JD-Core Version:    0.6.2
 */