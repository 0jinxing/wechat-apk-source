package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.a.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class a$r extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$r(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136690);
    Ng("start");
    paramj.mDz = g.aO(this.mEl.query, true);
    Object localObject1 = a.a(this.mFK);
    Object localObject2 = paramj.mDz;
    Object localObject3 = ((g)localObject2).bAl();
    long l1 = System.currentTimeMillis();
    long l2 = ((g)localObject2).mEc.size();
    localObject3 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) AS Offsets, MMChatroomRank(%s, timestamp / 1000 - %d / 1000, subtype, ?, entity_id, %d) AS Rank FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 ORDER BY Rank, timestamp desc ;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), Long.valueOf(l2), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), Long.valueOf(l1 - 1209600000L), Long.valueOf(l2), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), localObject3 });
    localObject3 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject3, new String[] { ((g)localObject2).mDZ });
    localObject1 = new ArrayList();
    localObject2 = new HashSet();
    ((HashSet)localObject2).addAll(this.mEl.mEu);
    while (((Cursor)localObject3).moveToNext())
    {
      m localm = new m().j((Cursor)localObject3);
      if (((HashSet)localObject2).add(localm.mDx))
        if (((List)localObject1).size() <= this.mEl.mEt)
        {
          ((List)localObject1).add(localm);
          if (Thread.interrupted())
          {
            ((Cursor)localObject3).close();
            paramj = new InterruptedException("Task is Cancel: " + this.mEl.query);
            AppMethodBeat.o(136690);
            throw paramj;
          }
        }
    }
    ((Cursor)localObject3).close();
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(136690);
      throw paramj;
    }
    Ng("orm");
    paramj.mEy = new ArrayList(((List)localObject1).size());
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (m)((Iterator)localObject1).next();
      ((m)localObject2).bAo();
      ((m)localObject2).a(paramj.mDz);
      paramj.mEy.add(localObject2);
    }
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(136690);
      throw paramj;
    }
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    Ng("calOffsets");
    if ((paramj.mDz.mEc.size() > 1) && (a.a(this.mFK).b(paramj.mDz)))
    {
      localObject1 = new l();
      ((l)localObject1).mDx = "create_chatroom​";
      if (paramj.mEy.size() <= 3)
        break label569;
      paramj.mEy.add(3, localObject1);
    }
    while (true)
    {
      Ng("checkChatroom");
      AppMethodBeat.o(136690);
      return;
      label569: paramj.mEy.add(localObject1);
    }
  }

  public final int getId()
  {
    return 25;
  }

  public final String getName()
  {
    return "SearchTopChatroomInnerRankTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.r
 * JD-Core Version:    0.6.2
 */