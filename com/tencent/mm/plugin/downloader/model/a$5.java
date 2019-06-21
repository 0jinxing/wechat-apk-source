package com.tencent.mm.plugin.downloader.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;

final class a$5
  implements Runnable
{
  a$5(a parama, com.tencent.mm.plugin.downloader.f.a parama1, boolean paramBoolean, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2359);
    com.tencent.mm.plugin.downloader.a.c.h(this.kMF.field_appId, new String[] { this.kMF.field_downloadUrl, this.kMF.field_secondaryUrl });
    com.tencent.mm.plugin.s.a.bYL();
    m.aiN(this.kMF.field_appId);
    int i = com.tencent.mm.plugin.cdndownloader.d.a.beV().b(a.c(this.kMF));
    ab.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask: ".concat(String.valueOf(i)));
    this.kMF.field_startTime = System.currentTimeMillis();
    this.kMF.field_startSize = this.kMF.field_downloadedSize;
    this.kMF.field_startState = com.tencent.mm.plugin.downloader.a.b.kKd;
    long l;
    if (i == 0)
    {
      this.kMF.field_status = 1;
      this.kMF.field_errCode = 0;
      c.e(this.kMF);
      if (this.kMH)
        this.kME.kMT.k(this.kMG, this.kMF.field_filePath);
      l = 0L;
      if (this.kMF.field_totalSize != 0L)
        l = this.kMF.field_downloadedSize * 100L / this.kMF.field_totalSize;
      ab.d("MicroMsg.FileCDNDownloader", "resumeDownloadTask, progress = %d, downloadedSize = %d, totalSize = %d", new Object[] { Long.valueOf(l), Long.valueOf(this.kMF.field_downloadedSize), Long.valueOf(this.kMF.field_totalSize) });
      a.a(this.kME, this.kMF.field_downloadUrl, 1, (int)l, true);
      AppMethodBeat.o(2359);
    }
    while (true)
    {
      return;
      if (i == -2)
      {
        this.kMF.field_status = 1;
        this.kMF.field_errCode = 0;
        c.e(this.kMF);
        AppMethodBeat.o(2359);
      }
      else if (i == 1)
      {
        if ((this.kMF.field_status == 6) || (this.kMF.field_status == 3))
        {
          AppMethodBeat.o(2359);
        }
        else
        {
          this.kMF.field_status = 6;
          Object localObject = this.kMF;
          com.tencent.mm.plugin.downloader.f.a locala = this.kMF;
          l = this.kMF.field_totalSize;
          locala.field_downloadedSize = l;
          ((com.tencent.mm.plugin.downloader.f.a)localObject).field_startSize = l;
          locala = this.kMF;
          localObject = this.kMF;
          l = System.currentTimeMillis();
          ((com.tencent.mm.plugin.downloader.f.a)localObject).field_finishTime = l;
          locala.field_startTime = l;
          c.e(this.kMF);
          this.kME.kMT.hu(this.kMF.field_downloadId);
          localObject = new Intent();
          ((Intent)localObject).putExtra(FileDownloadService.kNn, 1);
          ((Intent)localObject).setClass(a.c(this.kME), FileDownloadService.class);
          ((Intent)localObject).putExtra(FileDownloadService.EXTRA_ID, this.kMF.field_downloadId);
          try
          {
            d.aH((Intent)localObject);
            AppMethodBeat.o(2359);
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.FileCDNDownloader", localException.getMessage());
            AppMethodBeat.o(2359);
          }
        }
      }
      else
      {
        this.kMF.field_status = 4;
        this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJR;
        c.e(this.kMF);
        this.kME.kMT.d(this.kMG, this.kMF.field_errCode, false);
        AppMethodBeat.o(2359);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.a.5
 * JD-Core Version:    0.6.2
 */