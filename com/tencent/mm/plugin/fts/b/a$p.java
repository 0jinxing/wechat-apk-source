package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import java.util.ArrayList;
import java.util.List;

public final class a$p extends com.tencent.mm.plugin.fts.a.a.h
{
  public a$p(a parama, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136688);
    long l = Long.valueOf(this.mEl.query).longValue();
    Object localObject1 = a.a(this.mFK);
    Object localObject2 = String.format("SELECT distinct(aux_index) FROM %s WHERE timestamp < %d AND type = %d", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).bAf(), Long.valueOf(l), Integer.valueOf(131072) });
    localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject2, null);
    paramj.mEy = new ArrayList();
    while (((Cursor)localObject2).moveToNext())
    {
      localObject1 = new l();
      ((l)localObject1).mDx = ((Cursor)localObject2).getString(0);
      paramj.mEy.add(localObject1);
    }
    ((Cursor)localObject2).close();
    AppMethodBeat.o(136688);
  }

  public final String getName()
  {
    return "SearchContactSmallerTimestampTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.p
 * JD-Core Version:    0.6.2
 */