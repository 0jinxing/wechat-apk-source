package com.tencent.tmassistantsdk.storage.table;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class UpdateInfoLogTable extends BaseLogTable
{
  private static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists SelfUpdateInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  private static final String INSERT_SQL = "INSERT INTO SelfUpdateInfoLogData logData = ?";
  private static final String TABLE_NAME = "SelfUpdateInfoLogData";
  private static UpdateInfoLogTable mInstance = null;

  public static UpdateInfoLogTable getInstance()
  {
    try
    {
      AppMethodBeat.i(76211);
      if (mInstance == null)
      {
        localUpdateInfoLogTable = new com/tencent/tmassistantsdk/storage/table/UpdateInfoLogTable;
        localUpdateInfoLogTable.<init>();
        mInstance = localUpdateInfoLogTable;
      }
      UpdateInfoLogTable localUpdateInfoLogTable = mInstance;
      AppMethodBeat.o(76211);
      return localUpdateInfoLogTable;
    }
    finally
    {
    }
  }

  protected String[] getAlterSQL(int paramInt)
  {
    AppMethodBeat.i(76212);
    String[] arrayOfString;
    if (paramInt > 1)
    {
      arrayOfString = new String[1];
      arrayOfString[0] = getCreateTableSQL();
      AppMethodBeat.o(76212);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = null;
      AppMethodBeat.o(76212);
    }
  }

  protected String getCreateTableSQL()
  {
    return "CREATE TABLE if not exists SelfUpdateInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  }

  protected String getInsertSQL()
  {
    return "INSERT INTO SelfUpdateInfoLogData logData = ?";
  }

  protected String getTableName()
  {
    return "SelfUpdateInfoLogData";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable
 * JD-Core Version:    0.6.2
 */