package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.monitor.a.a;
import com.tencent.mm.sdk.platformtools.ab;

public class PluginMonitor extends f
  implements a
{
  public void dependency()
  {
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(84516);
    if (paramg.SG())
    {
      ab.i("MicroMsg.PluginMonitor", "PluginMonitor execute PluginMonitor new SubCoreBaseMonitor");
      pin(new q(b.class));
    }
    AppMethodBeat.o(84516);
  }

  public void installed()
  {
    AppMethodBeat.i(84515);
    super.installed();
    alias(a.class);
    AppMethodBeat.o(84515);
  }

  public String name()
  {
    return "plugin-monitor";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.PluginMonitor
 * JD-Core Version:    0.6.2
 */