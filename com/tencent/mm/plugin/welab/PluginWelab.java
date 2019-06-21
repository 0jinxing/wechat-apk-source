package com.tencent.mm.plugin.welab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;

public class PluginWelab extends f
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.bucket.d, com.tencent.mm.plugin.welab.a.a
{
  private b uLM;
  private boolean uLN;

  public PluginWelab()
  {
    AppMethodBeat.i(80518);
    this.uLM = new b();
    AppMethodBeat.o(80518);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(80526);
    ab.v("PluginWelab", "collectDatabaseFactory");
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("LabAppInfo".hashCode()), new PluginWelab.2(this));
    AppMethodBeat.o(80526);
    return localHashMap;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(80521);
    if (!paramg.SG())
      AppMethodBeat.o(80521);
    while (true)
    {
      return;
      ab.v("PluginWelab", "configure");
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.welab.a.a.d.class, new e(new c()));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.welab.b.a.class, new e(new com.tencent.mm.plugin.welab.b.b()));
      ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new PluginWelab.1(this));
      AppMethodBeat.o(80521);
    }
  }

  public void dependency()
  {
    AppMethodBeat.i(80520);
    dependsOn(p.class);
    AppMethodBeat.o(80520);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(80522);
    ab.v("PluginWelab", "execute");
    AppMethodBeat.o(80522);
  }

  public void installed()
  {
    AppMethodBeat.i(80519);
    alias(com.tencent.mm.plugin.welab.a.a.class);
    AppMethodBeat.o(80519);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(80524);
    ab.v("PluginWelab", "onAccountInitialized");
    ah.getContext();
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.welab.a.a.a.class, new com.tencent.mm.plugin.welab.a.b());
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.welab.a.a.c.class, new com.tencent.mm.plugin.welab.a.c());
    this.uLN = paramc.eKe;
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().a("newabtestlabs", this.uLM, true);
    AppMethodBeat.o(80524);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(80525);
    ab.v("PluginWelab", "onAccountRelease");
    ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("newabtestlabs", this.uLM, true);
    AppMethodBeat.o(80525);
  }

  public void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(80523);
    ab.v("PluginWelab", "onDataBaseOpened");
    a.ddj().uLQ = new com.tencent.mm.plugin.welab.d.a(paramh1);
    AppMethodBeat.o(80523);
  }

  public String toString()
  {
    return "plugin-welab";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.PluginWelab
 * JD-Core Version:    0.6.2
 */