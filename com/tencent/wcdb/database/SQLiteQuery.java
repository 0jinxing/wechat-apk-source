package com.tencent.wcdb.database;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public final class SQLiteQuery extends SQLiteProgram
{
  private static final String TAG = "WCDB.SQLiteQuery";
  private final CancellationSignal mCancellationSignal;

  SQLiteQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, paramArrayOfObject, paramCancellationSignal);
    this.mCancellationSignal = paramCancellationSignal;
  }

  final int fillWindow(CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(12583);
    acquireReference();
    try
    {
      paramCursorWindow.acquireReference();
      try
      {
        paramInt1 = getSession().executeForCursorWindow(getSql(), getBindArgs(), paramCursorWindow, paramInt1, paramInt2, paramBoolean, getConnectionFlags(), this.mCancellationSignal);
        paramCursorWindow.releaseReference();
        return paramInt1;
      }
      catch (SQLiteException localSQLiteException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("exception: ");
        Log.e("WCDB.SQLiteQuery", localSQLiteException.getMessage() + "; query: " + getSql());
        checkCorruption(localSQLiteException);
        AppMethodBeat.o(12583);
        throw localSQLiteException;
      }
      finally
      {
      }
    }
    finally
    {
      releaseReference();
      AppMethodBeat.o(12583);
    }
    throw paramCursorWindow;
  }

  public final String toString()
  {
    AppMethodBeat.i(12584);
    String str = "SQLiteQuery: " + getSql();
    AppMethodBeat.o(12584);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteQuery
 * JD-Core Version:    0.6.2
 */