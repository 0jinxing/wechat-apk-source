package com.tencent.mm.plugin.map;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.map.a.a;

public class PluginMap extends f
  implements a
{
  public void configure(g paramg)
  {
    AppMethodBeat.i(113776);
    if (paramg.SG())
      pin(new q(l.class));
    AppMethodBeat.o(113776);
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(113777);
    if (paramg.SG())
      c.aks("location");
    AppMethodBeat.o(113777);
  }

  public void installed()
  {
    AppMethodBeat.i(113775);
    alias(a.class);
    AppMethodBeat.o(113775);
  }

  public String name()
  {
    return "plugin-map";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.map.PluginMap
 * JD-Core Version:    0.6.2
 */