package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.c;

final class GameDownloadGuidanceUI$2$1
  implements Runnable
{
  GameDownloadGuidanceUI$2$1(GameDownloadGuidanceUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111880);
    if (this.nhU.nhT.isFinishing())
      AppMethodBeat.o(111880);
    while (true)
    {
      return;
      GameDownloadGuidanceUI.a(this.nhU.nhT, c.ej(this.nhU.nhT));
      GameDownloadGuidanceUI.a(this.nhU.nhT).show();
      AppMethodBeat.o(111880);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI.2.1
 * JD-Core Version:    0.6.2
 */