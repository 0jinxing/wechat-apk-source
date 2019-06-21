package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.aa;

final class GameDetailRankUI$1
  implements Runnable
{
  GameDetailRankUI$1(GameDetailRankUI paramGameDetailRankUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111833);
    aa localaa = new aa(GameDetailRankUI.a(this.ngI));
    GameDetailRankUI.b(this.ngI).a(localaa);
    AppMethodBeat.o(111833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailRankUI.1
 * JD-Core Version:    0.6.2
 */