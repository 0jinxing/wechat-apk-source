package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class FavoriteTextDetailUI$2
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteTextDetailUI$2(FavoriteTextDetailUI paramFavoriteTextDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74442);
    paramMenuItem = new d(this.mmR.mController.ylL, 1, false);
    paramMenuItem.rBl = new FavoriteTextDetailUI.2.1(this);
    paramMenuItem.rBm = new FavoriteTextDetailUI.2.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(74442);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI.2
 * JD-Core Version:    0.6.2
 */