package com.tencent.mm.plugin.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.storage.bh;

public final class b extends q
{
  private static b nuE;

  private b()
  {
    super(o.class);
  }

  public static bh XT()
  {
    AppMethodBeat.i(79096);
    g.RN().QU();
    bh localbh = ((com.tencent.mm.plugin.m.a.a)g.K(com.tencent.mm.plugin.m.a.a.class)).XT();
    AppMethodBeat.o(79096);
    return localbh;
  }

  public static b bGD()
  {
    try
    {
      AppMethodBeat.i(79095);
      if (nuE == null)
      {
        localb = new com/tencent/mm/plugin/i/b;
        localb.<init>();
        nuE = localb;
      }
      b localb = nuE;
      AppMethodBeat.o(79095);
      return localb;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.i.b
 * JD-Core Version:    0.6.2
 */