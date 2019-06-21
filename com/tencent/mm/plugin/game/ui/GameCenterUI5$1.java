package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameCenterUI5$1
  implements MenuItem.OnMenuItemClickListener
{
  GameCenterUI5$1(GameCenterUI5 paramGameCenterUI5)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(111787);
    this.nfU.finish();
    AppMethodBeat.o(111787);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterUI5.1
 * JD-Core Version:    0.6.2
 */