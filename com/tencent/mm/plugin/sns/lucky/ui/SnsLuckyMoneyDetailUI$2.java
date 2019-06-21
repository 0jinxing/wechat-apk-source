package com.tencent.mm.plugin.sns.lucky.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsLuckyMoneyDetailUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SnsLuckyMoneyDetailUI$2(SnsLuckyMoneyDetailUI paramSnsLuckyMoneyDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(45184);
    this.qHf.finish();
    AppMethodBeat.o(45184);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI.2
 * JD-Core Version:    0.6.2
 */