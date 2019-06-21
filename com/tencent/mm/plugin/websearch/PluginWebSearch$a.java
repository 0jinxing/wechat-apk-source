package com.tencent.mm.plugin.websearch;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class PluginWebSearch$a
  implements Runnable
{
  boolean tZd;

  PluginWebSearch$a(PluginWebSearch paramPluginWebSearch, boolean paramBoolean)
  {
    this.tZd = paramBoolean;
  }

  public final void run()
  {
    AppMethodBeat.i(91315);
    PluginWebSearch.access$300(this.tZc, this.tZd);
    AppMethodBeat.o(91315);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.PluginWebSearch.a
 * JD-Core Version:    0.6.2
 */