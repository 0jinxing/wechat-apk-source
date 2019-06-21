package com.tencent.mm.plugin.downloader.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import java.util.HashMap;
import java.util.HashSet;

final class a$2
  implements Runnable
{
  a$2(a parama, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2491);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(this.kMG);
    if (locala == null)
      AppMethodBeat.o(2491);
    while (true)
    {
      return;
      try
      {
        this.kNK.getClient().cancelDownloadTask(locala.field_downloadUrl);
        e.deleteFile(locala.field_filePath);
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask, delete file, path: %s", new Object[] { locala.field_filePath });
        this.kNK.kNG.remove(Long.valueOf(locala.field_downloadId));
        a.a(this.kNK, locala.field_downloadUrl);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("removeDownloadTask: status = ");
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", locala.field_status);
        int i = locala.field_status;
        if (i == 5)
        {
          AppMethodBeat.o(2491);
        }
        else
        {
          locala.field_status = 5;
          locala.field_finishTime = System.currentTimeMillis();
          c.e(locala);
          long l1 = bo.a((Long)this.kNK.kMD.get(locala.field_downloadUrl), locala.field_startTime);
          long l2 = bo.a((Long)this.kNK.kMC.get(locala.field_downloadUrl), locala.field_startSize);
          long l3 = System.currentTimeMillis();
          i = (int)((float)locala.field_downloadedSize / (float)locala.field_totalSize * 100.0F);
          float f = (float)(locala.field_downloadedSize - l2) * 1000.0F / (float)(l3 - l1) / 1048576.0F;
          com.tencent.mm.plugin.downloader.h.b.a(locala.field_downloadId, f, i);
          this.kNK.kMT.hr(locala.field_downloadId);
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: id: %d, path: %s", new Object[] { Long.valueOf(this.kMG), locala.field_filePath });
          AppMethodBeat.o(2491);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant remove task failed: " + localException.toString());
        AppMethodBeat.o(2491);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.g.a.2
 * JD-Core Version:    0.6.2
 */