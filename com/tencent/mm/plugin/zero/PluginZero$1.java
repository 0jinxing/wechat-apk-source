package com.tencent.mm.plugin.zero;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.a;
import com.tencent.mm.kernel.l;
import com.tencent.mm.sdk.platformtools.ab;

final class PluginZero$1
  implements com.tencent.mm.kernel.api.g
{
  PluginZero$1(PluginZero paramPluginZero, com.tencent.mm.kernel.b.g paramg)
  {
  }

  public final void BR()
  {
    AppMethodBeat.i(58746);
    a.k("onStartupDone", new Object[0]);
    AppMethodBeat.o(58746);
  }

  public final void bi(boolean paramBoolean)
  {
    AppMethodBeat.i(58747);
    if (paramBoolean)
    {
      l.m(this.cen.cc, true);
      l.n(this.cen.cc, true);
    }
    ab.dot();
    AppMethodBeat.o(58747);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.PluginZero.1
 * JD-Core Version:    0.6.2
 */