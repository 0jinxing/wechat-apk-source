package com.tencent.mm.plugin.appbrand.game.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.h;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

final class b$c extends h
{
  b$c(b paramb, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(130070);
    paramj.mDz = g.aO(this.mEl.query, true);
    paramj.mEy = new ArrayList();
    HashSet localHashSet = new HashSet();
    Cursor localCursor = this.hqZ.hqX.a(paramj.mDz, c.mCh, this.mEl.mEs, true, true);
    try
    {
      while (localCursor.moveToNext())
      {
        m localm = new com/tencent/mm/plugin/fts/a/a/m;
        localm.<init>();
        localm.k(localCursor);
        if ((!localHashSet.contains(Long.valueOf(localm.mEB))) && (!this.mEl.mEu.contains(localm.mDx)))
        {
          localm.bAo();
          paramj.mEy.add(localm);
          localHashSet.add(Long.valueOf(localm.mEB));
        }
      }
    }
    catch (Throwable paramj)
    {
      AppMethodBeat.o(130070);
      throw paramj;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(130070);
    }
    if (localCursor != null)
      localCursor.close();
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(130070);
      throw paramj;
    }
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    AppMethodBeat.o(130070);
  }

  public final int getId()
  {
    return 30;
  }

  public final String getName()
  {
    return "SearchMiniGameTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.b.c
 * JD-Core Version:    0.6.2
 */