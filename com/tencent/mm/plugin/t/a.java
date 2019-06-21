package com.tencent.mm.plugin.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.q;
import com.tencent.mm.modelcontrol.c;

public final class a extends q
{
  private static a pfY;

  private a()
  {
    super(c.class);
  }

  public static a bZt()
  {
    try
    {
      AppMethodBeat.i(79145);
      if (pfY == null)
      {
        locala = new com/tencent/mm/plugin/t/a;
        locala.<init>();
        pfY = locala;
      }
      a locala = pfY;
      AppMethodBeat.o(79145);
      return locala;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.t.a
 * JD-Core Version:    0.6.2
 */