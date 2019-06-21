package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.wcdb.database.SQLiteStatement;

public final class d$a extends a
{
  public String mGM;

  public d$a(d paramd)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136768);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.mGM);
    ((StringBuffer)localObject).append("​");
    ((StringBuffer)localObject).append(com.tencent.mm.plugin.fts.a.d.aL(this.mGM, false));
    ((StringBuffer)localObject).append("​");
    ((StringBuffer)localObject).append(com.tencent.mm.plugin.fts.a.d.aL(this.mGM, true));
    com.tencent.mm.plugin.fts.c.d locald = this.mGN.mGL;
    String str1 = this.mGM;
    String str2 = ((StringBuffer)localObject).toString();
    localObject = locald.mBT.rawQuery(String.format("SELECT docid FROM %s WHERE history = ?", new Object[] { "FTS5MetaSOSHistory" }), new String[] { str1 });
    long l = -1L;
    if (((Cursor)localObject).moveToNext())
      l = ((Cursor)localObject).getLong(0);
    ((Cursor)localObject).close();
    if (l >= 0L)
    {
      locald.mHl.bindLong(1, System.currentTimeMillis());
      locald.mHl.bindLong(2, l);
      locald.mHl.execute();
    }
    while (true)
    {
      AppMethodBeat.o(136768);
      return true;
      if (!locald.mBT.inTransaction())
        locald.mBT.beginTransaction();
      locald.mBU.bindString(1, str2);
      locald.mBU.execute();
      locald.mBV.bindString(1, str1);
      locald.mBV.bindLong(2, System.currentTimeMillis());
      locald.mBV.execute();
      if (locald.mBT.inTransaction())
        locald.mBT.commit();
    }
  }

  public final String getName()
  {
    return "AddSOSHistoryTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.d.a
 * JD-Core Version:    0.6.2
 */