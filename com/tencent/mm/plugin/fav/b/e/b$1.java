package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.ai;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class b$1
  implements Runnable
{
  b$1(b paramb, m paramm, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5349);
    if (this.crb.getType() != 404)
      AppMethodBeat.o(5349);
    while (true)
    {
      return;
      if (!(this.crb instanceof ai))
      {
        AppMethodBeat.o(5349);
      }
      else
      {
        b.a(this.mhc);
        long l = ((ai)this.crb).mgf.field_localId;
        com.tencent.mm.plugin.fav.a.g localg = ((ai)this.crb).mgf;
        b.aje().remove(Long.valueOf(l));
        if (this.crc != 0)
        {
          ab.e("MicroMsg.Fav.FavCheckCdnService", "achieved retry limit, set error, localId:%d", new Object[] { Long.valueOf(l) });
          com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(-2), Long.valueOf(com.tencent.mm.plugin.fav.a.b.b(localg)), Long.valueOf(com.tencent.mm.plugin.fav.a.h.ix(localg.field_localId)) });
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(3, l);
        }
        b.b(this.mhc);
        AppMethodBeat.o(5349);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5350);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(5350);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.b.1
 * JD-Core Version:    0.6.2
 */