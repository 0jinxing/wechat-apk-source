package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$7
  implements ap.a
{
  private int mFL = 0;

  a$7(a parama)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(136658);
    PluginFTS localPluginFTS = (PluginFTS)g.M(PluginFTS.class);
    int i;
    if ((localPluginFTS.isCharging()) || (!localPluginFTS.isInBackground()))
    {
      i = 1;
      if (i != 0)
        break label64;
      i = this.mFL + 1;
      this.mFL = i;
      if (i >= 6)
        break label64;
      AppMethodBeat.o(136658);
    }
    while (true)
    {
      return true;
      i = 0;
      break;
      label64: a.e(this.mFK).a(131093, new a.u(this.mFK, (byte)0));
      this.mFL = 0;
      AppMethodBeat.o(136658);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(136659);
    String str = super.toString() + "|delayIndexTimer";
    AppMethodBeat.o(136659);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.7
 * JD-Core Version:    0.6.2
 */