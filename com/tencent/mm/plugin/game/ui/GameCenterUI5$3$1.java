package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.c;

final class GameCenterUI5$3$1
  implements Runnable
{
  GameCenterUI5$3$1(GameCenterUI5.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111790);
    if (this.nfY.nfU.isFinishing())
      AppMethodBeat.o(111790);
    while (true)
    {
      return;
      GameCenterUI5.a(this.nfY.nfU, c.ej(this.nfY.nfU));
      GameCenterUI5.a(this.nfY.nfU).show();
      AppMethodBeat.o(111790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterUI5.3.1
 * JD-Core Version:    0.6.2
 */