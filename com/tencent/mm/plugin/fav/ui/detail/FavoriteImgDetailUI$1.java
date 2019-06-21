package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteImgDetailUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteImgDetailUI$1(FavoriteImgDetailUI paramFavoriteImgDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74374);
    this.mmn.finish();
    AppMethodBeat.o(74374);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.1
 * JD-Core Version:    0.6.2
 */