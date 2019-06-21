package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class WalletLqtPlanHomeUI$5
  implements n.c
{
  WalletLqtPlanHomeUI$5(WalletLqtPlanHomeUI paramWalletLqtPlanHomeUI, List paramList)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(45608);
    Iterator localIterator = this.tjM.iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      switch (i)
      {
      default:
        break;
      case 1:
        paraml.hi(i, 2131304989);
        break;
      case 2:
        paraml.e(i, this.tjK.getString(2131304990));
        break;
      case 3:
        paraml.hi(i, 2131304987);
        break;
      case 4:
        paraml.hi(i, 2131304988);
      }
    }
    AppMethodBeat.o(45608);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.5
 * JD-Core Version:    0.6.2
 */