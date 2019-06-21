package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameDownloadGuidanceUI$5$1
  implements Runnable
{
  GameDownloadGuidanceUI$5$1(GameDownloadGuidanceUI.5 param5, com.tencent.mm.plugin.game.model.ab paramab)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111885);
    try
    {
      this.nhW.nhT.a(this.nhV, 2);
      if (GameDownloadGuidanceUI.a(this.nhW.nhT) != null)
        GameDownloadGuidanceUI.a(this.nhW.nhT).dismiss();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.GameDownloadGuidanceUI", "Server data parsing time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.nhW.ecn) });
      AppMethodBeat.o(111885);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI crash, %s", new Object[] { localException.getMessage() });
        this.nhW.nhT.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI.5.1
 * JD-Core Version:    0.6.2
 */