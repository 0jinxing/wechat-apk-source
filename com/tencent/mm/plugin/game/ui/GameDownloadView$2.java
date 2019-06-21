package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.sdk.platformtools.ah;

final class GameDownloadView$2
  implements Runnable
{
  GameDownloadView$2(GameDownloadView paramGameDownloadView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111893);
    GameDownloadView.b(this.nia).ei(ah.getContext());
    GameDownloadView.b(this.nia).biT();
    GameDownloadView.a(this.nia);
    AppMethodBeat.o(111893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadView.2
 * JD-Core Version:    0.6.2
 */