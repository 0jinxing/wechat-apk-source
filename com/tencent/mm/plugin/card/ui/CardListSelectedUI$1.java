package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardListSelectedUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CardListSelectedUI$1(CardListSelectedUI paramCardListSelectedUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88555);
    this.kmz.setResult(0);
    CardListSelectedUI.a(this.kmz, "");
    this.kmz.finish();
    AppMethodBeat.o(88555);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardListSelectedUI.1
 * JD-Core Version:    0.6.2
 */