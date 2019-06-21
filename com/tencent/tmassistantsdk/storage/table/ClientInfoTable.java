package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import com.tencent.tmassistantsdk.storage.model.ClientInfo;

public class ClientInfoTable
  implements ITableBase
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists clientinfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, clientId TEXT , taskId INTEGER, taskUrl TEXT);";
  public static final String QUERY_CLIENTINFO = "select * from clientinfo where clientId = ?";
  public static final String QUERY_CLIENTINFO_ALL = "select * from clientinfo";
  public static final String TABLE_NAME = "clientinfo";
  private static final String TAG = "ClientInfoTable";

  private static ClientInfo cursor2object(Cursor paramCursor)
  {
    AppMethodBeat.i(76185);
    ClientInfo localClientInfo = new ClientInfo();
    localClientInfo.clientId = paramCursor.getString(paramCursor.getColumnIndex("clientId"));
    localClientInfo.taskId = paramCursor.getInt(paramCursor.getColumnIndex("taskId"));
    localClientInfo.taskUrl = paramCursor.getString(paramCursor.getColumnIndex("taskUrl"));
    AppMethodBeat.o(76185);
    return localClientInfo;
  }

  public static void delete(String paramString1, String paramString2)
  {
    AppMethodBeat.i(76190);
    if ((paramString1 != null) && (paramString2 != null));
    while (true)
    {
      try
      {
        AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete("clientinfo", "clientId = ? and taskUrl = ?", new String[] { paramString1, paramString2 });
        AppMethodBeat.o(76190);
        return;
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("ClientInfoTable", paramString1, "", new Object[0]);
      }
      AppMethodBeat.o(76190);
    }
  }

  public static void deleteItemsByURL(String paramString)
  {
    AppMethodBeat.i(76191);
    if (!TextUtils.isEmpty(paramString));
    while (true)
    {
      try
      {
        AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete("clientinfo", "taskUrl = ?", new String[] { paramString });
        AppMethodBeat.o(76191);
        return;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("ClientInfoTable", paramString, "", new Object[0]);
      }
      AppMethodBeat.o(76191);
    }
  }

  private static void fillValues(ContentValues paramContentValues, ClientInfo paramClientInfo)
  {
    AppMethodBeat.i(76184);
    if (paramClientInfo != null)
    {
      paramContentValues.put("clientId", paramClientInfo.clientId);
      paramContentValues.put("taskId", Integer.valueOf(paramClientInfo.taskId));
      paramContentValues.put("taskUrl", paramClientInfo.taskUrl);
    }
    AppMethodBeat.o(76184);
  }

  // ERROR //
  public static java.util.ArrayList<ClientInfo> query(String paramString)
  {
    // Byte code:
    //   0: ldc 136
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnull +118 -> 124
    //   9: new 138	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 139	java/util/ArrayList:<init>	()V
    //   16: astore_1
    //   17: invokestatic 82	com/tencent/tmassistantsdk/storage/helper/AstSDKDBHelper_V2:getInstance	()Lcom/tencent/tmassistantsdk/storage/helper/SqliteHelper;
    //   20: invokevirtual 142	com/tencent/tmassistantsdk/storage/helper/SqliteHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore_2
    //   24: aload_2
    //   25: ldc 15
    //   27: iconst_1
    //   28: anewarray 92	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: aload_0
    //   34: aastore
    //   35: invokevirtual 146	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore_2
    //   39: aload_2
    //   40: ifnull +38 -> 78
    //   43: aload_2
    //   44: astore_0
    //   45: aload_2
    //   46: invokeinterface 150 1 0
    //   51: ifeq +27 -> 78
    //   54: aload_2
    //   55: astore_0
    //   56: aload_1
    //   57: aload_2
    //   58: invokestatic 152	com/tencent/tmassistantsdk/storage/table/ClientInfoTable:cursor2object	(Landroid/database/Cursor;)Lcom/tencent/tmassistantsdk/storage/model/ClientInfo;
    //   61: invokevirtual 156	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   64: pop
    //   65: aload_2
    //   66: astore_0
    //   67: aload_2
    //   68: invokeinterface 159 1 0
    //   73: istore_3
    //   74: iload_3
    //   75: ifne -21 -> 54
    //   78: aload_2
    //   79: ifnull +9 -> 88
    //   82: aload_2
    //   83: invokeinterface 162 1 0
    //   88: ldc 136
    //   90: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: aload_1
    //   94: astore_0
    //   95: aload_0
    //   96: areturn
    //   97: astore_1
    //   98: aconst_null
    //   99: astore_2
    //   100: aload_2
    //   101: astore_0
    //   102: ldc 24
    //   104: aload_1
    //   105: ldc 99
    //   107: iconst_0
    //   108: anewarray 4	java/lang/Object
    //   111: invokestatic 105	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: aload_2
    //   115: ifnull +9 -> 124
    //   118: aload_2
    //   119: invokeinterface 162 1 0
    //   124: ldc 136
    //   126: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: aconst_null
    //   130: astore_0
    //   131: goto -36 -> 95
    //   134: astore_2
    //   135: aconst_null
    //   136: astore_0
    //   137: aload_0
    //   138: ifnull +9 -> 147
    //   141: aload_0
    //   142: invokeinterface 162 1 0
    //   147: ldc 136
    //   149: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aload_2
    //   153: athrow
    //   154: astore_2
    //   155: goto -18 -> 137
    //   158: astore_1
    //   159: goto -59 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   24	39	97	java/lang/Exception
    //   24	39	134	finally
    //   45	54	154	finally
    //   56	65	154	finally
    //   67	74	154	finally
    //   102	114	154	finally
    //   45	54	158	java/lang/Exception
    //   56	65	158	java/lang/Exception
    //   67	74	158	java/lang/Exception
  }

  public static void save(ClientInfo paramClientInfo)
  {
    AppMethodBeat.i(76186);
    if (paramClientInfo != null);
    while (true)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
        if (update(paramClientInfo, localSQLiteDatabase) <= 0)
        {
          ContentValues localContentValues = new android/content/ContentValues;
          localContentValues.<init>();
          fillValues(localContentValues, paramClientInfo);
          localSQLiteDatabase.insert("clientinfo", null, localContentValues);
        }
        AppMethodBeat.o(76186);
        return;
      }
      catch (Exception paramClientInfo)
      {
        ab.printErrStackTrace("ClientInfoTable", paramClientInfo, "", new Object[0]);
      }
      AppMethodBeat.o(76186);
    }
  }

  public static void save(String paramString1, String paramString2)
  {
    AppMethodBeat.i(76187);
    ClientInfo localClientInfo = new ClientInfo();
    localClientInfo.clientId = paramString1;
    localClientInfo.taskUrl = paramString2;
    save(localClientInfo);
    AppMethodBeat.o(76187);
  }

  private static int update(ClientInfo paramClientInfo, SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(76188);
    int i;
    if (paramClientInfo == null)
    {
      i = -1;
      AppMethodBeat.o(76188);
    }
    while (true)
    {
      return i;
      try
      {
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        fillValues(localContentValues, paramClientInfo);
        i = paramSQLiteDatabase.update("clientinfo", localContentValues, "clientId = ? and taskUrl = ?", new String[] { paramClientInfo.clientId, paramClientInfo.taskUrl });
        if (i > 0)
        {
          AppMethodBeat.o(76188);
        }
        else
        {
          AppMethodBeat.o(76188);
          i = 0;
        }
      }
      catch (Exception paramClientInfo)
      {
        ab.printErrStackTrace("ClientInfoTable", paramClientInfo, "", new Object[0]);
        i = -2;
        AppMethodBeat.o(76188);
      }
    }
  }

  public String createTableSQL()
  {
    return "CREATE TABLE if not exists clientinfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, clientId TEXT , taskId INTEGER, taskUrl TEXT);";
  }

  public void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2)
  {
    Object localObject = null;
    SQLiteDatabase localSQLiteDatabase = null;
    AppMethodBeat.i(76193);
    if ((paramSQLiteDatabase2 != null) && (paramSQLiteDatabase1 != null))
      paramSQLiteDatabase2.beginTransaction();
    try
    {
      paramSQLiteDatabase1 = paramSQLiteDatabase1.rawQuery("select * from clientinfo", null);
      if (paramSQLiteDatabase1 != null)
      {
        localSQLiteDatabase = paramSQLiteDatabase1;
        localObject = paramSQLiteDatabase1;
        if (paramSQLiteDatabase1.moveToFirst())
        {
          boolean bool;
          do
          {
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            ContentValues localContentValues = new android/content/ContentValues;
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            localContentValues.<init>();
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            fillValues(localContentValues, cursor2object(paramSQLiteDatabase1));
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            paramSQLiteDatabase2.insert("clientinfo", null, localContentValues);
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            bool = paramSQLiteDatabase1.moveToNext();
          }
          while (bool);
        }
      }
      if (paramSQLiteDatabase1 != null)
        paramSQLiteDatabase1.close();
      paramSQLiteDatabase2.setTransactionSuccessful();
      paramSQLiteDatabase2.endTransaction();
      AppMethodBeat.o(76193);
      return;
    }
    catch (Exception paramSQLiteDatabase1)
    {
      while (true)
      {
        localObject = localSQLiteDatabase;
        ab.printErrStackTrace("ClientInfoTable", paramSQLiteDatabase1, "", new Object[0]);
        if (localSQLiteDatabase != null)
          localSQLiteDatabase.close();
      }
    }
    finally
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(76193);
    }
    throw paramSQLiteDatabase1;
  }

  public String[] getAlterSQL(int paramInt1, int paramInt2)
  {
    return null;
  }

  public SqliteHelper getHelper()
  {
    AppMethodBeat.i(76192);
    SqliteHelper localSqliteHelper = AstSDKDBHelper_V2.getInstance();
    AppMethodBeat.o(76192);
    return localSqliteHelper;
  }

  public String tableName()
  {
    return "clientinfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.ClientInfoTable
 * JD-Core Version:    0.6.2
 */