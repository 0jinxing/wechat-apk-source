package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardConsumeCodeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CardConsumeCodeUI$1(CardConsumeCodeUI paramCardConsumeCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88098);
    this.kgC.setResult(-1);
    this.kgC.finish();
    AppMethodBeat.o(88098);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI.1
 * JD-Core Version:    0.6.2
 */