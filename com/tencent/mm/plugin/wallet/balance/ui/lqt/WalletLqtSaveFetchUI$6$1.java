package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.ArrayList;
import java.util.Iterator;

final class WalletLqtSaveFetchUI$6$1
  implements n.c
{
  WalletLqtSaveFetchUI$6$1(WalletLqtSaveFetchUI.6 param6)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(45649);
    Iterator localIterator = this.tkS.tkR.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
      paraml.add(0, i, 0, ((java.lang.String)localIterator.next()).split("\\|\\|")[0]);
    AppMethodBeat.o(45649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.6.1
 * JD-Core Version:    0.6.2
 */