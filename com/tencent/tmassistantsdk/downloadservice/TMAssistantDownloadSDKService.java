package com.tencent.tmassistantsdk.downloadservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback;
import com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener;
import com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager;
import com.tencent.tmassistantsdk.logreport.GetSettingEngine;
import com.tencent.tmassistantsdk.logreport.LogReportManager;
import com.tencent.tmassistantsdk.storage.DBManager;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.HashMap;

public class TMAssistantDownloadSDKService extends Service
  implements IServiceDownloadTaskManagerListener
{
  protected static final String TAG = "TMAssistantDownloadSDKService";
  protected final TMAssistantDownloadSDKService.TMAssistantDownloadSDKServiceImpl downloadSDKServiceImpl;
  protected final HashMap<ITMAssistantDownloadSDKServiceCallback, String> mCallbackHashMap;
  protected final RemoteCallbackList<ITMAssistantDownloadSDKServiceCallback> mCallbacks;
  ServiceDownloadTaskManager mServiceDownloadTaskManager;

  public TMAssistantDownloadSDKService()
  {
    AppMethodBeat.i(75789);
    this.downloadSDKServiceImpl = new TMAssistantDownloadSDKService.TMAssistantDownloadSDKServiceImpl(this);
    this.mCallbacks = new RemoteCallbackList();
    this.mCallbackHashMap = new HashMap();
    this.mServiceDownloadTaskManager = null;
    AppMethodBeat.o(75789);
  }

  public void OnDownloadProgressChanged(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(75795);
    try
    {
      int i = this.mCallbacks.beginBroadcast();
      int j = 0;
      while (true)
      {
        if (j < i);
        try
        {
          ITMAssistantDownloadSDKServiceCallback localITMAssistantDownloadSDKServiceCallback = (ITMAssistantDownloadSDKServiceCallback)this.mCallbacks.getBroadcastItem(j);
          Object localObject = (String)this.mCallbackHashMap.get(localITMAssistantDownloadSDKServiceCallback);
          if ((localObject != null) && (((String)localObject).equals(paramString1) == true))
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("OnDownloadProgressChanged,clientKey:");
            TMLog.i("TMAssistantDownloadSDKService", paramString1 + ",receivedLen:" + paramLong1 + ",url:" + paramString2);
            localITMAssistantDownloadSDKServiceCallback.OnDownloadSDKServiceTaskProgressChanged(paramString1, paramString2, paramLong1, paramLong2);
            this.mCallbacks.finishBroadcast();
            AppMethodBeat.o(75795);
            return;
          }
        }
        catch (RemoteException localRemoteException)
        {
          j++;
        }
      }
    }
    catch (Throwable paramString1)
    {
      while (true)
        AppMethodBeat.o(75795);
    }
  }

  public void OnDownloadStateChanged(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(75794);
    try
    {
      int i = this.mCallbacks.beginBroadcast();
      int j = 0;
      while (true)
      {
        if (j < i);
        try
        {
          ITMAssistantDownloadSDKServiceCallback localITMAssistantDownloadSDKServiceCallback = (ITMAssistantDownloadSDKServiceCallback)this.mCallbacks.getBroadcastItem(j);
          Object localObject = (String)this.mCallbackHashMap.get(localITMAssistantDownloadSDKServiceCallback);
          if ((localObject != null) && (((String)localObject).equals(paramString1) == true))
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("OnDownloadStateChanged,clientKey:");
            TMLog.i("TMAssistantDownloadSDKService", paramString1 + ",state:" + paramInt1 + ",url:" + paramString2);
            localITMAssistantDownloadSDKServiceCallback.OnDownloadSDKServiceTaskStateChanged(paramString1, paramString2, paramInt1, paramInt2, paramString3, paramBoolean1, paramBoolean2);
            this.mCallbacks.finishBroadcast();
            AppMethodBeat.o(75794);
            return;
          }
        }
        catch (RemoteException localRemoteException)
        {
          j++;
        }
      }
    }
    catch (Throwable paramString1)
    {
      while (true)
        AppMethodBeat.o(75794);
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(75791);
    TMLog.i("TMAssistantDownloadSDKService", "onBind ,intent:".concat(String.valueOf(paramIntent)));
    paramIntent = this.downloadSDKServiceImpl;
    AppMethodBeat.o(75791);
    return paramIntent;
  }

  public void onCreate()
  {
    AppMethodBeat.i(75790);
    super.onCreate();
    GlobalUtil.getInstance().setContext(this);
    NetworkMonitorReceiver.getInstance().registerReceiver();
    this.mServiceDownloadTaskManager = new ServiceDownloadTaskManager(DBManager.getInstance().queryWaitingAndDownloadingTaskList());
    this.mServiceDownloadTaskManager.setListener(this);
    this.mServiceDownloadTaskManager.registerApkDownloadManagerListener();
    ApkDownloadManager.getInstance().init();
    TMLog.i("TMAssistantDownloadSDKService", "onCreate");
    AppMethodBeat.o(75790);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(75793);
    TMLog.i("TMAssistantDownloadSDKService", "onDestroy");
    super.onDestroy();
    ApkDownloadManager.getInstance().uninit();
    GetSettingEngine.getInstance().cancleRequest();
    LogReportManager.getInstance().cancleReport();
    LogReportManager.getInstance().destory();
    this.mServiceDownloadTaskManager.unRegisterApkDownloadManagerListener();
    this.mServiceDownloadTaskManager.setListener(null);
    this.mServiceDownloadTaskManager = null;
    NetworkMonitorReceiver.getInstance().unregisterReceiver();
    GlobalUtil.getInstance().destroy();
    SystemClock.sleep(300L);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(75793);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(75792);
    TMLog.i("TMAssistantDownloadSDKService", "onUnbind ,intent:".concat(String.valueOf(paramIntent)));
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(75792);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService
 * JD-Core Version:    0.6.2
 */