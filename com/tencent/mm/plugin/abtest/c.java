package com.tencent.mm.plugin.abtest;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.q;

public final class c extends q
{
  private static c gpO;

  private c()
  {
    super(com.tencent.mm.model.c.c.class);
  }

  public static c aoN()
  {
    try
    {
      AppMethodBeat.i(118192);
      if (gpO == null)
      {
        localc = new com/tencent/mm/plugin/abtest/c;
        localc.<init>();
        gpO = localc;
      }
      c localc = gpO;
      AppMethodBeat.o(118192);
      return localc;
    }
    finally
    {
    }
  }

  public final void lM(String paramString)
  {
    AppMethodBeat.i(118193);
    super.lM(paramString);
    AppMethodBeat.o(118193);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.abtest.c
 * JD-Core Version:    0.6.2
 */