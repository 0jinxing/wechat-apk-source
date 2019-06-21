package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardConsumeSuccessUI$1
  implements MenuItem.OnMenuItemClickListener
{
  CardConsumeSuccessUI$1(CardConsumeSuccessUI paramCardConsumeSuccessUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88117);
    this.kgU.finish();
    CardConsumeSuccessUI.bbG();
    AppMethodBeat.o(88117);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.1
 * JD-Core Version:    0.6.2
 */