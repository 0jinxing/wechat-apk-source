package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.ac;
import com.tencent.mm.sdk.platformtools.ab;

final class GameCenterUI5$2$1
  implements Runnable
{
  GameCenterUI5$2$1(GameCenterUI5.2 param2, ac paramac)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111788);
    try
    {
      GameCenterUI5.a(this.nfX.nfU, this.nfW, 2);
      if (GameCenterUI5.a(this.nfX.nfU) != null)
        GameCenterUI5.a(this.nfX.nfU).dismiss();
      ab.i("MicroMsg.GameCenterUI5", "Server data parsing time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.nfX.ecn) });
      AppMethodBeat.o(111788);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.GameCenterUI5", "GameCenter crash, %s", new Object[] { localException.getMessage() });
        this.nfX.nfU.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterUI5.2.1
 * JD-Core Version:    0.6.2
 */