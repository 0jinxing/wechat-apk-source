package com.tencent.mm.w;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.h;

public final class a extends com.tencent.mm.plugin.fts.a.a
{
  public final void Po()
  {
    AppMethodBeat.i(124472);
    if (Pp())
      this.mBT.K(-107L, 1L);
    AppMethodBeat.o(124472);
  }

  public final boolean Pp()
  {
    boolean bool = true;
    AppMethodBeat.i(124473);
    if (!ei(-107, 1))
      AppMethodBeat.o(124473);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(124473);
    }
  }

  public final String getName()
  {
    return "FTS5FriendStorage";
  }

  public final int getPriority()
  {
    return 1280;
  }

  public final String getTableName()
  {
    return "Friend";
  }

  public final int getType()
  {
    return 1280;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.a
 * JD-Core Version:    0.6.2
 */