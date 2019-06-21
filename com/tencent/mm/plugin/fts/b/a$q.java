package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class a$q extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$q(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136689);
    paramj.mDz = g.aO(this.mEl.query, true);
    Object localObject1 = a.a(this.mFK);
    Object localObject2 = paramj.mDz;
    Object localObject3 = this.mEl.mEr;
    Object localObject4 = ((g)localObject2).bAl();
    int i;
    if ((localObject3 != null) && (localObject3.length > 0))
    {
      localObject3 = " AND type IN " + d.t((int[])localObject3);
      long l = ((g)localObject2).mEc.size();
      localObject3 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + (String)localObject3 + " AND status >= 0 ORDER BY subtype;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), Long.valueOf(l), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), localObject4 });
      localObject3 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject3, null);
      localObject1 = new ArrayList();
      localObject4 = new HashSet();
      ((HashSet)localObject4).addAll(this.mEl.mEu);
      i = 0;
    }
    label381: 
    while (true)
    {
      if (!((Cursor)localObject3).moveToNext())
        break label383;
      if (((HashSet)localObject4).add(((Cursor)localObject3).getString(3)))
      {
        localObject2 = new m().k((Cursor)localObject3);
        if (i >= ((m)localObject2).mDw)
          ((List)localObject1).add(localObject2);
        while (true)
        {
          if (!Thread.interrupted())
            break label381;
          ((Cursor)localObject3).close();
          paramj = new InterruptedException("Task is Cancel: " + this.mEl.query);
          AppMethodBeat.o(136689);
          throw paramj;
          localObject3 = "";
          break;
          if (((List)localObject1).size() > this.mEl.mEt)
            break label383;
          i = ((m)localObject2).mDw;
          ((List)localObject1).add(localObject2);
        }
      }
    }
    label383: ((Cursor)localObject3).close();
    paramj.mEy = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (m)((Iterator)localObject1).next();
      ((m)localObject3).bAo();
      ((m)localObject3).a(paramj.mDz);
      paramj.mEy.add(localObject3);
    }
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    AppMethodBeat.o(136689);
  }

  public final int getId()
  {
    return 20;
  }

  public final String getName()
  {
    return "SearchContactTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.q
 * JD-Core Version:    0.6.2
 */