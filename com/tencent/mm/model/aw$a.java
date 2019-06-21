package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.b.d;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.n;
import java.util.HashMap;

class aw$a
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.api.e, com.tencent.mm.kernel.c.a
{
  aw$a(aw paramaw)
  {
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(16284);
    ab.i("MicroMsg.MMCore", "collectDatabaseFactory ");
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(c.eaA);
    AppMethodBeat.o(16284);
    return localHashMap;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(16281);
    if (paramc.eKe)
      com.tencent.mm.x.c.PK().x(262145, false);
    com.tencent.mm.plugin.report.service.h.pYm.a(598L, 13L, 1L, false);
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized start tid[%d]", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
    Object localObject = aw.a(this.flP);
    com.tencent.mm.cd.h localh = g.RP().eJN;
    g.RP();
    com.tencent.mm.plugin.messenger.foundation.a.a.h localh1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr();
    localh1.a(new au(localh1));
    com.tencent.mm.storage.h localh2 = new com.tencent.mm.storage.h(localh1);
    ((c)localObject).fkf = localh2;
    localh1.a(localh2);
    ((c)localObject).fkd = new br(localh, ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR());
    ((c)localObject).fke = new bq(localh, ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM());
    ((c)localObject).fkg = new com.tencent.mm.model.b.c();
    ((c)localObject).fkh = new d();
    ((c)localObject).fkl = new com.tencent.mm.model.b.b();
    ((c)localObject).fki = new com.tencent.mm.storage.j(localh);
    ((c)localObject).fkj = new n(localh);
    ((c)localObject).fkk = new l(localh);
    com.tencent.mm.plugin.report.service.h.pYm.a(598L, 14L, 1L, false);
    ab.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized done initDB take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    localObject = this.flP.flF;
    aw.a(this.flP);
    ((c.a)localObject).cx(paramc.eKe);
    com.tencent.mm.plugin.report.service.h.pYm.a(598L, 15L, 1L, false);
    ab.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized done onAccountPostReset take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    f.Mn();
    com.tencent.mm.plugin.report.service.h.pYm.a(598L, 16L, 1L, false);
    ab.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized done all take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(16281);
  }

  public void onAccountRelease()
  {
  }

  public void onDataBaseClosed(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
  }

  public void onDataBaseOpened(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
    AppMethodBeat.i(16283);
    aw.a(this.flP);
    AppMethodBeat.o(16283);
  }

  public void parallelsDependency()
  {
    AppMethodBeat.i(16282);
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(p.class));
    AppMethodBeat.o(16282);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.aw.a
 * JD-Core Version:    0.6.2
 */