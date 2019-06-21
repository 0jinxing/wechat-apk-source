package com.tencent.mm.plugin.fav.b.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class b$f extends com.tencent.mm.plugin.fts.a.a.h
{
  b$f(b paramb, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(5310);
    paramj.mDz = g.aO(this.mEl.query, true);
    Object localObject1 = this.mgH.mgE;
    Object localObject2 = paramj.mDz;
    int i = this.mEl.mEt;
    localObject2 = ((g)localObject2).bAl();
    localObject2 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' ORDER BY -timestamp, subtype limit " + (i + 1 + 1) + ";", new Object[] { ((a)localObject1).bAf(), ((a)localObject1).bAf(), ((a)localObject1).bAg(), ((a)localObject1).bAf(), ((a)localObject1).bAg(), ((a)localObject1).bAg(), localObject2 });
    localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject2, null);
    paramj.mEy = new ArrayList();
    HashSet localHashSet = new HashSet();
    while (((Cursor)localObject2).moveToNext())
      if (localHashSet.add(String.valueOf(((Cursor)localObject2).getLong(3))))
      {
        localObject1 = new m().k((Cursor)localObject2);
        paramj.mEy.add(localObject1);
        if (paramj.mEy.size() <= this.mEl.mEt)
          if (Thread.interrupted())
          {
            ((Cursor)localObject2).close();
            paramj = new InterruptedException();
            AppMethodBeat.o(5310);
            throw paramj;
          }
      }
    ((Cursor)localObject2).close();
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(5310);
      throw paramj;
    }
    AppMethodBeat.o(5310);
  }

  public final int getId()
  {
    return 9;
  }

  public final String getName()
  {
    return "SearchTopFavoriteTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.a.b.f
 * JD-Core Version:    0.6.2
 */