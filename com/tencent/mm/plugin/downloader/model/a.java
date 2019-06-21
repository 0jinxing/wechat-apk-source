package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends h
{
  public static final String kMy;
  private byte[] eMl;
  private HashMap<String, Long> kMA;
  private ConcurrentHashMap<String, Integer> kMB;
  private HashMap<String, Long> kMC;
  private HashMap<String, Long> kMD;
  private HashMap<String, Long> kMz;
  private com.tencent.mm.plugin.cdndownloader.d.b ktk;
  private Context mContext;

  static
  {
    AppMethodBeat.i(2375);
    kMy = com.tencent.mm.loader.j.b.eSn + "BigFile/";
    AppMethodBeat.o(2375);
  }

  public a(b paramb)
  {
    super(paramb);
    AppMethodBeat.i(2360);
    this.eMl = new byte[0];
    this.kMC = new HashMap();
    this.kMD = new HashMap();
    this.ktk = new a.1(this);
    this.mContext = ah.getContext();
    this.kMz = new HashMap();
    this.kMA = new HashMap();
    this.kMB = new ConcurrentHashMap();
    com.tencent.mm.plugin.cdndownloader.d.a.beV().ktk = this.ktk;
    AppMethodBeat.o(2360);
  }

  private static CDNTaskInfo b(com.tencent.mm.plugin.downloader.f.a parama)
  {
    AppMethodBeat.i(2363);
    CDNTaskInfo localCDNTaskInfo = new CDNTaskInfo();
    localCDNTaskInfo.egs = true;
    localCDNTaskInfo.cHr = parama.field_downloadUrl;
    localCDNTaskInfo.downloadUrl = parama.field_downloadUrl;
    localCDNTaskInfo.filePath = parama.field_filePath;
    localCDNTaskInfo.ktq = parama.field_secondaryUrl;
    localCDNTaskInfo.kts = 15;
    localCDNTaskInfo.ktt = 3600;
    localCDNTaskInfo.ktu = true;
    localCDNTaskInfo.ktv = parama.field_downloadInWifi;
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (parama.field_fileSize > 0L)
        localJSONObject.put("Content-Length", parama.field_fileSize);
      localCDNTaskInfo.ktr = localJSONObject.toString();
      AppMethodBeat.o(2363);
      return localCDNTaskInfo;
    }
    catch (JSONException parama)
    {
      while (true)
        ab.e("MicroMsg.FileCDNDownloader", "addVerifyHeaders: " + parama.getMessage());
    }
  }

  private void cancelNotification(String paramString)
  {
    AppMethodBeat.i(2370);
    synchronized (this.eMl)
    {
      Integer localInteger = (Integer)this.kMB.get(paramString);
      if (localInteger == null)
      {
        ab.i("MicroMsg.FileCDNDownloader", "No notification id found");
        AppMethodBeat.o(2370);
        return;
      }
      ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(localInteger.intValue());
      ab.i("MicroMsg.FileCDNDownloader", "cancelNotification, id = ".concat(String.valueOf(localInteger)));
      this.kMB.remove(paramString);
      AppMethodBeat.o(2370);
    }
  }

  public final long a(com.tencent.mm.plugin.downloader.f.a parama)
  {
    AppMethodBeat.i(2361);
    com.tencent.mm.ce.a.post(new a.2(this, parama));
    long l = parama.field_downloadId;
    AppMethodBeat.o(2361);
    return l;
  }

  public final long a(e parame)
  {
    AppMethodBeat.i(2362);
    long l;
    if ((parame == null) || (bo.isNullOrNil(parame.gUx)))
    {
      ab.e("MicroMsg.FileCDNDownloader", "Invalid Request");
      l = -1L;
      AppMethodBeat.o(2362);
      return l;
    }
    String str = parame.gUx;
    Object localObject1 = c.Iq(str);
    if (localObject1 == null)
      localObject1 = c.In(parame.mAppId);
    while (true)
    {
      Object localObject2 = null;
      if (localObject1 != null)
      {
        localObject3 = hm(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId);
        localObject2 = localObject3;
        if (localObject3 != null)
        {
          ab.i("MicroMsg.FileCDNDownloader", "addDownloadTask, status = " + ((FileDownloadTaskInfo)localObject3).status);
          if ((((FileDownloadTaskInfo)localObject3).status == 1) || (((FileDownloadTaskInfo)localObject3).status == 6))
          {
            l = ((FileDownloadTaskInfo)localObject3).id;
            AppMethodBeat.o(2362);
            break;
          }
          localObject2 = localObject3;
          if (((FileDownloadTaskInfo)localObject3).status == 3)
          {
            if (((com.tencent.mm.plugin.downloader.f.a)localObject1).field_autoInstall)
              com.tencent.mm.plugin.downloader.h.a.a(((FileDownloadTaskInfo)localObject3).id, false, null);
            l = ((FileDownloadTaskInfo)localObject3).id;
            AppMethodBeat.o(2362);
            break;
          }
        }
      }
      Object localObject3 = new com.tencent.mm.vfs.b(kMy);
      com.tencent.mm.vfs.b localb1;
      if (!((com.tencent.mm.vfs.b)localObject3).exists())
      {
        if (!((com.tencent.mm.vfs.b)localObject3).dMC().exists())
        {
          localb1 = ((com.tencent.mm.vfs.b)localObject3).dMC();
          com.tencent.mm.vfs.b localb2 = new com.tencent.mm.vfs.b(j.w(localb1.dMD()) + System.currentTimeMillis());
          if (localb2.mkdirs())
            localb2.o(localb1);
        }
        else
        {
          ab.i("MicroMsg.FileCDNDownloader", "Make download dir result: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.vfs.b)localObject3).mkdirs()) });
        }
      }
      else
      {
        label314: c.Io(str);
        c.Ip(parame.mAppId);
        if (localObject1 != null)
          c.hw(((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId);
        localObject3 = f.c(parame);
        if ((!parame.kNg) || (localObject1 == null))
          break label648;
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadId = ((com.tencent.mm.plugin.downloader.f.a)localObject1).field_downloadId;
        label370: ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloaderType = 3;
        localObject1 = ag.ck(str);
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_filePath = (kMy + (String)localObject1);
        if (localObject2 == null)
          break label690;
        localObject1 = ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_filePath;
        str = localObject2.path;
        if ((localObject1 != null) && (str != null) && (!((String)localObject1).equals(str)))
        {
          ab.i("MicroMsg.FileCDNDownloader", "removeLastFile, new File = %s, oldFile = %s", new Object[] { localObject1, str });
          localObject1 = new com.tencent.mm.vfs.b(str);
          if (((com.tencent.mm.vfs.b)localObject1).exists())
            ab.i("MicroMsg.FileCDNDownloader", "Delete previous file result: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.vfs.b)localObject1).delete()) });
        }
        if (localObject2.status != 2)
          break label659;
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_startState = com.tencent.mm.plugin.downloader.a.b.kKd;
        label529: ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_startSize = localObject2.kNr;
        ab.i("MicroMsg.FileCDNDownloader", "addDownloadTask, startSize = " + localObject2.kNr);
      }
      while (true)
      {
        if ((!parame.hyG) || (at.isWifi(ah.getContext())))
          break label701;
        ab.i("MicroMsg.FileCDNDownloader", "downloadInWifi, not in wifi");
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_status = 0;
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadInWifi = true;
        c.d((com.tencent.mm.plugin.downloader.f.a)localObject3);
        l = ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadId;
        AppMethodBeat.o(2362);
        break;
        ab.e("MicroMsg.FileCDNDownloader", "mkdir parent error, %s", new Object[] { j.w(localb1.dMD()) });
        break label314;
        label648: ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadId = System.currentTimeMillis();
        break label370;
        label659: if (localObject2.status == 4)
        {
          ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_startState = com.tencent.mm.plugin.downloader.a.b.kKe;
          break label529;
        }
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_startState = com.tencent.mm.plugin.downloader.a.b.kKc;
        break label529;
        label690: ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_startState = com.tencent.mm.plugin.downloader.a.b.kKc;
      }
      label701: if (at.isWifi(ah.getContext()))
        ((com.tencent.mm.plugin.downloader.f.a)localObject3).field_downloadInWifi = true;
      l = a((com.tencent.mm.plugin.downloader.f.a)localObject3);
      AppMethodBeat.o(2362);
      break;
    }
  }

  public final int hl(long paramLong)
  {
    AppMethodBeat.i(2364);
    com.tencent.mm.ce.a.post(new a.3(this, paramLong));
    AppMethodBeat.o(2364);
    return 1;
  }

  public final FileDownloadTaskInfo hm(long paramLong)
  {
    AppMethodBeat.i(2365);
    Object localObject = null;
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    FileDownloadTaskInfo localFileDownloadTaskInfo;
    label139: label159: long l;
    if (locala != null)
    {
      localFileDownloadTaskInfo = new FileDownloadTaskInfo();
      if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId())
        break label410;
      localObject = com.tencent.mm.plugin.cdndownloader.d.a.beV().HC(locala.field_downloadUrl);
      if (localObject == null)
        break label564;
      ab.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, cdntaskstate: %d", new Object[] { Integer.valueOf(((CDNTaskState)localObject).taskState) });
      switch (((CDNTaskState)localObject).taskState)
      {
      case 103:
      default:
        if (locala.field_status == 1)
        {
          localFileDownloadTaskInfo.status = 0;
          localFileDownloadTaskInfo.kNr = locala.field_downloadedSize;
          localFileDownloadTaskInfo.jrb = locala.field_totalSize;
          if (localFileDownloadTaskInfo.kNr <= localFileDownloadTaskInfo.jrb)
            break label554;
          l = localFileDownloadTaskInfo.jrb;
          label180: localFileDownloadTaskInfo.kNr = l;
          locala.field_downloadedSize = localFileDownloadTaskInfo.kNr;
          locala.field_totalSize = localFileDownloadTaskInfo.jrb;
        }
        break;
      case 101:
      case 100:
      case 102:
      case 104:
      }
    }
    while (true)
    {
      if (((localFileDownloadTaskInfo.status == 6) || (localFileDownloadTaskInfo.status == 3)) && (!com.tencent.mm.vfs.e.ct(locala.field_filePath)))
        localFileDownloadTaskInfo.status = 0;
      localFileDownloadTaskInfo.id = paramLong;
      localFileDownloadTaskInfo.cBA = locala.field_downloaderType;
      localFileDownloadTaskInfo.kNs = locala.field_autoDownload;
      localFileDownloadTaskInfo.path = locala.field_filePath;
      localFileDownloadTaskInfo.url = locala.field_downloadUrl;
      localFileDownloadTaskInfo.cvZ = locala.field_md5;
      if ((locala.field_status != localFileDownloadTaskInfo.status) && ((localFileDownloadTaskInfo.status == 1) || (locala.field_status == 1)))
      {
        locala.field_status = localFileDownloadTaskInfo.status;
        c.e(locala);
      }
      ab.i("MicroMsg.FileCDNDownloader", "queryDownloadTask, url: %s, status = %d, downloadedSize = %d, totalSize = %d", new Object[] { localFileDownloadTaskInfo.url, Integer.valueOf(localFileDownloadTaskInfo.status), Long.valueOf(localFileDownloadTaskInfo.kNr), Long.valueOf(localFileDownloadTaskInfo.jrb) });
      localObject = localFileDownloadTaskInfo;
      AppMethodBeat.o(2365);
      return localObject;
      label410: localObject = com.tencent.mm.plugin.cdndownloader.d.a.beV().HE(locala.field_downloadUrl);
      break;
      localFileDownloadTaskInfo.status = 1;
      break label139;
      localFileDownloadTaskInfo.status = 1;
      localFileDownloadTaskInfo.kNr = ((CDNTaskState)localObject).completeSize;
      localFileDownloadTaskInfo.jrb = ((CDNTaskState)localObject).fileTotalSize;
      break label159;
      localFileDownloadTaskInfo.status = 2;
      localFileDownloadTaskInfo.kNr = ((CDNTaskState)localObject).completeSize;
      localFileDownloadTaskInfo.jrb = ((CDNTaskState)localObject).fileTotalSize;
      break label159;
      if (com.tencent.mm.vfs.e.ct(locala.field_filePath))
      {
        if (locala.field_status == 6)
        {
          localFileDownloadTaskInfo.status = 6;
          break label159;
        }
        localFileDownloadTaskInfo.status = 3;
        break label159;
      }
      localFileDownloadTaskInfo.status = 0;
      break label159;
      localFileDownloadTaskInfo.status = locala.field_status;
      break label139;
      label554: l = localFileDownloadTaskInfo.kNr;
      break label180;
      label564: if (locala.field_status == 1);
      for (localFileDownloadTaskInfo.status = 0; ; localFileDownloadTaskInfo.status = locala.field_status)
      {
        if (com.tencent.mm.a.e.ct(locala.field_filePath))
          break label618;
        localFileDownloadTaskInfo.kNr = 0L;
        localFileDownloadTaskInfo.jrb = 0L;
        break;
      }
      label618: localFileDownloadTaskInfo.kNr = locala.field_downloadedSize;
      localFileDownloadTaskInfo.jrb = locala.field_totalSize;
    }
  }

  public final boolean hn(long paramLong)
  {
    AppMethodBeat.i(2366);
    com.tencent.mm.ce.a.post(new a.4(this, paramLong));
    AppMethodBeat.o(2366);
    return true;
  }

  public final boolean ho(long paramLong)
  {
    AppMethodBeat.i(2367);
    boolean bool = n(paramLong, true);
    AppMethodBeat.o(2367);
    return bool;
  }

  public final boolean hp(long paramLong)
  {
    AppMethodBeat.i(2369);
    ab.i("MicroMsg.FileCDNDownloader", "resumeDownloadTaskWhenProcessRestart, id = ".concat(String.valueOf(paramLong)));
    boolean bool = n(paramLong, false);
    AppMethodBeat.o(2369);
    return bool;
  }

  public final boolean hq(long paramLong)
  {
    AppMethodBeat.i(2371);
    com.tencent.mm.game.report.api.b.eBF.a(paramLong, new com.tencent.mm.game.report.api.a(13));
    boolean bool = hn(paramLong);
    AppMethodBeat.o(2371);
    return bool;
  }

  public final boolean n(long paramLong, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(2368);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    FileDownloadTaskInfo localFileDownloadTaskInfo;
    if (locala != null)
    {
      localFileDownloadTaskInfo = hm(locala.field_downloadId);
      if (localFileDownloadTaskInfo == null)
      {
        AppMethodBeat.o(2368);
        paramBoolean = bool;
      }
    }
    while (true)
    {
      return paramBoolean;
      if ((localFileDownloadTaskInfo.status == 1) || (localFileDownloadTaskInfo.status == 6))
      {
        AppMethodBeat.o(2368);
        paramBoolean = true;
      }
      else if (localFileDownloadTaskInfo.status == 3)
      {
        if (locala.field_autoInstall)
          com.tencent.mm.plugin.downloader.h.a.a(localFileDownloadTaskInfo.id, false, null);
        AppMethodBeat.o(2368);
        paramBoolean = true;
      }
      else if (((locala.field_reserveInWifi) || (locala.field_downloadInWifi)) && (!at.isWifi(ah.getContext())))
      {
        ab.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask, downloadInWifi, not wifi");
        AppMethodBeat.o(2368);
        paramBoolean = true;
      }
      else
      {
        if (at.isWifi(ah.getContext()))
          locala.field_downloadInWifi = true;
        com.tencent.mm.ce.a.post(new a.5(this, locala, paramBoolean, paramLong));
        AppMethodBeat.o(2368);
        paramBoolean = true;
        continue;
        AppMethodBeat.o(2368);
        paramBoolean = bool;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.a
 * JD-Core Version:    0.6.2
 */