package com.tencent.mm.plugin.priority.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteStatement;
import java.io.File;

public final class b
{
  public SQLiteDatabase pgl;
  public SQLiteStatement pgm;
  public SQLiteStatement pgn;
  public SQLiteStatement pgo;

  public b(String paramString)
  {
    AppMethodBeat.i(54888);
    if (this.pgl != null)
    {
      ab.w("MicroMsg.Priority.PriorityDB", "before initDB, pre DB is not close, why?");
      this.pgl.close();
    }
    String str = new File(paramString, "MicroMsgPriority.db").getAbsolutePath();
    long l = System.currentTimeMillis();
    paramString = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    this.pgl = SQLiteDatabase.openOrCreateDatabase(str, com.tencent.mm.a.g.x((a.QG() + r.Yz() + q.LK()).getBytes()).substring(0, 7).getBytes(), null, null);
    this.pgl.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", new Object[] { "PriorityConfig" }));
    this.pgm = this.pgl.compileStatement(String.format("SELECT version FROM %s WHERE type=?;", new Object[] { "PriorityConfig" }));
    this.pgn = this.pgl.compileStatement(String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", new Object[] { "PriorityConfig" }));
    this.pgo = this.pgl.compileStatement(String.format("DELETE FROM %s WHERE type=?", new Object[] { "PriorityConfig" }));
    ab.i("MicroMsg.Priority.PriorityDB", "initDB index params %d %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), bo.b(e.asZ(str), 100.0D) });
    AppMethodBeat.o(54888);
  }

  public final boolean MT(String paramString)
  {
    AppMethodBeat.i(54894);
    paramString = this.pgl.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new String[] { paramString });
    boolean bool = paramString.moveToNext();
    paramString.close();
    AppMethodBeat.o(54894);
    return bool;
  }

  public final long R(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(54889);
    this.pgm.bindLong(1, paramLong1);
    try
    {
      paramLong1 = this.pgm.simpleQueryForLong();
      paramLong2 = paramLong1;
      AppMethodBeat.o(54889);
      return paramLong2;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      while (true)
        AppMethodBeat.o(54889);
    }
  }

  public final void S(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(54890);
    this.pgn.bindLong(1, paramLong1);
    this.pgn.bindLong(2, paramLong2);
    this.pgn.execute();
    AppMethodBeat.o(54890);
  }

  public final int UF(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(54893);
    paramString = this.pgl.rawQuery(String.format("SELECT count(*) FROM %s;", new Object[] { paramString }), null);
    try
    {
      if (paramString.moveToNext())
      {
        i = paramString.getInt(0);
        return i;
      }
      paramString.close();
      AppMethodBeat.o(54893);
    }
    finally
    {
      paramString.close();
      AppMethodBeat.o(54893);
    }
  }

  public final void UG(String paramString)
  {
    AppMethodBeat.i(54895);
    ab.v("MicroMsg.Priority.PriorityDB", "dropTable: %s", new Object[] { paramString });
    this.pgl.execSQL(String.format("DROP TABLE %s", new Object[] { paramString }));
    AppMethodBeat.o(54895);
  }

  public final SQLiteStatement compileStatement(String paramString)
  {
    AppMethodBeat.i(54892);
    ab.v("MicroMsg.Priority.PriorityDB", "compileStatement sql = %s", new Object[] { paramString });
    paramString = this.pgl.compileStatement(paramString);
    AppMethodBeat.o(54892);
    return paramString;
  }

  public final void execSQL(String paramString)
  {
    AppMethodBeat.i(54896);
    ab.v("MicroMsg.Priority.PriorityDB", "execSQL: execute sql = %s", new Object[] { paramString });
    this.pgl.execSQL(paramString);
    AppMethodBeat.o(54896);
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(54891);
    ab.v("MicroMsg.Priority.PriorityDB", "rawQuery: execute sql = %s", new Object[] { paramString });
    paramString = this.pgl.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, paramString, paramArrayOfString, null);
    AppMethodBeat.o(54891);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.b
 * JD-Core Version:    0.6.2
 */