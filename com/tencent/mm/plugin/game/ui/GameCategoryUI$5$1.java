package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.y;

final class GameCategoryUI$5$1
  implements Runnable
{
  GameCategoryUI$5$1(GameCategoryUI.5 param5, y paramy)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111749);
    GameCategoryUI localGameCategoryUI = this.nfr.nfo;
    y localy = this.nfq;
    if (GameCategoryUI.h(this.nfr.nfo) != 0);
    for (boolean bool = true; ; bool = false)
    {
      GameCategoryUI.a(localGameCategoryUI, localy, bool);
      GameCategoryUI.i(this.nfr.nfo);
      GameCategoryUI.f(this.nfr.nfo).setVisibility(8);
      GameCategoryUI.a(this.nfr.nfo, GameCategoryUI.h(this.nfr.nfo) + 15);
      if (GameCategoryUI.j(this.nfr.nfo) != null)
        GameCategoryUI.j(this.nfr.nfo).dismiss();
      AppMethodBeat.o(111749);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCategoryUI.5.1
 * JD-Core Version:    0.6.2
 */