package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import java.util.HashMap;

public class DownloadSettingTable
  implements ITableBase
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists settingInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, settingField TEXT , value TEXT,type TEXT);";
  public static final String QUERY_SQL = "select * from settingInfo";
  public static final String TABLE_NAME = "settingInfo";
  private static final String TAG = "DownloadSettingTable";

  public static HashMap<String, String> query()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(76207);
    HashMap localHashMap = new HashMap();
    try
    {
      Cursor localCursor = AstSDKDBHelper_V2.getInstance().getReadableDatabase().rawQuery("select * from settingInfo", null);
      if (localCursor != null)
      {
        localObject2 = localCursor;
        localObject1 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localCursor;
            localObject1 = localCursor;
            localHashMap.put(localCursor.getString(localCursor.getColumnIndex("settingField")), localCursor.getString(localCursor.getColumnIndex("value")));
            localObject2 = localCursor;
            localObject1 = localCursor;
            bool = localCursor.moveToNext();
          }
          while (bool);
        }
      }
      while (true)
      {
        return localHashMap;
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(76207);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.printErrStackTrace("DownloadSettingTable", localException, "", new Object[0]);
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(76207);
    }
  }

  public static void save(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(76205);
    if ((paramString1 != null) && (paramString2 != null));
    while (true)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
        if (update(paramString1, paramString2, paramString3, localSQLiteDatabase) <= 0)
        {
          ContentValues localContentValues = new android/content/ContentValues;
          localContentValues.<init>();
          localContentValues.put("settingField", paramString1);
          localContentValues.put("value", paramString2);
          localContentValues.put("type", paramString3);
          localSQLiteDatabase.insert("settingInfo", null, localContentValues);
        }
        AppMethodBeat.o(76205);
        return;
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("DownloadSettingTable", paramString1, "", new Object[0]);
      }
      AppMethodBeat.o(76205);
    }
  }

  private static int update(String paramString1, String paramString2, String paramString3, SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(76206);
    int i;
    if ((paramString1 == null) || (paramString2 == null))
    {
      i = -1;
      AppMethodBeat.o(76206);
    }
    while (true)
    {
      return i;
      try
      {
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localContentValues.put("settingField", paramString1);
        localContentValues.put("value", paramString2);
        localContentValues.put("type", paramString3);
        i = paramSQLiteDatabase.update("settingInfo", localContentValues, "settingField = ?", new String[] { paramString1 });
        if (i > 0)
        {
          AppMethodBeat.o(76206);
        }
        else
        {
          AppMethodBeat.o(76206);
          i = 0;
        }
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("DownloadSettingTable", paramString1, "", new Object[0]);
        i = -2;
        AppMethodBeat.o(76206);
      }
      finally
      {
        AppMethodBeat.o(76206);
      }
    }
    throw paramString1;
  }

  public String createTableSQL()
  {
    return "CREATE TABLE if not exists settingInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, settingField TEXT , value TEXT,type TEXT);";
  }

  public void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2)
  {
  }

  public String[] getAlterSQL(int paramInt1, int paramInt2)
  {
    return null;
  }

  public SqliteHelper getHelper()
  {
    AppMethodBeat.i(76208);
    SqliteHelper localSqliteHelper = AstSDKDBHelper_V2.getInstance();
    AppMethodBeat.o(76208);
    return localSqliteHelper;
  }

  public String tableName()
  {
    return "settingInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.table.DownloadSettingTable
 * JD-Core Version:    0.6.2
 */