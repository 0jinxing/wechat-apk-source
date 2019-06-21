package com.tencent.mm.plugin.downloader.g;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.downloader.model.FileDownloadService;
import com.tencent.mm.plugin.downloader.model.b;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.vfs.e;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import java.util.HashSet;

final class a$1
  implements Runnable
{
  a$1(a parama, com.tencent.mm.plugin.downloader.f.a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2490);
    try
    {
      com.tencent.mm.plugin.downloader.a.c.h(this.kMF.field_appId, new String[] { this.kMF.field_downloadUrl, this.kMF.field_secondaryUrl });
      com.tencent.mm.plugin.s.a.bYL();
      m.aiN(this.kMF.field_appId);
      i = this.kNK.getClient().startDownloadTask(this.kMF.field_downloadUrl, this.kMF.field_secondaryUrl, this.kMF.field_fileSize, 0, "resource/tm.android.unknown", ag.ck(this.kMF.field_downloadUrl), this.kMF.field_autoDownload, this.kNK.kNH);
      switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        AppMethodBeat.o(2490);
        while (true)
        {
          return;
          try
          {
            TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo1 = this.kNK.getClient().getDownloadTaskState(this.kMF.field_downloadUrl);
            ab.i("MicroMsg.FileDownloaderImplTMAssistant", "Task Info from TMAssistant: URL: %s, PATH: %s, fileLen: %d, receiveLen: %d", new Object[] { this.kMF.field_downloadUrl, localTMAssistantDownloadTaskInfo1.mSavePath, Long.valueOf(e.asZ(localTMAssistantDownloadTaskInfo1.mSavePath)), Long.valueOf(localTMAssistantDownloadTaskInfo1.mReceiveDataLen) });
            this.kMF.field_status = 1;
            this.kMF.field_startTime = System.currentTimeMillis();
            this.kMF.field_startSize = localTMAssistantDownloadTaskInfo1.mReceiveDataLen;
            this.kMF.field_filePath = localTMAssistantDownloadTaskInfo1.mSavePath;
            this.kMF.field_downloadedSize = localTMAssistantDownloadTaskInfo1.mReceiveDataLen;
            this.kMF.field_totalSize = localTMAssistantDownloadTaskInfo1.mTotalDataLen;
            com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
            this.kNK.kNG.add(Long.valueOf(this.kMF.field_downloadId));
            a.a(this.kNK, this.kMF.field_downloadUrl, localTMAssistantDownloadTaskInfo1.mState, 0, true);
            this.kNK.kMT.j(this.kMF.field_downloadId, localTMAssistantDownloadTaskInfo1.mSavePath);
            ab.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask: id: %d, url: %s, path: %s", new Object[] { Long.valueOf(this.kMF.field_downloadId), this.kMF.field_downloadUrl, this.kMF.field_filePath });
            AppMethodBeat.o(2490);
          }
          catch (Exception localException1)
          {
          }
          ab.e("MicroMsg.FileDownloaderImplTMAssistant", "Adding task to TMAssistant failed: ", new Object[] { localException1.getMessage() });
          this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJN;
          this.kMF.field_status = 4;
          com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
          ab.e("MicroMsg.FileDownloaderImplTMAssistant", "Adding Task via TMAssistant Failed: %d, url: %s", new Object[] { Integer.valueOf(i), this.kMF.field_downloadUrl });
          this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kJN, false);
          AppMethodBeat.o(2490);
          continue;
          this.kMF.field_status = 4;
          this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJX;
          com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
          this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kJX, false);
          AppMethodBeat.o(2490);
          continue;
          this.kMF.field_status = 4;
          this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJP;
          com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
          this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kJP, false);
          AppMethodBeat.o(2490);
          continue;
          this.kMF.field_status = 4;
          this.kMF.field_errCode = com.tencent.mm.plugin.downloader.a.a.DOWNLOAD_ERR_URL_INVALID;
          com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
          com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
          this.kNK.kMT.d(this.kMF.field_downloadId, com.tencent.mm.plugin.downloader.a.a.DOWNLOAD_ERR_URL_INVALID, false);
          AppMethodBeat.o(2490);
          continue;
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "file has existed");
          TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo2 = this.kNK.getClient().getDownloadTaskState(this.kMF.field_downloadUrl);
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
            AppMethodBeat.o(2490);
          }
          catch (Exception localException2)
          {
            while (true)
              ab.e("MicroMsg.FileDownloaderImplTMAssistant", localException2.getMessage());
          }
        }
        this.kMF.field_startTime = System.currentTimeMillis();
        this.kMF.field_status = 1;
        com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
        this.kNK.kNG.add(Long.valueOf(this.kMF.field_downloadId));
        a.a(this.kNK, this.kMF.field_downloadUrl, 2, 0, true);
      }
    }
    catch (Exception localException3)
    {
      while (true)
        int i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.g.a.1
 * JD-Core Version:    0.6.2
 */