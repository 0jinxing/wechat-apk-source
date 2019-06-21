package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameCategoryUI$1
  implements MenuItem.OnMenuItemClickListener
{
  GameCategoryUI$1(GameCategoryUI paramGameCategoryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(111745);
    this.nfo.finish();
    AppMethodBeat.o(111745);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCategoryUI.1
 * JD-Core Version:    0.6.2
 */