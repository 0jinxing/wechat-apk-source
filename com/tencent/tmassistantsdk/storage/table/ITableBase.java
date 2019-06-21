package com.tencent.tmassistantsdk.storage.table;

import android.database.sqlite.SQLiteDatabase;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;

public abstract interface ITableBase
{
  public abstract String createTableSQL();

  public abstract void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2);

  public abstract String[] getAlterSQL(int paramInt1, int paramInt2);

  public abstract SqliteHelper getHelper();

  public abstract String tableName();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.ITableBase
 * JD-Core Version:    0.6.2
 */