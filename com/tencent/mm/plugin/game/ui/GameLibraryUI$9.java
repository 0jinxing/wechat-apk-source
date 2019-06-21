package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.game.model.ae;
import com.tencent.mm.sdk.platformtools.al;

final class GameLibraryUI$9
  implements Runnable
{
  GameLibraryUI$9(GameLibraryUI paramGameLibraryUI, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112040);
    Object localObject = this.nfV;
    if ((GameLibraryUI.m(this.nkf) == 0) && (!GameLibraryUI.n(this.nkf)));
    for (boolean bool = true; ; bool = false)
    {
      localObject = new ae((a)localObject, bool, GameLibraryUI.m(this.nkf));
      GameLibraryUI.o(this.nkf);
      al.d(new GameLibraryUI.9.1(this, (ae)localObject));
      AppMethodBeat.o(112040);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryUI.9
 * JD-Core Version:    0.6.2
 */