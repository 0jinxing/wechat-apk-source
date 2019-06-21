package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

public final class p
{
  private static boolean jEw = false;

  public static void cR(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(18276);
      if (jEw)
        AppMethodBeat.o(18276);
      while (true)
      {
        return;
        jEw = true;
        b localb = g.RO();
        p.1 local1 = new com/tencent/mm/plugin/bbom/p$1;
        local1.<init>(paramContext);
        localb.a(local1);
        AppMethodBeat.o(18276);
      }
    }
    finally
    {
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.p
 * JD-Core Version:    0.6.2
 */