package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavSelectUI$2
  implements MenuItem.OnMenuItemClickListener
{
  FavSelectUI$2(FavSelectUI paramFavSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74102);
    paramMenuItem = new Intent();
    FavSelectUI.a(this.mjF, paramMenuItem);
    AppMethodBeat.o(74102);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSelectUI.2
 * JD-Core Version:    0.6.2
 */