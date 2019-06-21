package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.util.TMLog;

class TMOpenSDKToMsdkManager$8
  implements Runnable
{
  TMOpenSDKToMsdkManager$8(TMOpenSDKToMsdkManager paramTMOpenSDKToMsdkManager, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(75927);
    TMAssistantDownloadSDKClient localTMAssistantDownloadSDKClient = this.this$0.getClient();
    try
    {
      if (localTMAssistantDownloadSDKClient.getDownloadTaskState(this.val$downloadUrl) != null)
      {
        localTMAssistantDownloadSDKClient.pauseDownloadTask(this.val$downloadUrl);
        AppMethodBeat.o(75927);
      }
      while (true)
      {
        return;
        TMLog.i("OpensdkToMsdkManager", "getDownloadTaskState taskinfo is null!");
        AppMethodBeat.o(75927);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("OpensdkToMsdkManager", localException, "", new Object[0]);
        AppMethodBeat.o(75927);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.8
 * JD-Core Version:    0.6.2
 */