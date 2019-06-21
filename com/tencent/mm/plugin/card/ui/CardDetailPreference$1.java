package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardDetailPreference$1
  implements MenuItem.OnMenuItemClickListener
{
  CardDetailPreference$1(CardDetailPreference paramCardDetailPreference)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88256);
    this.kiL.finish();
    AppMethodBeat.o(88256);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardDetailPreference.1
 * JD-Core Version:    0.6.2
 */