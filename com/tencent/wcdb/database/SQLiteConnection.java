package com.tencent.wcdb.database;

import android.annotation.SuppressLint;
import android.os.Process;
import android.util.Pair;
import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.extension.SQLiteExtension;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.CancellationSignal.OnCancelListener;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.LruCache;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SQLiteConnection
  implements CancellationSignal.OnCancelListener
{
  private static final boolean DEBUG = false;
  private static final byte[] EMPTY_BYTE_ARRAY;
  private static final String[] EMPTY_STRING_ARRAY;
  private static final String[] HMAC_ALGO_MAPPING;
  private static final String[] PBKDF2_ALGO_MAPPING;
  private static final String TAG = "WCDB.SQLiteConnection";
  private static final Pattern TRIM_SQL_PATTERN;
  private StackTraceElement[] mAcquiredStack;
  private Thread mAcquiredThread;
  private int mAcquiredTid;
  private long mAcquiredTimestamp;
  private int mCancellationSignalAttachCount;
  private SQLiteCipherSpec mCipher;
  private final SQLiteDatabaseConfiguration mConfiguration;
  private final int mConnectionId;
  private long mConnectionPtr;
  private final boolean mIsPrimaryConnection;
  private final boolean mIsReadOnlyConnection;
  private int mNativeHandleCount;
  private Operation mNativeOperation;
  private boolean mOnlyAllowReadOnlyOperations;
  private byte[] mPassword;
  private final SQLiteConnectionPool mPool;
  private final PreparedStatementCache mPreparedStatementCache;
  private PreparedStatement mPreparedStatementPool;
  private final OperationLog mRecentOperations;

  static
  {
    AppMethodBeat.i(12356);
    EMPTY_STRING_ARRAY = new String[0];
    EMPTY_BYTE_ARRAY = new byte[0];
    TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");
    HMAC_ALGO_MAPPING = new String[] { "HMAC_SHA1", "HMAC_SHA256", "HMAC_SHA512" };
    PBKDF2_ALGO_MAPPING = new String[] { "PBKDF2_HMAC_SHA1", "PBKDF2_HMAC_SHA256", "PBKDF2_HMAC_SHA512" };
    AppMethodBeat.o(12356);
  }

  private SQLiteConnection(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt, boolean paramBoolean, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec)
  {
    AppMethodBeat.i(12297);
    this.mRecentOperations = new OperationLog(null);
    this.mPassword = paramArrayOfByte;
    if (paramSQLiteCipherSpec == null)
    {
      paramArrayOfByte = localObject;
      this.mCipher = paramArrayOfByte;
      this.mPool = paramSQLiteConnectionPool;
      this.mConfiguration = new SQLiteDatabaseConfiguration(paramSQLiteDatabaseConfiguration);
      this.mConnectionId = paramInt;
      this.mIsPrimaryConnection = paramBoolean;
      if ((paramSQLiteDatabaseConfiguration.openFlags & 0x1) == 0)
        break label133;
    }
    label133: for (paramBoolean = true; ; paramBoolean = false)
    {
      this.mIsReadOnlyConnection = paramBoolean;
      this.mPreparedStatementCache = new PreparedStatementCache(this.mConfiguration.maxSqlCacheSize);
      AppMethodBeat.o(12297);
      return;
      paramArrayOfByte = new SQLiteCipherSpec(paramSQLiteCipherSpec);
      break;
    }
  }

  private void applyBlockGuardPolicy(PreparedStatement paramPreparedStatement)
  {
  }

  private void attachCancellationSignal(CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12332);
    if (paramCancellationSignal != null)
    {
      paramCancellationSignal.throwIfCanceled();
      this.mCancellationSignalAttachCount += 1;
      if (this.mCancellationSignalAttachCount == 1)
      {
        nativeResetCancel(this.mConnectionPtr, true);
        paramCancellationSignal.setOnCancelListener(this);
      }
    }
    AppMethodBeat.o(12332);
  }

  private void bindArguments(PreparedStatement paramPreparedStatement, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(12335);
    if (paramArrayOfObject != null);
    for (int i = paramArrayOfObject.length; i != paramPreparedStatement.mNumParameters; i = 0)
    {
      paramPreparedStatement = new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + paramPreparedStatement.mNumParameters + " bind arguments but " + i + " were provided.");
      AppMethodBeat.o(12335);
      throw paramPreparedStatement;
    }
    if (i == 0)
      AppMethodBeat.o(12335);
    while (true)
    {
      return;
      long l1 = paramPreparedStatement.getPtr();
      int j = 0;
      if (j < i)
      {
        paramPreparedStatement = paramArrayOfObject[j];
        long l3;
        switch (DatabaseUtils.getTypeOfObject(paramPreparedStatement))
        {
        case 3:
        default:
          if ((paramPreparedStatement instanceof Boolean))
          {
            long l2 = this.mConnectionPtr;
            if (((Boolean)paramPreparedStatement).booleanValue())
            {
              l3 = 1L;
              label170: nativeBindLong(l2, l1, j + 1, l3);
            }
          }
          break;
        case 0:
        case 1:
        case 2:
        case 4:
        }
        while (true)
        {
          j++;
          break;
          nativeBindNull(this.mConnectionPtr, l1, j + 1);
          continue;
          nativeBindLong(this.mConnectionPtr, l1, j + 1, ((Number)paramPreparedStatement).longValue());
          continue;
          nativeBindDouble(this.mConnectionPtr, l1, j + 1, ((Number)paramPreparedStatement).doubleValue());
          continue;
          nativeBindBlob(this.mConnectionPtr, l1, j + 1, (byte[])paramPreparedStatement);
          continue;
          l3 = 0L;
          break label170;
          nativeBindString(this.mConnectionPtr, l1, j + 1, paramPreparedStatement.toString());
        }
      }
      AppMethodBeat.o(12335);
    }
  }

  private void detachCancellationSignal(CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12333);
    if (paramCancellationSignal != null)
    {
      this.mCancellationSignalAttachCount -= 1;
      if (this.mCancellationSignalAttachCount == 0)
      {
        paramCancellationSignal.setOnCancelListener(null);
        nativeResetCancel(this.mConnectionPtr, false);
      }
    }
    AppMethodBeat.o(12333);
  }

  private void dispose(boolean paramBoolean)
  {
    AppMethodBeat.i(12304);
    int i;
    if (this.mConnectionPtr != 0L)
      i = this.mRecentOperations.beginOperation("close", null, null).mCookie;
    while (true)
    {
      try
      {
        this.mPreparedStatementCache.evictAll();
        nativeClose(this.mConnectionPtr);
        this.mConnectionPtr = 0L;
        return;
      }
      finally
      {
        this.mRecentOperations.endOperation(i);
        AppMethodBeat.o(12304);
      }
      AppMethodBeat.o(12304);
    }
  }

  private void finalizePreparedStatement(PreparedStatement paramPreparedStatement)
  {
    AppMethodBeat.i(12331);
    nativeFinalizeStatement(this.mConnectionPtr, paramPreparedStatement.getPtr());
    recyclePreparedStatement(paramPreparedStatement);
    AppMethodBeat.o(12331);
  }

  private SQLiteDebug.DbStats getMainDbStatsUnsafe(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(12345);
    String str = this.mConfiguration.path;
    Object localObject = str;
    if (!this.mIsPrimaryConnection)
      localObject = str + " (" + this.mConnectionId + ")";
    localObject = new SQLiteDebug.DbStats((String)localObject, paramLong1, paramLong2, paramInt, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
    AppMethodBeat.o(12345);
    return localObject;
  }

  private static boolean isCacheable(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 2)
      if (paramInt != 1)
        break label18;
    label18: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  private static native void nativeBindBlob(long paramLong1, long paramLong2, int paramInt, byte[] paramArrayOfByte);

  private static native void nativeBindDouble(long paramLong1, long paramLong2, int paramInt, double paramDouble);

  private static native void nativeBindLong(long paramLong1, long paramLong2, int paramInt, long paramLong3);

  private static native void nativeBindNull(long paramLong1, long paramLong2, int paramInt);

  private static native void nativeBindString(long paramLong1, long paramLong2, int paramInt, String paramString);

  private static native void nativeCancel(long paramLong);

  private static native void nativeClose(long paramLong);

  private static native void nativeExecute(long paramLong1, long paramLong2);

  private static native int nativeExecuteForChangedRowCount(long paramLong1, long paramLong2);

  private static native long nativeExecuteForCursorWindow(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, boolean paramBoolean);

  private static native long nativeExecuteForLastInsertedRowId(long paramLong1, long paramLong2);

  private static native long nativeExecuteForLong(long paramLong1, long paramLong2);

  private static native String nativeExecuteForString(long paramLong1, long paramLong2);

  private static native void nativeFinalizeStatement(long paramLong1, long paramLong2);

  private static native int nativeGetColumnCount(long paramLong1, long paramLong2);

  private static native String nativeGetColumnName(long paramLong1, long paramLong2, int paramInt);

  private static native int nativeGetDbLookaside(long paramLong);

  private static native int nativeGetParameterCount(long paramLong1, long paramLong2);

  private static native boolean nativeIsReadOnly(long paramLong1, long paramLong2);

  private native long nativeOpen(String paramString1, int paramInt, String paramString2);

  private static native long nativePrepareStatement(long paramLong, String paramString);

  private static native void nativeRegisterCustomFunction(long paramLong, SQLiteCustomFunction paramSQLiteCustomFunction);

  private static native void nativeRegisterLocalizedCollators(long paramLong, String paramString);

  private static native void nativeResetCancel(long paramLong, boolean paramBoolean);

  private static native void nativeResetStatement(long paramLong1, long paramLong2, boolean paramBoolean);

  private static native long nativeSQLiteHandle(long paramLong, boolean paramBoolean);

  private static native void nativeSetKey(long paramLong, byte[] paramArrayOfByte);

  private static native void nativeSetUpdateNotification(long paramLong, boolean paramBoolean1, boolean paramBoolean2);

  private static native void nativeSetWalHook(long paramLong);

  private static native long nativeWalCheckpoint(long paramLong, String paramString);

  private void notifyChange(String paramString1, String paramString2, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    AppMethodBeat.i(12316);
    this.mPool.notifyChanges(paramString1, paramString2, paramArrayOfLong1, paramArrayOfLong2, paramArrayOfLong3);
    AppMethodBeat.o(12316);
  }

  private void notifyCheckpoint(String paramString, int paramInt)
  {
    AppMethodBeat.i(12307);
    this.mPool.notifyCheckpoint(paramString, paramInt);
    AppMethodBeat.o(12307);
  }

  private PreparedStatement obtainPreparedStatement(String paramString, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(12347);
    PreparedStatement localPreparedStatement = this.mPreparedStatementPool;
    if (localPreparedStatement != null)
    {
      this.mPreparedStatementPool = localPreparedStatement.mPoolNext;
      PreparedStatement.access$702(localPreparedStatement, null);
      PreparedStatement.access$502(localPreparedStatement, false);
    }
    while (true)
    {
      PreparedStatement.access$602(localPreparedStatement, paramString);
      PreparedStatement.access$802(localPreparedStatement, paramLong);
      PreparedStatement.access$202(localPreparedStatement, paramInt1);
      PreparedStatement.access$102(localPreparedStatement, paramInt2);
      PreparedStatement.access$302(localPreparedStatement, paramBoolean);
      AppMethodBeat.o(12347);
      return localPreparedStatement;
      localPreparedStatement = new PreparedStatement(this);
    }
  }

  static SQLiteConnection open(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt, boolean paramBoolean, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec)
  {
    AppMethodBeat.i(12301);
    paramSQLiteConnectionPool = new SQLiteConnection(paramSQLiteConnectionPool, paramSQLiteDatabaseConfiguration, paramInt, paramBoolean, paramArrayOfByte, paramSQLiteCipherSpec);
    try
    {
      paramSQLiteConnectionPool.open();
      AppMethodBeat.o(12301);
      return paramSQLiteConnectionPool;
    }
    catch (SQLiteException paramSQLiteDatabaseConfiguration)
    {
      SQLiteDebug.collectLastIOTraceStats(paramSQLiteConnectionPool);
      paramSQLiteConnectionPool.dispose(false);
      AppMethodBeat.o(12301);
    }
    throw paramSQLiteDatabaseConfiguration;
  }

  private void open()
  {
    AppMethodBeat.i(12303);
    this.mConnectionPtr = nativeOpen(this.mConfiguration.path, this.mConfiguration.openFlags, this.mConfiguration.vfsName);
    if ((this.mPassword != null) && (this.mPassword.length == 0))
      this.mPassword = null;
    if (this.mPassword != null)
    {
      nativeSetKey(this.mConnectionPtr, this.mPassword);
      setCipherSpec();
    }
    setPageSize();
    setReadOnlyFromConfiguration();
    setForeignKeyModeFromConfiguration();
    setWalModeFromConfiguration();
    setSyncModeFromConfiguration();
    setJournalSizeLimit();
    setCheckpointStrategy();
    setLocaleFromConfiguration();
    long l1 = WCDBInitializationProbe.apiEnv;
    long l2 = nativeSQLiteHandle(this.mConnectionPtr, true);
    try
    {
      Iterator localIterator = this.mConfiguration.extensions.iterator();
      while (localIterator.hasNext())
        ((SQLiteExtension)localIterator.next()).initialize(l2, l1);
    }
    finally
    {
      nativeSQLiteHandle(this.mConnectionPtr, false);
      AppMethodBeat.o(12303);
    }
    nativeSQLiteHandle(this.mConnectionPtr, false);
    setUpdateNotificationFromConfiguration();
    AppMethodBeat.o(12303);
  }

  private void recyclePreparedStatement(PreparedStatement paramPreparedStatement)
  {
    AppMethodBeat.i(12348);
    PreparedStatement.access$602(paramPreparedStatement, null);
    PreparedStatement.access$702(paramPreparedStatement, this.mPreparedStatementPool);
    this.mPreparedStatementPool = paramPreparedStatement;
    AppMethodBeat.o(12348);
  }

  private void resetStatement(PreparedStatement paramPreparedStatement, boolean paramBoolean)
  {
    AppMethodBeat.i(12336);
    nativeResetStatement(this.mConnectionPtr, paramPreparedStatement.getPtr(), paramBoolean);
    AppMethodBeat.o(12336);
  }

  private void setCheckpointStrategy()
  {
    AppMethodBeat.i(12308);
    if ((!this.mConfiguration.isInMemoryDb()) && (!this.mIsReadOnlyConnection))
      if (this.mConfiguration.customWALHookEnabled)
      {
        nativeSetWalHook(this.mConnectionPtr);
        AppMethodBeat.o(12308);
      }
    while (true)
    {
      return;
      if (executeForLong("PRAGMA wal_autocheckpoint", null, null) != 100L)
        executeForLong("PRAGMA wal_autocheckpoint=100", null, null);
      AppMethodBeat.o(12308);
    }
  }

  private void setCipherSpec()
  {
    AppMethodBeat.i(12306);
    if (this.mCipher != null)
    {
      if (this.mCipher.kdfIteration != 0)
        execute("PRAGMA kdf_iter=" + this.mCipher.kdfIteration, null, null);
      execute("PRAGMA cipher_use_hmac=" + this.mCipher.hmacEnabled, null, null);
      if (this.mCipher.hmacAlgorithm != -1)
        execute("PRAGMA cipher_hmac_algorithm=" + HMAC_ALGO_MAPPING[this.mCipher.hmacAlgorithm], null, null);
      if (this.mCipher.kdfAlgorithm != -1)
        execute("PRAGMA cipher_kdf_algorithm=" + PBKDF2_ALGO_MAPPING[this.mCipher.kdfAlgorithm], null, null);
    }
    AppMethodBeat.o(12306);
  }

  private void setForeignKeyModeFromConfiguration()
  {
    AppMethodBeat.i(12310);
    if (!this.mIsReadOnlyConnection)
      if (!this.mConfiguration.foreignKeyConstraintsEnabled)
        break label62;
    label62: for (long l = 1L; ; l = 0L)
    {
      if (executeForLong("PRAGMA foreign_keys", null, null) != l)
        execute("PRAGMA foreign_keys=".concat(String.valueOf(l)), null, null);
      AppMethodBeat.o(12310);
      return;
    }
  }

  private void setJournalMode(String paramString)
  {
    AppMethodBeat.i(12313);
    String str = executeForString("PRAGMA journal_mode", null, null);
    if (!str.equalsIgnoreCase(paramString));
    while (true)
    {
      try
      {
        boolean bool = executeForString("PRAGMA journal_mode=".concat(String.valueOf(paramString)), null, null).equalsIgnoreCase(paramString);
        if (bool)
        {
          AppMethodBeat.o(12313);
          return;
        }
      }
      catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
      {
        Log.w("WCDB.SQLiteConnection", "Could not change the database journal mode of '" + this.mConfiguration.label + "' from '" + str + "' to '" + paramString + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
      }
      AppMethodBeat.o(12313);
    }
  }

  private void setJournalSizeLimit()
  {
    AppMethodBeat.i(12309);
    if ((!this.mConfiguration.isInMemoryDb()) && (!this.mIsReadOnlyConnection) && (executeForLong("PRAGMA journal_size_limit", null, null) != 524288L))
      executeForLong("PRAGMA journal_size_limit=524288", null, null);
    AppMethodBeat.o(12309);
  }

  // ERROR //
  private void setLocaleFromConfiguration()
  {
    // Byte code:
    //   0: sipush 12314
    //   3: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 131	com/tencent/wcdb/database/SQLiteConnection:mConfiguration	Lcom/tencent/wcdb/database/SQLiteDatabaseConfiguration;
    //   10: astore_1
    //   11: aload_1
    //   12: aload_1
    //   13: getfield 138	com/tencent/wcdb/database/SQLiteDatabaseConfiguration:openFlags	I
    //   16: bipush 16
    //   18: ior
    //   19: putfield 138	com/tencent/wcdb/database/SQLiteDatabaseConfiguration:openFlags	I
    //   22: aload_0
    //   23: getfield 131	com/tencent/wcdb/database/SQLiteConnection:mConfiguration	Lcom/tencent/wcdb/database/SQLiteDatabaseConfiguration;
    //   26: getfield 138	com/tencent/wcdb/database/SQLiteDatabaseConfiguration:openFlags	I
    //   29: bipush 16
    //   31: iand
    //   32: ifeq +10 -> 42
    //   35: sipush 12314
    //   38: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: return
    //   42: aload_0
    //   43: getfield 131	com/tencent/wcdb/database/SQLiteConnection:mConfiguration	Lcom/tencent/wcdb/database/SQLiteDatabaseConfiguration;
    //   46: getfield 621	com/tencent/wcdb/database/SQLiteDatabaseConfiguration:locale	Ljava/util/Locale;
    //   49: invokevirtual 624	java/util/Locale:toString	()Ljava/lang/String;
    //   52: astore_1
    //   53: aload_0
    //   54: getfield 206	com/tencent/wcdb/database/SQLiteConnection:mConnectionPtr	J
    //   57: aload_1
    //   58: invokestatic 626	com/tencent/wcdb/database/SQLiteConnection:nativeRegisterLocalizedCollators	(JLjava/lang/String;)V
    //   61: aload_0
    //   62: getfield 140	com/tencent/wcdb/database/SQLiteConnection:mIsReadOnlyConnection	Z
    //   65: ifeq +12 -> 77
    //   68: sipush 12314
    //   71: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: goto -33 -> 41
    //   77: aload_0
    //   78: ldc_w 628
    //   81: aconst_null
    //   82: aconst_null
    //   83: invokevirtual 542	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   86: aload_0
    //   87: ldc_w 630
    //   90: aconst_null
    //   91: aconst_null
    //   92: invokevirtual 583	com/tencent/wcdb/database/SQLiteConnection:executeForString	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)Ljava/lang/String;
    //   95: astore_2
    //   96: aload_2
    //   97: ifnull +22 -> 119
    //   100: aload_2
    //   101: aload_1
    //   102: invokevirtual 634	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   105: istore_3
    //   106: iload_3
    //   107: ifeq +12 -> 119
    //   110: sipush 12314
    //   113: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: goto -75 -> 41
    //   119: aload_0
    //   120: ldc_w 636
    //   123: aconst_null
    //   124: aconst_null
    //   125: invokevirtual 542	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   128: aload_0
    //   129: ldc_w 638
    //   132: aconst_null
    //   133: aconst_null
    //   134: invokevirtual 542	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   137: aload_0
    //   138: ldc_w 640
    //   141: iconst_1
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload_1
    //   148: aastore
    //   149: aconst_null
    //   150: invokevirtual 542	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   153: aload_0
    //   154: ldc_w 642
    //   157: aconst_null
    //   158: aconst_null
    //   159: invokevirtual 542	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   162: aload_0
    //   163: ldc_w 644
    //   166: aconst_null
    //   167: aconst_null
    //   168: invokevirtual 542	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   171: sipush 12314
    //   174: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: goto -136 -> 41
    //   180: astore_2
    //   181: new 434	com/tencent/wcdb/database/SQLiteException
    //   184: dup
    //   185: new 222	java/lang/StringBuilder
    //   188: dup
    //   189: ldc_w 646
    //   192: invokespecial 227	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   195: aload_0
    //   196: getfield 131	com/tencent/wcdb/database/SQLiteConnection:mConfiguration	Lcom/tencent/wcdb/database/SQLiteDatabaseConfiguration;
    //   199: getfield 597	com/tencent/wcdb/database/SQLiteDatabaseConfiguration:label	Ljava/lang/String;
    //   202: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: ldc_w 601
    //   208: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload_1
    //   212: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: ldc_w 648
    //   218: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual 242	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: aload_2
    //   225: invokespecial 651	com/tencent/wcdb/database/SQLiteException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   228: astore_1
    //   229: sipush 12314
    //   232: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   235: aload_1
    //   236: athrow
    //   237: astore_2
    //   238: aload_0
    //   239: ldc_w 653
    //   242: aconst_null
    //   243: aconst_null
    //   244: invokevirtual 542	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   247: sipush 12314
    //   250: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   253: aload_2
    //   254: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   77	96	180	java/lang/RuntimeException
    //   100	106	180	java/lang/RuntimeException
    //   119	128	180	java/lang/RuntimeException
    //   162	177	180	java/lang/RuntimeException
    //   238	255	180	java/lang/RuntimeException
    //   128	162	237	finally
  }

  private void setPageSize()
  {
    AppMethodBeat.i(12305);
    String str;
    long l;
    if (!this.mConfiguration.isInMemoryDb())
    {
      if (this.mPassword == null)
        break label110;
      str = "PRAGMA cipher_page_size";
      if ((this.mCipher != null) && (this.mCipher.pageSize > 0))
        break label98;
      l = SQLiteGlobal.defaultPageSize;
    }
    while (true)
    {
      if (executeForLong(str, null, null) != l)
        execute(str + "=" + l, null, null);
      AppMethodBeat.o(12305);
      return;
      label98: l = this.mCipher.pageSize;
      continue;
      label110: str = "PRAGMA page_size";
      l = SQLiteGlobal.defaultPageSize;
    }
  }

  private void setReadOnlyFromConfiguration()
  {
    AppMethodBeat.i(12315);
    if (this.mIsReadOnlyConnection)
      execute("PRAGMA query_only = 1", null, null);
    AppMethodBeat.o(12315);
  }

  private void setSyncModeFromConfiguration()
  {
    AppMethodBeat.i(12312);
    execute("PRAGMA synchronous=".concat(String.valueOf(this.mConfiguration.synchronousMode)), null, null);
    AppMethodBeat.o(12312);
  }

  private void setUpdateNotificationFromConfiguration()
  {
    AppMethodBeat.i(12317);
    nativeSetUpdateNotification(this.mConnectionPtr, this.mConfiguration.updateNotificationEnabled, this.mConfiguration.updateNotificationRowID);
    AppMethodBeat.o(12317);
  }

  private void setWalModeFromConfiguration()
  {
    AppMethodBeat.i(12311);
    if ((!this.mConfiguration.isInMemoryDb()) && (!this.mIsReadOnlyConnection))
      if ((this.mConfiguration.openFlags & 0x20000000) == 0)
        break label53;
    label53: for (String str = "WAL"; ; str = "PERSIST")
    {
      setJournalMode(str);
      AppMethodBeat.o(12311);
      return;
    }
  }

  private void throwIfStatementForbidden(PreparedStatement paramPreparedStatement)
  {
    AppMethodBeat.i(12337);
    if ((this.mOnlyAllowReadOnlyOperations) && (!paramPreparedStatement.mReadOnly))
    {
      paramPreparedStatement = new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
      AppMethodBeat.o(12337);
      throw paramPreparedStatement;
    }
    AppMethodBeat.o(12337);
  }

  private static String trimSqlForDisplay(String paramString)
  {
    AppMethodBeat.i(12349);
    paramString = TRIM_SQL_PATTERN.matcher(paramString).replaceAll(" ");
    AppMethodBeat.o(12349);
    return paramString;
  }

  final PreparedStatement acquirePreparedStatement(String paramString)
  {
    AppMethodBeat.i(12329);
    PreparedStatement localPreparedStatement1 = (PreparedStatement)this.mPreparedStatementCache.get(paramString);
    if (localPreparedStatement1 != null)
      if (!localPreparedStatement1.mInUse)
      {
        PreparedStatement.access$402(localPreparedStatement1, true);
        AppMethodBeat.o(12329);
        return localPreparedStatement1;
      }
    for (int i = 1; ; i = 0)
      while (true)
      {
        long l = nativePrepareStatement(this.mConnectionPtr, paramString);
        PreparedStatement localPreparedStatement2 = localPreparedStatement1;
        try
        {
          int j = nativeGetParameterCount(this.mConnectionPtr, l);
          localPreparedStatement2 = localPreparedStatement1;
          int k = DatabaseUtils.getSqlStatementType(paramString);
          localPreparedStatement2 = localPreparedStatement1;
          localPreparedStatement1 = obtainPreparedStatement(paramString, l, j, k, nativeIsReadOnly(this.mConnectionPtr, l));
          if (i == 0)
          {
            localPreparedStatement2 = localPreparedStatement1;
            if (isCacheable(k))
            {
              localPreparedStatement2 = localPreparedStatement1;
              this.mPreparedStatementCache.put(paramString, localPreparedStatement1);
              localPreparedStatement2 = localPreparedStatement1;
              PreparedStatement.access$502(localPreparedStatement1, true);
            }
          }
          PreparedStatement.access$402(localPreparedStatement1, true);
          AppMethodBeat.o(12329);
        }
        catch (RuntimeException paramString)
        {
          if ((localPreparedStatement2 == null) || (!localPreparedStatement2.mInCache))
            nativeFinalizeStatement(this.mConnectionPtr, l);
          AppMethodBeat.o(12329);
          throw paramString;
        }
      }
  }

  final void close()
  {
    AppMethodBeat.i(12302);
    dispose(false);
    AppMethodBeat.o(12302);
  }

  final void collectDbStats(ArrayList<SQLiteDebug.DbStats> paramArrayList)
  {
    AppMethodBeat.i(12343);
    int i = nativeGetDbLookaside(this.mConnectionPtr);
    long l1 = 0L;
    long l2 = 0L;
    try
    {
      long l3 = executeForLong("PRAGMA page_count;", null, null);
      l1 = l3;
      long l4 = executeForLong("PRAGMA page_size;", null, null);
      l2 = l4;
      l1 = l3;
      label51: paramArrayList.add(getMainDbStatsUnsafe(i, l1, l2));
      CursorWindow localCursorWindow = new CursorWindow("collectDbStats");
      try
      {
        executeForCursorWindow("PRAGMA database_list;", null, localCursorWindow, 0, 0, false, null);
        i = 1;
        while (true)
          if (i < localCursorWindow.getNumRows())
          {
            Object localObject1 = localCursorWindow.getString(i, 1);
            String str = localCursorWindow.getString(i, 2);
            l3 = 0L;
            l2 = 0L;
            l1 = l3;
            try
            {
              Object localObject2 = new java/lang/StringBuilder;
              l1 = l3;
              ((StringBuilder)localObject2).<init>("PRAGMA ");
              l1 = l3;
              l3 = executeForLong((String)localObject1 + ".page_count;", null, null);
              l1 = l3;
              localObject2 = new java/lang/StringBuilder;
              l1 = l3;
              ((StringBuilder)localObject2).<init>("PRAGMA ");
              l1 = l3;
              l4 = executeForLong((String)localObject1 + ".page_size;", null, null);
              l1 = l4;
              l2 = l3;
              l3 = l1;
              l1 = l2;
              localObject2 = "  (attached) ".concat(String.valueOf(localObject1));
              localObject1 = localObject2;
              if (str.length() != 0)
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = (String)localObject2 + ": " + str;
              }
              localObject2 = new com/tencent/wcdb/database/SQLiteDebug$DbStats;
              ((SQLiteDebug.DbStats)localObject2).<init>((String)localObject1, l1, l3, 0, 0, 0, 0);
              paramArrayList.add(localObject2);
              i++;
            }
            catch (SQLiteException localSQLiteException2)
            {
              while (true)
                l3 = l2;
            }
          }
        return;
      }
      catch (SQLiteException paramArrayList)
      {
        while (true)
        {
          localCursorWindow.close();
          AppMethodBeat.o(12343);
        }
      }
      finally
      {
        localCursorWindow.close();
        AppMethodBeat.o(12343);
      }
    }
    catch (SQLiteException localSQLiteException1)
    {
      break label51;
    }
  }

  final void collectDbStatsUnsafe(ArrayList<SQLiteDebug.DbStats> paramArrayList)
  {
    AppMethodBeat.i(12344);
    paramArrayList.add(getMainDbStatsUnsafe(0, 0L, 0L));
    AppMethodBeat.o(12344);
  }

  final String describeCurrentOperationUnsafe()
  {
    AppMethodBeat.i(12340);
    String str = this.mRecentOperations.describeCurrentOperation();
    AppMethodBeat.o(12340);
    return str;
  }

  public final void dump(Printer paramPrinter, boolean paramBoolean)
  {
    AppMethodBeat.i(12338);
    dumpUnsafe(paramPrinter, paramBoolean);
    AppMethodBeat.o(12338);
  }

  final void dumpUnsafe(Printer paramPrinter, boolean paramBoolean)
  {
    AppMethodBeat.i(12339);
    paramPrinter.println("Connection #" + this.mConnectionId + ":");
    if (paramBoolean)
      paramPrinter.println("  connectionPtr: 0x" + Long.toHexString(this.mConnectionPtr));
    paramPrinter.println("  isPrimaryConnection: " + this.mIsPrimaryConnection);
    paramPrinter.println("  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
    if (this.mAcquiredThread != null)
      paramPrinter.println("  acquiredThread: " + this.mAcquiredThread + " (tid: " + this.mAcquiredTid + ")");
    this.mRecentOperations.dump(paramPrinter, paramBoolean);
    if (paramBoolean)
      this.mPreparedStatementCache.dump(paramPrinter);
    AppMethodBeat.o(12339);
  }

  final void endNativeHandle(Exception paramException)
  {
    AppMethodBeat.i(12299);
    int i = this.mNativeHandleCount - 1;
    this.mNativeHandleCount = i;
    if ((i == 0) && (this.mNativeOperation != null))
    {
      nativeSQLiteHandle(this.mConnectionPtr, false);
      if (paramException != null)
        break label69;
      this.mRecentOperations.endOperationDeferLog(this.mNativeOperation.mCookie);
    }
    while (true)
    {
      this.mNativeOperation = null;
      AppMethodBeat.o(12299);
      return;
      label69: this.mRecentOperations.failOperation(this.mNativeOperation.mCookie, paramException);
    }
  }

  public final void execute(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12322);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12322);
      throw paramString;
    }
    Operation localOperation = this.mRecentOperations.beginOperation("execute", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      paramString = acquirePreparedStatement(paramString);
      localOperation.mType = paramString.mType;
      try
      {
        throwIfStatementForbidden(paramString);
        bindArguments(paramString, paramArrayOfObject);
        applyBlockGuardPolicy(paramString);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          nativeExecute(this.mConnectionPtr, paramString.getPtr());
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(paramString);
          return;
        }
        finally
        {
          detachCancellationSignal(paramCancellationSignal);
          AppMethodBeat.o(12322);
        }
      }
      finally
      {
        releasePreparedStatement(paramString);
        AppMethodBeat.o(12322);
      }
    }
    catch (RuntimeException paramString)
    {
      this.mRecentOperations.failOperation(i, paramString);
      AppMethodBeat.o(12322);
      throw paramString;
    }
    finally
    {
      this.mRecentOperations.endOperation(i);
      AppMethodBeat.o(12322);
    }
    throw paramString;
  }

  public final int executeForChangedRowCount(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12325);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12325);
      throw paramString;
    }
    int i = 0;
    int j = 0;
    int k = 0;
    Operation localOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", paramString, paramArrayOfObject);
    int m = localOperation.mCookie;
    int n = i;
    int i1 = j;
    try
    {
      paramString = acquirePreparedStatement(paramString);
      n = i;
      i1 = j;
      localOperation.mType = paramString.mType;
      i = k;
      try
      {
        throwIfStatementForbidden(paramString);
        i = k;
        bindArguments(paramString, paramArrayOfObject);
        i = k;
        applyBlockGuardPolicy(paramString);
        i = k;
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          i1 = nativeExecuteForChangedRowCount(this.mConnectionPtr, paramString.getPtr());
          k = i1;
          i = k;
          detachCancellationSignal(paramCancellationSignal);
          n = k;
          i1 = k;
          releasePreparedStatement(paramString);
          return k;
        }
        finally
        {
          i = k;
          detachCancellationSignal(paramCancellationSignal);
          i = k;
          AppMethodBeat.o(12325);
          i = k;
        }
      }
      finally
      {
        n = i;
        i1 = i;
        releasePreparedStatement(paramString);
        n = i;
        i1 = i;
        AppMethodBeat.o(12325);
        n = i;
        i1 = i;
      }
    }
    catch (RuntimeException paramString)
    {
      i1 = n;
      this.mRecentOperations.failOperation(m, paramString);
      i1 = n;
      AppMethodBeat.o(12325);
      i1 = n;
      throw paramString;
    }
    finally
    {
      if (this.mRecentOperations.endOperationDeferLog(m))
        this.mRecentOperations.logOperation(m, "changedRows=".concat(String.valueOf(i1)));
      AppMethodBeat.o(12325);
    }
    throw paramString;
  }

  // ERROR //
  public final int executeForCursorWindow(String paramString, Object[] paramArrayOfObject, CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: sipush 12327
    //   3: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnonnull +22 -> 29
    //   10: new 857	java/lang/IllegalArgumentException
    //   13: dup
    //   14: ldc_w 859
    //   17: invokespecial 860	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   20: astore_1
    //   21: sipush 12327
    //   24: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aload_1
    //   28: athrow
    //   29: aload_3
    //   30: ifnonnull +22 -> 52
    //   33: new 857	java/lang/IllegalArgumentException
    //   36: dup
    //   37: ldc_w 891
    //   40: invokespecial 860	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   43: astore_1
    //   44: sipush 12327
    //   47: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: aload_1
    //   51: athrow
    //   52: aload_3
    //   53: invokevirtual 894	com/tencent/wcdb/CursorWindow:acquireReference	()V
    //   56: aload_0
    //   57: getfield 118	com/tencent/wcdb/database/SQLiteConnection:mRecentOperations	Lcom/tencent/wcdb/database/SQLiteConnection$OperationLog;
    //   60: ldc_w 895
    //   63: aload_1
    //   64: aload_2
    //   65: invokevirtual 298	com/tencent/wcdb/database/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lcom/tencent/wcdb/database/SQLiteConnection$Operation;
    //   68: astore 8
    //   70: aload 8
    //   72: getfield 301	com/tencent/wcdb/database/SQLiteConnection$Operation:mCookie	I
    //   75: istore 9
    //   77: aload_0
    //   78: aload_1
    //   79: invokevirtual 863	com/tencent/wcdb/database/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lcom/tencent/wcdb/database/SQLiteConnection$PreparedStatement;
    //   82: astore 10
    //   84: aload 8
    //   86: aload 10
    //   88: invokestatic 866	com/tencent/wcdb/database/SQLiteConnection$PreparedStatement:access$100	(Lcom/tencent/wcdb/database/SQLiteConnection$PreparedStatement;)I
    //   91: putfield 869	com/tencent/wcdb/database/SQLiteConnection$Operation:mType	I
    //   94: aload_0
    //   95: aload 10
    //   97: invokespecial 871	com/tencent/wcdb/database/SQLiteConnection:throwIfStatementForbidden	(Lcom/tencent/wcdb/database/SQLiteConnection$PreparedStatement;)V
    //   100: aload_0
    //   101: aload 10
    //   103: aload_2
    //   104: invokespecial 196	com/tencent/wcdb/database/SQLiteConnection:bindArguments	(Lcom/tencent/wcdb/database/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   107: aload_0
    //   108: aload 10
    //   110: invokespecial 873	com/tencent/wcdb/database/SQLiteConnection:applyBlockGuardPolicy	(Lcom/tencent/wcdb/database/SQLiteConnection$PreparedStatement;)V
    //   113: aload_0
    //   114: aload 7
    //   116: invokespecial 165	com/tencent/wcdb/database/SQLiteConnection:attachCancellationSignal	(Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   119: aload_0
    //   120: getfield 206	com/tencent/wcdb/database/SQLiteConnection:mConnectionPtr	J
    //   123: aload 10
    //   125: invokevirtual 247	com/tencent/wcdb/database/SQLiteConnection$PreparedStatement:getPtr	()J
    //   128: aload_3
    //   129: getfield 898	com/tencent/wcdb/CursorWindow:mWindowPtr	J
    //   132: iload 4
    //   134: iload 5
    //   136: iload 6
    //   138: invokestatic 900	com/tencent/wcdb/database/SQLiteConnection:nativeExecuteForCursorWindow	(JJJIIZ)J
    //   141: lstore 11
    //   143: lload 11
    //   145: bipush 32
    //   147: lshr
    //   148: l2i
    //   149: istore 13
    //   151: lload 11
    //   153: l2i
    //   154: istore 14
    //   156: aload_3
    //   157: invokevirtual 777	com/tencent/wcdb/CursorWindow:getNumRows	()I
    //   160: istore 5
    //   162: aload_3
    //   163: iload 13
    //   165: invokevirtual 903	com/tencent/wcdb/CursorWindow:setStartPosition	(I)V
    //   168: iload 5
    //   170: istore 15
    //   172: iload 14
    //   174: istore 16
    //   176: iload 13
    //   178: istore 17
    //   180: aload_0
    //   181: aload 7
    //   183: invokespecial 169	com/tencent/wcdb/database/SQLiteConnection:detachCancellationSignal	(Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   186: iload 5
    //   188: istore 18
    //   190: iload 14
    //   192: istore 19
    //   194: iload 13
    //   196: istore 20
    //   198: iload 5
    //   200: istore 15
    //   202: iload 14
    //   204: istore 16
    //   206: iload 13
    //   208: istore 17
    //   210: aload_0
    //   211: aload 10
    //   213: invokevirtual 878	com/tencent/wcdb/database/SQLiteConnection:releasePreparedStatement	(Lcom/tencent/wcdb/database/SQLiteConnection$PreparedStatement;)V
    //   216: aload_0
    //   217: getfield 118	com/tencent/wcdb/database/SQLiteConnection:mRecentOperations	Lcom/tencent/wcdb/database/SQLiteConnection$OperationLog;
    //   220: iload 9
    //   222: invokevirtual 851	com/tencent/wcdb/database/SQLiteConnection$OperationLog:endOperationDeferLog	(I)Z
    //   225: ifeq +77 -> 302
    //   228: aload_0
    //   229: getfield 118	com/tencent/wcdb/database/SQLiteConnection:mRecentOperations	Lcom/tencent/wcdb/database/SQLiteConnection$OperationLog;
    //   232: astore_2
    //   233: new 222	java/lang/StringBuilder
    //   236: astore_1
    //   237: aload_1
    //   238: ldc_w 905
    //   241: invokespecial 227	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   244: aload_2
    //   245: iload 9
    //   247: aload_1
    //   248: aload_3
    //   249: invokevirtual 835	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   252: ldc_w 907
    //   255: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: iload 4
    //   260: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   263: ldc_w 909
    //   266: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: iload 13
    //   271: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   274: ldc_w 911
    //   277: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: iload 5
    //   282: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   285: ldc_w 913
    //   288: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: iload 14
    //   293: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   296: invokevirtual 242	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokevirtual 889	com/tencent/wcdb/database/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   302: aload_3
    //   303: invokevirtual 916	com/tencent/wcdb/CursorWindow:releaseReference	()V
    //   306: sipush 12327
    //   309: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   312: iload 14
    //   314: ireturn
    //   315: astore_1
    //   316: iconst_m1
    //   317: istore 5
    //   319: iconst_m1
    //   320: istore 14
    //   322: iconst_m1
    //   323: istore 13
    //   325: iload 5
    //   327: istore 15
    //   329: iload 14
    //   331: istore 16
    //   333: iload 13
    //   335: istore 17
    //   337: aload_0
    //   338: aload 7
    //   340: invokespecial 169	com/tencent/wcdb/database/SQLiteConnection:detachCancellationSignal	(Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   343: iload 5
    //   345: istore 15
    //   347: iload 14
    //   349: istore 16
    //   351: iload 13
    //   353: istore 17
    //   355: sipush 12327
    //   358: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   361: iload 5
    //   363: istore 15
    //   365: iload 14
    //   367: istore 16
    //   369: iload 13
    //   371: istore 17
    //   373: aload_1
    //   374: athrow
    //   375: astore_1
    //   376: iload 17
    //   378: istore 13
    //   380: iload 16
    //   382: istore 14
    //   384: iload 15
    //   386: istore 5
    //   388: iload 5
    //   390: istore 18
    //   392: iload 14
    //   394: istore 19
    //   396: iload 13
    //   398: istore 20
    //   400: iload 5
    //   402: istore 15
    //   404: iload 14
    //   406: istore 16
    //   408: iload 13
    //   410: istore 17
    //   412: aload_0
    //   413: aload 10
    //   415: invokevirtual 878	com/tencent/wcdb/database/SQLiteConnection:releasePreparedStatement	(Lcom/tencent/wcdb/database/SQLiteConnection$PreparedStatement;)V
    //   418: iload 5
    //   420: istore 18
    //   422: iload 14
    //   424: istore 19
    //   426: iload 13
    //   428: istore 20
    //   430: iload 5
    //   432: istore 15
    //   434: iload 14
    //   436: istore 16
    //   438: iload 13
    //   440: istore 17
    //   442: sipush 12327
    //   445: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   448: iload 5
    //   450: istore 18
    //   452: iload 14
    //   454: istore 19
    //   456: iload 13
    //   458: istore 20
    //   460: iload 5
    //   462: istore 15
    //   464: iload 14
    //   466: istore 16
    //   468: iload 13
    //   470: istore 17
    //   472: aload_1
    //   473: athrow
    //   474: astore_1
    //   475: iload 18
    //   477: istore 15
    //   479: iload 19
    //   481: istore 16
    //   483: iload 20
    //   485: istore 17
    //   487: aload_0
    //   488: getfield 118	com/tencent/wcdb/database/SQLiteConnection:mRecentOperations	Lcom/tencent/wcdb/database/SQLiteConnection$OperationLog;
    //   491: iload 9
    //   493: aload_1
    //   494: invokevirtual 855	com/tencent/wcdb/database/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   497: iload 18
    //   499: istore 15
    //   501: iload 19
    //   503: istore 16
    //   505: iload 20
    //   507: istore 17
    //   509: sipush 12327
    //   512: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   515: iload 18
    //   517: istore 15
    //   519: iload 19
    //   521: istore 16
    //   523: iload 20
    //   525: istore 17
    //   527: aload_1
    //   528: athrow
    //   529: astore_1
    //   530: aload_0
    //   531: getfield 118	com/tencent/wcdb/database/SQLiteConnection:mRecentOperations	Lcom/tencent/wcdb/database/SQLiteConnection$OperationLog;
    //   534: iload 9
    //   536: invokevirtual 851	com/tencent/wcdb/database/SQLiteConnection$OperationLog:endOperationDeferLog	(I)Z
    //   539: ifeq +79 -> 618
    //   542: aload_0
    //   543: getfield 118	com/tencent/wcdb/database/SQLiteConnection:mRecentOperations	Lcom/tencent/wcdb/database/SQLiteConnection$OperationLog;
    //   546: astore 7
    //   548: new 222	java/lang/StringBuilder
    //   551: astore_2
    //   552: aload_2
    //   553: ldc_w 905
    //   556: invokespecial 227	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   559: aload 7
    //   561: iload 9
    //   563: aload_2
    //   564: aload_3
    //   565: invokevirtual 835	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   568: ldc_w 907
    //   571: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: iload 4
    //   576: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   579: ldc_w 909
    //   582: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   585: iload 17
    //   587: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   590: ldc_w 911
    //   593: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   596: iload 15
    //   598: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   601: ldc_w 913
    //   604: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: iload 16
    //   609: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   612: invokevirtual 242	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   615: invokevirtual 889	com/tencent/wcdb/database/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   618: sipush 12327
    //   621: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   624: aload_1
    //   625: athrow
    //   626: astore_1
    //   627: aload_3
    //   628: invokevirtual 916	com/tencent/wcdb/CursorWindow:releaseReference	()V
    //   631: sipush 12327
    //   634: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   637: aload_1
    //   638: athrow
    //   639: astore_1
    //   640: iconst_m1
    //   641: istore 15
    //   643: iconst_m1
    //   644: istore 16
    //   646: iconst_m1
    //   647: istore 17
    //   649: goto -119 -> 530
    //   652: astore_1
    //   653: iconst_m1
    //   654: istore 18
    //   656: iconst_m1
    //   657: istore 19
    //   659: iconst_m1
    //   660: istore 20
    //   662: goto -187 -> 475
    //   665: astore_1
    //   666: iconst_m1
    //   667: istore 5
    //   669: iconst_m1
    //   670: istore 14
    //   672: iconst_m1
    //   673: istore 13
    //   675: goto -287 -> 388
    //   678: astore_1
    //   679: iconst_m1
    //   680: istore 5
    //   682: goto -357 -> 325
    //   685: astore_1
    //   686: goto -361 -> 325
    //
    // Exception table:
    //   from	to	target	type
    //   119	143	315	finally
    //   180	186	375	finally
    //   337	343	375	finally
    //   355	361	375	finally
    //   373	375	375	finally
    //   210	216	474	java/lang/RuntimeException
    //   412	418	474	java/lang/RuntimeException
    //   442	448	474	java/lang/RuntimeException
    //   472	474	474	java/lang/RuntimeException
    //   210	216	529	finally
    //   412	418	529	finally
    //   442	448	529	finally
    //   472	474	529	finally
    //   487	497	529	finally
    //   509	515	529	finally
    //   527	529	529	finally
    //   56	77	626	finally
    //   216	302	626	finally
    //   530	618	626	finally
    //   618	626	626	finally
    //   77	94	639	finally
    //   77	94	652	java/lang/RuntimeException
    //   94	119	665	finally
    //   156	162	678	finally
    //   162	168	685	finally
  }

  public final long executeForLastInsertedRowId(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12326);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12326);
      throw paramString;
    }
    Operation localOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      paramString = acquirePreparedStatement(paramString);
      localOperation.mType = paramString.mType;
      try
      {
        throwIfStatementForbidden(paramString);
        bindArguments(paramString, paramArrayOfObject);
        applyBlockGuardPolicy(paramString);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          long l = nativeExecuteForLastInsertedRowId(this.mConnectionPtr, paramString.getPtr());
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(paramString);
          return l;
        }
        finally
        {
          detachCancellationSignal(paramCancellationSignal);
          AppMethodBeat.o(12326);
        }
      }
      finally
      {
        releasePreparedStatement(paramString);
        AppMethodBeat.o(12326);
      }
    }
    catch (RuntimeException paramString)
    {
      this.mRecentOperations.failOperation(i, paramString);
      AppMethodBeat.o(12326);
      throw paramString;
    }
    finally
    {
      this.mRecentOperations.endOperation(i);
      AppMethodBeat.o(12326);
    }
    throw paramString;
  }

  public final long executeForLong(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12323);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12323);
      throw paramString;
    }
    Operation localOperation = this.mRecentOperations.beginOperation("executeForLong", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      paramString = acquirePreparedStatement(paramString);
      localOperation.mType = paramString.mType;
      try
      {
        throwIfStatementForbidden(paramString);
        bindArguments(paramString, paramArrayOfObject);
        applyBlockGuardPolicy(paramString);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          long l = nativeExecuteForLong(this.mConnectionPtr, paramString.getPtr());
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(paramString);
          return l;
        }
        finally
        {
          detachCancellationSignal(paramCancellationSignal);
          AppMethodBeat.o(12323);
        }
      }
      finally
      {
        releasePreparedStatement(paramString);
        AppMethodBeat.o(12323);
      }
    }
    catch (RuntimeException paramString)
    {
      this.mRecentOperations.failOperation(i, paramString);
      AppMethodBeat.o(12323);
      throw paramString;
    }
    finally
    {
      this.mRecentOperations.endOperation(i);
      AppMethodBeat.o(12323);
    }
    throw paramString;
  }

  public final String executeForString(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12324);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12324);
      throw paramString;
    }
    Operation localOperation = this.mRecentOperations.beginOperation("executeForString", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      paramString = acquirePreparedStatement(paramString);
      localOperation.mType = paramString.mType;
      try
      {
        throwIfStatementForbidden(paramString);
        bindArguments(paramString, paramArrayOfObject);
        applyBlockGuardPolicy(paramString);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          paramArrayOfObject = nativeExecuteForString(this.mConnectionPtr, paramString.getPtr());
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(paramString);
          return paramArrayOfObject;
        }
        finally
        {
          detachCancellationSignal(paramCancellationSignal);
          AppMethodBeat.o(12324);
        }
      }
      finally
      {
        releasePreparedStatement(paramString);
        AppMethodBeat.o(12324);
      }
    }
    catch (RuntimeException paramString)
    {
      this.mRecentOperations.failOperation(i, paramString);
      AppMethodBeat.o(12324);
      throw paramString;
    }
    finally
    {
      this.mRecentOperations.endOperation(i);
      AppMethodBeat.o(12324);
    }
    throw paramString;
  }

  protected final void finalize()
  {
    AppMethodBeat.i(12300);
    try
    {
      if ((this.mPool != null) && (this.mConnectionPtr != 0L))
        this.mPool.onConnectionLeaked();
      dispose(true);
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(12300);
    }
  }

  public final int getConnectionId()
  {
    return this.mConnectionId;
  }

  final long getNativeHandle(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(12298);
    if (this.mConnectionPtr == 0L)
      AppMethodBeat.o(12298);
    while (true)
    {
      return l;
      if ((paramString != null) && (this.mNativeOperation == null))
      {
        this.mNativeOperation = this.mRecentOperations.beginOperation(paramString, null, null);
        this.mNativeOperation.mType = 99;
      }
      this.mNativeHandleCount += 1;
      l = nativeSQLiteHandle(this.mConnectionPtr, true);
      AppMethodBeat.o(12298);
    }
  }

  final boolean isPreparedStatementInCache(String paramString)
  {
    AppMethodBeat.i(12320);
    boolean bool;
    if (this.mPreparedStatementCache.get(paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(12320);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12320);
    }
  }

  public final boolean isPrimaryConnection()
  {
    return this.mIsPrimaryConnection;
  }

  public final void onCancel()
  {
    AppMethodBeat.i(12334);
    nativeCancel(this.mConnectionPtr);
    AppMethodBeat.o(12334);
  }

  public final void prepare(String paramString, SQLiteStatementInfo paramSQLiteStatementInfo)
  {
    AppMethodBeat.i(12321);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12321);
      throw paramString;
    }
    Operation localOperation = this.mRecentOperations.beginOperation("prepare", paramString, null);
    int i = localOperation.mCookie;
    try
    {
      paramString = acquirePreparedStatement(paramString);
      localOperation.mType = paramString.mType;
      if (paramSQLiteStatementInfo != null);
      try
      {
        paramSQLiteStatementInfo.numParameters = paramString.mNumParameters;
        paramSQLiteStatementInfo.readOnly = paramString.mReadOnly;
        int j = nativeGetColumnCount(this.mConnectionPtr, paramString.getPtr());
        if (j == 0)
          paramSQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
        while (true)
        {
          releasePreparedStatement(paramString);
          return;
          paramSQLiteStatementInfo.columnNames = new String[j];
          for (int k = 0; k < j; k++)
            paramSQLiteStatementInfo.columnNames[k] = nativeGetColumnName(this.mConnectionPtr, paramString.getPtr(), k);
        }
      }
      finally
      {
        releasePreparedStatement(paramString);
        AppMethodBeat.o(12321);
      }
    }
    catch (RuntimeException paramString)
    {
      this.mRecentOperations.failOperation(i, paramString);
      AppMethodBeat.o(12321);
      throw paramString;
    }
    finally
    {
      this.mRecentOperations.endOperation(i);
      AppMethodBeat.o(12321);
    }
    throw paramString;
  }

  final void reconfigure(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    int i = 0;
    AppMethodBeat.i(12318);
    this.mOnlyAllowReadOnlyOperations = false;
    long l1 = WCDBInitializationProbe.apiEnv;
    long l2 = nativeSQLiteHandle(this.mConnectionPtr, true);
    try
    {
      Iterator localIterator = paramSQLiteDatabaseConfiguration.extensions.iterator();
      while (localIterator.hasNext())
      {
        SQLiteExtension localSQLiteExtension = (SQLiteExtension)localIterator.next();
        if (!this.mConfiguration.extensions.contains(localSQLiteExtension))
          localSQLiteExtension.initialize(l2, l1);
      }
    }
    finally
    {
      nativeSQLiteHandle(this.mConnectionPtr, false);
      AppMethodBeat.o(12318);
    }
    nativeSQLiteHandle(this.mConnectionPtr, false);
    int j;
    int k;
    label152: int m;
    label172: int n;
    if (((paramSQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 0x20000000) != 0)
    {
      j = 1;
      if (paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled == this.mConfiguration.foreignKeyConstraintsEnabled)
        break label321;
      k = 1;
      if (paramSQLiteDatabaseConfiguration.locale.equals(this.mConfiguration.locale))
        break label327;
      m = 1;
      if (paramSQLiteDatabaseConfiguration.customWALHookEnabled == this.mConfiguration.customWALHookEnabled)
        break label333;
      n = 1;
      label189: if (paramSQLiteDatabaseConfiguration.synchronousMode == this.mConfiguration.synchronousMode)
        break label339;
    }
    label321: label327: label333: label339: for (int i1 = 1; ; i1 = 0)
    {
      if ((paramSQLiteDatabaseConfiguration.updateNotificationEnabled != this.mConfiguration.updateNotificationEnabled) || (paramSQLiteDatabaseConfiguration.updateNotificationRowID != this.mConfiguration.updateNotificationRowID))
        i = 1;
      this.mConfiguration.updateParametersFrom(paramSQLiteDatabaseConfiguration);
      this.mPreparedStatementCache.resize(paramSQLiteDatabaseConfiguration.maxSqlCacheSize);
      if (k != 0)
        setForeignKeyModeFromConfiguration();
      if (j != 0)
        setWalModeFromConfiguration();
      if (i1 != 0)
        setSyncModeFromConfiguration();
      if (n != 0)
        setCheckpointStrategy();
      if (m != 0)
        setLocaleFromConfiguration();
      if (i != 0)
        setUpdateNotificationFromConfiguration();
      AppMethodBeat.o(12318);
      return;
      j = 0;
      break;
      k = 0;
      break label152;
      m = 0;
      break label172;
      n = 0;
      break label189;
    }
  }

  final void releasePreparedStatement(PreparedStatement paramPreparedStatement)
  {
    AppMethodBeat.i(12330);
    PreparedStatement.access$402(paramPreparedStatement, false);
    if (paramPreparedStatement.mInCache);
    while (true)
    {
      try
      {
        resetStatement(paramPreparedStatement, true);
        AppMethodBeat.o(12330);
        return;
      }
      catch (SQLiteException localSQLiteException)
      {
        this.mPreparedStatementCache.remove(paramPreparedStatement.mSql);
        AppMethodBeat.o(12330);
        continue;
      }
      finalizePreparedStatement(paramPreparedStatement);
      AppMethodBeat.o(12330);
    }
  }

  final void setAcquisitionState(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(12319);
    if (paramBoolean1)
    {
      this.mAcquiredThread = Thread.currentThread();
      this.mAcquiredTid = Process.myTid();
      if (paramBoolean2)
      {
        this.mAcquiredStack = this.mAcquiredThread.getStackTrace();
        this.mAcquiredTimestamp = System.currentTimeMillis();
        AppMethodBeat.o(12319);
      }
    }
    while (true)
    {
      return;
      this.mAcquiredStack = null;
      this.mAcquiredTimestamp = 0L;
      AppMethodBeat.o(12319);
      continue;
      this.mAcquiredThread = null;
      this.mAcquiredTid = 0;
      this.mAcquiredStack = null;
      this.mAcquiredTimestamp = 0L;
      AppMethodBeat.o(12319);
    }
  }

  final void setOnlyAllowReadOnlyOperations(boolean paramBoolean)
  {
    this.mOnlyAllowReadOnlyOperations = paramBoolean;
  }

  public final String toString()
  {
    AppMethodBeat.i(12346);
    String str = "SQLiteConnection: " + this.mConfiguration.path + " (" + this.mConnectionId + ")";
    AppMethodBeat.o(12346);
    return str;
  }

  final SQLiteTrace.TraceInfo<String> traceCurrentOperationUnsafe()
  {
    AppMethodBeat.i(12341);
    SQLiteTrace.TraceInfo localTraceInfo = this.mRecentOperations.traceCurrentOperation();
    AppMethodBeat.o(12341);
    return localTraceInfo;
  }

  final SQLiteTrace.TraceInfo<StackTraceElement[]> tracePersistAcquisitionUnsafe()
  {
    AppMethodBeat.i(12342);
    Object localObject = this.mAcquiredStack;
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(12342);
    }
    while (true)
    {
      return localObject;
      localObject = new SQLiteTrace.TraceInfo(localObject, this.mAcquiredTimestamp, this.mAcquiredTid);
      AppMethodBeat.o(12342);
    }
  }

  public final Pair<Integer, Integer> walCheckpoint(String paramString)
  {
    AppMethodBeat.i(12328);
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (!paramString.isEmpty());
    }
    else
    {
      str = "main";
    }
    long l = nativeWalCheckpoint(this.mConnectionPtr, str);
    paramString = new Pair(Integer.valueOf((int)(l >> 32)), Integer.valueOf((int)(l & 0xFFFFFFFF)));
    AppMethodBeat.o(12328);
    return paramString;
  }

  @SuppressLint({"SimpleDateFormat"})
  static final class Operation
  {
    private static final SimpleDateFormat sDateFormat;
    ArrayList<Object> mBindArgs;
    int mCookie;
    long mEndTime;
    Exception mException;
    boolean mFinished;
    String mKind;
    String mSql;
    long mStartTime;
    int mTid;
    int mType;

    static
    {
      AppMethodBeat.i(12274);
      sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      AppMethodBeat.o(12274);
    }

    private String getFormattedStartTime()
    {
      AppMethodBeat.i(12272);
      String str = sDateFormat.format(new Date(this.mStartTime));
      AppMethodBeat.o(12272);
      return str;
    }

    private String getStatus()
    {
      String str;
      if (!this.mFinished)
        str = "running";
      while (true)
      {
        return str;
        if (this.mException != null)
          str = "failed";
        else
          str = "succeeded";
      }
    }

    public final void describe(StringBuilder paramStringBuilder, boolean paramBoolean)
    {
      AppMethodBeat.i(12271);
      paramStringBuilder.append(this.mKind);
      int j;
      label149: Object localObject;
      if (this.mFinished)
      {
        paramStringBuilder.append(" took ").append(this.mEndTime - this.mStartTime).append("ms");
        paramStringBuilder.append(" - ").append(getStatus());
        if (this.mSql != null)
          paramStringBuilder.append(", sql=\"").append(SQLiteConnection.access$1500(this.mSql)).append("\"");
        if (this.mTid > 0)
          paramStringBuilder.append(", tid=").append(this.mTid);
        if ((!paramBoolean) || (this.mBindArgs == null) || (this.mBindArgs.size() == 0))
          break label288;
        paramStringBuilder.append(", bindArgs=[");
        int i = this.mBindArgs.size();
        j = 0;
        if (j >= i)
          break label281;
        localObject = this.mBindArgs.get(j);
        if (j != 0)
          paramStringBuilder.append(", ");
        if (localObject != null)
          break label222;
        paramStringBuilder.append("null");
      }
      while (true)
      {
        j++;
        break label149;
        paramStringBuilder.append(" started ").append(System.currentTimeMillis() - this.mStartTime).append("ms ago");
        break;
        label222: if ((localObject instanceof byte[]))
          paramStringBuilder.append("<byte[]>");
        else if ((localObject instanceof String))
          paramStringBuilder.append("\"").append((String)localObject).append("\"");
        else
          paramStringBuilder.append(localObject);
      }
      label281: paramStringBuilder.append("]");
      label288: if ((this.mException != null) && (this.mException.getMessage() != null))
        paramStringBuilder.append(", exception=\"").append(this.mException.getMessage()).append("\"");
      AppMethodBeat.o(12271);
    }
  }

  final class OperationLog
  {
    private static final int COOKIE_GENERATION_SHIFT = 8;
    private static final int COOKIE_INDEX_MASK = 255;
    private static final int MAX_RECENT_OPERATIONS = 20;
    private int mGeneration;
    private int mIndex;
    private final SQLiteConnection.Operation[] mOperations;

    private OperationLog()
    {
      AppMethodBeat.i(12275);
      this.mOperations = new SQLiteConnection.Operation[20];
      AppMethodBeat.o(12275);
    }

    private boolean endOperationDeferLogLocked(SQLiteConnection.Operation paramOperation)
    {
      boolean bool = true;
      AppMethodBeat.i(12281);
      if (paramOperation != null)
      {
        paramOperation.mEndTime = System.currentTimeMillis();
        paramOperation.mFinished = true;
        if ((paramOperation.mException != null) && (paramOperation.mException.getMessage() != null))
          AppMethodBeat.o(12281);
      }
      while (true)
      {
        return bool;
        bool = SQLiteDebug.shouldLogSlowQuery(paramOperation.mEndTime - paramOperation.mStartTime);
        AppMethodBeat.o(12281);
        continue;
        bool = false;
        AppMethodBeat.o(12281);
      }
    }

    private SQLiteConnection.Operation getOperationLocked(int paramInt)
    {
      SQLiteConnection.Operation localOperation = this.mOperations[(paramInt & 0xFF)];
      if (localOperation.mCookie == paramInt);
      while (true)
      {
        return localOperation;
        localOperation = null;
      }
    }

    private void logOperationLocked(SQLiteConnection.Operation paramOperation, String paramString)
    {
      AppMethodBeat.i(12282);
      StringBuilder localStringBuilder = new StringBuilder();
      paramOperation.describe(localStringBuilder, false);
      if (paramString != null)
        localStringBuilder.append(", ").append(paramString);
      Log.i("WCDB.SQLiteConnection", localStringBuilder.toString());
      AppMethodBeat.o(12282);
    }

    private int newOperationCookieLocked(int paramInt)
    {
      int i = this.mGeneration;
      this.mGeneration = (i + 1);
      return i << 8 | paramInt;
    }

    public final SQLiteConnection.Operation beginOperation(String paramString1, String paramString2, Object[] paramArrayOfObject)
    {
      int i = 0;
      AppMethodBeat.i(12276);
      int j;
      SQLiteConnection.Operation localOperation2;
      while (true)
      {
        synchronized (this.mOperations)
        {
          j = (this.mIndex + 1) % 20;
          SQLiteConnection.Operation localOperation1 = this.mOperations[j];
          if (localOperation1 == null)
          {
            localOperation2 = new com/tencent/wcdb/database/SQLiteConnection$Operation;
            localOperation2.<init>(null);
            this.mOperations[j] = localOperation2;
            localOperation2.mStartTime = System.currentTimeMillis();
            localOperation2.mKind = paramString1;
            localOperation2.mSql = paramString2;
            if (paramArrayOfObject == null)
              break;
            if (localOperation2.mBindArgs == null)
            {
              paramString1 = new java/util/ArrayList;
              paramString1.<init>();
              localOperation2.mBindArgs = paramString1;
              if (i >= paramArrayOfObject.length)
                break;
              paramString1 = paramArrayOfObject[i];
              if ((paramString1 == null) || (!(paramString1 instanceof byte[])))
                break label212;
              localOperation2.mBindArgs.add(SQLiteConnection.EMPTY_BYTE_ARRAY);
              i++;
              continue;
            }
          }
          else
          {
            localOperation1.mFinished = false;
            localOperation1.mException = null;
            localOperation2 = localOperation1;
            if (localOperation1.mBindArgs == null)
              continue;
            localOperation1.mBindArgs.clear();
            localOperation2 = localOperation1;
          }
        }
        localOperation2.mBindArgs.clear();
        continue;
        label212: localOperation2.mBindArgs.add(paramString1);
      }
      localOperation2.mCookie = newOperationCookieLocked(j);
      localOperation2.mTid = SQLiteConnection.this.mAcquiredTid;
      this.mIndex = j;
      AppMethodBeat.o(12276);
      return localOperation2;
    }

    public final String describeCurrentOperation()
    {
      AppMethodBeat.i(12283);
      synchronized (this.mOperations)
      {
        Object localObject1 = this.mOperations[this.mIndex];
        if ((localObject1 != null) && (!((SQLiteConnection.Operation)localObject1).mFinished))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ((SQLiteConnection.Operation)localObject1).describe(localStringBuilder, false);
          localObject1 = localStringBuilder.toString();
          AppMethodBeat.o(12283);
          return localObject1;
        }
        localObject1 = null;
        AppMethodBeat.o(12283);
      }
    }

    public final void dump(Printer paramPrinter, boolean paramBoolean)
    {
      AppMethodBeat.i(12285);
      while (true)
        synchronized (this.mOperations)
        {
          paramPrinter.println("  Most recently executed operations:");
          int i = this.mIndex;
          SQLiteConnection.Operation localOperation = this.mOperations[i];
          if (localOperation != null)
          {
            int j = 0;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("    ").append(j).append(": [");
            localStringBuilder.append(SQLiteConnection.Operation.access$2000(localOperation));
            localStringBuilder.append("] ");
            localOperation.describe(localStringBuilder, paramBoolean);
            paramPrinter.println(localStringBuilder.toString());
            if (i > 0)
            {
              i--;
              j++;
              localOperation = this.mOperations[i];
              if ((localOperation == null) || (j >= 20))
                AppMethodBeat.o(12285);
            }
            else
            {
              i = 19;
            }
          }
          else
          {
            paramPrinter.println("    <none>");
          }
        }
    }

    public final void endOperation(int paramInt)
    {
      AppMethodBeat.i(12278);
      synchronized (this.mOperations)
      {
        SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
        if (endOperationDeferLogLocked(localOperation))
          logOperationLocked(localOperation, null);
        String str1 = localOperation.mSql;
        String str2 = localOperation.mKind;
        paramInt = localOperation.mType;
        long l1 = localOperation.mEndTime;
        long l2 = localOperation.mStartTime;
        if (!"prepare".equals(str2))
          SQLiteConnection.this.mPool.traceExecute(str1, paramInt, l1 - l2);
        AppMethodBeat.o(12278);
        return;
      }
    }

    public final boolean endOperationDeferLog(int paramInt)
    {
      AppMethodBeat.i(12279);
      synchronized (this.mOperations)
      {
        SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
        if (localOperation == null)
        {
          bool = false;
          AppMethodBeat.o(12279);
          return bool;
        }
        boolean bool = endOperationDeferLogLocked(localOperation);
        String str1 = localOperation.mSql;
        String str2 = localOperation.mKind;
        paramInt = localOperation.mType;
        long l1 = localOperation.mEndTime;
        long l2 = localOperation.mStartTime;
        if (!"prepare".equals(str2))
          SQLiteConnection.this.mPool.traceExecute(str1, paramInt, l1 - l2);
        AppMethodBeat.o(12279);
      }
    }

    public final void failOperation(int paramInt, Exception paramException)
    {
      AppMethodBeat.i(12277);
      synchronized (this.mOperations)
      {
        SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
        if (localOperation != null)
          localOperation.mException = paramException;
        AppMethodBeat.o(12277);
        return;
      }
    }

    public final void logOperation(int paramInt, String paramString)
    {
      AppMethodBeat.i(12280);
      synchronized (this.mOperations)
      {
        SQLiteConnection.Operation localOperation = getOperationLocked(paramInt);
        if (localOperation != null)
          logOperationLocked(localOperation, paramString);
        AppMethodBeat.o(12280);
        return;
      }
    }

    final SQLiteTrace.TraceInfo<String> traceCurrentOperation()
    {
      AppMethodBeat.i(12284);
      synchronized (this.mOperations)
      {
        SQLiteConnection.Operation localOperation = this.mOperations[this.mIndex];
        if ((localOperation != null) && (!localOperation.mFinished))
        {
          localTraceInfo = new com/tencent/wcdb/database/SQLiteTrace$TraceInfo;
          localTraceInfo.<init>(localOperation.mSql, localOperation.mStartTime, localOperation.mTid);
          AppMethodBeat.o(12284);
          return localTraceInfo;
        }
        SQLiteTrace.TraceInfo localTraceInfo = null;
        AppMethodBeat.o(12284);
      }
    }
  }

  static final class PreparedStatement
  {
    private WeakReference<SQLiteConnection> mConnection;
    private boolean mInCache;
    private boolean mInUse;
    private int mNumParameters;
    private SQLiteConnection.Operation mOperation;
    private PreparedStatement mPoolNext;
    private boolean mReadOnly;
    private String mSql;
    private long mStatementPtr;
    private int mType;

    PreparedStatement(SQLiteConnection paramSQLiteConnection)
    {
      AppMethodBeat.i(12286);
      this.mConnection = new WeakReference(paramSQLiteConnection);
      AppMethodBeat.o(12286);
    }

    public final void attachCancellationSignal(CancellationSignal paramCancellationSignal)
    {
      AppMethodBeat.i(12289);
      SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mConnection.get();
      if (localSQLiteConnection == null)
        AppMethodBeat.o(12289);
      while (true)
      {
        return;
        SQLiteConnection.access$1100(localSQLiteConnection, paramCancellationSignal);
        AppMethodBeat.o(12289);
      }
    }

    public final void beginOperation(String paramString, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(12291);
      SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mConnection.get();
      if (localSQLiteConnection == null)
        AppMethodBeat.o(12291);
      while (true)
      {
        return;
        this.mOperation = localSQLiteConnection.mRecentOperations.beginOperation(paramString, this.mSql, paramArrayOfObject);
        this.mOperation.mType = this.mType;
        AppMethodBeat.o(12291);
      }
    }

    public final void bindArguments(Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(12287);
      SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mConnection.get();
      if (localSQLiteConnection == null)
        AppMethodBeat.o(12287);
      while (true)
      {
        return;
        SQLiteConnection.access$900(localSQLiteConnection, this, paramArrayOfObject);
        AppMethodBeat.o(12287);
      }
    }

    public final void detachCancellationSignal(CancellationSignal paramCancellationSignal)
    {
      AppMethodBeat.i(12290);
      SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mConnection.get();
      if (localSQLiteConnection == null)
        AppMethodBeat.o(12290);
      while (true)
      {
        return;
        SQLiteConnection.access$1200(localSQLiteConnection, paramCancellationSignal);
        AppMethodBeat.o(12290);
      }
    }

    public final void endOperation(String paramString)
    {
      AppMethodBeat.i(12293);
      if (this.mOperation == null)
        AppMethodBeat.o(12293);
      while (true)
      {
        return;
        SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mConnection.get();
        if (localSQLiteConnection == null)
        {
          AppMethodBeat.o(12293);
        }
        else
        {
          if (localSQLiteConnection.mRecentOperations.endOperationDeferLog(this.mOperation.mCookie))
            localSQLiteConnection.mRecentOperations.logOperation(this.mOperation.mCookie, paramString);
          this.mOperation = null;
          AppMethodBeat.o(12293);
        }
      }
    }

    public final void failOperation(Exception paramException)
    {
      AppMethodBeat.i(12292);
      if (this.mOperation == null)
        AppMethodBeat.o(12292);
      while (true)
      {
        return;
        SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mConnection.get();
        if (localSQLiteConnection == null)
        {
          AppMethodBeat.o(12292);
        }
        else
        {
          localSQLiteConnection.mRecentOperations.failOperation(this.mOperation.mCookie, paramException);
          AppMethodBeat.o(12292);
        }
      }
    }

    public final long getPtr()
    {
      return this.mStatementPtr;
    }

    public final String getSQL()
    {
      return this.mSql;
    }

    public final int getType()
    {
      return this.mType;
    }

    public final boolean isReadOnly()
    {
      return this.mReadOnly;
    }

    public final void reset(boolean paramBoolean)
    {
      AppMethodBeat.i(12288);
      SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mConnection.get();
      if (localSQLiteConnection == null)
        AppMethodBeat.o(12288);
      while (true)
      {
        return;
        SQLiteConnection.access$1000(localSQLiteConnection, this, paramBoolean);
        AppMethodBeat.o(12288);
      }
    }
  }

  final class PreparedStatementCache extends LruCache<String, SQLiteConnection.PreparedStatement>
  {
    public PreparedStatementCache(int arg2)
    {
      super();
    }

    public final void dump(Printer paramPrinter)
    {
      AppMethodBeat.i(12295);
      paramPrinter.println("  Prepared statement cache:");
      Object localObject1 = snapshot();
      if (!((Map)localObject1).isEmpty())
      {
        Iterator localIterator = ((Map)localObject1).entrySet().iterator();
        for (int i = 0; localIterator.hasNext(); i++)
        {
          Object localObject2 = (Map.Entry)localIterator.next();
          localObject1 = (SQLiteConnection.PreparedStatement)((Map.Entry)localObject2).getValue();
          if (((SQLiteConnection.PreparedStatement)localObject1).mInCache)
          {
            localObject2 = (String)((Map.Entry)localObject2).getKey();
            paramPrinter.println("    " + i + ": statementPtr=0x" + Long.toHexString(((SQLiteConnection.PreparedStatement)localObject1).getPtr()) + ", numParameters=" + ((SQLiteConnection.PreparedStatement)localObject1).mNumParameters + ", type=" + ((SQLiteConnection.PreparedStatement)localObject1).mType + ", readOnly=" + ((SQLiteConnection.PreparedStatement)localObject1).mReadOnly + ", sql=\"" + SQLiteConnection.access$1500((String)localObject2) + "\"");
          }
        }
        AppMethodBeat.o(12295);
      }
      while (true)
      {
        return;
        paramPrinter.println("    <none>");
        AppMethodBeat.o(12295);
      }
    }

    protected final void entryRemoved(boolean paramBoolean, String paramString, SQLiteConnection.PreparedStatement paramPreparedStatement1, SQLiteConnection.PreparedStatement paramPreparedStatement2)
    {
      AppMethodBeat.i(12294);
      SQLiteConnection.PreparedStatement.access$502(paramPreparedStatement1, false);
      if (!paramPreparedStatement1.mInUse)
        SQLiteConnection.access$1400(SQLiteConnection.this, paramPreparedStatement1);
      AppMethodBeat.o(12294);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteConnection
 * JD-Core Version:    0.6.2
 */