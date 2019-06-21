package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class bm extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS readerappnews1 ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE TABLE IF NOT EXISTS readerappweibo ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappnews1 ( time )", "CREATE INDEX IF NOT EXISTS  readerappfunctionId ON readerappnews1 ( reserved3 )", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappweibo ( time )" };
  public h fni;

  public bm(h paramh)
  {
    this.fni = paramh;
  }

  public static String kH(int paramInt)
  {
    AppMethodBeat.i(76728);
    String str;
    if (paramInt == 20)
    {
      str = "readerappnews1";
      AppMethodBeat.o(76728);
    }
    while (true)
    {
      return str;
      if (paramInt == 11)
      {
        str = "readerappweibo";
        AppMethodBeat.o(76728);
      }
      else
      {
        Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
        str = null;
        AppMethodBeat.o(76728);
      }
    }
  }

  public static String oH(String paramString)
  {
    AppMethodBeat.i(76727);
    paramString = "select tweetid,time,type,name,title,url,shorturl,longurl,pubtime,sourcename,sourceicon,istop,cover,digest,reserved1,reserved2,reserved3,reserved4 from " + paramString + "  ";
    AppMethodBeat.o(76727);
    return paramString;
  }

  public final List<bl> Q(String paramString, int paramInt)
  {
    AppMethodBeat.i(76732);
    ArrayList localArrayList = new ArrayList();
    paramString = oH(kH(paramInt)) + "where reserved3 = " + h.escape(paramString) + " order by istop desc , tweetid asc ";
    ab.d("MicroMsg.ReaderAppInfoStorage", "getInfobyGroup :".concat(String.valueOf(paramString)));
    paramString = this.fni.a(paramString, null, 2);
    while (paramString.moveToNext())
    {
      bl localbl = new bl();
      localbl.d(paramString);
      localArrayList.add(localbl);
    }
    paramString.close();
    AppMethodBeat.o(76732);
    return localArrayList;
  }

  public final List<bl> R(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(76733);
    Cursor localCursor = this.fni.a(kH(paramInt), new String[] { "*" }, "reserved3=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor != null);
    try
    {
      if (localCursor.moveToFirst())
      {
        paramString = new java/util/ArrayList;
        paramString.<init>();
        boolean bool;
        do
        {
          bl localbl = new com/tencent/mm/model/bl;
          localbl.<init>();
          localbl.d(localCursor);
          paramString.add(localbl);
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      while (true)
      {
        return paramString;
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(76733);
        paramString = localObject;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ReaderAppInfoStorage", "getByFunctionMsgId, error: %s", new Object[] { paramString.getMessage() });
        if (localCursor != null)
          localCursor.close();
      }
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(76733);
    }
    throw paramString;
  }

  public final Cursor cp(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76729);
    Object localObject = "SELECT reserved3 from " + kH(paramInt2) + " GROUP BY reserved3 ORDER BY time ASC  LIMIT " + paramInt1 + " offset (SELECT COUNT(*) FROM (SELECT COUNT(*) FROM " + kH(paramInt2) + " GROUP BY reserved3)) -" + paramInt1;
    localObject = this.fni.a((String)localObject, null, 0);
    AppMethodBeat.o(76729);
    return localObject;
  }

  public final List<bl> fn(long paramLong)
  {
    AppMethodBeat.i(76731);
    ArrayList localArrayList = new ArrayList();
    Object localObject = oH(kH(20)) + " where reserved2 = " + paramLong;
    ab.d("MicroMsg.ReaderAppInfoStorage", "getInfoListByMsgSvrID :".concat(String.valueOf(localObject)));
    Cursor localCursor = this.fni.a((String)localObject, null, 2);
    while (localCursor.moveToNext())
    {
      localObject = new bl();
      ((bl)localObject).d(localCursor);
      localArrayList.add(localObject);
    }
    localCursor.close();
    AppMethodBeat.o(76731);
    return localArrayList;
  }

  public final int kI(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(76730);
    Object localObject = "select count(*) from (SELECT count(*) FROM " + kH(paramInt) + " group by reserved3)";
    localObject = this.fni.a((String)localObject, null, 2);
    paramInt = i;
    if (((Cursor)localObject).moveToFirst())
      paramInt = ((Cursor)localObject).getInt(0);
    ((Cursor)localObject).close();
    AppMethodBeat.o(76730);
    return paramInt;
  }

  public final void kJ(int paramInt)
  {
    AppMethodBeat.i(76734);
    Object localObject = ((j)g.K(j.class)).XR().aoZ(bl.kG(paramInt));
    if ((localObject == null) || (!((at)localObject).field_username.equals(bl.kG(paramInt))))
      AppMethodBeat.o(76734);
    while (true)
    {
      return;
      ((ak)localObject).setUsername(bl.kG(paramInt));
      ((ak)localObject).setContent("");
      ((ak)localObject).hO(0);
      ((ak)localObject).hM(0);
      ((j)g.K(j.class)).XR().a((ak)localObject, bl.kG(paramInt));
      localObject = "delete from " + kH(paramInt);
      if (this.fni.hY(kH(paramInt), (String)localObject))
        doNotify();
      AppMethodBeat.o(76734);
    }
  }

  public final void kK(int paramInt)
  {
    AppMethodBeat.i(76735);
    Object localObject1 = oH(kH(paramInt)) + " where istop = 1  group by reserved3 ORDER BY time DESC  limit 2";
    ab.i("MicroMsg.ReaderAppInfoStorage", "reset conversation, sql is %s", new Object[] { localObject1 });
    Object localObject2 = this.fni.a((String)localObject1, null, 2);
    if (!((Cursor)localObject2).moveToFirst())
    {
      ((Cursor)localObject2).close();
      localObject1 = new ak();
      ((ak)localObject1).setUsername(bl.kG(paramInt));
      ((ak)localObject1).setContent("");
      ((ak)localObject1).eD(0L);
      ((ak)localObject1).hO(0);
      ((ak)localObject1).hM(0);
      ((j)g.K(j.class)).XR().a((ak)localObject1, bl.kG(paramInt));
      AppMethodBeat.o(76735);
    }
    while (true)
    {
      return;
      localObject1 = new bl();
      ((bl)localObject1).d((Cursor)localObject2);
      ((Cursor)localObject2).close();
      localObject2 = new ak();
      ((ak)localObject2).setUsername(bl.kG(paramInt));
      ((ak)localObject2).setContent(((bl)localObject1).getTitle());
      ((ak)localObject2).eD(((bl)localObject1).time);
      ((ak)localObject2).hO(0);
      ((ak)localObject2).hM(0);
      ((j)g.K(j.class)).XR().a((ak)localObject2, bl.kG(paramInt));
      AppMethodBeat.o(76735);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bm
 * JD-Core Version:    0.6.2
 */