package com.tencent.wcdb.database;

import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;

public abstract class SQLiteProgram extends SQLiteClosable
{
  private static final String[] EMPTY_STRING_ARRAY = new String[0];
  private static final String TAG = "WCDB.SQLiteProgram";
  private final Object[] mBindArgs;
  private SQLiteSession mBoundSession;
  private final String[] mColumnNames;
  private final SQLiteDatabase mDatabase;
  private final int mNumParameters;
  protected SQLiteConnection.PreparedStatement mPreparedStatement;
  private final boolean mReadOnly;
  private final String mSql;

  protected SQLiteProgram(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    this.mDatabase = paramSQLiteDatabase;
    this.mSql = paramString.trim();
    int i = DatabaseUtils.getSqlStatementType(this.mSql);
    switch (i)
    {
    default:
      if (i == 1)
      {
        bool2 = true;
        paramString = new SQLiteStatementInfo();
        paramSQLiteDatabase.getThreadSession().prepare(this.mSql, paramSQLiteDatabase.getThreadDefaultConnectionFlags(bool2), paramCancellationSignal, paramString);
        if ((i == 8) || (!paramString.readOnly))
          break label214;
      }
      break;
    case 4:
    case 5:
    case 6:
    }
    label214: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.mReadOnly = bool2;
      this.mColumnNames = paramString.columnNames;
      for (this.mNumParameters = paramString.numParameters; (paramArrayOfObject != null) && (paramArrayOfObject.length > this.mNumParameters); this.mNumParameters = 0)
      {
        throw new IllegalArgumentException("Too many bind arguments.  " + paramArrayOfObject.length + " arguments were provided but the statement needs " + this.mNumParameters + " arguments.");
        this.mReadOnly = false;
        this.mColumnNames = EMPTY_STRING_ARRAY;
      }
      bool2 = false;
      break;
    }
    if (this.mNumParameters != 0)
    {
      this.mBindArgs = new Object[this.mNumParameters];
      if (paramArrayOfObject != null)
        System.arraycopy(paramArrayOfObject, 0, this.mBindArgs, 0, paramArrayOfObject.length);
    }
    while (true)
    {
      this.mPreparedStatement = null;
      this.mBoundSession = null;
      return;
      this.mBindArgs = null;
    }
  }

  private void bind(int paramInt, Object paramObject)
  {
    if ((paramInt <= 0) || (paramInt > this.mNumParameters))
      throw new IllegalArgumentException("Cannot bind argument at index " + paramInt + " because the index is out of range.  The statement has " + this.mNumParameters + " parameters.");
    this.mBindArgs[(paramInt - 1)] = paramObject;
  }

  protected boolean acquirePreparedStatement()
  {
    while (true)
    {
      try
      {
        Object localObject1 = this.mDatabase.getThreadSession();
        SQLiteSession localSQLiteSession = this.mBoundSession;
        if (localObject1 == localSQLiteSession)
        {
          bool = false;
          return bool;
        }
        if (this.mBoundSession != null)
        {
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("SQLiteProgram has bound to another thread.");
          throw ((Throwable)localObject1);
        }
      }
      finally
      {
      }
      this.mPreparedStatement = localObject2.acquirePreparedStatement(this.mSql, this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly));
      this.mPreparedStatement.bindArguments(this.mBindArgs);
      this.mBoundSession = localObject2;
      boolean bool = true;
    }
  }

  public void bindAllArgsAsStrings(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
      for (int i = paramArrayOfString.length; i != 0; i--)
        bindString(i, paramArrayOfString[(i - 1)]);
  }

  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      throw new IllegalArgumentException("the bind value at index " + paramInt + " is null");
    bind(paramInt, paramArrayOfByte);
  }

  public void bindDouble(int paramInt, double paramDouble)
  {
    bind(paramInt, Double.valueOf(paramDouble));
  }

  public void bindLong(int paramInt, long paramLong)
  {
    bind(paramInt, Long.valueOf(paramLong));
  }

  public void bindNull(int paramInt)
  {
    bind(paramInt, null);
  }

  public void bindString(int paramInt, String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("the bind value at index " + paramInt + " is null");
    bind(paramInt, paramString);
  }

  protected final void checkCorruption(SQLiteException paramSQLiteException)
  {
    int i = 1;
    if ((paramSQLiteException instanceof SQLiteDatabaseCorruptException));
    while (true)
    {
      if (i != 0)
      {
        SQLiteDebug.collectLastIOTraceStats(this.mDatabase);
        this.mDatabase.onCorruption();
      }
      return;
      if ((!(paramSQLiteException instanceof SQLiteFullException)) || (!this.mReadOnly))
        i = 0;
    }
  }

  public void clearBindings()
  {
    if (this.mBindArgs != null)
      Arrays.fill(this.mBindArgs, null);
  }

  protected void finalize()
  {
    try
    {
      if ((this.mBoundSession != null) || (this.mPreparedStatement != null))
      {
        SQLiteMisuseException localSQLiteMisuseException = new com/tencent/wcdb/database/SQLiteMisuseException;
        localSQLiteMisuseException.<init>("Acquired prepared statement is not released.");
        throw localSQLiteMisuseException;
      }
    }
    finally
    {
    }
    super.finalize();
  }

  protected final Object[] getBindArgs()
  {
    return this.mBindArgs;
  }

  public final String[] getColumnNames()
  {
    return this.mColumnNames;
  }

  protected final int getConnectionFlags()
  {
    return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
  }

  public final SQLiteDatabase getDatabase()
  {
    return this.mDatabase;
  }

  protected final SQLiteSession getSession()
  {
    return this.mDatabase.getThreadSession();
  }

  protected final String getSql()
  {
    return this.mSql;
  }

  @Deprecated
  public final int getUniqueId()
  {
    return -1;
  }

  protected void onAllReferencesReleased()
  {
    releasePreparedStatement();
    clearBindings();
  }

  protected void releasePreparedStatement()
  {
    while (true)
    {
      try
      {
        Object localObject1;
        if (this.mBoundSession == null)
        {
          localObject1 = this.mPreparedStatement;
          if (localObject1 == null)
            return;
        }
        if ((this.mBoundSession == null) || (this.mPreparedStatement == null))
        {
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("Internal state error.");
          throw ((Throwable)localObject1);
        }
      }
      finally
      {
      }
      if (this.mBoundSession != this.mDatabase.getThreadSession())
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("SQLiteProgram has bound to another thread.");
        throw localIllegalStateException;
      }
      this.mBoundSession.releasePreparedStatement(this.mPreparedStatement);
      this.mPreparedStatement = null;
      this.mBoundSession = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteProgram
 * JD-Core Version:    0.6.2
 */