package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.plugin.wallet_core.model.b.a;
import com.tencent.mm.plugin.wallet_core.model.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class WalletBalanceFetchUI$26
  implements MenuItem.OnMenuItemClickListener
{
  WalletBalanceFetchUI$26(WalletBalanceFetchUI paramWalletBalanceFetchUI, b paramb)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45385);
    paramMenuItem = new d(this.the.mController.ylL, 1, false);
    paramMenuItem.rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(45383);
        b.c[] arrayOfc = WalletBalanceFetchUI.26.this.thp.twB.twD;
        int i = arrayOfc.length;
        int j = 0;
        int k = 0;
        if (j < i)
        {
          b.c localc = arrayOfc[j];
          if (!bo.isNullOrNil(localc.title))
          {
            if (bo.isNullOrNil(localc.desc))
              break label88;
            paramAnonymousl.a(k, localc.title, localc.desc);
          }
          while (true)
          {
            j++;
            k++;
            break;
            label88: paramAnonymousl.e(k, localc.title);
          }
        }
        AppMethodBeat.o(45383);
      }
    };
    paramMenuItem.rBm = new WalletBalanceFetchUI.26.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(45385);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.26
 * JD-Core Version:    0.6.2
 */