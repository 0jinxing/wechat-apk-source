package com.tencent.wcdb.database;

public abstract interface SQLiteCheckpointListener
{
  public abstract void onAttach(SQLiteDatabase paramSQLiteDatabase);

  public abstract void onDetach(SQLiteDatabase paramSQLiteDatabase);

  public abstract void onWALCommit(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteCheckpointListener
 * JD-Core Version:    0.6.2
 */