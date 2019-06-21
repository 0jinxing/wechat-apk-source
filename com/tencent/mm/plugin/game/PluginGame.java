package com.tencent.mm.plugin.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public class PluginGame extends f
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.game.a.d
{
  c mTo;

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(111178);
    if (paramg.SG())
    {
      ab.i("MicroMsg.PluginGame", "PluginGame configure");
      a.a.a(new b());
      if (this.mTo == null)
        this.mTo = new c();
    }
    if (paramg.lQ(":tools"))
      h.pYm.k(939L, 1L, 1L);
    AppMethodBeat.o(111178);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(111179);
    if (paramg.SG())
    {
      ab.i("MicroMsg.PluginGame", "PluginGame execute");
      com.tencent.mm.bp.c.aks("game");
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.game.a.c.class, new e());
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.game.a.b.class, new d());
    }
    AppMethodBeat.o(111179);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(111180);
    ab.i("MicroMsg.PluginGame", "onAccountInitialized");
    if (this.mTo != null)
    {
      paramc = this.mTo;
      ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("gamecenter", paramc.luy, true);
      a.xxA.c(paramc.mSR);
      a.xxA.c(paramc.mSS);
      a.xxA.c(paramc.mST);
      a.xxA.c(paramc.egQ);
      a.xxA.c(paramc.mSU);
      a.xxA.c(paramc.mSV);
      a.xxA.c(paramc.mSW);
      a.xxA.c(paramc.mSX);
      a.xxA.c(paramc.mSY);
      a.xxA.c(paramc.mTb);
      a.xxA.c(paramc.mTc);
      a.xxA.c(paramc.mSZ);
      a.xxA.c(paramc.mTd);
      a.xxA.c(paramc.mTe);
      a.xxA.c(paramc.lOc);
      a.xxA.c(paramc.mTf);
      j.bie();
      com.tencent.mm.plugin.game.model.a.e.bie();
    }
    AppMethodBeat.o(111180);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(111181);
    ab.i("MicroMsg.PluginGame", "onAccountRelease");
    if (this.mTo != null)
    {
      c localc = this.mTo;
      ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("gamecenter", localc.luy, true);
      a.xxA.d(localc.mSR);
      a.xxA.d(localc.mSS);
      a.xxA.d(localc.mST);
      a.xxA.d(localc.egQ);
      a.xxA.d(localc.mSU);
      a.xxA.d(localc.mSV);
      a.xxA.d(localc.mSW);
      a.xxA.d(localc.mSX);
      a.xxA.d(localc.mSY);
      a.xxA.d(localc.mTb);
      a.xxA.d(localc.mTc);
      a.xxA.d(localc.mSZ);
      a.xxA.d(localc.mTd);
      a.xxA.d(localc.mTe);
      a.xxA.d(localc.lOc);
      a.xxA.d(localc.mTf);
      j.bgr();
      com.tencent.mm.plugin.game.model.a.e.bgr();
    }
    com.tencent.mm.plugin.game.f.c.aNR();
    AppMethodBeat.o(111181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.PluginGame
 * JD-Core Version:    0.6.2
 */