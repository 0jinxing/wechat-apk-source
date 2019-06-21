package com.tencent.tmassistantsdk.downloadclient;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class TMAssistantDownloadSDKManager
{
  protected static TMAssistantDownloadSDKManager mInstance;
  protected static ArrayList<TMAssistantDownloadOpenSDKClient> mOpenSDKClientList;
  protected static ArrayList<TMAssistantDownloadSDKClient> mSDKClientList;
  protected static TMAssistantDownloadSDKSettingClient mSDKSettingClient;
  protected Context mContext = null;

  static
  {
    AppMethodBeat.i(75656);
    mInstance = null;
    mSDKClientList = new ArrayList();
    mSDKSettingClient = null;
    mOpenSDKClientList = new ArrayList();
    AppMethodBeat.o(75656);
  }

  protected TMAssistantDownloadSDKManager(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public static String about()
  {
    return "TMAssistantDownloadSDKManager_2014_03_04_17_55_release_25406";
  }

  public static void closeAllService(Context paramContext)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(75655);
        TMLog.i("TMAssistantDownloadSDKManager", "closeAllService method!");
        if (mInstance == null)
        {
          TMLog.i("TMAssistantDownloadSDKManager", "manager minstance == null");
          AppMethodBeat.o(75655);
          return;
        }
        if ((mSDKClientList == null) || (mSDKClientList.size() <= 0))
          break label101;
        paramContext = mSDKClientList.iterator();
        if (paramContext.hasNext())
        {
          TMAssistantDownloadSDKClient localTMAssistantDownloadSDKClient = (TMAssistantDownloadSDKClient)paramContext.next();
          if (localTMAssistantDownloadSDKClient == null)
            continue;
          localTMAssistantDownloadSDKClient.unInitTMAssistantDownloadSDK();
          continue;
        }
      }
      finally
      {
      }
      mSDKClientList.clear();
      label101: if (mSDKSettingClient != null)
      {
        mSDKSettingClient.unInitTMAssistantDownloadSDK();
        mSDKSettingClient = null;
      }
      mInstance = null;
      AppMethodBeat.o(75655);
    }
  }

  public static TMAssistantDownloadSDKManager getInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(75650);
      if (mInstance == null)
      {
        TMAssistantDownloadSDKManager localTMAssistantDownloadSDKManager = new com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKManager;
        localTMAssistantDownloadSDKManager.<init>(paramContext);
        mInstance = localTMAssistantDownloadSDKManager;
      }
      paramContext = mInstance;
      AppMethodBeat.o(75650);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public TMAssistantDownloadOpenSDKClient getDownloadOpenSDKClient(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(75653);
        Iterator localIterator = mOpenSDKClientList.iterator();
        if (localIterator.hasNext())
        {
          localTMAssistantDownloadOpenSDKClient = (TMAssistantDownloadOpenSDKClient)localIterator.next();
          if (localTMAssistantDownloadOpenSDKClient.mClientKey.equals(paramString) != true)
            continue;
          AppMethodBeat.o(75653);
          paramString = localTMAssistantDownloadOpenSDKClient;
          return paramString;
        }
        TMAssistantDownloadOpenSDKClient localTMAssistantDownloadOpenSDKClient = new com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient;
        localTMAssistantDownloadOpenSDKClient.<init>(this.mContext, paramString, "com.tencent.android.qqdownloader.SDKService");
        if (localTMAssistantDownloadOpenSDKClient.initTMAssistantDownloadSDK())
        {
          mOpenSDKClientList.add(localTMAssistantDownloadOpenSDKClient);
          AppMethodBeat.o(75653);
          paramString = localTMAssistantDownloadOpenSDKClient;
          continue;
        }
      }
      finally
      {
      }
      paramString = null;
      AppMethodBeat.o(75653);
    }
  }

  public TMAssistantDownloadSDKClient getDownloadSDKClient(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(75651);
        if ((paramString == null) || (paramString.length() <= 0))
        {
          paramString = null;
          AppMethodBeat.o(75651);
          return paramString;
        }
        Iterator localIterator = mSDKClientList.iterator();
        if (localIterator.hasNext())
        {
          localTMAssistantDownloadSDKClient = (TMAssistantDownloadSDKClient)localIterator.next();
          if (localTMAssistantDownloadSDKClient.mClientKey.equals(paramString) != true)
            continue;
          AppMethodBeat.o(75651);
          paramString = localTMAssistantDownloadSDKClient;
          continue;
        }
      }
      finally
      {
      }
      TMAssistantDownloadSDKClient localTMAssistantDownloadSDKClient = new com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient;
      localTMAssistantDownloadSDKClient.<init>(this.mContext, paramString);
      localTMAssistantDownloadSDKClient.initTMAssistantDownloadSDK();
      mSDKClientList.add(localTMAssistantDownloadSDKClient);
      AppMethodBeat.o(75651);
      paramString = localTMAssistantDownloadSDKClient;
    }
  }

  public TMAssistantDownloadSDKSettingClient getDownloadSDKSettingClient()
  {
    try
    {
      AppMethodBeat.i(75652);
      if (mSDKSettingClient == null)
      {
        localTMAssistantDownloadSDKSettingClient = new com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKSettingClient;
        localTMAssistantDownloadSDKSettingClient.<init>(this.mContext, "TMAssistantDownloadSDKManager");
        mSDKSettingClient = localTMAssistantDownloadSDKSettingClient;
        localTMAssistantDownloadSDKSettingClient.initTMAssistantDownloadSDK();
      }
      TMAssistantDownloadSDKSettingClient localTMAssistantDownloadSDKSettingClient = mSDKSettingClient;
      AppMethodBeat.o(75652);
      return localTMAssistantDownloadSDKSettingClient;
    }
    finally
    {
    }
  }

  public boolean releaseDownloadSDKClient(String paramString)
  {
    try
    {
      AppMethodBeat.i(75654);
      Iterator localIterator = mSDKClientList.iterator();
      boolean bool;
      while (localIterator.hasNext())
      {
        TMAssistantDownloadSDKClient localTMAssistantDownloadSDKClient = (TMAssistantDownloadSDKClient)localIterator.next();
        if ((localTMAssistantDownloadSDKClient != null) && (localTMAssistantDownloadSDKClient.mClientKey.equals(paramString) == true))
        {
          localTMAssistantDownloadSDKClient.unInitTMAssistantDownloadSDK();
          localIterator.remove();
          AppMethodBeat.o(75654);
          bool = true;
        }
      }
      while (true)
      {
        return bool;
        if ((mSDKSettingClient != null) && (mSDKSettingClient.mClientKey.equals(paramString) == true))
        {
          mSDKSettingClient.unInitTMAssistantDownloadSDK();
          mSDKSettingClient = null;
          AppMethodBeat.o(75654);
          bool = true;
        }
        else
        {
          bool = false;
          AppMethodBeat.o(75654);
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager
 * JD-Core Version:    0.6.2
 */