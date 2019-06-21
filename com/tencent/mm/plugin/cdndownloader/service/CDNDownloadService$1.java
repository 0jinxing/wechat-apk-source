package com.tencent.mm.plugin.cdndownloader.service;

import com.tencent.mars.BaseEvent;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.CdnTaskStateInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g;
import com.tencent.mm.ipcinvoker.wx_extension.b.b.a;
import com.tencent.mm.plugin.cdndownloader.a.a.a;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class CDNDownloadService$1 extends a.a
{
  CDNDownloadService$1(CDNDownloadService paramCDNDownloadService)
  {
  }

  public final boolean HA(String paramString)
  {
    AppMethodBeat.i(940);
    com.tencent.mm.plugin.cdndownloader.c.a.beU();
    boolean bool = com.tencent.mm.plugin.cdndownloader.c.a.HD(paramString);
    ab.i("MicroMsg.CDNDownloadService", "pauseDownloadTask: ".concat(String.valueOf(bool)));
    AppMethodBeat.o(940);
    return bool;
  }

  public final boolean HB(String paramString)
  {
    AppMethodBeat.i(941);
    com.tencent.mm.plugin.cdndownloader.c.a locala = com.tencent.mm.plugin.cdndownloader.c.a.beU();
    g localg = (g)locala.fyM.remove(paramString);
    if (localg != null)
    {
      if ((localg.field_fileType != com.tencent.mm.i.a.efP) && (localg.field_fileType != com.tencent.mm.i.a.efR))
        break label167;
      locala.afy();
      com.tencent.mm.al.a.rK(paramString);
    }
    while (true)
    {
      h.pYm.e(10769, new Object[] { Integer.valueOf(com.tencent.mm.al.c.fzg), Integer.valueOf(localg.field_fileType), Long.valueOf(bo.anU() - localg.field_startTime) });
      locala.fyL.remove(paramString);
      locala.fyN.remove(paramString);
      ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramString, localg, Integer.valueOf(0) });
      ab.i("MicroMsg.CDNDownloadService", "removeDownloadTask: true");
      AppMethodBeat.o(941);
      return true;
      label167: if (localg.egs)
      {
        locala.afy();
        com.tencent.mm.al.a.rL(paramString);
      }
      else
      {
        locala.afy();
        com.tencent.mm.al.a.rG(paramString);
      }
    }
  }

  public final CDNTaskState HC(String paramString)
  {
    AppMethodBeat.i(942);
    paramString = CdnLogic.httpMultiSocketDownloadTaskState(paramString);
    CDNTaskState localCDNTaskState = new CDNTaskState();
    if (paramString != null)
    {
      localCDNTaskState.taskState = paramString.taskState;
      localCDNTaskState.fileTotalSize = paramString.fileTotalSize;
      localCDNTaskState.completeSize = paramString.completeSize;
    }
    AppMethodBeat.o(942);
    return localCDNTaskState;
  }

  public final int a(CDNTaskInfo paramCDNTaskInfo)
  {
    AppMethodBeat.i(938);
    ab.i("MicroMsg.CDNDownloadService", "addDownloadTask: %s filepath:%s", new Object[] { paramCDNTaskInfo.downloadUrl, paramCDNTaskInfo.filePath });
    g localg = new g();
    localg.egs = paramCDNTaskInfo.egs;
    localg.field_mediaId = paramCDNTaskInfo.cHr;
    localg.field_fullpath = paramCDNTaskInfo.filePath;
    localg.egm = com.tencent.mm.plugin.downloader.a.c.Ij(paramCDNTaskInfo.downloadUrl);
    localg.egt = com.tencent.mm.plugin.downloader.a.c.Ij(paramCDNTaskInfo.ktq);
    localg.egl = CDNDownloadService.bfb();
    localg.egn = paramCDNTaskInfo.kts;
    localg.ego = paramCDNTaskInfo.ktt;
    localg.allow_mobile_net_download = paramCDNTaskInfo.ktu;
    localg.egr = paramCDNTaskInfo.ktv;
    CDNDownloadService.a(localg, paramCDNTaskInfo.ktr);
    int i = com.tencent.mm.plugin.cdndownloader.c.a.beU().f(localg);
    ab.i("MicroMsg.CDNDownloadService", "addDownloadTask: ".concat(String.valueOf(i)));
    AppMethodBeat.o(938);
    return i;
  }

  public final void a(com.tencent.mm.plugin.cdndownloader.a.b paramb)
  {
    AppMethodBeat.i(943);
    ab.i("MicroMsg.CDNDownloadService", "registerCallback");
    CDNDownloadService.c(paramb);
    AppMethodBeat.o(943);
  }

  public final int b(CDNTaskInfo paramCDNTaskInfo)
  {
    AppMethodBeat.i(939);
    ab.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: %s", new Object[] { paramCDNTaskInfo.downloadUrl });
    g localg = new g();
    localg.egs = paramCDNTaskInfo.egs;
    localg.field_mediaId = paramCDNTaskInfo.cHr;
    localg.field_fullpath = paramCDNTaskInfo.filePath;
    localg.egm = com.tencent.mm.plugin.downloader.a.c.Ij(paramCDNTaskInfo.downloadUrl);
    localg.egt = com.tencent.mm.plugin.downloader.a.c.Ij(paramCDNTaskInfo.ktq);
    localg.egl = CDNDownloadService.bfb();
    localg.egn = paramCDNTaskInfo.kts;
    localg.ego = paramCDNTaskInfo.ktt;
    localg.egr = paramCDNTaskInfo.ktv;
    localg.allow_mobile_net_download = paramCDNTaskInfo.ktu;
    CDNDownloadService.a(localg, paramCDNTaskInfo.ktr);
    paramCDNTaskInfo = com.tencent.mm.plugin.cdndownloader.c.a.beU();
    int i;
    if (paramCDNTaskInfo.fyM.containsKey(localg.field_mediaId))
    {
      i = CdnLogic.resumeHttpMultiSocketDownloadTask(localg.field_mediaId);
      ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task resume mediaid:%s, ret:%d", new Object[] { localg.field_mediaId, Integer.valueOf(i) });
    }
    while (true)
    {
      ab.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: ".concat(String.valueOf(i)));
      AppMethodBeat.o(939);
      return i;
      ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task add new mediaid:%s", new Object[] { localg.field_mediaId });
      i = paramCDNTaskInfo.f(localg);
    }
  }

  public final void b(com.tencent.mm.plugin.cdndownloader.a.b paramb)
  {
    AppMethodBeat.i(944);
    CDNDownloadService.c(null);
    AppMethodBeat.o(944);
  }

  public final void beR()
  {
    AppMethodBeat.i(946);
    if (!b.a.PZ().c(this.ktA))
    {
      ab.i("MicroMsg.CDNDownloadService", "addIPCTaskMarker");
      b.a.PZ().a(this.ktA);
    }
    AppMethodBeat.o(946);
  }

  public final void beS()
  {
    AppMethodBeat.i(947);
    ab.i("MicroMsg.CDNDownloadService", "removeIPCTaskMarker");
    b.a.PZ().b(this.ktA);
    AppMethodBeat.o(947);
  }

  public final void beT()
  {
  }

  public final void tr(int paramInt)
  {
    AppMethodBeat.i(945);
    ab.i("MicroMsg.CDNDownloadService", "notifyNetworkChange: ".concat(String.valueOf(paramInt)));
    BaseEvent.onNetworkChange();
    AppMethodBeat.o(945);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.1
 * JD-Core Version:    0.6.2
 */