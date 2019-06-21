package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameOverSeaCenterUI$5
  implements MenuItem.OnMenuItemClickListener
{
  GameOverSeaCenterUI$5(GameOverSeaCenterUI paramGameOverSeaCenterUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112132);
    int i = c.ax(this.nlH.mController.ylL, GameOverSeaCenterUI.d(this.nlH));
    b.a(this.nlH.mController.ylL, 10, 1008, 1, i, this.nlH.mXC, null);
    AppMethodBeat.o(112132);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI.5
 * JD-Core Version:    0.6.2
 */