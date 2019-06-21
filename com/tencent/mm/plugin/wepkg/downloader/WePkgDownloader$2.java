package com.tencent.mm.plugin.wepkg.downloader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Map;

final class WePkgDownloader$2
  implements a
{
  WePkgDownloader$2(WePkgDownloader paramWePkgDownloader)
  {
  }

  public final void a(g paramg)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(63432);
        d.dgw().ahO(paramg.uVO.uWo);
        if (paramg.mStatus == 1)
        {
          h.pYm.a(859L, 2L, 1L, false);
          localObject1 = paramg.uVO.mFilePath;
          if (!bo.isNullOrNil((String)localObject1))
          {
            localObject2 = new java/io/File;
            ((File)localObject2).<init>((String)localObject1);
            if (((File)localObject2).exists());
          }
          else
          {
            ab.e("MicroMsg.Wepkg.WepkgDownloader", "onDownloadComplete, pkgPath is null or nil");
            localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.uWh;
            h.pYm.a(859L, 4L, 1L, false);
            ab.i("MicroMsg.Wepkg.WepkgDownloader", "download callback retCode:".concat(String.valueOf(localObject1)));
            localObject2 = (WePkgDownloader.IWepkgUpdateCallback)WePkgDownloader.a(this.uWf).remove(paramg.uVO.uWo);
            if (localObject2 == null)
              continue;
            ((WePkgDownloader.IWepkgUpdateCallback)localObject2).a(paramg.uVO.uWp, paramg.uVO.mFilePath, (WePkgDownloader.IWepkgUpdateCallback.RetCode)localObject1);
            if (paramg.uVO.kNb != 1)
              break label392;
            localObject1 = paramg.uVO.uWp;
            localObject2 = new com/tencent/mm/plugin/wepkg/model/WepkgCrossProcessTask;
            ((WepkgCrossProcessTask)localObject2).<init>();
            ((WepkgCrossProcessTask)localObject2).Cn = 3008;
            ((WepkgCrossProcessTask)localObject2).uWY.eBS = ((String)localObject1);
            if (!ah.bqo())
              break label384;
            ((WepkgCrossProcessTask)localObject2).asP();
            WePkgDownloader.b(paramg);
            AppMethodBeat.o(63432);
            return;
          }
          str = paramg.uVO.hxH;
          localObject2 = com.tencent.mm.a.g.cz((String)localObject1);
          if (!bo.nullAsNil((String)localObject2).equalsIgnoreCase(str))
          {
            ab.e("MicroMsg.Wepkg.WepkgDownloader", "onDownloadComplete, file.md5(%s) != net.md5(%s)", new Object[] { localObject2, str });
            e.deleteFile((String)localObject1);
            localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.uWi;
            paramg.lqz = 1012;
            h.pYm.a(859L, 3L, 1L, false);
            continue;
          }
          localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.uWg;
          h.pYm.a(859L, 5L, 1L, false);
          continue;
        }
        else
        {
          h.pYm.a(859L, 1L, 1L, false);
          localObject1 = WePkgDownloader.IWepkgUpdateCallback.RetCode.uWk;
          continue;
        }
        ab.i("MicroMsg.Wepkg.WepkgDownloader", "download callback invalid");
        com.tencent.mm.plugin.wepkg.utils.a.b("CallbackInvalid", paramg.uVO.mUrl, paramg.uVO.uWp, null, -1L, 0L, null);
        continue;
      }
      finally
      {
      }
      label384: WepkgMainProcessService.b((WepkgMainProcessTask)localObject2);
      continue;
      label392: String str = paramg.uVO.uWp;
      Object localObject1 = paramg.uVO.uWq;
      Object localObject2 = new com/tencent/mm/plugin/wepkg/model/WepkgCrossProcessTask;
      ((WepkgCrossProcessTask)localObject2).<init>();
      ((WepkgCrossProcessTask)localObject2).Cn = 4005;
      ((WepkgCrossProcessTask)localObject2).uXb.eBS = str;
      ((WepkgCrossProcessTask)localObject2).uXb.uXe = ((String)localObject1);
      if (ah.bqo())
        ((WepkgCrossProcessTask)localObject2).asP();
      else
        WepkgMainProcessService.b((WepkgMainProcessTask)localObject2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.2
 * JD-Core Version:    0.6.2
 */