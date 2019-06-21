package com.tencent.mm.plugin;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends com.tencent.mm.model.q
{
  private static a gkD;

  private a()
  {
    super(com.tencent.mm.modelstat.q.class);
  }

  public static a aob()
  {
    try
    {
      AppMethodBeat.i(79046);
      if (gkD == null)
      {
        locala = new com/tencent/mm/plugin/a;
        locala.<init>();
        gkD = locala;
      }
      a locala = gkD;
      AppMethodBeat.o(79046);
      return locala;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a
 * JD-Core Version:    0.6.2
 */