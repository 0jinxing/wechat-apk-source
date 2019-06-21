package com.tencent.wcdb.database;

public abstract interface SQLiteChangeListener
{
  public abstract void onChange(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteChangeListener
 * JD-Core Version:    0.6.2
 */