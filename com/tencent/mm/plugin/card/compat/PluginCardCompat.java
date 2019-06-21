package com.tencent.mm.plugin.card.compat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.plugin.card.compat.a.b;

public final class PluginCardCompat extends f
  implements b
{
  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(18649);
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.card.compat.a.a.class, new e(new a()));
    AppMethodBeat.o(18649);
  }

  public final void installed()
  {
    AppMethodBeat.i(18648);
    super.installed();
    alias(b.class);
    AppMethodBeat.o(18648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.compat.PluginCardCompat
 * JD-Core Version:    0.6.2
 */