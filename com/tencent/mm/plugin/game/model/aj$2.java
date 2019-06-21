package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.bg;
import com.tencent.mm.sdk.platformtools.ab;

final class aj$2
  implements aj.a
{
  aj$2(bg parambg)
  {
  }

  public final void onComplete()
  {
    AppMethodBeat.i(111417);
    ab.i("MicroMsg.NetSceneGameIndex4TabNav", "nav icon download complete! save nav data");
    ((c)g.K(c.class)).bCZ().b("game_index4_tab_nav", this.mYA);
    AppMethodBeat.o(111417);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aj.2
 * JD-Core Version:    0.6.2
 */