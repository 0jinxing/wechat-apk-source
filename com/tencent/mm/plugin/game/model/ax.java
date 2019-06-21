package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam;

public class ax
{
  private static ax mYV;
  private static TMQQDownloaderOpenSDK mYW;

  public static int a(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam)
  {
    AppMethodBeat.i(111493);
    try
    {
      bEU();
      paramTMQQDownloaderOpenSDKParam = bEV().getDownloadTaskState(paramTMQQDownloaderOpenSDKParam);
      if (paramTMQQDownloaderOpenSDKParam != null)
      {
        i = paramTMQQDownloaderOpenSDKParam.mState;
        AppMethodBeat.o(111493);
        return i;
      }
    }
    catch (Exception paramTMQQDownloaderOpenSDKParam)
    {
      while (true)
      {
        ab.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus failed : %s", new Object[] { paramTMQQDownloaderOpenSDKParam.getMessage() });
        int i = -1;
        AppMethodBeat.o(111493);
      }
    }
  }

  public static void aw(Context paramContext, String paramString)
  {
    AppMethodBeat.i(111492);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, params is null or nil");
      AppMethodBeat.o(111492);
    }
    while (true)
    {
      return;
      if (paramContext == null)
      {
        ab.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, context is null");
        AppMethodBeat.o(111492);
      }
      else
      {
        ab.i("MicroMsg.QQDownloaderSDKWrapper", "add download task to qqdownloader:[%s]", new Object[] { paramString });
        paramString = new ax.a((byte)0).NY(paramString);
        try
        {
          bEU();
          bEV().startToDownloadTaskList(paramContext, paramString, true, true);
          AppMethodBeat.o(111492);
        }
        catch (Exception paramContext)
        {
          ab.printErrStackTrace("MicroMsg.QQDownloaderSDKWrapper", paramContext, "", new Object[0]);
          AppMethodBeat.o(111492);
        }
      }
    }
  }

  public static ax bEU()
  {
    AppMethodBeat.i(111489);
    if (mYV == null);
    try
    {
      if (mYV == null)
      {
        localax = new com/tencent/mm/plugin/game/model/ax;
        localax.<init>();
        mYV = localax;
      }
      ax localax = mYV;
      AppMethodBeat.o(111489);
      return localax;
    }
    finally
    {
      AppMethodBeat.o(111489);
    }
  }

  private static TMQQDownloaderOpenSDK bEV()
  {
    AppMethodBeat.i(111490);
    if (mYW == null)
    {
      localTMQQDownloaderOpenSDK = TMQQDownloaderOpenSDK.getInstance();
      mYW = localTMQQDownloaderOpenSDK;
      localTMQQDownloaderOpenSDK.initQQDownloaderOpenSDK(ah.getContext());
    }
    TMQQDownloaderOpenSDK localTMQQDownloaderOpenSDK = mYW;
    AppMethodBeat.o(111490);
    return localTMQQDownloaderOpenSDK;
  }

  public static void bEW()
  {
    boolean bool1 = false;
    AppMethodBeat.i(111491);
    if (mYW == null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      if (mYV == null)
        bool1 = true;
      ab.i("MicroMsg.QQDownloaderSDKWrapper", "destroyQQDownloader, sdk is null : [%b], instance is null : [%b]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (mYW != null)
        mYW.destroyQQDownloaderOpenSDK();
      mYW = null;
      mYV = null;
      AppMethodBeat.o(111491);
      return;
    }
  }

  public static int k(Context paramContext, String paramString, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(111494);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, packageName is null");
      AppMethodBeat.o(111494);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      try
      {
        paramContext = b.getPackageInfo(paramContext, paramString);
        if (paramContext == null)
          paramInt = 1;
        while (true)
        {
          ab.d("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState, ret = %d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(111494);
          break;
          ab.d("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState, installed versionCode = %d", new Object[] { Integer.valueOf(paramContext.versionCode) });
          int j = paramContext.versionCode;
          if (j >= paramInt)
            paramInt = 0;
          else
            paramInt = 2;
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, ex = %s", new Object[] { paramContext.getMessage() });
          paramInt = i;
        }
      }
    }
  }

  public static void startToAuthorized(Context paramContext, String paramString)
  {
    AppMethodBeat.i(111495);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
      AppMethodBeat.o(111495);
    }
    while (true)
    {
      return;
      paramString = new ax.a((byte)0).NY(paramString);
      try
      {
        bEU();
        bEV().startToAuthorized(paramContext, paramString, "1");
        AppMethodBeat.o(111495);
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.QQDownloaderSDKWrapper", "startToAuthorized fail, ex = %s", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(111495);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ax
 * JD-Core Version:    0.6.2
 */