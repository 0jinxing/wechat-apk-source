package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class a$v extends com.tencent.mm.plugin.fts.a.a.a
{
  private long mGj;
  private int mGk = 0;

  public a$v(a parama, long paramLong)
  {
    this.mGj = paramLong;
  }

  public final String aAo()
  {
    AppMethodBeat.i(136696);
    String str = String.format("{mLabelId: %d mContactCount: %d}", new Object[] { Long.valueOf(this.mGj), Integer.valueOf(this.mGk) });
    AppMethodBeat.o(136696);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136695);
    Object localObject1 = new ArrayList(32);
    Object localObject2 = a.a(this.mFK);
    long l = this.mGj;
    localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject2).mBT.rawQuery("SELECT user FROM FTS5ContactLabels WHERE label_id=?;", new String[] { Long.toString(l) });
    while (((Cursor)localObject2).moveToNext())
      ((ArrayList)localObject1).add(((Cursor)localObject2).getString(0));
    ((Cursor)localObject2).close();
    localObject2 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (!a.b(this.mFK).containsKey(str))
      {
        localObject1 = a.a(this.mFK).c(c.mCl, str);
        a.b(this.mFK).put(str, localObject1);
      }
    }
    AppMethodBeat.o(136695);
    return true;
  }

  public final String getName()
  {
    return "UpdateLabelTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.v
 * JD-Core Version:    0.6.2
 */