package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import java.util.ArrayList;
import java.util.List;

final class a$k extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$k(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136683);
    super.a(paramj);
    com.tencent.mm.plugin.fts.c.a locala = a.a(this.mFK);
    Object localObject1 = this.mEl.query;
    Object localObject2 = String.format("SELECT aux_index FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=? AND subtype=38 AND type=131075 ORDER BY timestamp desc", new Object[] { locala.bAf() });
    localObject1 = locala.mBT.rawQuery((String)localObject2, new String[] { localObject1 });
    paramj.mEy = new ArrayList();
    while (((Cursor)localObject1).moveToNext())
    {
      localObject2 = new l();
      ((l)localObject2).mDx = ((Cursor)localObject1).getString(0);
      paramj.mEy.add(localObject2);
    }
    ((Cursor)localObject1).close();
    paramj.bFZ = 0;
    AppMethodBeat.o(136683);
  }

  public final String getName()
  {
    return "SearchChatroomByMemberTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.k
 * JD-Core Version:    0.6.2
 */