package com.tencent.mm.plugin.appbrand.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a;

public final class c extends a
{
  public final void Po()
  {
    AppMethodBeat.i(129968);
    if (Pp())
      K(-104L, 2L);
    AppMethodBeat.o(129968);
  }

  public final boolean Pp()
  {
    AppMethodBeat.i(129969);
    boolean bool;
    if (!ei(-104, 2))
    {
      bool = true;
      AppMethodBeat.o(129969);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129969);
    }
  }

  public final String getName()
  {
    return "FTS5WeAppStorage";
  }

  public final int getPriority()
  {
    return 512;
  }

  public final String getTableName()
  {
    return "WeApp";
  }

  public final int getType()
  {
    return 512;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.c
 * JD-Core Version:    0.6.2
 */