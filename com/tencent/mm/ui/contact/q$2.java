package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class q$2
  implements com.tencent.mm.plugin.fts.a.l
{
  q$2(q paramq)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(105232);
    switch (paramj.bFZ)
    {
    default:
    case 0:
    case -3:
    case -2:
    case -1:
    }
    while (true)
    {
      AppMethodBeat.o(105232);
      while (true)
      {
        return;
        if ((q.a(this.znA) == null) || (!q.a(this.znA).equals(q.a(this.znA))))
          break;
        q.a(this.znA, paramj.mDz);
        q.a(this.znA, paramj.mEy);
        if (paramj.mEy.size() > 0)
          switch (((com.tencent.mm.plugin.fts.a.a.l)paramj.mEy.get(0)).type)
          {
          default:
            ab.i("MicroMsg.MMSearchContactAdapter", "not support search");
          case 131072:
          case 131075:
          case 131076:
          case 131081:
          }
        while (true)
        {
          boolean bool = q.c(this.znA);
          q.a(this.znA, paramj.mAJ.query, bool);
          AppMethodBeat.o(105232);
          break;
          q.c(this.znA, paramj.mEy);
          continue;
          q.d(this.znA, paramj.mEy);
          continue;
          q.e(this.znA, paramj.mEy);
          continue;
          if (q.e(this.znA) != null)
            q.e(this.znA).addAll(paramj.mEy);
          else
            q.c(this.znA, paramj.mEy);
        }
        if (paramj.mAJ.query.equals(q.d(this.znA)))
          break label324;
        AppMethodBeat.o(105232);
      }
      label324: q.c(this.znA);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.q.2
 * JD-Core Version:    0.6.2
 */