package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.m;
import com.tencent.mm.plugin.fav.a.m.a;

final class FavoriteFileDetailUI$11
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteFileDetailUI$11(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74333);
    m.a(m.a.mfw, FavoriteFileDetailUI.b(this.mlX));
    this.mlX.finish();
    AppMethodBeat.o(74333);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.11
 * JD-Core Version:    0.6.2
 */