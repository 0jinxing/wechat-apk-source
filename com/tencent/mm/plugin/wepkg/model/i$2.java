package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.sdk.platformtools.bo;

final class i$2 extends a
{
  i$2(i parami, a parama, boolean paramBoolean, String paramString)
  {
  }

  public final void a(BaseWepkgProcessTask paramBaseWepkgProcessTask)
  {
    AppMethodBeat.i(63591);
    if ((paramBaseWepkgProcessTask instanceof WepkgDownloadProcessTask))
    {
      paramBaseWepkgProcessTask = (WepkgDownloadProcessTask)paramBaseWepkgProcessTask;
      if ((paramBaseWepkgProcessTask.uXg == WePkgDownloader.IWepkgUpdateCallback.RetCode.uWg) && (!bo.isNullOrNil(paramBaseWepkgProcessTask.cSY)) && (!bo.isNullOrNil(paramBaseWepkgProcessTask.gSP)))
      {
        h.a(paramBaseWepkgProcessTask.cSY, paramBaseWepkgProcessTask.gSP, true, this.uXE);
        AppMethodBeat.o(63591);
      }
    }
    while (true)
    {
      return;
      if (this.uXE != null)
      {
        paramBaseWepkgProcessTask = new WepkgCrossProcessTask();
        paramBaseWepkgProcessTask.csN = false;
        this.uXE.a(paramBaseWepkgProcessTask);
      }
      i.w(this.uXC, this.mXE);
      AppMethodBeat.o(63591);
      continue;
      i.w(this.uXC, this.mXE);
      AppMethodBeat.o(63591);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.i.2
 * JD-Core Version:    0.6.2
 */