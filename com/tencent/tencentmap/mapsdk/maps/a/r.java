package com.tencent.tencentmap.mapsdk.maps.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.e;
import java.io.File;

public final class r extends SQLiteOpenHelper
{
  public static Object a;
  private static SQLiteDatabase c;
  private Context b;

  static
  {
    AppMethodBeat.i(100541);
    a = new Object();
    c = null;
    AppMethodBeat.o(100541);
  }

  private r(Context paramContext)
  {
    super(paramContext, "beacon_tmap_db", null, 22);
    this.b = paramContext;
  }

  public static r a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(100535);
      r localr = new com/tencent/tencentmap/mapsdk/maps/a/r;
      localr.<init>(paramContext);
      AppMethodBeat.o(100535);
      return localr;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  // ERROR //
  private boolean a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 48
    //   4: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 50	java/util/ArrayList
    //   10: astore_2
    //   11: aload_2
    //   12: invokespecial 51	java/util/ArrayList:<init>	()V
    //   15: aload_1
    //   16: ldc 53
    //   18: iconst_1
    //   19: anewarray 55	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc 57
    //   26: aastore
    //   27: ldc 59
    //   29: aconst_null
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: invokevirtual 65	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore_3
    //   37: aload_3
    //   38: ifnull +75 -> 113
    //   41: aload_3
    //   42: astore 4
    //   44: aload_3
    //   45: invokeinterface 71 1 0
    //   50: ifeq +63 -> 113
    //   53: aload_3
    //   54: astore 4
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokeinterface 75 2 0
    //   64: invokeinterface 81 2 0
    //   69: pop
    //   70: goto -29 -> 41
    //   73: astore_1
    //   74: aload_3
    //   75: astore 4
    //   77: aload_1
    //   78: invokestatic 86	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   81: aload_3
    //   82: ifnull +18 -> 100
    //   85: aload_3
    //   86: invokeinterface 89 1 0
    //   91: ifne +9 -> 100
    //   94: aload_3
    //   95: invokeinterface 92 1 0
    //   100: ldc 48
    //   102: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: iconst_0
    //   106: istore 5
    //   108: aload_0
    //   109: monitorexit
    //   110: iload 5
    //   112: ireturn
    //   113: aload_3
    //   114: astore 4
    //   116: aload_2
    //   117: invokeinterface 96 1 0
    //   122: ifle +144 -> 266
    //   125: aload_3
    //   126: astore 4
    //   128: aload_2
    //   129: invokeinterface 100 1 0
    //   134: astore_2
    //   135: aload_3
    //   136: astore 4
    //   138: aload_2
    //   139: invokeinterface 105 1 0
    //   144: ifeq +122 -> 266
    //   147: aload_3
    //   148: astore 4
    //   150: aload_2
    //   151: invokeinterface 109 1 0
    //   156: checkcast 55	java/lang/String
    //   159: astore 6
    //   161: aload_3
    //   162: astore 4
    //   164: aload 6
    //   166: ldc 111
    //   168: invokevirtual 114	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   171: ifne -36 -> 135
    //   174: aload_3
    //   175: astore 4
    //   177: aload 6
    //   179: ldc 116
    //   181: invokevirtual 114	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   184: ifne -49 -> 135
    //   187: aload_3
    //   188: astore 4
    //   190: aload_1
    //   191: getstatic 122	java/util/Locale:US	Ljava/util/Locale;
    //   194: ldc 124
    //   196: iconst_1
    //   197: anewarray 21	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: aload 6
    //   204: aastore
    //   205: invokestatic 128	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   208: invokevirtual 132	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   211: aload_3
    //   212: astore 4
    //   214: ldc 134
    //   216: iconst_1
    //   217: anewarray 21	java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload 6
    //   224: aastore
    //   225: invokestatic 138	com/tencent/tencentmap/mapsdk/maps/a/ag:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   228: goto -93 -> 135
    //   231: astore_1
    //   232: aload 4
    //   234: ifnull +20 -> 254
    //   237: aload 4
    //   239: invokeinterface 89 1 0
    //   244: ifne +10 -> 254
    //   247: aload 4
    //   249: invokeinterface 92 1 0
    //   254: ldc 48
    //   256: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   259: aload_1
    //   260: athrow
    //   261: astore_1
    //   262: aload_0
    //   263: monitorexit
    //   264: aload_1
    //   265: athrow
    //   266: aload_3
    //   267: ifnull +18 -> 285
    //   270: aload_3
    //   271: invokeinterface 89 1 0
    //   276: ifne +9 -> 285
    //   279: aload_3
    //   280: invokeinterface 92 1 0
    //   285: ldc 48
    //   287: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: iconst_1
    //   291: istore 5
    //   293: goto -185 -> 108
    //   296: astore_1
    //   297: aconst_null
    //   298: astore 4
    //   300: goto -68 -> 232
    //   303: astore_1
    //   304: aconst_null
    //   305: astore_3
    //   306: goto -232 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   44	53	73	java/lang/Throwable
    //   56	70	73	java/lang/Throwable
    //   116	125	73	java/lang/Throwable
    //   128	135	73	java/lang/Throwable
    //   138	147	73	java/lang/Throwable
    //   150	161	73	java/lang/Throwable
    //   164	174	73	java/lang/Throwable
    //   177	187	73	java/lang/Throwable
    //   190	211	73	java/lang/Throwable
    //   214	228	73	java/lang/Throwable
    //   44	53	231	finally
    //   56	70	231	finally
    //   77	81	231	finally
    //   116	125	231	finally
    //   128	135	231	finally
    //   138	147	231	finally
    //   150	161	231	finally
    //   164	174	231	finally
    //   177	187	231	finally
    //   190	211	231	finally
    //   214	228	231	finally
    //   2	7	261	finally
    //   85	100	261	finally
    //   100	105	261	finally
    //   237	254	261	finally
    //   254	261	261	finally
    //   270	285	261	finally
    //   285	290	261	finally
    //   7	37	296	finally
    //   7	37	303	java/lang/Throwable
  }

  public final SQLiteDatabase getWritableDatabase()
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(100540);
      while (true)
      {
        SQLiteDatabase localSQLiteDatabase1 = c;
        if ((localSQLiteDatabase1 != null) || (i >= 5))
          break;
        i++;
        try
        {
          c = super.getWritableDatabase();
        }
        catch (Exception localException)
        {
          ag.c("getWritableDatabase error count %d", new Object[] { Integer.valueOf(i) });
          if (i == 5)
            ag.d("error get DB failed", new Object[0]);
          try
          {
            Thread.sleep(200L);
          }
          catch (InterruptedException localInterruptedException)
          {
            ag.a(localInterruptedException);
          }
        }
      }
    }
    finally
    {
    }
    SQLiteDatabase localSQLiteDatabase2 = c;
    AppMethodBeat.o(100540);
    return localSQLiteDatabase2;
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(100536);
      if ((paramSQLiteDatabase != null) && (q.a != null))
      {
        String[][] arrayOfString = q.a;
        int j = arrayOfString.length;
        while (i < j)
        {
          String[] arrayOfString1 = arrayOfString[i];
          ag.g("table:%s", new Object[] { arrayOfString1[0] });
          paramSQLiteDatabase.execSQL(arrayOfString1[1]);
          i++;
        }
      }
      AppMethodBeat.o(100536);
      return;
    }
    finally
    {
    }
    throw paramSQLiteDatabase;
  }

  @TargetApi(11)
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(100538);
      e.a(this.b);
      if (Integer.parseInt(e.c()) >= 11)
      {
        ag.g("downgrade a db  [%s] from v %d to  v%d , deleted all tables!", new Object[] { "beacon_tmap_db", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (a(paramSQLiteDatabase))
        {
          ag.g("drop all success recreate!", new Object[0]);
          onCreate(paramSQLiteDatabase);
          AppMethodBeat.o(100538);
        }
      }
      while (true)
      {
        return;
        ag.d("drop all fail try deleted file,may next time will success!", new Object[0]);
        paramSQLiteDatabase = this.b.getDatabasePath("beacon_tmap_db");
        if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.canWrite()))
          paramSQLiteDatabase.delete();
        AppMethodBeat.o(100538);
      }
    }
    finally
    {
    }
    throw paramSQLiteDatabase;
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(100537);
      ag.g("upgrade a db  [%s] from v %d to v %d , deleted all tables!", new Object[] { "beacon_tmap_db", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (a(paramSQLiteDatabase))
      {
        ag.g("drop all success recreate!", new Object[0]);
        onCreate(paramSQLiteDatabase);
        AppMethodBeat.o(100537);
      }
      while (true)
      {
        return;
        ag.d("drop all fail try deleted file,may next time will success!", new Object[0]);
        paramSQLiteDatabase = this.b.getDatabasePath("beacon_tmap_db");
        if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.canWrite()))
          paramSQLiteDatabase.delete();
        AppMethodBeat.o(100537);
      }
    }
    finally
    {
    }
    throw paramSQLiteDatabase;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.r
 * JD-Core Version:    0.6.2
 */