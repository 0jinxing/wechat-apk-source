package com.tencent.sqlitelint.behaviour.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.SQLiteLintIssue;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.util.ArrayList;
import java.util.List;

public class IssueStorage
{
  public static final String COLUMN_ADVICE = "advice";
  public static final String COLUMN_CREATE_TIME = "createTime";
  public static final String COLUMN_DB_PATH = "dbPath";
  public static final String COLUMN_DESC = "desc";
  public static final String COLUMN_DETAIL = "detail";
  public static final String COLUMN_EXT_INFO = "extInfo";
  public static final String COLUMN_ID = "id";
  public static final String COLUMN_LEVEL = "level";
  public static final String COLUMN_SQL_TIME_COST = "sqlTimeCost";
  public static final String[] DB_VERSION_1_CREATE_INDEX;
  public static final String DB_VERSION_1_CREATE_SQL;
  public static final String TABLE_NAME = "Issue";
  private static final String TAG = "SQLiteLint.IssueStorage";
  private static SQLiteStatement sInsertAllSqlStatement;

  static
  {
    AppMethodBeat.i(94077);
    DB_VERSION_1_CREATE_SQL = String.format("CREATE TABLE IF NOT EXISTS %s (%s TEXT PRIMARY KEY NOT NULL, %s TEXT NOT NULL, %s INTEGER, %s TEXT, %s TEXT, %s TEXT, %s INTEGER, %s TEXT, %s INTEGER)", new Object[] { "Issue", "id", "dbPath", "level", "desc", "detail", "advice", "createTime", "extInfo", "sqlTimeCost" });
    DB_VERSION_1_CREATE_INDEX = new String[] { String.format("CREATE INDEX IF NOT EXISTS %s ON %s(%s)", new Object[] { "DbLabel_Index", "Issue", "dbPath" }), String.format("CREATE INDEX IF NOT EXISTS %s ON %s(%s,%s)", new Object[] { "DbLabel_CreateTime_Index", "Issue", "dbPath", "createTime" }) };
    AppMethodBeat.o(94077);
  }

  public static void clearData()
  {
    AppMethodBeat.i(94074);
    String str = String.format("delete from %s", new Object[] { "Issue" });
    SQLiteLintDbHelper.INSTANCE.getDatabase().execSQL(str);
    AppMethodBeat.o(94074);
  }

  private static boolean doInsertIssue(SQLiteLintIssue paramSQLiteLintIssue)
  {
    boolean bool = false;
    AppMethodBeat.i(94070);
    SQLiteStatement localSQLiteStatement = getInsertAllSqlStatement();
    localSQLiteStatement.bindString(1, paramSQLiteLintIssue.id);
    localSQLiteStatement.bindString(2, paramSQLiteLintIssue.dbPath);
    localSQLiteStatement.bindLong(3, paramSQLiteLintIssue.level);
    localSQLiteStatement.bindString(4, SQLiteLintUtil.nullAsNil(paramSQLiteLintIssue.desc));
    localSQLiteStatement.bindString(5, SQLiteLintUtil.nullAsNil(paramSQLiteLintIssue.detail));
    localSQLiteStatement.bindString(6, SQLiteLintUtil.nullAsNil(paramSQLiteLintIssue.advice));
    localSQLiteStatement.bindLong(7, paramSQLiteLintIssue.createTime);
    localSQLiteStatement.bindString(8, paramSQLiteLintIssue.extInfo);
    localSQLiteStatement.bindLong(9, paramSQLiteLintIssue.sqlTimeCost);
    long l = localSQLiteStatement.executeInsert();
    SLog.d("SQLiteLint.IssueStorage", "saveIssue insert ret=%s, id=%s", new Object[] { Long.valueOf(l), paramSQLiteLintIssue.id });
    if (l == -1L)
    {
      SLog.e("SQLiteLint.IssueStorage", "addIssue failed", new Object[0]);
      AppMethodBeat.o(94070);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(94070);
      bool = true;
    }
  }

