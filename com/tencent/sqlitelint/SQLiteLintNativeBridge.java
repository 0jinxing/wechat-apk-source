package com.tencent.sqlitelint;

import android.database.Cursor;
import android.database.SQLException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.util.SLog;
import java.util.ArrayList;

public class SQLiteLintNativeBridge
{
  private static final String TAG = "SQLiteLint.SQLiteLintNativeBridge";

  private void doExecSqlCallback(long paramLong1, long paramLong2, String paramString, Cursor paramCursor)
  {
    AppMethodBeat.i(94022);
    if (paramCursor == null)
    {
      SLog.w("SQLiteLint.SQLiteLintNativeBridge", "doExecSqlCallback cu is null", new Object[0]);
      AppMethodBeat.o(94022);
    }
    while (true)
    {
      return;
      int i;
      String[] arrayOfString1;
      String[] arrayOfString2;
      int j;
      do
      {
        execSqlCallback(paramLong1, paramLong2, paramString, i, arrayOfString1, arrayOfString2);
        if (!paramCursor.moveToNext())
          break;
        i = paramCursor.getColumnCount();
        arrayOfString2 = new String[i];
        arrayOfString1 = new String[i];
        j = 0;
      }
      while (j >= i);
      arrayOfString2[j] = paramCursor.getColumnName(j);
      switch (paramCursor.getType(j))
      {
      default:
        arrayOfString1[j] = "";
      case 4:
      case 1:
      case 3:
      case 2:
      }
      while (true)
      {
        j++;
        break;
        arrayOfString1[j] = String.valueOf(paramCursor.getBlob(j));
        continue;
        arrayOfString1[j] = String.valueOf(paramCursor.getLong(j));
        continue;
        arrayOfString1[j] = String.valueOf(paramCursor.getString(j));
        continue;
        arrayOfString1[j] = String.valueOf(paramCursor.getFloat(j));
      }
      AppMethodBeat.o(94022);
    }
  }

  private native void execSqlCallback(long paramLong1, long paramLong2, String paramString, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2);

  public static void loadLibrary()
  {
    AppMethodBeat.i(94019);
    System.loadLibrary("SqliteLint-lib");
    SLog.nativeSetLogger(2);
    AppMethodBeat.o(94019);
  }

  public static native void nativeAddToWhiteList(String paramString, String[] paramArrayOfString, String[][] paramArrayOfString1);

  public static native void nativeEnableCheckers(String paramString, String[] paramArrayOfString);

  static native void nativeInstall(String paramString);

  static native void nativeNotifySqlExecute(String paramString1, String paramString2, long paramLong, String paramString3);

  static native void nativeUninstall(String paramString);

  private static void onPublishIssue(String paramString, ArrayList<SQLiteLintIssue> paramArrayList)
  {
    AppMethodBeat.i(94020);
    try
    {
      SQLiteLintAndroidCoreManager.INSTANCE.get(paramString).onPublish(paramArrayList);
      AppMethodBeat.o(94020);
      return;
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        SLog.e("SQLiteLint.SQLiteLintNativeBridge", "onPublishIssue ex ", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(94020);
      }
    }
  }

  private String[] sqliteLintExecSql(String paramString1, String paramString2, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(94021);
    String[] arrayOfString = new String[2];
    try
    {
      SLog.i("SQLiteLint.SQLiteLintNativeBridge", "dbPath %s, sql is %s ,needCallBack: %b", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
      arrayOfString[0] = "";
      arrayOfString[1] = "-1";
      localISQLiteExecutionDelegate = null;
      SQLiteLintAndroidCore localSQLiteLintAndroidCore = SQLiteLintAndroidCoreManager.INSTANCE.get(paramString1);
      if (localSQLiteLintAndroidCore != null)
        localISQLiteExecutionDelegate = localSQLiteLintAndroidCore.getSQLiteExecutionDelegate();
      if (localISQLiteExecutionDelegate == null)
      {
        SLog.w("SQLiteLint.SQLiteLintNativeBridge", "sqliteLintExecSql mExecSqlImp is null", new Object[0]);
        AppMethodBeat.o(94021);
      }
      while (true)
      {
        return arrayOfString;
        if (paramBoolean)
          try
          {
            paramString2 = localISQLiteExecutionDelegate.rawQuery(paramString2, new String[0]);
            if ((paramString2 == null) || (paramString2.getCount() < 0))
            {
              SLog.w("SQLiteLint.SQLiteLintNativeBridge", "sqliteLintExecSql cu is null", new Object[0]);
              arrayOfString[0] = "Cursor is null";
            }
            while (true)
            {
              if (paramString2 != null)
                paramString2.close();
              AppMethodBeat.o(94021);
              break;
              doExecSqlCallback(paramLong1, paramLong2, paramString1, paramString2);
              arrayOfString[1] = "0";
            }
          }
          catch (Exception paramString1)
          {
            while (true)
            {
              SLog.w("SQLiteLint.SQLiteLintNativeBridge", "sqliteLintExecSql rawQuery exp: %s", new Object[] { paramString1.getMessage() });
              arrayOfString[0] = paramString1.getMessage();
            }
          }
      }
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        ISQLiteExecutionDelegate localISQLiteExecutionDelegate;
        SLog.e("SQLiteLint.SQLiteLintNativeBridge", "sqliteLintExecSql ex ", new Object[] { paramString1.getMessage() });
        continue;
        try
        {
          localISQLiteExecutionDelegate.execSQL(paramString2);
          arrayOfString[1] = "0";
        }
        catch (SQLException paramString1)
        {
          SLog.w("SQLiteLint.SQLiteLintNativeBridge", "sqliteLintExecSql execSQL exp: %s", new Object[] { paramString1.getMessage() });
          arrayOfString[0] = paramString1.getMessage();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.SQLiteLintNativeBridge
 * JD-Core Version:    0.6.2
 */