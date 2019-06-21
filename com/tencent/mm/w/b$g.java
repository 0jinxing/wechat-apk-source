package com.tencent.mm.w;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.a.m;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

final class b$g extends com.tencent.mm.plugin.fts.a.a.h
{
  private int[] eBq;
  private int[] eBr;

  public b$g(b paramb, i parami)
  {
    super(parami);
    this.eBq = parami.mEr;
    this.eBr = parami.mEs;
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(124485);
    super.a(paramj);
    Object localObject1 = this.eBa.eAY;
    Object localObject2 = paramj.mDz.mEa;
    Object localObject3 = this.eBq;
    Object localObject4 = this.eBr;
    Object localObject5 = d.B((String[])localObject2);
    localObject2 = String.format(", MMHighlight(%s, %d, type, subtype)", new Object[] { ((a)localObject1).bAg(), Integer.valueOf(localObject2.length) });
    if ((localObject4 != null) && (localObject4.length > 0))
    {
      localObject4 = " AND subtype IN " + d.t((int[])localObject4);
      if ((localObject3 == null) || (localObject3.length <= 0))
        break label373;
    }
    label373: for (localObject3 = " AND type IN " + d.t((int[])localObject3); ; localObject3 = "")
    {
      localObject4 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content" + (String)localObject2 + " FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + (String)localObject3 + "" + " AND status >= 0" + (String)localObject4 + ";", new Object[] { ((a)localObject1).bAf(), ((a)localObject1).bAf(), ((a)localObject1).bAg(), ((a)localObject1).bAf(), ((a)localObject1).bAg(), ((a)localObject1).bAg(), localObject5 });
      localObject5 = ((a)localObject1).mBT.MS((String)localObject4);
      localObject3 = new HashMap();
      while (((Cursor)localObject5).moveToNext())
      {
        localObject4 = new m().k((Cursor)localObject5);
        if (!this.mEl.mEu.contains(((m)localObject4).mDx))
        {
          localObject1 = (l)((HashMap)localObject3).get(Long.valueOf(((m)localObject4).mEB));
          if ((localObject1 == null) || (d.f(c.mCv, ((m)localObject4).mDw, ((l)localObject1).mDw) < 0))
          {
            ((m)localObject4).bAo();
            ((HashMap)localObject3).put(Long.valueOf(((m)localObject4).mEB), localObject4);
          }
        }
      }
      localObject4 = "";
      break;
    }
    ((Cursor)localObject5).close();
    if (Thread.interrupted())
    {
      paramj = new InterruptedException();
      AppMethodBeat.o(124485);
      throw paramj;
    }
    paramj.mEy = new ArrayList();
    paramj.mEy.addAll(((HashMap)localObject3).values());
    if (this.mEl.mEv != null)
      Collections.sort(paramj.mEy, this.mEl.mEv);
    AppMethodBeat.o(124485);
  }

  public final String getName()
  {
    return "FTS5SearchFriendLogic.NormalSearchTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.b.g
 * JD-Core Version:    0.6.2
 */