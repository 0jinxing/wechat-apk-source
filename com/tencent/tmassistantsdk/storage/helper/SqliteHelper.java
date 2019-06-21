package com.tencent.tmassistantsdk.storage.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.storage.table.ITableBase;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;

public abstract class SqliteHelper extends SQLiteOpenHelper
{
  private static final String TAG = "MicroMsg.SqliteHelper";

  public SqliteHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }

  private void createTable(SQLiteDatabase paramSQLiteDatabase)
  {
    TMLog.i("sqliteHelper", "tables count:" + getTables().length);
    Class[] arrayOfClass = getTables();
    int i = arrayOfClass.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Object localObject = arrayOfClass[j];
        try
        {
          localObject = (ITableBase)((Class)localObject).newInstance();
          String str = ((ITableBase)localObject).createTableSQL();
          if ((str != null) && (str.length() > 0))
            paramSQLiteDatabase.execSQL(str);
          TMLog.i("sqliteHelper", "sql=".concat(String.valueOf(str)));
          if (GlobalUtil.isDBExist("tmassistant_sdk.db"))
          {
            TMLog.i("sqliteHelper", "dataMovement");
            ((ITableBase)localObject).dataMovement(AstSDKDBHelper.getInstance().getReadableDatabase(), paramSQLiteDatabase);
          }
          j++;
        }
        catch (InstantiationException localInstantiationException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SqliteHelper", localInstantiationException, "", new Object[0]);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SqliteHelper", localIllegalAccessException, "", new Object[0]);
        }
      }
    GlobalUtil.deleteOldDB("tmassistant_sdk.db");
  }

  private void deleteTable(SQLiteDatabase paramSQLiteDatabase)
  {
    Class[] arrayOfClass = getTables();
    int i = arrayOfClass.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Class localClass = arrayOfClass[j];
        try
        {
          paramSQLiteDatabase.delete(((ITableBase)localClass.newInstance()).tableName(), null, null);
          j++;
        }
        catch (InstantiationException localInstantiationException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SqliteHelper", localInstantiationException, "", new Object[0]);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SqliteHelper", localIllegalAccessException, "", new Object[0]);
        }
      }
  }

  public abstract int getDBVersion();

  // ERROR //
  public SQLiteDatabase getReadableDatabase()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_1
    //   4: aload_0
    //   5: invokespecial 126	android/database/sqlite/SQLiteOpenHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   8: astore_2
    //   9: aload_2
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 130	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   15: ifne +10 -> 25
    //   18: aload_1
    //   19: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   22: ifeq +33 -> 55
    //   25: ldc2_w 134
    //   28: invokestatic 141	android/os/SystemClock:sleep	(J)V
    //   31: goto -20 -> 11
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    //   39: astore_2
    //   40: ldc 8
    //   42: aload_2
    //   43: ldc 103
    //   45: iconst_0
    //   46: anewarray 105	java/lang/Object
    //   49: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: goto -41 -> 11
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   4	9	34	finally
    //   11	25	34	finally
    //   25	31	34	finally
    //   40	52	34	finally
    //   4	9	39	java/lang/Exception
  }

  public abstract Class<?>[] getTables();

  // ERROR //
  public SQLiteDatabase getWritableDatabase()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_1
    //   4: aload_0
    //   5: invokespecial 144	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   8: astore_2
    //   9: aload_2
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 130	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   15: ifne +10 -> 25
    //   18: aload_1
    //   19: invokevirtual 133	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   22: ifeq +33 -> 55
    //   25: ldc2_w 134
    //   28: invokestatic 141	android/os/SystemClock:sleep	(J)V
    //   31: goto -20 -> 11
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    //   39: astore_2
    //   40: ldc 8
    //   42: aload_2
    //   43: ldc 103
    //   45: iconst_0
    //   46: anewarray 105	java/lang/Object
    //   49: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: goto -41 -> 11
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   4	9	34	finally
    //   11	25	34	finally
    //   25	31	34	finally
    //   40	52	34	finally
    //   4	9	39	java/lang/Exception
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    createTable(paramSQLiteDatabase);
  }

  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    deleteTable(paramSQLiteDatabase);
    createTable(paramSQLiteDatabase);
  }

  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    super.onOpen(paramSQLiteDatabase);
    int i = paramSQLiteDatabase.getVersion();
    TMLog.i("sqliteHelper", " dbversion:" + i + " newVersion:" + getDBVersion());
    if (i != 0)
    {
      if (i >= getDBVersion())
        break label66;
      onUpgrade(paramSQLiteDatabase, i, getDBVersion());
    }
    while (true)
    {
      return;
      label66: if (i > getDBVersion())
        onDowngrade(paramSQLiteDatabase, i, getDBVersion());
    }
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      Class[] arrayOfClass = getTables();
      int i = arrayOfClass.length;
      int j = 0;
      while (j < i)
      {
        Object localObject = arrayOfClass[j];
        try
        {
          localObject = ((ITableBase)((Class)localObject).newInstance()).getAlterSQL(paramInt1, paramInt1 + 1);
          TMLog.i("sqliteHelper", " upgrade:".concat(String.valueOf(localObject)));
          if (localObject != null)
            for (int k = 0; k < localObject.length; k++)
              paramSQLiteDatabase.execSQL(localObject[k]);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.SqliteHelper", localException, "", new Object[0]);
          j++;
        }
      }
      paramInt1++;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.helper.SqliteHelper
 * JD-Core Version:    0.6.2
 */