package com.tencent.mm.plugin.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class PluginFTS$1
  implements Runnable
{
  PluginFTS$1(PluginFTS paramPluginFTS)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136579);
    if (PluginFTS.access$200(this.mBO) != null)
      PluginFTS.access$200(this.mBO).rollback();
    AppMethodBeat.o(136579);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS.1
 * JD-Core Version:    0.6.2
 */