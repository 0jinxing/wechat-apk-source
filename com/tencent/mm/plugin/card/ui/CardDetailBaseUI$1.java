package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardDetailBaseUI$1
  implements View.OnClickListener
{
  CardDetailBaseUI$1(CardDetailBaseUI paramCardDetailBaseUI, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88255);
    if (this.kiI != null)
      this.kiI.onMenuItemClick(null);
    AppMethodBeat.o(88255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardDetailBaseUI.1
 * JD-Core Version:    0.6.2
 */