  public static List<String> getDbPathList()
  {
    AppMethodBeat.i(94072);
    ArrayList localArrayList = new ArrayList();
    Object localObject = String.format("SELECT DISTINCT(%s) FROM %s", new Object[] { "dbPath", "Issue" });
    localObject = SQLiteLintDbHelper.INSTANCE.getDatabase().rawQuery((String)localObject, null);
    try
    {
      if (((Cursor)localObject).moveToNext())
        localArrayList.add(((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("dbPath")));
    }
    finally
    {
      ((Cursor)localObject).close();
      AppMethodBeat.o(94072);
    }
    return localList;
  }

  private static SQLiteStatement getInsertAllSqlStatement()
  {
    AppMethodBeat.i(94075);
    if (sInsertAllSqlStatement == null)
      sInsertAllSqlStatement = SQLiteLintDbHelper.INSTANCE.getDatabase().compileStatement(String.format("INSERT INTO %s VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", new Object[] { "Issue" }));
    SQLiteStatement localSQLiteStatement = sInsertAllSqlStatement;
    AppMethodBeat.o(94075);
    return localSQLiteStatement;
  }

  public static List<SQLiteLintIssue> getIssueListByDb(String paramString)
  {
    AppMethodBeat.i(94071);
    ArrayList localArrayList = new ArrayList();
    if (SQLiteLintUtil.isNullOrNil(paramString))
      AppMethodBeat.o(94071);
    while (true)
    {
      return localArrayList;
      paramString = String.format("SELECT * FROM %s where %s='%s' ORDER BY %s DESC", new Object[] { "Issue", "dbPath", paramString, "createTime" });
      paramString = SQLiteLintDbHelper.INSTANCE.getDatabase().rawQuery(paramString, null);
      try
      {
        if (paramString.moveToNext())
          localArrayList.add(issueConvertFromCursor(paramString));
      }
      finally
      {
        paramString.close();
        AppMethodBeat.o(94071);
      }
    }
  }

  public static long getLastRowId()
  {
    AppMethodBeat.i(94073);
    Object localObject1 = String.format("SELECT rowid FROM %s order by rowid desc limit 1", new Object[] { "Issue" });
    localObject1 = SQLiteLintDbHelper.INSTANCE.getDatabase().rawQuery((String)localObject1, null);
    if (localObject1 != null);
    try
    {
      if (((Cursor)localObject1).getCount() > 0)
      {
        ((Cursor)localObject1).moveToFirst();
        l = ((Cursor)localObject1).getLong(0);
        return l;
      }
      ((Cursor)localObject1).close();
      long l = -1L;
      AppMethodBeat.o(94073);
    }
    finally
    {
      ((Cursor)localObject1).close();
      AppMethodBeat.o(94073);
    }
  }

  public static boolean hasIssue(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(94069);
    paramString = String.format("SELECT %s FROM %s WHERE %s='%s' limit 1", new Object[] { "id", "Issue", "id", paramString });
    paramString = SQLiteLintDbHelper.INSTANCE.getDatabase().rawQuery(paramString, null);
    try
    {
      int i = paramString.getCount();
      if (i > 0)
        return bool;
      bool = false;
    }
    finally
    {
      paramString.close();
      AppMethodBeat.o(94069);
    }
  }

  private static SQLiteLintIssue issueConvertFromCursor(Cursor paramCursor)
  {
    AppMethodBeat.i(94076);
    SQLiteLintIssue localSQLiteLintIssue = new SQLiteLintIssue();
    localSQLiteLintIssue.id = paramCursor.getString(paramCursor.getColumnIndex("id"));
    localSQLiteLintIssue.dbPath = paramCursor.getString(paramCursor.getColumnIndex("dbPath"));
    localSQLiteLintIssue.level = paramCursor.getInt(paramCursor.getColumnIndex("level"));
    localSQLiteLintIssue.desc = paramCursor.getString(paramCursor.getColumnIndex("desc"));
    localSQLiteLintIssue.detail = paramCursor.getString(paramCursor.getColumnIndex("detail"));
    localSQLiteLintIssue.advice = paramCursor.getString(paramCursor.getColumnIndex("advice"));
    localSQLiteLintIssue.createTime = paramCursor.getLong(paramCursor.getColumnIndex("createTime"));
    localSQLiteLintIssue.extInfo = paramCursor.getString(paramCursor.getColumnIndex("extInfo"));
    localSQLiteLintIssue.sqlTimeCost = paramCursor.getLong(paramCursor.getColumnIndex("sqlTimeCost"));
    AppMethodBeat.o(94076);
    return localSQLiteLintIssue;
  }

  public static boolean saveIssue(SQLiteLintIssue paramSQLiteLintIssue)
  {
    boolean bool = false;
    AppMethodBeat.i(94067);
    if (hasIssue(paramSQLiteLintIssue.id))
    {
      SLog.i("SQLiteLint.IssueStorage", "saveIssue already recorded id=%s", new Object[] { paramSQLiteLintIssue.id });
      AppMethodBeat.o(94067);
    }
    while (true)
    {
      return bool;
      bool = doInsertIssue(paramSQLiteLintIssue);
      AppMethodBeat.o(94067);
    }
  }

  public static void saveIssues(List<SQLiteLintIssue> paramList)
  {
    AppMethodBeat.i(94068);
    SQLiteLintDbHelper.INSTANCE.getDatabase().beginTransaction();
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        saveIssue((SQLiteLintIssue)paramList.get(i));
        i++;
      }
      SQLiteLintDbHelper.INSTANCE.getDatabase().setTransactionSuccessful();
      return;
    }
    finally
    {
      SQLiteLintDbHelper.INSTANCE.getDatabase().endTransaction();
      AppMethodBeat.o(94068);
    }
    throw paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.behaviour.persistence.IssueStorage
 * JD-Core Version:    0.6.2
 */