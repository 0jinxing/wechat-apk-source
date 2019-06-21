package com.tencent.tmassistantsdk.storage.table;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class TipsInfoLogTable extends BaseLogTable
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists TipsInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  protected static final String SQL_INSERT = "INSERT INTO TipsInfoLogData logData = ?";
  public static final String TABLE_NAME = "TipsInfoLogData";
  protected static TipsInfoLogTable mInstance = null;

  public static TipsInfoLogTable getInstance()
  {
    try
    {
      AppMethodBeat.i(76209);
      if (mInstance == null)
      {
        localTipsInfoLogTable = new com/tencent/tmassistantsdk/storage/table/TipsInfoLogTable;
        localTipsInfoLogTable.<init>();
        mInstance = localTipsInfoLogTable;
      }
      TipsInfoLogTable localTipsInfoLogTable = mInstance;
      AppMethodBeat.o(76209);
      return localTipsInfoLogTable;
    }
    finally
    {
    }
  }

  protected String[] getAlterSQL(int paramInt)
  {
    AppMethodBeat.i(76210);
    String[] arrayOfString;
    if (paramInt > 1)
    {
      arrayOfString = new String[1];
      arrayOfString[0] = getCreateTableSQL();
      AppMethodBeat.o(76210);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = null;
      AppMethodBeat.o(76210);
    }
  }

  protected String getCreateTableSQL()
  {
    return "CREATE TABLE if not exists TipsInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  }

  protected String getInsertSQL()
  {
    return "INSERT INTO TipsInfoLogData logData = ?";
  }

  protected String getTableName()
  {
    return "TipsInfoLogData";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable
 * JD-Core Version:    0.6.2
 */