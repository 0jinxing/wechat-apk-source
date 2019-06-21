package com.tencent.mm.plugin.game.ui.tab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.bg;
import com.tencent.mm.plugin.game.model.aj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class GameRouteUI$2
  implements Runnable
{
  GameRouteUI$2(GameRouteUI paramGameRouteUI, bg parambg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112221);
    aj.a(this.mYA);
    if ((this.mYA != null) && (!bo.ek(this.mYA.naO)))
    {
      GameRouteUI.a(this.nnf, this.mYA.naO);
      AppMethodBeat.o(112221);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.GameRouteUI", "get GameIndex4TabNavData err");
      GameRouteUI.a(this.nnf);
      AppMethodBeat.o(112221);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameRouteUI.2
 * JD-Core Version:    0.6.2
 */