package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.DefaultDatabaseErrorHandler;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.extension.SQLiteExtension;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class SQLiteDatabase extends SQLiteClosable
{
  public static final int CONFLICT_ABORT = 2;
  public static final int CONFLICT_FAIL = 3;
  public static final int CONFLICT_IGNORE = 4;
  public static final int CONFLICT_NONE = 0;
  public static final int CONFLICT_REPLACE = 5;
  public static final int CONFLICT_ROLLBACK = 1;
  private static final String[] CONFLICT_VALUES;
  public static final int CREATE_IF_NECESSARY = 268435456;
  public static final int ENABLE_IO_TRACE = 256;
  public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
  public static final int MAX_SQL_CACHE_SIZE = 100;
  public static final int NO_LOCALIZED_COLLATORS = 16;
  public static final int OPEN_READONLY = 1;
  public static final int OPEN_READWRITE = 0;
  private static final int OPEN_READ_MASK = 1;
  public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
  public static final int SYNCHRONOUS_EXTRA = 3;
  public static final int SYNCHRONOUS_FULL = 2;
  public static final int SYNCHRONOUS_NORMAL = 1;
  public static final int SYNCHRONOUS_OFF = 0;
  private static final String TAG = "WCDB.SQLiteDatabase";
  private static final WeakHashMap<SQLiteDatabase, Object> sActiveDatabases;
  private final SQLiteDatabaseConfiguration mConfigurationLocked;
  private SQLiteConnectionPool mConnectionPoolLocked;
  private final CursorFactory mCursorFactory;
  private final DatabaseErrorHandler mErrorHandler;
  private boolean mHasAttachedDbsLocked;
  private final Object mLock;
  private final ThreadLocal<SQLiteSession> mThreadSession;

  static
  {
    AppMethodBeat.i(12539);
    if (!SQLiteDatabase.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      SQLiteGlobal.loadLib();
      sActiveDatabases = new WeakHashMap();
      CONFLICT_VALUES = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
      AppMethodBeat.o(12539);
      return;
    }
  }

  private SQLiteDatabase(String paramString, int paramInt, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12425);
    this.mThreadSession = new ThreadLocal()
    {
      protected SQLiteSession initialValue()
      {
        AppMethodBeat.i(12422);
        SQLiteSession localSQLiteSession = SQLiteDatabase.this.createSession();
        AppMethodBeat.o(12422);
        return localSQLiteSession;
      }
    };
    this.mLock = new Object();
    this.mCursorFactory = paramCursorFactory;
    if (paramDatabaseErrorHandler != null);
    while (true)
    {
      this.mErrorHandler = paramDatabaseErrorHandler;
      this.mConfigurationLocked = new SQLiteDatabaseConfiguration(paramString, paramInt);
      AppMethodBeat.o(12425);
      return;
      paramDatabaseErrorHandler = new DefaultDatabaseErrorHandler(true);
    }
  }

  private void beginTransaction(SQLiteTransactionListener paramSQLiteTransactionListener, boolean paramBoolean)
  {
    AppMethodBeat.i(12439);
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getThreadSession();
      if (paramBoolean);
      for (int i = 2; ; i = 1)
      {
        localSQLiteSession.beginTransaction(i, paramSQLiteTransactionListener, getThreadDefaultConnectionFlags(false), null);
        return;
      }
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12439);
    }
    throw paramSQLiteTransactionListener;
  }

  private void collectDbStats(ArrayList<SQLiteDebug.DbStats> paramArrayList)
  {
    AppMethodBeat.i(12529);
    synchronized (this.mLock)
    {
      if (this.mConnectionPoolLocked != null)
        this.mConnectionPoolLocked.collectDbStats(paramArrayList);
      AppMethodBeat.o(12529);
      return;
    }
  }

  public static SQLiteDatabase create(CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12475);
    paramCursorFactory = openDatabase(":memory:", paramCursorFactory, 268435456);
    AppMethodBeat.o(12475);
    return paramCursorFactory;
  }

  public static boolean deleteDatabase(File paramFile)
  {
    AppMethodBeat.i(12471);
    if (paramFile == null)
    {
      paramFile = new IllegalArgumentException("file must not be null");
      AppMethodBeat.o(12471);
      throw paramFile;
    }
    boolean bool1 = paramFile.delete() | new File(paramFile.getPath() + "-journal").delete() | new File(paramFile.getPath() + "-shm").delete() | new File(paramFile.getPath() + "-wal").delete();
    File localFile = paramFile.getParentFile();
    boolean bool2 = bool1;
    if (localFile != null)
    {
      paramFile = localFile.listFiles(new FileFilter()
      {
        public final boolean accept(File paramAnonymousFile)
        {
          AppMethodBeat.i(12424);
          boolean bool = paramAnonymousFile.getName().startsWith(this.val$prefix);
          AppMethodBeat.o(12424);
          return bool;
        }
      });
      bool2 = bool1;
      if (paramFile != null)
      {
        int i = paramFile.length;
        for (int j = 0; ; j++)
        {
          bool2 = bool1;
          if (j >= i)
            break;
          bool1 |= paramFile[j].delete();
        }
      }
    }
    AppMethodBeat.o(12471);
    return bool2;
  }

  private void dispose(boolean paramBoolean)
  {
    AppMethodBeat.i(12428);
    SQLiteConnectionPool localSQLiteConnectionPool;
    synchronized (this.mLock)
    {
      localSQLiteConnectionPool = this.mConnectionPoolLocked;
      this.mConnectionPoolLocked = null;
      if (paramBoolean);
    }
    synchronized (sActiveDatabases)
    {
      sActiveDatabases.remove(this);
      if (localSQLiteConnectionPool != null)
        localSQLiteConnectionPool.close();
      AppMethodBeat.o(12428);
      return;
      localObject2 = finally;
      AppMethodBeat.o(12428);
      throw localObject2;
    }
  }

  public static void dumpAll(Printer paramPrinter, boolean paramBoolean)
  {
    AppMethodBeat.i(12531);
    Iterator localIterator = getActiveDatabases().iterator();
    while (localIterator.hasNext())
      ((SQLiteDatabase)localIterator.next()).dump(paramPrinter, paramBoolean);
    AppMethodBeat.o(12531);
  }

  // ERROR //
  private int executeSql(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: sipush 12507
    //   6: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokevirtual 152	com/tencent/wcdb/database/SQLiteDatabase:acquireReference	()V
    //   13: aload_1
    //   14: invokestatic 275	com/tencent/wcdb/DatabaseUtils:getSqlStatementType	(Ljava/lang/String;)I
    //   17: iconst_3
    //   18: if_icmpne +36 -> 54
    //   21: aload_0
    //   22: getfield 131	com/tencent/wcdb/database/SQLiteDatabase:mLock	Ljava/lang/Object;
    //   25: astore 5
    //   27: aload 5
    //   29: monitorenter
    //   30: aload_0
    //   31: getfield 277	com/tencent/wcdb/database/SQLiteDatabase:mHasAttachedDbsLocked	Z
    //   34: ifne +98 -> 132
    //   37: aload_0
    //   38: iconst_1
    //   39: putfield 277	com/tencent/wcdb/database/SQLiteDatabase:mHasAttachedDbsLocked	Z
    //   42: aload 5
    //   44: monitorexit
    //   45: iload 4
    //   47: ifeq +7 -> 54
    //   50: aload_0
    //   51: invokevirtual 280	com/tencent/wcdb/database/SQLiteDatabase:disableWriteAheadLogging	()V
    //   54: new 282	com/tencent/wcdb/database/SQLiteStatement
    //   57: astore 5
    //   59: aload 5
    //   61: aload_0
    //   62: aload_1
    //   63: aload_2
    //   64: invokespecial 285	com/tencent/wcdb/database/SQLiteStatement:<init>	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload 5
    //   69: aload_3
    //   70: invokevirtual 289	com/tencent/wcdb/database/SQLiteStatement:executeUpdateDelete	(Lcom/tencent/wcdb/support/CancellationSignal;)I
    //   73: istore 4
    //   75: aload 5
    //   77: invokevirtual 290	com/tencent/wcdb/database/SQLiteStatement:close	()V
    //   80: aload_0
    //   81: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   84: sipush 12507
    //   87: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: iload 4
    //   92: ireturn
    //   93: astore_1
    //   94: aload 5
    //   96: monitorexit
    //   97: sipush 12507
    //   100: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: aload_1
    //   104: athrow
    //   105: astore_1
    //   106: aload_0
    //   107: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   110: sipush 12507
    //   113: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: aload_1
    //   117: athrow
    //   118: astore_1
    //   119: aload 5
    //   121: invokevirtual 290	com/tencent/wcdb/database/SQLiteStatement:close	()V
    //   124: sipush 12507
    //   127: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: aload_1
    //   131: athrow
    //   132: iconst_0
    //   133: istore 4
    //   135: goto -93 -> 42
    //
    // Exception table:
    //   from	to	target	type
    //   30	42	93	finally
    //   42	45	93	finally
    //   94	97	93	finally
    //   13	30	105	finally
    //   50	54	105	finally
    //   54	67	105	finally
    //   75	80	105	finally
    //   97	105	105	finally
    //   119	132	105	finally
    //   67	75	118	finally
  }

  public static String findEditTable(String paramString)
  {
    AppMethodBeat.i(12483);
    if (!TextUtils.isEmpty(paramString))
    {
      int i = paramString.indexOf(' ');
      int j = paramString.indexOf(',');
      if ((i > 0) && ((i < j) || (j < 0)))
      {
        paramString = paramString.substring(0, i);
        AppMethodBeat.o(12483);
      }
      while (true)
      {
        return paramString;
        if ((j > 0) && ((j < i) || (i < 0)))
        {
          paramString = paramString.substring(0, j);
          AppMethodBeat.o(12483);
        }
        else
        {
          AppMethodBeat.o(12483);
        }
      }
    }
    paramString = new IllegalStateException("Invalid tables");
    AppMethodBeat.o(12483);
    throw paramString;
  }

  private static ArrayList<SQLiteDatabase> getActiveDatabases()
  {
    AppMethodBeat.i(12530);
    ArrayList localArrayList = new ArrayList();
    synchronized (sActiveDatabases)
    {
      localArrayList.addAll(sActiveDatabases.keySet());
      AppMethodBeat.o(12530);
      return localArrayList;
    }
  }

  static ArrayList<SQLiteDebug.DbStats> getDbStats()
  {
    AppMethodBeat.i(12528);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = getActiveDatabases().iterator();
    while (localIterator.hasNext())
      ((SQLiteDatabase)localIterator.next()).collectDbStats(localArrayList);
    AppMethodBeat.o(12528);
    return localArrayList;
  }

  private static boolean isMainThread()
  {
    AppMethodBeat.i(12434);
    Looper localLooper = Looper.myLooper();
    boolean bool;
    if ((localLooper != null) && (localLooper == Looper.getMainLooper()))
    {
      bool = true;
      AppMethodBeat.o(12434);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12434);
    }
  }

  private boolean isReadOnlyLocked()
  {
    boolean bool = true;
    if ((this.mConfigurationLocked.openFlags & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private Set<String> keySet(ContentValues paramContentValues)
  {
    AppMethodBeat.i(12499);
    if (Build.VERSION.SDK_INT < 11);
    while (true)
    {
      try
      {
        Field localField = Class.forName("android.content.ContentValues").getDeclaredField("mValues");
        localField.setAccessible(true);
        paramContentValues = ((HashMap)localField.get(paramContentValues)).keySet();
        AppMethodBeat.o(12499);
        return paramContentValues;
      }
      catch (Exception paramContentValues)
      {
        paramContentValues = new RuntimeException(paramContentValues);
        AppMethodBeat.o(12499);
        throw paramContentValues;
      }
      paramContentValues = paramContentValues.keySet();
      AppMethodBeat.o(12499);
    }
  }

  private void open(byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, int paramInt)
  {
    AppMethodBeat.i(12473);
    try
    {
      openInner(paramArrayOfByte, paramSQLiteCipherSpec, paramInt);
      AppMethodBeat.o(12473);
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      while (true)
      {
        onCorruption();
        openInner(paramArrayOfByte, paramSQLiteCipherSpec, paramInt);
        AppMethodBeat.o(12473);
      }
    }
    catch (SQLiteException paramArrayOfByte)
    {
      Log.e("WCDB.SQLiteDatabase", "Failed to open database '" + getLabel() + "'.", new Object[] { paramArrayOfByte });
      close();
      AppMethodBeat.o(12473);
    }
    throw paramArrayOfByte;
  }

  public static SQLiteDatabase openDatabase(String paramString, CursorFactory paramCursorFactory, int paramInt)
  {
    AppMethodBeat.i(12449);
    paramString = openDatabase(paramString, paramCursorFactory, paramInt, null);
    AppMethodBeat.o(12449);
    return paramString;
  }

  public static SQLiteDatabase openDatabase(String paramString, CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12452);
    paramString = openDatabase(paramString, null, null, paramCursorFactory, paramInt, paramDatabaseErrorHandler, 0);
    AppMethodBeat.o(12452);
    return paramString;
  }

  public static SQLiteDatabase openDatabase(String paramString, CursorFactory paramCursorFactory, int paramInt1, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt2)
  {
    AppMethodBeat.i(12453);
    paramString = openDatabase(paramString, null, null, paramCursorFactory, paramInt1, paramDatabaseErrorHandler, paramInt2);
    AppMethodBeat.o(12453);
    return paramString;
  }

  public static SQLiteDatabase openDatabase(String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12451);
    paramString = openDatabase(paramString, paramArrayOfByte, paramSQLiteCipherSpec, paramCursorFactory, paramInt, paramDatabaseErrorHandler, 0);
    AppMethodBeat.o(12451);
    return paramString;
  }

  public static SQLiteDatabase openDatabase(String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, CursorFactory paramCursorFactory, int paramInt1, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt2)
  {
    AppMethodBeat.i(12450);
    paramString = new SQLiteDatabase(paramString, paramInt1, paramCursorFactory, paramDatabaseErrorHandler);
    paramString.open(paramArrayOfByte, paramSQLiteCipherSpec, paramInt2);
    AppMethodBeat.o(12450);
    return paramString;
  }

  private void openInner(byte[] paramArrayOfByte, SQLiteCipherSpec arg2, int paramInt)
  {
    AppMethodBeat.i(12474);
    synchronized (this.mLock)
    {
      if ((!$assertionsDisabled) && (this.mConnectionPoolLocked != null))
      {
        paramArrayOfByte = new java/lang/AssertionError;
        paramArrayOfByte.<init>();
        AppMethodBeat.o(12474);
        throw paramArrayOfByte;
      }
    }
    this.mConnectionPoolLocked = SQLiteConnectionPool.open(this, this.mConfigurationLocked, paramArrayOfByte, ???, paramInt);
    synchronized (sActiveDatabases)
    {
      sActiveDatabases.put(this, null);
      AppMethodBeat.o(12474);
      return;
    }
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12454);
    paramFile = openOrCreateDatabase(paramFile.getPath(), paramCursorFactory);
    AppMethodBeat.o(12454);
    return paramFile;
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12455);
    paramFile = openOrCreateDatabase(paramFile.getPath(), paramArrayOfByte, paramSQLiteCipherSpec, paramCursorFactory, paramDatabaseErrorHandler, 0);
    AppMethodBeat.o(12455);
    return paramFile;
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    AppMethodBeat.i(12456);
    paramFile = openOrCreateDatabase(paramFile.getPath(), paramArrayOfByte, paramSQLiteCipherSpec, paramCursorFactory, paramDatabaseErrorHandler, paramInt);
    AppMethodBeat.o(12456);
    return paramFile;
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, byte[] paramArrayOfByte, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12457);
    paramFile = openOrCreateDatabase(paramFile.getPath(), paramArrayOfByte, null, paramCursorFactory, paramDatabaseErrorHandler, 0);
    AppMethodBeat.o(12457);
    return paramFile;
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, byte[] paramArrayOfByte, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    AppMethodBeat.i(12458);
    paramFile = openOrCreateDatabase(paramFile.getPath(), paramArrayOfByte, null, paramCursorFactory, paramDatabaseErrorHandler, paramInt);
    AppMethodBeat.o(12458);
    return paramFile;
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12462);
    paramString = openDatabase(paramString, null, null, paramCursorFactory, 268435456, null, 0);
    AppMethodBeat.o(12462);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, CursorFactory paramCursorFactory, int paramInt)
  {
    AppMethodBeat.i(12459);
    paramString = openDatabase(paramString, null, null, paramCursorFactory, 268435456, null, paramInt);
    AppMethodBeat.o(12459);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12470);
    paramString = openDatabase(paramString, paramCursorFactory, 268435456, paramDatabaseErrorHandler);
    AppMethodBeat.o(12470);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, CursorFactory paramCursorFactory, boolean paramBoolean)
  {
    AppMethodBeat.i(12463);
    int i = 268435456;
    if (paramBoolean)
      i = 805306368;
    paramString = openDatabase(paramString, null, null, paramCursorFactory, i, null, 0);
    AppMethodBeat.o(12463);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    AppMethodBeat.i(12464);
    paramString = openDatabase(paramString, paramArrayOfByte, paramSQLiteCipherSpec, paramCursorFactory, 268435456, paramDatabaseErrorHandler, paramInt);
    AppMethodBeat.o(12464);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, byte[] paramArrayOfByte, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12469);
    paramString = openOrCreateDatabase(paramString, paramArrayOfByte, null, paramCursorFactory, paramDatabaseErrorHandler, 0);
    AppMethodBeat.o(12469);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, byte[] paramArrayOfByte, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    AppMethodBeat.i(12468);
    paramString = openOrCreateDatabase(paramString, paramArrayOfByte, null, paramCursorFactory, paramDatabaseErrorHandler, paramInt);
    AppMethodBeat.o(12468);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString, CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12460);
    paramString = openDatabase(paramString, null, null, paramCursorFactory, 805306368, null, 0);
    AppMethodBeat.o(12460);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString, CursorFactory paramCursorFactory, int paramInt)
  {
    AppMethodBeat.i(12461);
    paramString = openDatabase(paramString, null, null, paramCursorFactory, 805306368, null, paramInt);
    AppMethodBeat.o(12461);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12466);
    paramString = openDatabase(paramString, paramArrayOfByte, paramSQLiteCipherSpec, paramCursorFactory, 805306368, null, 0);
    AppMethodBeat.o(12466);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    AppMethodBeat.i(12465);
    paramString = openDatabase(paramString, paramArrayOfByte, paramSQLiteCipherSpec, paramCursorFactory, 805306368, paramDatabaseErrorHandler, paramInt);
    AppMethodBeat.o(12465);
    return paramString;
  }

  public static SQLiteDatabase openOrCreateMemoryDatabaseInWalMode(CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12467);
    paramCursorFactory = openDatabase(":memory:", null, null, paramCursorFactory, 805306368, null, 0);
    AppMethodBeat.o(12467);
    return paramCursorFactory;
  }

  public static int releaseMemory()
  {
    AppMethodBeat.i(12429);
    int i = SQLiteGlobal.releaseMemory();
    AppMethodBeat.o(12429);
    return i;
  }

  private void throwIfNotOpenLocked()
  {
    AppMethodBeat.i(12538);
    if (this.mConnectionPoolLocked == null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("The database '" + this.mConfigurationLocked.label + "' is not open.");
      AppMethodBeat.o(12538);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(12538);
  }

  private boolean yieldIfContendedHelper(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(12447);
    acquireReference();
    try
    {
      paramBoolean = getThreadSession().yieldTransaction(paramLong, paramBoolean, null);
      return paramBoolean;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12447);
    }
  }

  public final long acquireNativeConnectionHandle(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(12535);
    String str = paramString;
    if (paramString == null)
      str = "unnamedNative";
    if (paramBoolean1);
    long l;
    for (int i = 1; ; i = 2)
    {
      int j = i;
      if (paramBoolean2)
        j = i | 0x4;
      l = getThreadSession().acquireConnectionForNativeHandle(j).getNativeHandle(str);
      if (l != 0L)
        break;
      paramString = new IllegalStateException("SQLiteConnection native handle not initialized.");
      AppMethodBeat.o(12535);
      throw paramString;
    }
    AppMethodBeat.o(12535);
    return l;
  }

  public final void addExtension(SQLiteExtension paramSQLiteExtension)
  {
    AppMethodBeat.i(12476);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      boolean bool = this.mConfigurationLocked.extensions.add(paramSQLiteExtension);
      if (bool);
      try
      {
        this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
        AppMethodBeat.o(12476);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        this.mConfigurationLocked.extensions.remove(paramSQLiteExtension);
        AppMethodBeat.o(12476);
        throw localRuntimeException;
      }
    }
  }

  public final void beginTransaction()
  {
    AppMethodBeat.i(12435);
    beginTransaction(null, true);
    AppMethodBeat.o(12435);
  }

  public final void beginTransactionNonExclusive()
  {
    AppMethodBeat.i(12436);
    beginTransaction(null, false);
    AppMethodBeat.o(12436);
  }

  public final void beginTransactionWithListener(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    AppMethodBeat.i(12437);
    beginTransaction(paramSQLiteTransactionListener, true);
    AppMethodBeat.o(12437);
  }

  public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    AppMethodBeat.i(12438);
    beginTransaction(paramSQLiteTransactionListener, false);
    AppMethodBeat.o(12438);
  }

  public final SQLiteStatement compileStatement(String paramString)
  {
    AppMethodBeat.i(12484);
    acquireReference();
    try
    {
      paramString = new SQLiteStatement(this, paramString, null);
      return paramString;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12484);
    }
    throw paramString;
  }

  final SQLiteSession createSession()
  {
    AppMethodBeat.i(12432);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      SQLiteConnectionPool localSQLiteConnectionPool = this.mConnectionPoolLocked;
      ??? = new SQLiteSession(localSQLiteConnectionPool);
      AppMethodBeat.o(12432);
      return ???;
    }
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12501);
    acquireReference();
    try
    {
      localSQLiteStatement = new com/tencent/wcdb/database/SQLiteStatement;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("DELETE FROM ");
      localStringBuilder = localStringBuilder.append(paramString1);
      if (!TextUtils.isEmpty(paramString2))
      {
        paramString1 = " WHERE ".concat(String.valueOf(paramString2));
        localSQLiteStatement.<init>(this, paramString1, paramArrayOfString);
      }
    }
    finally
    {
      try
      {
        int i = localSQLiteStatement.executeUpdateDelete();
        localSQLiteStatement.close();
        return i;
        paramString1 = "";
      }
      finally
      {
        SQLiteStatement localSQLiteStatement;
        localSQLiteStatement.close();
        AppMethodBeat.o(12501);
      }
      AppMethodBeat.o(12501);
    }
    throw paramString1;
  }

  public final void disableWriteAheadLogging()
  {
    AppMethodBeat.i(12520);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if ((this.mConfigurationLocked.openFlags & 0x20000000) == 0)
        AppMethodBeat.o(12520);
      while (true)
      {
        return;
        SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
        localSQLiteDatabaseConfiguration.openFlags &= -536870913;
        try
        {
          this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
          AppMethodBeat.o(12520);
        }
        catch (RuntimeException localRuntimeException)
        {
          localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
          localSQLiteDatabaseConfiguration.openFlags |= 536870912;
          AppMethodBeat.o(12520);
          throw localRuntimeException;
        }
      }
    }
  }

  public final void dump(Printer paramPrinter, boolean paramBoolean)
  {
    AppMethodBeat.i(12532);
    synchronized (this.mLock)
    {
      if (this.mConnectionPoolLocked != null)
        this.mConnectionPoolLocked.dump(paramPrinter, paramBoolean);
      AppMethodBeat.o(12532);
      return;
    }
  }

  public final boolean enableWriteAheadLogging()
  {
    boolean bool = true;
    AppMethodBeat.i(12519);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if ((this.mConfigurationLocked.openFlags & 0x20000000) != 0)
        AppMethodBeat.o(12519);
      while (true)
      {
        return bool;
        if (isReadOnlyLocked())
        {
          AppMethodBeat.o(12519);
          bool = false;
          continue;
        }
        if (this.mConfigurationLocked.isInMemoryDb())
        {
          Log.i("WCDB.SQLiteDatabase", "can't enable WAL for memory databases.");
          AppMethodBeat.o(12519);
          bool = false;
          continue;
        }
        if (this.mHasAttachedDbsLocked)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("this database: ");
          Log.i("WCDB.SQLiteDatabase", this.mConfigurationLocked.label + " has attached databases. can't  enable WAL.");
          AppMethodBeat.o(12519);
          bool = false;
          continue;
        }
        Object localObject2 = this.mConfigurationLocked;
        ((SQLiteDatabaseConfiguration)localObject2).openFlags |= 536870912;
        try
        {
          this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
          AppMethodBeat.o(12519);
        }
        catch (RuntimeException localRuntimeException)
        {
          SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
          localSQLiteDatabaseConfiguration.openFlags &= -536870913;
          AppMethodBeat.o(12519);
          throw localRuntimeException;
        }
      }
    }
  }

  public final void endTransaction()
  {
    AppMethodBeat.i(12440);
    acquireReference();
    try
    {
      getThreadSession().endTransaction(null);
      return;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12440);
    }
  }

  public final void execSQL(String paramString)
  {
    AppMethodBeat.i(12504);
    executeSql(paramString, null, null);
    AppMethodBeat.o(12504);
  }

  public final void execSQL(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(12505);
    executeSql(paramString, paramArrayOfObject, null);
    AppMethodBeat.o(12505);
  }

  public final void execSQL(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12506);
    executeSql(paramString, paramArrayOfObject, paramCancellationSignal);
    AppMethodBeat.o(12506);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(12426);
    try
    {
      dispose(true);
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(12426);
    }
  }

  public final boolean getAsyncCheckpointEnabled()
  {
    AppMethodBeat.i(12517);
    SQLiteCheckpointListener localSQLiteCheckpointListener = getCheckpointCallback();
    boolean bool;
    if ((localSQLiteCheckpointListener != null) && ((localSQLiteCheckpointListener instanceof SQLiteAsyncCheckpointer)))
    {
      bool = true;
      AppMethodBeat.o(12517);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12517);
    }
  }

  // ERROR //
  public final java.util.List<Pair<String, String>> getAttachedDbs()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 12533
    //   5: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 251	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 312	java/util/ArrayList:<init>	()V
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 131	com/tencent/wcdb/database/SQLiteDatabase:mLock	Ljava/lang/Object;
    //   20: astore_3
    //   21: aload_3
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 172	com/tencent/wcdb/database/SQLiteDatabase:mConnectionPoolLocked	Lcom/tencent/wcdb/database/SQLiteConnectionPool;
    //   27: ifnonnull +15 -> 42
    //   30: aload_3
    //   31: monitorexit
    //   32: sipush 12533
    //   35: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: aload_1
    //   39: astore_2
    //   40: aload_2
    //   41: areturn
    //   42: aload_0
    //   43: getfield 277	com/tencent/wcdb/database/SQLiteDatabase:mHasAttachedDbsLocked	Z
    //   46: ifne +38 -> 84
    //   49: new 569	android/util/Pair
    //   52: astore_1
    //   53: aload_1
    //   54: ldc_w 571
    //   57: aload_0
    //   58: getfield 142	com/tencent/wcdb/database/SQLiteDatabase:mConfigurationLocked	Lcom/tencent/wcdb/database/SQLiteDatabaseConfiguration;
    //   61: getfield 574	com/tencent/wcdb/database/SQLiteDatabaseConfiguration:path	Ljava/lang/String;
    //   64: invokespecial 577	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   67: aload_2
    //   68: aload_1
    //   69: invokevirtual 578	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   72: pop
    //   73: aload_3
    //   74: monitorexit
    //   75: sipush 12533
    //   78: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: goto -41 -> 40
    //   84: aload_0
    //   85: invokevirtual 152	com/tencent/wcdb/database/SQLiteDatabase:acquireReference	()V
    //   88: aload_3
    //   89: monitorexit
    //   90: aload_0
    //   91: ldc_w 580
    //   94: aconst_null
    //   95: invokevirtual 584	com/tencent/wcdb/database/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/Object;)Lcom/tencent/wcdb/Cursor;
    //   98: astore_1
    //   99: aload_1
    //   100: invokeinterface 589 1 0
    //   105: ifeq +77 -> 182
    //   108: new 569	android/util/Pair
    //   111: astore_3
    //   112: aload_3
    //   113: aload_1
    //   114: iconst_1
    //   115: invokeinterface 593 2 0
    //   120: aload_1
    //   121: iconst_2
    //   122: invokeinterface 593 2 0
    //   127: invokespecial 577	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   130: aload_2
    //   131: aload_3
    //   132: invokevirtual 578	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   135: pop
    //   136: goto -37 -> 99
    //   139: astore_2
    //   140: aload_1
    //   141: ifnull +9 -> 150
    //   144: aload_1
    //   145: invokeinterface 594 1 0
    //   150: sipush 12533
    //   153: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   156: aload_2
    //   157: athrow
    //   158: astore_2
    //   159: aload_0
    //   160: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   163: sipush 12533
    //   166: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   169: aload_2
    //   170: athrow
    //   171: astore_2
    //   172: aload_3
    //   173: monitorexit
    //   174: sipush 12533
    //   177: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: aload_2
    //   181: athrow
    //   182: aload_1
    //   183: ifnull +9 -> 192
    //   186: aload_1
    //   187: invokeinterface 594 1 0
    //   192: aload_0
    //   193: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   196: sipush 12533
    //   199: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -162 -> 40
    //   205: astore_2
    //   206: aconst_null
    //   207: astore_1
    //   208: goto -68 -> 140
    //
    // Exception table:
    //   from	to	target	type
    //   99	136	139	finally
    //   144	150	158	finally
    //   150	158	158	finally
    //   186	192	158	finally
    //   23	32	171	finally
    //   42	75	171	finally
    //   84	90	171	finally
    //   172	174	171	finally
    //   90	99	205	finally
  }

  public final SQLiteChangeListener getChangeListener()
  {
    AppMethodBeat.i(12524);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      SQLiteChangeListener localSQLiteChangeListener = this.mConnectionPoolLocked.getChangeListener();
      AppMethodBeat.o(12524);
      return localSQLiteChangeListener;
    }
  }

  public final SQLiteCheckpointListener getCheckpointCallback()
  {
    AppMethodBeat.i(12515);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if (!this.mConfigurationLocked.customWALHookEnabled)
      {
        localSQLiteCheckpointListener = null;
        AppMethodBeat.o(12515);
        return localSQLiteCheckpointListener;
      }
      SQLiteCheckpointListener localSQLiteCheckpointListener = this.mConnectionPoolLocked.getCheckpointListener();
      AppMethodBeat.o(12515);
    }
  }

  final String getLabel()
  {
    synchronized (this.mLock)
    {
      String str = this.mConfigurationLocked.label;
      return str;
    }
  }

  public final long getMaximumSize()
  {
    AppMethodBeat.i(12479);
    long l1 = DatabaseUtils.longForQuery(this, "PRAGMA max_page_count;", null);
    long l2 = getPageSize();
    AppMethodBeat.o(12479);
    return l1 * l2;
  }

  public final long getPageSize()
  {
    AppMethodBeat.i(12481);
    long l = DatabaseUtils.longForQuery(this, "PRAGMA page_size;", null);
    AppMethodBeat.o(12481);
    return l;
  }

  public final String getPath()
  {
    synchronized (this.mLock)
    {
      String str = this.mConfigurationLocked.path;
      return str;
    }
  }

  @Deprecated
  public final Map<String, String> getSyncedTables()
  {
    AppMethodBeat.i(12448);
    HashMap localHashMap = new HashMap(0);
    AppMethodBeat.o(12448);
    return localHashMap;
  }

  public final int getSynchronousMode()
  {
    AppMethodBeat.i(12522);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      int i = this.mConfigurationLocked.synchronousMode;
      AppMethodBeat.o(12522);
      return i;
    }
  }

  final int getThreadDefaultConnectionFlags(boolean paramBoolean)
  {
    AppMethodBeat.i(12433);
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      int j = i;
      if (isMainThread())
        j = i | 0x4;
      AppMethodBeat.o(12433);
      return j;
    }
  }

  final SQLiteSession getThreadSession()
  {
    AppMethodBeat.i(12431);
    SQLiteSession localSQLiteSession = (SQLiteSession)this.mThreadSession.get();
    AppMethodBeat.o(12431);
    return localSQLiteSession;
  }

  public final SQLiteTrace getTraceCallback()
  {
    AppMethodBeat.i(12526);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      SQLiteTrace localSQLiteTrace = this.mConnectionPoolLocked.getTraceCallback();
      AppMethodBeat.o(12526);
      return localSQLiteTrace;
    }
  }

  public final int getVersion()
  {
    AppMethodBeat.i(12477);
    int i = Long.valueOf(DatabaseUtils.longForQuery(this, "PRAGMA user_version;", null)).intValue();
    AppMethodBeat.o(12477);
    return i;
  }

  public final boolean inTransaction()
  {
    AppMethodBeat.i(12442);
    acquireReference();
    try
    {
      boolean bool = getThreadSession().hasTransaction();
      return bool;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12442);
    }
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12495);
    try
    {
      l = insertWithOnConflict(paramString1, paramString2, paramContentValues, 0);
      AppMethodBeat.o(12495);
      return l;
    }
    catch (SQLiteDatabaseCorruptException paramString1)
    {
      AppMethodBeat.o(12495);
      throw paramString1;
    }
    catch (SQLException paramString1)
    {
      while (true)
      {
        Log.e("WCDB.SQLiteDatabase", "Error inserting %s: %s", new Object[] { paramContentValues, paramString1 });
        long l = -1L;
        AppMethodBeat.o(12495);
      }
    }
  }

  public final long insertOrThrow(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12496);
    long l = insertWithOnConflict(paramString1, paramString2, paramContentValues, 0);
    AppMethodBeat.o(12496);
    return l;
  }

  // ERROR //
  public final long insertWithOnConflict(String paramString1, String paramString2, ContentValues paramContentValues, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: sipush 12500
    //   6: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokevirtual 152	com/tencent/wcdb/database/SQLiteDatabase:acquireReference	()V
    //   13: new 202	java/lang/StringBuilder
    //   16: astore 6
    //   18: aload 6
    //   20: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   23: aload 6
    //   25: ldc_w 669
    //   28: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload 6
    //   34: getstatic 115	com/tencent/wcdb/database/SQLiteDatabase:CONFLICT_VALUES	[Ljava/lang/String;
    //   37: iload 4
    //   39: aaload
    //   40: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload 6
    //   46: ldc_w 671
    //   49: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload 6
    //   55: aload_1
    //   56: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload 6
    //   62: bipush 40
    //   64: invokevirtual 674	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aconst_null
    //   69: astore_1
    //   70: aload_3
    //   71: ifnull +104 -> 175
    //   74: aload_3
    //   75: invokevirtual 677	android/content/ContentValues:size	()I
    //   78: ifle +97 -> 175
    //   81: aload_3
    //   82: invokevirtual 677	android/content/ContentValues:size	()I
    //   85: istore 4
    //   87: iload 4
    //   89: ifle +203 -> 292
    //   92: iload 4
    //   94: anewarray 128	java/lang/Object
    //   97: astore_2
    //   98: aload_0
    //   99: aload_3
    //   100: invokespecial 679	com/tencent/wcdb/database/SQLiteDatabase:keySet	(Landroid/content/ContentValues;)Ljava/util/Set;
    //   103: invokeinterface 682 1 0
    //   108: astore 7
    //   110: iconst_0
    //   111: istore 8
    //   113: aload 7
    //   115: invokeinterface 260 1 0
    //   120: ifeq +67 -> 187
    //   123: aload 7
    //   125: invokeinterface 264 1 0
    //   130: checkcast 101	java/lang/String
    //   133: astore 9
    //   135: iload 8
    //   137: ifle +44 -> 181
    //   140: ldc_w 684
    //   143: astore_1
    //   144: aload 6
    //   146: aload_1
    //   147: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload 6
    //   153: aload 9
    //   155: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload_2
    //   160: iload 8
    //   162: aload_3
    //   163: aload 9
    //   165: invokevirtual 687	android/content/ContentValues:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   168: aastore
    //   169: iinc 8 1
    //   172: goto -59 -> 113
    //   175: iconst_0
    //   176: istore 4
    //   178: goto -91 -> 87
    //   181: ldc 103
    //   183: astore_1
    //   184: goto -40 -> 144
    //   187: aload 6
    //   189: bipush 41
    //   191: invokevirtual 674	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload 6
    //   197: ldc_w 689
    //   200: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: iload 5
    //   206: istore 8
    //   208: iload 8
    //   210: iload 4
    //   212: if_icmpge +32 -> 244
    //   215: iload 8
    //   217: ifle +20 -> 237
    //   220: ldc_w 691
    //   223: astore_1
    //   224: aload 6
    //   226: aload_1
    //   227: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: iinc 8 1
    //   234: goto -26 -> 208
    //   237: ldc_w 693
    //   240: astore_1
    //   241: goto -17 -> 224
    //   244: aload_2
    //   245: astore_1
    //   246: aload 6
    //   248: bipush 41
    //   250: invokevirtual 674	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: new 282	com/tencent/wcdb/database/SQLiteStatement
    //   257: astore_2
    //   258: aload_2
    //   259: aload_0
    //   260: aload 6
    //   262: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: aload_1
    //   266: invokespecial 285	com/tencent/wcdb/database/SQLiteStatement:<init>	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: aload_2
    //   270: invokevirtual 696	com/tencent/wcdb/database/SQLiteStatement:executeInsert	()J
    //   273: lstore 10
    //   275: aload_2
    //   276: invokevirtual 290	com/tencent/wcdb/database/SQLiteStatement:close	()V
    //   279: aload_0
    //   280: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   283: sipush 12500
    //   286: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: lload 10
    //   291: lreturn
    //   292: new 202	java/lang/StringBuilder
    //   295: astore_3
    //   296: aload_3
    //   297: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   300: aload 6
    //   302: aload_3
    //   303: aload_2
    //   304: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: ldc_w 698
    //   310: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: pop
    //   320: goto -74 -> 246
    //   323: astore_1
    //   324: aload_0
    //   325: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   328: sipush 12500
    //   331: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   334: aload_1
    //   335: athrow
    //   336: astore_1
    //   337: aload_2
    //   338: invokevirtual 290	com/tencent/wcdb/database/SQLiteStatement:close	()V
    //   341: sipush 12500
    //   344: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   347: aload_1
    //   348: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   13	68	323	finally
    //   74	87	323	finally
    //   92	110	323	finally
    //   113	135	323	finally
    //   144	169	323	finally
    //   187	204	323	finally
    //   224	231	323	finally
    //   246	269	323	finally
    //   275	279	323	finally
    //   292	320	323	finally
    //   337	349	323	finally
    //   269	275	336	finally
  }

  // ERROR //
  public final boolean isDatabaseIntegrityOk()
  {
    // Byte code:
    //   0: sipush 12534
    //   3: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 152	com/tencent/wcdb/database/SQLiteDatabase:acquireReference	()V
    //   10: aload_0
    //   11: invokevirtual 701	com/tencent/wcdb/database/SQLiteDatabase:getAttachedDbs	()Ljava/util/List;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnonnull +223 -> 239
    //   19: new 308	java/lang/IllegalStateException
    //   22: astore_1
    //   23: new 202	java/lang/StringBuilder
    //   26: astore_2
    //   27: aload_2
    //   28: ldc_w 703
    //   31: invokespecial 393	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_1
    //   35: aload_2
    //   36: aload_0
    //   37: invokevirtual 704	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   40: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: ldc_w 706
    //   46: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: invokespecial 311	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   55: sipush 12534
    //   58: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: aload_1
    //   62: athrow
    //   63: astore_2
    //   64: new 251	java/util/ArrayList
    //   67: astore_1
    //   68: aload_1
    //   69: invokespecial 312	java/util/ArrayList:<init>	()V
    //   72: new 569	android/util/Pair
    //   75: astore_2
    //   76: aload_2
    //   77: ldc_w 571
    //   80: aload_0
    //   81: invokevirtual 704	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   84: invokespecial 577	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   87: aload_1
    //   88: aload_2
    //   89: invokeinterface 709 2 0
    //   94: pop
    //   95: iconst_0
    //   96: istore_3
    //   97: iload_3
    //   98: aload_1
    //   99: invokeinterface 710 1 0
    //   104: if_icmpge +184 -> 288
    //   107: aload_1
    //   108: iload_3
    //   109: invokeinterface 713 2 0
    //   114: checkcast 569	android/util/Pair
    //   117: astore 4
    //   119: new 202	java/lang/StringBuilder
    //   122: astore_2
    //   123: aload_2
    //   124: ldc_w 715
    //   127: invokespecial 393	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: aload_0
    //   131: aload_2
    //   132: aload 4
    //   134: getfield 718	android/util/Pair:first	Ljava/lang/Object;
    //   137: checkcast 101	java/lang/String
    //   140: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: ldc_w 720
    //   146: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokevirtual 722	com/tencent/wcdb/database/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Lcom/tencent/wcdb/database/SQLiteStatement;
    //   155: astore_2
    //   156: aload_2
    //   157: invokevirtual 725	com/tencent/wcdb/database/SQLiteStatement:simpleQueryForString	()Ljava/lang/String;
    //   160: astore 5
    //   162: aload 5
    //   164: ldc_w 727
    //   167: invokestatic 731	com/tencent/wcdb/DatabaseUtils:objectEquals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   170: ifne +72 -> 242
    //   173: new 202	java/lang/StringBuilder
    //   176: astore_1
    //   177: aload_1
    //   178: ldc_w 733
    //   181: invokespecial 393	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: ldc 54
    //   186: aload_1
    //   187: aload 4
    //   189: getfield 736	android/util/Pair:second	Ljava/lang/Object;
    //   192: checkcast 101	java/lang/String
    //   195: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: ldc_w 738
    //   201: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: aload 5
    //   206: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 740	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: aload_2
    //   216: ifnull +7 -> 223
    //   219: aload_2
    //   220: invokevirtual 290	com/tencent/wcdb/database/SQLiteStatement:close	()V
    //   223: aload_0
    //   224: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   227: sipush 12534
    //   230: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   233: iconst_0
    //   234: istore 6
    //   236: iload 6
    //   238: ireturn
    //   239: goto -144 -> 95
    //   242: aload_2
    //   243: ifnull +7 -> 250
    //   246: aload_2
    //   247: invokevirtual 290	com/tencent/wcdb/database/SQLiteStatement:close	()V
    //   250: iinc 3 1
    //   253: goto -156 -> 97
    //   256: astore_1
    //   257: aconst_null
    //   258: astore_2
    //   259: aload_2
    //   260: ifnull +7 -> 267
    //   263: aload_2
    //   264: invokevirtual 290	com/tencent/wcdb/database/SQLiteStatement:close	()V
    //   267: sipush 12534
    //   270: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   273: aload_1
    //   274: athrow
    //   275: astore_2
    //   276: aload_0
    //   277: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   280: sipush 12534
    //   283: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: aload_2
    //   287: athrow
    //   288: aload_0
    //   289: invokevirtual 168	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
    //   292: iconst_1
    //   293: istore 6
    //   295: sipush 12534
    //   298: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   301: goto -65 -> 236
    //   304: astore_1
    //   305: goto -46 -> 259
    //
    // Exception table:
    //   from	to	target	type
    //   10	15	63	com/tencent/wcdb/database/SQLiteException
    //   19	63	63	com/tencent/wcdb/database/SQLiteException
    //   119	156	256	finally
    //   10	15	275	finally
    //   19	63	275	finally
    //   64	95	275	finally
    //   97	119	275	finally
    //   219	223	275	finally
    //   246	250	275	finally
    //   263	267	275	finally
    //   267	275	275	finally
    //   156	215	304	finally
  }

  public final boolean isDbLockedByCurrentThread()
  {
    AppMethodBeat.i(12443);
    acquireReference();
    try
    {
      boolean bool = getThreadSession().hasConnection();
      return bool;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12443);
    }
  }

  @Deprecated
  public final boolean isDbLockedByOtherThreads()
  {
    return false;
  }

  public final boolean isInMemoryDatabase()
  {
    AppMethodBeat.i(12510);
    synchronized (this.mLock)
    {
      boolean bool = this.mConfigurationLocked.isInMemoryDb();
      AppMethodBeat.o(12510);
      return bool;
    }
  }

  public final boolean isOpen()
  {
    synchronized (this.mLock)
    {
      if (this.mConnectionPoolLocked != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public final boolean isReadOnly()
  {
    AppMethodBeat.i(12509);
    synchronized (this.mLock)
    {
      boolean bool = isReadOnlyLocked();
      AppMethodBeat.o(12509);
      return bool;
    }
  }

  public final boolean isWriteAheadLoggingEnabled()
  {
    AppMethodBeat.i(12521);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if ((this.mConfigurationLocked.openFlags & 0x20000000) != 0)
      {
        bool = true;
        AppMethodBeat.o(12521);
        return bool;
      }
      boolean bool = false;
    }
  }

  @Deprecated
  public final void markTableSyncable(String paramString1, String paramString2)
  {
  }

  @Deprecated
  public final void markTableSyncable(String paramString1, String paramString2, String paramString3)
  {
  }

  public final boolean needUpgrade(int paramInt)
  {
    AppMethodBeat.i(12511);
    boolean bool;
    if (paramInt > getVersion())
    {
      bool = true;
      AppMethodBeat.o(12511);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12511);
    }
  }

  protected final void onAllReferencesReleased()
  {
    AppMethodBeat.i(12427);
    dispose(false);
    AppMethodBeat.o(12427);
  }

  final void onCorruption()
  {
    AppMethodBeat.i(12430);
    this.mErrorHandler.onCorruption(this);
    AppMethodBeat.o(12430);
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString, String paramString2, Object[] paramArrayOfObject, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(12489);
    paramString1 = query(false, paramString1, paramArrayOfString, paramString2, paramArrayOfObject, paramString3, paramString4, paramString5, null);
    AppMethodBeat.o(12489);
    return paramString1;
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString, String paramString2, Object[] paramArrayOfObject, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(12490);
    paramString1 = query(false, paramString1, paramArrayOfString, paramString2, paramArrayOfObject, paramString3, paramString4, paramString5, paramString6);
    AppMethodBeat.o(12490);
    return paramString1;
  }

  public final Cursor query(boolean paramBoolean, String paramString1, String[] paramArrayOfString, String paramString2, Object[] paramArrayOfObject, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(12485);
    paramString1 = queryWithFactory(null, paramBoolean, paramString1, paramArrayOfString, paramString2, paramArrayOfObject, paramString3, paramString4, paramString5, paramString6, null);
    AppMethodBeat.o(12485);
    return paramString1;
  }

  public final Cursor query(boolean paramBoolean, String paramString1, String[] paramArrayOfString, String paramString2, Object[] paramArrayOfObject, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12486);
    paramString1 = queryWithFactory(null, paramBoolean, paramString1, paramArrayOfString, paramString2, paramArrayOfObject, paramString3, paramString4, paramString5, paramString6, paramCancellationSignal);
    AppMethodBeat.o(12486);
    return paramString1;
  }

  public final Cursor queryWithFactory(CursorFactory paramCursorFactory, boolean paramBoolean, String paramString1, String[] paramArrayOfString, String paramString2, Object[] paramArrayOfObject, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(12487);
    paramCursorFactory = queryWithFactory(paramCursorFactory, paramBoolean, paramString1, paramArrayOfString, paramString2, paramArrayOfObject, paramString3, paramString4, paramString5, paramString6, null);
    AppMethodBeat.o(12487);
    return paramCursorFactory;
  }

  public final Cursor queryWithFactory(CursorFactory paramCursorFactory, boolean paramBoolean, String paramString1, String[] paramArrayOfString, String paramString2, Object[] paramArrayOfObject, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12488);
    acquireReference();
    try
    {
      paramCursorFactory = rawQueryWithFactory(paramCursorFactory, SQLiteQueryBuilder.buildQueryString(paramBoolean, paramString1, paramArrayOfString, paramString2, paramString3, paramString4, paramString5, paramString6), paramArrayOfObject, findEditTable(paramString1), paramCancellationSignal);
      return paramCursorFactory;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12488);
    }
    throw paramCursorFactory;
  }

  public final Cursor rawQuery(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(12491);
    paramString = rawQueryWithFactory(null, paramString, paramArrayOfObject, null, null);
    AppMethodBeat.o(12491);
    return paramString;
  }

  public final Cursor rawQuery(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12492);
    paramString = rawQueryWithFactory(null, paramString, paramArrayOfObject, null, paramCancellationSignal);
    AppMethodBeat.o(12492);
    return paramString;
  }

  public final Cursor rawQueryWithFactory(CursorFactory paramCursorFactory, String paramString1, Object[] paramArrayOfObject, String paramString2)
  {
    AppMethodBeat.i(12493);
    paramCursorFactory = rawQueryWithFactory(paramCursorFactory, paramString1, paramArrayOfObject, paramString2, null);
    AppMethodBeat.o(12493);
    return paramCursorFactory;
  }

  public final Cursor rawQueryWithFactory(CursorFactory paramCursorFactory, String paramString1, Object[] paramArrayOfObject, String paramString2, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12494);
    acquireReference();
    try
    {
      SQLiteDirectCursorDriver localSQLiteDirectCursorDriver = new com/tencent/wcdb/database/SQLiteDirectCursorDriver;
      localSQLiteDirectCursorDriver.<init>(this, paramString1, paramString2, paramCancellationSignal);
      if (paramCursorFactory != null);
      while (true)
      {
        paramCursorFactory = localSQLiteDirectCursorDriver.query(paramCursorFactory, paramArrayOfObject);
        return paramCursorFactory;
        paramCursorFactory = this.mCursorFactory;
      }
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12494);
    }
    throw paramCursorFactory;
  }

  public final void releaseNativeConnection(long paramLong, Exception paramException)
  {
    AppMethodBeat.i(12536);
    getThreadSession().releaseConnectionForNativeHandle(paramException);
    AppMethodBeat.o(12536);
  }

  public final void reopenReadWrite()
  {
    AppMethodBeat.i(12472);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if (!isReadOnlyLocked())
        AppMethodBeat.o(12472);
      while (true)
      {
        return;
        int i = this.mConfigurationLocked.openFlags;
        this.mConfigurationLocked.openFlags = (this.mConfigurationLocked.openFlags & 0xFFFFFFFE | 0x0);
        try
        {
          this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
          AppMethodBeat.o(12472);
        }
        catch (RuntimeException localRuntimeException)
        {
          this.mConfigurationLocked.openFlags = i;
          AppMethodBeat.o(12472);
          throw localRuntimeException;
        }
      }
    }
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12497);
    try
    {
      l = insertWithOnConflict(paramString1, paramString2, paramContentValues, 5);
      AppMethodBeat.o(12497);
      return l;
    }
    catch (SQLiteDatabaseCorruptException paramString1)
    {
      AppMethodBeat.o(12497);
      throw paramString1;
    }
    catch (SQLException paramString1)
    {
      while (true)
      {
        Log.e("WCDB.SQLiteDatabase", "Error inserting ".concat(String.valueOf(paramContentValues)), new Object[] { paramString1 });
        long l = -1L;
        AppMethodBeat.o(12497);
      }
    }
  }

  public final long replaceOrThrow(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12498);
    long l = insertWithOnConflict(paramString1, paramString2, paramContentValues, 5);
    AppMethodBeat.o(12498);
    return l;
  }

  public final void setAsyncCheckpointEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(12518);
    if (paramBoolean);
    for (SQLiteAsyncCheckpointer localSQLiteAsyncCheckpointer = new SQLiteAsyncCheckpointer(); ; localSQLiteAsyncCheckpointer = null)
    {
      setCheckpointCallback(localSQLiteAsyncCheckpointer);
      AppMethodBeat.o(12518);
      return;
    }
  }

  public final void setChangeListener(SQLiteChangeListener paramSQLiteChangeListener, boolean paramBoolean)
  {
    AppMethodBeat.i(12525);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      this.mConnectionPoolLocked.setChangeListener(paramSQLiteChangeListener, paramBoolean);
      AppMethodBeat.o(12525);
      return;
    }
  }

  public final void setCheckpointCallback(SQLiteCheckpointListener paramSQLiteCheckpointListener)
  {
    boolean bool1 = true;
    AppMethodBeat.i(12516);
    if (paramSQLiteCheckpointListener != null);
    label119: for (boolean bool2 = true; ; bool2 = false)
      synchronized (this.mLock)
      {
        while (true)
        {
          throwIfNotOpenLocked();
          if (this.mConfigurationLocked.customWALHookEnabled != bool2)
            this.mConfigurationLocked.customWALHookEnabled = bool2;
          try
          {
            this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            this.mConnectionPoolLocked.setCheckpointListener(paramSQLiteCheckpointListener);
            AppMethodBeat.o(12516);
            return;
            bool2 = false;
          }
          catch (RuntimeException localRuntimeException)
          {
            paramSQLiteCheckpointListener = this.mConfigurationLocked;
            if (bool2)
              break label119;
          }
        }
        bool2 = bool1;
        paramSQLiteCheckpointListener.customWALHookEnabled = bool2;
        AppMethodBeat.o(12516);
        throw localRuntimeException;
      }
  }

  public final void setForeignKeyConstraintsEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(12514);
    while (true)
    {
      synchronized (this.mLock)
      {
        throwIfNotOpenLocked();
        if (this.mConfigurationLocked.foreignKeyConstraintsEnabled == paramBoolean)
        {
          AppMethodBeat.o(12514);
          return;
        }
        this.mConfigurationLocked.foreignKeyConstraintsEnabled = paramBoolean;
        SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration;
        try
        {
          this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
          AppMethodBeat.o(12514);
        }
        catch (RuntimeException localRuntimeException)
        {
          localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
          if (paramBoolean)
            break label107;
        }
        paramBoolean = true;
        localSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled = paramBoolean;
        AppMethodBeat.o(12514);
        throw localRuntimeException;
      }
      label107: paramBoolean = false;
    }
  }

  public final void setLocale(Locale paramLocale)
  {
    AppMethodBeat.i(12512);
    if (paramLocale == null)
    {
      paramLocale = new IllegalArgumentException("locale must not be null.");
      AppMethodBeat.o(12512);
      throw paramLocale;
    }
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      Locale localLocale = this.mConfigurationLocked.locale;
      this.mConfigurationLocked.locale = paramLocale;
      try
      {
        this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
        AppMethodBeat.o(12512);
        return;
      }
      catch (RuntimeException paramLocale)
      {
        this.mConfigurationLocked.locale = localLocale;
        AppMethodBeat.o(12512);
        throw paramLocale;
      }
    }
  }

  @Deprecated
  public final void setLockingEnabled(boolean paramBoolean)
  {
  }

  public final void setMaxSqlCacheSize(int paramInt)
  {
    AppMethodBeat.i(12513);
    if ((paramInt > 100) || (paramInt < 0))
    {
      ??? = new IllegalStateException("expected value between 0 and 100");
      AppMethodBeat.o(12513);
      throw ((Throwable)???);
    }
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      int i = this.mConfigurationLocked.maxSqlCacheSize;
      this.mConfigurationLocked.maxSqlCacheSize = paramInt;
      try
      {
        this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
        AppMethodBeat.o(12513);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        this.mConfigurationLocked.maxSqlCacheSize = i;
        AppMethodBeat.o(12513);
        throw localRuntimeException;
      }
    }
  }

  public final long setMaximumSize(long paramLong)
  {
    AppMethodBeat.i(12480);
    long l1 = getPageSize();
    long l2 = paramLong / l1;
    long l3 = l2;
    if (paramLong % l1 != 0L)
      l3 = l2 + 1L;
    paramLong = DatabaseUtils.longForQuery(this, "PRAGMA max_page_count = ".concat(String.valueOf(l3)), null);
    AppMethodBeat.o(12480);
    return paramLong * l1;
  }

  public final void setPageSize(long paramLong)
  {
    AppMethodBeat.i(12482);
    execSQL("PRAGMA page_size = ".concat(String.valueOf(paramLong)));
    AppMethodBeat.o(12482);
  }

  public final void setSynchronousMode(int paramInt)
  {
    AppMethodBeat.i(12523);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      int i = this.mConfigurationLocked.synchronousMode;
      if (i != paramInt)
        this.mConfigurationLocked.synchronousMode = paramInt;
      try
      {
        this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
        AppMethodBeat.o(12523);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        this.mConfigurationLocked.synchronousMode = i;
        AppMethodBeat.o(12523);
        throw localRuntimeException;
      }
    }
  }

  public final void setTraceCallback(SQLiteTrace paramSQLiteTrace)
  {
    AppMethodBeat.i(12527);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      this.mConnectionPoolLocked.setTraceCallback(paramSQLiteTrace);
      AppMethodBeat.o(12527);
      return;
    }
  }

  public final void setTransactionSuccessful()
  {
    AppMethodBeat.i(12441);
    acquireReference();
    try
    {
      getThreadSession().setTransactionSuccessful();
      return;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12441);
    }
  }

  public final void setVersion(int paramInt)
  {
    AppMethodBeat.i(12478);
    execSQL("PRAGMA user_version = ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(12478);
  }

  public final String toString()
  {
    AppMethodBeat.i(12537);
    String str = "SQLiteDatabase: " + getPath();
    AppMethodBeat.o(12537);
    return str;
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12502);
    int i = updateWithOnConflict(paramString1, paramContentValues, paramString2, paramArrayOfString, 0);
    AppMethodBeat.o(12502);
    return i;
  }

  public final int updateWithOnConflict(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(12503);
    if ((paramContentValues == null) || (paramContentValues.size() == 0))
    {
      paramString1 = new IllegalArgumentException("Empty values");
      AppMethodBeat.o(12503);
      throw paramString1;
    }
    acquireReference();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(120);
      localStringBuilder.append("UPDATE ");
      localStringBuilder.append(CONFLICT_VALUES[paramInt]);
      localStringBuilder.append(paramString1);
      localStringBuilder.append(" SET ");
      paramInt = paramContentValues.size();
      int i;
      Object[] arrayOfObject;
      int j;
      label126: String str;
      if (paramArrayOfString == null)
      {
        i = paramInt;
        arrayOfObject = new Object[i];
        Iterator localIterator = keySet(paramContentValues).iterator();
        j = 0;
        if (!localIterator.hasNext())
          break label215;
        str = (String)localIterator.next();
        if (j <= 0)
          break label209;
      }
      label209: for (paramString1 = ","; ; paramString1 = "")
      {
        localStringBuilder.append(paramString1);
        localStringBuilder.append(str);
        arrayOfObject[j] = paramContentValues.get(str);
        localStringBuilder.append("=?");
        j++;
        break label126;
        i = paramArrayOfString.length + paramInt;
        break;
      }
      label215: if (paramArrayOfString != null)
        for (j = paramInt; j < i; j++)
          arrayOfObject[j] = paramArrayOfString[(j - paramInt)];
      if (!TextUtils.isEmpty(paramString2))
      {
        localStringBuilder.append(" WHERE ");
        localStringBuilder.append(paramString2);
      }
      paramString1 = new com/tencent/wcdb/database/SQLiteStatement;
      paramString1.<init>(this, localStringBuilder.toString(), arrayOfObject);
      try
      {
        paramInt = paramString1.executeUpdateDelete();
        paramString1.close();
        return paramInt;
      }
      finally
      {
      }
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12503);
    }
    throw paramString1;
  }

  public final Pair<Integer, Integer> walCheckpoint(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(12508);
    acquireReference();
    int i;
    if (paramBoolean)
      i = 2;
    try
    {
      paramString = getThreadSession().walCheckpoint(paramString, i);
      return paramString;
      i = 0;
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12508);
    }
  }

  @Deprecated
  public final boolean yieldIfContended()
  {
    AppMethodBeat.i(12444);
    boolean bool = yieldIfContendedHelper(false, -1L);
    AppMethodBeat.o(12444);
    return bool;
  }

  public final boolean yieldIfContendedSafely()
  {
    AppMethodBeat.i(12445);
    boolean bool = yieldIfContendedHelper(true, -1L);
    AppMethodBeat.o(12445);
    return bool;
  }

  public final boolean yieldIfContendedSafely(long paramLong)
  {
    AppMethodBeat.i(12446);
    boolean bool = yieldIfContendedHelper(true, paramLong);
    AppMethodBeat.o(12446);
    return bool;
  }

  public static abstract interface CursorFactory
  {
    public abstract Cursor newCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteProgram paramSQLiteProgram);

    public abstract SQLiteProgram newQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal);
  }

  public static abstract interface CustomFunction
  {
    public abstract void callback(String[] paramArrayOfString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteDatabase
 * JD-Core Version:    0.6.2
 */