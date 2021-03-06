package com.tencent.wcdb.support;

import android.content.pm.ApplicationInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.CursorFactory;
import com.tencent.wcdb.database.SQLiteGlobal;
import java.io.File;

public final class Context
{
  public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;

  static
  {
    AppMethodBeat.i(12707);
    SQLiteGlobal.loadLib();
    AppMethodBeat.o(12707);
  }

  private static File getDataDirFile(android.content.Context paramContext)
  {
    AppMethodBeat.i(12697);
    if (paramContext != null)
    {
      paramContext = paramContext.getApplicationInfo().dataDir;
      if (paramContext != null)
      {
        paramContext = new File(paramContext);
        AppMethodBeat.o(12697);
      }
      while (true)
      {
        return paramContext;
        paramContext = null;
        AppMethodBeat.o(12697);
      }
    }
    paramContext = new RuntimeException("Not supported in system context");
    AppMethodBeat.o(12697);
    throw paramContext;
  }

  private static File getDatabasesDir(android.content.Context paramContext)
  {
    AppMethodBeat.i(12698);
    File localFile = new File(getDataDirFile(paramContext), "databases");
    paramContext = localFile;
    if (localFile.getPath().equals("databases"))
      paramContext = new File("/data/system");
    AppMethodBeat.o(12698);
    return paramContext;
  }

  private static File makeFilename(File paramFile, String paramString)
  {
    AppMethodBeat.i(12699);
    if (paramString.indexOf(File.separatorChar) < 0)
    {
      paramFile = new File(paramFile, paramString);
      AppMethodBeat.o(12699);
      return paramFile;
    }
    paramFile = new IllegalArgumentException("File " + paramString + " contains a path separator");
    AppMethodBeat.o(12699);
    throw paramFile;
  }

  public static SQLiteDatabase openOrCreateDatabase(android.content.Context paramContext, String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12702);
    paramContext = openOrCreateDatabase(paramContext, paramString, null, null, paramInt, paramCursorFactory, null, 0);
    AppMethodBeat.o(12702);
    return paramContext;
  }

  public static SQLiteDatabase openOrCreateDatabase(android.content.Context paramContext, String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12703);
    paramContext = openOrCreateDatabase(paramContext, paramString, null, null, paramInt, paramCursorFactory, paramDatabaseErrorHandler, 0);
    AppMethodBeat.o(12703);
    return paramContext;
  }

  public static SQLiteDatabase openOrCreateDatabase(android.content.Context paramContext, String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    AppMethodBeat.i(12704);
    paramContext = openOrCreateDatabase(paramContext, paramString, paramArrayOfByte, paramSQLiteCipherSpec, paramInt, paramCursorFactory, null, 0);
    AppMethodBeat.o(12704);
    return paramContext;
  }

  public static SQLiteDatabase openOrCreateDatabase(android.content.Context paramContext, String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    AppMethodBeat.i(12705);
    paramContext = openOrCreateDatabase(paramContext, paramString, paramArrayOfByte, paramSQLiteCipherSpec, paramInt, paramCursorFactory, paramDatabaseErrorHandler, 0);
    AppMethodBeat.o(12705);
    return paramContext;
  }

  public static SQLiteDatabase openOrCreateDatabase(android.content.Context paramContext, String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, int paramInt1, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt2)
  {
    AppMethodBeat.i(12706);
    paramContext = validateFilePath(paramContext, paramString, true);
    int i = 268435456;
    if ((paramInt1 & 0x8) != 0)
      i = 805306368;
    paramString = SQLiteDatabase.openDatabase(paramContext.getPath(), paramArrayOfByte, paramSQLiteCipherSpec, paramCursorFactory, i, paramDatabaseErrorHandler, paramInt2);
    setFilePermissionsFromMode(paramContext.getPath(), paramInt1, 0);
    AppMethodBeat.o(12706);
    return paramString;
  }

  private static void setFilePermissionsFromMode(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(12701);
    int i = paramInt2 | 0x1B0;
    paramInt2 = i;
    if ((paramInt1 & 0x1) != 0)
      paramInt2 = i | 0x4;
    i = paramInt2;
    if ((paramInt1 & 0x2) != 0)
      i = paramInt2 | 0x2;
    FileUtils.setPermissions(paramString, i, -1, -1);
    AppMethodBeat.o(12701);
  }

  private static File validateFilePath(android.content.Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(12700);
    if (paramString.charAt(0) == File.separatorChar)
      paramContext = new File(paramString.substring(0, paramString.lastIndexOf(File.separatorChar)));
    for (paramString = new File(paramContext, paramString.substring(paramString.lastIndexOf(File.separatorChar))); ; paramString = makeFilename(paramContext, paramString))
    {
      if ((paramBoolean) && (!paramContext.isDirectory()) && (paramContext.mkdir()))
        FileUtils.setPermissions(paramContext.getPath(), 505, -1, -1);
      AppMethodBeat.o(12700);
      return paramString;
      paramContext = getDatabasesDir(paramContext);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.support.Context
 * JD-Core Version:    0.6.2
 */