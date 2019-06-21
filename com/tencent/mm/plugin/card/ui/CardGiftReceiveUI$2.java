package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardGiftReceiveUI$2
  implements MenuItem.OnMenuItemClickListener
{
  CardGiftReceiveUI$2(CardGiftReceiveUI paramCardGiftReceiveUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88416);
    this.klk.finish();
    AppMethodBeat.o(88416);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.2
 * JD-Core Version:    0.6.2
 */