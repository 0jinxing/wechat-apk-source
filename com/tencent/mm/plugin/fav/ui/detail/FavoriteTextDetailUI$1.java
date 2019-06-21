package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteTextDetailUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteTextDetailUI$1(FavoriteTextDetailUI paramFavoriteTextDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74437);
    this.mmR.finish();
    AppMethodBeat.o(74437);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI.1
 * JD-Core Version:    0.6.2
 */