package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.util.TMLog;

class TMOpenSDKToMsdkManager$9
  implements ITMAssistantDownloadSDKClientListener
{
  TMOpenSDKToMsdkManager$9(TMOpenSDKToMsdkManager paramTMOpenSDKToMsdkManager)
  {
  }

  public void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(75930);
    paramString = new Message();
    paramString.what = 1;
    paramTMAssistantDownloadSDKClient = new Bundle();
    paramTMAssistantDownloadSDKClient.putLong("receiveDataLen", paramLong1);
    paramTMAssistantDownloadSDKClient.putLong("totalDataLen", paramLong2);
    paramString.setData(paramTMAssistantDownloadSDKClient);
    this.this$0.mMainMessageHandler.sendMessage(paramString);
    AppMethodBeat.o(75930);
  }

  public void OnDownloadSDKTaskStateChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(75929);
    TMLog.i("OpensdkToMsdkManager", "OnDownloadSDKTaskStateChanged client:" + paramTMAssistantDownloadSDKClient + " | state:" + paramInt1 + " | errorcode:" + paramInt2 + " | errorMsg:" + paramString2);
    if ((paramTMAssistantDownloadSDKClient == null) || (TextUtils.isEmpty(paramString1)))
      AppMethodBeat.o(75929);
    while (true)
    {
      return;
      if (4 == paramInt1)
      {
        this.this$0.mSubMessageHandler.post(new TMOpenSDKToMsdkManager.9.1(this, paramTMAssistantDownloadSDKClient, paramString1));
        AppMethodBeat.o(75929);
      }
      else
      {
        if (5 == paramInt1)
        {
          paramTMAssistantDownloadSDKClient = new Message();
          paramTMAssistantDownloadSDKClient.what = 3;
          this.this$0.mMainMessageHandler.sendMessage(paramTMAssistantDownloadSDKClient);
        }
        AppMethodBeat.o(75929);
      }
    }
  }

  public void OnDwonloadSDKServiceInvalid(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.9
 * JD-Core Version:    0.6.2
 */