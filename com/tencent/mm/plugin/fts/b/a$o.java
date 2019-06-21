package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a$o extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$o(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136687);
    Object localObject1 = bo.P(this.mEl.query.split(","));
    Object localObject2 = a.a(this.mFK);
    Object localObject3 = new StringBuffer();
    ((StringBuffer)localObject3).append("member IN (");
    for (int i = 0; i < ((List)localObject1).size(); i++)
    {
      ((StringBuffer)localObject3).append("'");
      ((StringBuffer)localObject3).append((String)((List)localObject1).get(i));
      ((StringBuffer)localObject3).append("'");
      if (i != ((List)localObject1).size() - 1)
        ((StringBuffer)localObject3).append(",");
    }
    ((StringBuffer)localObject3).append(")");
    localObject3 = String.format("SELECT member, chatroom, entity_id FROM FTS5ChatRoomMembers, %s WHERE %s AND chatroom = aux_index", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject2).bAf(), ((StringBuffer)localObject3).toString() });
    Cursor localCursor = ((com.tencent.mm.plugin.fts.a.a)localObject2).mBT.rawQuery((String)localObject3, null);
    localObject3 = new HashMap();
    if (localCursor.moveToNext())
    {
      localObject1 = localCursor.getString(0);
      if (((HashMap)localObject3).containsKey(localObject1));
      for (localObject2 = (List)((HashMap)localObject3).get(localObject1); ; localObject2 = new ArrayList())
      {
        l locall = new l();
        locall.mDx = localCursor.getString(1);
        locall.mEB = localCursor.getLong(2);
        ((List)localObject2).add(locall);
        ((HashMap)localObject3).put(localObject1, localObject2);
        break;
      }
    }
    localCursor.close();
    paramj.mEy = new ArrayList();
    localObject2 = new l();
    ((l)localObject2).userData = localObject3;
    paramj.mEy.add(localObject2);
    AppMethodBeat.o(136687);
  }

  public final String getName()
  {
    return "SearchCommonChatroomTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.o
 * JD-Core Version:    0.6.2
 */