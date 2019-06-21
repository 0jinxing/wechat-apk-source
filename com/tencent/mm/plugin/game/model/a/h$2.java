package com.tencent.mm.plugin.game.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.protocal.protobuf.qh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

final class h$2
  implements w.a
{
  h$2(h paramh, String paramString)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(111537);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.GameSilentDownloader", "Check Error, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      com.tencent.mm.game.report.api.b.eBF.j(this.val$appId, 18L);
      AppMethodBeat.o(111537);
    }
    while (true)
    {
      return 0;
      paramb = (qh)paramb.fsH.fsP;
      if (paramb != null)
        break;
      AppMethodBeat.o(111537);
    }
    ab.i("MicroMsg.GameSilentDownloader", "op:%d", new Object[] { Integer.valueOf(paramb.op) });
    switch (paramb.op)
    {
    default:
      com.tencent.mm.game.report.api.b.eBF.j(this.val$appId, 19L);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(111537);
      break;
      ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().Og(this.val$appId);
      if ((paramb.vXs == null) || (paramb.vXs.kLn == null) || (bo.isNullOrNil(paramb.vXs.kLn.egm)))
      {
        ab.e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
        com.tencent.mm.game.report.api.b.eBF.j(this.val$appId, 20L);
        AppMethodBeat.o(111537);
        break;
      }
      paramString = ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().Ob(this.val$appId);
      if (paramString == null)
      {
        ab.i("MicroMsg.GameSilentDownloader", "local SilentDownloadTask is deleted");
        AppMethodBeat.o(111537);
        break;
      }
      if (!paramb.vXs.kLn.egm.equals(bo.nullAsNil(paramString.field_downloadUrl)))
      {
        ab.i("MicroMsg.GameSilentDownloader", "update downloadInfo. [oldDownloadUrl]:%s, [newDownloadUrl]:%s, [size]:%d, [md5]:%s, [SecondaryUrl]:%s", new Object[] { paramString.field_downloadUrl, paramb.vXs.kLn.egm, Long.valueOf(paramb.vXs.kLn.kKP), paramb.vXs.kLn.kKQ, paramb.vXs.kLn.kKV });
        if (bo.isNullOrNil(paramString.field_downloadUrl))
        {
          paramm = paramb.vXs.kLn.egm;
          paramm = com.tencent.mm.plugin.downloader.model.d.bij().Is(paramm);
          if ((paramm != null) && (paramm.id > 0L) && (paramm.status != 4))
          {
            ab.i("MicroMsg.GameSilentDownloader", "download task already exists");
            f.E(this.val$appId, 6, 0);
            ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().a(paramString, new String[0]);
            this.mZf.hO(false);
            AppMethodBeat.o(111537);
            break;
          }
        }
        paramString.field_downloadUrl = paramb.vXs.kLn.egm;
        paramString.field_size = paramb.vXs.kLn.kKP;
        paramString.field_md5 = paramb.vXs.kLn.kKQ;
        paramString.field_SecondaryUrl = paramb.vXs.kLn.kKV;
        if (!bo.isNullOrNil(paramb.vXs.kLn.kKO))
          paramString.field_packageName = paramb.vXs.kLn.kKO;
        paramString.field_downloadInWidget = paramb.vXs.kLr;
        ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().c(paramString, new String[0]);
      }
      if (!at.isWifi(ah.getContext()))
      {
        ab.i("MicroMsg.GameSilentDownloader", "cgi response back, but not in wifi");
      }
      else
      {
        paramInt1 = paramb.vXs.kLn.kKR;
        if ((paramString == null) || (bo.isNullOrNil(paramString.field_downloadUrl)))
        {
          ab.e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
        }
        else
        {
          ab.i("MicroMsg.GameSilentDownloader", "startDownload, appId:%s, url:%s, size:%d, md5:%s, packageName:%s, expireTime:%d, isFirst:%b, nextCheckTime:%d, isRunning:%b", new Object[] { paramString.field_appId, paramString.field_downloadUrl, Long.valueOf(paramString.field_size), paramString.field_md5, paramString.field_packageName, Long.valueOf(paramString.field_expireTime), Boolean.valueOf(paramString.field_isFirst), Long.valueOf(paramString.field_nextCheckTime), Boolean.valueOf(paramString.field_isRunning) });
          paramb = paramString.field_downloadUrl;
          paramb = com.tencent.mm.plugin.downloader.model.d.bij().Is(paramb);
          long l;
          if ((paramb != null) && (paramb.id > 0L) && (paramb.status == 2))
          {
            ab.i("MicroMsg.GameSilentDownloader", "resume downloadTask");
            l = paramb.id;
            com.tencent.mm.plugin.downloader.model.d.bij().kMV = true;
            com.tencent.mm.plugin.downloader.model.d.bij().ho(l);
          }
          else
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(858L, 9L, 1L, false);
            if (paramString.field_downloadInWidget)
              ((com.tencent.mm.plugin.downloader_app.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.downloader_app.a.d.class)).Iz(paramString.field_appId);
            paramb = new e.a();
            paramb.It(paramString.field_downloadUrl);
            paramb.Iu(paramString.field_SecondaryUrl);
            paramb.setAppId(paramString.field_appId);
            paramb.hA(paramString.field_size);
            paramb.cY(paramString.field_packageName);
            paramb.Iv(com.tencent.mm.pluginsdk.model.app.g.b(ah.getContext(), com.tencent.mm.pluginsdk.model.app.g.bT(paramString.field_appId, true), null));
            paramb.Iw(paramString.field_md5);
            paramb.ga(false);
            paramb.gb(false);
            paramb.tN(1);
            paramb.bir();
            paramb.setScene(7001);
            com.tencent.mm.plugin.downloader.model.d.bij().kMV = true;
            if (paramInt1 == 1);
            for (l = com.tencent.mm.plugin.downloader.model.d.bij().b(paramb.kNl); ; l = com.tencent.mm.plugin.downloader.model.d.bij().a(paramb.kNl))
            {
              ab.i("MicroMsg.GameSilentDownload.GameDownloadHelper", "add downloadTask id:%d, downloaderType:%d", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1) });
              break;
            }
            ab.i("MicroMsg.GameSilentDownloader", "delay, nextInterval:%d", new Object[] { Long.valueOf(paramb.vXr) });
            ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().H(this.val$appId, bo.anT() + paramb.vXr);
            this.mZf.hO(false);
            continue;
            f.E(this.val$appId, 5, 0);
            h.cancelDownload(this.val$appId);
            this.mZf.hO(false);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.h.2
 * JD-Core Version:    0.6.2
 */