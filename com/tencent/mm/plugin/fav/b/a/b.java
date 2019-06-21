package com.tencent.mm.plugin.fav.b.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fts.a.a.h;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class b extends com.tencent.mm.plugin.fts.a.b
{
  com.tencent.mm.plugin.fts.a.m eAX;
  private com.tencent.mm.plugin.fts.a.j mgD;
  a mgE;
  e mgF;
  private k.a mgG;

  public b()
  {
    AppMethodBeat.i(5312);
    this.mgG = new b.1(this);
    AppMethodBeat.o(5312);
  }

  private int a(String[] paramArrayOfString, int[] paramArrayOfInt, long paramLong1, int paramInt, long paramLong2, String paramString)
  {
    AppMethodBeat.i(5315);
    int i = 0;
    String str1 = paramArrayOfString[0];
    String str2 = paramArrayOfString[1];
    paramArrayOfString = paramArrayOfString[2];
    int j = i;
    if (str1 != null)
    {
      j = i;
      if (str1.length() > 0)
      {
        if (!str1.equalsIgnoreCase(str2))
          break label187;
        str2 = null;
        paramArrayOfString = null;
      }
    }
    label187: 
    while (true)
    {
      if ((str2 != null) && (str2.equalsIgnoreCase(paramArrayOfString)))
        paramArrayOfString = null;
      while (true)
      {
        this.mgE.a(paramArrayOfInt[0], paramLong1, paramString, paramLong2, str1, paramInt);
        i = 1;
        j = i;
        if (str2 != null)
        {
          j = i;
          if (str2.length() > 0)
          {
            this.mgE.a(paramArrayOfInt[1], paramLong1, paramString, paramLong2, str2, paramInt);
            j = 2;
          }
        }
        if ((paramArrayOfString != null) && (paramArrayOfString.length() > 0))
        {
          this.mgE.a(paramArrayOfInt[2], paramLong1, paramString, paramLong2, paramArrayOfString, paramInt);
          j++;
        }
        while (true)
        {
          AppMethodBeat.o(5315);
          return j;
        }
      }
    }
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(5314);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().d(this.mgG);
    this.mgE = null;
    this.eAX = null;
    AppMethodBeat.o(5314);
    return true;
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(i parami)
  {
    AppMethodBeat.i(5311);
    if (parami.hbo == 1);
    for (parami = new b.f(this, parami); ; parami = new e(parami))
    {
      parami = this.eAX.a(-65536, parami);
      AppMethodBeat.o(5311);
      return parami;
    }
  }

  public final String getName()
  {
    return "FTS5SearchFavoriteLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(5313);
    boolean bool;
    if (!((n)com.tencent.mm.kernel.g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Fail!");
      AppMethodBeat.o(5313);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Success!");
      this.eAX = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSTaskDaemon();
      this.mgE = ((a)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(256));
      this.mgD = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSMainDB();
      this.mgF = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buR();
      this.eAX.a(131122, new b.a(this, (byte)0));
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().c(this.mgG);
      bool = true;
      AppMethodBeat.o(5313);
    }
  }

  final class e extends h
  {
    e(i arg2)
    {
      super();
    }

    public final void a(com.tencent.mm.plugin.fts.a.a.j paramj)
    {
      AppMethodBeat.i(5309);
      paramj.mDz = com.tencent.mm.plugin.fts.a.a.g.aO(this.mEl.query, true);
      HashMap localHashMap = new HashMap();
      Object localObject1 = b.this.mgE.a(paramj.mDz, c.mCd, null, false, false);
      while (((Cursor)localObject1).moveToNext())
      {
        com.tencent.mm.plugin.fts.a.a.m localm = new com.tencent.mm.plugin.fts.a.a.m().k((Cursor)localObject1);
        localObject2 = (l)localHashMap.get(Long.valueOf(localm.mEB));
        if ((localObject2 == null) || (d.f(c.mCw, localm.mDw, ((l)localObject2).mDw) < 0))
          localHashMap.put(Long.valueOf(localm.mEB), localm);
        if (Thread.interrupted())
        {
          ((Cursor)localObject1).close();
          paramj = new InterruptedException();
          AppMethodBeat.o(5309);
          throw paramj;
        }
      }
      ((Cursor)localObject1).close();
      if (Thread.interrupted())
      {
        paramj = new InterruptedException();
        AppMethodBeat.o(5309);
        throw paramj;
      }
      paramj.mEy = new ArrayList(localHashMap.size());
      Object localObject2 = localHashMap.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (com.tencent.mm.plugin.fts.a.a.m)((Iterator)localObject2).next();
        paramj.mEy.add(localObject1);
      }
      if (this.mEl.mEv != null)
        Collections.sort(paramj.mEy, this.mEl.mEv);
      AppMethodBeat.o(5309);
    }

    public final String getName()
    {
      return "SearchFavoriteTask";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.a.b
 * JD-Core Version:    0.6.2
 */