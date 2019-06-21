package com.tencent.mm.plugin.appbrand.f;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.h;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.m;
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
    AppMethodBeat.i(129961);
    paramj.mDz = g.aO(this.mEl.query, true);
    paramj.mEy = new ArrayList();
    HashSet localHashSet = new HashSet();
    Cursor localCursor = this.hpQ.hpO.a(paramj.mDz, com.tencent.mm.plugin.fts.a.c.mCg, this.mEl.mEs, true, true);
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
      AppMethodBeat.o(129961);
      throw paramj;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(129961);
    }
    if (localCursor != null)
      localCursor.close();
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(129961);
      throw paramj;
    }
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    AppMethodBeat.o(129961);
  }

  public final int getId()
  {
    return 21;
  }

  public final String getName()
  {
    return "SearchWeAppTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.b.c
 * JD-Core Version:    0.6.2
 */