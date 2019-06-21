package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.be;
import com.tencent.mm.plugin.game.model.ac;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.al;

final class GameCenterUI5$2
  implements Runnable
{
  GameCenterUI5$2(GameCenterUI5 paramGameCenterUI5, a parama, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111789);
    be localbe;
    if (this.nfV == null)
      localbe = new be();
    while (true)
    {
      al.d(new GameCenterUI5.2.1(this, new ac(localbe)));
      AppMethodBeat.o(111789);
      return;
      localbe = (be)this.nfV;
      ((c)g.K(c.class)).bCZ().b("pb_index_4", localbe);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterUI5.2
 * JD-Core Version:    0.6.2
 */