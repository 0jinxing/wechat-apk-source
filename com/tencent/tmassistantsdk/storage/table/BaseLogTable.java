package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import java.util.Iterator;
import java.util.List;

public abstract class BaseLogTable
  implements ITableBase
{
  private static final String TAG = "BaseLogTable";

  public String createTableSQL()
  {
    return getCreateTableSQL();
  }

  public void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2)
  {
  }

  public boolean delete(List<Long> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0));
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      StringBuffer localStringBuffer = new StringBuffer("(");
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localStringBuffer.append((Long)paramList.next());
        localStringBuffer.append(",");
      }
      if (localStringBuffer.length() > 0)
        localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
      localStringBuffer.append(")");
      getHelper().getWritableDatabase().delete(getTableName(), "_id in ".concat(String.valueOf(localStringBuffer)), null);
    }
  }

  protected abstract String[] getAlterSQL(int paramInt);

  public String[] getAlterSQL(int paramInt1, int paramInt2)
  {
    return getAlterSQL(paramInt2);
  }

  protected abstract String getCreateTableSQL();

  // ERROR //
  public BaseLogTable.DataWrapper getDatas(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 8	com/tencent/tmassistantsdk/storage/table/BaseLogTable$DataWrapper
    //   5: dup
    //   6: invokespecial 115	com/tencent/tmassistantsdk/storage/table/BaseLogTable$DataWrapper:<init>	()V
    //   9: astore_3
    //   10: aload_3
    //   11: new 117	java/util/ArrayList
    //   14: dup
    //   15: invokespecial 118	java/util/ArrayList:<init>	()V
    //   18: putfield 122	com/tencent/tmassistantsdk/storage/table/BaseLogTable$DataWrapper:idList	Ljava/util/List;
    //   21: aload_3
    //   22: new 117	java/util/ArrayList
    //   25: dup
    //   26: invokespecial 118	java/util/ArrayList:<init>	()V
    //   29: putfield 125	com/tencent/tmassistantsdk/storage/table/BaseLogTable$DataWrapper:dataList	Ljava/util/List;
    //   32: iload_1
    //   33: ifle +247 -> 280
    //   36: ldc 127
    //   38: iload_1
    //   39: invokestatic 130	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   42: invokevirtual 98	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   45: astore 4
    //   47: aload_0
    //   48: invokevirtual 77	com/tencent/tmassistantsdk/storage/table/BaseLogTable:getHelper	()Lcom/tencent/tmassistantsdk/storage/helper/SqliteHelper;
    //   51: invokevirtual 133	com/tencent/tmassistantsdk/storage/helper/SqliteHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore 5
    //   56: aload 5
    //   58: aload_0
    //   59: invokevirtual 86	com/tencent/tmassistantsdk/storage/table/BaseLogTable:getTableName	()Ljava/lang/String;
    //   62: aconst_null
    //   63: aconst_null
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: ldc 135
    //   69: aload 4
    //   71: invokevirtual 139	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 5
    //   76: aload 5
    //   78: ifnull +114 -> 192
    //   81: aload 5
    //   83: astore 4
    //   85: aload 5
    //   87: invokeinterface 144 1 0
    //   92: ifeq +100 -> 192
    //   95: aload 5
    //   97: astore 4
    //   99: aload 5
    //   101: aload 5
    //   103: ldc 146
    //   105: invokeinterface 150 2 0
    //   110: invokeinterface 154 2 0
    //   115: lstore 6
    //   117: aload 5
    //   119: astore 4
    //   121: aload_3
    //   122: getfield 122	com/tencent/tmassistantsdk/storage/table/BaseLogTable$DataWrapper:idList	Ljava/util/List;
    //   125: lload 6
    //   127: invokestatic 157	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   130: invokeinterface 161 2 0
    //   135: pop
    //   136: aload 5
    //   138: astore 4
    //   140: aload 5
    //   142: aload 5
    //   144: ldc 163
    //   146: invokeinterface 150 2 0
    //   151: invokeinterface 167 2 0
    //   156: astore 8
    //   158: aload 5
    //   160: astore 4
    //   162: aload_3
    //   163: getfield 125	com/tencent/tmassistantsdk/storage/table/BaseLogTable$DataWrapper:dataList	Ljava/util/List;
    //   166: aload 8
    //   168: invokeinterface 161 2 0
    //   173: pop
    //   174: aload 5
    //   176: astore 4
    //   178: aload 5
    //   180: invokeinterface 170 1 0
    //   185: istore 9
    //   187: iload 9
    //   189: ifne -94 -> 95
    //   192: aload 5
    //   194: ifnull +10 -> 204
    //   197: aload 5
    //   199: invokeinterface 173 1 0
    //   204: aload_3
    //   205: astore 4
    //   207: aload 4
    //   209: areturn
    //   210: astore_3
    //   211: aconst_null
    //   212: astore 5
    //   214: aload 5
    //   216: astore 4
    //   218: ldc 12
    //   220: aload_3
    //   221: ldc 175
    //   223: iconst_0
    //   224: anewarray 4	java/lang/Object
    //   227: invokestatic 181	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   230: aload_2
    //   231: astore 4
    //   233: aload 5
    //   235: ifnull -28 -> 207
    //   238: aload 5
    //   240: invokeinterface 173 1 0
    //   245: aload_2
    //   246: astore 4
    //   248: goto -41 -> 207
    //   251: astore 5
    //   253: aconst_null
    //   254: astore 4
    //   256: aload 4
    //   258: ifnull +10 -> 268
    //   261: aload 4
    //   263: invokeinterface 173 1 0
    //   268: aload 5
    //   270: athrow
    //   271: astore 5
    //   273: goto -17 -> 256
    //   276: astore_3
    //   277: goto -63 -> 214
    //   280: aconst_null
    //   281: astore 4
    //   283: goto -236 -> 47
    //
    // Exception table:
    //   from	to	target	type
    //   56	76	210	java/lang/Exception
    //   56	76	251	finally
    //   85	95	271	finally
    //   99	117	271	finally
    //   121	136	271	finally
    //   140	158	271	finally
    //   162	174	271	finally
    //   178	187	271	finally
    //   218	230	271	finally
    //   85	95	276	java/lang/Exception
    //   99	117	276	java/lang/Exception
    //   121	136	276	java/lang/Exception
    //   140	158	276	java/lang/Exception
    //   162	174	276	java/lang/Exception
    //   178	187	276	java/lang/Exception
  }

  public SqliteHelper getHelper()
  {
    return AstSDKDBHelper_V2.getInstance();
  }

  protected abstract String getInsertSQL();

  protected abstract String getTableName();

  public boolean save(List<byte[]> paramList)
  {
    SQLiteDatabase localSQLiteDatabase = getHelper().getWritableDatabase();
    try
    {
      localSQLiteDatabase.beginTransaction();
      SQLiteStatement localSQLiteStatement = localSQLiteDatabase.compileStatement(getInsertSQL());
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localSQLiteStatement.bindBlob(1, (byte[])paramList.next());
        localSQLiteStatement.executeInsert();
      }
    }
    catch (Exception paramList)
    {
      ab.printErrStackTrace("BaseLogTable", paramList, "", new Object[0]);
      localSQLiteDatabase.endTransaction();
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
      }
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
    throw paramList;
  }

  public boolean save(byte[] paramArrayOfByte)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("logData", paramArrayOfByte);
    if (getHelper().getWritableDatabase().insert(getTableName(), null, localContentValues) > 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String tableName()
  {
    return getTableName();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.BaseLogTable
 * JD-Core Version:    0.6.2
 */