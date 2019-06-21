package com.tencent.mm.plugin.readerapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.sdk.platformtools.bo;

final class g$4
  implements Runnable
{
  g$4(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76767);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(76767);
    while (true)
    {
      return;
      bo.o(c.XW(), "ReaderApp_", 604800000L);
      AppMethodBeat.o(76767);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(76768);
    String str = super.toString() + "|onAccountPostReset";
    AppMethodBeat.o(76768);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.c.g.4
 * JD-Core Version:    0.6.2
 */