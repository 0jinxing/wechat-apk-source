package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.h;

public final class d$b extends a
{
  public d$b(d paramd)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136769);
    this.mGN.mGL.mBT.execSQL(String.format("DELETE FROM %s ;", new Object[] { "FTS5MetaSOSHistory" }));
    AppMethodBeat.o(136769);
    return true;
  }

  public final String getName()
  {
    return "DeleteSOSHistoryTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.d.b
 * JD-Core Version:    0.6.2
 */