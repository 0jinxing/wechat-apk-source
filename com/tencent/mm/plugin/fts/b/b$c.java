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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class b$c extends h
{
  private b$c(b paramb, i parami)
  {
    super(parami);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(136722);
    paramj.mDz = g.aO(this.mEl.query, true);
    paramj.mEy = new ArrayList();
    HashSet localHashSet = new HashSet();
    Cursor localCursor = this.mGm.mGl.a(paramj.mDz, c.mCe, this.mEl.mEs, true, true);
    Object localObject;
    while (localCursor.moveToNext())
    {
      localObject = new m();
      ((m)localObject).k(localCursor);
      if ((!localHashSet.contains(Long.valueOf(((m)localObject).mEB))) && (!this.mEl.mEu.contains(((m)localObject).mDx)))
      {
        ((m)localObject).bAo();
        paramj.mEy.add(localObject);
        localHashSet.add(Long.valueOf(((m)localObject).mEB));
      }
    }
    if (localCursor != null)
      localCursor.close();
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(136722);
      throw paramj;
    }
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    paramj = paramj.mEy.iterator();
    while (paramj.hasNext())
    {
      localObject = (l)paramj.next();
      ((l)localObject).userData = this.mGm.mGl.wa((int)((l)localObject).mEB);
    }
    AppMethodBeat.o(136722);
  }

  public final int getId()
  {
    return 12;
  }

  public final String getName()
  {
    return "SearchFeatureTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.b.c
 * JD-Core Version:    0.6.2
 */