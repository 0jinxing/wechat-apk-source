package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.game.model.q;

final class GameCenterBaseUI$1
  implements Runnable
{
  GameCenterBaseUI$1(GameCenterBaseUI paramGameCenterBaseUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111759);
    GameCenterBaseUI.a(this.nfB);
    if (this.nfB.nfv)
    {
      GameCenterBaseUI.b(this.nfB);
      ((b)g.K(b.class)).bCX();
      q.bEp();
    }
    AppMethodBeat.o(111759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterBaseUI.1
 * JD-Core Version:    0.6.2
 */