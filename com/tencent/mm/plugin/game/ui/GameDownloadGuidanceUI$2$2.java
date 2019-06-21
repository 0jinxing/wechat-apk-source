package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameDownloadGuidanceUI$2$2
  implements Runnable
{
  GameDownloadGuidanceUI$2$2(GameDownloadGuidanceUI.2 param2, com.tencent.mm.plugin.game.model.ab paramab)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111881);
    try
    {
      this.nhU.nhT.a(this.nhV, 1);
      AppMethodBeat.o(111881);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI crash, %s", new Object[] { localException.getMessage() });
        this.nhU.nhT.finish();
        AppMethodBeat.o(111881);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI.2.2
 * JD-Core Version:    0.6.2
 */