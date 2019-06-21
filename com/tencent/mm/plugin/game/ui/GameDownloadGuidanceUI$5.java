package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.game.d.bi;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.sdk.platformtools.al;

final class GameDownloadGuidanceUI$5
  implements Runnable
{
  GameDownloadGuidanceUI$5(GameDownloadGuidanceUI paramGameDownloadGuidanceUI, a parama, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111886);
    if (this.nfV == null)
      GameDownloadGuidanceUI.a(this.nhT, new bi());
    while (true)
    {
      al.d(new GameDownloadGuidanceUI.5.1(this, new ab(this.nfV)));
      AppMethodBeat.o(111886);
      return;
      GameDownloadGuidanceUI.a(this.nhT, (bi)this.nfV);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI.5
 * JD-Core Version:    0.6.2
 */