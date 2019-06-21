package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameRegionSelectUI$1
  implements MenuItem.OnMenuItemClickListener
{
  GameRegionSelectUI$1(GameRegionSelectUI paramGameRegionSelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112158);
    this.nlU.setResult(0);
    this.nlU.aqX();
    this.nlU.finish();
    AppMethodBeat.o(112158);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRegionSelectUI.1
 * JD-Core Version:    0.6.2
 */