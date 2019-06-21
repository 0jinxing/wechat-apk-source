package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CardAcceptCardListUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CardAcceptCardListUI$1(CardAcceptCardListUI paramCardAcceptCardListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88216);
    ab.v("MicroMsg.CardAcceptCardListUI", "setBackBtn cancel");
    CardAcceptCardListUI.a(this.kiw, 1);
    AppMethodBeat.o(88216);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.1
 * JD-Core Version:    0.6.2
 */