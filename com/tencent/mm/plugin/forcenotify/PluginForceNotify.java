package com.tencent.mm.plugin.forcenotify;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.e.j;
import java.util.HashMap;

public class PluginForceNotify extends f
  implements com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.forcenotify.a.c
{
  public static HashMap<Integer, h.d> eaA;

  static
  {
    AppMethodBeat.i(51014);
    eaA = new HashMap();
    String str = j.a(com.tencent.mm.plugin.forcenotify.c.b.ccO, "ForceNotifyInfo");
    eaA.put(Integer.valueOf("SPORTSTEP_TABLE".hashCode()), new PluginForceNotify.1(new String[] { str }));
    AppMethodBeat.o(51014);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return eaA;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void dependency()
  {
    AppMethodBeat.i(51011);
    dependsOn(p.class);
    AppMethodBeat.o(51011);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void installed()
  {
    AppMethodBeat.i(51010);
    alias(com.tencent.mm.plugin.forcenotify.a.c.class);
    AppMethodBeat.o(51010);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(51012);
    com.tencent.mm.plugin.forcenotify.b.c.mtf.start();
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.forcenotify.a.b.class, com.tencent.mm.plugin.forcenotify.b.c.mtf);
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.forcenotify.a.a.class, com.tencent.mm.plugin.forcenotify.b.b.mtb);
    AppMethodBeat.o(51012);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(51013);
    com.tencent.mm.plugin.forcenotify.b.c.mtf.release();
    com.tencent.mm.kernel.g.L(com.tencent.mm.plugin.forcenotify.a.b.class);
    AppMethodBeat.o(51013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.PluginForceNotify
 * JD-Core Version:    0.6.2
 */