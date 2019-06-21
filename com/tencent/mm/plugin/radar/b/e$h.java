package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.model.lbs.Location;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onTimerExpired"})
final class e$h
  implements ap.a
{
  e$h(e parame)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(102919);
    if (!e.a(this.pBX))
    {
      e.a(this.pBX, e.f.pBU);
      ab.d(e.access$getTAG$cp(), "status: %s", new Object[] { e.b(this.pBX) });
      Object localObject = e.c(this.pBX);
      if (localObject != null)
      {
        if (((Location)localObject).dhR())
        {
          ab.e(e.access$getTAG$cp(), "error! location is null!");
          AppMethodBeat.o(102919);
          return false;
        }
        ab.d(e.access$getTAG$cp(), "do once search");
        e locale = this.pBX;
        float f1 = ((Location)localObject).fBr;
        float f2 = ((Location)localObject).fBs;
        int i = ((Location)localObject).accuracy;
        int j = ((Location)localObject).cGo;
        String str = ((Location)localObject).mac;
        j.o(str, "it.mac");
        localObject = ((Location)localObject).cGq;
        j.o(localObject, "it.cellId");
        e.a(locale, new b(1, f1, f2, i, j, str, (String)localObject));
        g.Rg().d((m)e.d(this.pBX));
      }
    }
    while (true)
    {
      AppMethodBeat.o(102919);
      break;
      ab.e(e.access$getTAG$cp(), "error! location is null!");
      AppMethodBeat.o(102919);
      break;
      ab.d(e.access$getTAG$cp(), "cancel radar searching");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.e.h
 * JD-Core Version:    0.6.2
 */