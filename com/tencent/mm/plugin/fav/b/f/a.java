package com.tencent.mm.plugin.fav.b.f;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a extends j<c>
  implements q
{
  private e bSd;
  private List<p> bkF;

  public a(e parame)
  {
    super(parame, c.ccO, "FavCdnInfo", null);
    AppMethodBeat.i(5404);
    this.bkF = new CopyOnWriteArrayList();
    this.bSd = parame;
    AppMethodBeat.o(5404);
  }

  public final c LR(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(5409);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FavCdnStorage", "md5 null");
      AppMethodBeat.o(5409);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from FavCdnInfo where dataId = '" + paramString + "'";
      Cursor localCursor = this.bSd.a(paramString, null, 2);
      if (localCursor == null)
      {
        AppMethodBeat.o(5409);
        paramString = localObject2;
      }
      else
      {
        paramString = localObject1;
        if (localCursor.moveToFirst())
        {
          paramString = new c();
          paramString.d(localCursor);
        }
        localCursor.close();
        AppMethodBeat.o(5409);
      }
    }
  }

  public final void a(p paramp)
  {
    AppMethodBeat.i(5402);
    if (paramp != null)
      this.bkF.add(paramp);
    AppMethodBeat.o(5402);
  }

  public final boolean a(c paramc, String[] paramArrayOfString)
  {
    AppMethodBeat.i(5407);
    boolean bool;
    if (super.c(paramc, paramArrayOfString))
    {
      Iterator localIterator = this.bkF.iterator();
      while (localIterator.hasNext())
      {
        paramArrayOfString = (p)localIterator.next();
        if (paramArrayOfString != null)
          paramArrayOfString.d(paramc);
      }
      bool = true;
      AppMethodBeat.o(5407);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5407);
    }
  }

  public final void b(p paramp)
  {
    AppMethodBeat.i(5403);
    if (paramp != null)
      this.bkF.remove(paramp);
    AppMethodBeat.o(5403);
  }

  public final boolean b(c paramc, String[] paramArrayOfString)
  {
    AppMethodBeat.i(5408);
    boolean bool;
    if (super.a(paramc, paramArrayOfString))
    {
      paramArrayOfString = this.bkF.iterator();
      while (paramArrayOfString.hasNext())
      {
        p localp = (p)paramArrayOfString.next();
        if (localp != null)
          localp.d(paramc);
      }
      bool = true;
      AppMethodBeat.o(5408);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5408);
    }
  }

  public final void buL()
  {
    AppMethodBeat.i(5405);
    this.bSd.hY("FavCdnInfo", "update FavCdnInfo set status = 1 where status <> 3");
    AppMethodBeat.o(5405);
  }

  public final LinkedList<c> buM()
  {
    Object localObject1 = null;
    AppMethodBeat.i(5411);
    Object localObject2 = "select * from FavCdnInfo where status = 1 order by modifyTime desc " + " limit 1";
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(5411);
    while (true)
    {
      return localObject1;
      if (!((Cursor)localObject2).moveToFirst())
      {
        ((Cursor)localObject2).close();
        AppMethodBeat.o(5411);
      }
      else
      {
        localObject1 = new LinkedList();
        do
        {
          c localc = new c();
          localc.d((Cursor)localObject2);
          ((LinkedList)localObject1).add(localc);
        }
        while (((Cursor)localObject2).moveToNext());
        ((Cursor)localObject2).close();
        AppMethodBeat.o(5411);
      }
    }
  }

  public final Cursor buN()
  {
    AppMethodBeat.i(5416);
    Cursor localCursor = this.bSd.rawQuery("select * from FavCdnInfo where type = 0 and status = 1", null);
    AppMethodBeat.o(5416);
    return localCursor;
  }

  public final Cursor buO()
  {
    AppMethodBeat.i(5417);
    Cursor localCursor = this.bSd.rawQuery("select * from FavCdnInfo where type = 1 and status = 1", null);
    AppMethodBeat.o(5417);
    return localCursor;
  }

  public final boolean e(c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(5406);
    if (paramc == null)
      AppMethodBeat.o(5406);
    while (true)
    {
      return bool;
      if (super.b(paramc))
      {
        Iterator localIterator = this.bkF.iterator();
        while (localIterator.hasNext())
        {
          p localp = (p)localIterator.next();
          if (localp != null)
            localp.d(paramc);
        }
        bool = true;
        AppMethodBeat.o(5406);
      }
      else
      {
        AppMethodBeat.o(5406);
      }
    }
  }

  public final List<c> iA(long paramLong)
  {
    AppMethodBeat.i(5413);
    LinkedList localLinkedList = new LinkedList();
    Object localObject = "select * from FavCdnInfo where favLocalId = " + paramLong + " and type = 0 and status = 3";
    Cursor localCursor = this.bSd.a((String)localObject, null, 2);
    if ((localCursor != null) && (localCursor.moveToFirst()))
      do
      {
        localObject = new c();
        ((c)localObject).d(localCursor);
        localLinkedList.add(localObject);
      }
      while (localCursor.moveToNext());
    if (localCursor != null)
      localCursor.close();
    ab.v("MicroMsg.FavCdnStorage", "getUploadedInfos size:%d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    AppMethodBeat.o(5413);
    return localLinkedList;
  }

  public final void iB(long paramLong)
  {
    AppMethodBeat.i(5414);
    String str = String.format("delete from %s where %s = %d and %s = %d", new Object[] { "FavCdnInfo", "favLocalId", Long.valueOf(paramLong), "type", Integer.valueOf(0) });
    this.bSd.hY("FavCdnInfo", str);
    AppMethodBeat.o(5414);
  }

  public final boolean iC(long paramLong)
  {
    AppMethodBeat.i(5418);
    c localc = new c();
    localc.field_favLocalId = paramLong;
    boolean bool = b(localc, new String[] { "favLocalId" });
    AppMethodBeat.o(5418);
    return bool;
  }

  public final List<c> iz(long paramLong)
  {
    AppMethodBeat.i(5412);
    ArrayList localArrayList = new ArrayList();
    Object localObject = "select * from FavCdnInfo where favLocalId = ".concat(String.valueOf(paramLong));
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext())
      {
        c localc = new c();
        localc.d((Cursor)localObject);
        localArrayList.add(localc);
      }
      ((Cursor)localObject).close();
    }
    ab.v("MicroMsg.FavCdnStorage", "getInfos size:%d", new Object[] { Integer.valueOf(localArrayList.size()) });
    AppMethodBeat.o(5412);
    return localArrayList;
  }

  public final int r(long paramLong, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(5415);
    Object localObject = "select status from FavCdnInfo where favLocalId = " + paramLong + " and type = " + paramInt;
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject == null)
    {
      AppMethodBeat.o(5415);
      paramInt = 3;
    }
    while (true)
    {
      return paramInt;
      if (!((Cursor)localObject).moveToFirst())
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(5415);
        paramInt = 3;
      }
      else
      {
        paramInt = 1;
        int j = 1;
        int k = 1;
        int n;
        int i1;
        int i2;
        do
        {
          int m = ((Cursor)localObject).getInt(0);
          if (m == 1)
          {
            ((Cursor)localObject).close();
            AppMethodBeat.o(5415);
            paramInt = i;
            break;
          }
          n = k;
          if (m != 4)
            n = 0;
          i1 = j;
          if (m != 2)
            i1 = 0;
          i2 = paramInt;
          if (m != 3)
            i2 = 0;
          paramInt = i2;
          j = i1;
          k = n;
        }
        while (((Cursor)localObject).moveToNext());
        ((Cursor)localObject).close();
        if (i1 != 0)
        {
          AppMethodBeat.o(5415);
          paramInt = 2;
        }
        else if (n != 0)
        {
          paramInt = 4;
          AppMethodBeat.o(5415);
        }
        else if (i2 != 0)
        {
          AppMethodBeat.o(5415);
          paramInt = 3;
        }
        else
        {
          AppMethodBeat.o(5415);
          paramInt = 0;
        }
      }
    }
  }

  public final void x(g paramg)
  {
    AppMethodBeat.i(5410);
    long l = bo.anU();
    paramg = "update FavCdnInfo set status = 1,modifyTime = " + l + " where favLocalId = " + paramg.field_localId + " and type = 0 and status <> 3";
    this.bSd.hY("FavCdnInfo", paramg);
    AppMethodBeat.o(5410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.f.a
 * JD-Core Version:    0.6.2
 */