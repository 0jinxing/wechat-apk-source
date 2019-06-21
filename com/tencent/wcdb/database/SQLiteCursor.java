package com.tencent.wcdb.database;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.AbstractWindowedCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.util.HashMap;
import java.util.Map;

public class SQLiteCursor extends AbstractWindowedCursor
{
  public static final SQLiteDatabase.CursorFactory FACTORY;
  static final int NO_COUNT = -1;
  static final String TAG = "WCDB.SQLiteCursor";
  private Map<String, Integer> mColumnNameMap;
  private final String[] mColumns;
  private int mCount;
  private int mCursorWindowCapacity;
  private final SQLiteCursorDriver mDriver;
  private final String mEditTable;
  private final SQLiteQuery mQuery;
  private final Throwable mStackTrace;

  static
  {
    AppMethodBeat.i(12419);
    FACTORY = new SQLiteDatabase.CursorFactory()
    {
      public final Cursor newCursor(SQLiteDatabase paramAnonymousSQLiteDatabase, SQLiteCursorDriver paramAnonymousSQLiteCursorDriver, String paramAnonymousString, SQLiteProgram paramAnonymousSQLiteProgram)
      {
        AppMethodBeat.i(12405);
        paramAnonymousSQLiteDatabase = new SQLiteCursor(paramAnonymousSQLiteCursorDriver, paramAnonymousString, (SQLiteQuery)paramAnonymousSQLiteProgram);
        AppMethodBeat.o(12405);
        return paramAnonymousSQLiteDatabase;
      }

      public final SQLiteProgram newQuery(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString, Object[] paramAnonymousArrayOfObject, CancellationSignal paramAnonymousCancellationSignal)
      {
        AppMethodBeat.i(12406);
        paramAnonymousSQLiteDatabase = new SQLiteQuery(paramAnonymousSQLiteDatabase, paramAnonymousString, paramAnonymousArrayOfObject, paramAnonymousCancellationSignal);
        AppMethodBeat.o(12406);
        return paramAnonymousSQLiteDatabase;
      }
    };
    AppMethodBeat.o(12419);
  }

  public SQLiteCursor(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    AppMethodBeat.i(12407);
    this.mCount = -1;
    if (paramSQLiteQuery == null)
    {
      paramSQLiteCursorDriver = new IllegalArgumentException("query object cannot be null");
      AppMethodBeat.o(12407);
      throw paramSQLiteCursorDriver;
    }
    this.mStackTrace = null;
    this.mDriver = paramSQLiteCursorDriver;
    this.mEditTable = paramString;
    this.mColumnNameMap = null;
    this.mQuery = paramSQLiteQuery;
    this.mColumns = paramSQLiteQuery.getColumnNames();
    this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
    AppMethodBeat.o(12407);
  }

