package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameMessageUI$1
  implements MenuItem.OnMenuItemClickListener
{
  GameMessageUI$1(GameMessageUI paramGameMessageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112099);
    GameMessageUI.a(this.nlu);
    AppMethodBeat.o(112099);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageUI.1
 * JD-Core Version:    0.6.2
 */