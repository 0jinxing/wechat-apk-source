package com.tencent.mm.plugin.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.c;

public final class b
  implements c
{
  private static b ops;

  public static b bOh()
  {
    try
    {
      AppMethodBeat.i(79105);
      if (ops == null)
      {
        localb = new com/tencent/mm/plugin/m/b;
        localb.<init>();
        ops = localb;
      }
      b localb = ops;
      AppMethodBeat.o(79105);
      return localb;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.m.b
 * JD-Core Version:    0.6.2
 */