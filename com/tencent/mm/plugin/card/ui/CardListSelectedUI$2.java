package com.tencent.mm.plugin.card.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.j;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.a;
import com.tencent.mm.plugin.card.model.am;

final class CardListSelectedUI$2
  implements MenuItem.OnMenuItemClickListener
{
  CardListSelectedUI$2(CardListSelectedUI paramCardListSelectedUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(88556);
    if ((!this.kmz.kml) && (CardListSelectedUI.b(this.kmz).kcf))
    {
      this.kmz.fE(true);
      am.bbi().M(CardListSelectedUI.b(this.kmz).kca, l.Ht(CardListSelectedUI.b(this.kmz).userName), 3);
    }
    while (true)
    {
      AppMethodBeat.o(88556);
      return true;
      CardListSelectedUI.a(this.kmz);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardListSelectedUI.2
 * JD-Core Version:    0.6.2
 */