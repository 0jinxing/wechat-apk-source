package com.tencent.mm.plugin.downloader.g;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.h;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a extends h
{
  private byte[] eMl;
  HashMap<String, Long> kMC;
  HashMap<String, Long> kMD;
  private HashMap<String, Long> kND;
  HashMap<String, Long> kNE;
  private ConcurrentHashMap<String, Integer> kNF;
  HashSet<Long> kNG;
  Map<String, String> kNH;
  ap kNI;
  private ITMAssistantDownloadSDKClientListener kNJ;
  private TMAssistantDownloadSDKClient mClient;
  Context mContext;

  public a(com.tencent.mm.plugin.downloader.model.b paramb)
  {
    super(paramb);
    AppMethodBeat.i(2500);
    this.mClient = null;
    this.kNH = null;
    this.kMC = new HashMap();
    this.kMD = new HashMap();
    this.eMl = new byte[0];
    this.kNI = new ap(Looper.getMainLooper(), new a.4(this), false);
    this.kNJ = new a.5(this);
    this.mContext = ah.getContext();
    this.kND = new HashMap();
    this.kNE = new HashMap();
    this.kNF = new ConcurrentHashMap();
    this.kNG = new HashSet();
    HashMap localHashMap = new HashMap();
    String str = System.getProperty("http.agent");
    ab.i("MicroMsg.FileDownloaderImplTMAssistant", str);
    paramb = str;
    if (bo.isNullOrNil(str))
      paramb = "Mozilla/5.0 (Linux; Android) AppleWebkit (KHTML, like Gecko)";
    str = paramb + " MicroMessenger";
    PackageInfo localPackageInfo = getPackageInfo(this.mContext, ah.getPackageName());
    paramb = str;
    if (localPackageInfo != null)
    {
      paramb = str + "/";
      paramb = paramb + localPackageInfo.versionName;
      paramb = paramb + localPackageInfo.versionCode;
    }
    str = at.getNetTypeString(ah.getContext());
    paramb = paramb + " NetType/" + str;
    ab.i("MicroMsg.FileDownloaderImplTMAssistant", "User-Agent: %s", new Object[] { paramb });
    localHashMap.put("User-Agent", paramb);
    this.kNH = localHashMap;
    AppMethodBeat.o(2500);
  }

  private static void biv()
  {
    AppMethodBeat.i(2509);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(TMAssistantFile.getSavePathRootDir() + "/.tmp/");
    if (!localb.exists())
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "Make download dir result: %b", new Object[] { Boolean.valueOf(localb.mkdirs()) });
    AppMethodBeat.o(2509);
  }

  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(2508);
    if (paramString == null)
    {
      ab.e("MicroMsg.FileDownloaderImplTMAssistant", "getPackageInfo fail, packageName is null");
      AppMethodBeat.o(2508);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
        AppMethodBeat.o(2508);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", paramContext, "", new Object[0]);
        AppMethodBeat.o(2508);
        paramContext = localObject;
      }
    }
  }

  public final long a(com.tencent.mm.plugin.downloader.f.a parama)
  {
    AppMethodBeat.i(2501);
    d.xDH.a(new a.1(this, parama), "MicroMsg.FileDownloaderImplTMAssistant");
    long l = parama.field_downloadId;
    AppMethodBeat.o(2501);
    return l;
  }

  public final long a(com.tencent.mm.plugin.downloader.model.e parame)
  {
    AppMethodBeat.i(2502);
    long l;
    if ((parame == null) || (bo.isNullOrNil(parame.gUx)))
    {
      ab.e("MicroMsg.FileDownloaderImplTMAssistant", "Invalid Request");
      l = -1L;
      AppMethodBeat.o(2502);
    }
    while (true)
    {
      return l;
      String str1 = parame.gUx;
      String str2 = parame.mAppId;
      com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.Iq(str1);
      Object localObject;
      if (locala != null)
      {
        localObject = hm(locala.field_downloadId);
        if (((FileDownloadTaskInfo)localObject).status == 1)
        {
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, running, return");
          l = ((FileDownloadTaskInfo)localObject).id;
          AppMethodBeat.o(2502);
        }
        else if (((FileDownloadTaskInfo)localObject).status == 6)
        {
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, md5 checking, return");
          l = ((FileDownloadTaskInfo)localObject).id;
          AppMethodBeat.o(2502);
        }
        else if (((FileDownloadTaskInfo)localObject).status == 3)
        {
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, has download finished, install");
          if (parame.kNc)
            com.tencent.mm.plugin.downloader.h.a.a(((FileDownloadTaskInfo)localObject).id, false, null);
          l = ((FileDownloadTaskInfo)localObject).id;
          AppMethodBeat.o(2502);
        }
      }
      else
      {
        localObject = locala;
        if (locala == null)
          localObject = com.tencent.mm.plugin.downloader.model.c.In(str2);
        biv();
        com.tencent.mm.plugin.downloader.model.c.Io(str1);
        com.tencent.mm.plugin.downloader.model.c.Ip(str2);
        locala = f.c(parame);
        if ((parame.kNg) && (localObject != null))
        {
          locala.field_downloadId = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId;
          label248: locala.field_status = 0;
          locala.field_downloaderType = 2;
          if (localObject == null)
            break label401;
          if (((com.tencent.mm.plugin.downloader.f.a)localObject).field_status != 2)
            break label370;
          locala.field_startState = com.tencent.mm.plugin.downloader.a.b.kKd;
        }
        label401: 
        while (true)
        {
          if (parame.kNd)
            locala.field_md5 = f.Iy(locala.field_downloadUrl);
          if ((!parame.hyG) || (at.isWifi(ah.getContext())))
            break label410;
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "downloadInWifi, not wifi");
          locala.field_status = 0;
          locala.field_downloadInWifi = true;
          com.tencent.mm.plugin.downloader.model.c.d(locala);
          l = locala.field_downloadId;
          AppMethodBeat.o(2502);
          break;
          locala.field_downloadId = System.currentTimeMillis();
          break label248;
          label370: if (((com.tencent.mm.plugin.downloader.f.a)localObject).field_status == 4)
          {
            locala.field_startState = com.tencent.mm.plugin.downloader.a.b.kKd;
          }
          else
          {
            locala.field_startState = com.tencent.mm.plugin.downloader.a.b.kKc;
            continue;
            locala.field_startState = 0;
          }
        }
        label410: if (at.isWifi(ah.getContext()))
          locala.field_downloadInWifi = true;
        com.tencent.mm.plugin.downloader.model.c.d(locala);
        l = a(locala);
        AppMethodBeat.o(2502);
      }
    }
  }

  final boolean biu()
  {
    AppMethodBeat.i(2505);
    if ((this.kNG == null) || (this.kNG.size() == 0))
    {
      TMAssistantDownloadSDKManager.getInstance(this.mContext).releaseDownloadSDKClient("WechatDownloadClient");
      if (this.mClient != null)
        this.mClient.unRegisterDownloadTaskListener(this.kNJ);
      this.mClient = null;
      TMAssistantDownloadSDKManager.closeAllService(this.mContext);
    }
    while (true)
    {
      try
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>(this.mContext, TMAssistantDownloadSDKService.class);
        this.mContext.stopService(localIntent);
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistantSDK Client released");
        bool = true;
        AppMethodBeat.o(2505);
        return bool;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.FileDownloaderImplTMAssistant", "Error occurred when stopping TMAssistant Service: " + localException.toString());
        continue;
      }
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "Still have tasks running");
      boolean bool = false;
      AppMethodBeat.o(2505);
    }
  }

  final void cancelNotification(String paramString)
  {
    AppMethodBeat.i(2507);
    synchronized (this.eMl)
    {
      Integer localInteger = (Integer)this.kNF.get(paramString);
      if (localInteger == null)
      {
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "No notification id found");
        AppMethodBeat.o(2507);
        return;
      }
      ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(localInteger.intValue());
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "cancelNotification, id = ".concat(String.valueOf(localInteger)));
      this.kNF.remove(paramString);
      AppMethodBeat.o(2507);
    }
  }

  final TMAssistantDownloadSDKClient getClient()
  {
    AppMethodBeat.i(2506);
    if (this.mClient == null)
    {
      this.mClient = TMAssistantDownloadSDKManager.getInstance(this.mContext).getDownloadSDKClient("WechatDownloadClient");
      this.mClient.registerDownloadTaskListener(this.kNJ);
    }
    this.kNI.ae(240000L, 240000L);
    TMAssistantDownloadSDKClient localTMAssistantDownloadSDKClient = this.mClient;
    AppMethodBeat.o(2506);
    return localTMAssistantDownloadSDKClient;
  }

  public final int hl(long paramLong)
  {
    AppMethodBeat.i(2503);
    d.xDH.a(new a.2(this, paramLong), "MicroMsg.FileDownloaderImplTMAssistant");
    AppMethodBeat.o(2503);
    return 1;
  }

  public final FileDownloadTaskInfo hm(long paramLong)
  {
    AppMethodBeat.i(2504);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = paramLong;
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if ((locala == null) || (bo.isNullOrNil(locala.field_downloadUrl)))
    {
      AppMethodBeat.o(2504);
      return localFileDownloadTaskInfo;
    }
    localFileDownloadTaskInfo.url = locala.field_downloadUrl;
    localFileDownloadTaskInfo.status = locala.field_status;
    localFileDownloadTaskInfo.path = locala.field_filePath;
    label97: TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo;
    if (!com.tencent.mm.vfs.e.ct(locala.field_filePath))
    {
      localFileDownloadTaskInfo.kNr = 0L;
      localFileDownloadTaskInfo.jrb = 0L;
      localFileDownloadTaskInfo.cvZ = locala.field_md5;
      if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId())
        break label301;
      localTMAssistantDownloadTaskInfo = (TMAssistantDownloadTaskInfo)new a.3(this, localFileDownloadTaskInfo.url).b(g.RS().doN());
    }
    label301: Object localObject;
    while (true)
    {
      if (localTMAssistantDownloadTaskInfo != null)
        break label351;
      if (localFileDownloadTaskInfo.status == 1)
        localFileDownloadTaskInfo.status = 0;
      if (((localFileDownloadTaskInfo.status == 6) || (localFileDownloadTaskInfo.status == 3)) && (!com.tencent.mm.vfs.e.ct(localFileDownloadTaskInfo.path)))
        localFileDownloadTaskInfo.status = 0;
      if (bo.isNullOrNil(locala.field_filePath))
      {
        locala.field_filePath = localFileDownloadTaskInfo.path;
        com.tencent.mm.plugin.downloader.model.c.e(locala);
      }
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadTask: appId: %s, status: %d, url: %s, path: %s", new Object[] { locala.field_appId, Integer.valueOf(localFileDownloadTaskInfo.status), localFileDownloadTaskInfo.url, localFileDownloadTaskInfo.path });
      AppMethodBeat.o(2504);
      break;
      localFileDownloadTaskInfo.kNr = locala.field_downloadedSize;
      localFileDownloadTaskInfo.jrb = locala.field_totalSize;
      break label97;
      try
      {
        localTMAssistantDownloadTaskInfo = getClient().getDownloadTaskState(localFileDownloadTaskInfo.url);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadTaskState faile: " + localException.toString());
        localObject = null;
      }
    }
    label351: switch (localObject.mState)
    {
    default:
      if (localFileDownloadTaskInfo.status == 1)
        localFileDownloadTaskInfo.status = 0;
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      localFileDownloadTaskInfo.path = localObject.mSavePath;
      localFileDownloadTaskInfo.kNr = localObject.mReceiveDataLen;
      localFileDownloadTaskInfo.jrb = localObject.mTotalDataLen;
      break;
      localFileDownloadTaskInfo.status = 1;
      continue;
      localFileDownloadTaskInfo.status = 2;
      continue;
      if (localFileDownloadTaskInfo.status == 6)
        localFileDownloadTaskInfo.status = 6;
      else
        localFileDownloadTaskInfo.status = 3;
    }
  }

  public final boolean hn(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(2510);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if ((locala == null) || (bo.isNullOrNil(locala.field_downloadUrl)))
    {
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(2510);
    }
    while (true)
    {
      return bool;
      if (locala.field_downloaderType != 2)
      {
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, downloader type not matched", new Object[] { Long.valueOf(paramLong) });
        com.tencent.mm.vfs.e.deleteFile(locala.field_filePath);
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask, delete file: %s", new Object[] { locala.field_filePath });
        com.tencent.mm.plugin.downloader.model.c.hw(paramLong);
        AppMethodBeat.o(2510);
      }
      else
      {
        d.xDH.a(new a.6(this, locala, paramLong), "MicroMsg.FileDownloaderImplTMAssistant");
        AppMethodBeat.o(2510);
        bool = true;
      }
    }
  }

  public final boolean ho(long paramLong)
  {
    AppMethodBeat.i(2511);
    boolean bool = n(paramLong, true);
    AppMethodBeat.o(2511);
    return bool;
  }

  public final boolean hp(long paramLong)
  {
    AppMethodBeat.i(2512);
    ab.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTaskWhenProcessRestart, id = ".concat(String.valueOf(paramLong)));
    boolean bool = n(paramLong, false);
    AppMethodBeat.o(2512);
    return bool;
  }

  public final boolean n(long paramLong, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(2513);
    ab.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: id = ".concat(String.valueOf(paramLong)));
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if ((locala == null) || (bo.isNullOrNil(locala.field_downloadUrl)))
    {
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(2513);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (locala.field_downloaderType != 2)
      {
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, downloader type not matched", new Object[] { Long.valueOf(paramLong) });
        com.tencent.mm.vfs.e.deleteFile(locala.field_filePath);
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, delete file: " + locala.field_filePath);
        com.tencent.mm.plugin.downloader.model.c.hw(paramLong);
        AppMethodBeat.o(2513);
        paramBoolean = bool;
      }
      else
      {
        FileDownloadTaskInfo localFileDownloadTaskInfo = hm(locala.field_downloadId);
        if (localFileDownloadTaskInfo.status == 1)
        {
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "download runing, return");
          AppMethodBeat.o(2513);
          paramBoolean = true;
        }
        else if (localFileDownloadTaskInfo.status == 6)
        {
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "md5 checking ,return");
          AppMethodBeat.o(2513);
          paramBoolean = true;
        }
        else if (localFileDownloadTaskInfo.status == 3)
        {
          ab.i("MicroMsg.FileDownloaderImplTMAssistant", "has download finished, install");
          if (locala.field_autoInstall)
            com.tencent.mm.plugin.downloader.h.a.a(localFileDownloadTaskInfo.id, false, null);
          AppMethodBeat.o(2513);
          paramBoolean = true;
        }
        else
        {
          if (locala.field_status == 2)
            locala.field_startState = com.tencent.mm.plugin.downloader.a.b.kKd;
          while (true)
          {
            locala.field_startSize = locala.field_downloadedSize;
            locala.field_errCode = 0;
            biv();
            if (((!locala.field_reserveInWifi) && (!locala.field_downloadInWifi)) || (at.isWifi(ah.getContext())))
              break label381;
            ab.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask downloadInWifi, not wifi");
            AppMethodBeat.o(2513);
            paramBoolean = true;
            break;
            if (locala.field_status == 4)
              locala.field_startState = com.tencent.mm.plugin.downloader.a.b.kKe;
            else
              locala.field_startState = com.tencent.mm.plugin.downloader.a.b.kKc;
          }
          label381: if (at.isWifi(ah.getContext()))
            locala.field_downloadInWifi = true;
          d.xDH.a(new a.7(this, locala, paramBoolean, paramLong), "MicroMsg.FileDownloaderImplTMAssistant");
          AppMethodBeat.o(2513);
          paramBoolean = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.g.a
 * JD-Core Version:    0.6.2
 */