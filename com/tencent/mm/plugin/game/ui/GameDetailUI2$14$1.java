package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.z;

final class GameDetailUI2$14$1
  implements Runnable
{
  GameDetailUI2$14$1(GameDetailUI2.14 param14, z paramz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111854);
    GameDetailUI2.a(this.nhN.nhI, this.nhL);
    if (GameDetailUI2.h(this.nhN.nhI) != null)
      GameDetailUI2.h(this.nhN.nhI).dismiss();
    AppMethodBeat.o(111854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.14.1
 * JD-Core Version:    0.6.2
 */