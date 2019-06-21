package com.tencent.mm.plugin.game.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hb;
import com.tencent.mm.g.a.hb.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class e$1 extends com.tencent.mm.sdk.b.c<hb>
{
  e$1()
  {
    AppMethodBeat.i(111508);
    this.xxI = hb.class.getName().hashCode();
    AppMethodBeat.o(111508);
  }

  private static boolean a(hb paramhb)
  {
    AppMethodBeat.i(111509);
    switch (paramhb.cBM.cuy)
    {
    case 1:
    default:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(111509);
      return false;
      if (bo.fp(bo.c((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSA, Long.valueOf(0L)))) > 300L)
      {
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSA, Long.valueOf(bo.anT()));
        h.a.bFa().hO(false);
        continue;
        paramhb = paramhb.cBM.csB;
        if (bo.isNullOrNil(paramhb))
        {
          ab.i("MicroMsg.GameSilentDownloadStorage", "deleteAllItem ret:%b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa().hY("GameSilentDownload", String.format("delete from %s", new Object[] { "GameSilentDownload" }))) });
        }
        else
        {
          Object localObject = new d();
          ((d)localObject).field_appId = paramhb;
          ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa().a((com.tencent.mm.sdk.e.c)localObject, new String[0]);
          ab.i("MicroMsg.GameSilentDownloadListener", "delete silent download, appid:%s", new Object[] { paramhb });
          continue;
          paramhb = paramhb.cBM.csB;
          if (!bo.isNullOrNil(paramhb))
          {
            localObject = com.tencent.mm.plugin.downloader.model.c.In(paramhb);
            if (localObject != null)
            {
              long l = ((a)localObject).field_downloadId;
              com.tencent.mm.plugin.downloader.model.d.bij().hl(l);
              com.tencent.mm.plugin.downloader.model.c.hw(((a)localObject).field_downloadId);
              ab.i("MicroMsg.GameSilentDownload.GameDownloadHelper", "delete downloadInfo in DB. appId:%s", new Object[] { paramhb });
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.e.1
 * JD-Core Version:    0.6.2
 */