package com.google.android.gms.common.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public final class DbUtils
{
  public static void clearDatabase(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(90149);
    zza(paramSQLiteDatabase, "table", new String[] { "sqlite_sequence", "android_metadata" });
    zza(paramSQLiteDatabase, "trigger", new String[0]);
    zza(paramSQLiteDatabase, "view", new String[0]);
    AppMethodBeat.o(90149);
  }

  public static long countCurrentRowBytes(Cursor paramCursor)
  {
    AppMethodBeat.i(90162);
    long l = countCurrentRowBytes(paramCursor, Charset.forName("UTF-8"));
    AppMethodBeat.o(90162);
    return l;
  }

  public static long countCurrentRowBytes(Cursor paramCursor, Charset paramCharset)
  {
    AppMethodBeat.i(90161);
    long l = 0L;
    int i = 0;
    if (i < paramCursor.getColumnCount())
    {
      switch (paramCursor.getType(i))
      {
      default:
      case 4:
      case 3:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        i++;
        break;
        l += paramCursor.getBlob(i).length;
        continue;
        l += paramCursor.getString(i).getBytes(paramCharset).length;
        continue;
        l += 4L;
      }
    }
    AppMethodBeat.o(90161);
    return l;
  }

  public static long getDatabaseSize(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90160);
    long l;
    try
    {
      paramContext = paramContext.getDatabasePath(paramString);
      if (paramContext == null)
        break label47;
      l = paramContext.length();
      AppMethodBeat.o(90160);
      return l;
    }
    catch (SecurityException paramContext)
    {
      paramContext = String.valueOf(paramString);
      if (paramContext.length() == 0)
        break label57;
    }
    "Failed to get db size for ".concat(paramContext);
    while (true)
    {
      label47: l = 0L;
      AppMethodBeat.o(90160);
      break;
      label57: new String("Failed to get db size for ");
    }
  }

  @Nullable
  public static Integer getIntegerFromCursor(Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(90152);
    paramCursor = getIntegerFromCursor(paramCursor, paramInt, null);
    AppMethodBeat.o(90152);
    return paramCursor;
  }

  @Nullable
  public static Integer getIntegerFromCursor(Cursor paramCursor, int paramInt, @Nullable Integer paramInteger)
  {
    AppMethodBeat.i(90151);
    if ((paramInt < 0) || (paramCursor.isNull(paramInt)))
      AppMethodBeat.o(90151);
    while (true)
    {
      return paramInteger;
      paramInteger = Integer.valueOf(paramCursor.getInt(paramInt));
      AppMethodBeat.o(90151);
    }
  }

  @Nullable
  public static Long getLongFromCursor(Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(90154);
    paramCursor = getLongFromCursor(paramCursor, paramInt, null);
    AppMethodBeat.o(90154);
    return paramCursor;
  }

  @Nullable
  public static Long getLongFromCursor(Cursor paramCursor, int paramInt, @Nullable Long paramLong)
  {
    AppMethodBeat.i(90153);
    if ((paramInt < 0) || (paramCursor.isNull(paramInt)))
      AppMethodBeat.o(90153);
    while (true)
    {
      return paramLong;
      paramLong = Long.valueOf(paramCursor.getLong(paramInt));
      AppMethodBeat.o(90153);
    }
  }

  @Nullable
  public static String getStringFromCursor(Cursor paramCursor, int paramInt)
  {
    AppMethodBeat.i(90156);
    paramCursor = getStringFromCursor(paramCursor, paramInt, null);
    AppMethodBeat.o(90156);
    return paramCursor;
  }

  @Nullable
  public static String getStringFromCursor(Cursor paramCursor, int paramInt, @Nullable String paramString)
  {
    AppMethodBeat.i(90155);
    if ((paramInt < 0) || (paramCursor.isNull(paramInt)))
      AppMethodBeat.o(90155);
    while (true)
    {
      return paramString;
      paramString = paramCursor.getString(paramInt);
      AppMethodBeat.o(90155);
    }
  }

  public static void putIntegerIntoContentValues(ContentValues paramContentValues, String paramString, @Nullable Integer paramInteger)
  {
    AppMethodBeat.i(90157);
    if (paramInteger != null)
    {
      paramContentValues.put(paramString, paramInteger);
      AppMethodBeat.o(90157);
    }
    while (true)
    {
      return;
      paramContentValues.putNull(paramString);
      AppMethodBeat.o(90157);
    }
  }

  public static void putLongIntoContentValues(ContentValues paramContentValues, String paramString, @Nullable Long paramLong)
  {
    AppMethodBeat.i(90158);
    if (paramLong != null)
    {
      paramContentValues.put(paramString, paramLong);
      AppMethodBeat.o(90158);
    }
    while (true)
    {
      return;
      paramContentValues.putNull(paramString);
      AppMethodBeat.o(90158);
    }
  }

  public static void putStringIntoContentValues(ContentValues paramContentValues, String paramString1, @Nullable String paramString2)
  {
    AppMethodBeat.i(90159);
    if (paramString2 != null)
    {
      paramContentValues.put(paramString1, paramString2);
      AppMethodBeat.o(90159);
    }
    while (true)
    {
      return;
      paramContentValues.putNull(paramString1);
      AppMethodBeat.o(90159);
    }
  }

  // ERROR //
  private static void zza(SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 180
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 20
    //   9: aload_1
    //   10: invokevirtual 184	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: ifne +21 -> 34
    //   16: ldc 34
    //   18: aload_1
    //   19: invokevirtual 184	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   22: ifne +12 -> 34
    //   25: ldc 32
    //   27: aload_1
    //   28: invokevirtual 184	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   31: ifeq +182 -> 213
    //   34: iconst_1
    //   35: istore 4
    //   37: iload 4
    //   39: invokestatic 190	com/google/android/gms/common/internal/Preconditions:checkArgument	(Z)V
    //   42: aload_0
    //   43: ldc 192
    //   45: iconst_1
    //   46: anewarray 22	java/lang/String
    //   49: dup
    //   50: iconst_0
    //   51: ldc 194
    //   53: aastore
    //   54: ldc 196
    //   56: iconst_1
    //   57: anewarray 22	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: aastore
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: invokevirtual 202	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   70: astore 5
    //   72: aload_2
    //   73: invokestatic 208	com/google/android/gms/common/util/CollectionUtils:setOf	([Ljava/lang/Object;)Ljava/util/Set;
    //   76: astore_2
    //   77: aload 5
    //   79: invokeinterface 212 1 0
    //   84: ifeq +135 -> 219
    //   87: aload 5
    //   89: iconst_0
    //   90: invokeinterface 70 2 0
    //   95: astore 6
    //   97: aload_2
    //   98: aload 6
    //   100: invokeinterface 217 2 0
    //   105: ifne -28 -> 77
    //   108: aload_1
    //   109: invokestatic 97	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   112: invokevirtual 99	java/lang/String:length	()I
    //   115: istore 7
    //   117: aload 6
    //   119: invokestatic 97	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: invokevirtual 99	java/lang/String:length	()I
    //   125: istore 8
    //   127: new 219	java/lang/StringBuilder
    //   130: astore 9
    //   132: aload 9
    //   134: iload 7
    //   136: bipush 8
    //   138: iadd
    //   139: iload 8
    //   141: iadd
    //   142: invokespecial 221	java/lang/StringBuilder:<init>	(I)V
    //   145: aload_0
    //   146: aload 9
    //   148: ldc 223
    //   150: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload_1
    //   154: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: ldc 229
    //   159: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload 6
    //   164: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: ldc 231
    //   169: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 235	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokevirtual 238	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   178: goto -101 -> 77
    //   181: astore_0
    //   182: ldc 180
    //   184: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: aload_0
    //   188: athrow
    //   189: astore_1
    //   190: aload 5
    //   192: ifnull +14 -> 206
    //   195: aload_0
    //   196: ifnull +50 -> 246
    //   199: aload 5
    //   201: invokeinterface 241 1 0
    //   206: ldc 180
    //   208: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   211: aload_1
    //   212: athrow
    //   213: iconst_0
    //   214: istore 4
    //   216: goto -179 -> 37
    //   219: aload 5
    //   221: ifnull +35 -> 256
    //   224: aload 5
    //   226: invokeinterface 241 1 0
    //   231: ldc 180
    //   233: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: return
    //   237: astore_2
    //   238: aload_0
    //   239: aload_2
    //   240: invokestatic 246	com/google/android/gms/internal/stable/zzk:zza	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   243: goto -37 -> 206
    //   246: aload 5
    //   248: invokeinterface 241 1 0
    //   253: goto -47 -> 206
    //   256: ldc 180
    //   258: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   261: goto -25 -> 236
    //   264: astore_1
    //   265: aload_3
    //   266: astore_0
    //   267: goto -77 -> 190
    //
    // Exception table:
    //   from	to	target	type
    //   72	77	181	java/lang/Throwable
    //   77	178	181	java/lang/Throwable
    //   182	189	189	finally
    //   199	206	237	java/lang/Throwable
    //   72	77	264	finally
    //   77	178	264	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.DbUtils
 * JD-Core Version:    0.6.2
 */