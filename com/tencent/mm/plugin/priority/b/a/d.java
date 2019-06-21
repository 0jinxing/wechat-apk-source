package com.tencent.mm.plugin.priority.b.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.priority.b.b;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.protocal.protobuf.aul;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public final class d
{
  public SQLiteStatement pgG;
  public SQLiteStatement pgH;
  public SQLiteStatement pgI;
  public b pga;

  public d(b paramb)
  {
    AppMethodBeat.i(54923);
    this.pga = paramb;
    if (this.pga.R(17L, 0L) != 1L)
    {
      if (this.pga.MT("C2CMsgImgUsage"))
        this.pga.UG("C2CMsgImgUsage");
      this.pga.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, talker TEXT, date INTEGER, dayreceivecount INTEGER, dayclickcount INTEGER, weekreceivecount INTEGER, weekclickcount INTEGER, monthreceivecount INTEGER, monthclickcount INTEGER, dayclickrate FLOAT, weekclickrate FLOAT, monthclickrate FLOAT, PRIMARY KEY(chat, talker, date));", new Object[] { "C2CMsgImgUsage" }));
      this.pga.S(17L, 1L);
    }
    while (true)
    {
      this.pgG = this.pga.compileStatement(String.format("INSERT OR REPLACE INTO %s (chat, talker, date, dayreceivecount, dayclickcount, weekreceivecount, weekclickcount, monthreceivecount, monthclickcount, dayclickrate, weekclickrate, monthclickrate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)", new Object[] { "C2CMsgImgUsage" }));
      this.pgH = this.pga.compileStatement(String.format("UPDATE %s SET dayreceivecount = ?, weekreceivecount = ?, monthreceivecount = ?, dayclickrate = ?, weekclickrate = ?, monthclickrate = ? WHERE chat = ? AND talker = ? AND date = ?", new Object[] { "C2CMsgImgUsage" }));
      this.pgI = this.pga.compileStatement(String.format("UPDATE %s SET dayclickcount = ?, weekclickcount = ?, monthclickcount = ?, dayclickrate = ?, weekclickrate = ?, monthclickrate = ? WHERE chat = ? AND talker = ? AND date = ?", new Object[] { "C2CMsgImgUsage" }));
      AppMethodBeat.o(54923);
      return;
      ab.i("MicroMsg.Priority.C2CMsgImgUsageStorage", "Exist Table %s %d", new Object[] { "C2CMsgImgUsage", Integer.valueOf(this.pga.UF("C2CMsgImgUsage")) });
    }
  }

  private boolean a(String paramString1, String paramString2, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(54930);
    aul localaul = i(paramString1, paramString2, paramLong);
    Object localObject;
    if (localaul != null)
      if (paramBoolean)
      {
        localaul.wyz += 1;
        localaul.wyB += 1;
        localaul.wyD += 1;
        localaul.wyE = eX(localaul.wyz, localaul.wyy);
        localaul.wyF = eX(localaul.wyB, localaul.wyA);
        localaul.wyG = eX(localaul.wyD, localaul.wyC);
        if (!paramBoolean)
          break label444;
        localObject = this.pgI;
        ((SQLiteStatement)localObject).bindLong(1, localaul.wyz);
        ((SQLiteStatement)localObject).bindLong(2, localaul.wyB);
        ((SQLiteStatement)localObject).bindLong(3, localaul.wyD);
        label161: ((SQLiteStatement)localObject).bindDouble(4, localaul.wyE);
        ((SQLiteStatement)localObject).bindDouble(5, localaul.wyF);
        ((SQLiteStatement)localObject).bindDouble(6, localaul.wyG);
        ((SQLiteStatement)localObject).bindString(7, localaul.wyv);
        ((SQLiteStatement)localObject).bindString(8, localaul.wyw);
        ((SQLiteStatement)localObject).bindLong(9, localaul.wyx);
        int i = ((SQLiteStatement)localObject).executeUpdateDelete();
        if (!paramBoolean)
          break label489;
        localObject = "Open";
        label250: ab.i("MicroMsg.Priority.C2CMsgImgUsageStorage", "Update %s Img %s %s %d %d %d %d %d %d %d DayClickRate %.2f WeekClickRate %.2f MonthClickRate %.2f", new Object[] { localObject, paramString1, paramString2, Integer.valueOf(i), Integer.valueOf(localaul.wyz), Integer.valueOf(localaul.wyB), Integer.valueOf(localaul.wyD), Integer.valueOf(localaul.wyy), Integer.valueOf(localaul.wyA), Integer.valueOf(localaul.wyC), Float.valueOf(localaul.wyE), Float.valueOf(localaul.wyF), Float.valueOf(localaul.wyG) });
        if (i <= 0)
          break label496;
        paramBoolean = true;
        AppMethodBeat.o(54930);
      }
    while (true)
    {
      return paramBoolean;
      localaul.wyy += 1;
      localaul.wyA += 1;
      localaul.wyC += 1;
      break;
      label444: localObject = this.pgH;
      ((SQLiteStatement)localObject).bindLong(1, localaul.wyy);
      ((SQLiteStatement)localObject).bindLong(2, localaul.wyA);
      ((SQLiteStatement)localObject).bindLong(3, localaul.wyC);
      break label161;
      label489: localObject = "Receive";
      break label250;
      label496: paramBoolean = false;
      AppMethodBeat.o(54930);
      continue;
      paramBoolean = false;
      AppMethodBeat.o(54930);
    }
  }

  private void b(String paramString1, String paramString2, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(54931);
    aul localaul = new aul();
    localaul.wyv = paramString1;
    localaul.wyw = paramString2;
    localaul.wyx = paramLong;
    Object localObject = String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= %d", new Object[] { "C2CMsgImgUsage", Long.valueOf(paramLong - 2505600000L) });
    localObject = this.pga.rawQuery((String)localObject, new String[] { paramString1, paramString2 });
    if (((Cursor)localObject).moveToNext())
    {
      localaul.wyC = ((Cursor)localObject).getInt(0);
      localaul.wyD = ((Cursor)localObject).getInt(1);
    }
    ((Cursor)localObject).close();
    localObject = String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= %d", new Object[] { "C2CMsgImgUsage", Long.valueOf(paramLong - 518400000L) });
    localObject = this.pga.rawQuery((String)localObject, new String[] { paramString1, paramString2 });
    if (((Cursor)localObject).moveToNext())
    {
      localaul.wyA = ((Cursor)localObject).getInt(0);
      localaul.wyB = ((Cursor)localObject).getInt(1);
    }
    ((Cursor)localObject).close();
    if (paramBoolean)
    {
      localaul.wyz += 1;
      localaul.wyD += 1;
      localaul.wyB += 1;
    }
    while (true)
    {
      localaul.wyE = eX(localaul.wyz, localaul.wyy);
      localaul.wyF = eX(localaul.wyB, localaul.wyA);
      localaul.wyG = eX(localaul.wyD, localaul.wyC);
      this.pgG.bindString(1, localaul.wyv);
      this.pgG.bindString(2, localaul.wyw);
      this.pgG.bindLong(3, localaul.wyx);
      this.pgG.bindLong(4, localaul.wyy);
      this.pgG.bindLong(5, localaul.wyz);
      this.pgG.bindLong(6, localaul.wyA);
      this.pgG.bindLong(7, localaul.wyB);
      this.pgG.bindLong(8, localaul.wyC);
      this.pgG.bindLong(9, localaul.wyD);
      this.pgG.bindDouble(10, localaul.wyE);
      this.pgG.bindDouble(11, localaul.wyF);
      this.pgG.bindDouble(12, localaul.wyG);
      ab.i("MicroMsg.Priority.C2CMsgImgUsageStorage", "insert %d usage %s %s %s %d %d %d %d %.2f %.2f", new Object[] { Long.valueOf(this.pgG.executeInsert()), paramString1, paramString2, h.formatTime("yyyy-MM-dd", paramLong / 1000L), Integer.valueOf(localaul.wyA), Integer.valueOf(localaul.wyB), Integer.valueOf(localaul.wyC), Integer.valueOf(localaul.wyD), Float.valueOf(localaul.wyF), Float.valueOf(localaul.wyG) });
      AppMethodBeat.o(54931);
      return;
      localaul.wyy += 1;
      localaul.wyC += 1;
      localaul.wyA += 1;
    }
  }

  public static long bZB()
  {
    AppMethodBeat.i(54928);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    long l = localCalendar.getTimeInMillis();
    AppMethodBeat.o(54928);
    return l;
  }

  private static float eX(int paramInt1, int paramInt2)
  {
    float f = 1.0F;
    AppMethodBeat.i(54927);
    if ((paramInt2 == 0) && (paramInt1 > 0))
      AppMethodBeat.o(54927);
    while (true)
    {
      return f;
      if ((paramInt2 == 0) && (paramInt1 == 0))
      {
        f = 0.0F;
        AppMethodBeat.o(54927);
      }
      else
      {
        f = Math.min(paramInt1 / paramInt2, 1.0F);
        AppMethodBeat.o(54927);
      }
    }
  }

  private aul i(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(54924);
    String str = String.format("SELECT * FROM %s WHERE chat = ? AND talker = ? AND date = ?", new Object[] { "C2CMsgImgUsage" });
    paramString2 = this.pga.rawQuery(str, new String[] { paramString1, paramString2, String.valueOf(paramLong) });
    try
    {
      if (paramString2.moveToNext())
      {
        paramString1 = n(paramString2);
        return paramString1;
      }
      paramString2.close();
      paramString1 = null;
      AppMethodBeat.o(54924);
    }
    finally
    {
      paramString2.close();
      AppMethodBeat.o(54924);
    }
  }

  private float j(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(54932);
    String str = String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= %d", new Object[] { "C2CMsgImgUsage", Long.valueOf(paramLong - 518400000L) });
    paramString1 = this.pga.rawQuery(str, new String[] { paramString1, paramString2 });
    try
    {
      if (paramString1.moveToNext())
      {
        int i = paramString1.getInt(0);
        f = eX(paramString1.getInt(1), i);
        return f;
      }
      paramString1.close();
      float f = 0.0F;
      AppMethodBeat.o(54932);
    }
    finally
    {
      paramString1.close();
      AppMethodBeat.o(54932);
    }
  }

  private float k(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(54933);
    String str = String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= %d", new Object[] { "C2CMsgImgUsage", Long.valueOf(paramLong - 2505600000L) });
    paramString1 = this.pga.rawQuery(str, new String[] { paramString1, paramString2 });
    try
    {
      if (paramString1.moveToNext())
      {
        int i = paramString1.getInt(0);
        f = eX(paramString1.getInt(1), i);
        return f;
      }
      paramString1.close();
      float f = 0.0F;
      AppMethodBeat.o(54933);
    }
    finally
    {
      paramString1.close();
      AppMethodBeat.o(54933);
    }
  }

  private static aul n(Cursor paramCursor)
  {
    AppMethodBeat.i(54925);
    aul localaul = new aul();
    localaul.wyv = paramCursor.getString(0);
    localaul.wyw = paramCursor.getString(1);
    localaul.wyx = paramCursor.getLong(2);
    localaul.wyy = paramCursor.getInt(3);
    localaul.wyz = paramCursor.getInt(4);
    localaul.wyA = paramCursor.getInt(5);
    localaul.wyB = paramCursor.getInt(6);
    localaul.wyC = paramCursor.getInt(7);
    localaul.wyD = paramCursor.getInt(8);
    localaul.wyE = paramCursor.getFloat(9);
    localaul.wyF = paramCursor.getFloat(10);
    localaul.wyG = paramCursor.getFloat(11);
    AppMethodBeat.o(54925);
    return localaul;
  }

  public final List<aul> UH(String paramString)
  {
    AppMethodBeat.i(54935);
    Object localObject = String.format("SELECT *, max(monthreceivecount) FROM %s WHERE chat = ? AND talker <> '%s' GROUP BY chat, talker;", new Object[] { "C2CMsgImgUsage", "@all" });
    localObject = this.pga.rawQuery((String)localObject, new String[] { paramString });
    paramString = new ArrayList(10);
    while (((Cursor)localObject).moveToNext())
      paramString.add(n((Cursor)localObject));
    ((Cursor)localObject).close();
    Collections.sort(paramString, new d.1(this));
    AppMethodBeat.o(54935);
    return paramString;
  }

  public final void fA(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54926);
    long l = bZB();
    if (!a(paramString1, paramString2, l, false))
      b(paramString1, paramString2, l, false);
    AppMethodBeat.o(54926);
  }

  public final void fB(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54929);
    long l = bZB();
    if (!a(paramString1, paramString2, l, true))
      b(paramString1, paramString2, l, true);
    AppMethodBeat.o(54929);
  }

  public final double[] fC(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54934);
    long l = bZB();
    Object localObject = String.format("SELECT dayclickrate, weekclickrate, monthclickrate FROM %s WHERE chat = ? AND talker = ? AND date = ?", new Object[] { "C2CMsgImgUsage" });
    Cursor localCursor = this.pga.rawQuery((String)localObject, new String[] { paramString1, paramString2, String.valueOf(l) });
    localObject = new double[3];
    if (localCursor.moveToNext())
    {
      localObject[0] = localCursor.getDouble(0);
      localObject[1] = localCursor.getDouble(1);
      localObject[2] = localCursor.getDouble(2);
      localCursor.close();
    }
    while (true)
    {
      AppMethodBeat.o(54934);
      return localObject;
      localCursor.close();
      localObject[0] = 0.0D;
      localObject[1] = j(paramString1, paramString2, l);
      localObject[2] = k(paramString1, paramString2, l);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.a.d
 * JD-Core Version:    0.6.2
 */