package com.tencent.mm.plugin.trafficmonitor;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.plugin.trafficmonitor.a.a;

public class PluginTrafficMonitor extends f
  implements a
{
  public void execute(g paramg)
  {
    AppMethodBeat.i(114759);
    if ((paramg.SG()) && (Build.VERSION.SDK_INT < 28) && (Build.VERSION.SDK_INT > 19))
    {
      paramg.cc.registerReceiver(new TrafficClickFlowReceiver(), new IntentFilter("com.tencent.mm.Intent.ACTION_NET_STATS"));
      e.cHE();
      e.cHF();
    }
    AppMethodBeat.o(114759);
  }

  public void installed()
  {
    AppMethodBeat.i(114758);
    super.installed();
    alias(a.class);
    AppMethodBeat.o(114758);
  }

  public String name()
  {
    return "plugin-trafficmonitor";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.PluginTrafficMonitor
 * JD-Core Version:    0.6.2
 */