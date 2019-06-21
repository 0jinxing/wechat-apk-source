package com.tencent.mm.plugin.priority.b.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.priority.b.b;
import com.tencent.mm.protocal.protobuf.gi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteStatement;

public final class c
{
  public SQLiteStatement pgA;
  public SQLiteStatement pgB;
  public SQLiteStatement pgC;
  public SQLiteStatement pgD;
  public SQLiteStatement pgE;
  public SQLiteStatement pgF;
  private b pga;

  public c(b paramb)
  {
    AppMethodBeat.i(54913);
    this.pga = paramb;
    if (this.pga.R(1L, 0L) != 1L)
    {
      if (this.pga.MT("C2CMsgAutoDownloadRes"))
        this.pga.UG("C2CMsgAutoDownloadRes");
      this.pga.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (msgid INTEGER PRIMARY KEY, fromuser TEXT, realuser TEXT, restype INTEGER, createtime INTEGER, reason INTEGER, status INTEGER, downloadtime INTEGER, msgsvrid LONG, imgsize INTEGER, opentime INTEGER, priority FLOAT, prioritytype INTEGER);", new Object[] { "C2CMsgAutoDownloadRes" }));
      this.pga.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s ON %s(priority, createtime);", new Object[] { "C2CMsgAutoDownloadRes_Priority_CreateTime", "C2CMsgAutoDownloadRes" }));
      this.pga.S(1L, 1L);
    }
    while (true)
    {
      this.pgA = this.pga.compileStatement(String.format("INSERT OR IGNORE INTO %s (msgid, fromuser, realuser, restype, createtime, reason, status, downloadtime, msgsvrid, imgsize, opentime, priority, prioritytype) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);", new Object[] { "C2CMsgAutoDownloadRes" }));
      this.pgB = this.pga.compileStatement(String.format("DELETE FROM %s WHERE msgid = ?", new Object[] { "C2CMsgAutoDownloadRes" }));
      this.pgC = this.pga.compileStatement(String.format("UPDATE %s SET status = ? WHERE msgid = ?", new Object[] { "C2CMsgAutoDownloadRes" }));
      this.pgD = this.pga.compileStatement(String.format("UPDATE %s SET reason = reason | ?, status = ? WHERE msgid = ?", new Object[] { "C2CMsgAutoDownloadRes" }));
      this.pgE = this.pga.compileStatement(String.format("UPDATE %s SET downloadtime = ?, status = ?, imgsize = ? WHERE msgid = ? AND downloadtime = 0", new Object[] { "C2CMsgAutoDownloadRes" }));
      this.pgF = this.pga.compileStatement(String.format("UPDATE %s SET opentime = ? WHERE msgid = ? AND opentime = 0", new Object[] { "C2CMsgAutoDownloadRes" }));
      AppMethodBeat.o(54913);
      return;
      ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResStorage", "Exist Table %s Count %d", new Object[] { "C2CMsgAutoDownloadRes", Integer.valueOf(this.pga.UF("C2CMsgAutoDownloadRes")) });
    }
  }

  private static gi m(Cursor paramCursor)
  {
    AppMethodBeat.i(54922);
    gi localgi = new gi();
    localgi.vIs = paramCursor.getLong(0);
    localgi.ptA = paramCursor.getString(1);
    localgi.vIt = paramCursor.getString(2);
    localgi.vIu = paramCursor.getInt(3);
    localgi.vIv = paramCursor.getLong(4);
    localgi.vIw = paramCursor.getInt(5);
    localgi.jBT = paramCursor.getInt(6);
    localgi.vIx = paramCursor.getLong(7);
    localgi.vIy = paramCursor.getLong(8);
    localgi.vIz = paramCursor.getInt(9);
    localgi.vIA = paramCursor.getLong(10);
    localgi.vIB = paramCursor.getFloat(11);
    localgi.vIC = paramCursor.getInt(12);
    AppMethodBeat.o(54922);
    return localgi;
  }

  public final gi aQ(float paramFloat)
  {
    AppMethodBeat.i(54918);
    long l = System.currentTimeMillis();
    Object localObject1 = String.format("SELECT * FROM %s WHERE status = %d AND priority >= ? AND createtime > ? ORDER BY priority DESC, createtime DESC LIMIT 1;", new Object[] { "C2CMsgAutoDownloadRes", Integer.valueOf(1) });
    Cursor localCursor = this.pga.rawQuery((String)localObject1, new String[] { String.valueOf(paramFloat), String.valueOf(l - 432000000L) });
    try
    {
      if (localCursor.moveToNext())
      {
        localObject1 = m(localCursor);
        return localObject1;
      }
      localCursor.close();
      localObject1 = null;
      AppMethodBeat.o(54918);
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(54918);
    }
  }

