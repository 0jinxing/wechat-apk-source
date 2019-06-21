package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.concurrent.CopyOnWriteArraySet;

final class g$1
  implements Runnable
{
  g$1(g paramg, e parame, com.tencent.mm.plugin.downloader.f.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2452);
    if (this.kNx.kNd)
    {
      String str = f.Iy(this.kMF.field_downloadUrl);
      this.kMF.field_md5 = str;
    }
    long l = this.kNy.g(this.kMF);
    if (l > 0L)
    {
      this.kMF.field_sysDownloadId = l;
      this.kMF.field_status = 1;
      c.e(this.kMF);
      this.kNy.kMT.j(this.kMF.field_downloadId, this.kMF.field_filePath);
      d.bij();
      if (d.hx(this.kMF.field_downloadId))
      {
        d.bij();
        d.G(this.kMF.field_downloadId, l);
      }
      this.kNy.kNw.add(Long.valueOf(this.kMF.field_downloadId));
      if (this.kNy.gyS.doT())
        this.kNy.gyS.ae(100L, 100L);
      ab.i("MicroMsg.FileDownloaderImpl23", "addDownloadTask: id: %d, url: %s, path: %s", new Object[] { Long.valueOf(this.kMF.field_downloadId), this.kMF.field_downloadUrl, this.kMF.field_filePath });
      AppMethodBeat.o(2452);
    }
    while (true)
    {
      return;
      this.kMF.field_status = 4;
      c.e(this.kMF);
      this.kNy.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kKb, false);
      ab.e("MicroMsg.FileDownloaderImpl23", "addDownloadTask Failed: Invalid downloadId");
      AppMethodBeat.o(2452);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.g.1
 * JD-Core Version:    0.6.2
 */