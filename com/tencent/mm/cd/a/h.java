package com.tencent.mm.cd.a;

import android.database.CursorIndexOutOfBoundsException;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectQuery;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public final class h extends SQLiteDirectQuery
{
  h(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, null, paramCancellationSignal);
  }

  final int a(b paramb, int paramInt1, int paramInt2)
  {
    int i = 1;
    AppMethodBeat.i(59207);
    acquireReference();
    paramb.acquireReference();
    if (paramInt1 > 0);
    while (true)
    {
      int j;
      try
      {
        j = step(paramInt1);
        if (j < paramInt1)
        {
          Log.w("WCDB.SQLiteNewQuery", "startPos %d > actual rows %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(j) });
          paramb.releaseReference();
          releaseReference();
          AppMethodBeat.o(59207);
          paramInt1 = j;
          return paramInt1;
        }
        int k = getColumnNames().length;
        j = paramInt1;
        if (j >= paramInt2 + paramInt1)
          break label390;
        m = i;
        if (step(1) != 1)
          break label393;
        paramb.ycl = paramb.dvz();
        m = 0;
        if (m >= k)
          break label377;
        switch (getType(m))
        {
        default:
          paramb.ha(j, 1);
          SQLiteException localSQLiteException1 = new com/tencent/wcdb/database/SQLiteException;
          localSQLiteException1.<init>("Unknown column type when filling window.");
          AppMethodBeat.o(59207);
          throw localSQLiteException1;
        case 3:
        case 0:
        case 1:
        case 2:
        case 4:
        }
      }
      catch (SQLiteException localSQLiteException2)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("exception: ");
        Log.e("WCDB.SQLiteNewQuery", localSQLiteException2.getMessage() + "; query: " + getSql());
        checkCorruption(localSQLiteException2);
        AppMethodBeat.o(59207);
        throw localSQLiteException2;
      }
      finally
      {
        paramb.releaseReference();
        releaseReference();
        AppMethodBeat.o(59207);
      }
      Object localObject2 = getString(m);
      if (paramb.ycl != null)
        paramb.ycl.bK(m, (String)localObject2);
      while (true)
      {
        m++;
        break;
        long l = getLong(m);
        if (paramb.ycl != null)
        {
          paramb.ycl.ag(m, l);
          continue;
          getDouble(m);
          continue;
          localObject2 = getBlob(m);
          if (paramb.ycl != null)
            paramb.ycl.q(m, (byte[])localObject2);
        }
      }
      label377: paramb.ha(j, 0);
      j++;
      continue;
      label390: int m = 0;
      label393: paramInt1 = j;
      if (m == 0)
        paramInt1 = j + step(2147483647);
      reset(true);
      paramb.releaseReference();
      releaseReference();
      AppMethodBeat.o(59207);
    }
  }

  final int a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59208);
    acquireReference();
    if (paramInt1 > 0);
    int i;
    while (true)
    {
      c.a locala;
      try
      {
        i = step(paramInt1);
        if (i < paramInt1)
        {
          Log.w("WCDB.SQLiteNewQuery", "startPos %d > actual rows %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
          releaseReference();
          AppMethodBeat.o(59208);
          paramInt1 = i;
          return paramInt1;
        }
        int j = getColumnNames().length;
        i = paramInt1;
        if (i >= paramInt2 + paramInt1)
          break label530;
        if (step(1) != 1)
          break;
        k = i / paramc.ycn;
        if (paramc.ycm.indexOfKey(k) < 0)
        {
          Object[] arrayOfObject1 = new Object[paramc.ycn * paramc.columnCount];
          paramc.ycm.put(k, arrayOfObject1);
          k = paramc.ycn;
          int m = paramc.columnCount * (i % k);
          n = paramc.columnCount;
          k = i + 1;
          if (k <= paramc.yco)
            break label357;
          paramc.yco = k;
          locala = new com/tencent/mm/cd/a/c$a;
          locala.<init>(paramc, m, m + n, arrayOfObject1);
          k = 0;
          if (k >= j)
            break label485;
          switch (getType(k))
          {
          default:
            paramc = new com/tencent/wcdb/database/SQLiteException;
            paramc.<init>("Unknown column type when filling window.");
            AppMethodBeat.o(59208);
            throw paramc;
          case 3:
          case 1:
          case 2:
          case 0:
          case 4:
          }
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        paramc = new java/lang/StringBuilder;
        paramc.<init>("exception: ");
        Log.e("WCDB.SQLiteNewQuery", localSQLiteException.getMessage() + "; query: " + getSql());
        checkCorruption(localSQLiteException);
        AppMethodBeat.o(59208);
        throw localSQLiteException;
      }
      finally
      {
        releaseReference();
        AppMethodBeat.o(59208);
      }
      Object localObject = (Object[])paramc.ycm.get(k);
      continue;
      label357: int k = paramc.yco;
      continue;
      localObject = getString(k);
      while (locala.index == locala.endIndex)
      {
        paramc = new android/database/CursorIndexOutOfBoundsException;
        paramc.<init>("No more columns left.");
        AppMethodBeat.o(59208);
        throw paramc;
        localObject = Long.valueOf(getLong(k));
        continue;
        localObject = Double.valueOf(getDouble(k));
        continue;
        localObject = null;
        continue;
        localObject = getBlob(k);
      }
      Object[] arrayOfObject2 = locala.ycp;
      int n = locala.index;
      locala.index = (n + 1);
      arrayOfObject2[n] = localObject;
      k++;
      continue;
      label485: i++;
    }
    label530: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if (paramInt1 == 0);
      for (paramInt1 = step(2147483647) + i; ; paramInt1 = i)
      {
        reset(true);
        releaseReference();
        AppMethodBeat.o(59208);
        break;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(59209);
    String str = "SQLiteNewQuery: " + getSql();
    AppMethodBeat.o(59209);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.h
 * JD-Core Version:    0.6.2
 */