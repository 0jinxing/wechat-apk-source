package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.ae;

final class GameLibraryUI$9$1
  implements Runnable
{
  GameLibraryUI$9$1(GameLibraryUI.9 param9, ae paramae)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112039);
    GameLibraryUI localGameLibraryUI = this.nki.nkf;
    ae localae = this.nkg;
    if (GameLibraryUI.m(this.nki.nkf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      GameLibraryUI.a(localGameLibraryUI, localae, bool);
      GameLibraryUI.p(this.nki.nkf);
      GameLibraryUI.l(this.nki.nkf).setVisibility(8);
      GameLibraryUI.b(this.nki.nkf, GameLibraryUI.m(this.nki.nkf) + 15);
      if (GameLibraryUI.q(this.nki.nkf) != null)
        GameLibraryUI.q(this.nki.nkf).dismiss();
      AppMethodBeat.o(112039);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryUI.9.1
 * JD-Core Version:    0.6.2
 */