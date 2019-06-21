package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.os.Bundle;
import android.os.Message;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.logreport.TipsInfoReportManager;
import com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog;

class TMOpenSDKToMsdkManager$3
  implements Runnable
{
  TMOpenSDKToMsdkManager$3(TMOpenSDKToMsdkManager paramTMOpenSDKToMsdkManager)
  {
  }

  public void run()
  {
    AppMethodBeat.i(75922);
    try
    {
      Object localObject1 = this.this$0.getClient().getDownloadTaskState(this.this$0.mDownloadUrl);
      Object localObject2;
      if (localObject1 != null)
      {
        if (((TMAssistantDownloadTaskInfo)localObject1).mState != 3)
          break label143;
        Message localMessage = new android/os/Message;
        localMessage.<init>();
        localMessage.what = 6;
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        ((Bundle)localObject2).putLong("receiveDataLen", ((TMAssistantDownloadTaskInfo)localObject1).mReceiveDataLen);
        ((Bundle)localObject2).putLong("totalDataLen", ((TMAssistantDownloadTaskInfo)localObject1).mTotalDataLen);
        localMessage.setData((Bundle)localObject2);
        this.this$0.mMainMessageHandler.sendMessage(localMessage);
      }
      while ((localObject1 != null) && (((TMAssistantDownloadTaskInfo)localObject1).mState == 4))
      {
        localObject1 = TipsInfoReportManager.getInstance().createTipsInfoLog(this.this$0.mAuthorizedInfo);
        ((TipsInfoLog)localObject1).installTipsCount += 1;
        TipsInfoReportManager.getInstance().addLogData((JceStruct)localObject1);
        AppMethodBeat.o(75922);
        return;
        label143: if (((TMAssistantDownloadTaskInfo)localObject1).mState == 4)
        {
          localObject2 = new android/os/Message;
          ((Message)localObject2).<init>();
          ((Message)localObject2).what = 0;
          ((Message)localObject2).arg1 = 1;
          ((Message)localObject2).obj = ((TMAssistantDownloadTaskInfo)localObject1).mSavePath;
          this.this$0.mMainMessageHandler.sendMessage((Message)localObject2);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("OpensdkToMsdkManager", localException, "", new Object[0]);
        AppMethodBeat.o(75922);
        continue;
        TipsInfoLog localTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(this.this$0.mAuthorizedInfo);
        localTipsInfoLog.downloadTipsCount += 1;
        TipsInfoReportManager.getInstance().addLogData(localTipsInfoLog);
        AppMethodBeat.o(75922);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.3
 * JD-Core Version:    0.6.2
 */