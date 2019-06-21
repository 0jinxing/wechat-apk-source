package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.af;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.Set;

final class e$1
  implements Runnable
{
  e$1(e parame, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5388);
    if (this.crb.getType() != 401)
      AppMethodBeat.o(5388);
    while (true)
    {
      return;
      if (!(this.crb instanceof af))
      {
        AppMethodBeat.o(5388);
      }
      else
      {
        e.a(this.mhj);
        com.tencent.mm.plugin.fav.a.g localg = ((af)this.crb).mfY;
        long l = localg.field_localId;
        e.aje().remove(Long.valueOf(l));
        if (((this.crc == 0) && (this.crd == 0)) || (this.crd == -400))
          e.aLr().add(Long.valueOf(l));
        if ((this.crc != 0) && (this.crd != -400))
          e.b(this.mhj);
        Integer localInteger1 = Integer.valueOf(bo.a((Integer)e.access$400().get(Long.valueOf(l)), 0));
        Integer localInteger2 = localInteger1;
        if (this.crc != 1)
        {
          localInteger2 = localInteger1;
          if (this.crc != 0)
          {
            localInteger2 = Integer.valueOf(localInteger1.intValue() - 1);
            e.access$400().put(Long.valueOf(localg.field_localId), localInteger2);
          }
        }
        if (localInteger2.intValue() <= 0)
        {
          int i = com.tencent.mm.plugin.fav.a.h.ed(this.crc, this.crd);
          com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(i), Long.valueOf(b.b(localg)), Long.valueOf(com.tencent.mm.plugin.fav.a.h.ix(localg.field_localId)) });
          e.access$400().remove(Long.valueOf(l));
          ab.e("MicroMsg.Fav.FavSendService", "achieved retry limit, set error, localId:%d", new Object[] { Long.valueOf(l) });
          if (localg.field_itemStatus == 12)
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(14, localg.field_localId);
          if (localg.field_itemStatus == 9)
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(11, localg.field_localId);
        }
        if (e.c(this.mhj) > 0)
        {
          if (!e.d(this.mhj))
          {
            e.startSync();
            AppMethodBeat.o(5388);
          }
        }
        else
        {
          ab.i("MicroMsg.Fav.FavSendService", "klem stopFlag <= 0 , Stop Service");
          e.e(this.mhj);
          AppMethodBeat.o(5388);
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5389);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(5389);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.e.1
 * JD-Core Version:    0.6.2
 */