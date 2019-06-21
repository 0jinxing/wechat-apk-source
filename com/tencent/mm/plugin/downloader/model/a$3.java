package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.HashMap;

final class a$3
  implements Runnable
{
  a$3(a parama, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2357);
    FileDownloadTaskInfo localFileDownloadTaskInfo = this.kME.hm(this.kMG);
    if (localFileDownloadTaskInfo == null)
      AppMethodBeat.o(2357);
    while (true)
    {
      return;
      com.tencent.mm.plugin.cdndownloader.d.a.beV().HB(localFileDownloadTaskInfo.url);
      a.a(this.kME, localFileDownloadTaskInfo.url);
      e.deleteFile(localFileDownloadTaskInfo.path);
      ab.i("MicroMsg.FileCDNDownloader", "removeDownloadTask, delete file, path: %s", new Object[] { localFileDownloadTaskInfo.path });
      if (localFileDownloadTaskInfo.status != 5)
      {
        com.tencent.mm.plugin.downloader.f.a locala = c.hv(this.kMG);
        if (locala == null)
        {
          AppMethodBeat.o(2357);
        }
        else
        {
          locala.field_finishTime = System.currentTimeMillis();
          locala.field_downloadedSize = localFileDownloadTaskInfo.kNr;
          locala.field_status = 5;
          c.e(locala);
          Long localLong = Long.valueOf(bo.a((Long)a.b(this.kME).get(localFileDownloadTaskInfo.url), locala.field_startTime));
          if (localLong != null)
          {
            long l1 = bo.a((Long)a.a(this.kME).get(localFileDownloadTaskInfo.url), locala.field_startSize);
            long l2 = System.currentTimeMillis();
            long l3 = localLong.longValue();
            float f = (float)(localFileDownloadTaskInfo.kNr - Long.valueOf(l1).longValue()) * 1000.0F / (float)(l2 - l3) / 1048576.0F;
            int i = (int)((float)localFileDownloadTaskInfo.kNr / (float)localFileDownloadTaskInfo.jrb * 100.0F);
            com.tencent.mm.plugin.downloader.h.b.a(this.kMG, f, i);
          }
          a.a(this.kME).remove(localFileDownloadTaskInfo.url);
          a.b(this.kME).remove(localFileDownloadTaskInfo.url);
          this.kME.kMT.hr(this.kMG);
        }
      }
      else
      {
        AppMethodBeat.o(2357);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.a.3
 * JD-Core Version:    0.6.2
 */