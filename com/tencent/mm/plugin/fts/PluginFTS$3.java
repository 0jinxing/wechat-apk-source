package com.tencent.mm.plugin.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class PluginFTS$3
  implements e
{
  PluginFTS$3(PluginFTS paramPluginFTS)
  {
  }

  public final void bAe()
  {
    AppMethodBeat.i(136582);
    com.tencent.mm.kernel.g.RQ();
    int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSC, Integer.valueOf(3))).intValue();
    ab.e("MicroMsg.FTS.PluginFTS", "DB onCorrupt dbCorruptRebuildTimes: %d", new Object[] { Integer.valueOf(i) });
    if (i > 0)
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSC, Integer.valueOf(i - 1));
      PluginFTS.access$300(this.mBO);
      PluginFTS.access$400(this.mBO);
      PluginFTS.access$200(this.mBO).close();
      d.bAb();
      PluginFTS.access$500(this.mBO).a(-131072, new PluginFTS.b(this.mBO, (byte)0));
    }
    AppMethodBeat.o(136582);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS.3
 * JD-Core Version:    0.6.2
 */