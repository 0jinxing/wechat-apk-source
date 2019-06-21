package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class a$4
  implements Runnable
{
  a$4(a parama, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2358);
    ab.i("MicroMsg.FileCDNDownloader", "pauseDownloadTask");
    FileDownloadTaskInfo localFileDownloadTaskInfo = this.kME.hm(this.kMG);
    if ((localFileDownloadTaskInfo != null) && (localFileDownloadTaskInfo.status == 1))
    {
      com.tencent.mm.plugin.cdndownloader.d.a.beV().HA(localFileDownloadTaskInfo.url);
      a.a(this.kME, localFileDownloadTaskInfo.url);
      com.tencent.mm.plugin.downloader.f.a locala = c.hv(this.kMG);
      if (locala != null)
      {
        locala.field_finishTime = System.currentTimeMillis();
        locala.field_status = 2;
        locala.field_downloadedSize = localFileDownloadTaskInfo.kNr;
        c.e(locala);
        Long localLong = Long.valueOf(bo.a((Long)a.b(this.kME).get(localFileDownloadTaskInfo.url), locala.field_startTime));
        if (localLong != null)
        {
          long l1 = bo.a((Long)a.a(this.kME).get(localFileDownloadTaskInfo.url), locala.field_startSize);
          long l2 = System.currentTimeMillis();
          long l3 = localLong.longValue();
          float f = (float)(locala.field_downloadedSize - Long.valueOf(l1).longValue()) * 1000.0F / (float)(l2 - l3) / 1048576.0F;
          int i = (int)((float)locala.field_downloadedSize / (float)locala.field_totalSize * 100.0F);
          com.tencent.mm.plugin.downloader.h.b.a(locala.field_downloadId, f, i);
        }
      }
      a.a(this.kME).remove(localFileDownloadTaskInfo.url);
      a.b(this.kME).remove(localFileDownloadTaskInfo.url);
      this.kME.kMT.hs(this.kMG);
    }
    AppMethodBeat.o(2358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.a.4
 * JD-Core Version:    0.6.2
 */