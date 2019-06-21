package com.tencent.mm.plugin.sport.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m extends j<com.tencent.mm.plugin.sport.a.e>
{
  public static final String[] rPO;
  private static final String[] rPP;

  static
  {
    AppMethodBeat.i(93707);
    rPO = new String[] { j.a(com.tencent.mm.plugin.sport.a.e.ccO, "SportStepItem") };
    rPP = new String[] { String.format("CREATE INDEX IF NOT EXISTS %s_date ON %s(date);", new Object[] { "SportStepItem", "SportStepItem" }), String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", new Object[] { "SportStepItem", "SportStepItem" }) };
    AppMethodBeat.o(93707);
  }

  public m()
  {
    super(g.RP().eJN, com.tencent.mm.plugin.sport.a.e.ccO, "SportStepItem", rPP);
    AppMethodBeat.i(93701);
    AppMethodBeat.o(93701);
  }

  public static List<com.tencent.mm.plugin.sport.a.e> W(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(93702);
    ArrayList localArrayList = new ArrayList();
    Object localObject = String.format("SELECT * FROM %s WHERE timestamp >= ? AND timestamp <= ?;", new Object[] { "SportStepItem" });
    Cursor localCursor = g.RP().eJN.a((String)localObject, new String[] { String.valueOf(paramLong1), String.valueOf(paramLong2) }, 0);
    while (localCursor.moveToNext())
    {
      localObject = new com.tencent.mm.plugin.sport.a.e();
      ((com.tencent.mm.plugin.sport.a.e)localObject).d(localCursor);
      localArrayList.add(localObject);
    }
    localCursor.close();
    AppMethodBeat.o(93702);
    return localArrayList;
  }

  public static void X(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(93705);
    String str = String.format("DELETE FROM %s WHERE timestamp >= %d AND timestamp <= endTime", new Object[] { "SportStepItem", Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    g.RP().eJN.hY(null, str);
    AppMethodBeat.o(93705);
  }

  public static com.tencent.mm.plugin.sport.a.e cwb()
  {
    com.tencent.mm.plugin.sport.a.e locale = null;
    AppMethodBeat.i(93703);
    Object localObject2 = String.format("SELECT * FROM %s ORDER BY timestamp desc LIMIT 1;", new Object[] { "SportStepItem" });
    localObject2 = g.RP().eJN.a((String)localObject2, null, 0);
    try
    {
      if (((Cursor)localObject2).moveToNext())
      {
        locale = new com/tencent/mm/plugin/sport/a/e;
        locale.<init>();
        locale.d((Cursor)localObject2);
        return locale;
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(93703);
    }
    finally
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(93703);
    }
  }

  public static void cwc()
  {
    AppMethodBeat.i(93704);
    String str = String.format("DELETE FROM %s;", new Object[] { "SportStepItem" });
    g.RP().eJN.hY(null, str);
    AppMethodBeat.o(93704);
  }

  public static void dC(List<com.tencent.mm.plugin.sport.a.e> paramList)
  {
    AppMethodBeat.i(93706);
    SQLiteDatabase localSQLiteDatabase = g.RP().eJN.dvx();
    if (!localSQLiteDatabase.inTransaction())
      localSQLiteDatabase.beginTransaction();
    SQLiteStatement localSQLiteStatement = localSQLiteDatabase.compileStatement(String.format("INSERT INTO %s (date, step, timestamp) VALUES (?,?,?)", new Object[] { "SportStepItem" }));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (com.tencent.mm.plugin.sport.a.e)localIterator.next();
      localSQLiteStatement.bindString(1, paramList.field_date);
      localSQLiteStatement.bindLong(2, paramList.field_step);
      localSQLiteStatement.bindLong(3, paramList.field_timestamp);
      localSQLiteStatement.execute();
    }
    if (localSQLiteDatabase.inTransaction())
    {
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
    }
    AppMethodBeat.o(93706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.m
 * JD-Core Version:    0.6.2
 */