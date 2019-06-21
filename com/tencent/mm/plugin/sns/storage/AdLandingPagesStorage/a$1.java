package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements k
{
  a$1(a parama)
  {
  }

  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(36922);
    if (this.qVG.qHp != null)
      this.qVG.qHp.failed(paramLong);
    this.qVG.Z(8, paramLong);
    AppMethodBeat.o(36922);
  }

  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(36921);
    if (this.qVG.qHp != null)
      this.qVG.qHp.succeed(paramLong);
    this.qVG.Z(3, paramLong);
    AppMethodBeat.o(36921);
  }

  public final void gm(long paramLong)
  {
    AppMethodBeat.i(36925);
    ab.i("MicroMsg.AdDownloadApkMgr", "%d progress changed", new Object[] { Long.valueOf(paramLong) });
    if (this.qVG.qHp != null)
    {
      FileDownloadTaskInfo localFileDownloadTaskInfo = d.bij().hm(paramLong);
      if ((localFileDownloadTaskInfo.kNr >= 0L) && (localFileDownloadTaskInfo.jrb > 0L))
        this.qVG.qHp.progress(paramLong, (int)(localFileDownloadTaskInfo.kNr * 100L / localFileDownloadTaskInfo.jrb));
    }
    AppMethodBeat.o(36925);
  }

  public final void gn(long paramLong)
  {
  }

  public final void i(long paramLong, String paramString)
  {
    AppMethodBeat.i(36926);
    if (this.qVG.qHp != null)
      this.qVG.qHp.resumed(paramLong);
    this.qVG.Z(7, paramLong);
    AppMethodBeat.o(36926);
  }

  public final void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(36924);
    if (this.qVG.qHp != null)
      this.qVG.qHp.paused(paramLong);
    this.qVG.Z(6, paramLong);
    AppMethodBeat.o(36924);
  }

  public final void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(36923);
    if (this.qVG.qHp != null)
      this.qVG.qHp.stopped(paramLong);
    this.qVG.Z(2, paramLong);
    AppMethodBeat.o(36923);
  }

  public final void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(36920);
    this.qVG.Z(1, paramLong);
    AppMethodBeat.o(36920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.1
 * JD-Core Version:    0.6.2
 */