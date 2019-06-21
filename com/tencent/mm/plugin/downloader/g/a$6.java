package com.tencent.mm.plugin.downloader.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;

final class a$6
  implements Runnable
{
  a$6(a parama, com.tencent.mm.plugin.downloader.f.a parama1, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2498);
    try
    {
      TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo = this.kNK.getClient().getDownloadTaskState(this.kMF.field_downloadUrl);
      if (localTMAssistantDownloadTaskInfo.mState != 1)
      {
        int i = localTMAssistantDownloadTaskInfo.mState;
        if (i != 2)
          AppMethodBeat.o(2498);
      }
      while (true)
      {
        return;
        this.kNK.getClient().pauseDownloadTask(this.kMF.field_downloadUrl);
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d ", new Object[] { Long.valueOf(this.kMG) });
        AppMethodBeat.o(2498);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %s", new Object[] { localException.toString() });
        ab.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", localException, "", new Object[0]);
        AppMethodBeat.o(2498);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.g.a.6
 * JD-Core Version:    0.6.2
 */