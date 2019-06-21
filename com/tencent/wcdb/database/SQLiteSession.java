package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteSession
{
  public static final int TRANSACTION_MODE_DEFERRED = 0;
  public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
  public static final int TRANSACTION_MODE_IMMEDIATE = 1;
  private SQLiteConnection mConnection;
  private int mConnectionFlags;
  private final SQLiteConnectionPool mConnectionPool;
  private int mConnectionUseCount;
  private Transaction mTransactionPool;
  private Transaction mTransactionStack;

  static
  {
    AppMethodBeat.i(12628);
    if (!SQLiteSession.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(12628);
      return;
    }
  }

  public SQLiteSession(SQLiteConnectionPool paramSQLiteConnectionPool)
  {
    AppMethodBeat.i(12601);
    if (paramSQLiteConnectionPool == null)
    {
      paramSQLiteConnectionPool = new IllegalArgumentException("connectionPool must not be null");
      AppMethodBeat.o(12601);
      throw paramSQLiteConnectionPool;
    }
    this.mConnectionPool = paramSQLiteConnectionPool;
    AppMethodBeat.o(12601);
  }

  private void acquireConnection(String paramString, int paramInt, boolean paramBoolean, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12618);
    if (this.mConnection == null)
    {
      this.mConnection = this.mConnectionPool.acquireConnection(paramString, paramInt, paramCancellationSignal);
      this.mConnectionFlags = paramInt;
      this.mConnection.setAcquisitionState(true, paramBoolean);
    }
    this.mConnectionUseCount += 1;
    AppMethodBeat.o(12618);
  }

  // ERROR //
  private void beginTransactionUnchecked(int paramInt1, SQLiteTransactionListener paramSQLiteTransactionListener, int paramInt2, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: sipush 12603
    //   3: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload 4
    //   8: ifnull +8 -> 16
    //   11: aload 4
    //   13: invokevirtual 88	com/tencent/wcdb/support/CancellationSignal:throwIfCanceled	()V
    //   16: aload_0
    //   17: getfield 90	com/tencent/wcdb/database/SQLiteSession:mTransactionStack	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   20: ifnonnull +12 -> 32
    //   23: aload_0
    //   24: aconst_null
    //   25: iload_3
    //   26: iconst_1
    //   27: aload 4
    //   29: invokespecial 92	com/tencent/wcdb/database/SQLiteSession:acquireConnection	(Ljava/lang/String;IZLcom/tencent/wcdb/support/CancellationSignal;)V
    //   32: aload_0
    //   33: getfield 90	com/tencent/wcdb/database/SQLiteSession:mTransactionStack	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   36: ifnonnull +40 -> 76
    //   39: iload_1
    //   40: tableswitch	default:+24 -> 64, 1:+84->124, 2:+119->159
    //   65: getfield 64	com/tencent/wcdb/database/SQLiteSession:mConnection	Lcom/tencent/wcdb/database/SQLiteConnection;
    //   68: ldc 94
    //   70: aconst_null
    //   71: aload 4
    //   73: invokevirtual 98	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   76: aload_2
    //   77: ifnull +9 -> 86
    //   80: aload_2
    //   81: invokeinterface 103 1 0
    //   86: aload_0
    //   87: iload_1
    //   88: aload_2
    //   89: invokespecial 107	com/tencent/wcdb/database/SQLiteSession:obtainTransaction	(ILandroid/database/sqlite/SQLiteTransactionListener;)Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   92: astore_2
    //   93: aload_2
    //   94: aload_0
    //   95: getfield 90	com/tencent/wcdb/database/SQLiteSession:mTransactionStack	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   98: putfield 110	com/tencent/wcdb/database/SQLiteSession$Transaction:mParent	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   101: aload_0
    //   102: aload_2
    //   103: putfield 90	com/tencent/wcdb/database/SQLiteSession:mTransactionStack	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   106: aload_0
    //   107: getfield 90	com/tencent/wcdb/database/SQLiteSession:mTransactionStack	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   110: ifnonnull +92 -> 202
    //   113: aload_0
    //   114: invokespecial 113	com/tencent/wcdb/database/SQLiteSession:releaseConnection	()V
    //   117: sipush 12603
    //   120: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: return
    //   124: aload_0
    //   125: getfield 64	com/tencent/wcdb/database/SQLiteSession:mConnection	Lcom/tencent/wcdb/database/SQLiteConnection;
    //   128: ldc 115
    //   130: aconst_null
    //   131: aload 4
    //   133: invokevirtual 98	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   136: goto -60 -> 76
    //   139: astore_2
    //   140: aload_0
    //   141: getfield 90	com/tencent/wcdb/database/SQLiteSession:mTransactionStack	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   144: ifnonnull +7 -> 151
    //   147: aload_0
    //   148: invokespecial 113	com/tencent/wcdb/database/SQLiteSession:releaseConnection	()V
    //   151: sipush 12603
    //   154: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: aload_2
    //   158: athrow
    //   159: aload_0
    //   160: getfield 64	com/tencent/wcdb/database/SQLiteSession:mConnection	Lcom/tencent/wcdb/database/SQLiteConnection;
    //   163: ldc 117
    //   165: aconst_null
    //   166: aload 4
    //   168: invokevirtual 98	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   171: goto -95 -> 76
    //   174: astore_2
    //   175: aload_0
    //   176: getfield 90	com/tencent/wcdb/database/SQLiteSession:mTransactionStack	Lcom/tencent/wcdb/database/SQLiteSession$Transaction;
    //   179: ifnonnull +15 -> 194
    //   182: aload_0
    //   183: getfield 64	com/tencent/wcdb/database/SQLiteSession:mConnection	Lcom/tencent/wcdb/database/SQLiteConnection;
    //   186: ldc 119
    //   188: aconst_null
    //   189: aload 4
    //   191: invokevirtual 98	com/tencent/wcdb/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/support/CancellationSignal;)V
    //   194: sipush 12603
    //   197: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aload_2
    //   201: athrow
    //   202: sipush 12603
    //   205: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: goto -85 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   32	39	139	finally
    //   64	76	139	finally
    //   80	86	139	finally
    //   86	106	139	finally
    //   124	136	139	finally
    //   159	171	139	finally
    //   175	194	139	finally
    //   194	202	139	finally
    //   80	86	174	java/lang/RuntimeException
  }

  private void endTransactionUnchecked(CancellationSignal paramCancellationSignal, boolean paramBoolean)
  {
    int i = 0;
    Object localObject = null;
    AppMethodBeat.i(12606);
    if (paramCancellationSignal != null)
      paramCancellationSignal.throwIfCanceled();
    Transaction localTransaction = this.mTransactionStack;
    int j;
    SQLiteTransactionListener localSQLiteTransactionListener;
    if (((localTransaction.mMarkedSuccessful) || (paramBoolean)) && (!localTransaction.mChildFailed))
    {
      j = 1;
      localSQLiteTransactionListener = localTransaction.mListener;
      if (localSQLiteTransactionListener == null)
        break label202;
      if (j == 0)
        break label127;
    }
    label202: 
    while (true)
      try
      {
        localSQLiteTransactionListener.onCommit();
        this.mTransactionStack = localTransaction.mParent;
        recycleTransaction(localTransaction);
        if (this.mTransactionStack != null)
        {
          if (j == 0)
            this.mTransactionStack.mChildFailed = true;
          if (localObject == null)
            continue;
          AppMethodBeat.o(12606);
          throw localObject;
          j = 0;
          break;
          label127: localSQLiteTransactionListener.onRollback();
          continue;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        j = i;
        continue;
        if (j != 0);
        try
        {
          this.mConnection.execute("COMMIT;", null, paramCancellationSignal);
          releaseConnection();
          continue;
          this.mConnection.execute("ROLLBACK;", null, paramCancellationSignal);
          continue;
        }
        finally
        {
          releaseConnection();
          AppMethodBeat.o(12606);
        }
        AppMethodBeat.o(12606);
        return;
      }
  }

  private boolean executeSpecial(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    boolean bool = true;
    AppMethodBeat.i(12617);
    if (paramCancellationSignal != null)
      paramCancellationSignal.throwIfCanceled();
    switch (DatabaseUtils.getSqlStatementType(paramString))
    {
    default:
      bool = false;
      AppMethodBeat.o(12617);
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return bool;
      beginTransaction(2, null, paramInt, paramCancellationSignal);
      AppMethodBeat.o(12617);
      continue;
      setTransactionSuccessful();
      endTransaction(paramCancellationSignal);
      AppMethodBeat.o(12617);
      continue;
      endTransaction(paramCancellationSignal);
      AppMethodBeat.o(12617);
    }
  }

  private Transaction obtainTransaction(int paramInt, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    AppMethodBeat.i(12627);
    Transaction localTransaction = this.mTransactionPool;
    if (localTransaction != null)
    {
      this.mTransactionPool = localTransaction.mParent;
      localTransaction.mParent = null;
      localTransaction.mMarkedSuccessful = false;
      localTransaction.mChildFailed = false;
    }
    while (true)
    {
      localTransaction.mMode = paramInt;
      localTransaction.mListener = paramSQLiteTransactionListener;
      AppMethodBeat.o(12627);
      return localTransaction;
      localTransaction = new Transaction(null);
    }
  }

  private void recycleTransaction(Transaction paramTransaction)
  {
    paramTransaction.mParent = this.mTransactionPool;
    paramTransaction.mListener = null;
    this.mTransactionPool = paramTransaction;
  }

  private void releaseConnection()
  {
    AppMethodBeat.i(12619);
    int i = this.mConnectionUseCount - 1;
    this.mConnectionUseCount = i;
    if (i == 0);
    while (true)
    {
      try
      {
        this.mConnection.setAcquisitionState(false, false);
        this.mConnectionPool.releaseConnection(this.mConnection);
        return;
      }
      finally
      {
        this.mConnection = null;
        AppMethodBeat.o(12619);
      }
      AppMethodBeat.o(12619);
    }
  }

  private void throwIfNestedTransaction()
  {
    AppMethodBeat.i(12626);
    if (hasNestedTransaction())
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
      AppMethodBeat.o(12626);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(12626);
  }

  private void throwIfNoTransaction()
  {
    AppMethodBeat.i(12624);
    if (this.mTransactionStack == null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Cannot perform this operation because there is no current transaction.");
      AppMethodBeat.o(12624);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(12624);
  }

  private void throwIfTransactionMarkedSuccessful()
  {
    AppMethodBeat.i(12625);
    if ((this.mTransactionStack != null) && (this.mTransactionStack.mMarkedSuccessful))
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
      AppMethodBeat.o(12625);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(12625);
  }

  private boolean yieldTransactionUnchecked(long paramLong, CancellationSignal paramCancellationSignal)
  {
    boolean bool = true;
    AppMethodBeat.i(12608);
    if (paramCancellationSignal != null)
      paramCancellationSignal.throwIfCanceled();
    if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags))
    {
      bool = false;
      AppMethodBeat.o(12608);
    }
    while (true)
    {
      return bool;
      int i = this.mTransactionStack.mMode;
      SQLiteTransactionListener localSQLiteTransactionListener = this.mTransactionStack.mListener;
      int j = this.mConnectionFlags;
      endTransactionUnchecked(paramCancellationSignal, true);
      if (paramLong > 0L);
      try
      {
        Thread.sleep(paramLong);
        label87: beginTransactionUnchecked(i, localSQLiteTransactionListener, j, paramCancellationSignal);
        AppMethodBeat.o(12608);
      }
      catch (InterruptedException localInterruptedException)
      {
        break label87;
      }
    }
  }

  final SQLiteConnection acquireConnectionForNativeHandle(int paramInt)
  {
    AppMethodBeat.i(12620);
    acquireConnection(null, paramInt, true, null);
    SQLiteConnection localSQLiteConnection = this.mConnection;
    AppMethodBeat.o(12620);
    return localSQLiteConnection;
  }

  final SQLiteConnection.PreparedStatement acquirePreparedStatement(String paramString, int paramInt)
  {
    AppMethodBeat.i(12622);
    acquireConnection(paramString, paramInt, true, null);
    paramString = this.mConnection.acquirePreparedStatement(paramString);
    AppMethodBeat.o(12622);
    return paramString;
  }

  public final void beginTransaction(int paramInt1, SQLiteTransactionListener paramSQLiteTransactionListener, int paramInt2, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12602);
    throwIfTransactionMarkedSuccessful();
    beginTransactionUnchecked(paramInt1, paramSQLiteTransactionListener, paramInt2, paramCancellationSignal);
    AppMethodBeat.o(12602);
  }

  public final void endTransaction(CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12605);
    throwIfNoTransaction();
    if ((!$assertionsDisabled) && (this.mConnection == null))
    {
      paramCancellationSignal = new AssertionError();
      AppMethodBeat.o(12605);
      throw paramCancellationSignal;
    }
    endTransactionUnchecked(paramCancellationSignal, false);
    AppMethodBeat.o(12605);
  }

  public final void execute(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12610);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12610);
      throw paramString;
    }
    if (executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal))
      AppMethodBeat.o(12610);
    while (true)
    {
      return;
      acquireConnection(paramString, paramInt, false, paramCancellationSignal);
      try
      {
        this.mConnection.execute(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
        AppMethodBeat.o(12610);
      }
      finally
      {
        releaseConnection();
        AppMethodBeat.o(12610);
      }
    }
  }

  public final int executeForChangedRowCount(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    int i = 0;
    AppMethodBeat.i(12613);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12613);
      throw paramString;
    }
    if (executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal))
    {
      AppMethodBeat.o(12613);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      acquireConnection(paramString, paramInt, false, paramCancellationSignal);
      try
      {
        paramInt = this.mConnection.executeForChangedRowCount(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
        AppMethodBeat.o(12613);
      }
      finally
      {
        releaseConnection();
        AppMethodBeat.o(12613);
      }
    }
  }

  public final int executeForCursorWindow(String paramString, Object[] paramArrayOfObject, CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12615);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12615);
      throw paramString;
    }
    if (paramCursorWindow == null)
    {
      paramString = new IllegalArgumentException("window must not be null.");
      AppMethodBeat.o(12615);
      throw paramString;
    }
    if (executeSpecial(paramString, paramArrayOfObject, paramInt3, paramCancellationSignal))
    {
      paramCursorWindow.clear();
      paramInt1 = 0;
      AppMethodBeat.o(12615);
    }
    while (true)
    {
      return paramInt1;
      acquireConnection(paramString, paramInt3, false, paramCancellationSignal);
      try
      {
        paramInt1 = this.mConnection.executeForCursorWindow(paramString, paramArrayOfObject, paramCursorWindow, paramInt1, paramInt2, paramBoolean, paramCancellationSignal);
        releaseConnection();
        AppMethodBeat.o(12615);
      }
      finally
      {
        releaseConnection();
        AppMethodBeat.o(12615);
      }
    }
  }

  public final long executeForLastInsertedRowId(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12614);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12614);
      throw paramString;
    }
    long l;
    if (executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal))
    {
      l = 0L;
      AppMethodBeat.o(12614);
    }
    while (true)
    {
      return l;
      acquireConnection(paramString, paramInt, false, paramCancellationSignal);
      try
      {
        l = this.mConnection.executeForLastInsertedRowId(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
        AppMethodBeat.o(12614);
      }
      finally
      {
        releaseConnection();
        AppMethodBeat.o(12614);
      }
    }
  }

  public final long executeForLong(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12611);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12611);
      throw paramString;
    }
    long l;
    if (executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal))
    {
      l = 0L;
      AppMethodBeat.o(12611);
    }
    while (true)
    {
      return l;
      acquireConnection(paramString, paramInt, false, paramCancellationSignal);
      try
      {
        l = this.mConnection.executeForLong(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
        AppMethodBeat.o(12611);
      }
      finally
      {
        releaseConnection();
        AppMethodBeat.o(12611);
      }
    }
  }

  public final String executeForString(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12612);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12612);
      throw paramString;
    }
    if (executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal))
    {
      paramString = null;
      AppMethodBeat.o(12612);
    }
    while (true)
    {
      return paramString;
      acquireConnection(paramString, paramInt, false, paramCancellationSignal);
      try
      {
        paramString = this.mConnection.executeForString(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
        AppMethodBeat.o(12612);
      }
      finally
      {
        releaseConnection();
        AppMethodBeat.o(12612);
      }
    }
  }

  public final boolean hasConnection()
  {
    if (this.mConnection != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean hasNestedTransaction()
  {
    if ((this.mTransactionStack != null) && (this.mTransactionStack.mParent != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean hasTransaction()
  {
    if (this.mTransactionStack != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void prepare(String paramString, int paramInt, CancellationSignal paramCancellationSignal, SQLiteStatementInfo paramSQLiteStatementInfo)
  {
    AppMethodBeat.i(12609);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("sql must not be null.");
      AppMethodBeat.o(12609);
      throw paramString;
    }
    if (paramCancellationSignal != null)
      paramCancellationSignal.throwIfCanceled();
    acquireConnection(paramString, paramInt, false, paramCancellationSignal);
    try
    {
      this.mConnection.prepare(paramString, paramSQLiteStatementInfo);
      return;
    }
    finally
    {
      releaseConnection();
      AppMethodBeat.o(12609);
    }
    throw paramString;
  }

  final void releaseConnectionForNativeHandle(Exception paramException)
  {
    AppMethodBeat.i(12621);
    if (this.mConnection != null)
      this.mConnection.endNativeHandle(paramException);
    releaseConnection();
    AppMethodBeat.o(12621);
  }

  final void releasePreparedStatement(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    AppMethodBeat.i(12623);
    if (this.mConnection != null)
    {
      this.mConnection.releasePreparedStatement(paramPreparedStatement);
      releaseConnection();
    }
    AppMethodBeat.o(12623);
  }

  public final void setTransactionSuccessful()
  {
    AppMethodBeat.i(12604);
    throwIfNoTransaction();
    throwIfTransactionMarkedSuccessful();
    this.mTransactionStack.mMarkedSuccessful = true;
    AppMethodBeat.o(12604);
  }

  public final Pair<Integer, Integer> walCheckpoint(String paramString, int paramInt)
  {
    AppMethodBeat.i(12616);
    acquireConnection(null, paramInt, false, null);
    try
    {
      paramString = this.mConnection.walCheckpoint(paramString);
      return paramString;
    }
    finally
    {
      releaseConnection();
      AppMethodBeat.o(12616);
    }
    throw paramString;
  }

  public final boolean yieldTransaction(long paramLong, boolean paramBoolean, CancellationSignal paramCancellationSignal)
  {
    boolean bool = false;
    AppMethodBeat.i(12607);
    if (paramBoolean)
    {
      throwIfNoTransaction();
      throwIfTransactionMarkedSuccessful();
      throwIfNestedTransaction();
    }
    while ((!$assertionsDisabled) && (this.mConnection == null))
    {
      paramCancellationSignal = new AssertionError();
      AppMethodBeat.o(12607);
      throw paramCancellationSignal;
      if ((this.mTransactionStack == null) || (this.mTransactionStack.mMarkedSuccessful) || (this.mTransactionStack.mParent != null))
      {
        AppMethodBeat.o(12607);
        paramBoolean = bool;
      }
    }
    while (true)
    {
      return paramBoolean;
      if (this.mTransactionStack.mChildFailed)
      {
        AppMethodBeat.o(12607);
        paramBoolean = bool;
      }
      else
      {
        paramBoolean = yieldTransactionUnchecked(paramLong, paramCancellationSignal);
        AppMethodBeat.o(12607);
      }
    }
  }

  static final class Transaction
  {
    public boolean mChildFailed;
    public SQLiteTransactionListener mListener;
    public boolean mMarkedSuccessful;
    public int mMode;
    public Transaction mParent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteSession
 * JD-Core Version:    0.6.2
 */