package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteStatement;
import java.io.File;

public final class d
  implements h
{
  public boolean mBc;
  public SQLiteDatabase mBd;
  private SQLiteStatement mBe;
  private SQLiteStatement mBf;
  private SQLiteStatement mBg;

  public d(String paramString)
  {
    AppMethodBeat.i(136546);
    ab.i("MicroMsg.FTS.FTSIndexDB", "Create SearchStorage: %s", new Object[] { paramString + "FTS5IndexMicroMsg_encrypt.db" });
    if (this.mBd != null)
    {
      ab.w("MicroMsg.FTS.FTSIndexDB", "before initDB, pre DB is not close, why?");
      this.mBd.close();
    }
    paramString = new File(paramString, "FTS5IndexMicroMsg_encrypt.db").getAbsolutePath();
    long l1 = System.currentTimeMillis();
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    this.mBd = SQLiteDatabase.openOrCreateDatabase(paramString, com.tencent.mm.a.g.x((com.tencent.mm.kernel.a.QG() + q.LK() + r.Yz()).getBytes()).substring(0, 7).getBytes(), null, null);
    localObject = q.LK();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    long l2 = com.tencent.mm.kernel.a.QF();
    localObject = com.tencent.mm.a.g.y(((String)localObject + l2).getBytes());
    SQLiteDatabase localSQLiteDatabase = this.mBd;
    l2 = localSQLiteDatabase.acquireNativeConnectionHandle("initFTS", false, false);
    this.mBc = false;
    if (!this.mBc)
      com.tencent.mm.plugin.report.e.pXa.a(146L, 21L, 1L, false);
    bAd();
    FTSJNIUtils.nativeInitFts(l2, (byte[])localObject);
    localSQLiteDatabase.releaseNativeConnection(l2, null);
    this.mBd.rawQuery("PRAGMA journal_mode=WAL;", null).close();
    this.mBd.execSQL("PRAGMA synchronous=NORMAL;");
    this.mBd.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", new Object[] { "FTS5IndexVersion" }));
    this.mBe = this.mBd.compileStatement(String.format("SELECT version FROM %s WHERE type=?;", new Object[] { "FTS5IndexVersion" }));
    this.mBf = this.mBd.compileStatement(String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", new Object[] { "FTS5IndexVersion" }));
    this.mBg = this.mBd.compileStatement(String.format("DELETE FROM %s WHERE type=?", new Object[] { "FTS5IndexVersion" }));
    l2 = System.currentTimeMillis();
    com.tencent.mm.plugin.fts.a.e.K(18, l2 - l1);
    ab.i("MicroMsg.FTS.FTSIndexDB", "initDB index params %d %s %s supportICU %b", new Object[] { Long.valueOf(l2 - l1), bo.b(paramString.length(), 2.0D), q.LK(), Boolean.valueOf(this.mBc) });
    AppMethodBeat.o(136546);
  }

  protected static final void bAb()
  {
    AppMethodBeat.i(136561);
    com.tencent.mm.kernel.g.RQ();
    new File(com.tencent.mm.kernel.g.RP().cachePath, "FTS5IndexMicroMsg_encrypt.db").delete();
    AppMethodBeat.o(136561);
  }

  public static final File bAc()
  {
    AppMethodBeat.i(136562);
    com.tencent.mm.kernel.g.RQ();
    File localFile = new File(com.tencent.mm.kernel.g.RP().cachePath, "FTS5IndexMicroMsg_encrypt.db");
    AppMethodBeat.o(136562);
    return localFile;
  }

  private static void bAd()
  {
    AppMethodBeat.i(136563);
    File[] arrayOfFile = new File("/system/usr/icu").listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        ab.i("MicroMsg.FTS.FTSIndexDB", "icu file %s", new Object[] { arrayOfFile[j].getName() });
    }
    AppMethodBeat.o(136563);
  }

  public final long J(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(136551);
    this.mBe.bindLong(1, paramLong1);
    try
    {
      paramLong1 = this.mBe.simpleQueryForLong();
      AppMethodBeat.o(136551);
      return paramLong1;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      while (true)
      {
        AppMethodBeat.o(136551);
        paramLong1 = paramLong2;
      }
    }
  }

  public final void K(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(136552);
    this.mBf.bindLong(1, paramLong1);
    this.mBf.bindLong(2, paramLong2);
    this.mBf.execute();
    AppMethodBeat.o(136552);
  }

  public final Cursor MS(String paramString)
  {
    AppMethodBeat.i(136548);
    ab.v("MicroMsg.FTS.FTSIndexDB", "rawQuery: execute sql = %s", new Object[] { paramString });
    paramString = new a(this.mBd.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, paramString, null, null, null));
    AppMethodBeat.o(136548);
    return paramString;
  }

  public final boolean MT(String paramString)
  {
    AppMethodBeat.i(136553);
    paramString = this.mBd.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new String[] { paramString });
    boolean bool = paramString.moveToNext();
    paramString.close();
    AppMethodBeat.o(136553);
    return bool;
  }

  public final void beginTransaction()
  {
    try
    {
      AppMethodBeat.i(136557);
      if ((this.mBd == null) || (this.mBd.inTransaction()))
        AppMethodBeat.o(136557);
      while (true)
      {
        return;
        this.mBd.beginTransaction();
        AppMethodBeat.o(136557);
      }
    }
    finally
    {
    }
  }

  public final void close()
  {
    AppMethodBeat.i(136556);
    SQLiteDatabase localSQLiteDatabase = this.mBd;
    if (this.mBd == null);
    for (boolean bool = false; ; bool = this.mBd.isOpen())
    {
      ab.w("MicroMsg.FTS.FTSIndexDB", "close db:%s isOpen:%b ", new Object[] { localSQLiteDatabase, Boolean.valueOf(bool) });
      if ((this.mBd == null) || (!this.mBd.isOpen()))
        break label142;
      ab.w("MicroMsg.FTS.FTSIndexDB", "close in trans :%b ", new Object[] { Boolean.valueOf(this.mBd.inTransaction()) });
      while (this.mBd.inTransaction())
        this.mBd.endTransaction();
    }
    this.mBe.close();
    this.mBf.close();
    this.mBd.close();
    this.mBd = null;
    label142: AppMethodBeat.o(136556);
  }

  public final void commit()
  {
    try
    {
      AppMethodBeat.i(136559);
      if ((this.mBd == null) || (!this.mBd.inTransaction()))
        AppMethodBeat.o(136559);
      while (true)
      {
        return;
        this.mBd.setTransactionSuccessful();
        this.mBd.endTransaction();
        AppMethodBeat.o(136559);
      }
    }
    finally
    {
    }
  }

  public final SQLiteStatement compileStatement(String paramString)
  {
    AppMethodBeat.i(136549);
    ab.v("MicroMsg.FTS.FTSIndexDB", "compileStatement sql = %s", new Object[] { paramString });
    paramString = this.mBd.compileStatement(paramString);
    AppMethodBeat.o(136549);
    return paramString;
  }

  public final boolean ei(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(136550);
    if ((MT("FTS5IndexVersion")) && (this.mBe != null));
    for (paramInt1 = (int)J(paramInt1, 0L); ; paramInt1 = 0)
    {
      ab.i("MicroMsg.FTS.FTSIndexDB", "dbVersion=%d | targetVersion=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt1 == paramInt2)
      {
        AppMethodBeat.o(136550);
        bool = true;
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(136550);
      }
    }
  }

  public final void execSQL(String paramString)
  {
    AppMethodBeat.i(136554);
    ab.d("MicroMsg.FTS.FTSIndexDB", "execSQL: execute sql = %s", new Object[] { paramString });
    this.mBd.execSQL(paramString);
    AppMethodBeat.o(136554);
  }

  public final void execSQL(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(136555);
    ab.d("MicroMsg.FTS.FTSIndexDB", "execSQL: execute sql = %s", new Object[] { paramString });
    this.mBd.execSQL(paramString, paramArrayOfObject);
    AppMethodBeat.o(136555);
  }

  public final boolean inTransaction()
  {
    AppMethodBeat.i(136558);
    boolean bool;
    if ((this.mBd == null) || (!this.mBd.inTransaction()))
    {
      bool = false;
      AppMethodBeat.o(136558);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(136558);
    }
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(136547);
    ab.v("MicroMsg.FTS.FTSIndexDB", "rawQuery: execute sql = %s", new Object[] { paramString });
    paramString = new a(this.mBd.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, paramString, paramArrayOfString, null));
    AppMethodBeat.o(136547);
    return paramString;
  }

  // ERROR //
  public final void rollback()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 382
    //   5: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 50	com/tencent/mm/plugin/fts/d:mBd	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   12: ifnull +23 -> 35
    //   15: aload_0
    //   16: getfield 50	com/tencent/mm/plugin/fts/d:mBd	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   19: invokevirtual 334	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   22: ifeq +13 -> 35
    //   25: aload_0
    //   26: getfield 50	com/tencent/mm/plugin/fts/d:mBd	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   29: invokevirtual 324	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   32: ifne +12 -> 44
    //   35: ldc_w 382
    //   38: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: ldc 28
    //   46: ldc_w 383
    //   49: invokestatic 385	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: aload_0
    //   53: getfield 50	com/tencent/mm/plugin/fts/d:mBd	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   56: invokevirtual 339	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   59: ldc_w 382
    //   62: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: goto -24 -> 41
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: ldc 28
    //   76: aload_1
    //   77: ldc_w 387
    //   80: iconst_1
    //   81: anewarray 4	java/lang/Object
    //   84: dup
    //   85: iconst_0
    //   86: aload_1
    //   87: aastore
    //   88: invokestatic 391	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: ldc_w 382
    //   94: invokestatic 236	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: goto -56 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   2	35	68	finally
    //   35	41	68	finally
    //   44	52	68	finally
    //   52	59	68	finally
    //   59	65	68	finally
    //   74	97	68	finally
    //   52	59	73	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.d
 * JD-Core Version:    0.6.2
 */