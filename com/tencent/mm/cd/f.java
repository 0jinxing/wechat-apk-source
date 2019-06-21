package com.tencent.mm.cd;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import android.util.Printer;
import android.util.StringBuilderPrinter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.CursorWrapper;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteAsyncCheckpointer;
import com.tencent.wcdb.database.SQLiteCheckpointListener;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteCursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.CursorFactory;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteGlobal;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.database.SQLiteTrace.TraceInfo;
import com.tencent.wcdb.support.LogPrinter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
  implements DatabaseErrorHandler, SQLiteTrace
{
  private static final SQLiteCipherSpec kIB;
  private static SQLiteTrace ybC;
  private static com.tencent.mm.plugin.report.b ybD;
  private static final int[] ybE;
  private static Map<String, SQLiteDatabase> ybv;
  private static final SharedPreferences ybw;
  private static int ybx;
  private static final SQLiteCheckpointListener yby;
  private boolean ybA = false;
  private volatile String ybB = "";
  SQLiteDatabase ybt = null;
  SQLiteDatabase ybu = null;
  private boolean ybz = false;

  static
  {
    // Byte code:
    //   0: ldc 43
    //   2: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 51	java/util/HashMap
    //   8: dup
    //   9: invokespecial 54	java/util/HashMap:<init>	()V
    //   12: putstatic 56	com/tencent/mm/cd/f:ybv	Ljava/util/Map;
    //   15: new 58	com/tencent/wcdb/database/SQLiteCipherSpec
    //   18: dup
    //   19: invokespecial 59	com/tencent/wcdb/database/SQLiteCipherSpec:<init>	()V
    //   22: sipush 1024
    //   25: invokevirtual 63	com/tencent/wcdb/database/SQLiteCipherSpec:setPageSize	(I)Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   28: iconst_1
    //   29: invokevirtual 66	com/tencent/wcdb/database/SQLiteCipherSpec:setSQLCipherVersion	(I)Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   32: putstatic 68	com/tencent/mm/cd/f:kIB	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   35: invokestatic 73	com/tencent/wcdb/database/SQLiteGlobal:loadLib	()V
    //   38: iconst_0
    //   39: invokestatic 78	com/tencent/wcdb/database/SQLiteDebug:setIOTraceFlags	(I)V
    //   42: ldc 79
    //   44: invokestatic 85	com/tencent/wcdb/CursorWindow:windowSize	(I)I
    //   47: pop
    //   48: invokestatic 91	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   51: ldc 93
    //   53: iconst_0
    //   54: invokevirtual 99	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   57: astore_0
    //   58: aload_0
    //   59: putstatic 101	com/tencent/mm/cd/f:ybw	Landroid/content/SharedPreferences;
    //   62: aload_0
    //   63: ldc 103
    //   65: iconst_0
    //   66: invokeinterface 109 3 0
    //   71: putstatic 111	com/tencent/mm/cd/f:ybx	I
    //   74: getstatic 101	com/tencent/mm/cd/f:ybw	Landroid/content/SharedPreferences;
    //   77: ldc 113
    //   79: bipush 100
    //   81: invokeinterface 109 3 0
    //   86: istore_1
    //   87: new 10	com/tencent/mm/cd/f$1
    //   90: dup
    //   91: iload_1
    //   92: bipush 16
    //   94: iushr
    //   95: iload_1
    //   96: ldc 114
    //   98: iand
    //   99: invokespecial 117	com/tencent/mm/cd/f$1:<init>	(II)V
    //   102: putstatic 119	com/tencent/mm/cd/f:yby	Lcom/tencent/wcdb/database/SQLiteCheckpointListener;
    //   105: new 121	com/tencent/mm/plugin/report/b
    //   108: dup
    //   109: invokespecial 122	com/tencent/mm/plugin/report/b:<init>	()V
    //   112: putstatic 124	com/tencent/mm/cd/f:ybD	Lcom/tencent/mm/plugin/report/b;
    //   115: bipush 16
    //   117: newarray int
    //   119: dup
    //   120: iconst_0
    //   121: bipush 27
    //   123: iastore
    //   124: dup
    //   125: iconst_1
    //   126: bipush 39
    //   128: iastore
    //   129: dup
    //   130: iconst_2
    //   131: bipush 24
    //   133: iastore
    //   134: dup
    //   135: iconst_3
    //   136: bipush 36
    //   138: iastore
    //   139: dup
    //   140: iconst_4
    //   141: bipush 27
    //   143: iastore
    //   144: dup
    //   145: iconst_5
    //   146: bipush 39
    //   148: iastore
    //   149: dup
    //   150: bipush 6
    //   152: bipush 48
    //   154: iastore
    //   155: dup
    //   156: bipush 7
    //   158: bipush 54
    //   160: iastore
    //   161: dup
    //   162: bipush 8
    //   164: bipush 33
    //   166: iastore
    //   167: dup
    //   168: bipush 9
    //   170: bipush 45
    //   172: iastore
    //   173: dup
    //   174: bipush 10
    //   176: bipush 30
    //   178: iastore
    //   179: dup
    //   180: bipush 11
    //   182: bipush 42
    //   184: iastore
    //   185: dup
    //   186: bipush 12
    //   188: bipush 33
    //   190: iastore
    //   191: dup
    //   192: bipush 13
    //   194: bipush 45
    //   196: iastore
    //   197: dup
    //   198: bipush 14
    //   200: bipush 51
    //   202: iastore
    //   203: dup
    //   204: bipush 15
    //   206: bipush 57
    //   208: iastore
    //   209: putstatic 126	com/tencent/mm/cd/f:ybE	[I
    //   212: ldc 43
    //   214: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: return
  }

  public static f E(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(59074);
    while (true)
    {
      Object localObject2;
      try
      {
        localb1 = new com/tencent/mm/vfs/b;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localb1.<init>(paramString1 + "-vfslog");
        com.tencent.mm.vfs.b localb2 = new com/tencent/mm/vfs/b;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localb2.<init>(paramString1 + "-vfslo1");
        if ((localb1.exists()) && (localb1.length() > 256L))
          localb1.delete();
        if ((localb2.exists()) && (localb2.length() > 256L))
          localb2.delete();
        localObject2 = new f();
        i = 268435456;
        if (bo.isNullOrNil(paramString1))
        {
          paramString1 = ":memory:";
          ((f)localObject2).ybz = true;
          if (!bo.isNullOrNil(paramString2))
            continue;
          localb1 = null;
          paramString2 = null;
          boolean bool = dvt();
          if ((paramBoolean) || (bool))
            i = 805306368;
        }
      }
      catch (Throwable localThrowable)
      {
        try
        {
          com.tencent.mm.vfs.b localb1;
          int i;
          ((f)localObject2).ybt = SQLiteDatabase.openDatabase(paramString1, paramString2, localb1, null, i, (SQLiteTrace)localObject2);
          ((f)localObject2).ybt.setTraceCallback((SQLiteTrace)localObject2);
          if (dvu())
          {
            ((f)localObject2).ybt.setCheckpointCallback(yby);
            paramString2 = new java/lang/StringBuilder;
            paramString2.<init>("Enable async checkpointer for DB: ");
            ab.i("MicroMsg.MMDataBase", ((f)localObject2).getPath());
          }
          if (com.tencent.mm.sdk.platformtools.f.xxZ.amr("ENABLE_STETHO"))
            ybv.put(((f)localObject2).getPath(), ((f)localObject2).ybt);
          if (((f)localObject2).ybt == null)
          {
            AppMethodBeat.o(59074);
            paramString1 = localObject1;
            return paramString1;
            localThrowable = localThrowable;
            ab.printErrStackTrace("MicroMsg.MMDataBase", localThrowable, "", new Object[0]);
            continue;
            continue;
            paramString2 = paramString2.getBytes();
            SQLiteCipherSpec localSQLiteCipherSpec = kIB;
          }
        }
        catch (SQLiteException paramString2)
        {
          e.pXa.g("DBCantOpen", "DB (" + new com.tencent.mm.vfs.b(paramString1).getName() + ") can't open: " + bo.l(paramString2), null);
          AppMethodBeat.o(59074);
          throw paramString2;
        }
      }
      AppMethodBeat.o(59074);
      paramString1 = (String)localObject2;
    }
  }

  public static void a(SQLiteTrace paramSQLiteTrace)
  {
    ybC = paramSQLiteTrace;
  }

  public static boolean a(f paramf, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(59086);
    boolean bool2;
    if ((paramf == null) || (paramString == null))
      if (paramf == null)
      {
        bool2 = true;
        ab.e("MicroMsg.MMDataBase", "[arthurdan.checkTableExist] Notice!!! null == db: %b, table: %s", new Object[] { Boolean.valueOf(bool2), paramString });
        AppMethodBeat.o(59086);
        bool2 = bool1;
      }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      paramf = paramf.a("select tbl_name from sqlite_master  where type = \"table\" and tbl_name=\"" + paramString + "\"", null, 0);
      if (paramf == null)
      {
        AppMethodBeat.o(59086);
        bool2 = bool1;
      }
      else
      {
        int i = paramf.getCount();
        paramf.close();
        if (i > 0)
        {
          AppMethodBeat.o(59086);
          bool2 = true;
        }
        else
        {
          AppMethodBeat.o(59086);
          bool2 = bool1;
        }
      }
    }
  }

  public static void aV(Map<String, ?> paramMap)
  {
    AppMethodBeat.i(59065);
    Object localObject1 = ybw.getAll();
    if ((localObject1 == null) || (((Map)localObject1).equals(paramMap)))
      AppMethodBeat.o(59065);
    while (true)
    {
      return;
      localObject1 = ybw.edit();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        paramMap = (String)((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        if ((localObject2 instanceof Integer))
          ((SharedPreferences.Editor)localObject1).putInt(paramMap, ((Integer)localObject2).intValue());
        else if ((localObject2 instanceof Long))
          ((SharedPreferences.Editor)localObject1).putLong(paramMap, ((Long)localObject2).longValue());
        else if ((localObject2 instanceof Boolean))
          ((SharedPreferences.Editor)localObject1).putBoolean(paramMap, ((Boolean)localObject2).booleanValue());
        else if ((localObject2 instanceof String))
          ((SharedPreferences.Editor)localObject1).putString(paramMap, localObject2.toString());
        else if ((localObject2 instanceof Float))
          ((SharedPreferences.Editor)localObject1).putFloat(paramMap, ((Float)localObject2).floatValue());
      }
      ((SharedPreferences.Editor)localObject1).apply();
      AppMethodBeat.o(59065);
    }
  }

  static void aqu(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(59067);
    Object localObject = new com.tencent.mm.vfs.b(paramString);
    paramString = ((com.tencent.mm.vfs.b)localObject).dMC();
    String str = ((com.tencent.mm.vfs.b)localObject).getName();
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(((com.tencent.mm.vfs.b)localObject).dMC(), "corrupted");
    localb.mkdirs();
    while (i < 8)
    {
      localObject = new String[] { "", "-journal", "-wal", ".ini", ".bak", ".sm", "-vfslog", "-vfslo1" }[i];
      new com.tencent.mm.vfs.b(paramString, str + (String)localObject).o(new com.tencent.mm.vfs.b(localb, str + (String)localObject));
      i++;
    }
    AppMethodBeat.o(59067);
  }

  public static f ca(String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(59072);
    f localf = new f();
    if ((paramString == null) || (paramString.length() == 0))
    {
      localf.ybu = SQLiteDatabase.create(null);
      localf.ybz = true;
      if (localf.ybu == null)
      {
        AppMethodBeat.o(59072);
        paramString = localObject;
      }
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(59072);
      paramString = localf;
      continue;
      int i = 268435456;
      if (paramBoolean)
        i = 805306368;
      try
      {
        localf.ybu = SQLiteDatabase.openDatabase(paramString, null, i, localf);
        localf.ybu.setTraceCallback(localf);
        if (dvu())
        {
          localf.ybu.setCheckpointCallback(yby);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Enable async checkpointer for DB: ");
          ab.i("MicroMsg.MMDataBase", localf.getPath());
        }
        if (com.tencent.mm.sdk.platformtools.f.xxZ.amr("ENABLE_STETHO"))
          ybv.put(localf.getPath(), localf.ybu);
        if (localf.ybu == null)
        {
          AppMethodBeat.o(59072);
          paramString = localObject;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        e.pXa.g("DBCantOpen", "DB (" + new com.tencent.mm.vfs.b(paramString).getName() + ") can't open: " + bo.l(localSQLiteException), null);
        AppMethodBeat.o(59072);
        throw localSQLiteException;
      }
      AppMethodBeat.o(59072);
      paramString = localSQLiteException;
    }
  }

  @SuppressLint({"DefaultLocale"})
  private static String dvs()
  {
    AppMethodBeat.i(59066);
    int i = ybw.getInt("acp", 100);
    String str = String.format("flags: 0x%04x\nacp: %d / %d", new Object[] { Integer.valueOf(ybw.getInt("flags", 0)), Integer.valueOf(i >>> 16), Integer.valueOf(i & 0xFFFF) });
    AppMethodBeat.o(59066);
    return str;
  }

  public static boolean dvt()
  {
    if ((ybx & 0x1) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean dvu()
  {
    if ((ybx & 0x8) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final android.database.Cursor a(String paramString, String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(59077);
    SQLiteDatabase localSQLiteDatabase;
    int i;
    label30: SQLiteDatabase.CursorFactory localCursorFactory;
    if (this.ybt != null)
    {
      localSQLiteDatabase = this.ybt;
      if ((ybx & 0x2) == 0)
        break label87;
      i = 1;
      if (paramInt != 4)
        break label93;
      localCursorFactory = com.tencent.mm.cd.a.f.FACTORY;
    }
    while (true)
    {
      paramArrayOfString = localSQLiteDatabase.rawQueryWithFactory(localCursorFactory, paramString, paramArrayOfString, null);
      if ((paramInt != 0) && (paramInt != 4));
      for (paramString = new a(paramArrayOfString, paramString); ; paramString = paramArrayOfString)
      {
        AppMethodBeat.o(59077);
        return paramString;
        localSQLiteDatabase = this.ybu;
        break;
        label87: i = 0;
        break label30;
        label93: if ((!com.tencent.mm.sdk.a.b.dnO()) && (i == 0))
          break label175;
        switch (paramInt)
        {
        default:
          localCursorFactory = null;
          break;
        case 0:
          localCursorFactory = null;
          break;
        case 1:
          localCursorFactory = SQLiteCursor.FACTORY;
          break;
        case 2:
          localCursorFactory = SQLiteDirectCursor.FACTORY;
          break;
        case 3:
          localCursorFactory = null;
          break;
        }
      }
      label175: localCursorFactory = null;
    }
  }

  public final android.database.Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    AppMethodBeat.i(59079);
    SQLiteDatabase localSQLiteDatabase;
    int i;
    label30: SQLiteDatabase.CursorFactory localCursorFactory;
    if (this.ybt != null)
    {
      localSQLiteDatabase = this.ybt;
      if ((ybx & 0x2) == 0)
        break label103;
      i = 1;
      localCursorFactory = null;
      if (paramInt != 4)
        break label109;
      localCursorFactory = com.tencent.mm.cd.a.f.FACTORY;
      label44: paramArrayOfString1 = localSQLiteDatabase.queryWithFactory(localCursorFactory, false, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, null);
      if ((paramInt == 0) || (paramInt == 4))
        break label186;
    }
    label186: for (paramString1 = new a(paramArrayOfString1, paramString1); ; paramString1 = paramArrayOfString1)
    {
      AppMethodBeat.o(59079);
      return paramString1;
      localSQLiteDatabase = this.ybu;
      break;
      label103: i = 0;
      break label30;
      label109: if ((!com.tencent.mm.sdk.a.b.dnO()) && (i == 0))
        break label44;
      switch (paramInt)
      {
      default:
        localCursorFactory = null;
        break;
      case 0:
        localCursorFactory = null;
        break;
      case 1:
        localCursorFactory = SQLiteCursor.FACTORY;
        break;
      case 2:
        localCursorFactory = SQLiteDirectCursor.FACTORY;
        break;
      case 3:
        localCursorFactory = null;
        break;
      }
    }
  }

  public final void beginTransaction()
  {
    AppMethodBeat.i(59084);
    try
    {
      if (this.ybt != null)
      {
        this.ybt.beginTransaction();
        AppMethodBeat.o(59084);
      }
      while (true)
      {
        return;
        this.ybu.beginTransaction();
        AppMethodBeat.o(59084);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDataBase", localException, "", new Object[0]);
        AppMethodBeat.o(59084);
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(59076);
    try
    {
      if ((this.ybt != null) && (this.ybt.isOpen()))
      {
        this.ybt.close();
        this.ybt = null;
      }
      if ((this.ybu != null) && (this.ybu.isOpen()))
      {
        this.ybu.close();
        this.ybu = null;
      }
      AppMethodBeat.o(59076);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMDataBase", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(59076);
      }
    }
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59083);
    int i;
    if (this.ybt != null)
    {
      i = this.ybt.delete(paramString1, paramString2, paramArrayOfString);
      AppMethodBeat.o(59083);
    }
    while (true)
    {
      return i;
      i = this.ybu.delete(paramString1, paramString2, paramArrayOfString);
      AppMethodBeat.o(59083);
    }
  }

  public final void endTransaction()
  {
    AppMethodBeat.i(59085);
    try
    {
      if (this.ybt != null)
      {
        this.ybt.setTransactionSuccessful();
        this.ybt.endTransaction();
        AppMethodBeat.o(59085);
      }
      while (true)
      {
        return;
        this.ybu.setTransactionSuccessful();
        this.ybu.endTransaction();
        AppMethodBeat.o(59085);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDataBase", localException, "", new Object[0]);
        AppMethodBeat.o(59085);
      }
    }
  }

  public final void execSQL(String paramString)
  {
    AppMethodBeat.i(59078);
    if (this.ybt != null)
    {
      this.ybt.execSQL(paramString);
      AppMethodBeat.o(59078);
    }
    while (true)
    {
      return;
      this.ybu.execSQL(paramString);
      AppMethodBeat.o(59078);
    }
  }

  public final String getPath()
  {
    AppMethodBeat.i(59073);
    String str;
    if (this.ybt != null)
    {
      str = this.ybt.getPath();
      AppMethodBeat.o(59073);
    }
    while (true)
    {
      return str;
      str = this.ybu.getPath();
      AppMethodBeat.o(59073);
    }
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(59080);
    long l;
    if (this.ybt != null)
    {
      l = this.ybt.insert(paramString1, paramString2, paramContentValues);
      AppMethodBeat.o(59080);
    }
    while (true)
    {
      return l;
      l = this.ybu.insert(paramString1, paramString2, paramContentValues);
      AppMethodBeat.o(59080);
    }
  }

  public final boolean isOpen()
  {
    AppMethodBeat.i(59075);
    boolean bool;
    if (this.ybt != null)
    {
      bool = this.ybt.isOpen();
      AppMethodBeat.o(59075);
    }
    while (true)
    {
      return bool;
      if (this.ybu != null)
      {
        bool = this.ybu.isOpen();
        AppMethodBeat.o(59075);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(59075);
      }
    }
  }

  public final void onConnectionObtained(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(59070);
    int j;
    if (paramSQLiteDatabase.getPath().endsWith("EnMicroMsg.db"))
    {
      if (!paramSQLiteDatabase.isWriteAheadLoggingEnabled())
        break label91;
      j = 2;
      if (!paramSQLiteDatabase.getAsyncCheckpointEnabled())
        break label97;
    }
    label91: label97: for (int k = 4; ; k = 0)
    {
      if (paramBoolean)
        i = 8;
      j = ybE[(j + k + i + 1)];
      ybD.g(j + 1, j + 2, (int)paramLong);
      AppMethodBeat.o(59070);
      return;
      j = 0;
      break;
    }
  }

  @SuppressLint({"DefaultLocale"})
  public final void onConnectionPoolBusy(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong, boolean paramBoolean, List<SQLiteTrace.TraceInfo<String>> paramList, List<SQLiteTrace.TraceInfo<StackTraceElement[]>> paramList1)
  {
    AppMethodBeat.i(59071);
    Object localObject1 = new com.tencent.mm.vfs.b(paramSQLiteDatabase.getPath()).getName();
    paramLong = System.currentTimeMillis();
    final StringBuilder localStringBuilder = new StringBuilder(2048);
    localStringBuilder.append((String)localObject1).append("\n");
    Object localObject2;
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      localObject2 = paramList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (SQLiteTrace.TraceInfo)((Iterator)localObject2).next();
        localStringBuilder.append("[RUNNING] ").append((String)((SQLiteTrace.TraceInfo)localObject3).info).append('\n');
      }
      localStringBuilder.append('\n');
    }
    if ((paramList1 != null) && (!paramList1.isEmpty()))
    {
      localObject3 = paramList1.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (SQLiteTrace.TraceInfo)((Iterator)localObject3).next();
        localStringBuilder.append("[TRANSACTION]\n");
        for (Object localObject4 : (StackTraceElement[])((SQLiteTrace.TraceInfo)localObject2).info)
          localStringBuilder.append("  at ").append(localObject4.toString()).append('\n');
        localStringBuilder.append('\n');
      }
    }
    Object localObject3 = localStringBuilder.toString();
    if (this.ybB.equals(localObject3))
      AppMethodBeat.o(59071);
    while (true)
    {
      return;
      ab.w("MicroMsg.MMDataBase", "Database connection pool busy: ".concat(String.valueOf(localObject1)));
      ab.w("MicroMsg.MMDataBase", "[REQUEST primary: " + paramBoolean + "] " + paramString);
      if ((paramList != null) && (!paramList.isEmpty()))
      {
        localObject1 = paramList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramList = (SQLiteTrace.TraceInfo)((Iterator)localObject1).next();
          ab.w("MicroMsg.MMDataBase", "[RUNNING tid: %d (%d ms)] %s", new Object[] { Integer.valueOf(paramList.tid), Long.valueOf(paramLong - paramList.time), paramList.info });
        }
        localStringBuilder.append('\n');
      }
      if ((paramList1 != null) && (!paramList1.isEmpty()))
      {
        paramList = paramList1.iterator();
        while (paramList.hasNext())
        {
          paramList1 = (SQLiteTrace.TraceInfo)paramList.next();
          localStringBuilder.setLength(0);
          localStringBuilder.append(String.format("[TRANSACTION tid: %d (%d ms)]\n", new Object[] { Integer.valueOf(paramList1.tid), Long.valueOf(paramLong - paramList1.time) }));
          for (paramList1 : (StackTraceElement[])paramList1.info)
            localStringBuilder.append("  at ").append(paramList1.toString()).append('\n');
          localStringBuilder.append('\n');
          ab.w("MicroMsg.MMDataBase", localStringBuilder.toString());
        }
      }
      localStringBuilder.setLength(0);
      paramSQLiteDatabase.dump(new Printer()
      {
        final Printer ybF;
        final Printer ybG;

        public final void println(String paramAnonymousString)
        {
          AppMethodBeat.i(59054);
          this.ybF.println(paramAnonymousString);
          this.ybG.println(paramAnonymousString);
          AppMethodBeat.o(59054);
        }
      }
      , false);
      paramSQLiteDatabase = localStringBuilder.toString();
      paramList = new LinkedHashMap();
      paramList.put("SQL", paramString);
      paramList.put("dump", paramSQLiteDatabase);
      paramList.put("settings", dvs());
      e.pXa.g("DBPoolBusy", (String)localObject3, paramList);
      this.ybB = ((String)localObject3);
      e.pXa.a(463L, 6L, 1L, false);
      AppMethodBeat.o(59071);
    }
  }

  public final void onCorruption(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(59068);
    boolean bool = paramSQLiteDatabase.isOpen();
    String str1 = paramSQLiteDatabase.getPath();
    ab.e("MicroMsg.MMDataBase", "Database corrupted, isOpen: %s, path: %s", new Object[] { Boolean.toString(bool), str1 });
    int i;
    if (!this.ybA)
    {
      this.ybA = true;
      i = SQLiteDebug.getLastErrorLine();
      localObject = dvs();
      String str2 = String.format("%s (line: %d, open: %s)\n%s", new Object[] { new com.tencent.mm.vfs.b(paramSQLiteDatabase.getPath()).getName(), Integer.valueOf(i), Boolean.toString(paramSQLiteDatabase.isOpen()), localObject });
      localObject = new HashMap();
      ((HashMap)localObject).put("fileSystem", b.dvn());
      e.pXa.g("DBCorrupt", str2, (Map)localObject);
    }
    Object localObject = paramSQLiteDatabase.getAttachedDbs();
    if (!bool)
      AppMethodBeat.o(59068);
    while (true)
    {
      return;
      while (true)
      {
        try
        {
          if (paramSQLiteDatabase.isWriteAheadLoggingEnabled())
            break label221;
          i = 42;
          e.pXa.a(181L, i, 1L, true);
          paramSQLiteDatabase.close();
          if (localObject != null)
            break label242;
          aqu(str1);
          AppMethodBeat.o(59068);
        }
        catch (Exception paramSQLiteDatabase)
        {
          AppMethodBeat.o(59068);
        }
        break;
        label221: if (paramSQLiteDatabase.getAsyncCheckpointEnabled())
          i = 43;
        else
          i = 41;
      }
      label242: paramSQLiteDatabase = ((List)localObject).iterator();
      while (paramSQLiteDatabase.hasNext())
        aqu((String)((Pair)paramSQLiteDatabase.next()).second);
      AppMethodBeat.o(59068);
    }
  }

  public final void onDatabaseCorrupted(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public final void onSQLExecuted(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt, long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(59069);
    int j;
    if (paramSQLiteDatabase.getPath().endsWith("EnMicroMsg.db"))
    {
      if (!paramSQLiteDatabase.isWriteAheadLoggingEnabled())
        break label109;
      j = 2;
      if (!paramSQLiteDatabase.getAsyncCheckpointEnabled())
        break label115;
    }
    label109: label115: for (int k = 4; ; k = 0)
    {
      if (paramInt != 1)
        i = 8;
      j = ybE[(j + k + i)];
      ybD.g(j + 1, j + 2, (int)paramLong);
      if (ybC != null)
        ybC.onSQLExecuted(paramSQLiteDatabase, paramString, paramInt, paramLong);
      AppMethodBeat.o(59069);
      return;
      j = 0;
      break;
    }
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(59082);
    long l;
    if (this.ybt != null)
    {
      l = this.ybt.replace(paramString1, paramString2, paramContentValues);
      AppMethodBeat.o(59082);
    }
    while (true)
    {
      return l;
      l = this.ybu.replace(paramString1, paramString2, paramContentValues);
      AppMethodBeat.o(59082);
    }
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59081);
    int i;
    if (this.ybt != null)
    {
      i = this.ybt.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
      AppMethodBeat.o(59081);
    }
    while (true)
    {
      return i;
      i = this.ybu.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
      AppMethodBeat.o(59081);
    }
  }

  static final class a extends CursorWrapper
  {
    private long mCreateTime;
    private String xIB;
    private int ybJ;

    public a(com.tencent.wcdb.Cursor paramCursor, String paramString)
    {
      super();
      AppMethodBeat.i(59055);
      this.xIB = paramString;
      if ((paramCursor instanceof SQLiteDirectCursor))
        this.ybJ = 2;
      while (true)
      {
        this.mCreateTime = System.nanoTime();
        AppMethodBeat.o(59055);
        return;
        if ((paramCursor instanceof SQLiteCursor))
          this.ybJ = 1;
        else
          this.ybJ = -1;
      }
    }

    public final void close()
    {
      AppMethodBeat.i(59056);
      this.mCursor.close();
      long l = (System.nanoTime() - this.mCreateTime) / 1000L;
      int i = -1;
      if (this.ybJ == 1)
        i = 0;
      while (true)
      {
        if (i >= 0)
          f.dvv().g(i + 1, i + 2, l);
        AppMethodBeat.o(59056);
        return;
        if (this.ybJ == 2)
          i = 3;
      }
    }

    public final byte[] getBlob(int paramInt)
    {
      AppMethodBeat.i(59064);
      try
      {
        byte[] arrayOfByte = super.getBlob(paramInt);
        AppMethodBeat.o(59064);
        return arrayOfByte;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMDataBase", localIllegalStateException, "", new Object[0]);
          Object localObject = null;
          AppMethodBeat.o(59064);
        }
      }
    }

    public final int getCount()
    {
      AppMethodBeat.i(59057);
      ab.w("MicroMsg.MMDataBase", "Slow operation: " + bo.l(new Throwable()));
      int i = this.mCursor.getCount();
      AppMethodBeat.o(59057);
      return i;
    }

    public final double getDouble(int paramInt)
    {
      AppMethodBeat.i(59058);
      try
      {
        d = super.getDouble(paramInt);
        AppMethodBeat.o(59058);
        return d;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMDataBase", localIllegalStateException, "", new Object[0]);
          double d = 0.0D;
          AppMethodBeat.o(59058);
        }
      }
    }

    public final float getFloat(int paramInt)
    {
      AppMethodBeat.i(59059);
      try
      {
        f = super.getFloat(paramInt);
        AppMethodBeat.o(59059);
        return f;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMDataBase", localIllegalStateException, "", new Object[0]);
          float f = 0.0F;
          AppMethodBeat.o(59059);
        }
      }
    }

    public final int getInt(int paramInt)
    {
      int i = 0;
      AppMethodBeat.i(59060);
      try
      {
        paramInt = super.getInt(paramInt);
        AppMethodBeat.o(59060);
        return paramInt;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMDataBase", localIllegalStateException, "", new Object[0]);
          AppMethodBeat.o(59060);
          paramInt = i;
        }
      }
    }

    public final long getLong(int paramInt)
    {
      AppMethodBeat.i(59061);
      try
      {
        l = super.getLong(paramInt);
        AppMethodBeat.o(59061);
        return l;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMDataBase", localIllegalStateException, "", new Object[0]);
          long l = 0L;
          AppMethodBeat.o(59061);
        }
      }
    }

    public final short getShort(int paramInt)
    {
      int i = 0;
      AppMethodBeat.i(59062);
      try
      {
        paramInt = super.getShort(paramInt);
        AppMethodBeat.o(59062);
        j = paramInt;
        return j;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMDataBase", localIllegalStateException, "", new Object[0]);
          AppMethodBeat.o(59062);
          int j = i;
        }
      }
    }

    public final String getString(int paramInt)
    {
      AppMethodBeat.i(59063);
      try
      {
        String str = super.getString(paramInt);
        AppMethodBeat.o(59063);
        return str;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.MMDataBase", localIllegalStateException, "", new Object[0]);
          Object localObject = null;
          AppMethodBeat.o(59063);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.f
 * JD-Core Version:    0.6.2
 */