package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.c;

final class GameOverSeaCenterUI$2$1
  implements Runnable
{
  GameOverSeaCenterUI$2$1(GameOverSeaCenterUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112126);
    if (this.nlI.nlH.isFinishing())
      AppMethodBeat.o(112126);
    while (true)
    {
      return;
      GameOverSeaCenterUI.a(this.nlI.nlH, c.ej(this.nlI.nlH));
      GameOverSeaCenterUI.a(this.nlI.nlH).show();
      AppMethodBeat.o(112126);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI.2.1
 * JD-Core Version:    0.6.2
 */