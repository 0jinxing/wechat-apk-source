package com.tencent.mm.plugin.wepkg.downloader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wepkg.b.a;
import com.tencent.mm.plugin.wepkg.b.b;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.vfs.e;

final class WePkgDownloader$1
  implements WePkgDownloader.IWepkgUpdateCallback
{
  WePkgDownloader$1(WePkgDownloader paramWePkgDownloader, WepkgVersion paramWepkgVersion, a parama, WePkgDownloader.IWepkgUpdateCallback paramIWepkgUpdateCallback)
  {
  }

  public final void a(String paramString1, String paramString2, WePkgDownloader.IWepkgUpdateCallback.RetCode paramRetCode)
  {
    AppMethodBeat.i(63431);
    String str = WePkgDownloader.hw(paramString1, this.uWc.version);
    if (paramRetCode == WePkgDownloader.IWepkgUpdateCallback.RetCode.uWg)
    {
      h.pYm.k(859L, 24L, 1L);
      boolean bool = WePkgDownloader.f(paramString1, str, this.uWd.field_oldPath, paramString2, this.uWc.cvZ);
      e.deleteFile(paramString2);
      b.dgn().pI(paramString1);
      if (bool)
      {
        this.uWe.a(paramString1, str, WePkgDownloader.IWepkgUpdateCallback.RetCode.uWg);
        AppMethodBeat.o(63431);
      }
    }
    while (true)
    {
      return;
      this.uWf.a(paramString1, this.uWe);
      AppMethodBeat.o(63431);
      continue;
      if (paramRetCode != WePkgDownloader.IWepkgUpdateCallback.RetCode.uWl)
        break;
      this.uWe.a(paramString1, str, paramRetCode);
      AppMethodBeat.o(63431);
    }
    if (paramRetCode == WePkgDownloader.IWepkgUpdateCallback.RetCode.uWk)
      h.pYm.k(859L, 23L, 1L);
    while (true)
    {
      e.deleteFile(paramString2);
      b.dgn().pI(paramString1);
      this.uWf.a(paramString1, this.uWe);
      AppMethodBeat.o(63431);
      break;
      if (paramRetCode == WePkgDownloader.IWepkgUpdateCallback.RetCode.uWi)
        h.pYm.k(859L, 25L, 1L);
      else if (paramRetCode == WePkgDownloader.IWepkgUpdateCallback.RetCode.uWh)
        h.pYm.k(859L, 26L, 1L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.1
 * JD-Core Version:    0.6.2
 */