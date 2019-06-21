package com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private static volatile b lMM;
  public a lMN;

  private b()
  {
    AppMethodBeat.i(73428);
    this.lMN = new c();
    if (com.tencent.mm.plugin.expt.hellhound.core.b.bqo())
      this.lMN.reset();
    AppMethodBeat.o(73428);
  }

  public static b bqC()
  {
    AppMethodBeat.i(73427);
    if (lMM == null);
    try
    {
      if (lMM == null)
      {
        localb = new com/tencent/mm/plugin/expt/hellhound/core/v2/activity/a/b;
        localb.<init>();
        lMM = localb;
      }
      b localb = lMM;
      AppMethodBeat.o(73427);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(73427);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b
 * JD-Core Version:    0.6.2
 */