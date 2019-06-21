package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.h;

public final class d$c extends a
{
  public String mGM;

  public d$c(d paramd)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136770);
    com.tencent.mm.plugin.fts.c.d locald = this.mGN.mGL;
    String str = this.mGM;
    locald.mBT.execSQL(String.format("DELETE FROM %s WHERE history = ?;", new Object[] { "FTS5MetaSOSHistory" }), new String[] { str });
    AppMethodBeat.o(136770);
    return true;
  }

  public final String getName()
  {
    return "DeleteSOSHistoryTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.d.c
 * JD-Core Version:    0.6.2
 */