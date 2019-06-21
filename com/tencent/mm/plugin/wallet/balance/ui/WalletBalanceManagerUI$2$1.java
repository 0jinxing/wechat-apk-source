package com.tencent.mm.plugin.wallet.balance.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.az;
import com.tencent.mm.protocal.protobuf.ba;
import com.tencent.mm.protocal.protobuf.btr;
import com.tencent.mm.protocal.protobuf.chf;
import com.tencent.mm.ui.base.n.d;
import java.util.LinkedList;

final class WalletBalanceManagerUI$2$1
  implements n.d
{
  WalletBalanceManagerUI$2$1(WalletBalanceManagerUI.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45427);
    if (paramInt < WalletBalanceManagerUI.d(this.thD.thC).vCQ.size())
    {
      paramMenuItem = (az)WalletBalanceManagerUI.d(this.thD.thC).vCQ.get(paramInt);
      if (paramMenuItem.vCP != null)
        if (paramMenuItem.vCP.type == 1)
        {
          h.pYm.e(16503, new Object[] { Integer.valueOf(2), paramMenuItem.vCP.url });
          AppMethodBeat.o(45427);
        }
    }
    while (true)
    {
      return;
      if (paramMenuItem.vCP.type == 2)
      {
        h.pYm.e(16503, new Object[] { Integer.valueOf(3), paramMenuItem.vCP.wVC.username });
        AppMethodBeat.o(45427);
      }
      else
      {
        if (paramMenuItem.vCP.type == 5)
          h.pYm.e(16503, new Object[] { Integer.valueOf(4), paramMenuItem.vCP.url });
        AppMethodBeat.o(45427);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.2.1
 * JD-Core Version:    0.6.2
 */