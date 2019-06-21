package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class GameMessageUI$2
  implements MenuItem.OnMenuItemClickListener
{
  GameMessageUI$2(GameMessageUI paramGameMessageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112101);
    GameMessageUI.a(this.nlu, new GameMessageUI.2.1(this));
    GameMessageUI.b(this.nlu, new GameMessageUI.2.2(this));
    h.a(this.nlu.mController.ylL, 2131300230, 0, GameMessageUI.c(this.nlu), GameMessageUI.d(this.nlu));
    AppMethodBeat.o(112101);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageUI.2
 * JD-Core Version:    0.6.2
 */