package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.protocal.protobuf.xg;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.widget.a.d;
import java.util.Iterator;
import java.util.LinkedList;

final class WalletLqtDetailUI$9
  implements MenuItem.OnMenuItemClickListener
{
  WalletLqtDetailUI$9(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45533);
    paramMenuItem = new d(this.tiH, 1, false);
    paramMenuItem.rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(45530);
        if ((WalletLqtDetailUI.c(WalletLqtDetailUI.9.this.tiH).wQz != null) && (WalletLqtDetailUI.c(WalletLqtDetailUI.9.this.tiH).wQz.size() > 0))
        {
          Iterator localIterator = WalletLqtDetailUI.c(WalletLqtDetailUI.9.this.tiH).wQz.iterator();
          for (int i = 0; localIterator.hasNext(); i++)
          {
            xg localxg = (xg)localIterator.next();
            if ((!bo.isNullOrNil(localxg.title)) && (!bo.isNullOrNil(localxg.wdd)))
              paramAnonymousl.add(0, i, 0, localxg.title);
          }
        }
        if (!WalletLqtDetailUI.c(WalletLqtDetailUI.9.this.tiH).wQG)
          paramAnonymousl.add(0, -1, 0, 2131304914);
        AppMethodBeat.o(45530);
      }
    };
    paramMenuItem.rBm = new WalletLqtDetailUI.9.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(45533);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.9
 * JD-Core Version:    0.6.2
 */