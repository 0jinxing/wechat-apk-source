package com.tencent.mm.plugin.downloader.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class a$1
  implements com.tencent.mm.plugin.cdndownloader.d.b
{
  a$1(a parama)
  {
  }

  public final void f(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(2354);
    com.tencent.mm.plugin.downloader.f.a locala = c.Iq(paramString1);
    if (locala == null)
    {
      h.pYm.a(710L, 18L, 1L, false);
      ab.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, info is null");
      AppMethodBeat.o(2354);
      return;
    }
    ab.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, url = %s, state = %d, errCode = %d, errMsg = %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    switch (paramInt1)
    {
    case 2:
    default:
    case 1:
    case 4:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(2354);
      break;
      locala.field_status = 1;
      c.e(locala);
      AppMethodBeat.o(2354);
      break;
      locala.field_finishTime = System.currentTimeMillis();
      locala.field_errCode = Math.abs(paramInt2);
      locala.field_status = 4;
      if ((at.isWifi(ah.getContext())) && (locala.field_downloadInWifi))
      {
        locala.field_downloadInWifi = false;
        locala.field_reserveInWifi = false;
      }
      c.e(locala);
      this.kME.kMT.d(locala.field_downloadId, Math.abs(paramInt2), false);
      a.a(this.kME, locala.field_downloadUrl, 4, 0, false);
      a.a(this.kME).remove(locala.field_downloadUrl);
      a.b(this.kME).remove(locala.field_downloadUrl);
      AppMethodBeat.o(2354);
      break;
      locala.field_finishTime = System.currentTimeMillis();
      locala.field_downloadedSize = locala.field_totalSize;
      locala.field_status = 6;
      ab.i("MicroMsg.FileCDNDownloader", "download succeed, downloadedSize = %d, startSize = %d", new Object[] { Long.valueOf(locala.field_downloadedSize), Long.valueOf(locala.field_startSize) });
      c.e(locala);
      this.kME.kMT.hu(locala.field_downloadId);
      paramString1 = new Intent();
      paramString1.putExtra(FileDownloadService.kNn, 1);
      paramString1.setClass(a.c(this.kME), FileDownloadService.class);
      paramString1.putExtra(FileDownloadService.EXTRA_ID, locala.field_downloadId);
      try
      {
        d.aH(paramString1);
        a.a(this.kME, locala.field_downloadUrl);
        a.a(this.kME).remove(locala.field_downloadUrl);
        a.b(this.kME).remove(locala.field_downloadUrl);
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.e("MicroMsg.FileCDNDownloader", paramString1.getMessage());
      }
    }
  }

  public final void m(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(2355);
    ab.d("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, totalDataLen = %d, receiveDataLen = %d", new Object[] { Long.valueOf(paramLong2), Long.valueOf(paramLong1) });
    com.tencent.mm.plugin.downloader.f.a locala = c.Iq(paramString);
    if (locala == null)
    {
      ab.i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, info is null");
      AppMethodBeat.o(2355);
      return;
    }
    if ((locala.field_downloadInWifi) && (!at.isWifi(ah.getContext())))
      this.kME.hq(locala.field_downloadId);
    Long localLong = Long.valueOf(bo.c((Long)a.a(this.kME).get(locala.field_downloadUrl)));
    paramString = localLong;
    if (localLong.longValue() == 0L)
    {
      paramString = Long.valueOf(paramLong1);
      a.a(this.kME).put(locala.field_downloadUrl, Long.valueOf(paramLong1));
    }
    long l1 = paramLong1 - paramString.longValue();
    if (paramLong2 == 0L)
      ab.i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, totalDataLen = 0");
    int i;
    while (true)
    {
      paramString = Long.valueOf(bo.c((Long)a.d(this.kME).get(locala.field_downloadUrl)));
      localLong = Long.valueOf(System.currentTimeMillis());
      l1 = localLong.longValue() - paramString.longValue();
      if ((paramString == null) || (l1 <= 0L) || (l1 >= 500L))
        break label450;
      AppMethodBeat.o(2355);
      break;
      long l2 = 100L * l1 / paramLong2;
      i = (int)((float)paramLong1 / (float)paramLong2 * 100.0F);
      if (l2 >= 1L)
      {
        long l3 = bo.a((Long)a.b(this.kME).get(locala.field_downloadUrl), locala.field_startTime);
        l2 = System.currentTimeMillis();
        l3 = l2 - l3;
        float f = (float)l1 * 1000.0F / (float)l3 / 1048576.0F;
        ab.d("MicroMsg.FileCDNDownloader", "downloadSpeed, appId = %s, speed = %f, period = %d, downloadedSize = %d, totalSize = %d, totalPercent = %d", new Object[] { locala.field_appId, Float.valueOf(f), Long.valueOf(l3), Long.valueOf(l1), Long.valueOf(paramLong2), Integer.valueOf(i) });
        com.tencent.mm.plugin.downloader.h.b.a(locala.field_downloadId, f, i);
        a.b(this.kME).put(locala.field_downloadUrl, Long.valueOf(l2));
        a.a(this.kME).put(locala.field_downloadUrl, Long.valueOf(paramLong1));
      }
    }
    label450: a.d(this.kME).put(locala.field_downloadUrl, localLong);
    locala.field_downloadedSize = paramLong1;
    locala.field_totalSize = paramLong2;
    c.e(locala);
    this.kME.kMT.ht(locala.field_downloadId);
    int j = 0;
    if (paramLong2 > 0L)
      j = (int)((float)paramLong1 / (float)paramLong2 * 100.0F);
    if (j < 0)
      i = 0;
    while (true)
    {
      a.a(this.kME, locala.field_downloadUrl, 1, i, false);
      AppMethodBeat.o(2355);
      break;
      i = j;
      if (j > 100)
        i = 100;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.a.1
 * JD-Core Version:    0.6.2
 */