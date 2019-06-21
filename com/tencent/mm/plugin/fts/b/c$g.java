package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class c$g extends com.tencent.mm.plugin.fts.a.a.h
{
  public c$g(c paramc, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136757);
    Ng("start");
    paramj.mDz = com.tencent.mm.plugin.fts.a.a.g.a(this.mEl.query, false, this.mGx.mGw);
    Object localObject1 = this.mGx.mGp;
    Object localObject2 = paramj.mDz.bAl();
    localObject2 = String.format("SELECT type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0 ORDER BY timestamp desc;", new Object[] { ((com.tencent.mm.plugin.fts.c.c)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), localObject2 });
    localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject2, null);
    localObject1 = new ArrayList();
    HashSet localHashSet = new HashSet();
    Object localObject3 = new ArrayList();
    Object localObject4;
    do
    {
      if (!((Cursor)localObject2).moveToNext())
        break;
      localObject4 = ((Cursor)localObject2).getString(3);
      if (localHashSet.add(localObject4))
      {
        a locala = new a((byte)0);
        locala.type = ((Cursor)localObject2).getInt(0);
        locala.mDw = ((Cursor)localObject2).getInt(1);
        locala.mEB = ((Cursor)localObject2).getLong(2);
        locala.mDx = ((Cursor)localObject2).getString(3);
        locala.timestamp = ((Cursor)localObject2).getLong(4);
        ((List)localObject1).add(locala);
        ((List)localObject3).add(localObject4);
      }
    }
    while (((List)localObject1).size() <= this.mEl.mEt);
    ((Cursor)localObject2).close();
    paramj.mEy = new LinkedList();
    Ng("findUsername");
    if (((List)localObject3).size() > 0)
    {
      localObject3 = this.mGx.mGp.a(paramj.mDz, (List)localObject3);
      localObject2 = new HashMap();
      if (((Cursor)localObject3).moveToNext())
      {
        localObject4 = ((Cursor)localObject3).getString(0).split(" ");
        for (int i = 0; i < localObject4.length; i += 2)
          ((HashMap)localObject2).put(localObject4[i], Integer.valueOf(localObject4[(i + 1)]));
      }
      ((Cursor)localObject3).close();
      localObject4 = ((List)localObject1).iterator();
      if (((Iterator)localObject4).hasNext())
      {
        localObject1 = (a)((Iterator)localObject4).next();
        localObject3 = new l();
        ((l)localObject3).type = ((a)localObject1).type;
        ((l)localObject3).mDw = ((a)localObject1).mDw;
        ((l)localObject3).mEB = ((a)localObject1).mEB;
        ((l)localObject3).mDx = ((a)localObject1).mDx;
        ((l)localObject3).timestamp = ((a)localObject1).timestamp;
        if (((HashMap)localObject2).containsKey(((l)localObject3).mDx));
        for (((l)localObject3).userData = ((HashMap)localObject2).get(((l)localObject3).mDx); ; ((l)localObject3).userData = Integer.valueOf(1))
        {
          paramj.mEy.add(localObject3);
          break;
        }
      }
      Ng("findCount");
    }
    if ((paramj.mDz.mEb.length > 1) && (paramj.mEy.size() <= 3))
    {
      localObject1 = com.tencent.mm.plugin.fts.a.a.g.aO(paramj.mDz.mEb[0], true);
      localObject1 = ((com.tencent.mm.plugin.fts.c.a)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(3)).a((com.tencent.mm.plugin.fts.a.a.g)localObject1, null, com.tencent.mm.plugin.fts.a.c.mCl, com.tencent.mm.plugin.fts.a.c.mCp);
      if (((Cursor)localObject1).moveToNext())
      {
        localObject2 = new l();
        ((l)localObject2).mDx = "create_talker_message​";
        paramj.mEy.add(localObject2);
      }
      ((Cursor)localObject1).close();
      Ng("findTalkerConversation");
    }
    AppMethodBeat.o(136757);
  }

  public final int getId()
  {
    return 24;
  }

  public final String getName()
  {
    return "SearchLimitGroupMessage";
  }

  final class a
  {
    int mDw;
    String mDx;
    long mEB;
    long timestamp;
    int type;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.g
 * JD-Core Version:    0.6.2
 */