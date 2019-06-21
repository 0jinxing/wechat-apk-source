package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dh extends SQLiteOpenHelper
{
  private static Map<String, dh> a;
  private static final Object b;

  static
  {
    AppMethodBeat.i(98716);
    a = new ConcurrentHashMap();
    b = new Object();
    AppMethodBeat.o(98716);
  }

  private dh(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, null, 2);
  }

  // ERROR //
  private int a(boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 43
    //   4: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokevirtual 47	com/tencent/tencentmap/mapsdk/maps/a/dh:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore 4
    //   13: iload_1
    //   14: ifeq +72 -> 86
    //   17: iload_2
    //   18: ifeq +68 -> 86
    //   21: aload 4
    //   23: ldc 49
    //   25: iconst_1
    //   26: anewarray 51	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: ldc 53
    //   33: aastore
    //   34: aconst_null
    //   35: aconst_null
    //   36: aconst_null
    //   37: aconst_null
    //   38: aconst_null
    //   39: invokevirtual 59	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore 4
    //   44: aload 4
    //   46: ifnull +179 -> 225
    //   49: aload 4
    //   51: invokeinterface 65 1 0
    //   56: istore 5
    //   58: iload 5
    //   60: istore 6
    //   62: aload 4
    //   64: ifnull +14 -> 78
    //   67: aload 4
    //   69: invokeinterface 68 1 0
    //   74: iload 5
    //   76: istore 6
    //   78: ldc 43
    //   80: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: iload 6
    //   85: ireturn
    //   86: iload_1
    //   87: ifeq +38 -> 125
    //   90: aload 4
    //   92: ldc 49
    //   94: iconst_1
    //   95: anewarray 51	java/lang/String
    //   98: dup
    //   99: iconst_0
    //   100: ldc 53
    //   102: aastore
    //   103: ldc 70
    //   105: iconst_1
    //   106: anewarray 51	java/lang/String
    //   109: dup
    //   110: iconst_0
    //   111: ldc 72
    //   113: aastore
    //   114: aconst_null
    //   115: aconst_null
    //   116: aconst_null
    //   117: invokevirtual 59	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   120: astore 4
    //   122: goto -78 -> 44
    //   125: aload 4
    //   127: ldc 49
    //   129: iconst_1
    //   130: anewarray 51	java/lang/String
    //   133: dup
    //   134: iconst_0
    //   135: ldc 53
    //   137: aastore
    //   138: ldc 70
    //   140: iconst_1
    //   141: anewarray 51	java/lang/String
    //   144: dup
    //   145: iconst_0
    //   146: ldc 74
    //   148: aastore
    //   149: aconst_null
    //   150: aconst_null
    //   151: aconst_null
    //   152: invokevirtual 59	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   155: astore 4
    //   157: goto -113 -> 44
    //   160: astore 4
    //   162: aconst_null
    //   163: astore 4
    //   165: aload 4
    //   167: ifnull +52 -> 219
    //   170: aload 4
    //   172: invokeinterface 68 1 0
    //   177: iconst_0
    //   178: istore 6
    //   180: goto -102 -> 78
    //   183: astore 4
    //   185: aload_3
    //   186: ifnull +9 -> 195
    //   189: aload_3
    //   190: invokeinterface 68 1 0
    //   195: ldc 43
    //   197: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aload 4
    //   202: athrow
    //   203: astore 7
    //   205: aload 4
    //   207: astore_3
    //   208: aload 7
    //   210: astore 4
    //   212: goto -27 -> 185
    //   215: astore_3
    //   216: goto -51 -> 165
    //   219: iconst_0
    //   220: istore 6
    //   222: goto -144 -> 78
    //   225: iconst_0
    //   226: istore 5
    //   228: goto -170 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	160	java/lang/Throwable
    //   21	44	160	java/lang/Throwable
    //   90	122	160	java/lang/Throwable
    //   125	157	160	java/lang/Throwable
    //   7	13	183	finally
    //   21	44	183	finally
    //   90	122	183	finally
    //   125	157	183	finally
    //   49	58	203	finally
    //   49	58	215	java/lang/Throwable
  }

  public static dh a(String paramString)
  {
    AppMethodBeat.i(98706);
    synchronized (b)
    {
      Object localObject2 = (dh)a.get(paramString);
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        if (bt.b())
        {
          localObject3 = "_test_";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("HalleyAction_");
          localObject2 = bt.c() + (String)localObject3 + bt.i() + "_" + paramString + ".db";
          localObject3 = new com/tencent/tencentmap/mapsdk/maps/a/dh;
          ((dh)localObject3).<init>(bt.a(), (String)localObject2, null, 2);
          a.put(paramString, localObject3);
        }
      }
      else
      {
        AppMethodBeat.o(98706);
        return localObject3;
      }
      localObject3 = "_";
    }
  }

  public final void a(List<Long> paramList)
  {
    AppMethodBeat.i(98715);
    if (paramList.size() <= 0)
      AppMethodBeat.o(98715);
    while (true)
    {
      return;
      SQLiteDatabase localSQLiteDatabase;
      try
      {
        localSQLiteDatabase = getWritableDatabase();
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localContentValues.put("state", "remove");
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
          localSQLiteDatabase.update("halley_action_tbl", localContentValues, "key=?", new String[] { String.valueOf(((Long)localIterator.next()).longValue()) });
      }
      catch (Exception paramList)
      {
        AppMethodBeat.o(98715);
      }
      continue;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localSQLiteDatabase.delete("halley_action_tbl", "key=?", new String[] { String.valueOf(((Long)paramList.next()).longValue()) });
      if (a(false, true) > 0)
      {
        int i = a(true, false);
        if (i > 0);
      }
      try
      {
        localSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
        try
        {
          label182: localSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
          AppMethodBeat.o(98715);
        }
        catch (SQLException paramList)
        {
          AppMethodBeat.o(98715);
          throw paramList;
        }
        AppMethodBeat.o(98715);
      }
      catch (SQLException paramList)
      {
        break label182;
      }
    }
  }

  public final boolean a(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(98712);
    if (a(true, true) > paramInt);
    while (true)
    {
      try
      {
        getWritableDatabase().delete("halley_action_tbl", null, null);
        AppMethodBeat.o(98712);
        return bool;
      }
      catch (Exception localException)
      {
        if (a(true, true) <= paramInt);
      }
      try
      {
        localSQLiteDatabase = getWritableDatabase();
      }
      catch (Throwable localThrowable)
      {
        try
        {
          SQLiteDatabase localSQLiteDatabase;
          localSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
          while (true)
          {
            try
            {
              label60: localSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
              bool = false;
              AppMethodBeat.o(98712);
            }
            catch (SQLException localSQLException1)
            {
              AppMethodBeat.o(98712);
              throw localSQLException1;
            }
            localThrowable = localThrowable;
          }
        }
        catch (SQLException localSQLException2)
        {
          break label60;
        }
      }
    }
  }

  // ERROR //
  public final long b(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 191
    //   3: lstore_2
    //   4: ldc 193
    //   6: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: invokestatic 199	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   13: ifeq +14 -> 27
    //   16: ldc 193
    //   18: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: lload_2
    //   22: lstore 4
    //   24: lload 4
    //   26: lreturn
    //   27: aload_0
    //   28: invokevirtual 47	com/tencent/tencentmap/mapsdk/maps/a/dh:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore 6
    //   33: new 137	android/content/ContentValues
    //   36: astore 7
    //   38: aload 7
    //   40: invokespecial 138	android/content/ContentValues:<init>	()V
    //   43: aload 7
    //   45: ldc 201
    //   47: aload_1
    //   48: invokevirtual 143	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: aload 7
    //   53: ldc 140
    //   55: ldc 72
    //   57: invokevirtual 143	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload 6
    //   62: ldc 49
    //   64: aconst_null
    //   65: aload 7
    //   67: invokevirtual 205	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   70: lstore 4
    //   72: ldc 193
    //   74: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: goto -53 -> 24
    //   80: astore_1
    //   81: ldc 193
    //   83: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: lload_2
    //   87: lstore 4
    //   89: goto -65 -> 24
    //   92: astore_1
    //   93: ldc 193
    //   95: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: aload_1
    //   99: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   27	72	80	java/lang/Exception
    //   27	72	92	finally
  }

  // ERROR //
  public final List<dh.a> b(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 207
    //   4: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 209	java/util/ArrayList
    //   10: dup
    //   11: invokespecial 210	java/util/ArrayList:<init>	()V
    //   14: astore_3
    //   15: aload_0
    //   16: invokevirtual 47	com/tencent/tencentmap/mapsdk/maps/a/dh:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   19: ldc 49
    //   21: aconst_null
    //   22: ldc 70
    //   24: iconst_1
    //   25: anewarray 51	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: ldc 72
    //   32: aastore
    //   33: aconst_null
    //   34: aconst_null
    //   35: aconst_null
    //   36: invokevirtual 59	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   39: astore 4
    //   41: aload 4
    //   43: astore_2
    //   44: aload_2
    //   45: ifnull +121 -> 166
    //   48: aload_2
    //   49: invokeinterface 65 1 0
    //   54: iload_1
    //   55: invokestatic 216	java/lang/Math:min	(II)I
    //   58: istore 5
    //   60: aload_2
    //   61: invokeinterface 219 1 0
    //   66: ifeq +100 -> 166
    //   69: iconst_0
    //   70: istore_1
    //   71: aload_2
    //   72: aload_2
    //   73: ldc 53
    //   75: invokeinterface 223 2 0
    //   80: invokeinterface 227 2 0
    //   85: lstore 6
    //   87: aload_2
    //   88: aload_2
    //   89: ldc 201
    //   91: invokeinterface 223 2 0
    //   96: invokeinterface 231 2 0
    //   101: astore 8
    //   103: aload_2
    //   104: aload_2
    //   105: ldc 140
    //   107: invokeinterface 223 2 0
    //   112: invokeinterface 231 2 0
    //   117: astore 9
    //   119: new 6	com/tencent/tencentmap/mapsdk/maps/a/dh$a
    //   122: astore 4
    //   124: aload 4
    //   126: lload 6
    //   128: aload 8
    //   130: aload 9
    //   132: invokespecial 234	com/tencent/tencentmap/mapsdk/maps/a/dh$a:<init>	(JLjava/lang/String;Ljava/lang/String;)V
    //   135: aload_3
    //   136: aload 4
    //   138: invokeinterface 237 2 0
    //   143: pop
    //   144: iinc 1 1
    //   147: iload_1
    //   148: iload 5
    //   150: if_icmpge +16 -> 166
    //   153: aload_2
    //   154: invokeinterface 240 1 0
    //   159: istore 10
    //   161: iload 10
    //   163: ifne -92 -> 71
    //   166: aload_2
    //   167: ifnull +9 -> 176
    //   170: aload_2
    //   171: invokeinterface 68 1 0
    //   176: ldc 207
    //   178: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: aload_3
    //   182: areturn
    //   183: astore_2
    //   184: aconst_null
    //   185: astore_2
    //   186: aload_2
    //   187: ifnull -11 -> 176
    //   190: aload_2
    //   191: invokeinterface 68 1 0
    //   196: goto -20 -> 176
    //   199: astore 4
    //   201: aload_2
    //   202: ifnull +9 -> 211
    //   205: aload_2
    //   206: invokeinterface 68 1 0
    //   211: ldc 207
    //   213: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: aload 4
    //   218: athrow
    //   219: astore 4
    //   221: goto -20 -> 201
    //   224: astore 4
    //   226: goto -40 -> 186
    //
    // Exception table:
    //   from	to	target	type
    //   15	41	183	java/lang/Throwable
    //   15	41	199	finally
    //   48	69	219	finally
    //   71	144	219	finally
    //   153	161	219	finally
    //   48	69	224	java/lang/Throwable
    //   71	144	224	java/lang/Throwable
    //   153	161	224	java/lang/Throwable
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(98707);
    try
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
      AppMethodBeat.o(98707);
      return;
    }
    catch (SQLException paramSQLiteDatabase)
    {
      AppMethodBeat.o(98707);
    }
    throw paramSQLiteDatabase;
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98709);
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
      try
      {
        label11: paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
        AppMethodBeat.o(98709);
        return;
      }
      catch (SQLException paramSQLiteDatabase)
      {
        AppMethodBeat.o(98709);
        throw paramSQLiteDatabase;
      }
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
        AppMethodBeat.o(98709);
    }
    catch (SQLException localSQLException)
    {
      break label11;
    }
  }

  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(98708);
    super.onOpen(paramSQLiteDatabase);
    try
    {
      int i = paramSQLiteDatabase.getVersion();
      if (i != 0)
        if (i < 2)
        {
          onUpgrade(paramSQLiteDatabase, i, 2);
          AppMethodBeat.o(98708);
        }
      while (true)
      {
        return;
        if (i > 2)
          onDowngrade(paramSQLiteDatabase, i, 2);
        AppMethodBeat.o(98708);
      }
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
        AppMethodBeat.o(98708);
    }
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98710);
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
      try
      {
        label12: paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
        AppMethodBeat.o(98710);
        return;
      }
      catch (SQLException paramSQLiteDatabase)
      {
        AppMethodBeat.o(98710);
        throw paramSQLiteDatabase;
      }
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
        AppMethodBeat.o(98710);
    }
    catch (SQLException localSQLException)
    {
      break label12;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dh
 * JD-Core Version:    0.6.2
 */