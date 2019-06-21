package com.tencent.tmassistantsdk.downloadclient;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.Stub;

public class TMAssistantDownloadSDKSettingClient extends TMAssistantDownloadSDKClientBase
{
  protected static final String DOWNDLOADSDKSERVICENAME = "com.tencent.TMAssistantDownloadSDKService";

  public TMAssistantDownloadSDKSettingClient(Context paramContext, String paramString)
  {
    super(paramContext, paramString, "com.tencent.TMAssistantDownloadSDKService");
  }

  protected Intent getBindServiceIntent()
  {
    AppMethodBeat.i(75669);
    Intent localIntent = new Intent(this.mContext, Class.forName(this.mDwonloadServiceName));
    AppMethodBeat.o(75669);
    return localIntent;
  }

  public int getVersion()
  {
    try
    {
      AppMethodBeat.i(75663);
      ITMAssistantDownloadSDKServiceInterface localITMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface)super.getServiceInterface();
      int i;
      if (localITMAssistantDownloadSDKServiceInterface != null)
      {
        i = localITMAssistantDownloadSDKServiceInterface.getServiceVersion();
        AppMethodBeat.o(75663);
      }
      while (true)
      {
        return i;
        super.initTMAssistantDownloadSDK();
        i = 0;
        AppMethodBeat.o(75663);
      }
    }
    finally
    {
    }
  }

  public boolean isAllDownloadFinished()
  {
    try
    {
      AppMethodBeat.i(75666);
      ITMAssistantDownloadSDKServiceInterface localITMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface)super.getServiceInterface();
      if (localITMAssistantDownloadSDKServiceInterface != null);
      for (boolean bool = localITMAssistantDownloadSDKServiceInterface.isAllDownloadFinished(); ; bool = false)
      {
        AppMethodBeat.o(75666);
        return bool;
        super.initTMAssistantDownloadSDK();
      }
    }
    finally
    {
    }
  }

  protected void onDownloadSDKServiceInvalid()
  {
  }

  protected void registerServiceCallback()
  {
    AppMethodBeat.i(75668);
    ((ITMAssistantDownloadSDKServiceInterface)this.mServiceInterface).registerDownloadTaskCallback(this.mClientKey, (ITMAssistantDownloadSDKServiceCallback)this.mServiceCallback);
    AppMethodBeat.o(75668);
  }

  public void setDownloadSDKMaxTaskNum(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(75665);
        if ((paramInt <= 0) || (paramInt > 10))
        {
          AppMethodBeat.o(75665);
          return;
        }
        ITMAssistantDownloadSDKServiceInterface localITMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface)super.getServiceInterface();
        if (localITMAssistantDownloadSDKServiceInterface != null)
        {
          localITMAssistantDownloadSDKServiceInterface.setServiceSetingMaxTaskNum(paramInt);
          AppMethodBeat.o(75665);
          continue;
        }
      }
      finally
      {
      }
      super.initTMAssistantDownloadSDK();
      AppMethodBeat.o(75665);
    }
  }

  public void setDownloadSDKWifiOnly(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(75664);
      ITMAssistantDownloadSDKServiceInterface localITMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface)super.getServiceInterface();
      if (localITMAssistantDownloadSDKServiceInterface != null)
      {
        localITMAssistantDownloadSDKServiceInterface.setServiceSetingIsDownloadWifiOnly(paramBoolean);
        AppMethodBeat.o(75664);
      }
      while (true)
      {
        return;
        super.initTMAssistantDownloadSDK();
        AppMethodBeat.o(75664);
      }
    }
    finally
    {
    }
  }

  protected void stubAsInterface(IBinder paramIBinder)
  {
    AppMethodBeat.i(75667);
    this.mServiceInterface = ITMAssistantDownloadSDKServiceInterface.Stub.asInterface(paramIBinder);
    AppMethodBeat.o(75667);
  }

  protected void unRegisterServiceCallback()
  {
    AppMethodBeat.i(75670);
    ((ITMAssistantDownloadSDKServiceInterface)this.mServiceInterface).unregisterDownloadTaskCallback(this.mClientKey, (ITMAssistantDownloadSDKServiceCallback)this.mServiceCallback);
    AppMethodBeat.o(75670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient
 * JD-Core Version:    0.6.2
 */