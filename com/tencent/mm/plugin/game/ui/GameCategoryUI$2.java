package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameCategoryUI$2
  implements MenuItem.OnMenuItemClickListener
{
  GameCategoryUI$2(GameCategoryUI paramGameCategoryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(111746);
    paramMenuItem = new Intent(this.nfo, GameSearchUI.class);
    switch (GameCategoryUI.a(this.nfo))
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      this.nfo.startActivity(paramMenuItem);
      AppMethodBeat.o(111746);
      return true;
      paramMenuItem.putExtra("game_report_from_scene", 1602);
      continue;
      paramMenuItem.putExtra("game_report_from_scene", 1502);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCategoryUI.2
 * JD-Core Version:    0.6.2
 */