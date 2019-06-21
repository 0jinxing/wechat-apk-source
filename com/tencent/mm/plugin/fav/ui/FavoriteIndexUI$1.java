package com.tencent.mm.plugin.fav.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.b;

final class FavoriteIndexUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteIndexUI$1(FavoriteIndexUI paramFavoriteIndexUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74219);
    if (FavoriteIndexUI.a(this.mkH).mlh)
    {
      FavoriteIndexUI.b(this.mkH);
      AppMethodBeat.o(74219);
    }
    while (true)
    {
      return true;
      this.mkH.finish();
      AppMethodBeat.o(74219);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.1
 * JD-Core Version:    0.6.2
 */