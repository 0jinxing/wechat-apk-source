package com.tencent.wcdb;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.support.Log;
import java.io.File;

public final class DefaultDatabaseErrorHandler
  implements DatabaseErrorHandler
{
  private static final String[] SUFFIX_TO_BACKUP = { "", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1" };
  private static final String TAG = "WCDB.DefaultDatabaseErrorHandler";
  private final boolean mNoCorruptionBackup;

  public DefaultDatabaseErrorHandler()
  {
    this.mNoCorruptionBackup = false;
  }

  public DefaultDatabaseErrorHandler(boolean paramBoolean)
  {
    this.mNoCorruptionBackup = paramBoolean;
  }

  private void deleteDatabaseFile(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(12170);
    if ((paramString.equalsIgnoreCase(":memory:")) || (paramString.trim().length() == 0))
      AppMethodBeat.o(12170);
    while (true)
    {
      return;
      Log.e("WCDB.DefaultDatabaseErrorHandler", "Remove database file: ".concat(String.valueOf(paramString)));
      Object localObject1;
      Object localObject2;
      if (!this.mNoCorruptionBackup)
      {
        localObject1 = new File(paramString);
        localObject2 = new File(((File)localObject1).getParentFile(), "corrupted");
        if (!((File)localObject2).mkdirs())
          Log.e("WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
        localObject1 = ((File)localObject2).getPath() + "/" + ((File)localObject1).getName();
        localObject2 = SUFFIX_TO_BACKUP;
        i = localObject2.length;
        while (j < i)
        {
          String str = localObject2[j];
          moveOrDeleteFile(paramString + str, (String)localObject1 + str);
          j++;
        }
        AppMethodBeat.o(12170);
      }
      else
      {
        localObject1 = SUFFIX_TO_BACKUP;
        int k = localObject1.length;
        for (j = i; j < k; j++)
        {
          localObject2 = localObject1[j];
          deleteFile(paramString + (String)localObject2);
        }
        AppMethodBeat.o(12170);
      }
    }
  }

  private static boolean deleteFile(String paramString)
  {
    AppMethodBeat.i(12172);
    boolean bool = new File(paramString).delete();
    AppMethodBeat.o(12172);
    return bool;
  }

  private static boolean moveOrDeleteFile(String paramString1, String paramString2)
  {
    AppMethodBeat.i(12171);
    paramString1 = new File(paramString1);
    boolean bool = paramString1.renameTo(new File(paramString2));
    if (!bool)
      paramString1.delete();
    AppMethodBeat.o(12171);
    return bool;
  }

  // ERROR //
  public final void onCorruption(com.tencent.wcdb.database.SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: sipush 12169
    //   3: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 12
    //   8: new 103	java/lang/StringBuilder
    //   11: dup
    //   12: ldc 139
    //   14: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: invokevirtual 143	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   21: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokestatic 82	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual 146	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   34: ifne +18 -> 52
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual 143	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   42: invokespecial 148	com/tencent/wcdb/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   45: sipush 12169
    //   48: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   51: return
    //   52: aconst_null
    //   53: astore_2
    //   54: aload_1
    //   55: invokevirtual 152	com/tencent/wcdb/database/SQLiteDatabase:getAttachedDbs	()Ljava/util/List;
    //   58: astore_3
    //   59: aload_3
    //   60: astore_2
    //   61: aload_1
    //   62: invokevirtual 156	com/tencent/wcdb/database/SQLiteDatabase:getTraceCallback	()Lcom/tencent/wcdb/database/SQLiteTrace;
    //   65: astore_3
    //   66: aload_3
    //   67: ifnull +10 -> 77
    //   70: aload_3
    //   71: aload_1
    //   72: invokeinterface 161 2 0
    //   77: aload_1
    //   78: invokevirtual 164	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   81: aload_2
    //   82: ifnull +50 -> 132
    //   85: aload_2
    //   86: invokeinterface 170 1 0
    //   91: astore_1
    //   92: aload_1
    //   93: invokeinterface 175 1 0
    //   98: ifeq +25 -> 123
    //   101: aload_0
    //   102: aload_1
    //   103: invokeinterface 179 1 0
    //   108: checkcast 181	android/util/Pair
    //   111: getfield 185	android/util/Pair:second	Ljava/lang/Object;
    //   114: checkcast 18	java/lang/String
    //   117: invokespecial 148	com/tencent/wcdb/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   120: goto -28 -> 92
    //   123: sipush 12169
    //   126: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: goto -78 -> 51
    //   132: aload_0
    //   133: aload_1
    //   134: invokevirtual 143	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   137: invokespecial 148	com/tencent/wcdb/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   140: sipush 12169
    //   143: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: goto -95 -> 51
    //   149: astore_3
    //   150: aload_2
    //   151: ifnull +50 -> 201
    //   154: aload_2
    //   155: invokeinterface 170 1 0
    //   160: astore_1
    //   161: aload_1
    //   162: invokeinterface 175 1 0
    //   167: ifeq +25 -> 192
    //   170: aload_0
    //   171: aload_1
    //   172: invokeinterface 179 1 0
    //   177: checkcast 181	android/util/Pair
    //   180: getfield 185	android/util/Pair:second	Ljava/lang/Object;
    //   183: checkcast 18	java/lang/String
    //   186: invokespecial 148	com/tencent/wcdb/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   189: goto -28 -> 161
    //   192: sipush 12169
    //   195: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   198: goto -147 -> 51
    //   201: aload_0
    //   202: aload_1
    //   203: invokevirtual 143	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   206: invokespecial 148	com/tencent/wcdb/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   209: sipush 12169
    //   212: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -164 -> 51
    //   218: astore_3
    //   219: aload_2
    //   220: ifnull +41 -> 261
    //   223: aload_2
    //   224: invokeinterface 170 1 0
    //   229: astore_1
    //   230: aload_1
    //   231: invokeinterface 175 1 0
    //   236: ifeq +33 -> 269
    //   239: aload_0
    //   240: aload_1
    //   241: invokeinterface 179 1 0
    //   246: checkcast 181	android/util/Pair
    //   249: getfield 185	android/util/Pair:second	Ljava/lang/Object;
    //   252: checkcast 18	java/lang/String
    //   255: invokespecial 148	com/tencent/wcdb/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   258: goto -28 -> 230
    //   261: aload_0
    //   262: aload_1
    //   263: invokevirtual 143	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   266: invokespecial 148	com/tencent/wcdb/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   269: sipush 12169
    //   272: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: aload_3
    //   276: athrow
    //   277: astore_3
    //   278: goto -217 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   77	81	149	com/tencent/wcdb/database/SQLiteException
    //   77	81	218	finally
    //   54	59	277	com/tencent/wcdb/database/SQLiteException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.DefaultDatabaseErrorHandler
 * JD-Core Version:    0.6.2
 */