  @Deprecated
  public SQLiteCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    this(paramSQLiteCursorDriver, paramString, paramSQLiteQuery);
  }

  private void fillWindow(int paramInt)
  {
    AppMethodBeat.i(12411);
    clearOrCreateWindow(getDatabase().getPath());
    try
    {
      int i;
      if (this.mCount == -1)
      {
        i = DatabaseUtils.cursorPickFillWindowStartPosition(paramInt, 0);
        this.mCount = this.mQuery.fillWindow(this.mWindow, i, paramInt, true);
        this.mCursorWindowCapacity = this.mWindow.getNumRows();
        AppMethodBeat.o(12411);
      }
      while (true)
      {
        return;
        i = DatabaseUtils.cursorPickFillWindowStartPosition(paramInt, this.mCursorWindowCapacity);
        this.mQuery.fillWindow(this.mWindow, i, paramInt, false);
        AppMethodBeat.o(12411);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      closeWindow();
      AppMethodBeat.o(12411);
      throw localRuntimeException;
    }
  }

  public void close()
  {
    AppMethodBeat.i(12414);
    super.close();
    try
    {
      this.mQuery.close();
      this.mDriver.cursorClosed();
      return;
    }
    finally
    {
      AppMethodBeat.o(12414);
    }
  }

  public void deactivate()
  {
    AppMethodBeat.i(12413);
    super.deactivate();
    this.mDriver.cursorDeactivated();
    AppMethodBeat.o(12413);
  }

  public void finalize()
  {
    AppMethodBeat.i(12418);
    try
    {
      if (this.mWindow != null)
        close();
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(12418);
    }
  }

  public int getColumnIndex(String paramString)
  {
    AppMethodBeat.i(12412);
    if (this.mColumnNameMap == null)
    {
      localObject = this.mColumns;
      int i = localObject.length;
      HashMap localHashMap = new HashMap(i, 1.0F);
      for (j = 0; j < i; j++)
        localHashMap.put(localObject[j], Integer.valueOf(j));
      this.mColumnNameMap = localHashMap;
    }
    int j = paramString.lastIndexOf('.');
    Object localObject = paramString;
    if (j != -1)
    {
      localObject = new Exception();
      Log.e("WCDB.SQLiteCursor", "requesting column name with table name -- ".concat(String.valueOf(paramString)), new Object[] { localObject });
      localObject = paramString.substring(j + 1);
    }
    paramString = (Integer)this.mColumnNameMap.get(localObject);
    if (paramString != null)
    {
      j = paramString.intValue();
      AppMethodBeat.o(12412);
    }
    while (true)
    {
      return j;
      AppMethodBeat.o(12412);
      j = -1;
    }
  }

  public String[] getColumnNames()
  {
    return this.mColumns;
  }

  public int getCount()
  {
    AppMethodBeat.i(12410);
    if (this.mCount == -1)
      fillWindow(0);
    int i = this.mCount;
    AppMethodBeat.o(12410);
    return i;
  }

  public SQLiteDatabase getDatabase()
  {
    AppMethodBeat.i(12408);
    SQLiteDatabase localSQLiteDatabase = this.mQuery.getDatabase();
    AppMethodBeat.o(12408);
    return localSQLiteDatabase;
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(12409);
    if ((this.mWindow == null) || (paramInt2 < this.mWindow.getStartPosition()) || (paramInt2 >= this.mWindow.getStartPosition() + this.mWindow.getNumRows()))
      fillWindow(paramInt2);
    AppMethodBeat.o(12409);
    return true;
  }

  // ERROR //
  public boolean requery()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: sipush 12415
    //   5: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 218	com/tencent/wcdb/database/SQLiteCursor:isClosed	()Z
    //   12: ifeq +13 -> 25
    //   15: sipush 12415
    //   18: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iload_1
    //   22: istore_2
    //   23: iload_2
    //   24: ireturn
    //   25: aload_0
    //   26: monitorenter
    //   27: aload_0
    //   28: getfield 67	com/tencent/wcdb/database/SQLiteCursor:mQuery	Lcom/tencent/wcdb/database/SQLiteQuery;
    //   31: invokevirtual 206	com/tencent/wcdb/database/SQLiteQuery:getDatabase	()Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   34: invokevirtual 221	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   37: ifne +16 -> 53
    //   40: aload_0
    //   41: monitorexit
    //   42: sipush 12415
    //   45: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: iload_1
    //   49: istore_2
    //   50: goto -27 -> 23
    //   53: aload_0
    //   54: getfield 113	com/tencent/wcdb/database/SQLiteCursor:mWindow	Lcom/tencent/wcdb/CursorWindow;
    //   57: ifnull +10 -> 67
    //   60: aload_0
    //   61: getfield 113	com/tencent/wcdb/database/SQLiteCursor:mWindow	Lcom/tencent/wcdb/CursorWindow;
    //   64: invokevirtual 224	com/tencent/wcdb/CursorWindow:clear	()V
    //   67: aload_0
    //   68: iconst_m1
    //   69: putfield 227	com/tencent/wcdb/database/SQLiteCursor:mPos	I
    //   72: aload_0
    //   73: iconst_m1
    //   74: putfield 50	com/tencent/wcdb/database/SQLiteCursor:mCount	I
    //   77: aload_0
    //   78: getfield 61	com/tencent/wcdb/database/SQLiteCursor:mDriver	Lcom/tencent/wcdb/database/SQLiteCursorDriver;
    //   81: aload_0
    //   82: invokeinterface 231 2 0
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_0
    //   90: invokespecial 233	com/tencent/wcdb/AbstractWindowedCursor:requery	()Z
    //   93: istore_2
    //   94: sipush 12415
    //   97: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: goto -77 -> 23
    //   103: astore_3
    //   104: aload_0
    //   105: monitorexit
    //   106: sipush 12415
    //   109: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: aload_3
    //   113: athrow
    //   114: astore_3
    //   115: ldc 15
    //   117: new 235	java/lang/StringBuilder
    //   120: dup
    //   121: ldc 237
    //   123: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: aload_3
    //   127: invokevirtual 241	java/lang/IllegalStateException:getMessage	()Ljava/lang/String;
    //   130: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 248	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: iconst_1
    //   137: anewarray 183	java/lang/Object
    //   140: dup
    //   141: iconst_0
    //   142: aload_3
    //   143: aastore
    //   144: invokestatic 251	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: sipush 12415
    //   150: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: iload_1
    //   154: istore_2
    //   155: goto -132 -> 23
    //
    // Exception table:
    //   from	to	target	type
    //   27	42	103	finally
    //   53	67	103	finally
    //   67	89	103	finally
    //   104	106	103	finally
    //   89	94	114	java/lang/IllegalStateException
  }

  public void setSelectionArguments(String[] paramArrayOfString)
  {
    AppMethodBeat.i(12417);
    this.mDriver.setBindArguments(paramArrayOfString);
    AppMethodBeat.o(12417);
  }

  public void setWindow(CursorWindow paramCursorWindow)
  {
    AppMethodBeat.i(12416);
    super.setWindow(paramCursorWindow);
    this.mCount = -1;
    AppMethodBeat.o(12416);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteCursor
 * JD-Core Version:    0.6.2
 */