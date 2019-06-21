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
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class a$n extends h
{
  public a$n(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136686);
    paramj.mDz = g.aO(this.mEl.query, true);
    Object localObject1 = a.a(this.mFK).a(paramj.mDz, new int[] { 131075 }, null, true, true);
    Object localObject2 = new HashMap();
    m localm;
    while (((Cursor)localObject1).moveToNext())
    {
      localm = new m().k((Cursor)localObject1);
      if (!this.mEl.mEu.contains(localm.mDx))
      {
        localObject3 = (l)((HashMap)localObject2).get(localm.mDx);
        if ((localObject3 == null) || (d.f(c.mCv, localm.mDw, ((l)localObject3).mDw) < 0))
          ((HashMap)localObject2).put(localm.mDx, localm);
        if (Thread.interrupted())
        {
          ((Cursor)localObject1).close();
          paramj = new InterruptedException();
          AppMethodBeat.o(136686);
          throw paramj;
        }
      }
    }
    ((Cursor)localObject1).close();
    Object localObject3 = new ArrayList(((HashMap)localObject2).size());
    localObject1 = ((HashMap)localObject2).values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localm = (m)((Iterator)localObject1).next();
      localm.bAo();
      localm.a(paramj.mDz);
      ((ArrayList)localObject3).add(localm);
      if (Thread.interrupted())
      {
        paramj = new InterruptedException();
        AppMethodBeat.o(136686);
        throw paramj;
      }
    }
    if (this.mEl.mEv != null)
      Collections.sort((List)localObject3, this.mEl.mEv);
    paramj.mEy = new ArrayList(((HashMap)localObject2).size());
    localObject2 = new StringBuffer();
    for (int i = 0; i < ((ArrayList)localObject3).size(); i++)
    {
      localObject1 = (l)((ArrayList)localObject3).get(i);
      ((StringBuffer)localObject2).append(((l)localObject1).mDW);
      ((StringBuffer)localObject2).append("|");
      ((StringBuffer)localObject2).append(((l)localObject1).timestamp);
      ((StringBuffer)localObject2).append(" ");
      paramj.mEy.add(localObject1);
      if (i >= this.mEl.mEt)
        break;
    }
    if ((paramj.mDz.mEc.size() > 1) && (a.a(this.mFK).b(paramj.mDz)))
    {
      localObject3 = new l();
      ((l)localObject3).mDx = "create_chatroom​";
      paramj.mEy.add(0, localObject3);
      ((StringBuffer)localObject2).append(" needCreateChatroom");
    }
    ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "rank score: %s", new Object[] { ((StringBuffer)localObject2).toString() });
    AppMethodBeat.o(136686);
  }

  public final int getId()
  {
    return 19;
  }

  public final String getName()
  {
    return "SearchChatroomTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.n
 * JD-Core Version:    0.6.2
 */