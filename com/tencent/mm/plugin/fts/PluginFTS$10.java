package com.tencent.mm.plugin.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ts;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;

final class PluginFTS$10 extends com.tencent.mm.plugin.fts.a.a.a
{
  boolean apm;
  String mBR;

  PluginFTS$10(PluginFTS paramPluginFTS)
  {
    AppMethodBeat.i(136594);
    this.mBR = aa.gw(ah.getContext());
    this.apm = false;
    AppMethodBeat.o(136594);
  }

  public final String aAo()
  {
    AppMethodBeat.i(136596);
    String str = String.format("{changed: %b}", new Object[] { Boolean.valueOf(this.apm) });
    AppMethodBeat.o(136596);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136595);
    if ((int)((n)g.M(n.class)).getFTSIndexDB().J(-3L, 0L) != this.mBR.hashCode());
    for (boolean bool = true; ; bool = false)
    {
      this.apm = bool;
      if (this.apm)
        com.tencent.mm.sdk.b.a.xxA.m(new ts());
      AppMethodBeat.o(136595);
      return true;
    }
  }

  public final String getName()
  {
    return "CheckLanguageUpdate";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS.10
 * JD-Core Version:    0.6.2
 */