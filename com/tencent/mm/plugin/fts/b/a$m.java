package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class a$m extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$m(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136685);
    super.a(paramj);
    Object localObject1 = a.a(this.mFK);
    Object localObject2 = this.mEl.mEp;
    Object localObject3 = paramj.mDz.bAl();
    localObject3 = String.format("SELECT aux_index FROM %s NOT INDEXED JOIN (SELECT docid, aux_index, timestamp FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=?) as temp ON (%s.rowid = temp.docid) WHERE %s MATCH '%s' ORDER BY -timestamp;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).bAg(), localObject3 });
    localObject3 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject3, new String[] { localObject2 });
    localObject2 = new HashSet();
    paramj.mEy = new ArrayList();
    while (((Cursor)localObject3).moveToNext())
    {
      localObject1 = new l();
      ((l)localObject1).mDx = ((Cursor)localObject3).getString(0);
      if (((HashSet)localObject2).add(((l)localObject1).mDx))
        paramj.mEy.add(localObject1);
    }
    ((Cursor)localObject3).close();
    paramj.bFZ = 0;
    AppMethodBeat.o(136685);
  }

  public final String getName()
  {
    return "SearchChatroomInMemberTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.m
 * JD-Core Version:    0.6.2
 */