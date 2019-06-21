package com.tencent.wcdb;

import com.tencent.wcdb.database.SQLiteDatabase;

public abstract interface DatabaseErrorHandler
{
  public abstract void onCorruption(SQLiteDatabase paramSQLiteDatabase);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.DatabaseErrorHandler
 * JD-Core Version:    0.6.2
 */