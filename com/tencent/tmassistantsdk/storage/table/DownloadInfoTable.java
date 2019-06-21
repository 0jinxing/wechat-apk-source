package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class DownloadInfoTable
  implements ITableBase
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists downloadInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, taskId INTEGER , uId TEXT, taskUrl TEXT, secondaryUrl TEXT, finalUrl TEXT, requestFileSize INTEGER, fileName TEXT, contentType TEXT, redirectCnt INTEGER, retryCnt INTEGER, totalBytes INTEGER,status INTEGER,receivedBytes INTEGER,priority INTEGER,netType TEXT,downloadFailedErrCode INTEGER,downloadFailedTime INTEGER,headerParams TEXT);";
  public static final String QUERY_ALL = "select * from downloadInfo";
  public static final String QUERY_DOWNLOADINFO_URL = "select * from downloadInfo where taskUrl = ?";
  public static final String QUERY_UNFINISHED_TASK = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)";
  public static final String TABLE_NAME = "downloadInfo";
  private static final String TAG = "DownloadInfoTable";

  public static void add(DownloadInfo paramDownloadInfo)
  {
    AppMethodBeat.i(76197);
    if (paramDownloadInfo != null);
    while (true)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
        if (update(paramDownloadInfo, localSQLiteDatabase) <= 0)
        {
          ContentValues localContentValues = new android/content/ContentValues;
          localContentValues.<init>();
          DownloadInfo.writeToContentValues(localContentValues, paramDownloadInfo);
          localSQLiteDatabase.insert("downloadInfo", null, localContentValues);
        }
        AppMethodBeat.o(76197);
        return;
      }
      catch (Exception paramDownloadInfo)
      {
        ab.printErrStackTrace("DownloadInfoTable", paramDownloadInfo, "", new Object[0]);
      }
      AppMethodBeat.o(76197);
    }
  }

  public static void del(String paramString)
  {
    AppMethodBeat.i(76198);
    if ((paramString != null) && (paramString.length() > 0));
    while (true)
    {
      try
      {
        AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete("downloadInfo", "taskUrl = ?", new String[] { paramString });
        AppMethodBeat.o(76198);
        return;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("DownloadInfoTable", paramString, "", new Object[0]);
      }
      AppMethodBeat.o(76198);
    }
  }

  public static ArrayList<DownloadInfo> load()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(76195);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = AstSDKDBHelper_V2.getInstance().getReadableDatabase();
    try
    {
      localObject4 = ((SQLiteDatabase)localObject4).rawQuery("select * from downloadInfo", null);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            localArrayList.add(DownloadInfo.readFromCursor((Cursor)localObject4));
            localObject2 = localObject4;
            localObject1 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      AppMethodBeat.o(76195);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.printErrStackTrace("DownloadInfoTable", localException, "", new Object[0]);
        if (localObject2 != null)
          localObject2.close();
        AppMethodBeat.o(76195);
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(76195);
    }
  }

  // ERROR //
  public static DownloadInfo query(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 135
    //   4: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: ifnull +81 -> 89
    //   11: aload_0
    //   12: invokevirtual 92	java/lang/String:length	()I
    //   15: ifle +74 -> 89
    //   18: invokestatic 47	com/tencent/tmassistantsdk/storage/helper/AstSDKDBHelper_V2:getInstance	()Lcom/tencent/tmassistantsdk/storage/helper/SqliteHelper;
    //   21: invokevirtual 107	com/tencent/tmassistantsdk/storage/helper/SqliteHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: ldc 16
    //   26: iconst_1
    //   27: anewarray 88	java/lang/String
    //   30: dup
    //   31: iconst_0
    //   32: aload_0
    //   33: aastore
    //   34: invokevirtual 111	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore_2
    //   38: aload_2
    //   39: ifnull +40 -> 79
    //   42: aload_2
    //   43: astore_0
    //   44: aload_2
    //   45: invokeinterface 117 1 0
    //   50: ifeq +29 -> 79
    //   53: aload_2
    //   54: astore_0
    //   55: aload_2
    //   56: invokestatic 121	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:readFromCursor	(Landroid/database/Cursor;)Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   59: astore_3
    //   60: aload_3
    //   61: astore_0
    //   62: aload_2
    //   63: ifnull +9 -> 72
    //   66: aload_2
    //   67: invokeinterface 130 1 0
    //   72: ldc 135
    //   74: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: aload_0
    //   78: areturn
    //   79: aload_2
    //   80: ifnull +9 -> 89
    //   83: aload_2
    //   84: invokeinterface 130 1 0
    //   89: ldc 135
    //   91: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_1
    //   95: astore_0
    //   96: goto -19 -> 77
    //   99: astore_3
    //   100: aconst_null
    //   101: astore_2
    //   102: aload_2
    //   103: astore_0
    //   104: ldc 25
    //   106: aload_3
    //   107: ldc 77
    //   109: iconst_0
    //   110: anewarray 4	java/lang/Object
    //   113: invokestatic 83	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload_2
    //   117: ifnull -28 -> 89
    //   120: aload_2
    //   121: invokeinterface 130 1 0
    //   126: goto -37 -> 89
    //   129: astore_2
    //   130: aconst_null
    //   131: astore_0
    //   132: aload_0
    //   133: ifnull +9 -> 142
    //   136: aload_0
    //   137: invokeinterface 130 1 0
    //   142: ldc 135
    //   144: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_2
    //   148: athrow
    //   149: astore_2
    //   150: goto -18 -> 132
    //   153: astore_3
    //   154: goto -52 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   18	38	99	java/lang/Exception
    //   18	38	129	finally
    //   44	53	149	finally
    //   55	60	149	finally
    //   104	116	149	finally
    //   44	53	153	java/lang/Exception
    //   55	60	153	java/lang/Exception
  }

  public static ArrayList<ServiceDownloadTask> query()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(76201);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = AstSDKDBHelper_V2.getInstance().getReadableDatabase();
    try
    {
      localObject4 = ((SQLiteDatabase)localObject4).rawQuery("select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)", null);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            String str1 = ((Cursor)localObject4).getString(((Cursor)localObject4).getColumnIndex("clientId"));
            localObject2 = localObject4;
            localObject1 = localObject4;
            String str2 = ((Cursor)localObject4).getString(((Cursor)localObject4).getColumnIndex("taskUrl"));
            localObject2 = localObject4;
            localObject1 = localObject4;
            int i = ((Cursor)localObject4).getInt(((Cursor)localObject4).getColumnIndex("status"));
            localObject2 = localObject4;
            localObject1 = localObject4;
            ServiceDownloadTask localServiceDownloadTask = new com/tencent/tmassistantsdk/downloadservice/taskmanager/ServiceDownloadTask;
            localObject2 = localObject4;
            localObject1 = localObject4;
            localServiceDownloadTask.<init>(str1, str2);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localServiceDownloadTask.mState = i;
            localObject2 = localObject4;
            localObject1 = localObject4;
            localArrayList.add(localServiceDownloadTask);
            localObject2 = localObject4;
            localObject1 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      AppMethodBeat.o(76201);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.printErrStackTrace("DownloadInfoTable", localException, "", new Object[0]);
        if (localObject2 != null)
          localObject2.close();
        AppMethodBeat.o(76201);
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(76201);
    }
  }

  public static void save(ArrayList<DownloadInfo> paramArrayList)
  {
    AppMethodBeat.i(76196);
    SQLiteDatabase localSQLiteDatabase;
    if (paramArrayList != null)
      localSQLiteDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
    while (true)
    {
      try
      {
        localSQLiteDatabase.beginTransaction();
        Iterator localIterator = paramArrayList.iterator();
        if (localIterator.hasNext())
        {
          DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
          if (update(localDownloadInfo, localSQLiteDatabase) > 0)
            continue;
          paramArrayList = new android/content/ContentValues;
          paramArrayList.<init>();
          DownloadInfo.writeToContentValues(paramArrayList, localDownloadInfo);
          localSQLiteDatabase.insert("downloadInfo", null, paramArrayList);
          continue;
        }
      }
      catch (Exception paramArrayList)
      {
        ab.printErrStackTrace("DownloadInfoTable", paramArrayList, "", new Object[0]);
        return;
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        AppMethodBeat.o(76196);
        continue;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        AppMethodBeat.o(76196);
      }
      AppMethodBeat.o(76196);
    }
  }

  private static int update(DownloadInfo paramDownloadInfo, SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(76199);
    int i;
    if (paramDownloadInfo == null)
    {
      i = -1;
      AppMethodBeat.o(76199);
    }
    while (true)
    {
      return i;
      try
      {
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        DownloadInfo.writeToContentValues(localContentValues, paramDownloadInfo);
        i = paramSQLiteDatabase.update("downloadInfo", localContentValues, "taskUrl = ?", new String[] { paramDownloadInfo.mURL });
        if (i > 0)
        {
          AppMethodBeat.o(76199);
        }
        else
        {
          AppMethodBeat.o(76199);
          i = 0;
        }
      }
      catch (Exception paramDownloadInfo)
      {
        ab.printErrStackTrace("DownloadInfoTable", paramDownloadInfo, "", new Object[0]);
        i = -2;
        AppMethodBeat.o(76199);
      }
    }
  }

  public String createTableSQL()
  {
    return "CREATE TABLE if not exists downloadInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, taskId INTEGER , uId TEXT, taskUrl TEXT, secondaryUrl TEXT, finalUrl TEXT, requestFileSize INTEGER, fileName TEXT, contentType TEXT, redirectCnt INTEGER, retryCnt INTEGER, totalBytes INTEGER,status INTEGER,receivedBytes INTEGER,priority INTEGER,netType TEXT,downloadFailedErrCode INTEGER,downloadFailedTime INTEGER,headerParams TEXT);";
  }

  public void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2)
  {
    Object localObject = null;
    SQLiteDatabase localSQLiteDatabase = null;
    AppMethodBeat.i(76202);
    if ((paramSQLiteDatabase2 != null) && (paramSQLiteDatabase1 != null))
      paramSQLiteDatabase2.beginTransaction();
    try
    {
      paramSQLiteDatabase1 = paramSQLiteDatabase1.rawQuery("select * from downloadInfo", null);
      if (paramSQLiteDatabase1 != null)
      {
        localSQLiteDatabase = paramSQLiteDatabase1;
        localObject = paramSQLiteDatabase1;
        if (paramSQLiteDatabase1.moveToFirst())
        {
          localSQLiteDatabase = paramSQLiteDatabase1;
          localObject = paramSQLiteDatabase1;
          TMLog.i("downloadInfo", "start move data!");
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
            DownloadInfo.writeToContentValues(localContentValues, DownloadInfo.readFromSimpleCursor(paramSQLiteDatabase1));
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            paramSQLiteDatabase2.insert("downloadInfo", null, localContentValues);
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
      AppMethodBeat.o(76202);
      return;
    }
    catch (Exception paramSQLiteDatabase1)
    {
      while (true)
      {
        localObject = localSQLiteDatabase;
        ab.printErrStackTrace("DownloadInfoTable", paramSQLiteDatabase1, "", new Object[0]);
        localObject = localSQLiteDatabase;
        TMLog.i("downloadInfo", "move data exception!");
        if (localSQLiteDatabase != null)
          localSQLiteDatabase.close();
      }
    }
    finally
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(76202);
    }
    throw paramSQLiteDatabase1;
  }

  public String[] getAlterSQL(int paramInt1, int paramInt2)
  {
    String[] arrayOfString;
    if ((paramInt1 == 1) && (paramInt2 == 2))
    {
      arrayOfString = new String[1];
      arrayOfString[0] = "alter table downloadInfo add column headerParams TEXT;";
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = new String[3];
      arrayOfString[0] = "alter table downloadInfo add column netType TEXT;";
      arrayOfString[1] = "alter table downloadInfo add column downloadFailedErrCode INTEGER;";
      arrayOfString[2] = "alter table downloadInfo add column downloadFailedTime INTEGER;";
    }
  }

  public SqliteHelper getHelper()
  {
    AppMethodBeat.i(76194);
    SqliteHelper localSqliteHelper = AstSDKDBHelper_V2.getInstance();
    AppMethodBeat.o(76194);
    return localSqliteHelper;
  }

  public String tableName()
  {
    return "downloadInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.DownloadInfoTable
 * JD-Core Version:    0.6.2
 */