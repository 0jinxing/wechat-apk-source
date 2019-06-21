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

final class a$s extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$s(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136691);
    paramj.mDz = g.aO(this.mEl.query, true);
    Object localObject1 = a.a(this.mFK);
    Object localObject2 = paramj.mDz;
    Object localObject3 = this.mEl.mEr;
    Object localObject4 = ((g)localObject2).bAl();
    long l1 = System.currentTimeMillis();
    long l2 = ((g)localObject2).mEc.size();
    localObject3 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype), MMContactRank(%s, timestamp / 1000 - %d / 1000, subtype, ?, %d) AS Rank FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type IN " + d.t((int[])localObject3) + " ORDER BY Rank ;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), Long.valueOf(l2), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), Long.valueOf(l1 - 1105032704L), Long.valueOf(l2), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), localObject4 });
    localObject1 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject3, new String[] { ((g)localObject2).mDZ });
    localObject3 = new ArrayList();
    localObject4 = new HashSet();
    ((HashSet)localObject4).addAll(this.mEl.mEu);
    l2 = 0L;
    while (((Cursor)localObject1).moveToNext())
    {
      localObject2 = new m().j((Cursor)localObject1);
      if (((HashSet)localObject4).add(((m)localObject2).mDx))
      {
        if (l2 >= ((m)localObject2).mEJ)
          ((List)localObject3).add(localObject2);
        while (Thread.interrupted())
        {
          ((Cursor)localObject1).close();
          paramj = new InterruptedException("Task is Cancel: " + this.mEl.query);
          AppMethodBeat.o(136691);
          throw paramj;
          if (((List)localObject3).size() > this.mEl.mEt)
            break label388;
          l2 = ((m)localObject2).mEJ;
          ((List)localObject3).add(localObject2);
        }
      }
    }
    label388: ((Cursor)localObject1).close();
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
    AppMethodBeat.o(136691);
  }

  public final int getId()
  {
    return 26;
  }

  public final String getName()
  {
    return "SearchTopContactInnerRankTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.s
 * JD-Core Version:    0.6.2
 */