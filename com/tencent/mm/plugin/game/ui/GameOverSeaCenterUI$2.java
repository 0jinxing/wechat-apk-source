package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.plugin.game.f.a.a;
import com.tencent.mm.plugin.game.model.af;
import com.tencent.mm.plugin.game.model.ap;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.al;

final class GameOverSeaCenterUI$2
  implements Runnable
{
  GameOverSeaCenterUI$2(GameOverSeaCenterUI paramGameOverSeaCenterUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112129);
    Object localObject = ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCZ().NK("pb_over_sea");
    if (localObject == null)
      al.d(new GameOverSeaCenterUI.2.1(this));
    while (true)
    {
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().init(this.nlH);
      com.tencent.mm.plugin.game.f.c.ab(e.bDR());
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(112128);
          GameOverSeaCenterUI.b(GameOverSeaCenterUI.2.this.nlH).gO(true);
          AppMethodBeat.o(112128);
        }
      });
      localObject = new ap(aa.dor(), e.bDR(), this.nlH.nfw, this.nlH.nfx, this.nlH.nfy, this.nlH.nfv);
      g.Rg().a((m)localObject, 0);
      e.bDW();
      a.a.bFE().bFC();
      AppMethodBeat.o(112129);
      return;
      al.d(new GameOverSeaCenterUI.2.2(this, new af((byte[])localObject)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI.2
 * JD-Core Version:    0.6.2
 */