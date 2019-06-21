package com.tencent.mm.plugin.appbrand.game.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends com.tencent.mm.plugin.fts.a.a
{
  public final void Po()
  {
    AppMethodBeat.i(130063);
    if (Pp())
      K(-108L, 1L);
    AppMethodBeat.o(130063);
  }

  public final boolean Pp()
  {
    boolean bool = true;
    AppMethodBeat.i(130064);
    if (!ei(-108, 1))
      AppMethodBeat.o(130064);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(130064);
    }
  }

  public final String getName()
  {
    return "FTS5MiniGameStorage";
  }

  public final int getPriority()
  {
    return 8;
  }

  public final String getTableName()
  {
    return "MiniGame";
  }

  public final int getType()
  {
    return 8;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.a
 * JD-Core Version:    0.6.2
 */