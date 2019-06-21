package com.tencent.mm.plugin.game.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.protocal.protobuf.qg;
import com.tencent.mm.protocal.protobuf.qh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$1$2
  implements Runnable
{
  h$1$2(h.1 param1)
  {
  }

  public final void run()
  {
    long l1 = 0L;
    AppMethodBeat.i(111535);
    Object localObject1;
    Object localObject2;
    long l2;
    label80: int i;
    if (this.mZg.mZe.field_isFirst)
    {
      localObject1 = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa();
      localObject2 = this.mZg.mZe.field_appId;
      if (bo.isNullOrNil((String)localObject2))
      {
        ab.i("MicroMsg.GameSilentDownloadStorage", "updateFirstFlag: appid is null");
        l2 = this.mZg.mZe.field_randomTime;
        if (l2 > 0L)
          break label352;
        ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa().H(this.mZg.mZe.field_appId, l1);
        if (bo.anT() < l1)
          break label416;
        i = 1;
      }
    }
    while (true)
    {
      if (i != 0)
      {
        h localh = this.mZg.mZf;
        String str = this.mZg.mZe.field_appId;
        ab.i("MicroMsg.GameSilentDownloader", "source:%d, appid:%s", new Object[] { Integer.valueOf(1), str });
        b.a locala = new b.a();
        locala.fsI = 2819;
        locala.fsL = 0;
        locala.fsM = 0;
        locala.uri = "/cgi-bin/mmgame-bin/checkappdownloadquota";
        localObject1 = new qg();
        ((qg)localObject1).vFH = 1;
        ((qg)localObject1).fKh = str;
        localObject2 = com.tencent.mm.plugin.downloader.model.c.In(str);
        if (localObject2 != null)
        {
          ((qg)localObject1).vMJ = ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadUrl;
          ((qg)localObject1).vXq = ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadedSize;
        }
        locala.fsJ = ((com.tencent.mm.bt.a)localObject1);
        locala.fsK = new qh();
        w.a(locala.acD(), new h.2(localh, str));
      }
      AppMethodBeat.o(111535);
      return;
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateFirstFlag ret:%b", new Object[] { Boolean.valueOf(((g)localObject1).hY("GameSilentDownload", String.format("update %s set %s=0 where %s='%s'", new Object[] { "GameSilentDownload", "isFirst", "appId", localObject2 }))) });
      break;
      label352: i = bo.gV((int)l2, 0);
      ab.i("MicroMsg.GameSilentDownloader", "random time interval:%d", new Object[] { Integer.valueOf(i) });
      l1 = bo.anT();
      l1 = i + l1;
      break label80;
      if (bo.anT() >= this.mZg.mZe.field_nextCheckTime)
        i = 1;
      else
        label416: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.h.1.2
 * JD-Core Version:    0.6.2
 */