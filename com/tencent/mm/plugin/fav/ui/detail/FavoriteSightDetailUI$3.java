package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteSightDetailUI$3
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteSightDetailUI$3(FavoriteSightDetailUI paramFavoriteSightDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74414);
    this.mmH.finish();
    AppMethodBeat.o(74414);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.3
 * JD-Core Version:    0.6.2
 */