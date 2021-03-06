package com.tencent.tmassistantsdk.storage.table;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class DownloadLogTable extends BaseLogTable
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists downloadLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  protected static final String SQL_INSERT = "INSERT INTO downloadLogData logData = ?";
  public static final String TABLE_NAME = "downloadLogData";
  protected static DownloadLogTable mInstance = null;

  public static DownloadLogTable getInstance()
  {
    try
    {
      AppMethodBeat.i(76203);
      if (mInstance == null)
      {
        localDownloadLogTable = new com/tencent/tmassistantsdk/storage/table/DownloadLogTable;
        localDownloadLogTable.<init>();
        mInstance = localDownloadLogTable;
      }
      DownloadLogTable localDownloadLogTable = mInstance;
      AppMethodBeat.o(76203);
      return localDownloadLogTable;
    }
    finally
    {
    }
  }

  protected String[] getAlterSQL(int paramInt)
  {
    AppMethodBeat.i(76204);
    String str = getCreateTableSQL();
    AppMethodBeat.o(76204);
    return new String[] { str };
  }

  protected String getCreateTableSQL()
  {
    return "CREATE TABLE if not exists downloadLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  }

  protected String getInsertSQL()
  {
    return "INSERT INTO downloadLogData logData = ?";
  }

  protected String getTableName()
  {
    return "downloadLogData";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.DownloadLogTable
 * JD-Core Version:    0.6.2
 */