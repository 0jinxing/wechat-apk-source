package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.h;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class a$j extends h
{
  public a$j(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136682);
    paramj.mDz = g.aO(this.mEl.query, true);
    Cursor localCursor = a.a(this.mFK).a(paramj.mDz, this.mEl.mEr, this.mEl.mEs, true, true);
    Object localObject = new HashMap();
    HashMap localHashMap = new HashMap();
    m localm;
    while (localCursor.moveToNext())
    {
      localm = new m().k(localCursor);
      if (!this.mEl.mEu.contains(localm.mDx))
      {
        l locall;
        if (d.h(c.mCk, localm.type))
        {
          locall = (l)((HashMap)localObject).get(localm.mDx);
          if ((locall == null) || (d.f(c.mCv, localm.mDw, locall.mDw) < 0))
            ((HashMap)localObject).put(localm.mDx, localm);
        }
        while (Thread.interrupted())
        {
          localCursor.close();
          paramj = new InterruptedException();
          AppMethodBeat.o(136682);
          throw paramj;
          if (d.h(c.mCm, localm.type))
          {
            locall = (l)localHashMap.get(Long.valueOf(localm.mEB));
            if ((locall == null) || (d.f(c.mCv, localm.mDw, locall.mDw) < 0))
              localHashMap.put(Long.valueOf(localm.mEB), localm);
          }
        }
      }
    }
    localCursor.close();
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(136682);
      throw paramj;
    }
    paramj.mEy = new ArrayList(((HashMap)localObject).size());
    localObject = ((HashMap)localObject).values().iterator();
    while (((Iterator)localObject).hasNext())
    {
      localm = (m)((Iterator)localObject).next();
      localm.bAo();
      localm.a(paramj.mDz);
      paramj.mEy.add(localm);
    }
    paramj.mEy.addAll(localHashMap.values());
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(136682);
      throw paramj;
    }
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    AppMethodBeat.o(136682);
  }

  public final int getId()
  {
    return 11;
  }

  public final String getName()
  {
    return "SearchContactLogic.SearchTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.j
 * JD-Core Version:    0.6.2
 */