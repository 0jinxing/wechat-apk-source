package com.tencent.sqlitelint.behaviour.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.io.File;

public enum SQLiteLintOwnDatabase
{
  private static final String DATABASE_DIRECTORY = "database";
  private static final String DATABASE_NAME = "own.db";
  private static final int NEW_VERSION = 1;
  private static final String ROOT_PATH;
  private static final String TAG = "SQLiteLint.SQLiteLintOwnDatabase";
  private static final int VERSION_1 = 1;
  private static String sOwnDbDirectory;
  private volatile SQLiteDatabase mDatabase;
  private boolean mIsInitializing;

  static
  {
    AppMethodBeat.i(94093);
    INSTANCE = new SQLiteLintOwnDatabase("INSTANCE", 0);
    $VALUES = new SQLiteLintOwnDatabase[] { INSTANCE };
    ROOT_PATH = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    sOwnDbDirectory = "";
    AppMethodBeat.o(94093);
  }

  private void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    AppMethodBeat.i(94089);
    SLog.i("SQLiteLint.SQLiteLintOwnDatabase", "onCreate", new Object[0]);
    paramSQLiteDatabase.execSQL(IssueStorage.DB_VERSION_1_CREATE_SQL);
    while (i < IssueStorage.DB_VERSION_1_CREATE_INDEX.length)
    {
      paramSQLiteDatabase.execSQL(IssueStorage.DB_VERSION_1_CREATE_INDEX[i]);
      i++;
    }
    AppMethodBeat.o(94089);
  }

  private void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    AppMethodBeat.i(94090);
    SLog.i("SQLiteLint.SQLiteLintOwnDatabase", "onUpgrade oldVersion=%d, newVersion=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1) });
    AppMethodBeat.o(94090);
  }

  private SQLiteDatabase openOrCreateDatabase()
  {
    AppMethodBeat.i(94091);
    Object localObject1;
    if (this.mIsInitializing)
    {
      localObject1 = new IllegalStateException("getDatabase called recursively");
      AppMethodBeat.o(94091);
      throw ((Throwable)localObject1);
    }
    if (SQLiteLintUtil.isNullOrNil(sOwnDbDirectory))
    {
      localObject1 = new IllegalStateException("OwnDbDirectory not init");
      AppMethodBeat.o(94091);
      throw ((Throwable)localObject1);
    }
    try
    {
      this.mIsInitializing = true;
      localObject1 = String.format("%s/%s", new Object[] { sOwnDbDirectory, "own.db" });
      SLog.i("SQLiteLint.SQLiteLintOwnDatabase", "openOrCreateDatabase path=%s", new Object[] { localObject1 });
      SQLiteLintUtil.mkdirs((String)localObject1);
      SQLiteDatabase localSQLiteDatabase = SQLiteDatabase.openDatabase((String)localObject1, null, 268435456, null);
      int i = localSQLiteDatabase.getVersion();
      if (i != 1)
      {
        localSQLiteDatabase.beginTransaction();
        if (i != 0)
          break label157;
      }
      try
      {
        onCreate(localSQLiteDatabase);
        while (true)
        {
          localSQLiteDatabase.setVersion(1);
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          return localSQLiteDatabase;
          label157: if (i != 1)
            onUpgrade(localSQLiteDatabase, i);
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        AppMethodBeat.o(94091);
      }
    }
    finally
    {
      this.mIsInitializing = false;
      AppMethodBeat.o(94091);
    }
  }

  public static void setOwnDbDirectory(Context paramContext)
  {
    AppMethodBeat.i(94092);
    if (!SQLiteLintUtil.isNullOrNil(sOwnDbDirectory))
      AppMethodBeat.o(94092);
    while (true)
    {
      return;
      sOwnDbDirectory = String.format("%s/SQLiteLint-%s/%s/", new Object[] { ROOT_PATH, paramContext.getPackageManager(), "database" });
      AppMethodBeat.o(94092);
    }
  }

  public final void closeDatabase()
  {
    try
    {
      AppMethodBeat.i(94088);
      if (this.mIsInitializing)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Closed during initialization");
        AppMethodBeat.o(94088);
        throw localIllegalStateException;
      }
    }
    finally
    {
    }
    if ((this.mDatabase != null) && (this.mDatabase.isOpen()))
    {
      this.mDatabase.close();
      this.mDatabase = null;
    }
    AppMethodBeat.o(94088);
  }

  public final SQLiteDatabase getDatabase()
  {
    AppMethodBeat.i(94087);
    if ((this.mDatabase == null) || (!this.mDatabase.isOpen()));
    try
    {
      if ((this.mDatabase == null) || (!this.mDatabase.isOpen()))
        this.mDatabase = openOrCreateDatabase();
      SQLiteDatabase localSQLiteDatabase = this.mDatabase;
      AppMethodBeat.o(94087);
      return localSQLiteDatabase;
    }
    finally
    {
      AppMethodBeat.o(94087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.behaviour.persistence.SQLiteLintOwnDatabase
 * JD-Core Version:    0.6.2
 */