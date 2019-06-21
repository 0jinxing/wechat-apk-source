package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyIndexUI$1
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyIndexUI$1(LuckyMoneyIndexUI paramLuckyMoneyIndexUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42721);
    this.oeJ.finish();
    AppMethodBeat.o(42721);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.1
 * JD-Core Version:    0.6.2
 */