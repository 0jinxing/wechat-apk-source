package com.tencent.mm.plugin.downloader.g;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.downloader.model.FileDownloadService;
import com.tencent.mm.plugin.downloader.model.b;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import java.util.HashSet;

final class a$7
  implements Runnable
{
  a$7(a parama, com.tencent.mm.plugin.downloader.f.a parama1, boolean paramBoolean, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2499);
    try
    {
      com.tencent.mm.plugin.downloader.a.c.h(this.kMF.field_appId, new String[] { this.kMF.field_downloadUrl, this.kMF.field_secondaryUrl });
      com.tencent.mm.plugin.s.a.bYL();
      m.aiN(this.kMF.field_appId);
      TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo1 = this.kNK.getClient().getDownloadTaskState(this.kMF.field_downloadUrl);
      if ((localTMAssistantDownloadTaskInfo1 != null) && ((localTMAssistantDownloadTaskInfo1.mState == 1) || (localTMAssistantDownloadTaskInfo1.mState == 2)))
      {
        ab.w("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, is running");
        AppMethodBeat.o(2499);
      }
      while (true)
      {
        return;
        int i = this.kNK.getClient().startDownloadTask(this.kMF.field_downloadUrl, this.kMF.field_secondaryUrl, this.kMF.field_fileSize, 0, "resource/tm.android.unknown", ag.ck(this.kMF.field_downloadUrl), this.kMF.field_autoDownload, this.kNK.kNH);
        localTMAssistantDownloadTaskInfo2 = this.kNK.getClient().getDownloadTaskState(this.kMF.field_downloadUrl);
        switch (i)
        {
        default:
          AppMethodBeat.o(2499);
          break;
        case 0:
          this.kMF.field_status = 1;
          this.kMF.field_startTime = System.currentTimeMillis();
          this.kMF.field_filePath = localTMAssistantDownloadTaskInfo2.mSavePath;
          this.kMF.field_totalSize = localTMAssistantDownloadTaskInfo2.mTotalDataLen;
          this.kMF.field_status = 1;
          com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
          this.kNK.kNG.add(Long.valueOf(this.kMF.field_downloadId));
          a.a(this.kNK, this.kMF.field_downloadUrl, 2, 0, true);
          if (this.kMH)
            this.kNK.kMT.k(this.kMF.field_downloadId, this.kMF.field_filePath);
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d", new Object[] { Long.valueOf(this.kMG) });
          AppMethodBeat.o(2499);
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo2;
        ab.e("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %s", new Object[] { localException1.toString() });
        ab.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", localException1, "", new Object[0]);
        this.kMF.field_status = 4;
        this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJO;
        com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
        this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kJO, false);
        AppMethodBeat.o(2499);
        continue;
        this.kMF.field_status = 4;
        this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJX;
        com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
        this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kJX, false);
        AppMethodBeat.o(2499);
        continue;
        this.kMF.field_status = 4;
        this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJP;
        com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
        this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kJP, false);
        AppMethodBeat.o(2499);
        continue;
        this.kMF.field_status = 4;
        this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.DOWNLOAD_ERR_URL_INVALID;
        com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
        this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.DOWNLOAD_ERR_URL_INVALID, false);
        AppMethodBeat.o(2499);
        continue;
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "file has existed");
        Object localObject = this.kMF;
        com.tencent.mm.plugin.downloader.f.a locala = this.kMF;
        long l = System.currentTimeMillis();
        locala.field_finishTime = l;
        ((com.tencent.mm.plugin.downloader.f.a)localObject).field_startTime = l;
        this.kMF.field_status = 6;
        this.kMF.field_filePath = localTMAssistantDownloadTaskInfo2.mSavePath;
        this.kMF.field_startSize = localTMAssistantDownloadTaskInfo2.mReceiveDataLen;
        this.kMF.field_downloadedSize = localTMAssistantDownloadTaskInfo2.mReceiveDataLen;
        this.kMF.field_totalSize = localTMAssistantDownloadTaskInfo2.mTotalDataLen;
        com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
        this.kNK.kMT.hu(this.kMF.field_downloadId);
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        ((Intent)localObject).putExtra(FileDownloadService.kNn, 1);
        ((Intent)localObject).setClass(this.kNK.mContext, FileDownloadService.class);
        ((Intent)localObject).putExtra(FileDownloadService.EXTRA_ID, this.kMF.field_downloadId);
        try
        {
          d.aH((Intent)localObject);
          this.kNK.kNG.remove(Long.valueOf(this.kMF.field_downloadId));
          AppMethodBeat.o(2499);
        }
        catch (Exception localException2)
        {
          while (true)
            ab.e("MicroMsg.FileDownloaderImplTMAssistant", localException2.getMessage());
        }
        this.kMF.field_startTime = System.currentTimeMillis();
        this.kMF.field_status = 1;
        com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
        this.kNK.kNG.add(Long.valueOf(this.kMF.field_downloadId));
        a.a(this.kNK, this.kMF.field_downloadUrl, 2, 0, true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.g.a.7
 * JD-Core Version:    0.6.2
 */