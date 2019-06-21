package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class CardHomePageNewUI$o
  implements MenuItem.OnMenuItemClickListener
{
  CardHomePageNewUI$o(CardHomePageNewUI paramCardHomePageNewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(89228);
    ab.i("MicroMsg.CardHomePageNewUI", "click sort menu");
    CardHomePageNewUI.n(this.koY);
    AppMethodBeat.o(89228);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.o
 * JD-Core Version:    0.6.2
 */