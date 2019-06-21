package com.tencent.mm.plugin.downloader.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;

final class a$3 extends bj<TMAssistantDownloadTaskInfo>
{
  a$3(a parama, String paramString)
  {
    super(500L, null, (byte)0);
  }

  private TMAssistantDownloadTaskInfo biw()
  {
    AppMethodBeat.i(2492);
    Object localObject = null;
    try
    {
      TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo = this.kNK.getClient().getDownloadTaskState(this.val$url);
      localObject = localTMAssistantDownloadTaskInfo;
      AppMethodBeat.o(2492);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadStateSync faile: " + localException.toString());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.g.a.3
 * JD-Core Version:    0.6.2
 */