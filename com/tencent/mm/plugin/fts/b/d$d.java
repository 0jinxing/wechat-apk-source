package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.a.m;
import java.util.ArrayList;
import java.util.List;

public final class d$d extends com.tencent.mm.plugin.fts.a.a.h
{
  public d$d(d paramd, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136771);
    super.a(paramj);
    paramj.mEy = new ArrayList();
    Object localObject1 = this.mGN.mGL;
    Object localObject2 = this.mEl.query;
    int i = this.mEl.mEt;
    if (((String)localObject2).trim().length() > 0)
    {
      localObject2 = com.tencent.mm.plugin.fts.a.d.B(new String[] { localObject2 });
      localObject2 = String.format("SELECT history FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' ORDER BY timestamp desc LIMIT ".concat(String.valueOf(i)), new Object[] { "FTS5MetaSOSHistory", "FTS5IndexSOSHistory", "FTS5MetaSOSHistory", "FTS5IndexSOSHistory", "FTS5IndexSOSHistory", localObject2 });
      localObject1 = ((com.tencent.mm.plugin.fts.c.d)localObject1).mBT.rawQuery((String)localObject2, null);
    }
    while (((Cursor)localObject1).moveToNext())
    {
      String str = ((Cursor)localObject1).getString(0);
      localObject2 = new m();
      ((l)localObject2).content = str;
      paramj.mEy.add(localObject2);
      continue;
      localObject2 = String.format("SELECT history FROM %s ORDER BY timestamp desc LIMIT ".concat(String.valueOf(i)), new Object[] { "FTS5MetaSOSHistory" });
      localObject1 = ((com.tencent.mm.plugin.fts.c.d)localObject1).mBT.rawQuery((String)localObject2, null);
    }
    ((Cursor)localObject1).close();
    AppMethodBeat.o(136771);
  }

  public final String getName()
  {
    return "SearchSOSHistoryTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.d.d
 * JD-Core Version:    0.6.2
 */