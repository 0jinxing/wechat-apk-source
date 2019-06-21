package com.tencent.mm.plugin.fav.b.e;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class a$1 extends n.a
{
  a$1(a parama)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(5325);
    try
    {
      bool = at.isWifi(ah.getContext());
      ab.i("MicroMsg.Fav.FavCdnService", "onNetworkChange st:%d isWifi:%B, lastIsWifi:%B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(this.mgY.mgU) });
      if ((paramInt != 4) && (paramInt != 6))
      {
        this.mgY.mgU = bool;
        AppMethodBeat.o(5325);
        return;
      }
      if ((this.mgY.mgU) && (!bool))
      {
        a locala1 = this.mgY;
        ab.i("MicroMsg.Fav.FavCdnService", "pauseAll");
        localCursor = ((ae)g.M(ae.class)).getFavCdnStorage().buN();
        if ((localCursor != null) && (localCursor.moveToFirst()))
          while (localCursor.moveToNext())
          {
            localc = new com/tencent/mm/plugin/fav/a/c;
            localc.<init>();
            localc.d(localCursor);
            ab.i("MicroMsg.Fav.FavCdnService", "pauseAll, pauseUpload dataId:%s", new Object[] { localc.field_dataId });
            localc.field_status = 4;
            ((ae)g.M(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
            f.afx().rN(localc.field_dataId);
            a.g(((ae)g.M(ae.class)).getFavCdnStorage().LR(localc.field_dataId));
            locala1.LW(localc.field_dataId);
          }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool;
        c localc;
        ab.printErrStackTrace("MicroMsg.Fav.FavCdnService", localException, "", new Object[0]);
        AppMethodBeat.o(5325);
        continue;
        localCursor.close();
        Cursor localCursor = ((ae)g.M(ae.class)).getFavCdnStorage().buO();
        if ((localCursor != null) && (localCursor.moveToFirst()))
          while (localCursor.moveToNext())
          {
            localc = new com/tencent/mm/plugin/fav/a/c;
            localc.<init>();
            localc.d(localCursor);
            ab.i("MicroMsg.Fav.FavCdnService", "pauseAll, pauseDownload dataId:%s", new Object[] { localc.field_dataId });
            localc.field_status = 4;
            ((ae)g.M(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
            f.afx().rO(localc.field_dataId);
            a.g(((ae)g.M(ae.class)).getFavCdnStorage().LR(localc.field_dataId));
            localException.LW(localc.field_dataId);
          }
        if (localCursor != null)
          localCursor.close();
        if ((!this.mgY.mgU) && (bool))
        {
          a locala2 = this.mgY;
          ab.i("MicroMsg.Fav.FavCdnService", "startAll");
          ((ae)g.M(ae.class)).getFavCdnStorage().buL();
          locala2.run();
        }
        this.mgY.mgU = bool;
        AppMethodBeat.o(5325);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.a.1
 * JD-Core Version:    0.6.2
 */