package com.tencent.mm.plugin.fav.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavCleanUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FavCleanUI$1(FavCleanUI paramFavCleanUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(73949);
    this.mhW.finish();
    AppMethodBeat.o(73949);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.1
 * JD-Core Version:    0.6.2
 */