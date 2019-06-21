package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

public final class a
  implements k
{
  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(130640);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    AppbrandDownloadState localAppbrandDownloadState;
    if (locala != null)
    {
      ab.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFailed, appId: %s, downloadInWifi: %b, isWifi: %b", new Object[] { locala.field_appId, Boolean.valueOf(locala.field_downloadInWifi), Boolean.valueOf(at.isWifi(ah.getContext())) });
      localAppbrandDownloadState = new AppbrandDownloadState();
      if ((!locala.field_downloadInWifi) || (at.isWifi(ah.getContext())))
        break label132;
    }
    label132: for (localAppbrandDownloadState.state = "download_wait_wifi"; ; localAppbrandDownloadState.state = "download_failed")
    {
      localAppbrandDownloadState.crZ = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      localAppbrandDownloadState.hzC = locala.field_totalSize;
      b.a(localAppbrandDownloadState);
      AppMethodBeat.o(130640);
      return;
    }
  }

  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(130639);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if (locala != null)
    {
      ab.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFinished, appId: " + locala.field_appId);
      if (locala.field_downloadInWifi)
      {
        locala.field_downloadInWifi = false;
        c.e(locala);
      }
      paramString = new AppbrandDownloadState();
      paramString.state = "download_succ";
      paramString.crZ = locala.field_downloadId;
      paramString.appId = locala.field_appId;
      paramString.progress = 100L;
      paramString.hzC = locala.field_totalSize;
      b.a(paramString);
    }
    AppMethodBeat.o(130639);
  }

  public final void gm(long paramLong)
  {
    AppMethodBeat.i(130643);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if (locala != null)
    {
      AppbrandDownloadState localAppbrandDownloadState = new AppbrandDownloadState();
      localAppbrandDownloadState.state = "download_progress_changed";
      localAppbrandDownloadState.crZ = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      if (locala.field_totalSize != 0L)
        localAppbrandDownloadState.progress = (()((float)locala.field_downloadedSize / (float)locala.field_totalSize * 100.0F));
      ab.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskProgressChanged, appId: %s, progress: %d", new Object[] { locala.field_appId, Long.valueOf(localAppbrandDownloadState.progress) });
      localAppbrandDownloadState.hzC = locala.field_totalSize;
      b.a(localAppbrandDownloadState);
    }
    AppMethodBeat.o(130643);
  }

  public final void gn(long paramLong)
  {
  }

  public final void i(long paramLong, String paramString)
  {
  }

  public final void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(130642);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    AppbrandDownloadState localAppbrandDownloadState;
    if (locala != null)
    {
      ab.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskPaused, appId: " + locala.field_appId);
      localAppbrandDownloadState = new AppbrandDownloadState();
      if ((!locala.field_downloadInWifi) || (at.isWifi(ah.getContext())))
        break label137;
    }
    label137: for (localAppbrandDownloadState.state = "download_wait_wifi"; ; localAppbrandDownloadState.state = "download_paused")
    {
      localAppbrandDownloadState.crZ = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      localAppbrandDownloadState.hzC = locala.field_totalSize;
      if (locala.field_totalSize != 0L)
        localAppbrandDownloadState.progress = (()((float)locala.field_downloadedSize / (float)locala.field_totalSize * 100.0F));
      b.a(localAppbrandDownloadState);
      AppMethodBeat.o(130642);
      return;
    }
  }

  public final void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(130641);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if (locala != null)
    {
      ab.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskRemoved, appId: " + locala.field_appId);
      AppbrandDownloadState localAppbrandDownloadState = new AppbrandDownloadState();
      localAppbrandDownloadState.state = "download_removed";
      localAppbrandDownloadState.crZ = locala.field_downloadId;
      localAppbrandDownloadState.appId = locala.field_appId;
      localAppbrandDownloadState.hzC = locala.field_totalSize;
      b.a(localAppbrandDownloadState);
    }
    AppMethodBeat.o(130641);
  }

  public final void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(130638);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if (locala != null)
    {
      ab.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskStarted, appId: " + locala.field_appId);
      paramString = new AppbrandDownloadState();
      paramString.state = "download_started";
      paramString.crZ = locala.field_downloadId;
      paramString.appId = locala.field_appId;
      if (locala.field_totalSize != 0L)
        paramString.progress = (()((float)locala.field_downloadedSize / (float)locala.field_totalSize * 100.0F));
      paramString.hzC = locala.field_totalSize;
      b.a(paramString);
    }
    AppMethodBeat.o(130638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.a
 * JD-Core Version:    0.6.2
 */