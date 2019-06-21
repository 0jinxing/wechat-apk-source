package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardHomePageUI$3
  implements MenuItem.OnMenuItemClickListener
{
  CardHomePageUI$3(CardHomePageUI paramCardHomePageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88485);
    if ((CardHomePageUI.a(this.klP) == 1) || (CardHomePageUI.a(this.klP) == 2))
      CardHomePageUI.b(this.klP);
    while (true)
    {
      AppMethodBeat.o(88485);
      return true;
      this.klP.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardHomePageUI.3
 * JD-Core Version:    0.6.2
 */