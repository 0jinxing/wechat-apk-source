package com.tencent.wcdb.database;

import com.tencent.wcdb.SQLException;

public class SQLiteException extends SQLException
{
  public SQLiteException()
  {
  }

  public SQLiteException(String paramString)
  {
    super(paramString);
  }

  public SQLiteException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteException
 * JD-Core Version:    0.6.2
 */