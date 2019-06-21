package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.downloader.c.a.a.d;
import com.tencent.mm.plugin.downloader.c.a.a.k;
import com.tencent.mm.plugin.downloader.c.b.f;
import com.tencent.mm.plugin.downloader.c.b.j;
import com.tencent.mm.sdk.platformtools.ab;

final class DownloadChecker$2
  implements w.a
{
  DownloadChecker$2(String paramString1, String paramString2, String paramString3, com.tencent.mm.ipcinvoker.c paramc)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(2344);
    ab.i("MicroMsg.DownloadChecker", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramm = new DownloadChecker.DownloadInterceptBean();
    k localk;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localk = (k)paramb.fsH.fsP;
      if (localk != null)
      {
        paramInt1 = localk.kKC;
        paramString = localk.kKD;
        paramb = localk.kKy;
        if (DownloadChecker.DownloadInterceptBean.a(paramb))
        {
          paramm.csN = true;
          paramm.kMp = paramInt1;
          paramm.kMq = paramString;
          if (paramb.kKr.kLw == null)
          {
            paramString = null;
            paramm.appId = paramString;
            if (paramb.kKr.kLw != null)
              break label435;
            paramString = null;
            label143: paramm.appName = paramString;
            if (paramb.kKr.kLw != null)
              break label450;
            paramString = null;
            label162: paramm.iconUrl = paramString;
            paramm.downloadUrl = paramb.kKr.kLy.kLn.egm;
            paramm.kMr = paramb.kKr.kLy.kLn.kKV;
            paramm.size = paramb.kKr.kLy.kLn.kKP;
            paramm.packageName = paramb.kKr.kLy.kLn.kKO;
            paramm.cvZ = paramb.kKr.kLy.kLn.kKQ;
            paramm.cBA = paramb.kKr.kLy.kLn.kKR;
            paramm.kMs = paramb.kKr.kLy.kLr;
            label298: ab.i("MicroMsg.DownloadChecker", "check download from net, ret: %d, confirmType: %d, appid: %s", new Object[] { Integer.valueOf(localk.kdT), Integer.valueOf(localk.kKC), paramm.appId });
            if (localk.kdT == 0)
              break label474;
            paramm.csN = false;
            label353: DownloadChecker.c.a(paramm.appId, this.val$downloadUrl, paramm.downloadUrl, String.valueOf(localk.kdT), this.kMo, this.cgp, String.valueOf(localk.kKC));
          }
        }
      }
    }
    while (true)
    {
      if (this.eFW != null)
        this.eFW.ao(paramm);
      AppMethodBeat.o(2344);
      return 0;
      paramString = paramb.kKr.kLw.csB;
      break;
      label435: paramString = paramb.kKr.kLw.kKY;
      break label143;
      label450: paramString = paramb.kKr.kLw.kKZ;
      break label162;
      paramm.csN = false;
      break label298;
      label474: if (paramm.csN)
        break label353;
      localk.kdT = DownloadChecker.c.kMx;
      break label353;
      paramm.csN = false;
      continue;
      paramm.csN = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.DownloadChecker.2
 * JD-Core Version:    0.6.2
 */