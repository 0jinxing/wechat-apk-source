package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class FavoriteSightDetailUI$4
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteSightDetailUI$4(FavoriteSightDetailUI paramFavoriteSightDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74419);
    paramMenuItem = new d(this.mmH.mController.ylL, 1, false);
    paramMenuItem.rBl = new FavoriteSightDetailUI.4.1(this);
    paramMenuItem.rBm = new FavoriteSightDetailUI.4.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(74419);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.4
 * JD-Core Version:    0.6.2
 */