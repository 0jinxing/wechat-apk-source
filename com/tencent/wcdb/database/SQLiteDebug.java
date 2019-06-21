package com.tencent.wcdb.database;

import android.annotation.SuppressLint;
import android.util.Printer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;

public final class SQLiteDebug
{
  private static final String TAG = "WCDB.SQLiteDebug";
  private static volatile int sLastErrorLine;
  private static volatile ArrayList<IOTraceStats> sLastIOTraceStats;

  static
  {
    AppMethodBeat.i(12551);
    SQLiteGlobal.loadLib();
    AppMethodBeat.o(12551);
  }

  static void collectLastIOTraceStats(SQLiteConnection paramSQLiteConnection)
  {
    AppMethodBeat.i(12548);
    try
    {
      sLastErrorLine = nativeGetLastErrorLine();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      long l = paramSQLiteConnection.getNativeHandle(null);
      if (l != 0L)
      {
        nativeGetIOTraceStats(l, localArrayList);
        paramSQLiteConnection.endNativeHandle(null);
      }
      sLastIOTraceStats = localArrayList;
      AppMethodBeat.o(12548);
      return;
    }
    catch (RuntimeException paramSQLiteConnection)
    {
      while (true)
      {
        Log.e("WCDB.SQLiteDebug", "Cannot collect I/O trace statistics: " + paramSQLiteConnection.getMessage());
        AppMethodBeat.o(12548);
      }
    }
  }

  static void collectLastIOTraceStats(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(12549);
    try
    {
      sLastErrorLine = nativeGetLastErrorLine();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      long l = paramSQLiteDatabase.acquireNativeConnectionHandle("collectIoStat", false, false);
      if (l != 0L)
        nativeGetIOTraceStats(l, localArrayList);
      paramSQLiteDatabase.releaseNativeConnection(l, null);
      sLastIOTraceStats = localArrayList;
      AppMethodBeat.o(12549);
      return;
    }
    catch (RuntimeException paramSQLiteDatabase)
    {
      while (true)
      {
        Log.e("WCDB.SQLiteDebug", "Cannot collect I/O trace statistics: " + paramSQLiteDatabase.getMessage());
        AppMethodBeat.o(12549);
      }
    }
  }

  public static void dump(Printer paramPrinter, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12550);
    int i = paramArrayOfString.length;
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      if (paramArrayOfString[j].equals("-v"))
        bool = true;
      j++;
    }
    SQLiteDatabase.dumpAll(paramPrinter, bool);
    AppMethodBeat.o(12550);
  }

  public static PagerStats getDatabaseInfo()
  {
    AppMethodBeat.i(12546);
    PagerStats localPagerStats = new PagerStats();
    nativeGetPagerStats(localPagerStats);
    localPagerStats.dbStats = SQLiteDatabase.getDbStats();
    AppMethodBeat.o(12546);
    return localPagerStats;
  }

  public static int getLastErrorLine()
  {
    return sLastErrorLine;
  }

  public static ArrayList<IOTraceStats> getLastIOTraceStats()
  {
    return sLastIOTraceStats;
  }

  private static native void nativeGetIOTraceStats(long paramLong, ArrayList<IOTraceStats> paramArrayList);

  private static native int nativeGetLastErrorLine();

  private static native void nativeGetPagerStats(PagerStats paramPagerStats);

  private static native void nativeSetIOTraceFlags(int paramInt);

  public static void setIOTraceFlags(int paramInt)
  {
    AppMethodBeat.i(12547);
    nativeSetIOTraceFlags(paramInt);
    AppMethodBeat.o(12547);
  }

  public static final boolean shouldLogSlowQuery(long paramLong)
  {
    if (paramLong > 300L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static class DbStats
  {
    public String cache;
    public String dbName;
    public long dbSize;
    public int lookaside;
    public long pageSize;

    public DbStats(String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(12544);
      this.dbName = paramString;
      this.pageSize = (paramLong2 / 1024L);
      this.dbSize = (paramLong1 * paramLong2 / 1024L);
      this.lookaside = paramInt1;
      this.cache = (paramInt2 + "/" + paramInt3 + "/" + paramInt4);
      AppMethodBeat.o(12544);
    }
  }

  public static class IOTraceStats
  {
    public String dbName;
    public String journalMode;
    public long lastJournalReadOffset;
    public byte[] lastJournalReadPage;
    public long lastJournalWriteOffset;
    public byte[] lastJournalWritePage;
    public long lastReadOffset;
    public byte[] lastReadPage;
    public long lastWriteOffset;
    public byte[] lastWritePage;
    public long pageCount;
    public long pageSize;
    public String path;

    @SuppressLint({"DefaultLocale"})
    public String toString()
    {
      AppMethodBeat.i(12545);
      String str = String.format("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", new Object[] { this.dbName, this.path, Long.valueOf(this.pageSize), Long.valueOf(this.pageCount), this.journalMode, Long.valueOf(this.lastReadOffset), Long.valueOf(this.lastWriteOffset), Long.valueOf(this.lastJournalReadOffset), Long.valueOf(this.lastJournalWriteOffset) });
      AppMethodBeat.o(12545);
      return str;
    }
  }

  public static class PagerStats
  {
    public ArrayList<SQLiteDebug.DbStats> dbStats;
    public int largestMemAlloc;
    public int memoryUsed;
    public int pageCacheOverflow;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteDebug
 * JD-Core Version:    0.6.2
 */