package com.tencent.wcdb.database;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public class SQLiteDirectCursor extends AbstractCursor
{
  public static final SQLiteDatabase.CursorFactory FACTORY;
  private static final String TAG = "WCDB.SQLiteDirectCursor";
  private final String[] mColumns;
  private int mCount;
  private boolean mCountFinished;
  private final SQLiteCursorDriver mDriver;
  private final SQLiteDirectQuery mQuery;

  static
  {
    AppMethodBeat.i(12569);
    FACTORY = new SQLiteDatabase.CursorFactory()
    {
      public final Cursor newCursor(SQLiteDatabase paramAnonymousSQLiteDatabase, SQLiteCursorDriver paramAnonymousSQLiteCursorDriver, String paramAnonymousString, SQLiteProgram paramAnonymousSQLiteProgram)
      {
        AppMethodBeat.i(12552);
        paramAnonymousSQLiteDatabase = new SQLiteDirectCursor(paramAnonymousSQLiteCursorDriver, paramAnonymousString, (SQLiteDirectQuery)paramAnonymousSQLiteProgram);
        AppMethodBeat.o(12552);
        return paramAnonymousSQLiteDatabase;
      }

      public final SQLiteProgram newQuery(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString, Object[] paramAnonymousArrayOfObject, CancellationSignal paramAnonymousCancellationSignal)
      {
        AppMethodBeat.i(12553);
        paramAnonymousSQLiteDatabase = new SQLiteDirectQuery(paramAnonymousSQLiteDatabase, paramAnonymousString, paramAnonymousArrayOfObject, paramAnonymousCancellationSignal);
        AppMethodBeat.o(12553);
        return paramAnonymousSQLiteDatabase;
      }
    };
    AppMethodBeat.o(12569);
  }

  public SQLiteDirectCursor(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteDirectQuery paramSQLiteDirectQuery)
  {
    AppMethodBeat.i(12554);
    if (paramSQLiteDirectQuery == null)
    {
      paramSQLiteCursorDriver = new IllegalArgumentException("query object cannot be null");
      AppMethodBeat.o(12554);
      throw paramSQLiteCursorDriver;
    }
    this.mQuery = paramSQLiteDirectQuery;
    this.mDriver = paramSQLiteCursorDriver;
    this.mColumns = paramSQLiteDirectQuery.getColumnNames();
    this.mCount = -1;
    this.mCountFinished = false;
    AppMethodBeat.o(12554);
  }

  public void close()
  {
    AppMethodBeat.i(12555);
    super.close();
    this.mQuery.close();
    this.mDriver.cursorClosed();
    AppMethodBeat.o(12555);
  }

  public void deactivate()
  {
    AppMethodBeat.i(12556);
    super.deactivate();
    this.mDriver.cursorDeactivated();
    AppMethodBeat.o(12556);
  }

  public byte[] getBlob(int paramInt)
  {
    AppMethodBeat.i(12558);
    byte[] arrayOfByte = this.mQuery.getBlob(paramInt);
    AppMethodBeat.o(12558);
    return arrayOfByte;
  }

  public String[] getColumnNames()
  {
    return this.mColumns;
  }

  public int getCount()
  {
    AppMethodBeat.i(12567);
    if (!this.mCountFinished)
    {
      Log.w("WCDB.SQLiteDirectCursor", "Count query on SQLiteDirectCursor is slow. Iterate through the end to get count or use other implementations.");
      this.mCount = (this.mPos + this.mQuery.step(2147483647) + 1);
      this.mCountFinished = true;
      this.mQuery.reset(false);
      this.mPos = (this.mQuery.step(this.mPos + 1) - 1);
    }
    int i = this.mCount;
    AppMethodBeat.o(12567);
    return i;
  }

  public double getDouble(int paramInt)
  {
    AppMethodBeat.i(12563);
    double d = this.mQuery.getDouble(paramInt);
    AppMethodBeat.o(12563);
    return d;
  }

  public float getFloat(int paramInt)
  {
    AppMethodBeat.i(12562);
    float f = (float)this.mQuery.getDouble(paramInt);
    AppMethodBeat.o(12562);
    return f;
  }

  public int getInt(int paramInt)
  {
    AppMethodBeat.i(12560);
    paramInt = (int)this.mQuery.getLong(paramInt);
    AppMethodBeat.o(12560);
    return paramInt;
  }

  public long getLong(int paramInt)
  {
    AppMethodBeat.i(12561);
    long l = this.mQuery.getLong(paramInt);
    AppMethodBeat.o(12561);
    return l;
  }

  public short getShort(int paramInt)
  {
    AppMethodBeat.i(12559);
    short s = (short)(int)this.mQuery.getLong(paramInt);
    AppMethodBeat.o(12559);
    return s;
  }

  public String getString(int paramInt)
  {
    AppMethodBeat.i(12557);
    String str = this.mQuery.getString(paramInt);
    AppMethodBeat.o(12557);
    return str;
  }

  public int getType(int paramInt)
  {
    AppMethodBeat.i(12564);
    paramInt = this.mQuery.getType(paramInt);
    AppMethodBeat.o(12564);
    return paramInt;
  }

  public boolean isNull(int paramInt)
  {
    AppMethodBeat.i(12565);
    boolean bool;
    if (getType(paramInt) == 0)
    {
      bool = true;
      AppMethodBeat.o(12565);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12565);
    }
  }

  public boolean moveToPosition(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(12566);
    if (paramInt < 0)
    {
      this.mQuery.reset(false);
      this.mPos = -1;
      AppMethodBeat.o(12566);
    }
    while (true)
    {
      return bool;
      if ((this.mCountFinished) && (paramInt >= this.mCount))
      {
        this.mPos = this.mCount;
        AppMethodBeat.o(12566);
      }
      else
      {
        int i;
        if (paramInt < this.mPos)
        {
          Log.w("WCDB.SQLiteDirectCursor", "Moving backward on SQLiteDirectCursor is slow. Get rid of backward movement or use other implementations.");
          this.mQuery.reset(false);
          i = this.mQuery.step(paramInt + 1) - 1;
          label101: if (i >= paramInt)
            break label189;
          this.mCount = (i + 1);
          this.mCountFinished = true;
          this.mPos = this.mCount;
        }
        while (true)
        {
          if (this.mPos >= this.mCount)
            break label217;
          AppMethodBeat.o(12566);
          bool = true;
          break;
          if (paramInt == this.mPos)
          {
            AppMethodBeat.o(12566);
            bool = true;
            break;
          }
          i = this.mPos + this.mQuery.step(paramInt - this.mPos);
          break label101;
          label189: this.mPos = i;
          if (i >= this.mCount)
          {
            this.mCount = (i + 1);
            this.mCountFinished = false;
          }
        }
        label217: AppMethodBeat.o(12566);
      }
    }
  }

  // ERROR //
  public boolean requery()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: sipush 12568
    //   5: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 138	com/tencent/wcdb/database/SQLiteDirectCursor:isClosed	()Z
    //   12: ifeq +11 -> 23
    //   15: sipush 12568
    //   18: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iload_1
    //   22: ireturn
    //   23: aload_0
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield 50	com/tencent/wcdb/database/SQLiteDirectCursor:mQuery	Lcom/tencent/wcdb/database/SQLiteDirectQuery;
    //   29: invokevirtual 142	com/tencent/wcdb/database/SQLiteDirectQuery:getDatabase	()Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   32: invokevirtual 147	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   35: ifne +14 -> 49
    //   38: aload_0
    //   39: monitorexit
    //   40: sipush 12568
    //   43: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: goto -25 -> 21
    //   49: aload_0
    //   50: iconst_m1
    //   51: putfield 96	com/tencent/wcdb/database/SQLiteDirectCursor:mPos	I
    //   54: aload_0
    //   55: iconst_0
    //   56: putfield 64	com/tencent/wcdb/database/SQLiteDirectCursor:mCountFinished	Z
    //   59: aload_0
    //   60: iconst_m1
    //   61: putfield 62	com/tencent/wcdb/database/SQLiteDirectCursor:mCount	I
    //   64: aload_0
    //   65: getfield 52	com/tencent/wcdb/database/SQLiteDirectCursor:mDriver	Lcom/tencent/wcdb/database/SQLiteCursorDriver;
    //   68: aload_0
    //   69: invokeinterface 151 2 0
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_0
    //   77: getfield 50	com/tencent/wcdb/database/SQLiteDirectCursor:mQuery	Lcom/tencent/wcdb/database/SQLiteDirectQuery;
    //   80: iconst_0
    //   81: invokevirtual 105	com/tencent/wcdb/database/SQLiteDirectQuery:reset	(Z)V
    //   84: aload_0
    //   85: invokespecial 153	com/tencent/wcdb/AbstractCursor:requery	()Z
    //   88: istore_2
    //   89: iload_2
    //   90: istore_1
    //   91: sipush 12568
    //   94: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: goto -76 -> 21
    //   100: astore_3
    //   101: aload_0
    //   102: monitorexit
    //   103: sipush 12568
    //   106: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: aload_3
    //   110: athrow
    //   111: astore_3
    //   112: ldc 12
    //   114: new 155	java/lang/StringBuilder
    //   117: dup
    //   118: ldc 157
    //   120: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: aload_3
    //   124: invokevirtual 162	java/lang/IllegalStateException:getMessage	()Ljava/lang/String;
    //   127: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: iconst_1
    //   134: anewarray 171	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload_3
    //   140: aastore
    //   141: invokestatic 174	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: sipush 12568
    //   147: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: goto -129 -> 21
    //
    // Exception table:
    //   from	to	target	type
    //   25	40	100	finally
    //   49	76	100	finally
    //   101	103	100	finally
    //   84	89	111	java/lang/IllegalStateException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteDirectCursor
 * JD-Core Version:    0.6.2
 */