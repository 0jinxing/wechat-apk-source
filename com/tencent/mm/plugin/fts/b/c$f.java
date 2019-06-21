package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class c$f extends com.tencent.mm.plugin.fts.a.a.h
{
  c$f(c paramc, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136756);
    Ng("start");
    paramj.mDz = com.tencent.mm.plugin.fts.a.a.g.a(this.mEl.query, false, this.mGx.mGw);
    Object localObject1 = this.mGx.mGp;
    Object localObject2 = paramj.mDz;
    Object localObject3 = this.mEl.mEp;
    localObject2 = ((com.tencent.mm.plugin.fts.a.a.g)localObject2).bAl();
    localObject2 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND status >= 0 ORDER BY timestamp desc;", new Object[] { ((com.tencent.mm.plugin.fts.c.c)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), localObject2 });
    localObject3 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject2, new String[] { localObject3 });
    paramj.mEy = new ArrayList();
    while (((Cursor)localObject3).moveToNext())
    {
      localObject1 = new m().i((Cursor)localObject3);
      paramj.mEy.add(localObject1);
    }
    ((Cursor)localObject3).close();
    Ng("findConversationMessage");
    if ((paramj.mDz.mEb.length > 1) && (!this.mEl.mEu.contains("create_talker_message​")))
    {
      localObject3 = com.tencent.mm.plugin.fts.a.a.g.aO(paramj.mDz.mEb[0], true);
      localObject1 = ((com.tencent.mm.plugin.fts.c.a)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(3)).a((com.tencent.mm.plugin.fts.a.a.g)localObject3, null, com.tencent.mm.plugin.fts.a.c.mCl, com.tencent.mm.plugin.fts.a.c.mCp);
      if (((Cursor)localObject1).moveToNext())
      {
        localObject3 = new l();
        ((l)localObject3).mDx = "create_talker_message​";
        paramj.mEy.add(0, localObject3);
      }
      ((Cursor)localObject1).close();
      Ng("findTalkerConversation");
    }
    AppMethodBeat.o(136756);
  }

  public final int getId()
  {
    return 14;
  }

  public final String getName()
  {
    return "SearchConversationMessageTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.f
 * JD-Core Version:    0.6.2
 */