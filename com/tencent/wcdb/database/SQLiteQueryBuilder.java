package com.tencent.wcdb.database;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLiteQueryBuilder
{
  private static final String TAG = "WCDB.SQLiteQueryBuilder";
  private static final Pattern sLimitPattern;
  private boolean mDistinct = false;
  private SQLiteDatabase.CursorFactory mFactory = null;
  private Map<String, String> mProjectionMap = null;
  private boolean mStrict;
  private String mTables = "";
  private StringBuilder mWhereClause = null;

  static
  {
    AppMethodBeat.i(12600);
    sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    AppMethodBeat.o(12600);
  }

  private static void appendClause(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    AppMethodBeat.i(12588);
    if (!TextUtils.isEmpty(paramString2))
    {
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(paramString2);
    }
    AppMethodBeat.o(12588);
  }

  public static void appendColumns(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    AppMethodBeat.i(12589);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      if (str != null)
      {
        if (j > 0)
          paramStringBuilder.append(", ");
        paramStringBuilder.append(str);
      }
    }
    paramStringBuilder.append(' ');
    AppMethodBeat.o(12589);
  }

  public static String buildQueryString(boolean paramBoolean, String paramString1, String[] paramArrayOfString, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(12587);
    if ((TextUtils.isEmpty(paramString3)) && (!TextUtils.isEmpty(paramString4)))
    {
      paramString1 = new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
      AppMethodBeat.o(12587);
      throw paramString1;
    }
    if ((!TextUtils.isEmpty(paramString6)) && (!sLimitPattern.matcher(paramString6).matches()))
    {
      paramString1 = new IllegalArgumentException("invalid LIMIT clauses:".concat(String.valueOf(paramString6)));
      AppMethodBeat.o(12587);
      throw paramString1;
    }
    StringBuilder localStringBuilder = new StringBuilder(120);
    localStringBuilder.append("SELECT ");
    if (paramBoolean)
      localStringBuilder.append("DISTINCT ");
    if ((paramArrayOfString != null) && (paramArrayOfString.length != 0))
      appendColumns(localStringBuilder, paramArrayOfString);
    while (true)
    {
      localStringBuilder.append("FROM ");
      localStringBuilder.append(paramString1);
      appendClause(localStringBuilder, " WHERE ", paramString2);
      appendClause(localStringBuilder, " GROUP BY ", paramString3);
      appendClause(localStringBuilder, " HAVING ", paramString4);
      appendClause(localStringBuilder, " ORDER BY ", paramString5);
      appendClause(localStringBuilder, " LIMIT ", paramString6);
      paramString1 = localStringBuilder.toString();
      AppMethodBeat.o(12587);
      return paramString1;
      localStringBuilder.append("* ");
    }
  }

  private String[] computeProjection(String[] paramArrayOfString)
  {
    AppMethodBeat.i(12599);
    Object localObject1;
    int j;
    Object localObject2;
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      if (this.mProjectionMap != null)
      {
        localObject1 = new String[paramArrayOfString.length];
        int i = paramArrayOfString.length;
        j = 0;
        if (j < i)
        {
          localObject2 = paramArrayOfString[j];
          String str = (String)this.mProjectionMap.get(localObject2);
          if (str != null)
            localObject1[j] = str;
          while (true)
          {
            j++;
            break;
            if ((this.mStrict) || ((!((String)localObject2).contains(" AS ")) && (!((String)localObject2).contains(" as "))))
              break label115;
            localObject1[j] = localObject2;
          }
          label115: paramArrayOfString = new IllegalArgumentException("Invalid column " + paramArrayOfString[j]);
          AppMethodBeat.o(12599);
          throw paramArrayOfString;
        }
        AppMethodBeat.o(12599);
        paramArrayOfString = (String[])localObject1;
      }
    while (true)
    {
      return paramArrayOfString;
      AppMethodBeat.o(12599);
      continue;
      if (this.mProjectionMap != null)
      {
        localObject1 = this.mProjectionMap.entrySet();
        paramArrayOfString = new String[((Set)localObject1).size()];
        localObject2 = ((Set)localObject1).iterator();
        j = 0;
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (Map.Entry)((Iterator)localObject2).next();
          if (!((String)((Map.Entry)localObject1).getKey()).equals("_count"))
          {
            paramArrayOfString[j] = ((String)((Map.Entry)localObject1).getValue());
            j++;
          }
        }
        AppMethodBeat.o(12599);
      }
      else
      {
        paramArrayOfString = null;
        AppMethodBeat.o(12599);
      }
    }
  }

  private void validateQuerySql(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12593);
    paramSQLiteDatabase.getThreadSession().prepare(paramString, paramSQLiteDatabase.getThreadDefaultConnectionFlags(true), paramCancellationSignal, null);
    AppMethodBeat.o(12593);
  }

  public void appendWhere(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(12585);
    if (this.mWhereClause == null)
      this.mWhereClause = new StringBuilder(paramCharSequence.length() + 16);
    if (this.mWhereClause.length() == 0)
      this.mWhereClause.append('(');
    this.mWhereClause.append(paramCharSequence);
    AppMethodBeat.o(12585);
  }

  public void appendWhereEscapeString(String paramString)
  {
    AppMethodBeat.i(12586);
    if (this.mWhereClause == null)
      this.mWhereClause = new StringBuilder(paramString.length() + 16);
    if (this.mWhereClause.length() == 0)
      this.mWhereClause.append('(');
    DatabaseUtils.appendEscapedSQLString(this.mWhereClause, paramString);
    AppMethodBeat.o(12586);
  }

  public String buildQuery(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(12594);
    String[] arrayOfString = computeProjection(paramArrayOfString);
    paramArrayOfString = new StringBuilder();
    if ((this.mWhereClause != null) && (this.mWhereClause.length() > 0));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        paramArrayOfString.append(this.mWhereClause.toString());
        paramArrayOfString.append(')');
      }
      if ((paramString1 != null) && (paramString1.length() > 0))
      {
        if (i != 0)
          paramArrayOfString.append(" AND ");
        paramArrayOfString.append('(');
        paramArrayOfString.append(paramString1);
        paramArrayOfString.append(')');
      }
      paramArrayOfString = buildQueryString(this.mDistinct, this.mTables, arrayOfString, paramArrayOfString.toString(), paramString2, paramString3, paramString4, paramString5);
      AppMethodBeat.o(12594);
      return paramArrayOfString;
    }
  }

  @Deprecated
  public String buildQuery(String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(12595);
    paramArrayOfString1 = buildQuery(paramArrayOfString1, paramString1, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(12595);
    return paramArrayOfString1;
  }

  public String buildUnionQuery(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    AppMethodBeat.i(12598);
    StringBuilder localStringBuilder = new StringBuilder(128);
    int i = paramArrayOfString.length;
    if (this.mDistinct);
    for (String str = " UNION "; ; str = " UNION ALL ")
      for (int j = 0; j < i; j++)
      {
        if (j > 0)
          localStringBuilder.append(str);
        localStringBuilder.append(paramArrayOfString[j]);
      }
    appendClause(localStringBuilder, " ORDER BY ", paramString1);
    appendClause(localStringBuilder, " LIMIT ", paramString2);
    paramArrayOfString = localStringBuilder.toString();
    AppMethodBeat.o(12598);
    return paramArrayOfString;
  }

  public String buildUnionSubQuery(String paramString1, String[] paramArrayOfString, Set<String> paramSet, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(12596);
    int i = paramArrayOfString.length;
    String[] arrayOfString = new String[i];
    int j = 0;
    if (j < i)
    {
      String str = paramArrayOfString[j];
      if (str.equals(paramString1))
        arrayOfString[j] = ("'" + paramString2 + "' AS " + paramString1);
      while (true)
      {
        j++;
        break;
        if ((j <= paramInt) || (paramSet.contains(str)))
          arrayOfString[j] = str;
        else
          arrayOfString[j] = "NULL AS ".concat(String.valueOf(str));
      }
    }
    paramString1 = buildQuery(arrayOfString, paramString3, paramString4, paramString5, null, null);
    AppMethodBeat.o(12596);
    return paramString1;
  }

  @Deprecated
  public String buildUnionSubQuery(String paramString1, String[] paramArrayOfString1, Set<String> paramSet, int paramInt, String paramString2, String paramString3, String[] paramArrayOfString2, String paramString4, String paramString5)
  {
    AppMethodBeat.i(12597);
    paramString1 = buildUnionSubQuery(paramString1, paramArrayOfString1, paramSet, paramInt, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(12597);
    return paramString1;
  }

  public String getTables()
  {
    return this.mTables;
  }

  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(12590);
    paramSQLiteDatabase = query(paramSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramString3, paramString4, null, null);
    AppMethodBeat.o(12590);
    return paramSQLiteDatabase;
  }

  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(12591);
    paramSQLiteDatabase = query(paramSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramString3, paramString4, paramString5, null);
    AppMethodBeat.o(12591);
    return paramSQLiteDatabase;
  }

  public Cursor query(SQLiteDatabase paramSQLiteDatabase, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, String paramString3, String paramString4, String paramString5, CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(12592);
    if (this.mTables == null)
    {
      paramSQLiteDatabase = null;
      AppMethodBeat.o(12592);
    }
    while (true)
    {
      return paramSQLiteDatabase;
      if ((this.mStrict) && (paramString1 != null) && (paramString1.length() > 0))
        validateQuerySql(paramSQLiteDatabase, buildQuery(paramArrayOfString1, "(" + paramString1 + ")", paramString2, paramString3, paramString4, paramString5), paramCancellationSignal);
      paramArrayOfString1 = buildQuery(paramArrayOfString1, paramString1, paramString2, paramString3, paramString4, paramString5);
      Log.d("WCDB.SQLiteQueryBuilder", "Performing query: ".concat(String.valueOf(paramArrayOfString1)));
      paramSQLiteDatabase = paramSQLiteDatabase.rawQueryWithFactory(this.mFactory, paramArrayOfString1, paramArrayOfString2, SQLiteDatabase.findEditTable(this.mTables), paramCancellationSignal);
      AppMethodBeat.o(12592);
    }
  }

  public void setCursorFactory(SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    this.mFactory = paramCursorFactory;
  }

  public void setDistinct(boolean paramBoolean)
  {
    this.mDistinct = paramBoolean;
  }

  public void setProjectionMap(Map<String, String> paramMap)
  {
    this.mProjectionMap = paramMap;
  }

  public void setStrict(boolean paramBoolean)
  {
    this.mStrict = paramBoolean;
  }

  public void setTables(String paramString)
  {
    this.mTables = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteQueryBuilder
 * JD-Core Version:    0.6.2
 */