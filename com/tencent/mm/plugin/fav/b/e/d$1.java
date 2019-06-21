package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.al;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class d$1
  implements Runnable
{
  d$1(d paramd, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5372);
    d.a(this.mhh);
    int i = ((al)this.crb).mgq;
    d.aje().remove(Integer.valueOf(i));
    if ((this.crd != 3) || (this.crd != 0))
      d.b(this.mhh);
    com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(i);
    if ((localg == null) || (localg.field_itemStatus == 10))
      AppMethodBeat.o(5372);
    while (true)
    {
      return;
      if ((this.crc == 0) && (this.crd == 0))
        if (localg.field_itemStatus == 17)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(0), Long.valueOf(b.b(localg)), Long.valueOf(com.tencent.mm.plugin.fav.a.h.ix(localg.field_localId)) });
          ab.i("MicroMsg.Fav.FavModService", "mod end set status done. favId:%d", new Object[] { Integer.valueOf(localg.field_id) });
          localg.field_itemStatus = 10;
          d.A(localg);
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iB(localg.field_localId);
        }
      while (true)
      {
        if (d.c(this.mhh) <= 0)
          break label505;
        if (d.d(this.mhh))
          break label519;
        d.startSync();
        AppMethodBeat.o(5372);
        break;
        Integer localInteger1 = Integer.valueOf(bo.a((Integer)d.access$400().get(Integer.valueOf(i)), 0));
        Integer localInteger2 = localInteger1;
        if (this.crc != 1)
        {
          localInteger2 = localInteger1;
          if (this.crc != 0)
            localInteger2 = Integer.valueOf(localInteger1.intValue() - 1);
        }
        if (localInteger2.intValue() <= 0)
        {
          int j = com.tencent.mm.plugin.fav.a.h.ed(this.crc, this.crd);
          com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(j), Long.valueOf(b.b(localg)), Long.valueOf(com.tencent.mm.plugin.fav.a.h.ix(localg.field_localId)) });
          d.access$400().remove(Integer.valueOf(i));
          ab.e("MicroMsg.Fav.FavModService", "achieved retry limit, set error, favId:%d", new Object[] { Integer.valueOf(i) });
          localg.field_itemStatus = 18;
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
        }
      }
      label505: ab.i("MicroMsg.Fav.FavModService", "klem stopFlag <= 0 , Stop Service");
      d.e(this.mhh);
      label519: AppMethodBeat.o(5372);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5373);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(5373);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.d.1
 * JD-Core Version:    0.6.2
 */