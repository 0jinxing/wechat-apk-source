package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.h;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class c$e extends h
{
  public c$e(c paramc, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136755);
    Ng("start");
    paramj.mDz = com.tencent.mm.plugin.fts.a.a.g.a(this.mEl.query, false, this.mGx.mGw);
    Object localObject1 = com.tencent.mm.plugin.fts.a.a.g.aO(this.mEl.mEq, true);
    HashMap localHashMap = new HashMap();
    Object localObject2 = ((a)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(3)).a((com.tencent.mm.plugin.fts.a.a.g)localObject1, this.mEl.talker, com.tencent.mm.plugin.fts.a.c.mCl, com.tencent.mm.plugin.fts.a.c.mCp);
    Object localObject3;
    do
    {
      if (!((Cursor)localObject2).moveToNext())
        break;
      localObject3 = new m();
      ((l)localObject3).mDx = ((Cursor)localObject2).getString(0);
      ((l)localObject3).type = ((Cursor)localObject2).getInt(1);
      ((l)localObject3).mDw = ((Cursor)localObject2).getInt(2);
      ((l)localObject3).mDz = ((com.tencent.mm.plugin.fts.a.a.g)localObject1);
      if (!localHashMap.containsKey(((l)localObject3).mDx))
        localHashMap.put(((l)localObject3).mDx, localObject3);
    }
    while (localHashMap.size() <= 100);
    ((Cursor)localObject2).close();
    Ng("findHitContact");
    Cursor localCursor = this.mGx.mGp.a(paramj.mDz, this.mEl.mEp, localHashMap.keySet());
    localObject2 = new HashMap();
    if (localCursor.moveToNext())
    {
      localObject1 = new m().i(localCursor);
      ((m)localObject1).mDz = paramj.mDz;
      if (((HashMap)localObject2).containsKey(((m)localObject1).talker));
      for (localObject3 = (List)((HashMap)localObject2).get(((m)localObject1).talker); ; localObject3 = new ArrayList())
      {
        ((List)localObject3).add(localObject1);
        ((HashMap)localObject2).put(((m)localObject1).talker, localObject3);
        break;
      }
    }
    localCursor.close();
    paramj.mEy = new ArrayList();
    localObject2 = ((HashMap)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject1 = (l)localHashMap.get(((Map.Entry)localObject3).getKey());
      if (localObject1 != null)
      {
        Collections.sort((List)((Map.Entry)localObject3).getValue(), this.mEl.mEv);
        ((l)localObject1).userData = ((Map.Entry)localObject3).getValue();
        ((l)localObject1).timestamp = ((l)((List)((Map.Entry)localObject3).getValue()).get(0)).timestamp;
        paramj.mEy.add(localObject1);
      }
    }
    Collections.sort(paramj.mEy, this.mEl.mEv);
    Ng("findHitMessage");
    AppMethodBeat.o(136755);
  }

  public final int getId()
  {
    return 29;
  }

  public final String getName()
  {
    return "SearchConvTalkerMessageTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.e
 * JD-Core Version:    0.6.2
 */