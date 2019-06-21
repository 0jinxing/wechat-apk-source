package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.os.Message;
import android.text.TextUtils;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.logreport.TipsInfoReportManager;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK;
import com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog;
import com.tencent.tmassistantsdk.util.TMLog;

class TMOpenSDKToMsdkManager$7
  implements Runnable
{
  TMOpenSDKToMsdkManager$7(TMOpenSDKToMsdkManager paramTMOpenSDKToMsdkManager, String paramString1, String paramString2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(75926);
    if ((this.this$0.mContext != null) && (this.this$0.mOpenSDK != null) && (!TextUtils.isEmpty(this.val$jumpUrl)))
      this.this$0.insertActionId = this.this$0.mOpenSDK.addDownloadTaskFromAuthorize(this.val$jumpUrl);
    Object localObject1 = this.this$0.getClient();
    if (localObject1 == null)
      AppMethodBeat.o(75926);
    while (true)
    {
      return;
      while (true)
      {
        int i;
        try
        {
          i = ((TMAssistantDownloadSDKClient)localObject1).startDownloadTask(this.val$downloadUrl, "application/vnd.android.package-archive");
          if (4 != i)
            break label197;
          localObject1 = ((TMAssistantDownloadSDKClient)localObject1).getDownloadTaskState(this.val$downloadUrl).mSavePath;
          Message localMessage = new android/os/Message;
          localMessage.<init>();
          localMessage.what = 0;
          localMessage.obj = localObject1;
          this.this$0.mMainMessageHandler.sendMessage(localMessage);
          if (i != 4)
            break label280;
          localObject1 = TipsInfoReportManager.getInstance().createTipsInfoLog(this.this$0.mAuthorizedInfo);
          ((TipsInfoLog)localObject1).installBtnClickCount += 1;
          TipsInfoReportManager.getInstance().addLogData((JceStruct)localObject1);
          AppMethodBeat.o(75926);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("OpensdkToMsdkManager", localException, "", new Object[0]);
          AppMethodBeat.o(75926);
        }
        break;
        label197: if (i == 0)
        {
          TMLog.i("OpensdkToMsdkManager", "start success!");
        }
        else if (1 == i)
        {
          localObject2 = new android/os/Message;
          ((Message)localObject2).<init>();
          ((Message)localObject2).what = 5;
          ((Message)localObject2).obj = Integer.valueOf(1);
          this.this$0.mMainMessageHandler.sendMessage((Message)localObject2);
        }
        else
        {
          localObject2 = new android/os/Message;
          ((Message)localObject2).<init>();
          ((Message)localObject2).what = 3;
          this.this$0.mMainMessageHandler.sendMessage((Message)localObject2);
        }
      }
      label280: Object localObject2 = TipsInfoReportManager.getInstance().createTipsInfoLog(this.this$0.mAuthorizedInfo);
      ((TipsInfoLog)localObject2).downloadBtnClickCount += 1;
      TipsInfoReportManager.getInstance().addLogData((JceStruct)localObject2);
      AppMethodBeat.o(75926);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.7
 * JD-Core Version:    0.6.2
 */