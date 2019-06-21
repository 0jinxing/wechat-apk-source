package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class dr$a extends SQLiteOpenHelper
{
  public dr$a(dr paramdr, Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, null, paramInt);
  }

  // ERROR //
  private void a()
  {
    // Byte code:
    //   0: ldc 20
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 28	java/util/ArrayList
    //   8: astore_1
    //   9: aload_1
    //   10: invokespecial 30	java/util/ArrayList:<init>	()V
    //   13: ldc 32
    //   15: iconst_1
    //   16: bipush 100
    //   18: bipush 8
    //   20: invokestatic 37	com/tencent/tencentmap/mapsdk/maps/a/ce$a:a	(Ljava/lang/String;III)I
    //   23: istore_2
    //   24: aload_0
    //   25: invokevirtual 41	com/tencent/tencentmap/mapsdk/maps/a/dr$a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   28: astore_3
    //   29: aload_3
    //   30: ldc 43
    //   32: iconst_1
    //   33: anewarray 45	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: ldc 47
    //   40: aastore
    //   41: aconst_null
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: ldc 49
    //   47: invokevirtual 55	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   50: astore 4
    //   52: aload 4
    //   54: ifnull +91 -> 145
    //   57: aload 4
    //   59: invokeinterface 61 1 0
    //   64: iload_2
    //   65: isub
    //   66: istore_2
    //   67: iload_2
    //   68: ifle +77 -> 145
    //   71: aload 4
    //   73: invokeinterface 65 1 0
    //   78: ifeq +67 -> 145
    //   81: aload 4
    //   83: aload 4
    //   85: ldc 47
    //   87: invokeinterface 69 2 0
    //   92: invokeinterface 73 2 0
    //   97: astore 5
    //   99: aload 5
    //   101: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   104: ifne +23 -> 127
    //   107: aload_1
    //   108: aload 5
    //   110: invokeinterface 85 2 0
    //   115: ifne +12 -> 127
    //   118: aload_1
    //   119: aload 5
    //   121: invokeinterface 88 2 0
    //   126: pop
    //   127: aload 4
    //   129: invokeinterface 91 1 0
    //   134: istore 6
    //   136: iload 6
    //   138: ifeq +7 -> 145
    //   141: iload_2
    //   142: ifgt +114 -> 256
    //   145: aload 4
    //   147: ifnull +10 -> 157
    //   150: aload 4
    //   152: invokeinterface 94 1 0
    //   157: aload_1
    //   158: invokeinterface 97 1 0
    //   163: ifle +81 -> 244
    //   166: aload_1
    //   167: invokeinterface 101 1 0
    //   172: astore 4
    //   174: aload 4
    //   176: invokeinterface 106 1 0
    //   181: ifeq +63 -> 244
    //   184: aload_3
    //   185: ldc 43
    //   187: ldc 108
    //   189: iconst_1
    //   190: anewarray 45	java/lang/String
    //   193: dup
    //   194: iconst_0
    //   195: aload 4
    //   197: invokeinterface 112 1 0
    //   202: checkcast 45	java/lang/String
    //   205: aastore
    //   206: invokevirtual 116	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   209: pop
    //   210: goto -36 -> 174
    //   213: astore 4
    //   215: ldc 20
    //   217: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: return
    //   221: astore_3
    //   222: aconst_null
    //   223: astore 4
    //   225: aload 4
    //   227: ifnull +10 -> 237
    //   230: aload 4
    //   232: invokeinterface 94 1 0
    //   237: ldc 20
    //   239: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: aload_3
    //   243: athrow
    //   244: ldc 20
    //   246: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: goto -29 -> 220
    //   252: astore_3
    //   253: goto -28 -> 225
    //   256: iinc 2 255
    //   259: goto -178 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   5	29	213	java/lang/Exception
    //   150	157	213	java/lang/Exception
    //   157	174	213	java/lang/Exception
    //   174	210	213	java/lang/Exception
    //   230	237	213	java/lang/Exception
    //   237	244	213	java/lang/Exception
    //   29	52	221	finally
    //   57	67	252	finally
    //   71	81	252	finally
    //   81	127	252	finally
    //   127	136	252	finally
  }

  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(98732);
      try
      {
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        int i = localSQLiteDatabase.delete("halley_schedule_tbl", "apn=?", new String[] { paramString });
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localContentValues.put("apn", paramString);
        localContentValues.put("result", paramArrayOfByte);
        localContentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        if ((-1L != localSQLiteDatabase.insert("halley_schedule_tbl", null, localContentValues)) && (i <= 0))
          a();
        AppMethodBeat.o(98732);
        return;
      }
      catch (Throwable paramString)
      {
        while (true)
          AppMethodBeat.o(98732);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  // ERROR //
  public final byte[] a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 161
    //   4: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokevirtual 164	com/tencent/tencentmap/mapsdk/maps/a/dr$a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore_2
    //   12: aload_2
    //   13: ldc 43
    //   15: aconst_null
    //   16: ldc 108
    //   18: iconst_1
    //   19: anewarray 45	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: aload_1
    //   25: aastore
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: invokevirtual 55	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore_1
    //   33: aload_1
    //   34: ifnull +57 -> 91
    //   37: aload_1
    //   38: invokeinterface 65 1 0
    //   43: ifeq +48 -> 91
    //   46: aload_1
    //   47: aload_1
    //   48: ldc 132
    //   50: invokeinterface 69 2 0
    //   55: invokeinterface 168 2 0
    //   60: astore_2
    //   61: aload_2
    //   62: invokestatic 173	com/tencent/tencentmap/mapsdk/maps/a/eu:a	([B)Z
    //   65: istore_3
    //   66: iload_3
    //   67: ifne +24 -> 91
    //   70: aload_1
    //   71: ifnull +9 -> 80
    //   74: aload_1
    //   75: invokeinterface 94 1 0
    //   80: ldc 161
    //   82: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: aload_2
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: areturn
    //   91: aload_1
    //   92: ifnull +9 -> 101
    //   95: aload_1
    //   96: invokeinterface 94 1 0
    //   101: ldc 161
    //   103: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: aconst_null
    //   107: astore_1
    //   108: goto -21 -> 87
    //   111: astore_1
    //   112: aconst_null
    //   113: astore_2
    //   114: aload_1
    //   115: astore 4
    //   117: aload_2
    //   118: ifnull +9 -> 127
    //   121: aload_2
    //   122: invokeinterface 94 1 0
    //   127: ldc 161
    //   129: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload 4
    //   134: athrow
    //   135: astore_1
    //   136: goto -35 -> 101
    //   139: astore_1
    //   140: aload_0
    //   141: monitorexit
    //   142: aload_1
    //   143: athrow
    //   144: astore 4
    //   146: aload_1
    //   147: astore_2
    //   148: goto -31 -> 117
    //
    // Exception table:
    //   from	to	target	type
    //   12	33	111	finally
    //   7	12	135	java/lang/Throwable
    //   74	80	135	java/lang/Throwable
    //   95	101	135	java/lang/Throwable
    //   121	127	135	java/lang/Throwable
    //   127	135	135	java/lang/Throwable
    //   2	7	139	finally
    //   7	12	139	finally
    //   74	80	139	finally
    //   80	85	139	finally
    //   95	101	139	finally
    //   101	106	139	finally
    //   121	127	139	finally
    //   127	135	139	finally
    //   37	66	144	finally
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(98735);
    try
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
      AppMethodBeat.o(98735);
      return;
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
        AppMethodBeat.o(98735);
    }
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98737);
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_schedule_tbl");
      try
      {
        label11: paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
        AppMethodBeat.o(98737);
        return;
      }
      catch (SQLException paramSQLiteDatabase)
      {
        AppMethodBeat.o(98737);
        throw paramSQLiteDatabase;
      }
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
        AppMethodBeat.o(98737);
    }
    catch (SQLException localSQLException)
    {
      break label11;
    }
  }

  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(98736);
    super.onOpen(paramSQLiteDatabase);
    try
    {
      int i = paramSQLiteDatabase.getVersion();
      if (i != 0)
        if (i <= 0)
        {
          onUpgrade(paramSQLiteDatabase, i, 1);
          AppMethodBeat.o(98736);
        }
      while (true)
      {
        return;
        if (i > 1)
          onDowngrade(paramSQLiteDatabase, i, 1);
        AppMethodBeat.o(98736);
      }
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
        AppMethodBeat.o(98736);
    }
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98738);
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_schedule_tbl");
      try
      {
        label11: paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
        AppMethodBeat.o(98738);
        return;
      }
      catch (SQLException paramSQLiteDatabase)
      {
        AppMethodBeat.o(98738);
        throw paramSQLiteDatabase;
      }
    }
    catch (Exception paramSQLiteDatabase)
    {
      while (true)
        AppMethodBeat.o(98738);
    }
    catch (SQLException localSQLException)
    {
      break label11;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dr.a
 * JD-Core Version:    0.6.2
 */