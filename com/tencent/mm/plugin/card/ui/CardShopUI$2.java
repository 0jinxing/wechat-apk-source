package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardShopUI$2
  implements MenuItem.OnMenuItemClickListener
{
  CardShopUI$2(CardShopUI paramCardShopUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88630);
    this.knD.finish();
    AppMethodBeat.o(88630);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardShopUI.2
 * JD-Core Version:    0.6.2
 */