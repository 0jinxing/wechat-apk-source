package com.tencent.mm.plugin.downloader.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

final class a$2
  implements Runnable
{
  a$2(a parama, com.tencent.mm.plugin.downloader.f.a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2356);
    com.tencent.mm.plugin.downloader.a.c.h(this.kMF.field_appId, new String[] { this.kMF.field_downloadUrl, this.kMF.field_secondaryUrl });
    com.tencent.mm.plugin.s.a.bYL();
    m.aiN(this.kMF.field_appId);
    Object localObject = a.c(this.kMF);
    int i = com.tencent.mm.plugin.cdndownloader.d.a.beV().a((CDNTaskInfo)localObject);
    ab.i("MicroMsg.FileCDNDownloader", "addDownloadTask: ret = %d, downloadId = %d", new Object[] { Integer.valueOf(i), Long.valueOf(this.kMF.field_downloadId) });
    if (i == 0)
    {
      this.kMF.field_status = 1;
      this.kMF.field_startTime = System.currentTimeMillis();
      c.d(this.kMF);
      this.kME.kMT.j(this.kMF.field_downloadId, this.kMF.field_filePath);
      a.a(this.kME, this.kMF.field_downloadUrl, 1, 0, true);
      AppMethodBeat.o(2356);
    }
    while (true)
    {
      return;
      if (i == -2)
      {
        this.kMF.field_status = 1;
        this.kMF.field_startTime = System.currentTimeMillis();
        c.d(this.kMF);
        AppMethodBeat.o(2356);
      }
      else if (i == 1)
      {
        this.kMF.field_status = 6;
        localObject = this.kMF;
        com.tencent.mm.plugin.downloader.f.a locala1 = this.kMF;
        com.tencent.mm.plugin.downloader.f.a locala2 = this.kMF;
        long l = e.asZ(this.kMF.field_filePath);
        locala2.field_totalSize = l;
        locala1.field_downloadedSize = l;
        ((com.tencent.mm.plugin.downloader.f.a)localObject).field_startSize = l;
        localObject = this.kMF;
        locala2 = this.kMF;
        l = System.currentTimeMillis();
        locala2.field_finishTime = l;
        ((com.tencent.mm.plugin.downloader.f.a)localObject).field_startTime = l;
        c.d(this.kMF);
        this.kME.kMT.hu(this.kMF.field_downloadId);
        localObject = new Intent();
        ((Intent)localObject).putExtra(FileDownloadService.kNn, 1);
        ((Intent)localObject).setClass(a.c(this.kME), FileDownloadService.class);
        ((Intent)localObject).putExtra(FileDownloadService.EXTRA_ID, this.kMF.field_downloadId);
        try
        {
          d.aH((Intent)localObject);
          AppMethodBeat.o(2356);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.FileCDNDownloader", localException.getMessage());
          AppMethodBeat.o(2356);
        }
      }
      else
      {
        this.kMF.field_status = 4;
        this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJQ;
        c.d(this.kMF);
        this.kME.kMT.d(this.kMF.field_downloadId, this.kMF.field_errCode, false);
        AppMethodBeat.o(2356);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.a.2
 * JD-Core Version:    0.6.2
 */