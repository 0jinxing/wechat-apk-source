package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyMyRecordUI$1
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyMyRecordUI$1(LuckyMoneyMyRecordUI paramLuckyMoneyMyRecordUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42755);
    this.ofb.finish();
    AppMethodBeat.o(42755);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.1
 * JD-Core Version:    0.6.2
 */