  public final gi aR(float paramFloat)
  {
    AppMethodBeat.i(54919);
    long l = System.currentTimeMillis();
    Object localObject1 = String.format("SELECT * FROM %s WHERE status = %d AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", new Object[] { "C2CMsgAutoDownloadRes", Integer.valueOf(1) });
    Cursor localCursor = this.pga.rawQuery((String)localObject1, new String[] { String.valueOf(paramFloat), String.valueOf(l - 432000000L) });
    try
    {
      if (localCursor.moveToNext())
      {
        localObject1 = m(localCursor);
        return localObject1;
      }
      localCursor.close();
      localObject1 = null;
      AppMethodBeat.o(54919);
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(54919);
    }
  }

  public final gi bZA()
  {
    AppMethodBeat.i(54920);
    long l = System.currentTimeMillis();
    Object localObject1 = String.format("SELECT * FROM %s WHERE status = %d AND (reason & %d) > 0 AND createtime > ? ORDER BY createtime DESC LIMIT 1;", new Object[] { "C2CMsgAutoDownloadRes", Integer.valueOf(1), Integer.valueOf(128) });
    Cursor localCursor = this.pga.rawQuery((String)localObject1, new String[] { String.valueOf(l - 432000000L) });
    try
    {
      if (localCursor.moveToNext())
      {
        localObject1 = m(localCursor);
        return localObject1;
      }
      localCursor.close();
      localObject1 = null;
      AppMethodBeat.o(54920);
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(54920);
    }
  }

  public final gi h(String paramString, float paramFloat)
  {
    AppMethodBeat.i(54921);
    long l = System.currentTimeMillis();
    Object localObject = String.format("SELECT * FROM %s WHERE status = %d AND fromuser = ? AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", new Object[] { "C2CMsgAutoDownloadRes", Integer.valueOf(1) });
    localObject = this.pga.rawQuery((String)localObject, new String[] { String.valueOf(paramString), String.valueOf(paramFloat), String.valueOf(l - 432000000L) });
    try
    {
      if (((Cursor)localObject).moveToNext())
      {
        paramString = m((Cursor)localObject);
        return paramString;
      }
      ((Cursor)localObject).close();
      paramString = null;
      AppMethodBeat.o(54921);
    }
    finally
    {
      ((Cursor)localObject).close();
      AppMethodBeat.o(54921);
    }
  }

  public final boolean jv(long paramLong)
  {
    AppMethodBeat.i(54916);
    String str = String.format("SELECT 1 FROM %s WHERE msgid = %d", new Object[] { "C2CMsgAutoDownloadRes", Long.valueOf(paramLong) });
    Cursor localCursor = this.pga.rawQuery(str, null);
    try
    {
      boolean bool = localCursor.moveToNext();
      return bool;
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(54916);
    }
  }

  public final gi jw(long paramLong)
  {
    gi localgi = null;
    AppMethodBeat.i(54917);
    Object localObject2 = String.format("SELECT * FROM %s WHERE msgid = %d;", new Object[] { "C2CMsgAutoDownloadRes", Long.valueOf(paramLong) });
    localObject2 = this.pga.rawQuery((String)localObject2, null);
    try
    {
      if (((Cursor)localObject2).moveToNext())
      {
        localgi = m((Cursor)localObject2);
        return localgi;
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(54917);
    }
    finally
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(54917);
    }
  }

  public final void m(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54915);
    this.pgD.bindLong(1, paramInt1);
    this.pgD.bindLong(2, paramInt2);
    this.pgD.bindLong(3, paramLong);
    ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResStorage", "updateStatusAndReason %d res %d %d %d", new Object[] { Integer.valueOf(this.pgD.executeUpdateDelete()), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(54915);
  }

  public final void z(long paramLong, int paramInt)
  {
    AppMethodBeat.i(54914);
    this.pgC.bindLong(1, paramInt);
    this.pgC.bindLong(2, paramLong);
    ab.i("MicroMsg.Priority.C2CMsgAutoDownloadResStorage", "updateStatus %d res %d %d", new Object[] { Integer.valueOf(this.pgC.executeUpdateDelete()), Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    AppMethodBeat.o(54914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.a.c
 * JD-Core Version:    0.6.2
 */