package com.tencent.mm.plugin.f.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends j<a>
{
  public static final String[] diI;
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(18640);
    fnj = new String[] { j.a(a.ccO, "WxFileIndex2"), "DROP TABLE IF EXISTS WxFileIndex" };
    diI = new String[] { "CREATE  INDEX IF NOT EXISTS msgid_username_index ON WxFileIndex2 ( msgId,username,msgSubType ) ", "CREATE  INDEX IF NOT EXISTS username_type_index ON WxFileIndex2 ( username,msgtime,msgSubType ) " };
    AppMethodBeat.o(18640);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "WxFileIndex2", diI);
    this.bSd = parame;
  }

  public final List<a> S(bi parambi)
  {
    Cursor localCursor1 = null;
    Cursor localCursor2 = null;
    ArrayList localArrayList = null;
    AppMethodBeat.i(18637);
    if (parambi == null)
    {
      AppMethodBeat.o(18637);
      parambi = localArrayList;
    }
    while (true)
    {
      return parambi;
      Object localObject = "select *, rowid from WxFileIndex2  where msgId=" + parambi.field_msgId + " AND username='" + parambi.field_talker + "' order by msgSubType ASC ";
      localArrayList = new ArrayList();
      parambi = localCursor1;
      try
      {
        localCursor1 = this.bSd.rawQuery((String)localObject, null);
        while (true)
        {
          parambi = localCursor1;
          localCursor2 = localCursor1;
          if (!localCursor1.moveToNext())
            break;
          parambi = localCursor1;
          localCursor2 = localCursor1;
          localObject = new com/tencent/mm/plugin/f/b/a;
          parambi = localCursor1;
          localCursor2 = localCursor1;
          ((a)localObject).<init>();
          parambi = localCursor1;
          localCursor2 = localCursor1;
          ((a)localObject).d(localCursor1);
          parambi = localCursor1;
          localCursor2 = localCursor1;
          localArrayList.add(localObject);
        }
      }
      catch (Exception localException)
      {
        if (parambi != null)
          parambi.close();
        while (true)
        {
          AppMethodBeat.o(18637);
          parambi = localArrayList;
          break;
          if (localCursor1 != null)
            localCursor1.close();
        }
      }
      finally
      {
        if (localException != null)
          localException.close();
        AppMethodBeat.o(18637);
      }
    }
    throw parambi;
  }

  public final long aZn()
  {
    Object localObject1 = null;
    AppMethodBeat.i(18633);
    long l1 = 0L;
    try
    {
      Cursor localCursor = this.bSd.rawQuery("select sum(size)  from WxFileIndex2 where msgSubType in (1,20,23,30,32,34 )", null);
      long l2 = l1;
      if (localCursor != null)
      {
        l2 = l1;
        localObject1 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          l2 = localCursor.getLong(0);
        }
      }
      return l2;
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(18633);
    }
  }

  public final Cursor aZo()
  {
    Object localObject = null;
    AppMethodBeat.i(18634);
    try
    {
      Cursor localCursor = this.bSd.rawQuery("select username,  sum(size) as total from WxFileIndex2 where size > 0  and msgSubType in (1,20,23,30,32,34 ) group by username order by total desc", null);
      localObject = localCursor;
      label23: AppMethodBeat.o(18634);
      return localObject;
    }
    catch (Exception localException)
    {
      break label23;
    }
  }

  public final int bd(List<a> paramList)
  {
    int i = 0;
    AppMethodBeat.i(18638);
    if (paramList.isEmpty())
      AppMethodBeat.o(18638);
    while (true)
    {
      return i;
      long l = bo.yz();
      Iterator localIterator = paramList.iterator();
      i = 0;
      if (localIterator.hasNext())
      {
        if (a((a)localIterator.next(), false));
        for (int j = 1; ; j = 0)
        {
          i = j + i;
          break;
        }
      }
      ab.d("MicroMsg.WxFileIndexStorage", "insert list result[%d %d] cost[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramList.size()), Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(18638);
    }
  }

  public final int be(List<a> paramList)
  {
    int i = 0;
    AppMethodBeat.i(18639);
    if (paramList.isEmpty())
      AppMethodBeat.o(18639);
    while (true)
    {
      return i;
      long l = bo.yz();
      Iterator localIterator = paramList.iterator();
      i = 0;
      if (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (a(locala.xDa, locala, false));
        for (int j = 1; ; j = 0)
        {
          i = j + i;
          break;
        }
      }
      ab.d("MicroMsg.WxFileIndexStorage", "update list result[%d %d] cost[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramList.size()), Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(18639);
    }
  }

  public final boolean delete()
  {
    AppMethodBeat.i(18630);
    try
    {
      int i = this.bSd.delete("WxFileIndex2", null, null);
      l = i;
      if (l > 0L)
      {
        bool = true;
        AppMethodBeat.o(18630);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l = 0L;
        continue;
        boolean bool = false;
        AppMethodBeat.o(18630);
      }
    }
  }

  public final List<a> j(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(18635);
    long l = bo.yz();
    String str = "select *, rowid from WxFileIndex2  where username='" + paramString + "' and msgtime<=" + paramLong1 + " and msgtime>" + paramLong2 + " and msgSubType in (1,20,23,30,32,34 ) and size > 0  order by msgtime DESC,msgSubType ASC ";
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      Cursor localCursor = this.bSd.rawQuery(str, null);
      if (localCursor != null)
        while (true)
        {
          localObject2 = localCursor;
          localObject1 = localCursor;
          if (!localCursor.moveToNext())
            break;
          localObject2 = localCursor;
          localObject1 = localCursor;
          a locala = new com/tencent/mm/plugin/f/b/a;
          localObject2 = localCursor;
          localObject1 = localCursor;
          locala.<init>();
          localObject2 = localCursor;
          localObject1 = localCursor;
          locala.d(localCursor);
          localObject2 = localCursor;
          localObject1 = localCursor;
          localArrayList.add(locala);
        }
    }
    catch (Exception localException)
    {
      localObject1 = localObject2;
      ab.printErrStackTrace("MicroMsg.WxFileIndexStorage", localException, " sql [%s]", new Object[] { str });
      if (localObject2 != null)
        localObject2.close();
      while (true)
      {
        ab.i("MicroMsg.WxFileIndexStorage", "getNoThumbMediaWxFileIndex [%s] size[%d] cost[%d] ", new Object[] { paramString, Integer.valueOf(localArrayList.size()), Long.valueOf(bo.az(l)) });
        AppMethodBeat.o(18635);
        return localArrayList;
        if (localException != null)
          localException.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(18635);
    }
    throw paramString;
  }

  public final List<a> k(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(18636);
    long l = bo.yz();
    String str = "select *, rowid from WxFileIndex2  where username='" + paramString + "' and msgtime<=" + paramLong1 + " and msgtime>" + paramLong2 + " and msgType in (43,62,44,3,49,268435505 ) order by msgtime DESC,msgSubType ASC ";
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      Cursor localCursor = this.bSd.rawQuery(str, null);
      if (localCursor != null)
        while (true)
        {
          localObject2 = localCursor;
          localObject1 = localCursor;
          if (!localCursor.moveToNext())
            break;
          localObject2 = localCursor;
          localObject1 = localCursor;
          a locala = new com/tencent/mm/plugin/f/b/a;
          localObject2 = localCursor;
          localObject1 = localCursor;
          locala.<init>();
          localObject2 = localCursor;
          localObject1 = localCursor;
          locala.d(localCursor);
          localObject2 = localCursor;
          localObject1 = localCursor;
          localArrayList.add(locala);
        }
    }
    catch (Exception localException)
    {
      localObject1 = localObject2;
      ab.printErrStackTrace("MicroMsg.WxFileIndexStorage", localException, " sql [%s]", new Object[] { str });
      if (localObject2 != null)
        localObject2.close();
      while (true)
      {
        ab.i("MicroMsg.WxFileIndexStorage", "getMediaWxFileIndex [%s] size[%d] cost[%d] ", new Object[] { paramString, Integer.valueOf(localArrayList.size()), Long.valueOf(bo.az(l)) });
        AppMethodBeat.o(18636);
        return localArrayList;
        if (localException != null)
          localException.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(18636);
    }
    throw paramString;
  }

  public final long sK(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(18631);
    long l1 = 0L;
    Object localObject2 = "select sum(size)  from WxFileIndex2  where msgType=".concat(String.valueOf(paramInt));
    try
    {
      localObject2 = this.bSd.rawQuery((String)localObject2, null);
      long l2 = l1;
      if (localObject2 != null)
      {
        l2 = l1;
        localObject1 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          localObject1 = localObject2;
          l2 = ((Cursor)localObject2).getLong(0);
        }
      }
      if (localObject2 != null)
        ((Cursor)localObject2).close();
      AppMethodBeat.o(18631);
      return l2;
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(18631);
    }
  }

  public final long sL(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(18632);
    long l1 = 0L;
    Object localObject2 = "select count(*)  from WxFileIndex2  where msgType=" + paramInt + " and size>0";
    try
    {
      localObject2 = this.bSd.rawQuery((String)localObject2, null);
      long l2 = l1;
      if (localObject2 != null)
      {
        l2 = l1;
        localObject1 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          localObject1 = localObject2;
          l2 = ((Cursor)localObject2).getLong(0);
        }
      }
      if (localObject2 != null)
        ((Cursor)localObject2).close();
      AppMethodBeat.o(18632);
      return l2;
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(18632);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.b
 * JD-Core Version:    0.6.2
 */