package com.tencent.mm.plugin.misc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.misc.b.b;

public class PluginMisc extends f
  implements a
{
  public void dependency()
  {
    AppMethodBeat.i(50502);
    dependsOn(p.class);
    AppMethodBeat.o(50502);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(50503);
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.misc.a.a.class, new b());
    pin(com.tencent.mm.plugin.misc.b.a.bOM());
    AppMethodBeat.o(50503);
  }

  public void installed()
  {
    AppMethodBeat.i(50501);
    alias(a.class);
    AppMethodBeat.o(50501);
  }

  public String toString()
  {
    return "plugin-misc";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.misc.PluginMisc
 * JD-Core Version:    0.6.2
 */