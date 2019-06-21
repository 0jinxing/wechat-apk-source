package com.tencent.wcdb.database;

import android.os.SystemClock;
import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.CancellationSignal.OnCancelListener;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import com.tencent.wcdb.support.PrefixPrinter;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public final class SQLiteConnectionPool
  implements Closeable
{
  public static final int CONNECTION_FLAG_INTERACTIVE = 4;
  public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
  public static final int CONNECTION_FLAG_READ_ONLY = 1;
  private static final long CONNECTION_POOL_BUSY_MILLIS = 3000L;
  private static final int OPEN_FLAG_REOPEN_MASK = 268435473;
  private static final String TAG = "WCDB.SQLiteConnectionPool";
  private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections;
  private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections;
  private SQLiteConnection mAvailablePrimaryConnection;
  private volatile SQLiteChangeListener mChangeListener;
  private volatile SQLiteCheckpointListener mCheckpointListener;
  private SQLiteCipherSpec mCipher;
  private final SQLiteDatabaseConfiguration mConfiguration;
  private final AtomicBoolean mConnectionLeaked;
  private ConnectionWaiter mConnectionWaiterPool;
  private ConnectionWaiter mConnectionWaiterQueue;
  private final WeakReference<SQLiteDatabase> mDB;
  private boolean mIsOpen;
  private final Object mLock;
  private int mMaxConnectionPoolSize;
  private int mNextConnectionId;
  private byte[] mPassword;
  private volatile SQLiteTrace mTraceCallback;

  static
  {
    AppMethodBeat.i(12404);
    if (!SQLiteConnectionPool.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(12404);
      return;
    }
  }

  private SQLiteConnectionPool(SQLiteDatabase paramSQLiteDatabase, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt)
  {
    AppMethodBeat.i(12362);
    this.mLock = new Object();
    this.mConnectionLeaked = new AtomicBoolean();
    this.mAvailableNonPrimaryConnections = new ArrayList();
    this.mAcquiredConnections = new WeakHashMap();
    this.mDB = new WeakReference(paramSQLiteDatabase);
    this.mConfiguration = new SQLiteDatabaseConfiguration(paramSQLiteDatabaseConfiguration);
    setMaxConnectionPoolSizeLocked(paramInt);
    AppMethodBeat.o(12362);
  }

  private void cancelConnectionWaiterLocked(ConnectionWaiter paramConnectionWaiter)
  {
    AppMethodBeat.i(12385);
    if ((paramConnectionWaiter.mAssignedConnection != null) || (paramConnectionWaiter.mException != null))
    {
      AppMethodBeat.o(12385);
      return;
    }
    Object localObject1 = this.mConnectionWaiterQueue;
    Object localObject2 = null;
    while (localObject1 != paramConnectionWaiter)
    {
      if ((!$assertionsDisabled) && (localObject1 == null))
      {
        paramConnectionWaiter = new AssertionError();
        AppMethodBeat.o(12385);
        throw paramConnectionWaiter;
      }
      ConnectionWaiter localConnectionWaiter = ((ConnectionWaiter)localObject1).mNext;
      localObject2 = localObject1;
      localObject1 = localConnectionWaiter;
    }
    if (localObject2 != null)
      localObject2.mNext = paramConnectionWaiter.mNext;
    while (true)
    {
      paramConnectionWaiter.mException = new OperationCanceledException();
      LockSupport.unpark(paramConnectionWaiter.mThread);
      wakeConnectionWaitersLocked();
      AppMethodBeat.o(12385);
      break;
      this.mConnectionWaiterQueue = paramConnectionWaiter.mNext;
    }
  }

  private void closeAvailableConnectionsAndLogExceptionsLocked()
  {
    AppMethodBeat.i(12377);
    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
    if (this.mAvailablePrimaryConnection != null)
    {
      closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
      this.mAvailablePrimaryConnection = null;
    }
    AppMethodBeat.o(12377);
  }

  private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked()
  {
    AppMethodBeat.i(12378);
    int i = this.mAvailableNonPrimaryConnections.size();
    for (int j = 0; j < i; j++)
      closeConnectionAndLogExceptionsLocked((SQLiteConnection)this.mAvailableNonPrimaryConnections.get(j));
    this.mAvailableNonPrimaryConnections.clear();
    AppMethodBeat.o(12378);
  }

  private void closeConnectionAndLogExceptionsLocked(SQLiteConnection paramSQLiteConnection)
  {
    AppMethodBeat.i(12380);
    try
    {
      paramSQLiteConnection.close();
      AppMethodBeat.o(12380);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        Log.e("WCDB.SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + paramSQLiteConnection + localRuntimeException.getMessage());
        AppMethodBeat.o(12380);
      }
    }
  }

  private void closeExcessConnectionsAndLogExceptionsLocked()
  {
    AppMethodBeat.i(12379);
    int j;
    for (int i = this.mAvailableNonPrimaryConnections.size(); ; i = j)
    {
      j = i - 1;
      if (i <= this.mMaxConnectionPoolSize - 1)
        break;
      closeConnectionAndLogExceptionsLocked((SQLiteConnection)this.mAvailableNonPrimaryConnections.remove(j));
    }
    AppMethodBeat.o(12379);
  }

  private void discardAcquiredConnectionsLocked()
  {
    AppMethodBeat.i(12381);
    markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    AppMethodBeat.o(12381);
  }

  private void dispose(boolean paramBoolean)
  {
    AppMethodBeat.i(12368);
    if (!paramBoolean);
    while (true)
    {
      synchronized (this.mLock)
      {
        throwIfClosedLocked();
        this.mIsOpen = false;
        closeAvailableConnectionsAndLogExceptionsLocked();
        int i = this.mAcquiredConnections.size();
        if (i != 0)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("The connection pool for ");
          Log.i("WCDB.SQLiteConnectionPool", this.mConfiguration.label + " has been closed but there are still " + i + " connections in use.  They will be closed as they are released back to the pool.");
        }
        wakeConnectionWaitersLocked();
        AppMethodBeat.o(12368);
        return;
      }
      AppMethodBeat.o(12368);
    }
  }

  private void finishAcquireConnectionLocked(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    AppMethodBeat.i(12391);
    boolean bool;
    if ((paramInt & 0x1) != 0)
      bool = true;
    try
    {
      while (true)
      {
        paramSQLiteConnection.setOnlyAllowReadOnlyOperations(bool);
        this.mAcquiredConnections.put(paramSQLiteConnection, AcquiredConnectionStatus.NORMAL);
        AppMethodBeat.o(12391);
        return;
        bool = false;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("WCDB.SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + paramSQLiteConnection + ", connectionFlags=" + paramInt);
      closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
      AppMethodBeat.o(12391);
      throw localRuntimeException;
    }
  }

  private ConnectionPoolBusyInfo gatherConnectionPoolBusyInfoLocked()
  {
    AppMethodBeat.i(12387);
    ConnectionPoolBusyInfo localConnectionPoolBusyInfo = new ConnectionPoolBusyInfo(null);
    localConnectionPoolBusyInfo.activeConnections = 0;
    localConnectionPoolBusyInfo.idleConnections = 0;
    if (!this.mAcquiredConnections.isEmpty())
    {
      Iterator localIterator = this.mAcquiredConnections.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (SQLiteConnection)localIterator.next();
        SQLiteTrace.TraceInfo localTraceInfo = ((SQLiteConnection)localObject).tracePersistAcquisitionUnsafe();
        if (localTraceInfo != null)
          localConnectionPoolBusyInfo.activeTransactions.add(localTraceInfo);
        localTraceInfo = ((SQLiteConnection)localObject).traceCurrentOperationUnsafe();
        if (localTraceInfo != null)
        {
          localConnectionPoolBusyInfo.activeSql.add(localTraceInfo);
          localObject = ((SQLiteConnection)localObject).describeCurrentOperationUnsafe();
          if (localObject != null)
            localConnectionPoolBusyInfo.activeOperationDescriptions.add(localObject);
          localConnectionPoolBusyInfo.activeConnections += 1;
        }
        else
        {
          localConnectionPoolBusyInfo.idleConnections += 1;
        }
      }
    }
    localConnectionPoolBusyInfo.availableConnections = this.mAvailableNonPrimaryConnections.size();
    if (this.mAvailablePrimaryConnection != null)
      localConnectionPoolBusyInfo.availableConnections += 1;
    AppMethodBeat.o(12387);
    return localConnectionPoolBusyInfo;
  }

  private static int getPriority(int paramInt)
  {
    if ((paramInt & 0x4) != 0);
    for (paramInt = 1; ; paramInt = 0)
      return paramInt;
  }

  private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(12392);
    Object localObject = this.mConnectionWaiterQueue;
    if (localObject != null)
    {
      paramInt = getPriority(paramInt);
      if (paramInt <= ((ConnectionWaiter)localObject).mPriority)
        if ((paramBoolean) || (!((ConnectionWaiter)localObject).mWantPrimaryConnection))
        {
          paramBoolean = true;
          AppMethodBeat.o(12392);
        }
    }
    while (true)
    {
      return paramBoolean;
      ConnectionWaiter localConnectionWaiter = ((ConnectionWaiter)localObject).mNext;
      localObject = localConnectionWaiter;
      if (localConnectionWaiter != null)
        break;
      paramBoolean = false;
      AppMethodBeat.o(12392);
    }
  }

  private void logConnectionPoolBusy(ConnectionPoolBusyInfo paramConnectionPoolBusyInfo, long paramLong, int paramInt)
  {
    AppMethodBeat.i(12386);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject;
    if (paramLong != 0L)
    {
      localObject = Thread.currentThread();
      localStringBuilder.append("The connection pool for database '").append(paramConnectionPoolBusyInfo.label);
      localStringBuilder.append("' has been unable to grant a connection to thread ");
      localStringBuilder.append(((Thread)localObject).getId()).append(" (").append(((Thread)localObject).getName()).append(") ");
      localStringBuilder.append("with flags 0x").append(Integer.toHexString(paramInt));
      localStringBuilder.append(" for ").append((float)paramLong * 0.001F).append(" seconds.\n");
    }
    localStringBuilder.append("Connections: ").append(paramConnectionPoolBusyInfo.activeConnections).append(" active, ");
    localStringBuilder.append(paramConnectionPoolBusyInfo.idleConnections).append(" idle, ");
    localStringBuilder.append(paramConnectionPoolBusyInfo.availableConnections).append(" available.\n");
    if (!paramConnectionPoolBusyInfo.activeOperationDescriptions.isEmpty())
    {
      localStringBuilder.append("\nRequests in progress:\n");
      paramConnectionPoolBusyInfo = paramConnectionPoolBusyInfo.activeOperationDescriptions.iterator();
      while (paramConnectionPoolBusyInfo.hasNext())
      {
        localObject = (String)paramConnectionPoolBusyInfo.next();
        localStringBuilder.append("  ").append((String)localObject).append("\n");
      }
    }
    Log.w("WCDB.SQLiteConnectionPool", localStringBuilder.toString());
    AppMethodBeat.o(12386);
  }

  private void markAcquiredConnectionsLocked(AcquiredConnectionStatus paramAcquiredConnectionStatus)
  {
    AppMethodBeat.i(12383);
    if (!this.mAcquiredConnections.isEmpty())
    {
      ArrayList localArrayList = new ArrayList(this.mAcquiredConnections.size());
      Iterator localIterator = this.mAcquiredConnections.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        AcquiredConnectionStatus localAcquiredConnectionStatus = (AcquiredConnectionStatus)localEntry.getValue();
        if ((paramAcquiredConnectionStatus != localAcquiredConnectionStatus) && (localAcquiredConnectionStatus != AcquiredConnectionStatus.DISCARD))
          localArrayList.add(localEntry.getKey());
      }
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        this.mAcquiredConnections.put(localArrayList.get(j), paramAcquiredConnectionStatus);
    }
    AppMethodBeat.o(12383);
  }

  private ConnectionWaiter obtainConnectionWaiterLocked(Thread paramThread, long paramLong, int paramInt1, boolean paramBoolean, String paramString, int paramInt2)
  {
    AppMethodBeat.i(12395);
    ConnectionWaiter localConnectionWaiter = this.mConnectionWaiterPool;
    if (localConnectionWaiter != null)
    {
      this.mConnectionWaiterPool = localConnectionWaiter.mNext;
      localConnectionWaiter.mNext = null;
    }
    while (true)
    {
      localConnectionWaiter.mThread = paramThread;
      localConnectionWaiter.mStartTime = paramLong;
      localConnectionWaiter.mPriority = paramInt1;
      localConnectionWaiter.mWantPrimaryConnection = paramBoolean;
      localConnectionWaiter.mSql = paramString;
      localConnectionWaiter.mConnectionFlags = paramInt2;
      AppMethodBeat.o(12395);
      return localConnectionWaiter;
      localConnectionWaiter = new ConnectionWaiter(null);
    }
  }

  public static SQLiteConnectionPool open(SQLiteDatabase paramSQLiteDatabase, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec)
  {
    AppMethodBeat.i(12364);
    paramSQLiteDatabase = open(paramSQLiteDatabase, paramSQLiteDatabaseConfiguration, paramArrayOfByte, paramSQLiteCipherSpec, 1);
    AppMethodBeat.o(12364);
    return paramSQLiteDatabase;
  }

  public static SQLiteConnectionPool open(SQLiteDatabase paramSQLiteDatabase, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, int paramInt)
  {
    AppMethodBeat.i(12365);
    if (paramSQLiteDatabaseConfiguration == null)
    {
      paramSQLiteDatabase = new IllegalArgumentException("configuration must not be null.");
      AppMethodBeat.o(12365);
      throw paramSQLiteDatabase;
    }
    paramSQLiteDatabaseConfiguration = new SQLiteConnectionPool(paramSQLiteDatabase, paramSQLiteDatabaseConfiguration, paramInt);
    paramSQLiteDatabaseConfiguration.mPassword = paramArrayOfByte;
    if (paramSQLiteCipherSpec == null);
    for (paramSQLiteDatabase = null; ; paramSQLiteDatabase = new SQLiteCipherSpec(paramSQLiteCipherSpec))
    {
      paramSQLiteDatabaseConfiguration.mCipher = paramSQLiteDatabase;
      paramSQLiteDatabaseConfiguration.open();
      AppMethodBeat.o(12365);
      return paramSQLiteDatabaseConfiguration;
    }
  }

  private void open()
  {
    AppMethodBeat.i(12366);
    this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
    this.mIsOpen = true;
    AppMethodBeat.o(12366);
  }

  private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, boolean paramBoolean)
  {
    AppMethodBeat.i(12375);
    int i = this.mNextConnectionId;
    this.mNextConnectionId = (i + 1);
    paramSQLiteDatabaseConfiguration = SQLiteConnection.open(this, paramSQLiteDatabaseConfiguration, i, paramBoolean, this.mPassword, this.mCipher);
    AppMethodBeat.o(12375);
    return paramSQLiteDatabaseConfiguration;
  }

  private void reconfigureAllConnectionsLocked()
  {
    AppMethodBeat.i(12382);
    if (this.mAvailablePrimaryConnection != null);
    try
    {
      this.mAvailablePrimaryConnection.reconfigure(this.mConfiguration);
      i = this.mAvailableNonPrimaryConnections.size();
      j = 0;
      if (j < i)
        localSQLiteConnection = (SQLiteConnection)this.mAvailableNonPrimaryConnections.get(j);
    }
    catch (RuntimeException localRuntimeException1)
    {
      try
      {
        while (true)
        {
          SQLiteConnection localSQLiteConnection;
          localSQLiteConnection.reconfigure(this.mConfiguration);
          j++;
        }
        localRuntimeException1 = localRuntimeException1;
        Log.e("WCDB.SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, new Object[] { localRuntimeException1 });
        closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
        this.mAvailablePrimaryConnection = null;
      }
      catch (RuntimeException localRuntimeException2)
      {
        while (true)
        {
          int i;
          Log.e("WCDB.SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: ".concat(String.valueOf(localRuntimeException1)), new Object[] { localRuntimeException2 });
          closeConnectionAndLogExceptionsLocked(localRuntimeException1);
          ArrayList localArrayList = this.mAvailableNonPrimaryConnections;
          int k = j - 1;
          localArrayList.remove(j);
          i--;
          int j = k;
        }
      }
      markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
      AppMethodBeat.o(12382);
    }
  }

  private boolean recycleConnectionLocked(SQLiteConnection paramSQLiteConnection, AcquiredConnectionStatus paramAcquiredConnectionStatus)
  {
    boolean bool = false;
    AppMethodBeat.i(12372);
    AcquiredConnectionStatus localAcquiredConnectionStatus = paramAcquiredConnectionStatus;
    if (paramAcquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE);
    try
    {
      paramSQLiteConnection.reconfigure(this.mConfiguration);
      localAcquiredConnectionStatus = paramAcquiredConnectionStatus;
      if (localAcquiredConnectionStatus == AcquiredConnectionStatus.DISCARD)
      {
        closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
        AppMethodBeat.o(12372);
        return bool;
      }
    }
    catch (RuntimeException paramAcquiredConnectionStatus)
    {
      while (true)
      {
        Log.e("WCDB.SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: ".concat(String.valueOf(paramSQLiteConnection)), new Object[] { paramAcquiredConnectionStatus });
        localAcquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
        continue;
        AppMethodBeat.o(12372);
        bool = true;
      }
    }
  }

  private void recycleConnectionWaiterLocked(ConnectionWaiter paramConnectionWaiter)
  {
    paramConnectionWaiter.mNext = this.mConnectionWaiterPool;
    paramConnectionWaiter.mThread = null;
    paramConnectionWaiter.mSql = null;
    paramConnectionWaiter.mAssignedConnection = null;
    paramConnectionWaiter.mException = null;
    paramConnectionWaiter.mNonce += 1;
    this.mConnectionWaiterPool = paramConnectionWaiter;
  }

  private void setMaxConnectionPoolSizeLocked(int paramInt)
  {
    AppMethodBeat.i(12393);
    int i = paramInt;
    if (paramInt <= 0)
      if ((this.mConfiguration.openFlags & 0x20000000) == 0)
        break label62;
    label62: for (i = 4; ; i = 1)
    {
      this.mMaxConnectionPoolSize = i;
      Log.i("WCDB.SQLiteConnectionPool", "Max connection pool size is %d.", new Object[] { Integer.valueOf(this.mMaxConnectionPoolSize) });
      AppMethodBeat.o(12393);
      return;
    }
  }

  private void throwIfClosedLocked()
  {
    AppMethodBeat.i(12394);
    if (!this.mIsOpen)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
      AppMethodBeat.o(12394);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(12394);
  }

  private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String paramString, int paramInt)
  {
    AppMethodBeat.i(12390);
    int i = this.mAvailableNonPrimaryConnections.size();
    int j;
    if ((i > 1) && (paramString != null))
    {
      j = 0;
      if (j < i)
      {
        SQLiteConnection localSQLiteConnection = (SQLiteConnection)this.mAvailableNonPrimaryConnections.get(j);
        if (localSQLiteConnection.isPreparedStatementInCache(paramString))
        {
          this.mAvailableNonPrimaryConnections.remove(j);
          finishAcquireConnectionLocked(localSQLiteConnection, paramInt);
          AppMethodBeat.o(12390);
          paramString = localSQLiteConnection;
        }
      }
    }
    while (true)
    {
      return paramString;
      j++;
      break;
      if (i > 0)
      {
        paramString = (SQLiteConnection)this.mAvailableNonPrimaryConnections.remove(i - 1);
        finishAcquireConnectionLocked(paramString, paramInt);
        AppMethodBeat.o(12390);
      }
      else
      {
        i = this.mAcquiredConnections.size();
        j = i;
        if (this.mAvailablePrimaryConnection != null)
          j = i + 1;
        if (j >= this.mMaxConnectionPoolSize)
        {
          paramString = null;
          AppMethodBeat.o(12390);
        }
        else
        {
          paramString = openConnectionLocked(this.mConfiguration, false);
          finishAcquireConnectionLocked(paramString, paramInt);
          AppMethodBeat.o(12390);
        }
      }
    }
  }

  private SQLiteConnection tryAcquirePrimaryConnectionLocked(int paramInt)
  {
    AppMethodBeat.i(12389);
    Object localObject = this.mAvailablePrimaryConnection;
    if (localObject != null)
    {
      this.mAvailablePrimaryConnection = null;
      finishAcquireConnectionLocked((SQLiteConnection)localObject, paramInt);
      AppMethodBeat.o(12389);
    }
    while (true)
    {
      return localObject;
      localObject = this.mAcquiredConnections.keySet().iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
          if (((SQLiteConnection)((Iterator)localObject).next()).isPrimaryConnection())
          {
            AppMethodBeat.o(12389);
            localObject = null;
            break;
          }
      localObject = openConnectionLocked(this.mConfiguration, true);
      finishAcquireConnectionLocked((SQLiteConnection)localObject, paramInt);
      AppMethodBeat.o(12389);
    }
  }

  // ERROR //
  private SQLiteConnection waitForConnection(String paramString, int paramInt, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: sipush 12384
    //   3: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_2
    //   7: iconst_2
    //   8: iand
    //   9: ifeq +76 -> 85
    //   12: iconst_1
    //   13: istore 4
    //   15: aload_0
    //   16: getfield 95	com/tencent/wcdb/database/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   19: astore 5
    //   21: aload 5
    //   23: monitorenter
    //   24: aload_0
    //   25: invokespecial 241	com/tencent/wcdb/database/SQLiteConnectionPool:throwIfClosedLocked	()V
    //   28: aload_3
    //   29: ifnull +7 -> 36
    //   32: aload_3
    //   33: invokevirtual 537	com/tencent/wcdb/support/CancellationSignal:throwIfCanceled	()V
    //   36: aconst_null
    //   37: astore 6
    //   39: iload 4
    //   41: ifne +11 -> 52
    //   44: aload_0
    //   45: aload_1
    //   46: iload_2
    //   47: invokespecial 539	com/tencent/wcdb/database/SQLiteConnectionPool:tryAcquireNonPrimaryConnectionLocked	(Ljava/lang/String;I)Lcom/tencent/wcdb/database/SQLiteConnection;
    //   50: astore 6
    //   52: aload 6
    //   54: astore 7
    //   56: aload 6
    //   58: ifnonnull +10 -> 68
    //   61: aload_0
    //   62: iload_2
    //   63: invokespecial 541	com/tencent/wcdb/database/SQLiteConnectionPool:tryAcquirePrimaryConnectionLocked	(I)Lcom/tencent/wcdb/database/SQLiteConnection;
    //   66: astore 7
    //   68: aload 7
    //   70: ifnull +21 -> 91
    //   73: aload 5
    //   75: monitorexit
    //   76: sipush 12384
    //   79: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: aload 7
    //   84: areturn
    //   85: iconst_0
    //   86: istore 4
    //   88: goto -73 -> 15
    //   91: iload_2
    //   92: invokestatic 341	com/tencent/wcdb/database/SQLiteConnectionPool:getPriority	(I)I
    //   95: istore 8
    //   97: invokestatic 546	android/os/SystemClock:uptimeMillis	()J
    //   100: lstore 9
    //   102: aload_0
    //   103: invokestatic 356	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   106: lload 9
    //   108: iload 8
    //   110: iload 4
    //   112: aload_1
    //   113: iload_2
    //   114: invokespecial 548	com/tencent/wcdb/database/SQLiteConnectionPool:obtainConnectionWaiterLocked	(Ljava/lang/Thread;JIZLjava/lang/String;I)Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;
    //   117: astore 11
    //   119: aload_0
    //   120: getfield 144	com/tencent/wcdb/database/SQLiteConnectionPool:mConnectionWaiterQueue	Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;
    //   123: astore 7
    //   125: aconst_null
    //   126: astore 6
    //   128: aload 7
    //   130: ifnull +20 -> 150
    //   133: iload 8
    //   135: aload 7
    //   137: getfield 344	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mPriority	I
    //   140: if_icmple +178 -> 318
    //   143: aload 11
    //   145: aload 7
    //   147: putfield 150	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mNext	Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;
    //   150: aload 6
    //   152: ifnull +184 -> 336
    //   155: aload 6
    //   157: aload 11
    //   159: putfield 150	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mNext	Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;
    //   162: aload 11
    //   164: getfield 501	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mNonce	I
    //   167: istore 8
    //   169: aload 5
    //   171: monitorexit
    //   172: aload_3
    //   173: ifnull +19 -> 192
    //   176: aload_3
    //   177: new 8	com/tencent/wcdb/database/SQLiteConnectionPool$1
    //   180: dup
    //   181: aload_0
    //   182: aload 11
    //   184: iload 8
    //   186: invokespecial 551	com/tencent/wcdb/database/SQLiteConnectionPool$1:<init>	(Lcom/tencent/wcdb/database/SQLiteConnectionPool;Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;I)V
    //   189: invokevirtual 555	com/tencent/wcdb/support/CancellationSignal:setOnCancelListener	(Lcom/tencent/wcdb/support/CancellationSignal$OnCancelListener;)V
    //   192: ldc2_w 29
    //   195: lstore 9
    //   197: aload 11
    //   199: getfield 432	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mStartTime	J
    //   202: ldc2_w 29
    //   205: ladd
    //   206: lstore 12
    //   208: aload_0
    //   209: getfield 100	com/tencent/wcdb/database/SQLiteConnectionPool:mConnectionLeaked	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   212: iconst_1
    //   213: iconst_0
    //   214: invokevirtual 559	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
    //   217: ifeq +19 -> 236
    //   220: aload_0
    //   221: getfield 95	com/tencent/wcdb/database/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   224: astore 7
    //   226: aload 7
    //   228: monitorenter
    //   229: aload_0
    //   230: invokespecial 166	com/tencent/wcdb/database/SQLiteConnectionPool:wakeConnectionWaitersLocked	()V
    //   233: aload 7
    //   235: monitorexit
    //   236: ldc2_w 560
    //   239: lload 9
    //   241: lmul
    //   242: invokestatic 565	java/util/concurrent/locks/LockSupport:parkNanos	(J)V
    //   245: invokestatic 568	java/lang/Thread:interrupted	()Z
    //   248: pop
    //   249: aload_0
    //   250: getfield 95	com/tencent/wcdb/database/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   253: astore 6
    //   255: aload 6
    //   257: monitorenter
    //   258: aload_0
    //   259: invokespecial 241	com/tencent/wcdb/database/SQLiteConnectionPool:throwIfClosedLocked	()V
    //   262: aload 11
    //   264: getfield 138	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mAssignedConnection	Lcom/tencent/wcdb/database/SQLiteConnection;
    //   267: astore 7
    //   269: aload 11
    //   271: getfield 142	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mException	Ljava/lang/RuntimeException;
    //   274: astore 14
    //   276: aload 7
    //   278: ifnonnull +8 -> 286
    //   281: aload 14
    //   283: ifnull +125 -> 408
    //   286: aload_0
    //   287: aload 11
    //   289: invokespecial 570	com/tencent/wcdb/database/SQLiteConnectionPool:recycleConnectionWaiterLocked	(Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;)V
    //   292: aload 7
    //   294: ifnull +93 -> 387
    //   297: aload 6
    //   299: monitorexit
    //   300: aload_3
    //   301: ifnull +8 -> 309
    //   304: aload_3
    //   305: aconst_null
    //   306: invokevirtual 555	com/tencent/wcdb/support/CancellationSignal:setOnCancelListener	(Lcom/tencent/wcdb/support/CancellationSignal$OnCancelListener;)V
    //   309: sipush 12384
    //   312: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   315: goto -233 -> 82
    //   318: aload 7
    //   320: getfield 150	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mNext	Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;
    //   323: astore 14
    //   325: aload 7
    //   327: astore 6
    //   329: aload 14
    //   331: astore 7
    //   333: goto -205 -> 128
    //   336: aload_0
    //   337: aload 11
    //   339: putfield 144	com/tencent/wcdb/database/SQLiteConnectionPool:mConnectionWaiterQueue	Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter;
    //   342: goto -180 -> 162
    //   345: astore_1
    //   346: aload 5
    //   348: monitorexit
    //   349: sipush 12384
    //   352: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   355: aload_1
    //   356: athrow
    //   357: astore_1
    //   358: aload 7
    //   360: monitorexit
    //   361: sipush 12384
    //   364: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   367: aload_1
    //   368: athrow
    //   369: astore_1
    //   370: aload_3
    //   371: ifnull +8 -> 379
    //   374: aload_3
    //   375: aconst_null
    //   376: invokevirtual 555	com/tencent/wcdb/support/CancellationSignal:setOnCancelListener	(Lcom/tencent/wcdb/support/CancellationSignal$OnCancelListener;)V
    //   379: sipush 12384
    //   382: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   385: aload_1
    //   386: athrow
    //   387: sipush 12384
    //   390: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: aload 14
    //   395: athrow
    //   396: astore_1
    //   397: aload 6
    //   399: monitorexit
    //   400: sipush 12384
    //   403: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   406: aload_1
    //   407: athrow
    //   408: invokestatic 546	android/os/SystemClock:uptimeMillis	()J
    //   411: lstore 15
    //   413: lload 15
    //   415: lload 12
    //   417: lcmp
    //   418: ifge +95 -> 513
    //   421: lload 15
    //   423: lload 12
    //   425: lsub
    //   426: lstore 9
    //   428: aconst_null
    //   429: astore 7
    //   431: aload 6
    //   433: monitorexit
    //   434: aload 7
    //   436: ifnull +74 -> 510
    //   439: lload 15
    //   441: aload 11
    //   443: getfield 432	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionWaiter:mStartTime	J
    //   446: lsub
    //   447: lstore 15
    //   449: aload_0
    //   450: aload 7
    //   452: lload 15
    //   454: iload_2
    //   455: invokespecial 572	com/tencent/wcdb/database/SQLiteConnectionPool:logConnectionPoolBusy	(Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionPoolBusyInfo;JI)V
    //   458: aload_0
    //   459: getfield 117	com/tencent/wcdb/database/SQLiteConnectionPool:mDB	Ljava/lang/ref/WeakReference;
    //   462: invokevirtual 574	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   465: checkcast 576	com/tencent/wcdb/database/SQLiteDatabase
    //   468: astore 14
    //   470: aload_0
    //   471: getfield 578	com/tencent/wcdb/database/SQLiteConnectionPool:mTraceCallback	Lcom/tencent/wcdb/database/SQLiteTrace;
    //   474: astore 6
    //   476: aload 14
    //   478: ifnull +32 -> 510
    //   481: aload 6
    //   483: ifnull +27 -> 510
    //   486: aload 6
    //   488: aload 14
    //   490: aload_1
    //   491: lload 15
    //   493: iload 4
    //   495: aload 7
    //   497: getfield 326	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionPoolBusyInfo:activeSql	Ljava/util/ArrayList;
    //   500: aload 7
    //   502: getfield 316	com/tencent/wcdb/database/SQLiteConnectionPool$ConnectionPoolBusyInfo:activeTransactions	Ljava/util/ArrayList;
    //   505: invokeinterface 584 8 0
    //   510: goto -302 -> 208
    //   513: aload_0
    //   514: invokespecial 586	com/tencent/wcdb/database/SQLiteConnectionPool:gatherConnectionPoolBusyInfoLocked	()Lcom/tencent/wcdb/database/SQLiteConnectionPool$ConnectionPoolBusyInfo;
    //   517: astore 7
    //   519: ldc2_w 29
    //   522: lstore 9
    //   524: ldc2_w 29
    //   527: lload 15
    //   529: ladd
    //   530: lstore 12
    //   532: goto -101 -> 431
    //
    // Exception table:
    //   from	to	target	type
    //   24	28	345	finally
    //   32	36	345	finally
    //   44	52	345	finally
    //   61	68	345	finally
    //   73	76	345	finally
    //   91	125	345	finally
    //   133	150	345	finally
    //   155	162	345	finally
    //   162	172	345	finally
    //   318	325	345	finally
    //   336	342	345	finally
    //   346	349	345	finally
    //   229	236	357	finally
    //   358	361	357	finally
    //   197	208	369	finally
    //   208	229	369	finally
    //   236	258	369	finally
    //   361	369	369	finally
    //   400	408	369	finally
    //   439	476	369	finally
    //   486	510	369	finally
    //   258	276	396	finally
    //   286	292	396	finally
    //   297	300	396	finally
    //   387	396	396	finally
    //   397	400	396	finally
    //   408	413	396	finally
    //   431	434	396	finally
    //   513	519	396	finally
  }

  private void wakeConnectionWaitersLocked()
  {
    AppMethodBeat.i(12388);
    Object localObject1 = this.mConnectionWaiterQueue;
    int i = 0;
    int j = 0;
    Object localObject2 = null;
    int k;
    int m;
    Object localObject3;
    label60: label72: int n;
    while (true)
      if (localObject1 != null)
        if (!this.mIsOpen)
        {
          k = 1;
          m = j;
          j = k;
          localObject3 = ((ConnectionWaiter)localObject1).mNext;
          if (j != 0)
            if (localObject2 != null)
            {
              localObject2.mNext = ((ConnectionWaiter)localObject3);
              ((ConnectionWaiter)localObject1).mNext = null;
              LockSupport.unpark(((ConnectionWaiter)localObject1).mThread);
              localObject1 = localObject3;
              j = m;
            }
        }
        else
        {
          n = i;
          k = j;
        }
    while (true)
    {
      try
      {
        if ((((ConnectionWaiter)localObject1).mWantPrimaryConnection) || (i != 0))
          break label279;
        n = i;
        k = j;
        Object localObject5 = tryAcquireNonPrimaryConnectionLocked(((ConnectionWaiter)localObject1).mSql, ((ConnectionWaiter)localObject1).mConnectionFlags);
        localObject3 = localObject5;
        if (localObject5 == null)
        {
          i = 1;
          localObject3 = localObject5;
        }
        localObject5 = localObject3;
        m = j;
        if (localObject3 == null)
        {
          localObject5 = localObject3;
          m = j;
          if (j == 0)
          {
            n = i;
            k = j;
            localObject3 = tryAcquirePrimaryConnectionLocked(((ConnectionWaiter)localObject1).mConnectionFlags);
            localObject5 = localObject3;
            m = j;
            if (localObject3 == null)
            {
              m = 1;
              localObject5 = localObject3;
            }
          }
        }
        if (localObject5 != null)
        {
          n = i;
          k = m;
          ((ConnectionWaiter)localObject1).mAssignedConnection = ((SQLiteConnection)localObject5);
          j = 1;
          break;
        }
        if ((i != 0) && (m != 0))
        {
          AppMethodBeat.o(12388);
          return;
        }
        j = 0;
      }
      catch (RuntimeException localRuntimeException)
      {
        ((ConnectionWaiter)localObject1).mException = localRuntimeException;
        j = 1;
        i = n;
        m = k;
      }
      break;
      this.mConnectionWaiterQueue = localRuntimeException;
      break label60;
      localObject2 = localObject1;
      break label72;
      AppMethodBeat.o(12388);
      continue;
      label279: Object localObject4 = null;
    }
  }

  public final SQLiteConnection acquireConnection(String paramString, int paramInt, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12370);
    long l1 = SystemClock.uptimeMillis();
    paramCancellationSignal = waitForConnection(paramString, paramInt, paramCancellationSignal);
    SQLiteTrace localSQLiteTrace = this.mTraceCallback;
    long l2;
    SQLiteDatabase localSQLiteDatabase;
    if (localSQLiteTrace != null)
    {
      l2 = SystemClock.uptimeMillis();
      localSQLiteDatabase = (SQLiteDatabase)this.mDB.get();
      if (localSQLiteDatabase != null)
        if ((paramInt & 0x2) == 0)
          break label86;
    }
    label86: for (boolean bool = true; ; bool = false)
    {
      localSQLiteTrace.onConnectionObtained(localSQLiteDatabase, paramString, l2 - l1, bool);
      AppMethodBeat.o(12370);
      return paramCancellationSignal;
    }
  }

  public final void close()
  {
    AppMethodBeat.i(12367);
    dispose(false);
    AppMethodBeat.o(12367);
  }

  public final void collectDbStats(ArrayList<SQLiteDebug.DbStats> paramArrayList)
  {
    AppMethodBeat.i(12374);
    synchronized (this.mLock)
    {
      if (this.mAvailablePrimaryConnection != null)
        this.mAvailablePrimaryConnection.collectDbStats(paramArrayList);
      localIterator = this.mAvailableNonPrimaryConnections.iterator();
      if (localIterator.hasNext())
        ((SQLiteConnection)localIterator.next()).collectDbStats(paramArrayList);
    }
    Iterator localIterator = this.mAcquiredConnections.keySet().iterator();
    while (localIterator.hasNext())
      ((SQLiteConnection)localIterator.next()).collectDbStatsUnsafe(paramArrayList);
    AppMethodBeat.o(12374);
  }

  public final void dump(Printer paramPrinter, boolean paramBoolean)
  {
    AppMethodBeat.i(12401);
    Printer localPrinter = PrefixPrinter.create(paramPrinter, "    ");
    Object localObject2;
    int j;
    synchronized (this.mLock)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Connection pool for ");
      paramPrinter.println(this.mConfiguration.path + ":");
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("  Open: ");
      paramPrinter.println(this.mIsOpen);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("  Max connections: ");
      paramPrinter.println(this.mMaxConnectionPoolSize);
      paramPrinter.println("  Available primary connection:");
      if (this.mAvailablePrimaryConnection != null)
      {
        this.mAvailablePrimaryConnection.dump(localPrinter, paramBoolean);
        paramPrinter.println("  Available non-primary connections:");
        if (!this.mAvailableNonPrimaryConnections.isEmpty())
        {
          int i = this.mAvailableNonPrimaryConnections.size();
          for (j = 0; j < i; j++)
            ((SQLiteConnection)this.mAvailableNonPrimaryConnections.get(j)).dump(localPrinter, paramBoolean);
        }
      }
      else
      {
        localPrinter.println("<none>");
      }
    }
    localPrinter.println("<none>");
    paramPrinter.println("  Acquired connections:");
    if (!this.mAcquiredConnections.isEmpty())
    {
      Iterator localIterator = this.mAcquiredConnections.entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (Map.Entry)localIterator.next();
        ((SQLiteConnection)((Map.Entry)localObject2).getKey()).dumpUnsafe(localPrinter, paramBoolean);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("  Status: ");
        localPrinter.println(((Map.Entry)localObject2).getValue());
      }
    }
    localPrinter.println("<none>");
    paramPrinter.println("  Connection waiters:");
    if (this.mConnectionWaiterQueue != null)
    {
      long l = SystemClock.uptimeMillis();
      paramPrinter = this.mConnectionWaiterQueue;
      for (j = 0; paramPrinter != null; j++)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localPrinter.println(j + ": waited for " + (l - paramPrinter.mStartTime) + " ms - thread=" + paramPrinter.mThread + ", priority=" + paramPrinter.mPriority + ", sql='" + paramPrinter.mSql + "'");
        paramPrinter = paramPrinter.mNext;
      }
    }
    localPrinter.println("<none>");
    AppMethodBeat.o(12401);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(12363);
    try
    {
      dispose(true);
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(12363);
    }
  }

  final SQLiteChangeListener getChangeListener()
  {
    return this.mChangeListener;
  }

  final SQLiteCheckpointListener getCheckpointListener()
  {
    return this.mCheckpointListener;
  }

  final SQLiteTrace getTraceCallback()
  {
    return this.mTraceCallback;
  }

  final void notifyChanges(String paramString1, String paramString2, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    AppMethodBeat.i(12397);
    SQLiteDatabase localSQLiteDatabase = (SQLiteDatabase)this.mDB.get();
    SQLiteChangeListener localSQLiteChangeListener = this.mChangeListener;
    if ((localSQLiteChangeListener == null) || (localSQLiteDatabase == null))
      AppMethodBeat.o(12397);
    while (true)
    {
      return;
      localSQLiteChangeListener.onChange(localSQLiteDatabase, paramString1, paramString2, paramArrayOfLong1, paramArrayOfLong2, paramArrayOfLong3);
      AppMethodBeat.o(12397);
    }
  }

  final void notifyCheckpoint(String paramString, int paramInt)
  {
    AppMethodBeat.i(12400);
    SQLiteDatabase localSQLiteDatabase = (SQLiteDatabase)this.mDB.get();
    SQLiteCheckpointListener localSQLiteCheckpointListener = this.mCheckpointListener;
    if ((localSQLiteCheckpointListener == null) || (localSQLiteDatabase == null))
      AppMethodBeat.o(12400);
    while (true)
    {
      return;
      localSQLiteCheckpointListener.onWALCommit(localSQLiteDatabase, paramString, paramInt);
      AppMethodBeat.o(12400);
    }
  }

  final void onConnectionLeaked()
  {
    AppMethodBeat.i(12376);
    Log.w("WCDB.SQLiteConnectionPool", "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
    this.mConnectionLeaked.set(true);
    AppMethodBeat.o(12376);
  }

  public final void reconfigure(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    int i = 1;
    AppMethodBeat.i(12369);
    if (paramSQLiteDatabaseConfiguration == null)
    {
      paramSQLiteDatabaseConfiguration = new IllegalArgumentException("configuration must not be null.");
      AppMethodBeat.o(12369);
      throw paramSQLiteDatabaseConfiguration;
    }
    int j;
    while (true)
    {
      synchronized (this.mLock)
      {
        throwIfClosedLocked();
        if (((paramSQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 0x20000000) != 0)
        {
          j = 1;
          if (j == 0)
            break label119;
          if (this.mAcquiredConnections.isEmpty())
            break;
          paramSQLiteDatabaseConfiguration = new java/lang/IllegalStateException;
          paramSQLiteDatabaseConfiguration.<init>("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
          AppMethodBeat.o(12369);
          throw paramSQLiteDatabaseConfiguration;
        }
      }
      j = 0;
    }
    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
    label119: if (paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled);
    while ((i != 0) && (!this.mAcquiredConnections.isEmpty()))
    {
      paramSQLiteDatabaseConfiguration = new java/lang/IllegalStateException;
      paramSQLiteDatabaseConfiguration.<init>("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
      AppMethodBeat.o(12369);
      throw paramSQLiteDatabaseConfiguration;
      i = 0;
    }
    if ((((this.mConfiguration.openFlags ^ paramSQLiteDatabaseConfiguration.openFlags) & 0x10000011) != 0) || (!DatabaseUtils.objectEquals(this.mConfiguration.vfsName, paramSQLiteDatabaseConfiguration.vfsName)) || (!paramSQLiteDatabaseConfiguration.extensions.containsAll(this.mConfiguration.extensions)))
    {
      if (j != 0)
        closeAvailableConnectionsAndLogExceptionsLocked();
      SQLiteConnection localSQLiteConnection = openConnectionLocked(paramSQLiteDatabaseConfiguration, true);
      closeAvailableConnectionsAndLogExceptionsLocked();
      discardAcquiredConnectionsLocked();
      this.mAvailablePrimaryConnection = localSQLiteConnection;
      this.mConfiguration.updateParametersFrom(paramSQLiteDatabaseConfiguration);
      setMaxConnectionPoolSizeLocked(0);
    }
    while (true)
    {
      wakeConnectionWaitersLocked();
      AppMethodBeat.o(12369);
      return;
      this.mConfiguration.updateParametersFrom(paramSQLiteDatabaseConfiguration);
      setMaxConnectionPoolSizeLocked(0);
      closeExcessConnectionsAndLogExceptionsLocked();
      reconfigureAllConnectionsLocked();
    }
  }

  public final void releaseConnection(SQLiteConnection paramSQLiteConnection)
  {
    AppMethodBeat.i(12371);
    AcquiredConnectionStatus localAcquiredConnectionStatus;
    synchronized (this.mLock)
    {
      localAcquiredConnectionStatus = (AcquiredConnectionStatus)this.mAcquiredConnections.remove(paramSQLiteConnection);
      if (localAcquiredConnectionStatus == null)
      {
        paramSQLiteConnection = new java/lang/IllegalStateException;
        paramSQLiteConnection.<init>("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
        AppMethodBeat.o(12371);
        throw paramSQLiteConnection;
      }
    }
    if (!this.mIsOpen)
      closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
    while (true)
    {
      AppMethodBeat.o(12371);
      return;
      if (paramSQLiteConnection.isPrimaryConnection())
      {
        if (recycleConnectionLocked(paramSQLiteConnection, localAcquiredConnectionStatus))
        {
          if ((!$assertionsDisabled) && (this.mAvailablePrimaryConnection != null))
          {
            paramSQLiteConnection = new java/lang/AssertionError;
            paramSQLiteConnection.<init>();
            AppMethodBeat.o(12371);
            throw paramSQLiteConnection;
          }
          this.mAvailablePrimaryConnection = paramSQLiteConnection;
        }
        wakeConnectionWaitersLocked();
      }
      else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1)
      {
        closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
      }
      else
      {
        if (recycleConnectionLocked(paramSQLiteConnection, localAcquiredConnectionStatus))
          this.mAvailableNonPrimaryConnections.add(paramSQLiteConnection);
        wakeConnectionWaitersLocked();
      }
    }
  }

  final void setChangeListener(SQLiteChangeListener paramSQLiteChangeListener, boolean paramBoolean)
  {
    AppMethodBeat.i(12396);
    boolean bool;
    if (paramSQLiteChangeListener != null)
      bool = true;
    while (true)
    {
      if (!bool)
        paramBoolean = false;
      synchronized (this.mLock)
      {
        if ((this.mConfiguration.updateNotificationEnabled != bool) || (this.mConfiguration.updateNotificationRowID != paramBoolean))
        {
          this.mConfiguration.updateNotificationEnabled = bool;
          this.mConfiguration.updateNotificationRowID = paramBoolean;
          closeExcessConnectionsAndLogExceptionsLocked();
          reconfigureAllConnectionsLocked();
        }
        this.mChangeListener = paramSQLiteChangeListener;
        AppMethodBeat.o(12396);
        return;
        bool = false;
      }
    }
  }

  final void setCheckpointListener(SQLiteCheckpointListener paramSQLiteCheckpointListener)
  {
    AppMethodBeat.i(12399);
    SQLiteDatabase localSQLiteDatabase = (SQLiteDatabase)this.mDB.get();
    if (this.mCheckpointListener != null)
      this.mCheckpointListener.onDetach(localSQLiteDatabase);
    this.mCheckpointListener = paramSQLiteCheckpointListener;
    if (this.mCheckpointListener != null)
      this.mCheckpointListener.onAttach(localSQLiteDatabase);
    AppMethodBeat.o(12399);
  }

  final void setTraceCallback(SQLiteTrace paramSQLiteTrace)
  {
    this.mTraceCallback = paramSQLiteTrace;
  }

  public final boolean shouldYieldConnection(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    AppMethodBeat.i(12373);
    synchronized (this.mLock)
    {
      if (!this.mAcquiredConnections.containsKey(paramSQLiteConnection))
      {
        paramSQLiteConnection = new java/lang/IllegalStateException;
        paramSQLiteConnection.<init>("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
        AppMethodBeat.o(12373);
        throw paramSQLiteConnection;
      }
    }
    boolean bool;
    if (!this.mIsOpen)
    {
      bool = false;
      AppMethodBeat.o(12373);
    }
    while (true)
    {
      return bool;
      bool = isSessionBlockingImportantConnectionWaitersLocked(paramSQLiteConnection.isPrimaryConnection(), paramInt);
      AppMethodBeat.o(12373);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(12402);
    String str = "SQLiteConnectionPool: " + this.mConfiguration.path;
    AppMethodBeat.o(12402);
    return str;
  }

  final void traceExecute(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(12398);
    SQLiteDatabase localSQLiteDatabase = (SQLiteDatabase)this.mDB.get();
    SQLiteTrace localSQLiteTrace = this.mTraceCallback;
    if ((localSQLiteTrace == null) || (localSQLiteDatabase == null))
      AppMethodBeat.o(12398);
    while (true)
    {
      return;
      localSQLiteTrace.onSQLExecuted(localSQLiteDatabase, paramString, paramInt, paramLong);
      AppMethodBeat.o(12398);
    }
  }

  static enum AcquiredConnectionStatus
  {
    static
    {
      AppMethodBeat.i(12360);
      NORMAL = new AcquiredConnectionStatus("NORMAL", 0);
      RECONFIGURE = new AcquiredConnectionStatus("RECONFIGURE", 1);
      DISCARD = new AcquiredConnectionStatus("DISCARD", 2);
      $VALUES = new AcquiredConnectionStatus[] { NORMAL, RECONFIGURE, DISCARD };
      AppMethodBeat.o(12360);
    }
  }

  static class ConnectionPoolBusyInfo
  {
    int activeConnections;
    ArrayList<String> activeOperationDescriptions;
    ArrayList<SQLiteTrace.TraceInfo<String>> activeSql;
    ArrayList<SQLiteTrace.TraceInfo<StackTraceElement[]>> activeTransactions;
    int availableConnections;
    int idleConnections;
    String label;

    private ConnectionPoolBusyInfo()
    {
      AppMethodBeat.i(12361);
      this.activeOperationDescriptions = new ArrayList();
      this.activeSql = new ArrayList();
      this.activeTransactions = new ArrayList();
      AppMethodBeat.o(12361);
    }
  }

  static final class ConnectionWaiter
  {
    public SQLiteConnection mAssignedConnection;
    public int mConnectionFlags;
    public RuntimeException mException;
    public ConnectionWaiter mNext;
    public int mNonce;
    public int mPriority;
    public String mSql;
    public long mStartTime;
    public Thread mThread;
    public boolean mWantPrimaryConnection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteConnectionPool
 * JD-Core Version:    0.6.2
 */