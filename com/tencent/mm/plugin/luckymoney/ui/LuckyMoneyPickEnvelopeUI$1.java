package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyPickEnvelopeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  LuckyMoneyPickEnvelopeUI$1(LuckyMoneyPickEnvelopeUI paramLuckyMoneyPickEnvelopeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(42902);
    this.ogX.finish();
    AppMethodBeat.o(42902);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.1
 * JD-Core Version:    0.6.2
 */