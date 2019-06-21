package com.tencent.mm.cd.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteCursorDriver;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.CursorFactory;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class f extends AbstractCursor
  implements d
{
  public static final SQLiteDatabase.CursorFactory FACTORY;
  private Map<String, Integer> mColumnNameMap;
  private final String[] mColumns;
  private int mCount;
  private final SQLiteCursorDriver mDriver;
  private final String mEditTable;
  private final Throwable mStackTrace;
  private int pageSize;
  private final h ycu;
  public a ycv;
  private boolean ycw;
  private b<a> ycx;
  c ycy;
  private boolean ycz;

  static
  {
    AppMethodBeat.i(59204);
    FACTORY = new SQLiteDatabase.CursorFactory()
    {
      public final Cursor newCursor(SQLiteDatabase paramAnonymousSQLiteDatabase, SQLiteCursorDriver paramAnonymousSQLiteCursorDriver, String paramAnonymousString, SQLiteProgram paramAnonymousSQLiteProgram)
      {
        AppMethodBeat.i(59179);
        paramAnonymousSQLiteDatabase = new f(paramAnonymousSQLiteCursorDriver, paramAnonymousString, (h)paramAnonymousSQLiteProgram);
        AppMethodBeat.o(59179);
        return paramAnonymousSQLiteDatabase;
      }

      public final SQLiteProgram newQuery(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString, Object[] paramAnonymousArrayOfObject, CancellationSignal paramAnonymousCancellationSignal)
      {
        AppMethodBeat.i(59180);
        paramAnonymousSQLiteDatabase = new h(paramAnonymousSQLiteDatabase, paramAnonymousString, paramAnonymousCancellationSignal);
        AppMethodBeat.o(59180);
        return paramAnonymousSQLiteDatabase;
      }
    };
    AppMethodBeat.o(59204);
  }

  public f(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, h paramh)
  {
    AppMethodBeat.i(59181);
    this.mCount = -1;
    this.pageSize = 3000;
    if (paramh == null)
    {
      paramSQLiteCursorDriver = new IllegalArgumentException("query object cannot be null");
      AppMethodBeat.o(59181);
      throw paramSQLiteCursorDriver;
    }
    this.mStackTrace = null;
    this.mDriver = paramSQLiteCursorDriver;
    this.mEditTable = paramString;
    this.mColumnNameMap = null;
    this.ycu = paramh;
    this.mColumns = paramh.getColumnNames();
    this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
    AppMethodBeat.o(59181);
  }

  private int MJ(int paramInt)
  {
    AppMethodBeat.i(59186);
    if (this.ycw)
    {
      if (this.ycx == null)
        this.ycx = new b()
        {
          public final ArrayList<a> ao(ArrayList<Object> paramAnonymousArrayList)
          {
            AppMethodBeat.i(59178);
            f localf = f.this;
            if (localf.ycv != null)
            {
              paramAnonymousArrayList = localf.ycv.ao(paramAnonymousArrayList);
              AppMethodBeat.o(59178);
            }
            while (true)
            {
              return paramAnonymousArrayList;
              paramAnonymousArrayList = null;
              AppMethodBeat.o(59178);
            }
          }

          public final a dvz()
          {
            AppMethodBeat.i(59177);
            Object localObject = f.this;
            if (((f)localObject).ycv != null)
            {
              localObject = ((f)localObject).ycv.dvz();
              AppMethodBeat.o(59177);
            }
            while (true)
            {
              return localObject;
              localObject = null;
              AppMethodBeat.o(59177);
            }
          }
        };
      this.ycx.mStartPos = paramInt;
      paramInt = this.ycu.a(this.ycx, paramInt, this.pageSize);
      AppMethodBeat.o(59186);
    }
    while (true)
    {
      return paramInt;
      dvA();
      paramInt = this.ycu.a(this.ycy, paramInt, this.pageSize);
      AppMethodBeat.o(59186);
    }
  }

  private void dvA()
  {
    AppMethodBeat.i(59183);
    if (this.ycy == null)
      this.ycy = new c(this.mColumns, (byte)0);
    AppMethodBeat.o(59183);
  }

  public final boolean MF(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!this.ycw)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      b localb = this.ycx;
      bool2 = bool1;
      if (paramInt <= 50)
        if (localb.yci < 10)
        {
          bool2 = true;
        }
        else
        {
          bool2 = bool1;
          if (paramInt / localb.yci < 0.1D)
            bool2 = true;
        }
    }
  }

  public final a MG(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    AppMethodBeat.i(59200);
    b localb;
    if (this.ycx != null)
    {
      localb = this.ycx;
      if (localb.MI(paramInt))
      {
        Object localObject3 = localb.ych.get(paramInt);
        localObject1 = (a)localb.ycj.get(localObject3);
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          ab.i("MicroMsg.CursorDataWindow", "get data null %s", new Object[] { localObject3 });
          if (localb.yck.size() != 0)
          {
            localObject1 = localb.ao(localb.yck);
            if (localObject1 != null)
              if (i < ((ArrayList)localObject1).size())
              {
                localObject2 = (a)((ArrayList)localObject1).get(i);
                if (localObject2 != null)
                  localb.b(((a)localObject2).getKey(), (a)localObject2);
                while (true)
                {
                  i++;
                  break;
                  ab.e("MicroMsg.CursorDataWindow", "newcursor obj is null");
                }
              }
            localb.yck.clear();
          }
          localObject1 = (a)localb.ycj.get(localObject3);
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            ab.e("MicroMsg.CursorDataWindow", "newcursor error obj : " + localObject3 + "pos:" + paramInt);
            localObject2 = localObject1;
          }
        }
        AppMethodBeat.o(59200);
      }
    }
    while (true)
    {
      return localObject2;
      ab.e("MicroMsg.CursorDataWindow", "newcursor cursor getItem error: pos " + paramInt + " loaded num :" + localb.ych.size());
      break;
      AppMethodBeat.o(59200);
      localObject2 = localObject1;
    }
  }

  public final void MH(int paramInt)
  {
    if ((paramInt <= 15000) && (paramInt >= 2000))
      this.pageSize = paramInt;
  }

  public final void a(a parama)
  {
    this.ycv = parama;
  }

  public final boolean a(Object paramObject, a parama)
  {
    AppMethodBeat.i(59201);
    b localb;
    if ((this.ycw) && (this.ycx != null))
    {
      if ((!this.ycz) && ((paramObject instanceof Object[])) && (this.ycx.cK(paramObject)))
      {
        this.mCount -= ((Object[])paramObject).length;
        this.pageSize -= ((Object[])paramObject).length;
      }
      localb = this.ycx;
      if (parama != null)
      {
        ab.v("MicroMsg.CursorDataWindow", "newcursor cursor update Memory key : " + paramObject + "values : " + parama);
        localb.b(paramObject, parama);
        AppMethodBeat.o(59201);
      }
    }
    while (true)
    {
      return false;
      if ((paramObject instanceof Object[]))
      {
        for (parama : (Object[])paramObject)
          localb.ycj.remove(parama);
        localb.z(paramObject);
        break;
      }
      if (localb.yck == null)
        localb.yck = new ArrayList();
      if (!localb.yck.contains(paramObject))
      {
        localb.yck.add(paramObject);
        ab.i("MicroMsg.CursorDataWindow", "newcursor cursor clearData : ".concat(String.valueOf(paramObject)));
      }
      localb.ycj.remove(paramObject);
      break;
      if (!this.ycw)
      {
        paramObject = this.ycy;
        paramObject.mPos = 0;
        paramObject.ycm.clear();
      }
      AppMethodBeat.o(59201);
    }
  }

  public final boolean cK(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(59202);
    if (!this.ycw)
      AppMethodBeat.o(59202);
    while (true)
    {
      return bool;
      if (this.ycx == null)
      {
        AppMethodBeat.o(59202);
      }
      else
      {
        bool = this.ycx.cK(paramObject);
        AppMethodBeat.o(59202);
      }
    }
  }

  public final a cL(Object paramObject)
  {
    Object localObject = null;
    AppMethodBeat.i(59203);
    if (!this.ycw)
    {
      Log.e("WCDB.SQLiteNewCursor", "newcursor getItemByKey error ".concat(String.valueOf(paramObject)));
      AppMethodBeat.o(59203);
      paramObject = localObject;
    }
    while (true)
    {
      return paramObject;
      if (this.ycx == null)
      {
        Log.e("WCDB.SQLiteNewCursor", "newcursor error getItemByKey window is null");
        AppMethodBeat.o(59203);
        paramObject = localObject;
      }
      else
      {
        b localb = this.ycx;
        if (localb.ycj == null)
        {
          AppMethodBeat.o(59203);
          paramObject = localObject;
        }
        else
        {
          paramObject = (a)localb.ycj.get(paramObject);
          AppMethodBeat.o(59203);
        }
      }
    }
  }

  public final void checkPosition()
  {
    AppMethodBeat.i(59185);
    super.checkPosition();
    AppMethodBeat.o(59185);
  }

  public final void close()
  {
    AppMethodBeat.i(59189);
    super.close();
    try
    {
      this.ycu.close();
      this.mDriver.cursorClosed();
      return;
    }
    finally
    {
      AppMethodBeat.o(59189);
    }
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final void deactivate()
  {
    AppMethodBeat.i(59188);
    super.deactivate();
    this.mDriver.cursorDeactivated();
    AppMethodBeat.o(59188);
  }

  public final SparseArray<Object>[] dvp()
  {
    Object localObject;
    if (!this.ycw)
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = new SparseArray[1];
      localObject[0] = this.ycx.ych;
    }
  }

  public final HashMap dvq()
  {
    return this.ycx.ycj;
  }

  public final boolean dvr()
  {
    return this.ycz;
  }

  public final void finalize()
  {
    AppMethodBeat.i(59191);
    try
    {
      if (this.ycx != null)
        close();
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(59191);
    }
  }

  public final byte[] getBlob(int paramInt)
  {
    AppMethodBeat.i(59199);
    byte[] arrayOfByte;
    if (!this.ycw)
    {
      arrayOfByte = this.ycy.getBlob(paramInt);
      AppMethodBeat.o(59199);
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = null;
      AppMethodBeat.o(59199);
    }
  }

  public final int getColumnIndex(String paramString)
  {
    AppMethodBeat.i(59187);
    if (this.mColumnNameMap == null)
    {
      String[] arrayOfString = this.mColumns;
      int i = arrayOfString.length;
      localObject = new HashMap(i, 1.0F);
      for (j = 0; j < i; j++)
        ((HashMap)localObject).put(arrayOfString[j], Integer.valueOf(j));
      this.mColumnNameMap = ((Map)localObject);
    }
    int j = paramString.lastIndexOf('.');
    Object localObject = paramString;
    if (j != -1)
    {
      localObject = new Exception();
      Log.e("WCDB.SQLiteNewCursor", "requesting column name with table name -- ".concat(String.valueOf(paramString)), new Object[] { localObject });
      localObject = paramString.substring(j + 1);
    }
    paramString = (Integer)this.mColumnNameMap.get(localObject);
    if (paramString != null)
    {
      j = paramString.intValue();
      AppMethodBeat.o(59187);
    }
    while (true)
    {
      return j;
      AppMethodBeat.o(59187);
      j = -1;
    }
  }

  public final String[] getColumnNames()
  {
    return this.mColumns;
  }

  public final int getCount()
  {
    int i = 0;
    AppMethodBeat.i(59184);
    boolean bool;
    if (this.mCount == -1)
    {
      this.mCount = MJ(0);
      if (this.ycx != null)
      {
        if ((this.mCount == -1) || (this.mCount != this.ycx.ych.size()))
          break label93;
        bool = true;
        this.ycz = bool;
      }
    }
    if ((this.ycw) && (this.ycz))
      if (this.ycx == null)
        AppMethodBeat.o(59184);
    while (true)
    {
      return i;
      label93: bool = false;
      break;
      i = this.ycx.ych.size();
      AppMethodBeat.o(59184);
      continue;
      i = this.mCount;
      AppMethodBeat.o(59184);
    }
  }

  public final double getDouble(int paramInt)
  {
    AppMethodBeat.i(59197);
    double d;
    if (!this.ycw)
    {
      d = this.ycy.getDouble(paramInt);
      AppMethodBeat.o(59197);
    }
    while (true)
    {
      return d;
      d = 0.0D;
      AppMethodBeat.o(59197);
    }
  }

  public final float getFloat(int paramInt)
  {
    AppMethodBeat.i(59196);
    float f;
    if (!this.ycw)
    {
      f = this.ycy.getFloat(paramInt);
      AppMethodBeat.o(59196);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(59196);
    }
  }

  public final int getInt(int paramInt)
  {
    AppMethodBeat.i(59194);
    if (!this.ycw)
    {
      paramInt = this.ycy.getInt(paramInt);
      AppMethodBeat.o(59194);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(59194);
    }
  }

  public final long getLong(int paramInt)
  {
    AppMethodBeat.i(59195);
    long l;
    if (!this.ycw)
    {
      l = this.ycy.getLong(paramInt);
      AppMethodBeat.o(59195);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(59195);
    }
  }

  public final short getShort(int paramInt)
  {
    AppMethodBeat.i(59193);
    if (!this.ycw)
    {
      paramInt = this.ycy.getShort(paramInt);
      AppMethodBeat.o(59193);
    }
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      return i;
      paramInt = 0;
      AppMethodBeat.o(59193);
    }
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(59192);
    String str;
    if (!this.ycw)
    {
      str = this.ycy.getString(paramInt);
      AppMethodBeat.o(59192);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(59192);
    }
  }

  public final boolean isNull(int paramInt)
  {
    AppMethodBeat.i(59198);
    boolean bool;
    if (!this.ycw)
    {
      bool = this.ycy.isNull(paramInt);
      AppMethodBeat.o(59198);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59198);
    }
  }

  public final boolean onMove(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59182);
    if (this.ycw)
    {
      if ((this.ycx == null) || (!this.ycx.MI(paramInt2)))
        MJ(paramInt2 / this.pageSize * this.pageSize);
      AppMethodBeat.o(59182);
      return true;
    }
    if (this.ycy == null)
      dvA();
    c localc = this.ycy;
    paramInt1 = paramInt2 / localc.ycn;
    if (localc.ycm.indexOfKey(paramInt1) >= 0)
    {
      int i = localc.ycn;
      int j = localc.columnCount;
      if (((Object[])localc.ycm.get(paramInt1))[(paramInt2 % i * j)] == null);
    }
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if (paramInt1 == 0)
        MJ(paramInt2 / this.pageSize * this.pageSize);
      this.ycy.moveToPosition(paramInt2);
      break;
    }
  }

  public final void pt(boolean paramBoolean)
  {
    this.ycw = paramBoolean;
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  // ERROR //
  public final boolean requery()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 441
    //   5: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 444	com/tencent/mm/cd/a/f:isClosed	()Z
    //   12: ifeq +13 -> 25
    //   15: ldc_w 441
    //   18: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iload_1
    //   22: istore_2
    //   23: iload_2
    //   24: ireturn
    //   25: aload_0
    //   26: monitorenter
    //   27: aload_0
    //   28: getfield 83	com/tencent/mm/cd/a/f:ycu	Lcom/tencent/mm/cd/a/h;
    //   31: invokevirtual 448	com/tencent/mm/cd/a/h:getDatabase	()Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   34: invokevirtual 453	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   37: ifne +16 -> 53
    //   40: aload_0
    //   41: monitorexit
    //   42: ldc_w 441
    //   45: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: iload_1
    //   49: istore_2
    //   50: goto -27 -> 23
    //   53: aload_0
    //   54: getfield 107	com/tencent/mm/cd/a/f:ycx	Lcom/tencent/mm/cd/a/b;
    //   57: ifnull +10 -> 67
    //   60: aload_0
    //   61: getfield 107	com/tencent/mm/cd/a/f:ycx	Lcom/tencent/mm/cd/a/b;
    //   64: invokevirtual 456	com/tencent/mm/cd/a/b:clearData	()V
    //   67: aload_0
    //   68: iconst_m1
    //   69: putfield 457	com/tencent/mm/cd/a/f:mPos	I
    //   72: aload_0
    //   73: iconst_m1
    //   74: putfield 64	com/tencent/mm/cd/a/f:mCount	I
    //   77: aload_0
    //   78: getfield 77	com/tencent/mm/cd/a/f:mDriver	Lcom/tencent/wcdb/database/SQLiteCursorDriver;
    //   81: aload_0
    //   82: invokeinterface 461 2 0
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_0
    //   90: invokespecial 463	com/tencent/wcdb/AbstractCursor:requery	()Z
    //   93: istore_2
    //   94: ldc_w 441
    //   97: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: goto -77 -> 23
    //   103: astore_3
    //   104: aload_0
    //   105: monitorexit
    //   106: ldc_w 441
    //   109: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: aload_3
    //   113: athrow
    //   114: astore_3
    //   115: ldc_w 297
    //   118: new 211	java/lang/StringBuilder
    //   121: dup
    //   122: ldc_w 465
    //   125: invokespecial 214	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: aload_3
    //   129: invokevirtual 468	java/lang/IllegalStateException:getMessage	()Ljava/lang/String;
    //   132: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: iconst_1
    //   139: anewarray 172	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_3
    //   145: aastore
    //   146: invokestatic 471	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: ldc_w 441
    //   152: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: iload_1
    //   156: istore_2
    //   157: goto -134 -> 23
    //
    // Exception table:
    //   from	to	target	type
    //   27	42	103	finally
    //   53	67	103	finally
    //   67	89	103	finally
    //   104	106	103	finally
    //   89	94	114	java/lang/IllegalStateException
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public static abstract interface a
  {
    public abstract ArrayList<a> ao(ArrayList<Object> paramArrayList);

    public abstract a dvz();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.f
 * JD-Core Version:    0.6.2
 */