package com.tencent.mm.plugin.priority.b.a;

import android.net.TrafficStats;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.priority.PluginPriority;
import com.tencent.mm.plugin.priority.b.d;
import com.tencent.mm.sdk.platformtools.ab;

final class a$b extends com.tencent.mm.plugin.priority.b.b.a
{
  private a$b(a parama)
  {
  }

  public final String getName()
  {
    return "Priority.CheckNetworkNetStatTask";
  }

  public final void run()
  {
    AppMethodBeat.i(54906);
    long l1 = TrafficStats.getUidRxBytes(this.pgz.uid);
    long l2 = TrafficStats.getUidTxBytes(this.pgz.uid);
    long l3 = l1 - this.pgz.pgx + (l2 - this.pgz.pgy);
    if (l3 <= 20480L)
    {
      this.pgz.pgw = false;
      this.pgz.start();
      AppMethodBeat.o(54906);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Priority.C2CImgAutoDownloader", "byteDelta %d", new Object[] { Long.valueOf(l3) });
      this.pgz.pgx = l1;
      this.pgz.pgy = l2;
      ((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner().b(new b(this.pgz));
      AppMethodBeat.o(54906);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.a.a.b
 * JD-Core Version:    0.6.2
 */