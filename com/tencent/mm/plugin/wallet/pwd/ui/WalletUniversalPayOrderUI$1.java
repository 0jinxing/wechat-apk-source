package com.tencent.mm.plugin.wallet.pwd.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;

final class WalletUniversalPayOrderUI$1
  implements DragSortListView.h
{
  WalletUniversalPayOrderUI$1(WalletUniversalPayOrderUI paramWalletUniversalPayOrderUI)
  {
  }

  public final void dm(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46422);
    if (paramInt1 == paramInt2)
    {
      ab.d("MicroMsg.WalletUniversalPayOrderUI", "no change: %s", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(46422);
    }
    while (true)
    {
      return;
      WalletUniversalPayOrderUI.a(this.ttx, paramInt1, paramInt2);
      h.pYm.e(16343, new Object[] { Integer.valueOf(10) });
      AppMethodBeat.o(46422);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.1
 * JD-Core Version:    0.6.2
 */