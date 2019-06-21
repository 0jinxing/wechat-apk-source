package com.tencent.mm.plugin.downloader.g;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.plugin.downloader.model.FileDownloadService;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class a$5
  implements ITMAssistantDownloadSDKClientListener
{
  a$5(a parama)
  {
  }

  public final void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(2497);
    com.tencent.mm.plugin.downloader.f.a locala = c.Iq(paramString);
    if (locala == null)
    {
      ab.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
      AppMethodBeat.o(2497);
    }
    while (true)
    {
      return;
      Long localLong = Long.valueOf(bo.c((Long)this.kNK.kMC.get(locala.field_downloadUrl)));
      paramTMAssistantDownloadSDKClient = localLong;
      if (localLong.longValue() == 0L)
      {
        paramTMAssistantDownloadSDKClient = Long.valueOf(paramLong1);
        this.kNK.kMC.put(locala.field_downloadUrl, Long.valueOf(paramLong1));
      }
      long l1 = paramLong1 - paramTMAssistantDownloadSDKClient.longValue();
      if (paramLong2 == 0L)
        ab.i("MicroMsg.FileDownloaderImplTMAssistant", "onDownloadTaskProgressChanged, totalDataLen = 0");
      while (true)
      {
        paramTMAssistantDownloadSDKClient = (Long)this.kNK.kNE.get(paramString);
        localLong = Long.valueOf(System.currentTimeMillis());
        if (paramTMAssistantDownloadSDKClient == null)
          break label373;
        l1 = localLong.longValue() - paramTMAssistantDownloadSDKClient.longValue();
        if ((l1 <= 0L) || (l1 >= 500L))
          break label373;
        AppMethodBeat.o(2497);
        break;
        long l2 = 100L * l1 / paramLong2;
        i = (int)((float)paramLong1 / (float)paramLong2 * 100.0F);
        if (l2 >= 1L)
        {
          long l3 = bo.a((Long)this.kNK.kMD.get(locala.field_downloadUrl), locala.field_startTime);
          l2 = System.currentTimeMillis();
          l3 = l2 - l3;
          float f = (float)l1 * 1000.0F / (float)l3 / 1048576.0F;
          ab.d("MicroMsg.FileDownloaderImplTMAssistant", "downloadSpeed, appId = %s, speed = %f, period = %d, downloadedSize = %d, totalSize = %d", new Object[] { locala.field_appId, Float.valueOf(f), Long.valueOf(l3), Long.valueOf(l1), Long.valueOf(paramLong2) });
          com.tencent.mm.plugin.downloader.h.b.a(locala.field_downloadId, f, i);
          this.kNK.kMD.put(locala.field_downloadUrl, Long.valueOf(l2));
          this.kNK.kMC.put(locala.field_downloadUrl, Long.valueOf(paramLong1));
        }
      }
      label373: this.kNK.kNE.put(paramString, localLong);
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "onProgressChanged");
      int i = (int)(100L * paramLong1 / paramLong2);
      a.a(this.kNK, paramString, 2, i, false);
      l1 = locala.field_downloadId;
      paramTMAssistantDownloadSDKClient = c.XS();
      if (paramTMAssistantDownloadSDKClient != null)
        paramTMAssistantDownloadSDKClient.hY("FileDownloadInfo", "update FileDownloadInfo set downloadedSize = " + paramLong1 + ",totalSize= " + paramLong2 + " where downloadId = " + l1);
      this.kNK.kMT.ht(locala.field_downloadId);
      AppMethodBeat.o(2497);
    }
  }

  public final void OnDownloadSDKTaskStateChanged(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(2496);
    ab.i("MicroMsg.FileDownloaderImplTMAssistant", "OnDownloadSDKTaskStateChanged State: " + paramInt1 + " | ErrorCode: " + paramInt2 + " | ErrorMsg: " + paramString2);
    com.tencent.mm.plugin.downloader.f.a locala = c.Iq(paramString1);
    if (locala == null)
    {
      ab.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
      AppMethodBeat.o(2496);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FileDownloaderImplTMAssistant", "State: %d, Id: %d, Path: %s, File Exists: %b, URL: %s", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(locala.field_downloadId), locala.field_filePath, Boolean.valueOf(e.ct(locala.field_filePath)), paramString1 });
      if ((paramInt1 != 1) && (paramInt1 != 2))
      {
        paramTMAssistantDownloadSDKClient = this.kNK.hm(locala.field_downloadId);
        long l1 = bo.a((Long)this.kNK.kMD.get(locala.field_downloadUrl), locala.field_startTime);
        long l2 = bo.a((Long)this.kNK.kMC.get(locala.field_downloadUrl), locala.field_startSize);
        long l3 = System.currentTimeMillis();
        int i = (int)((float)paramTMAssistantDownloadSDKClient.kNr / (float)paramTMAssistantDownloadSDKClient.jrb * 100.0F);
        float f = (float)(paramTMAssistantDownloadSDKClient.kNr - l2) * 1000.0F / (float)(l3 - l1) / 1048576.0F;
        com.tencent.mm.plugin.downloader.h.b.a(locala.field_downloadId, f, i);
        this.kNK.kMC.remove(locala.field_downloadUrl);
        this.kNK.kMD.remove(locala.field_downloadUrl);
      }
      paramTMAssistantDownloadSDKClient = null;
      try
      {
        paramString2 = this.kNK.getClient().getDownloadTaskState(locala.field_downloadUrl);
        paramTMAssistantDownloadSDKClient = paramString2;
        label317: switch (paramInt1)
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        while (true)
        {
          while (true)
          {
            AppMethodBeat.o(2496);
            break;
            AppMethodBeat.o(2496);
            break;
            locala.field_status = 1;
            if (paramTMAssistantDownloadSDKClient != null)
              locala.field_filePath = paramTMAssistantDownloadSDKClient.mSavePath;
            c.e(locala);
            AppMethodBeat.o(2496);
            break;
            locala.field_finishTime = System.currentTimeMillis();
            locala.field_status = 2;
            c.e(locala);
            this.kNK.cancelNotification(paramString1);
            this.kNK.kNG.remove(Long.valueOf(locala.field_downloadId));
            this.kNK.kMT.hs(locala.field_downloadId);
            AppMethodBeat.o(2496);
            break;
            ab.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Download Succeed event received");
            locala.field_status = 6;
            locala.field_finishTime = System.currentTimeMillis();
            locala.field_downloadedSize = locala.field_totalSize;
            if (paramTMAssistantDownloadSDKClient != null)
              locala.field_filePath = paramTMAssistantDownloadSDKClient.mSavePath;
            ab.i("MicroMsg.FileDownloaderImplTMAssistant", "download succeed, downloadedSize = %d, startSize = %d", new Object[] { Long.valueOf(locala.field_downloadedSize), Long.valueOf(locala.field_startSize) });
            c.e(locala);
            this.kNK.kMT.hu(locala.field_downloadId);
            if (paramBoolean2)
            {
              paramTMAssistantDownloadSDKClient = new hc();
              paramTMAssistantDownloadSDKClient.cBN.appId = locala.field_appId;
              paramTMAssistantDownloadSDKClient.cBN.opType = 6;
              com.tencent.mm.sdk.b.a.xxA.m(paramTMAssistantDownloadSDKClient);
            }
            paramTMAssistantDownloadSDKClient = new Intent();
            paramTMAssistantDownloadSDKClient.putExtra(FileDownloadService.kNn, 1);
            paramTMAssistantDownloadSDKClient.setClass(this.kNK.mContext, FileDownloadService.class);
            paramTMAssistantDownloadSDKClient.putExtra(FileDownloadService.EXTRA_ID, locala.field_downloadId);
            paramTMAssistantDownloadSDKClient.putExtra(FileDownloadService.kNq, paramBoolean1);
            try
            {
              d.aH(paramTMAssistantDownloadSDKClient);
              this.kNK.cancelNotification(paramString1);
              this.kNK.kNG.remove(Long.valueOf(locala.field_downloadId));
              AppMethodBeat.o(2496);
            }
            catch (Exception paramTMAssistantDownloadSDKClient)
            {
              while (true)
                ab.e("MicroMsg.FileDownloaderImplTMAssistant", paramTMAssistantDownloadSDKClient.getMessage());
            }
          }
          if ((paramInt2 == 601) || (paramInt2 == 602) || (paramInt2 == 603) || (paramInt2 == 605) || (paramInt2 == 606))
          {
            ab.d("MicroMsg.FileDownloaderImplTMAssistant", "releaseTimer 4 min");
            this.kNK.kNI.ae(240000L, 240000L);
          }
          if ((at.isWifi(ah.getContext())) && (locala.field_downloadInWifi))
          {
            locala.field_downloadInWifi = false;
            locala.field_reserveInWifi = false;
          }
          a.a(this.kNK, paramString1, paramInt1, 0, false);
          this.kNK.kNG.remove(Long.valueOf(locala.field_downloadId));
          locala.field_finishTime = System.currentTimeMillis();
          locala.field_errCode = paramInt2;
          locala.field_status = 4;
          c.e(locala);
          this.kNK.kMT.d(locala.field_downloadId, paramInt2, paramBoolean1);
        }
      }
      catch (Exception paramString2)
      {
        break label317;
      }
    }
  }

  public final void OnDwonloadSDKServiceInvalid(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient)
  {
    AppMethodBeat.i(2495);
    ab.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Service unavailable");
    paramTMAssistantDownloadSDKClient = this.kNK.kNG.iterator();
    while (paramTMAssistantDownloadSDKClient.hasNext())
    {
      com.tencent.mm.plugin.downloader.f.a locala = c.hv(((Long)paramTMAssistantDownloadSDKClient.next()).longValue());
      if (locala != null)
      {
        locala.field_finishTime = System.currentTimeMillis();
        locala.field_status = 4;
        locala.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJM;
        c.e(locala);
        this.kNK.kMT.d(locala.field_downloadId, com.tencent.mm.plugin.downloader.a.a.kJM, false);
        a.a(this.kNK, locala.field_downloadUrl, 5, 0, false);
      }
    }
    this.kNK.kNG.clear();
    AppMethodBeat.o(2495);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.g.a.5
 * JD-Core Version:    0.6.2
 */