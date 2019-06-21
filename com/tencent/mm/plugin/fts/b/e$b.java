package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class e$b extends com.tencent.mm.plugin.fts.a.a.h
{
  public e$b(e parame, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136779);
    paramj.mDz = com.tencent.mm.plugin.fts.a.a.g.aO(this.mEl.query, true);
    ab.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "MatchQuery %s", new Object[] { paramj.mDz.bAl().replaceAll("​", ",") });
    Object localObject1 = new HashSet();
    ((HashSet)localObject1).addAll(this.mEl.mEu);
    paramj.mEy = new ArrayList();
    HashSet localHashSet = new HashSet();
    Object localObject2 = this.mGS.mGO;
    Object localObject3 = paramj.mDz;
    Object localObject4 = this.mEl.mEr;
    int i = this.mEl.scene;
    int j = this.mEl.mEt + this.mEl.mEu.size();
    Object localObject5 = ((com.tencent.mm.plugin.fts.a.a.g)localObject3).mDY + '%';
    String str1 = ((com.tencent.mm.plugin.fts.a.a.g)localObject3).bAl();
    str1 = String.format("AND %s MATCH '%s'", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg(), str1 });
    String str2 = "AND type IN " + d.t((int[])localObject4);
    if (j > 0)
      localObject4 = "LIMIT ".concat(String.valueOf(j));
    long l;
    while (true)
    {
      l = ((com.tencent.mm.plugin.fts.a.a.g)localObject3).mEc.size();
      localObject4 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype), query, scene FROM %s, %s WHERE %s %s %s %s %s AND %s.docid = %s.rowid ORDER BY score desc %s;", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject2).bAf(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg(), Long.valueOf(l), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAf(), "query LIKE ?", str1, str2, "AND scene=?", "AND status >= 0 AND score >= 3", ((com.tencent.mm.plugin.fts.c.e)localObject2).bAf(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg(), localObject4 });
      localObject4 = ((com.tencent.mm.plugin.fts.a.a)localObject2).mBT.rawQuery((String)localObject4, new String[] { localObject5, String.valueOf(i) });
      try
      {
        while (true)
          label384: if (((Cursor)localObject4).moveToNext())
          {
            localObject2 = new com/tencent/mm/plugin/fts/a/a/m;
            ((m)localObject2).<init>();
            localObject2 = ((m)localObject2).k((Cursor)localObject4);
            if (((HashSet)localObject1).add(((m)localObject2).mDx))
            {
              ((m)localObject2).bAo();
              ((m)localObject2).userData = "";
              if (((m)localObject2).type == 262144)
              {
                ((m)localObject2).userData = ((b)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(17)).wa((int)((m)localObject2).mEB);
                if (((m)localObject2).userData == null)
                  continue;
              }
            }
          }
          else
          {
            while ((((m)localObject2).type != 131072) || (!com.tencent.mm.plugin.fts.c.e.Ns(((m)localObject2).mDx)))
            {
              paramj.mEy.add(localObject2);
              j = paramj.mEy.size();
              i = this.mEl.mEt;
              if (j < i)
                break label384;
              ((Cursor)localObject4).close();
              ab.d("MicroMsg.FTS.FTS5SearchTopHitsLogic", "History TopHits %s", new Object[] { Integer.valueOf(paramj.mEy.size()) });
              if (paramj.mDz.mEa.length <= 1)
                break label1253;
              if (paramj.mEy.size() > 2)
                paramj.mEy = paramj.mEy.subList(0, 2);
              ((HashSet)localObject1).clear();
              for (j = 0; j < paramj.mEy.size(); j++)
                ((HashSet)localObject1).add(((l)paramj.mEy.get(j)).mDx);
              localObject4 = "";
              break;
            }
            localHashSet.add(((m)localObject2).mDx);
          }
      }
      finally
      {
        ((Cursor)localObject4).close();
        AppMethodBeat.o(136779);
      }
    }
    localObject4 = new HashSet();
    localObject2 = this.mGS.mGO;
    localObject5 = paramj.mDz;
    localObject3 = this.mEl.mEr;
    i = this.mEl.scene;
    j = this.mEl.mEt;
    int k = this.mEl.mEu.size();
    localObject5 = ((com.tencent.mm.plugin.fts.a.a.g)localObject5).bAl();
    localObject3 = " AND type IN " + d.t((int[])localObject3);
    localObject5 = String.format("SELECT aux_index FROM %s, %s WHERE %s.docid = %s.rowid AND query = ? AND scene = " + i + (String)localObject3 + " AND status >= 0 AND score >= 2" + String.format(" AND %s MATCH '%s'", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg(), localObject5 }) + " ORDER BY score desc limit " + (j + k) + ";", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject2).bAf(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAf(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAf(), ((com.tencent.mm.plugin.fts.c.e)localObject2).bAg() });
    localObject5 = ((com.tencent.mm.plugin.fts.a.a)localObject2).mBT.rawQuery((String)localObject5, new String[] { "​chatroom_tophits" });
    while (((Cursor)localObject5).moveToNext())
    {
      localObject2 = ((Cursor)localObject5).getString(0);
      if (!((HashSet)localObject1).contains(localObject2))
        ((HashSet)localObject4).add(localObject2);
    }
    ((Cursor)localObject5).close();
    localObject1 = (com.tencent.mm.plugin.fts.c.a)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(3);
    localObject4 = ((HashSet)localObject4).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject2 = (String)((Iterator)localObject4).next();
      localObject5 = paramj.mDz;
      localObject3 = ((com.tencent.mm.plugin.fts.a.a.g)localObject5).bAl();
      l = ((com.tencent.mm.plugin.fts.a.a.g)localObject5).mEc.size();
      localObject5 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND type = 131075 AND subtype= 38;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), Long.valueOf(l), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), localObject3 });
      localObject5 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject5, new String[] { localObject2 });
      if (((Cursor)localObject5).moveToNext())
      {
        localObject2 = new m().k((Cursor)localObject5);
        ((m)localObject2).userData = "​chatroom_tophits";
        ((m)localObject2).bAo();
        paramj.mEy.add(localObject2);
        if (paramj.mEy.size() >= this.mEl.mEt)
          break;
      }
      ((Cursor)localObject5).close();
    }
    label1253: paramj = localHashSet.iterator();
    while (paramj.hasNext())
    {
      localObject4 = (String)paramj.next();
      this.mGS.Nn((String)localObject4);
    }
    AppMethodBeat.o(136779);
  }

  public final int getId()
  {
    return 8;
  }

  public final String getName()
  {
    return "SearchTopHitsTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.e.b
 * JD-Core Version:    0.6.2
 */