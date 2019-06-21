package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.model.w;

final class GameOverSeaCenterUI$3
  implements Runnable
{
  GameOverSeaCenterUI$3(GameOverSeaCenterUI paramGameOverSeaCenterUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112130);
    ((c)g.K(c.class)).bCZ().b("pb_over_sea", GameOverSeaCenterUI.c(this.nlH));
    AppMethodBeat.o(112130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI.3
 * JD-Core Version:    0.6.2
 */