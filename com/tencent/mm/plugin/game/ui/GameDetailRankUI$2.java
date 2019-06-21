package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameDetailRankUI$2
  implements MenuItem.OnMenuItemClickListener
{
  GameDetailRankUI$2(GameDetailRankUI paramGameDetailRankUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(111834);
    this.ngI.finish();
    AppMethodBeat.o(111834);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailRankUI.2
 * JD-Core Version:    0.6.2
 */