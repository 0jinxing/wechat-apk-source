package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class GameDetailUI2$16
  implements View.OnClickListener
{
  GameDetailUI2$16(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111857);
    if (GameDetailUI2.l(this.nhI) == null)
    {
      ab.e("MicroMsg.GameDetailUI2", "Null appInfo");
      AppMethodBeat.o(111857);
    }
    while (true)
    {
      return;
      if (GameDetailUI2.i(this.nhI) == null)
      {
        ab.e("MicroMsg.GameDetailUI2", "No DownloadInfo found");
        AppMethodBeat.o(111857);
      }
      else
      {
        GameDetailUI2.i(this.nhI).ei(this.nhI.mController.ylL);
        GameDetailUI2.m(this.nhI).a(GameDetailUI2.l(this.nhI), GameDetailUI2.i(this.nhI));
        AppMethodBeat.o(111857);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.16
 * JD-Core Version:    0.6.2
 */