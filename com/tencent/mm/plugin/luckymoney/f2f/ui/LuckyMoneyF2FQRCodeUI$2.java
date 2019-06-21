package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyF2FQRCodeUI$2
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyF2FQRCodeUI$2(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42171);
    this.nVw.finish();
    AppMethodBeat.o(42171);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.2
 * JD-Core Version:    0.6.2
 */