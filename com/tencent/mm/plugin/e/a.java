package com.tencent.mm.plugin.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends com.tencent.mm.kernel.a.c.a
{
  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(18521);
    if (!com.tencent.mm.kernel.a.QT())
    {
      com.tencent.mm.kernel.g.RN().eIT = true;
      com.tencent.mm.kernel.g.RN().initialize();
      com.tencent.mm.kernel.g.RN().eIT = false;
    }
    AppMethodBeat.o(18521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.e.a
 * JD-Core Version:    0.6.2
 */