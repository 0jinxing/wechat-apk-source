package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.af;
import com.tencent.mm.sdk.platformtools.ab;

final class GameOverSeaCenterUI$2$2
  implements Runnable
{
  GameOverSeaCenterUI$2$2(GameOverSeaCenterUI.2 param2, af paramaf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112127);
    try
    {
      GameOverSeaCenterUI.a(this.nlI.nlH, this.nlJ, 1);
      AppMethodBeat.o(112127);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI crash, %s", new Object[] { localException.getMessage() });
        this.nlI.nlH.finish();
        AppMethodBeat.o(112127);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI.2.2
 * JD-Core Version:    0.6.2
 */