package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameDetailUI2$13
  implements MenuItem.OnMenuItemClickListener
{
  GameDetailUI2$13(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(111853);
    GameDetailUI2.a(this.nhI, GameDetailUI2.e(this.nhI));
    b.a(this.nhI.mController.ylL, 12, 1207, 1, 2, GameDetailUI2.f(this.nhI), GameDetailUI2.g(this.nhI), null);
    AppMethodBeat.o(111853);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.13
 * JD-Core Version:    0.6.2
 */