package com.tencent.wcdb;

import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.database.SQLiteAbortException;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConstraintException;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDiskIOException;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteFullException;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.CollationKey;
import java.text.Collator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class DatabaseUtils
{
  private static final boolean DEBUG = false;
  private static final char[] DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final int EX_HAS_REPLY_HEADER = -128;
  public static final int STATEMENT_ABORT = 6;
  public static final int STATEMENT_ATTACH = 3;
  public static final int STATEMENT_BEGIN = 4;
  public static final int STATEMENT_COMMIT = 5;
  public static final int STATEMENT_DDL = 8;
  public static final int STATEMENT_OTHER = 99;
  public static final int STATEMENT_PRAGMA = 7;
  public static final int STATEMENT_SELECT = 1;
  public static final int STATEMENT_UNPREPARED = 9;
  public static final int STATEMENT_UPDATE = 2;
  private static final String TAG = "WCDB.DatabaseUtils";
  private static Collator mColl = null;

  public static void appendEscapedSQLString(StringBuilder paramStringBuilder, String paramString)
  {
    AppMethodBeat.i(12123);
    paramStringBuilder.append('\'');
    if (paramString.indexOf('\'') != -1)
    {
      int i = paramString.length();
      for (int j = 0; j < i; j++)
      {
        char c = paramString.charAt(j);
        if (c == '\'')
          paramStringBuilder.append('\'');
        paramStringBuilder.append(c);
      }
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append('\'');
    AppMethodBeat.o(12123);
  }

  public static String[] appendSelectionArgs(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(12167);
    if ((paramArrayOfString1 == null) || (paramArrayOfString1.length == 0))
      AppMethodBeat.o(12167);
    while (true)
    {
      return paramArrayOfString2;
      String[] arrayOfString = new String[paramArrayOfString1.length + paramArrayOfString2.length];
      System.arraycopy(paramArrayOfString1, 0, arrayOfString, 0, paramArrayOfString1.length);
      System.arraycopy(paramArrayOfString2, 0, arrayOfString, paramArrayOfString1.length, paramArrayOfString2.length);
      AppMethodBeat.o(12167);
      paramArrayOfString2 = arrayOfString;
    }
  }

  public static final void appendValueToSql(StringBuilder paramStringBuilder, Object paramObject)
  {
    AppMethodBeat.i(12125);
    if (paramObject == null)
    {
      paramStringBuilder.append("NULL");
      AppMethodBeat.o(12125);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Boolean))
      {
        if (((Boolean)paramObject).booleanValue())
        {
          paramStringBuilder.append('1');
          AppMethodBeat.o(12125);
        }
        else
        {
          paramStringBuilder.append('0');
          AppMethodBeat.o(12125);
        }
      }
      else
      {
        appendEscapedSQLString(paramStringBuilder, paramObject.toString());
        AppMethodBeat.o(12125);
      }
    }
  }

  public static void bindObjectToProgram(SQLiteProgram paramSQLiteProgram, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(12121);
    if (paramObject == null)
    {
      paramSQLiteProgram.bindNull(paramInt);
      AppMethodBeat.o(12121);
    }
    while (true)
    {
      return;
      if (((paramObject instanceof Double)) || ((paramObject instanceof Float)))
      {
        paramSQLiteProgram.bindDouble(paramInt, ((Number)paramObject).doubleValue());
        AppMethodBeat.o(12121);
      }
      else if ((paramObject instanceof Number))
      {
        paramSQLiteProgram.bindLong(paramInt, ((Number)paramObject).longValue());
        AppMethodBeat.o(12121);
      }
      else if ((paramObject instanceof Boolean))
      {
        if (((Boolean)paramObject).booleanValue())
        {
          paramSQLiteProgram.bindLong(paramInt, 1L);
          AppMethodBeat.o(12121);
        }
        else
        {
          paramSQLiteProgram.bindLong(paramInt, 0L);
          AppMethodBeat.o(12121);
        }
      }
      else if ((paramObject instanceof byte[]))
      {
        paramSQLiteProgram.bindBlob(paramInt, (byte[])paramObject);
        AppMethodBeat.o(12121);
      }
      else
      {
        paramSQLiteProgram.bindString(paramInt, paramObject.toString());
        AppMethodBeat.o(12121);
      }
    }
  }

  public static String concatenateWhere(String paramString1, String paramString2)
  {
    AppMethodBeat.i(12126);
    if (TextUtils.isEmpty(paramString1))
      AppMethodBeat.o(12126);
    while (true)
    {
      return paramString2;
      if (TextUtils.isEmpty(paramString2))
      {
        AppMethodBeat.o(12126);
        paramString2 = paramString1;
      }
      else
      {
        paramString2 = "(" + paramString1 + ") AND (" + paramString2 + ")";
        AppMethodBeat.o(12126);
      }
    }
  }

  public static void createDbFromSqlStatements(android.content.Context paramContext, String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(12164);
    createDbFromSqlStatements(paramContext, paramString1, null, null, paramInt, paramString2);
    AppMethodBeat.o(12164);
  }

  public static void createDbFromSqlStatements(android.content.Context paramContext, String paramString1, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, int paramInt, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(12163);
    paramContext = com.tencent.wcdb.support.Context.openOrCreateDatabase(paramContext, paramString1, paramArrayOfByte, paramSQLiteCipherSpec, 0, null);
    paramString1 = TextUtils.split(paramString2, ";\n");
    int j = paramString1.length;
    while (i < j)
    {
      paramArrayOfByte = paramString1[i];
      if (!TextUtils.isEmpty(paramArrayOfByte))
        paramContext.execSQL(paramArrayOfByte);
      i++;
    }
    paramContext.setVersion(paramInt);
    paramContext.close();
    AppMethodBeat.o(12163);
  }

  public static void cursorDoubleToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    AppMethodBeat.i(12146);
    int i = paramCursor.getColumnIndex(paramString1);
    if (!paramCursor.isNull(i))
    {
      paramContentValues.put(paramString2, Double.valueOf(paramCursor.getDouble(i)));
      AppMethodBeat.o(12146);
    }
    while (true)
    {
      return;
      paramContentValues.put(paramString2, null);
      AppMethodBeat.o(12146);
    }
  }

  public static void cursorDoubleToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    AppMethodBeat.i(12162);
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Double.valueOf(paramCursor.getDouble(i)));
    AppMethodBeat.o(12162);
  }

  public static void cursorDoubleToCursorValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12145);
    cursorDoubleToContentValues(paramCursor, paramString, paramContentValues, paramString);
    AppMethodBeat.o(12145);
  }

  public static void cursorFillWindow(Cursor paramCursor, int paramInt, CursorWindow paramCursorWindow)
  {
    AppMethodBeat.i(12122);
    if ((paramInt < 0) || (paramInt >= paramCursor.getCount()))
    {
      AppMethodBeat.o(12122);
      return;
    }
    int i = paramCursor.getPosition();
    int j = paramCursor.getColumnCount();
    paramCursorWindow.clear();
    paramCursorWindow.setStartPosition(paramInt);
    paramCursorWindow.setNumColumns(j);
    if (paramCursor.moveToPosition(paramInt))
      label68: if (!paramCursorWindow.allocRow());
    label297: for (int k = 0; ; k++)
    {
      Object localObject;
      boolean bool;
      if (k < j)
        switch (paramCursor.getType(k))
        {
        case 3:
        default:
          localObject = paramCursor.getString(k);
          if (localObject != null)
            bool = paramCursorWindow.putString((String)localObject, paramInt, k);
          break;
        case 0:
        case 1:
        case 2:
        case 4:
        }
      while (true)
      {
        if (bool)
          break label297;
        paramCursorWindow.freeLastRow();
        paramInt++;
        if (paramCursor.moveToNext())
          break label68;
        paramCursor.moveToPosition(i);
        AppMethodBeat.o(12122);
        break;
        bool = paramCursorWindow.putNull(paramInt, k);
        continue;
        bool = paramCursorWindow.putLong(paramCursor.getLong(k), paramInt, k);
        continue;
        bool = paramCursorWindow.putDouble(paramCursor.getDouble(k), paramInt, k);
        continue;
        localObject = paramCursor.getBlob(k);
        if (localObject != null)
        {
          bool = paramCursorWindow.putBlob((byte[])localObject, paramInt, k);
        }
        else
        {
          bool = paramCursorWindow.putNull(paramInt, k);
          continue;
          bool = paramCursorWindow.putNull(paramInt, k);
        }
      }
    }
  }

  public static void cursorFloatToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    AppMethodBeat.i(12161);
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Float.valueOf(paramCursor.getFloat(i)));
    AppMethodBeat.o(12161);
  }

  public static void cursorIntToContentValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12141);
    cursorIntToContentValues(paramCursor, paramString, paramContentValues, paramString);
    AppMethodBeat.o(12141);
  }

  public static void cursorIntToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    AppMethodBeat.i(12142);
    int i = paramCursor.getColumnIndex(paramString1);
    if (!paramCursor.isNull(i))
    {
      paramContentValues.put(paramString2, Integer.valueOf(paramCursor.getInt(i)));
      AppMethodBeat.o(12142);
    }
    while (true)
    {
      return;
      paramContentValues.put(paramString2, null);
      AppMethodBeat.o(12142);
    }
  }

  public static void cursorIntToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    AppMethodBeat.i(12160);
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Integer.valueOf(paramCursor.getInt(i)));
    AppMethodBeat.o(12160);
  }

  public static void cursorLongToContentValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12143);
    cursorLongToContentValues(paramCursor, paramString, paramContentValues, paramString);
    AppMethodBeat.o(12143);
  }

  public static void cursorLongToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    AppMethodBeat.i(12144);
    int i = paramCursor.getColumnIndex(paramString1);
    if (!paramCursor.isNull(i))
    {
      paramContentValues.put(paramString2, Long.valueOf(paramCursor.getLong(i)));
      AppMethodBeat.o(12144);
    }
    while (true)
    {
      return;
      paramContentValues.put(paramString2, null);
      AppMethodBeat.o(12144);
    }
  }

  public static void cursorLongToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    AppMethodBeat.i(12158);
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Long.valueOf(paramCursor.getLong(i)));
    AppMethodBeat.o(12158);
  }

  public static int cursorPickFillWindowStartPosition(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(12148);
    paramInt1 = Math.max(paramInt1 - paramInt2 / 3, 0);
    AppMethodBeat.o(12148);
    return paramInt1;
  }

  public static void cursorRowToContentValues(Cursor paramCursor, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12147);
    AbstractWindowedCursor localAbstractWindowedCursor;
    String[] arrayOfString;
    int j;
    if ((paramCursor instanceof AbstractWindowedCursor))
    {
      localAbstractWindowedCursor = (AbstractWindowedCursor)paramCursor;
      arrayOfString = paramCursor.getColumnNames();
      int i = arrayOfString.length;
      j = 0;
      label32: if (j >= i)
        break label98;
      if ((localAbstractWindowedCursor == null) || (!localAbstractWindowedCursor.isBlob(j)))
        break label79;
      paramContentValues.put(arrayOfString[j], paramCursor.getBlob(j));
    }
    while (true)
    {
      j++;
      break label32;
      localAbstractWindowedCursor = null;
      break;
      label79: paramContentValues.put(arrayOfString[j], paramCursor.getString(j));
    }
    label98: AppMethodBeat.o(12147);
  }

  public static void cursorShortToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    AppMethodBeat.i(12159);
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, Short.valueOf(paramCursor.getShort(i)));
    AppMethodBeat.o(12159);
  }

  public static void cursorStringToContentValues(Cursor paramCursor, String paramString, ContentValues paramContentValues)
  {
    AppMethodBeat.i(12138);
    cursorStringToContentValues(paramCursor, paramString, paramContentValues, paramString);
    AppMethodBeat.o(12138);
  }

  public static void cursorStringToContentValues(Cursor paramCursor, String paramString1, ContentValues paramContentValues, String paramString2)
  {
    AppMethodBeat.i(12140);
    paramContentValues.put(paramString2, paramCursor.getString(paramCursor.getColumnIndexOrThrow(paramString1)));
    AppMethodBeat.o(12140);
  }

  public static void cursorStringToContentValuesIfPresent(Cursor paramCursor, ContentValues paramContentValues, String paramString)
  {
    AppMethodBeat.i(12157);
    int i = paramCursor.getColumnIndex(paramString);
    if ((i != -1) && (!paramCursor.isNull(i)))
      paramContentValues.put(paramString, paramCursor.getString(i));
    AppMethodBeat.o(12157);
  }

  public static void cursorStringToInsertHelper(Cursor paramCursor, String paramString, InsertHelper paramInsertHelper, int paramInt)
  {
    AppMethodBeat.i(12139);
    paramInsertHelper.bind(paramInt, paramCursor.getString(paramCursor.getColumnIndexOrThrow(paramString)));
    AppMethodBeat.o(12139);
  }

  public static void dumpCurrentRow(Cursor paramCursor)
  {
    AppMethodBeat.i(12134);
    dumpCurrentRow(paramCursor, System.out);
    AppMethodBeat.o(12134);
  }

  public static void dumpCurrentRow(Cursor paramCursor, PrintStream paramPrintStream)
  {
    AppMethodBeat.i(12135);
    String[] arrayOfString = paramCursor.getColumnNames();
    paramPrintStream.println(paramCursor.getPosition() + " {");
    int i = arrayOfString.length;
    int j = 0;
    while (true)
      if (j < i)
        try
        {
          String str1 = paramCursor.getString(j);
          paramPrintStream.println("   " + arrayOfString[j] + '=' + str1);
          j++;
        }
        catch (SQLiteException localSQLiteException)
        {
          while (true)
            String str2 = "<unprintable>";
        }
    paramPrintStream.println("}");
    AppMethodBeat.o(12135);
  }

  public static void dumpCurrentRow(Cursor paramCursor, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(12136);
    String[] arrayOfString = paramCursor.getColumnNames();
    paramStringBuilder.append(paramCursor.getPosition() + " {\n");
    int i = arrayOfString.length;
    int j = 0;
    while (true)
      if (j < i)
        try
        {
          String str1 = paramCursor.getString(j);
          paramStringBuilder.append("   " + arrayOfString[j] + '=' + str1 + "\n");
          j++;
        }
        catch (SQLiteException localSQLiteException)
        {
          while (true)
            String str2 = "<unprintable>";
        }
    paramStringBuilder.append("}\n");
    AppMethodBeat.o(12136);
  }

  public static String dumpCurrentRowToString(Cursor paramCursor)
  {
    AppMethodBeat.i(12137);
    StringBuilder localStringBuilder = new StringBuilder();
    dumpCurrentRow(paramCursor, localStringBuilder);
    paramCursor = localStringBuilder.toString();
    AppMethodBeat.o(12137);
    return paramCursor;
  }

  public static void dumpCursor(Cursor paramCursor)
  {
    AppMethodBeat.i(12130);
    dumpCursor(paramCursor, System.out);
    AppMethodBeat.o(12130);
  }

  public static void dumpCursor(Cursor paramCursor, PrintStream paramPrintStream)
  {
    AppMethodBeat.i(12131);
    paramPrintStream.println(">>>>> Dumping cursor ".concat(String.valueOf(paramCursor)));
    if (paramCursor != null)
    {
      int i = paramCursor.getPosition();
      paramCursor.moveToPosition(-1);
      while (paramCursor.moveToNext())
        dumpCurrentRow(paramCursor, paramPrintStream);
      paramCursor.moveToPosition(i);
    }
    paramPrintStream.println("<<<<<");
    AppMethodBeat.o(12131);
  }

  public static void dumpCursor(Cursor paramCursor, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(12132);
    paramStringBuilder.append(">>>>> Dumping cursor " + paramCursor + "\n");
    if (paramCursor != null)
    {
      int i = paramCursor.getPosition();
      paramCursor.moveToPosition(-1);
      while (paramCursor.moveToNext())
        dumpCurrentRow(paramCursor, paramStringBuilder);
      paramCursor.moveToPosition(i);
    }
    paramStringBuilder.append("<<<<<\n");
    AppMethodBeat.o(12132);
  }

  public static String dumpCursorToString(Cursor paramCursor)
  {
    AppMethodBeat.i(12133);
    StringBuilder localStringBuilder = new StringBuilder();
    dumpCursor(paramCursor, localStringBuilder);
    paramCursor = localStringBuilder.toString();
    AppMethodBeat.o(12133);
    return paramCursor;
  }

  private static char[] encodeHex(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    char[] arrayOfChar = new char[i << 1];
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      int m = j + 1;
      arrayOfChar[j] = ((char)DIGITS[((paramArrayOfByte[k] & 0xF0) >>> 4)]);
      j = m + 1;
      arrayOfChar[m] = ((char)DIGITS[(paramArrayOfByte[k] & 0xF)]);
    }
    return arrayOfChar;
  }

  private static int extractSqlCode(String paramString)
  {
    AppMethodBeat.i(12165);
    int i = 0;
    int j = 0;
    if (i < 3)
    {
      int k = paramString.charAt(i);
      int m;
      if ((k >= 97) && (k <= 122))
        m = k - 97 + 65;
      do
      {
        j |= (m & 0x7F) << i * 8;
        i++;
        break;
        m = k;
      }
      while (k < 128);
      AppMethodBeat.o(12165);
      j = 0;
    }
    while (true)
    {
      return j;
      AppMethodBeat.o(12165);
    }
  }

  public static int findRowIdColumnIndex(String[] paramArrayOfString)
  {
    AppMethodBeat.i(12168);
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
      if (paramArrayOfString[j].equals("_id"))
        AppMethodBeat.o(12168);
    while (true)
    {
      return j;
      j++;
      break;
      j = -1;
      AppMethodBeat.o(12168);
    }
  }

  public static String getCollationKey(String paramString)
  {
    AppMethodBeat.i(12127);
    byte[] arrayOfByte = getCollationKeyInBytes(paramString);
    try
    {
      paramString = new java/lang/String;
      paramString.<init>(arrayOfByte, 0, getKeyLen(arrayOfByte), "ISO8859_1");
      AppMethodBeat.o(12127);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = "";
        AppMethodBeat.o(12127);
      }
    }
  }

  private static byte[] getCollationKeyInBytes(String paramString)
  {
    AppMethodBeat.i(12129);
    if (mColl == null)
    {
      Collator localCollator = Collator.getInstance();
      mColl = localCollator;
      localCollator.setStrength(0);
    }
    paramString = mColl.getCollationKey(paramString).toByteArray();
    AppMethodBeat.o(12129);
    return paramString;
  }

  public static String getHexCollationKey(String paramString)
  {
    AppMethodBeat.i(12128);
    paramString = getCollationKeyInBytes(paramString);
    paramString = new String(encodeHex(paramString), 0, getKeyLen(paramString) * 2);
    AppMethodBeat.o(12128);
    return paramString;
  }

  private static int getKeyLen(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte[(paramArrayOfByte.length - 1)] != 0);
    for (int i = paramArrayOfByte.length; ; i = paramArrayOfByte.length - 1)
      return i;
  }

  public static int getSqlStatementType(String paramString)
  {
    int i = 99;
    AppMethodBeat.i(12166);
    paramString = paramString.trim();
    if (paramString.length() < 3)
      AppMethodBeat.o(12166);
    while (true)
    {
      return i;
      switch (extractSqlCode(paramString))
      {
      default:
        AppMethodBeat.o(12166);
        break;
      case 4998483:
        i = 1;
        AppMethodBeat.o(12166);
        break;
      case 4477013:
      case 4998468:
      case 5260626:
      case 5459529:
        i = 2;
        AppMethodBeat.o(12166);
        break;
      case 5526593:
        AppMethodBeat.o(12166);
        i = 3;
        break;
      case 4476485:
      case 5066563:
        i = 5;
        AppMethodBeat.o(12166);
        break;
      case 5001042:
        i = 6;
        AppMethodBeat.o(12166);
        break;
      case 4670786:
        i = 4;
        AppMethodBeat.o(12166);
        break;
      case 4280912:
        i = 7;
        AppMethodBeat.o(12166);
        break;
      case 4543043:
      case 5198404:
      case 5524545:
        i = 8;
        AppMethodBeat.o(12166);
        break;
      case 4279873:
      case 5522756:
        i = 9;
        AppMethodBeat.o(12166);
      }
    }
  }

  public static int getTypeOfObject(Object paramObject)
  {
    int i;
    if (paramObject == null)
      i = 0;
    while (true)
    {
      return i;
      if ((paramObject instanceof byte[]))
        i = 4;
      else if (((paramObject instanceof Float)) || ((paramObject instanceof Double)))
        i = 2;
      else if (((paramObject instanceof Long)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Short)) || ((paramObject instanceof Byte)))
        i = 1;
      else
        i = 3;
    }
  }

  public static long longForQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12153);
    paramSQLiteDatabase = paramSQLiteDatabase.compileStatement(paramString);
    try
    {
      long l = longForQuery(paramSQLiteDatabase, paramArrayOfString);
      return l;
    }
    finally
    {
      paramSQLiteDatabase.close();
      AppMethodBeat.o(12153);
    }
    throw paramString;
  }

  public static long longForQuery(SQLiteStatement paramSQLiteStatement, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12154);
    paramSQLiteStatement.bindAllArgsAsStrings(paramArrayOfString);
    long l = paramSQLiteStatement.simpleQueryForLong();
    AppMethodBeat.o(12154);
    return l;
  }

  public static boolean objectEquals(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(12114);
    boolean bool;
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2))))
    {
      bool = true;
      AppMethodBeat.o(12114);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12114);
    }
  }

  public static boolean queryIsEmpty(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    AppMethodBeat.i(12152);
    boolean bool;
    if (longForQuery(paramSQLiteDatabase, "select exists(select 1 from " + paramString + ")", null) == 0L)
    {
      bool = true;
      AppMethodBeat.o(12152);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12152);
    }
  }

  public static long queryNumEntries(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    AppMethodBeat.i(12149);
    long l = queryNumEntries(paramSQLiteDatabase, paramString, null, null);
    AppMethodBeat.o(12149);
    return l;
  }

  public static long queryNumEntries(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    AppMethodBeat.i(12150);
    long l = queryNumEntries(paramSQLiteDatabase, paramString1, paramString2, null);
    AppMethodBeat.o(12150);
    return l;
  }

  public static long queryNumEntries(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12151);
    if (!TextUtils.isEmpty(paramString2));
    for (paramString2 = " where ".concat(String.valueOf(paramString2)); ; paramString2 = "")
    {
      long l = longForQuery(paramSQLiteDatabase, "select count(*) from " + paramString1 + paramString2, paramArrayOfString);
      AppMethodBeat.o(12151);
      return l;
    }
  }

  private static final int readExceptionCode(Parcel paramParcel)
  {
    AppMethodBeat.i(12116);
    int i = paramParcel.readInt();
    if (i == -128)
    {
      if (paramParcel.readInt() == 0)
        Log.e("WCDB.DatabaseUtils", "Unexpected zero-sized Parcel reply header.");
      i = 0;
      AppMethodBeat.o(12116);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(12116);
    }
  }

  public static final void readExceptionFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(12117);
    int i = readExceptionCode(paramParcel);
    if (i == 0)
      AppMethodBeat.o(12117);
    while (true)
    {
      return;
      readExceptionFromParcel(paramParcel, paramParcel.readString(), i);
      AppMethodBeat.o(12117);
    }
  }

  private static final void readExceptionFromParcel(Parcel paramParcel, String paramString, int paramInt)
  {
    AppMethodBeat.i(12120);
    switch (paramInt)
    {
    case 10:
    default:
      paramParcel.readException(paramInt, paramString);
      AppMethodBeat.o(12120);
      return;
    case 2:
      paramParcel = new IllegalArgumentException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 3:
      paramParcel = new UnsupportedOperationException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 4:
      paramParcel = new SQLiteAbortException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 5:
      paramParcel = new SQLiteConstraintException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 6:
      paramParcel = new SQLiteDatabaseCorruptException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 7:
      paramParcel = new SQLiteFullException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 8:
      paramParcel = new SQLiteDiskIOException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 9:
      paramParcel = new SQLiteException(paramString);
      AppMethodBeat.o(12120);
      throw paramParcel;
    case 11:
    }
    paramParcel = new OperationCanceledException(paramString);
    AppMethodBeat.o(12120);
    throw paramParcel;
  }

  public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(12118);
    int i = readExceptionCode(paramParcel);
    if (i == 0)
      AppMethodBeat.o(12118);
    while (true)
    {
      return;
      String str = paramParcel.readString();
      if (i == 1)
      {
        paramParcel = new FileNotFoundException(str);
        AppMethodBeat.o(12118);
        throw paramParcel;
      }
      readExceptionFromParcel(paramParcel, str, i);
      AppMethodBeat.o(12118);
    }
  }

  public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(12119);
    int i = readExceptionCode(paramParcel);
    if (i == 0)
      AppMethodBeat.o(12119);
    while (true)
    {
      return;
      String str = paramParcel.readString();
      if (i == 10)
      {
        paramParcel = new OperationApplicationException(str);
        AppMethodBeat.o(12119);
        throw paramParcel;
      }
      readExceptionFromParcel(paramParcel, str, i);
      AppMethodBeat.o(12119);
    }
  }

  public static String sqlEscapeString(String paramString)
  {
    AppMethodBeat.i(12124);
    StringBuilder localStringBuilder = new StringBuilder();
    appendEscapedSQLString(localStringBuilder, paramString);
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(12124);
    return paramString;
  }

  public static String stringForQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12155);
    paramSQLiteDatabase = paramSQLiteDatabase.compileStatement(paramString);
    try
    {
      paramString = stringForQuery(paramSQLiteDatabase, paramArrayOfString);
      return paramString;
    }
    finally
    {
      paramSQLiteDatabase.close();
      AppMethodBeat.o(12155);
    }
    throw paramString;
  }

  public static String stringForQuery(SQLiteStatement paramSQLiteStatement, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12156);
    paramSQLiteStatement.bindAllArgsAsStrings(paramArrayOfString);
    paramSQLiteStatement = paramSQLiteStatement.simpleQueryForString();
    AppMethodBeat.o(12156);
    return paramSQLiteStatement;
  }

  public static final void writeExceptionToParcel(Parcel paramParcel, Exception paramException)
  {
    AppMethodBeat.i(12115);
    int i;
    int j;
    if ((paramException instanceof FileNotFoundException))
    {
      i = 1;
      j = 0;
      paramParcel.writeInt(i);
      paramParcel.writeString(paramException.getMessage());
      if (j != 0)
        Log.e("WCDB.DatabaseUtils", "Writing exception to parcel", new Object[] { paramException });
      AppMethodBeat.o(12115);
    }
    while (true)
    {
      return;
      if ((paramException instanceof IllegalArgumentException))
      {
        i = 2;
        j = 1;
        break;
      }
      if ((paramException instanceof UnsupportedOperationException))
      {
        i = 3;
        j = 1;
        break;
      }
      if ((paramException instanceof SQLiteAbortException))
      {
        i = 4;
        j = 1;
        break;
      }
      if ((paramException instanceof SQLiteConstraintException))
      {
        i = 5;
        j = 1;
        break;
      }
      if ((paramException instanceof SQLiteDatabaseCorruptException))
      {
        i = 6;
        j = 1;
        break;
      }
      if ((paramException instanceof SQLiteFullException))
      {
        i = 7;
        j = 1;
        break;
      }
      if ((paramException instanceof SQLiteDiskIOException))
      {
        i = 8;
        j = 1;
        break;
      }
      if ((paramException instanceof SQLiteException))
      {
        i = 9;
        j = 1;
        break;
      }
      if ((paramException instanceof OperationApplicationException))
      {
        i = 10;
        j = 1;
        break;
      }
      if ((paramException instanceof OperationCanceledException))
      {
        i = 11;
        j = 0;
        break;
      }
      paramParcel.writeException(paramException);
      Log.e("WCDB.DatabaseUtils", "Writing exception to parcel", new Object[] { paramException });
      AppMethodBeat.o(12115);
    }
  }

  @Deprecated
  public static class InsertHelper
  {
    public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
    public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
    private HashMap<String, Integer> mColumns;
    private final SQLiteDatabase mDb;
    private String mInsertSQL = null;
    private SQLiteStatement mInsertStatement = null;
    private SQLiteStatement mPreparedStatement = null;
    private SQLiteStatement mReplaceStatement = null;
    private final String mTableName;

    public InsertHelper(SQLiteDatabase paramSQLiteDatabase, String paramString)
    {
      this.mDb = paramSQLiteDatabase;
      this.mTableName = paramString;
    }

    private void buildSQL()
    {
      Object localObject1 = null;
      AppMethodBeat.i(12096);
      StringBuilder localStringBuilder1 = new StringBuilder(128);
      localStringBuilder1.append("INSERT INTO ");
      localStringBuilder1.append(this.mTableName);
      localStringBuilder1.append(" (");
      StringBuilder localStringBuilder2 = new StringBuilder(128);
      localStringBuilder2.append("VALUES (");
      Object localObject3 = localObject1;
      Object localObject4;
      while (true)
      {
        try
        {
          localObject4 = this.mDb;
          localObject3 = localObject1;
          Object localObject5 = new java/lang/StringBuilder;
          localObject3 = localObject1;
          ((StringBuilder)localObject5).<init>("PRAGMA table_info(");
          localObject3 = localObject1;
          localObject4 = ((SQLiteDatabase)localObject4).rawQuery(this.mTableName + ")", null);
          localObject3 = localObject4;
          localObject1 = new java/util/HashMap;
          localObject3 = localObject4;
          ((HashMap)localObject1).<init>(((Cursor)localObject4).getCount());
          localObject3 = localObject4;
          this.mColumns = ((HashMap)localObject1);
          int i = 1;
          localObject3 = localObject4;
          if (!((Cursor)localObject4).moveToNext())
            break;
          localObject3 = localObject4;
          localObject1 = ((Cursor)localObject4).getString(1);
          localObject3 = localObject4;
          localObject5 = ((Cursor)localObject4).getString(4);
          localObject3 = localObject4;
          this.mColumns.put(localObject1, Integer.valueOf(i));
          localObject3 = localObject4;
          localStringBuilder1.append("'");
          localObject3 = localObject4;
          localStringBuilder1.append((String)localObject1);
          localObject3 = localObject4;
          localStringBuilder1.append("'");
          if (localObject5 == null)
          {
            localObject3 = localObject4;
            localStringBuilder2.append("?");
            localObject3 = localObject4;
            if (i != ((Cursor)localObject4).getCount())
              break label378;
            localObject1 = ") ";
            localObject3 = localObject4;
            localStringBuilder1.append((String)localObject1);
            localObject3 = localObject4;
            if (i != ((Cursor)localObject4).getCount())
              break label384;
            localObject1 = ");";
            localObject3 = localObject4;
            localStringBuilder2.append((String)localObject1);
            i++;
            continue;
          }
          localObject3 = localObject4;
          localStringBuilder2.append("COALESCE(?, ");
          localObject3 = localObject4;
          localStringBuilder2.append((String)localObject5);
          localObject3 = localObject4;
          localStringBuilder2.append(")");
          continue;
        }
        finally
        {
          if (localObject3 != null)
            localObject3.close();
          AppMethodBeat.o(12096);
        }
        label378: String str = ", ";
        continue;
        label384: str = ", ";
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      localStringBuilder1.append(localStringBuilder2);
      this.mInsertSQL = localStringBuilder1.toString();
      AppMethodBeat.o(12096);
    }

    private SQLiteStatement getStatement(boolean paramBoolean)
    {
      AppMethodBeat.i(12097);
      Object localObject;
      if (paramBoolean)
      {
        if (this.mReplaceStatement == null)
        {
          if (this.mInsertSQL == null)
            buildSQL();
          localObject = "INSERT OR REPLACE" + this.mInsertSQL.substring(6);
          this.mReplaceStatement = this.mDb.compileStatement((String)localObject);
        }
        localObject = this.mReplaceStatement;
        AppMethodBeat.o(12097);
      }
      while (true)
      {
        return localObject;
        if (this.mInsertStatement == null)
        {
          if (this.mInsertSQL == null)
            buildSQL();
          this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
        }
        localObject = this.mInsertStatement;
        AppMethodBeat.o(12097);
      }
    }

    private long insertInternal(ContentValues paramContentValues, boolean paramBoolean)
    {
      AppMethodBeat.i(12098);
      this.mDb.beginTransactionNonExclusive();
      try
      {
        SQLiteStatement localSQLiteStatement = getStatement(paramBoolean);
        localSQLiteStatement.clearBindings();
        localObject = paramContentValues.valueSet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          DatabaseUtils.bindObjectToProgram(localSQLiteStatement, getColumnIndex((String)localEntry.getKey()), localEntry.getValue());
        }
      }
      catch (SQLException localSQLException)
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Error inserting ");
        Log.e("WCDB.DatabaseUtils", paramContentValues + " into table  " + this.mTableName, new Object[] { localSQLException });
        this.mDb.endTransaction();
        long l = -1L;
        AppMethodBeat.o(12098);
        while (true)
        {
          return l;
          l = localSQLException.executeInsert();
          this.mDb.setTransactionSuccessful();
          this.mDb.endTransaction();
          AppMethodBeat.o(12098);
        }
      }
      finally
      {
        this.mDb.endTransaction();
        AppMethodBeat.o(12098);
      }
      throw paramContentValues;
    }

    public void bind(int paramInt, double paramDouble)
    {
      AppMethodBeat.i(12100);
      this.mPreparedStatement.bindDouble(paramInt, paramDouble);
      AppMethodBeat.o(12100);
    }

    public void bind(int paramInt, float paramFloat)
    {
      AppMethodBeat.i(12101);
      this.mPreparedStatement.bindDouble(paramInt, paramFloat);
      AppMethodBeat.o(12101);
    }

    public void bind(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(12103);
      this.mPreparedStatement.bindLong(paramInt1, paramInt2);
      AppMethodBeat.o(12103);
    }

    public void bind(int paramInt, long paramLong)
    {
      AppMethodBeat.i(12102);
      this.mPreparedStatement.bindLong(paramInt, paramLong);
      AppMethodBeat.o(12102);
    }

    public void bind(int paramInt, String paramString)
    {
      AppMethodBeat.i(12107);
      if (paramString == null)
      {
        this.mPreparedStatement.bindNull(paramInt);
        AppMethodBeat.o(12107);
      }
      while (true)
      {
        return;
        this.mPreparedStatement.bindString(paramInt, paramString);
        AppMethodBeat.o(12107);
      }
    }

    public void bind(int paramInt, boolean paramBoolean)
    {
      AppMethodBeat.i(12104);
      SQLiteStatement localSQLiteStatement = this.mPreparedStatement;
      if (paramBoolean);
      for (long l = 1L; ; l = 0L)
      {
        localSQLiteStatement.bindLong(paramInt, l);
        AppMethodBeat.o(12104);
        return;
      }
    }

    public void bind(int paramInt, byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(12106);
      if (paramArrayOfByte == null)
      {
        this.mPreparedStatement.bindNull(paramInt);
        AppMethodBeat.o(12106);
      }
      while (true)
      {
        return;
        this.mPreparedStatement.bindBlob(paramInt, paramArrayOfByte);
        AppMethodBeat.o(12106);
      }
    }

    public void bindNull(int paramInt)
    {
      AppMethodBeat.i(12105);
      this.mPreparedStatement.bindNull(paramInt);
      AppMethodBeat.o(12105);
    }

    public void close()
    {
      AppMethodBeat.i(12113);
      if (this.mInsertStatement != null)
      {
        this.mInsertStatement.close();
        this.mInsertStatement = null;
      }
      if (this.mReplaceStatement != null)
      {
        this.mReplaceStatement.close();
        this.mReplaceStatement = null;
      }
      this.mInsertSQL = null;
      this.mColumns = null;
      AppMethodBeat.o(12113);
    }

    public long execute()
    {
      AppMethodBeat.i(12109);
      Object localObject1;
      if (this.mPreparedStatement == null)
      {
        localObject1 = new IllegalStateException("you must prepare this inserter before calling execute");
        AppMethodBeat.o(12109);
        throw ((Throwable)localObject1);
      }
      try
      {
        l = this.mPreparedStatement.executeInsert();
        return l;
      }
      catch (SQLException localSQLException)
      {
        while (true)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("Error executing InsertHelper with table ");
          Log.e("WCDB.DatabaseUtils", this.mTableName, new Object[] { localSQLException });
          this.mPreparedStatement = null;
          long l = -1L;
          AppMethodBeat.o(12109);
        }
      }
      finally
      {
        this.mPreparedStatement = null;
        AppMethodBeat.o(12109);
      }
    }

    public int getColumnIndex(String paramString)
    {
      AppMethodBeat.i(12099);
      getStatement(false);
      Integer localInteger = (Integer)this.mColumns.get(paramString);
      if (localInteger == null)
      {
        paramString = new IllegalArgumentException("column '" + paramString + "' is invalid");
        AppMethodBeat.o(12099);
        throw paramString;
      }
      int i = localInteger.intValue();
      AppMethodBeat.o(12099);
      return i;
    }

    public long insert(ContentValues paramContentValues)
    {
      AppMethodBeat.i(12108);
      long l = insertInternal(paramContentValues, false);
      AppMethodBeat.o(12108);
      return l;
    }

    public void prepareForInsert()
    {
      AppMethodBeat.i(12110);
      this.mPreparedStatement = getStatement(false);
      this.mPreparedStatement.clearBindings();
      AppMethodBeat.o(12110);
    }

    public void prepareForReplace()
    {
      AppMethodBeat.i(12111);
      this.mPreparedStatement = getStatement(true);
      this.mPreparedStatement.clearBindings();
      AppMethodBeat.o(12111);
    }

    public long replace(ContentValues paramContentValues)
    {
      AppMethodBeat.i(12112);
      long l = insertInternal(paramContentValues, true);
      AppMethodBeat.o(12112);
      return l;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.DatabaseUtils
 * JD-Core Version:    0.6.2
 */