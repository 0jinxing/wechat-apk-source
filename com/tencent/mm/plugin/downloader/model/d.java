package com.tencent.mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ha;
import com.tencent.mm.g.a.hr;
import com.tencent.mm.g.a.hr.a;
import com.tencent.mm.model.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static int hzH;
  private static Map<Long, Long> kMM;
  private static d kMU;
  private l kMN;
  private l kMO;
  private l kMP;
  private com.tencent.mm.plugin.downloader.g.a kMQ;
  private a kMR;
  private l kMS;
  public b kMT;
  public boolean kMV;

  static
  {
    AppMethodBeat.i(2438);
    kMM = new HashMap();
    hzH = 2;
    AppMethodBeat.o(2438);
  }

  private d()
  {
    AppMethodBeat.i(2410);
    this.kMV = false;
    biq();
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      com.tencent.mm.kernel.g.RN();
      if (!com.tencent.mm.kernel.a.QT())
      {
        hzH = bo.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("FileDownloaderType"), 2);
        ab.i("MicroMsg.FileDownloadManager", "get downloader type from dynamic config = %d", new Object[] { Integer.valueOf(hzH) });
      }
    }
    while (true)
    {
      this.kMT = new b();
      AppMethodBeat.o(2410);
      return;
      ab.i("MicroMsg.FileDownloadManager", "not login, use the default tmassist downloader");
    }
  }

  static void G(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(2429);
    kMM.put(Long.valueOf(paramLong1), Long.valueOf(paramLong2));
    ah.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(paramLong1), paramLong2).commit();
    AppMethodBeat.o(2429);
  }

  public static LinkedList<FileDownloadTaskInfo> M(LinkedList<String> paramLinkedList)
  {
    LinkedList localLinkedList = null;
    AppMethodBeat.i(2423);
    Object localObject = c.XS();
    label42: com.tencent.mm.plugin.downloader.f.a locala;
    if (localObject == null)
    {
      paramLinkedList = localLinkedList;
      localLinkedList = new LinkedList();
      if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
        break label290;
      paramLinkedList = paramLinkedList.iterator();
      if (!paramLinkedList.hasNext())
        break label290;
      locala = (com.tencent.mm.plugin.downloader.f.a)paramLinkedList.next();
      localObject = new FileDownloadTaskInfo();
      if ((locala.field_status != 3) || (com.tencent.mm.vfs.e.ct(locala.field_filePath)))
        break label279;
    }
    label279: for (((FileDownloadTaskInfo)localObject).status = 0; ; ((FileDownloadTaskInfo)localObject).status = locala.field_status)
    {
      ((FileDownloadTaskInfo)localObject).appId = locala.field_appId;
      ((FileDownloadTaskInfo)localObject).id = locala.field_downloadId;
      ((FileDownloadTaskInfo)localObject).url = locala.field_downloadUrl;
      ((FileDownloadTaskInfo)localObject).path = locala.field_filePath;
      ((FileDownloadTaskInfo)localObject).cvZ = locala.field_md5;
      ((FileDownloadTaskInfo)localObject).kNr = locala.field_downloadedSize;
      ((FileDownloadTaskInfo)localObject).jrb = locala.field_totalSize;
      ((FileDownloadTaskInfo)localObject).kNs = locala.field_autoDownload;
      ((FileDownloadTaskInfo)localObject).cBA = locala.field_downloaderType;
      ((FileDownloadTaskInfo)localObject).kNt = locala.field_downloadInWifi;
      ((FileDownloadTaskInfo)localObject).kNu = locala.field_reserveInWifi;
      localLinkedList.add(localObject);
      break label42;
      localObject = ((com.tencent.mm.plugin.downloader.f.b)localObject).rawQuery("select * from FileDownloadInfo where ".concat(String.valueOf(com.tencent.mm.plugin.downloader.f.b.N(paramLinkedList))), new String[0]);
      paramLinkedList = localLinkedList;
      if (localObject == null)
        break;
      localLinkedList = new LinkedList();
      if (((Cursor)localObject).moveToFirst())
        do
        {
          paramLinkedList = new com.tencent.mm.plugin.downloader.f.a();
          paramLinkedList.d((Cursor)localObject);
          localLinkedList.add(paramLinkedList);
        }
        while (((Cursor)localObject).moveToNext());
      paramLinkedList = localLinkedList;
      if (localObject == null)
        break;
      ((Cursor)localObject).close();
      paramLinkedList = localLinkedList;
      break;
    }
    label290: AppMethodBeat.o(2423);
    return localLinkedList;
  }

  private void a(String paramString, e parame)
  {
    AppMethodBeat.i(2432);
    com.tencent.mm.plugin.downloader.f.a locala;
    if (!this.kMV)
    {
      locala = c.In(paramString);
      if ((locala != null) && (locala.field_autoDownload))
      {
        ha localha = new ha();
        localha.cBL.csB = paramString;
        com.tencent.mm.sdk.b.a.xxA.m(localha);
        if (parame == null)
          break label117;
        locala.field_autoInstall = parame.kNc;
        locala.field_showNotification = parame.hzG;
      }
    }
    for (locala.field_autoDownload = parame.kNe; ; locala.field_autoDownload = false)
    {
      c.e(locala);
      ab.i("MicroMsg.FileDownloadManager", "remove silentDownload, appId:%s", new Object[] { paramString });
      this.kMV = false;
      AppMethodBeat.o(2432);
      return;
      label117: locala.field_autoInstall = true;
      locala.field_showNotification = true;
    }
  }

  static void a(String paramString1, String paramString2, String paramString3, PendingIntent paramPendingIntent)
  {
    AppMethodBeat.i(2427);
    v.c localc = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id");
    paramString1 = com.tencent.mm.pluginsdk.model.app.g.bT(paramString1, false);
    if ((paramString1 != null) && (!bo.isNullOrNil(paramString1.field_appName)))
    {
      localc.d(paramString1.field_appName);
      localc.e(paramString3);
      localc.as(17301634);
      localc.z(true);
      if (paramPendingIntent == null)
        break label130;
    }
    for (localc.EI = paramPendingIntent; ; localc.EI = PendingIntent.getActivity(ah.getContext(), 0, paramString1, 0))
    {
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().c(localc.build());
      ab.i("MicroMsg.FileDownloadManager", "show notification");
      AppMethodBeat.o(2427);
      return;
      localc.d(paramString2);
      break;
      label130: paramString1 = new Intent();
    }
  }

  public static d bij()
  {
    AppMethodBeat.i(2409);
    if (kMU == null)
      kMU = new d();
    d locald = kMU;
    AppMethodBeat.o(2409);
    return locald;
  }

  private l bil()
  {
    AppMethodBeat.i(2412);
    if (this.kMP == null)
      this.kMP = new g(this.kMT);
    l locall = this.kMP;
    AppMethodBeat.o(2412);
    return locall;
  }

  private l bim()
  {
    AppMethodBeat.i(2413);
    if (this.kMO == null)
      this.kMO = new i(this.kMT);
    l locall = this.kMO;
    AppMethodBeat.o(2413);
    return locall;
  }

  private l bip()
  {
    AppMethodBeat.i(2416);
    if (this.kMS == null)
      this.kMS = new j(this.kMT);
    l locall = this.kMS;
    AppMethodBeat.o(2416);
    return locall;
  }

  private static void biq()
  {
    AppMethodBeat.i(2426);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("off_line_download_ids", 0);
    if (localSharedPreferences == null)
      AppMethodBeat.o(2426);
    while (true)
    {
      return;
      Object localObject = localSharedPreferences.getAll();
      if ((localObject == null) || (((Map)localObject).size() == 0))
      {
        AppMethodBeat.o(2426);
      }
      else
      {
        kMM.clear();
        localObject = ((Map)localObject).entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          if ((localEntry != null) && (!bo.isNullOrNil((String)localEntry.getKey())))
            try
            {
              long l1 = bo.getLong((String)localEntry.getKey(), 0L);
              long l2 = ((Long)localEntry.getValue()).longValue();
              long l3 = System.currentTimeMillis() - l1;
              if ((l3 - l1 > 0L) && (l3 - l1 < 86400000L))
                kMM.put(Long.valueOf(l1), Long.valueOf(l2));
            }
            catch (Exception localException)
            {
              ab.e("MicroMsg.FileDownloadManager", "parse download task failed: " + localException.toString());
              ab.printErrStackTrace("MicroMsg.FileDownloadManager", localException, "", new Object[0]);
            }
        }
        localSharedPreferences.edit().clear();
        Iterator localIterator = kMM.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          localSharedPreferences.edit().putLong(((Map.Entry)localObject).getKey(), ((Long)((Map.Entry)localObject).getValue()).longValue());
        }
        localSharedPreferences.edit().commit();
        AppMethodBeat.o(2426);
      }
    }
  }

  static boolean hx(long paramLong)
  {
    AppMethodBeat.i(2428);
    boolean bool = kMM.containsKey(Long.valueOf(paramLong));
    AppMethodBeat.o(2428);
    return bool;
  }

  static long hy(long paramLong)
  {
    AppMethodBeat.i(2430);
    Long localLong = (Long)kMM.get(Long.valueOf(paramLong));
    if (localLong == null)
    {
      paramLong = -1L;
      AppMethodBeat.o(2430);
    }
    while (true)
    {
      return paramLong;
      paramLong = localLong.longValue();
      AppMethodBeat.o(2430);
    }
  }

  private void hz(long paramLong)
  {
    AppMethodBeat.i(2433);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if (locala == null)
    {
      this.kMV = false;
      AppMethodBeat.o(2433);
    }
    while (true)
    {
      return;
      a(locala.field_appId, null);
      AppMethodBeat.o(2433);
    }
  }

  public final FileDownloadTaskInfo Ir(String paramString)
  {
    AppMethodBeat.i(2421);
    paramString = c.In(paramString);
    if (paramString != null)
    {
      paramString = hm(paramString.field_downloadId);
      AppMethodBeat.o(2421);
    }
    while (true)
    {
      return paramString;
      paramString = new FileDownloadTaskInfo();
      AppMethodBeat.o(2421);
    }
  }

  public final FileDownloadTaskInfo Is(String paramString)
  {
    AppMethodBeat.i(2422);
    paramString = c.Iq(paramString);
    if (paramString != null)
    {
      paramString = hm(paramString.field_downloadId);
      AppMethodBeat.o(2422);
    }
    while (true)
    {
      return paramString;
      paramString = new FileDownloadTaskInfo();
      AppMethodBeat.o(2422);
    }
  }

  public final long a(e parame)
  {
    AppMethodBeat.i(2417);
    ab.i("MicroMsg.FileDownloadManager", "addDownloadTask, filetype:%d, appId = %s", new Object[] { Integer.valueOf(parame.kNb), parame.mAppId });
    long l;
    if (parame.kNb == 2)
    {
      l = bip().a(parame);
      AppMethodBeat.o(2417);
    }
    while (true)
    {
      return l;
      a(parame.mAppId, parame);
      if (com.tencent.mm.kernel.g.RN().QY())
      {
        com.tencent.mm.kernel.g.RN();
        if (!com.tencent.mm.kernel.a.QT())
        {
          l = bik().a(parame);
          AppMethodBeat.o(2417);
        }
      }
      else
      {
        l = bil().a(parame);
        if (l >= 0L)
        {
          kMM.put(Long.valueOf(l), Long.valueOf(0L));
          ah.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), 0L).commit();
          ab.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", new Object[] { Long.valueOf(l) });
          AppMethodBeat.o(2417);
        }
        else
        {
          ab.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
          bim().a(parame);
          AppMethodBeat.o(2417);
        }
      }
    }
  }

  public final long b(e parame)
  {
    AppMethodBeat.i(2418);
    ab.i("MicroMsg.FileDownloadManager", "addDownloadTaskByCDNDownloader, appId = %s", new Object[] { parame.mAppId });
    a(parame.mAppId, parame);
    long l;
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      com.tencent.mm.kernel.g.RN();
      if (!com.tencent.mm.kernel.a.QT())
      {
        l = bio().a(parame);
        AppMethodBeat.o(2418);
      }
    }
    while (true)
    {
      return l;
      l = bil().a(parame);
      if (l >= 0L)
      {
        kMM.put(Long.valueOf(l), Long.valueOf(0L));
        ah.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), 0L).commit();
        ab.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", new Object[] { Long.valueOf(l) });
        AppMethodBeat.o(2418);
      }
      else
      {
        ab.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
        bim().a(parame);
        AppMethodBeat.o(2418);
      }
    }
  }

  public final l bik()
  {
    AppMethodBeat.i(2411);
    ab.i("MicroMsg.FileDownloadManager", "mDownloaderType = " + hzH);
    if (this.kMN != null)
    {
      localObject = this.kMN;
      AppMethodBeat.o(2411);
      return localObject;
    }
    Object localObject = new hr();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    int i = ((hr)localObject).cCC.cBA;
    if (i > 0)
      hzH = i;
    if (hzH == 1);
    for (this.kMN = bil(); ; this.kMN = bin())
    {
      localObject = this.kMN;
      AppMethodBeat.o(2411);
      break;
    }
  }

  public final com.tencent.mm.plugin.downloader.g.a bin()
  {
    AppMethodBeat.i(2414);
    if (this.kMQ == null)
      this.kMQ = new com.tencent.mm.plugin.downloader.g.a(this.kMT);
    com.tencent.mm.plugin.downloader.g.a locala = this.kMQ;
    AppMethodBeat.o(2414);
    return locala;
  }

  public final a bio()
  {
    AppMethodBeat.i(2415);
    if (this.kMR == null)
      this.kMR = new a(this.kMT);
    a locala = this.kMR;
    AppMethodBeat.o(2415);
    return locala;
  }

  public final int hl(long paramLong)
  {
    AppMethodBeat.i(2419);
    ab.i("MicroMsg.FileDownloadManager", "removeDownloadTask, id = ".concat(String.valueOf(paramLong)));
    int i;
    if (hx(paramLong))
    {
      i = bil().hl(paramLong);
      AppMethodBeat.o(2419);
    }
    while (true)
    {
      return i;
      com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
      if ((locala != null) && ((locala.field_downloadInWifi) || (locala.field_reserveInWifi)))
      {
        locala.field_downloadInWifi = false;
        locala.field_reserveInWifi = false;
        c.e(locala);
      }
      if ((locala != null) && (locala.field_downloaderType == 3))
      {
        i = bio().hl(paramLong);
        AppMethodBeat.o(2419);
      }
      else
      {
        i = bik().hl(paramLong);
        AppMethodBeat.o(2419);
      }
    }
  }

  public final FileDownloadTaskInfo hm(long paramLong)
  {
    AppMethodBeat.i(2420);
    Object localObject1;
    if (hx(paramLong))
    {
      localObject1 = bil().hm(paramLong);
      AppMethodBeat.o(2420);
      return localObject1;
    }
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    Object localObject2;
    if ((locala != null) && (locala.field_status == 3) && (com.tencent.mm.vfs.e.ct(locala.field_filePath)))
    {
      localObject2 = new FileDownloadTaskInfo();
      ((FileDownloadTaskInfo)localObject2).id = paramLong;
      ((FileDownloadTaskInfo)localObject2).url = locala.field_downloadUrl;
      ((FileDownloadTaskInfo)localObject2).status = 3;
      ((FileDownloadTaskInfo)localObject2).path = locala.field_filePath;
      ((FileDownloadTaskInfo)localObject2).cvZ = locala.field_md5;
      ((FileDownloadTaskInfo)localObject2).kNr = locala.field_downloadedSize;
      ((FileDownloadTaskInfo)localObject2).jrb = locala.field_totalSize;
      ((FileDownloadTaskInfo)localObject2).kNs = locala.field_autoDownload;
      ((FileDownloadTaskInfo)localObject2).cBA = locala.field_downloaderType;
      label154: localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new FileDownloadTaskInfo();
      if ((((FileDownloadTaskInfo)localObject1).status == 3) || (((FileDownloadTaskInfo)localObject1).status == 6))
      {
        if (com.tencent.mm.vfs.e.ct(((FileDownloadTaskInfo)localObject1).path))
          break label399;
        ((FileDownloadTaskInfo)localObject1).status = 0;
      }
    }
    while (true)
    {
      if (locala != null)
      {
        ((FileDownloadTaskInfo)localObject1).kNt = locala.field_downloadInWifi;
        ((FileDownloadTaskInfo)localObject1).appId = locala.field_appId;
        ((FileDownloadTaskInfo)localObject1).kNu = locala.field_reserveInWifi;
      }
      ab.i("MicroMsg.FileDownloadManager", "getDownloadTaskInfo: id: %d, url: %s, status: %d, path: %s, md5: %s, totalsize: %d, autodownload: %b, downloaderType: %d", new Object[] { Long.valueOf(((FileDownloadTaskInfo)localObject1).id), ((FileDownloadTaskInfo)localObject1).url, Integer.valueOf(((FileDownloadTaskInfo)localObject1).status), ((FileDownloadTaskInfo)localObject1).path, ((FileDownloadTaskInfo)localObject1).cvZ, Long.valueOf(((FileDownloadTaskInfo)localObject1).jrb), Boolean.valueOf(((FileDownloadTaskInfo)localObject1).kNs), Integer.valueOf(((FileDownloadTaskInfo)localObject1).cBA) });
      AppMethodBeat.o(2420);
      break;
      if ((locala != null) && (locala.field_downloaderType == 3))
      {
        localObject2 = bio().hm(paramLong);
        break label154;
      }
      localObject1 = bik().hm(paramLong);
      localObject2 = localObject1;
      if (locala == null)
        break label154;
      ((FileDownloadTaskInfo)localObject1).kNs = locala.field_autoDownload;
      ((FileDownloadTaskInfo)localObject1).cBA = locala.field_downloaderType;
      localObject2 = localObject1;
      break label154;
      label399: if (((FileDownloadTaskInfo)localObject1).status == 6)
        ((FileDownloadTaskInfo)localObject1).status = 1;
    }
  }

  public final boolean hn(long paramLong)
  {
    AppMethodBeat.i(2424);
    ab.i("MicroMsg.FileDownloadManager", "pauseDownloadTask, id = ".concat(String.valueOf(paramLong)));
    hz(paramLong);
    boolean bool;
    if (hx(paramLong))
    {
      bool = bil().hn(paramLong);
      AppMethodBeat.o(2424);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
      if ((locala != null) && ((locala.field_downloadInWifi) || (locala.field_reserveInWifi)))
      {
        locala.field_downloadInWifi = false;
        locala.field_reserveInWifi = false;
        c.e(locala);
      }
      if ((locala != null) && (locala.field_downloaderType == 3))
      {
        bool = bio().hn(paramLong);
        AppMethodBeat.o(2424);
      }
      else
      {
        bool = bik().hn(paramLong);
        AppMethodBeat.o(2424);
      }
    }
  }

  public final boolean ho(long paramLong)
  {
    AppMethodBeat.i(2425);
    ab.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = ".concat(String.valueOf(paramLong)));
    hz(paramLong);
    boolean bool;
    if (hx(paramLong))
    {
      bool = bil().ho(paramLong);
      AppMethodBeat.o(2425);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
      if ((locala != null) && (!locala.field_reserveInWifi) && (locala.field_downloadInWifi))
      {
        locala.field_downloadInWifi = false;
        c.e(locala);
      }
      if ((locala != null) && (locala.field_downloaderType == 3))
      {
        bool = bio().n(paramLong, true);
        AppMethodBeat.o(2425);
      }
      else
      {
        bool = bik().ho(paramLong);
        AppMethodBeat.o(2425);
      }
    }
  }

  public final boolean hp(long paramLong)
  {
    AppMethodBeat.i(2434);
    ab.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = ".concat(String.valueOf(paramLong)));
    boolean bool;
    if (hx(paramLong))
    {
      bool = false;
      AppMethodBeat.o(2434);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
      if ((locala != null) && (locala.field_downloaderType == 3))
      {
        bool = bio().hp(paramLong);
        AppMethodBeat.o(2434);
      }
      else
      {
        bool = bin().hp(paramLong);
        AppMethodBeat.o(2434);
      }
    }
  }

  final void o(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(2431);
    ab.d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded id[%d], stack[%s]", new Object[] { Long.valueOf(paramLong), bo.dpG() });
    ah.getContext();
    Object localObject;
    if (hx(paramLong))
    {
      localObject = hm(paramLong);
      this.kMT.c(paramLong, ((FileDownloadTaskInfo)localObject).path, paramBoolean);
      AppMethodBeat.o(2431);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
      if (locala == null)
      {
        AppMethodBeat.o(2431);
      }
      else
      {
        if (bo.isNullOrNil(locala.field_packageName))
        {
          localObject = q.aiR(locala.field_filePath);
          if (!bo.isNullOrNil((String)localObject))
          {
            locala.field_packageName = ((String)localObject);
            ab.i("MicroMsg.FileDownloadManager", "get package name from file : %s, %s", new Object[] { locala.field_filePath, localObject });
            c.e(locala);
          }
        }
        int i = q.aiS(locala.field_filePath);
        ab.d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded field_packageName[%s], field_filePath[%s], versionCode[%d]", new Object[] { locala.field_packageName, locala.field_filePath, Integer.valueOf(i) });
        com.tencent.mm.kernel.g.RS().aa(new d.1(this, locala, i, paramBoolean));
        AppMethodBeat.o(2431);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.d
 * JD-Core Version:    0.6.2
 */