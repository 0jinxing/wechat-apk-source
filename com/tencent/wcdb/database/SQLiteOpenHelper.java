package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.support.Log;

public abstract class SQLiteOpenHelper
{
  private static final boolean DEBUG_STRICT_READONLY = false;
  private static final String TAG = "WCDB.SQLiteOpenHelper";
  private SQLiteCipherSpec mCipher;
  private final Context mContext;
  private SQLiteDatabase mDatabase;
  private boolean mEnableWriteAheadLogging;
  private final DatabaseErrorHandler mErrorHandler;
  private final SQLiteDatabase.CursorFactory mFactory;
  private boolean mForcedSingleConnection;
  private boolean mIsInitializing;
  private int mMode;
  private final String mName;
  private boolean mNeedMode;
  private final int mNewVersion;
  private byte[] mPassword;

  static
  {
    SQLiteGlobal.loadLib();
  }

  public SQLiteOpenHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    this(paramContext, paramString, paramCursorFactory, paramInt, null);
  }

  public SQLiteOpenHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString, null, null, paramCursorFactory, paramInt, paramDatabaseErrorHandler);
  }

  public SQLiteOpenHelper(Context paramContext, String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("Version must be >= 1, was ".concat(String.valueOf(paramInt)));
    this.mContext = paramContext;
    this.mName = paramString;
    this.mFactory = paramCursorFactory;
    this.mNewVersion = paramInt;
    this.mErrorHandler = paramDatabaseErrorHandler;
    this.mPassword = paramArrayOfByte;
    if (paramSQLiteCipherSpec == null);
    for (paramContext = null; ; paramContext = new SQLiteCipherSpec(paramSQLiteCipherSpec))
    {
      this.mCipher = paramContext;
      this.mNeedMode = false;
      return;
    }
  }

  public SQLiteOpenHelper(Context paramContext, String paramString, byte[] paramArrayOfByte, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString, paramArrayOfByte, null, paramCursorFactory, paramInt, paramDatabaseErrorHandler);
  }

  // ERROR //
  private SQLiteDatabase getDatabaseLocked(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   6: ifnull +18 -> 24
    //   9: aload_0
    //   10: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   13: invokevirtual 100	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   16: ifne +25 -> 41
    //   19: aload_0
    //   20: aconst_null
    //   21: putfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   24: aload_0
    //   25: getfield 102	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   28: ifeq +34 -> 62
    //   31: new 104	java/lang/IllegalStateException
    //   34: dup
    //   35: ldc 106
    //   37: invokespecial 107	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   40: athrow
    //   41: iload_1
    //   42: ifeq +13 -> 55
    //   45: aload_0
    //   46: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   49: invokevirtual 110	com/tencent/wcdb/database/SQLiteDatabase:isReadOnly	()Z
    //   52: ifne -28 -> 24
    //   55: aload_0
    //   56: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   59: astore_3
    //   60: aload_3
    //   61: areturn
    //   62: aload_0
    //   63: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   66: astore 4
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield 102	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   73: aload 4
    //   75: ifnull +64 -> 139
    //   78: iload_1
    //   79: ifeq +282 -> 361
    //   82: aload 4
    //   84: invokevirtual 110	com/tencent/wcdb/database/SQLiteDatabase:isReadOnly	()Z
    //   87: ifeq +274 -> 361
    //   90: aload 4
    //   92: invokevirtual 113	com/tencent/wcdb/database/SQLiteDatabase:reopenReadWrite	()V
    //   95: aload_0
    //   96: aload 4
    //   98: invokespecial 117	com/tencent/wcdb/database/SQLiteOpenHelper:getDatabaseLockedLast	(Lcom/tencent/wcdb/database/SQLiteDatabase;)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   101: astore 5
    //   103: aload_0
    //   104: iconst_0
    //   105: putfield 102	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   108: aload 5
    //   110: astore_3
    //   111: aload 4
    //   113: ifnull -53 -> 60
    //   116: aload 5
    //   118: astore_3
    //   119: aload 4
    //   121: aload_0
    //   122: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   125: if_acmpeq -65 -> 60
    //   128: aload 4
    //   130: invokevirtual 120	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   133: aload 5
    //   135: astore_3
    //   136: goto -76 -> 60
    //   139: aload_0
    //   140: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   143: ifnonnull +14 -> 157
    //   146: aconst_null
    //   147: invokestatic 124	com/tencent/wcdb/database/SQLiteDatabase:create	(Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   150: astore_3
    //   151: aload_3
    //   152: astore 4
    //   154: goto -59 -> 95
    //   157: aload_0
    //   158: getfield 126	com/tencent/wcdb/database/SQLiteOpenHelper:mForcedSingleConnection	Z
    //   161: istore 6
    //   163: iload 6
    //   165: ifeq +64 -> 229
    //   168: aload_0
    //   169: iconst_1
    //   170: putfield 82	com/tencent/wcdb/database/SQLiteOpenHelper:mNeedMode	Z
    //   173: aload_0
    //   174: getfield 128	com/tencent/wcdb/database/SQLiteOpenHelper:mEnableWriteAheadLogging	Z
    //   177: ifeq +57 -> 234
    //   180: bipush 8
    //   182: istore 7
    //   184: aload_0
    //   185: iload 7
    //   187: putfield 130	com/tencent/wcdb/database/SQLiteOpenHelper:mMode	I
    //   190: aload_0
    //   191: getfield 68	com/tencent/wcdb/database/SQLiteOpenHelper:mContext	Landroid/content/Context;
    //   194: aload_0
    //   195: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   198: aload_0
    //   199: getfield 78	com/tencent/wcdb/database/SQLiteOpenHelper:mPassword	[B
    //   202: aload_0
    //   203: getfield 80	com/tencent/wcdb/database/SQLiteOpenHelper:mCipher	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   206: aload_0
    //   207: getfield 130	com/tencent/wcdb/database/SQLiteOpenHelper:mMode	I
    //   210: aload_0
    //   211: getfield 72	com/tencent/wcdb/database/SQLiteOpenHelper:mFactory	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   214: aload_0
    //   215: getfield 76	com/tencent/wcdb/database/SQLiteOpenHelper:mErrorHandler	Lcom/tencent/wcdb/DatabaseErrorHandler;
    //   218: iload_2
    //   219: invokestatic 136	com/tencent/wcdb/support/Context:openOrCreateDatabase	(Landroid/content/Context;Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;ILcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;Lcom/tencent/wcdb/DatabaseErrorHandler;I)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   222: astore_3
    //   223: aload_3
    //   224: astore 4
    //   226: goto -131 -> 95
    //   229: iconst_0
    //   230: istore_2
    //   231: goto -63 -> 168
    //   234: iconst_0
    //   235: istore 7
    //   237: goto -53 -> 184
    //   240: astore_3
    //   241: iload_1
    //   242: ifeq +32 -> 274
    //   245: aload_3
    //   246: athrow
    //   247: astore_3
    //   248: aload_0
    //   249: iconst_0
    //   250: putfield 102	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   253: aload 4
    //   255: ifnull +17 -> 272
    //   258: aload 4
    //   260: aload_0
    //   261: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   264: if_acmpeq +8 -> 272
    //   267: aload 4
    //   269: invokevirtual 120	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   272: aload_3
    //   273: athrow
    //   274: new 138	java/lang/StringBuilder
    //   277: astore 5
    //   279: aload 5
    //   281: ldc 140
    //   283: invokespecial 141	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   286: ldc 11
    //   288: aload 5
    //   290: aload_0
    //   291: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   294: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: ldc 147
    //   299: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   305: iconst_1
    //   306: anewarray 4	java/lang/Object
    //   309: dup
    //   310: iconst_0
    //   311: aload_3
    //   312: aastore
    //   313: invokestatic 157	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: aload_0
    //   317: getfield 68	com/tencent/wcdb/database/SQLiteOpenHelper:mContext	Landroid/content/Context;
    //   320: aload_0
    //   321: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   324: invokevirtual 163	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   327: invokevirtual 168	java/io/File:getPath	()Ljava/lang/String;
    //   330: aload_0
    //   331: getfield 78	com/tencent/wcdb/database/SQLiteOpenHelper:mPassword	[B
    //   334: aload_0
    //   335: getfield 80	com/tencent/wcdb/database/SQLiteOpenHelper:mCipher	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   338: aload_0
    //   339: getfield 72	com/tencent/wcdb/database/SQLiteOpenHelper:mFactory	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   342: iconst_1
    //   343: aload_0
    //   344: getfield 76	com/tencent/wcdb/database/SQLiteOpenHelper:mErrorHandler	Lcom/tencent/wcdb/DatabaseErrorHandler;
    //   347: invokestatic 172	com/tencent/wcdb/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;ILcom/tencent/wcdb/DatabaseErrorHandler;)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   350: astore_3
    //   351: aload_3
    //   352: astore 4
    //   354: goto -259 -> 95
    //   357: astore_3
    //   358: goto -110 -> 248
    //   361: goto -266 -> 95
    //
    // Exception table:
    //   from	to	target	type
    //   168	180	240	com/tencent/wcdb/database/SQLiteException
    //   184	223	240	com/tencent/wcdb/database/SQLiteException
    //   68	73	247	finally
    //   82	95	247	finally
    //   139	151	247	finally
    //   157	163	247	finally
    //   168	180	247	finally
    //   184	223	247	finally
    //   245	247	247	finally
    //   274	351	247	finally
    //   95	103	357	finally
  }

  private SQLiteDatabase getDatabaseLockedLast(SQLiteDatabase paramSQLiteDatabase)
  {
    onConfigure(paramSQLiteDatabase);
    int i = paramSQLiteDatabase.getVersion();
    if (i != this.mNewVersion)
    {
      if (paramSQLiteDatabase.isReadOnly())
        throw new SQLiteException("Can't upgrade read-only database from version " + paramSQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
      paramSQLiteDatabase.beginTransaction();
      if (i != 0)
        break label153;
    }
    while (true)
    {
      try
      {
        onCreate(paramSQLiteDatabase);
        paramSQLiteDatabase.setVersion(this.mNewVersion);
        paramSQLiteDatabase.setTransactionSuccessful();
        paramSQLiteDatabase.endTransaction();
        onOpen(paramSQLiteDatabase);
        if (paramSQLiteDatabase.isReadOnly())
          Log.w("WCDB.SQLiteOpenHelper", "Opened " + this.mName + " in read-only mode");
        this.mDatabase = paramSQLiteDatabase;
        return paramSQLiteDatabase;
        label153: if (i > this.mNewVersion)
        {
          onDowngrade(paramSQLiteDatabase, i, this.mNewVersion);
          continue;
        }
      }
      finally
      {
        paramSQLiteDatabase.endTransaction();
      }
      onUpgrade(paramSQLiteDatabase, i, this.mNewVersion);
    }
  }

  public void close()
  {
    try
    {
      if (this.mIsInitializing)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Closed during initialization");
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
  }

  public String getDatabaseName()
  {
    return this.mName;
  }

  public SQLiteDatabase getReadableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getDatabaseLocked(false);
      return localSQLiteDatabase;
    }
    finally
    {
    }
  }

  public SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getDatabaseLocked(true);
      return localSQLiteDatabase;
    }
    finally
    {
    }
  }

  public void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public abstract void onCreate(SQLiteDatabase paramSQLiteDatabase);

  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    throw new SQLiteException("Can't downgrade database from version " + paramInt1 + " to " + paramInt2);
  }

  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public abstract void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);

  public void setForcedSingleConnection(boolean paramBoolean)
  {
    try
    {
      this.mForcedSingleConnection = paramBoolean;
      return;
    }
    finally
    {
    }
  }

  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    try
    {
      if (this.mEnableWriteAheadLogging != paramBoolean)
        if ((this.mDatabase != null) && (this.mDatabase.isOpen()) && (!this.mDatabase.isReadOnly()))
        {
          if (!paramBoolean)
            break label57;
          this.mDatabase.enableWriteAheadLogging();
        }
      while (true)
      {
        this.mEnableWriteAheadLogging = paramBoolean;
        return;
        label57: this.mDatabase.disableWriteAheadLogging();
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteOpenHelper
 * JD-Core Version:    0.6.2
 */