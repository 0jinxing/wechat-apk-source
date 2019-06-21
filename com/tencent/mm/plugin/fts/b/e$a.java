package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.h;
import java.util.LinkedList;

final class e$a extends com.tencent.mm.plugin.fts.a.a.a
{
  int mGQ;
  int mGR;

  private e$a(e parame)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(136778);
    String str = String.format("{topHitsUpdateCount: %d deleteExpiredCount: %d}", new Object[] { Integer.valueOf(this.mGR), Integer.valueOf(this.mGQ) });
    AppMethodBeat.o(136778);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136777);
    this.mGR = this.mGS.mGO.bAJ();
    long l = System.currentTimeMillis();
    com.tencent.mm.plugin.fts.c.e locale = this.mGS.mGO;
    Object localObject = String.format("SELECT docid FROM %s WHERE timestamp < ? OR score = 0;", new Object[] { locale.bAf() });
    localObject = locale.mBT.rawQuery((String)localObject, new String[] { String.valueOf(l - 5184000000L) });
    LinkedList localLinkedList = new LinkedList();
    while (((Cursor)localObject).moveToNext())
      localLinkedList.add(Long.valueOf(((Cursor)localObject).getLong(0)));
    ((Cursor)localObject).close();
    locale.bV(localLinkedList);
    this.mGQ = localLinkedList.size();
    AppMethodBeat.o(136777);
    return true;
  }

  public final String getName()
  {
    return "BuildTopHitsIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.e.a
 * JD-Core Version:    0.6.2
 */