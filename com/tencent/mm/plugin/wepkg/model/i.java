package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public class i
{
  private static volatile i uXB = null;

  private void a(String paramString, List<WepkgPreloadFile> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(63595);
    try
    {
      if (bo.ek(paramList))
      {
        ab.i("MicroMsg.Wepkg.WepkgUpdater", "loopDownload WepkgPreloadFile is empty");
        if (bo.isNullOrNil(paramString))
        {
          v(paramBoolean, paramString);
          AppMethodBeat.o(63595);
        }
        while (true)
        {
          return;
          paramList = h.ahY(paramString);
          if (!bo.ek(paramList))
            break label235;
          paramList = new com/tencent/mm/plugin/wepkg/model/WepkgCrossProcessTask;
          paramList.<init>();
          paramList.Cn = 3006;
          paramList.uWY.eBS = paramString;
          paramList.uWY.uXN = true;
          if (!ah.bqo())
            break;
          paramList.asP();
          paramList = h.ahW(paramString);
          if ((paramList != null) && (paramList.createTime != 0L))
          {
            com.tencent.mm.plugin.wepkg.utils.a.b("downloadCompleteTime", "", paramList.eBS, paramList.version, -1L, System.currentTimeMillis() - paramList.createTime * 1000L, null);
            paramList = new com/tencent/mm/plugin/wepkg/model/WepkgCrossProcessTask;
            paramList.<init>();
            paramList.Cn = 3007;
            paramList.uWY.eBS = paramString;
            if (!ah.bqo())
              break label227;
            paramList.asP();
          }
          v(paramBoolean, paramString);
          ab.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:true");
          AppMethodBeat.o(63595);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Wepkg.WepkgUpdater", "loopDownload err:%s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(63595);
        continue;
        WepkgMainProcessService.b(paramList);
        continue;
        label227: WepkgMainProcessService.b(paramList);
        continue;
        label235: ab.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:false list.size:%s", new Object[] { Integer.valueOf(paramList.size()) });
        v(paramBoolean, paramString);
        AppMethodBeat.o(63595);
        continue;
        WepkgPreloadFile localWepkgPreloadFile = (WepkgPreloadFile)paramList.remove(0);
        if (localWepkgPreloadFile != null)
        {
          ab.i("MicroMsg.Wepkg.WepkgUpdater", "download preload files pkgid:%s, version:%s, rid:%s", new Object[] { localWepkgPreloadFile.eBS, localWepkgPreloadFile.version, localWepkgPreloadFile.uXe });
          a local3 = new com/tencent/mm/plugin/wepkg/model/i$3;
          local3.<init>(this, paramString, paramList, paramBoolean);
          local3.object = localWepkgPreloadFile;
          h.a(2, localWepkgPreloadFile.eBS, localWepkgPreloadFile.uXe, localWepkgPreloadFile.downloadUrl, localWepkgPreloadFile.size, localWepkgPreloadFile.version, localWepkgPreloadFile.cvZ, localWepkgPreloadFile.uWQ, local3);
          AppMethodBeat.o(63595);
        }
        else
        {
          ab.i("MicroMsg.Wepkg.WepkgUpdater", "download item is null, to loop");
          a(paramString, paramList, paramBoolean);
          AppMethodBeat.o(63595);
        }
      }
    }
  }

  public static i dgD()
  {
    AppMethodBeat.i(63593);
    if (uXB == null);
    try
    {
      if (uXB == null)
      {
        locali = new com/tencent/mm/plugin/wepkg/model/i;
        locali.<init>();
        uXB = locali;
      }
      i locali = uXB;
      AppMethodBeat.o(63593);
      return locali;
    }
    finally
    {
      AppMethodBeat.o(63593);
    }
  }

  private static void v(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(63596);
    if (paramBoolean)
    {
      vv localvv = new vv();
      localvv.cSX.cuy = 0;
      com.tencent.mm.sdk.b.a.xxA.m(localvv);
    }
    h.aib(paramString);
    b.dgz().dP(paramString, 3);
    AppMethodBeat.o(63596);
  }

  public final void bQ(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63594);
    if (bo.isNullOrNil(paramString))
    {
      v(paramBoolean, paramString);
      AppMethodBeat.o(63594);
    }
    while (true)
    {
      return;
      i.1 local1 = new i.1(this, paramBoolean, paramString);
      local1.object = paramString;
      ab.i("MicroMsg.Wepkg.WepkgUpdater", "start update wepkg. pkgid:%s, isAutoUpdate:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      if (bo.isNullOrNil(paramString))
      {
        v(paramBoolean, paramString);
        AppMethodBeat.o(63594);
      }
      else
      {
        ab.i("MicroMsg.Wepkg.WepkgUpdater", "update big package. pkgid:%s, isAutoUpdate:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        WepkgVersion localWepkgVersion = h.ahW(paramString);
        if (localWepkgVersion == null)
        {
          v(paramBoolean, paramString);
          AppMethodBeat.o(63594);
        }
        else if (!localWepkgVersion.uXM)
        {
          h.a(1, localWepkgVersion.eBS, "", localWepkgVersion.downloadUrl, localWepkgVersion.uXK, localWepkgVersion.version, localWepkgVersion.cvZ, localWepkgVersion.uWQ, new i.2(this, local1, paramBoolean, paramString));
          AppMethodBeat.o(63594);
        }
        else
        {
          paramString = new WepkgCrossProcessTask();
          paramString.csN = true;
          local1.a(paramString);
          AppMethodBeat.o(63594);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.i
 * JD-Core Version:    0.6.2
 */