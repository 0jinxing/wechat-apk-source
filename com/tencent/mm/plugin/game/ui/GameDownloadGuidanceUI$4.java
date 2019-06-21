package com.tencent.mm.plugin.game.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameDownloadGuidanceUI$4
  implements MenuItem.OnMenuItemClickListener
{
  GameDownloadGuidanceUI$4(GameDownloadGuidanceUI paramGameDownloadGuidanceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(111884);
    int i = c.ax(this.nhT.mController.ylL, GameDownloadGuidanceUI.c(this.nhT));
    b.a(this.nhT.mController.ylL, 10, 1008, 1, i, this.nhT.mXC, null);
    AppMethodBeat.o(111884);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI.4
 * JD-Core Version:    0.6.2
 */