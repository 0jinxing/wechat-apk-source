package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class a$t extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$t(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    int i = 0;
    AppMethodBeat.i(136692);
    paramj.mDz = g.aO(this.mEl.query, true);
    Object localObject1 = a.a(this.mFK);
    Object localObject2 = paramj.mDz;
    Object localObject3 = ((g)localObject2).bAl();
    long l1 = ((g)localObject2).mEc.size();
    long l2 = System.currentTimeMillis();
    localObject2 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype), CASE WHEN timestamp - %d > 0 THEN 1 ELSE 0 END AS time_range FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131072 ORDER BY time_range desc, subtype ;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), Long.valueOf(l1), Long.valueOf(l2 - 1105032704L), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), localObject3 });
    Cursor localCursor = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject2, null);
    localObject3 = new ArrayList();
    localObject1 = new HashSet();
    ((HashSet)localObject1).addAll(this.mEl.mEu);
    while (localCursor.moveToNext())
    {
      localObject2 = new m().k(localCursor);
      if (((HashSet)localObject1).add(((m)localObject2).mDx))
      {
        if (i >= ((m)localObject2).mDw)
          ((List)localObject3).add(localObject2);
        while (Thread.interrupted())
        {
          localCursor.close();
          paramj = new InterruptedException("Task is Cancel: " + this.mEl.query);
          AppMethodBeat.o(136692);
          throw paramj;
          if (((List)localObject3).size() > this.mEl.mEt)
            break label335;
          i = ((m)localObject2).mDw;
          ((List)localObject3).add(localObject2);
        }
      }
    }
    label335: localCursor.close();
    paramj.mEy = new ArrayList();
    localObject2 = ((List)localObject3).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (m)((Iterator)localObject2).next();
      ((m)localObject1).bAo();
      ((m)localObject1).a(paramj.mDz);
      paramj.mEy.add(localObject1);
    }
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    AppMethodBeat.o(136692);
  }

  public final int getId()
  {
    return 22;
  }

  public final String getName()
  {
    return "SearchTopContactTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.t
 * JD-Core Version:    0.6.2
 */