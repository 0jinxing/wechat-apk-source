package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.game.model.y;
import com.tencent.mm.sdk.platformtools.al;

final class GameCategoryUI$5
  implements Runnable
{
  GameCategoryUI$5(GameCategoryUI paramGameCategoryUI, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111750);
    al.d(new GameCategoryUI.5.1(this, new y(this.nfp, GameCategoryUI.a(this.nfo), GameCategoryUI.h(this.nfo))));
    AppMethodBeat.o(111750);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCategoryUI.5
 * JD-Core Version:    0.6.2
 */