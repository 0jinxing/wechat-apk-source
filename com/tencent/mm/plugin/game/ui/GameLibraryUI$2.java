package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameLibraryUI$2
  implements MenuItem.OnMenuItemClickListener
{
  GameLibraryUI$2(GameLibraryUI paramGameLibraryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112031);
    paramMenuItem = new Intent(this.nkf, GameSearchUI.class);
    paramMenuItem.putExtra("game_report_from_scene", 1109);
    this.nkf.startActivity(paramMenuItem);
    AppMethodBeat.o(112031);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryUI.2
 * JD-Core Version:    0.6.2
 */