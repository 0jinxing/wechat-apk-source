package com.tencent.xweb.x5.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.TbsDownloader.TbsDownloaderCallback;

final class g$a
  implements TbsDownloader.TbsDownloaderCallback
{
  f.a ARa;

  public g$a(f.a parama)
  {
    this.ARa = parama;
  }

  public final void onNeedDownloadFinish(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(85109);
    if (this.ARa != null)
      this.ARa.onNeedDownloadFinish(paramBoolean, paramInt);
    AppMethodBeat.o(85109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.sdk.g.a
 * JD-Core Version:    0.6.2
 */