package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.Iterator;
import java.util.List;

final class b$2 extends n.a
{
  b$2(b paramb)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(5351);
    boolean bool;
    try
    {
      bool = at.isWifi(ah.getContext());
      if ((paramInt != 4) && (paramInt != 6))
      {
        b.a(this.mhc, bool);
        AppMethodBeat.o(5351);
        return;
      }
      ab.i("MicroMsg.Fav.FavCheckCdnService", "onNetworkChange st:%d isWifi:%B, lastIsWifi:%B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(b.c(this.mhc)) });
      if ((!b.c(this.mhc)) && (bool))
      {
        b localb = this.mhc;
        Object localObject = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buT();
        if ((localObject == null) || (((List)localObject).size() <= 0))
          break label279;
        ab.i("MicroMsg.Fav.FavCheckCdnService", "startAll list.size:%d", new Object[] { Integer.valueOf(((List)localObject).size()) });
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)((Iterator)localObject).next();
          if (localg.field_itemStatus == 3)
          {
            localg.field_itemStatus = 1;
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Fav.FavCheckCdnService", localException, "", new Object[0]);
        AppMethodBeat.o(5351);
      }
      localException.run();
    }
    while (true)
    {
      b.a(this.mhc, bool);
      AppMethodBeat.o(5351);
      break;
      label279: ab.i("MicroMsg.Fav.FavCheckCdnService", "startAll list.size 0");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.b.2
 * JD-Core Version:    0.6.2
 */