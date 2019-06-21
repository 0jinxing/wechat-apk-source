package com.tencent.mm.plugin.downloader;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.downloader.a.e;
import com.tencent.mm.plugin.downloader.model.FileDownloadService;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PluginDownloader extends f
  implements com.tencent.mm.kernel.api.c, e
{
  private static a kJK;

  private void resumeDownloadTaskWhenProcessRestart()
  {
    AppMethodBeat.i(2281);
    Object localObject1 = com.tencent.mm.plugin.downloader.model.c.XS();
    if (localObject1 == null)
    {
      localObject1 = null;
      if (!bo.ek((List)localObject1))
        localObject1 = ((LinkedList)localObject1).iterator();
    }
    else
    {
      while (true)
      {
        Object localObject3;
        long l;
        while (true)
        {
          if (!((Iterator)localObject1).hasNext())
            break label708;
          Object localObject2 = (com.tencent.mm.plugin.downloader.f.a)((Iterator)localObject1).next();
          localObject3 = com.tencent.mm.plugin.downloader.model.d.bij().hm(((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadId);
          if (((FileDownloadTaskInfo)localObject3).status == 3)
          {
            ab.i("MicroMsg.PluginDownloader", "has download finish");
            ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_finishTime = System.currentTimeMillis();
            ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadedSize = ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_totalSize;
            ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_status = 6;
            ab.i("MicroMsg.PluginDownloader", "download succeed, downloadedSize = %d, startSize = %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadedSize), Long.valueOf(((com.tencent.mm.plugin.downloader.f.a)localObject2).field_startSize) });
            com.tencent.mm.plugin.downloader.model.c.e((com.tencent.mm.plugin.downloader.f.a)localObject2);
            localObject3 = com.tencent.mm.plugin.downloader.model.d.bij();
            l = ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadId;
            if (((com.tencent.mm.plugin.downloader.model.d)localObject3).kMT != null)
              ((com.tencent.mm.plugin.downloader.model.d)localObject3).kMT.hu(l);
            localObject3 = new Intent();
            ((Intent)localObject3).putExtra(FileDownloadService.kNn, 1);
            ((Intent)localObject3).setClass(ah.getContext(), FileDownloadService.class);
            ((Intent)localObject3).putExtra(FileDownloadService.EXTRA_ID, ((com.tencent.mm.plugin.downloader.f.a)localObject2).field_downloadId);
            try
            {
              ah.getContext().startService((Intent)localObject3);
              h.pYm.a(710L, 12L, 1L, false);
              continue;
              ab.i("MicroMsg.FileDownloadInfoStorage", "getRunningDownloadInfos: select * from FileDownloadInfo where status=1");
              localObject2 = ((com.tencent.mm.plugin.downloader.f.b)localObject1).rawQuery("select * from FileDownloadInfo where status=1", new String[0]);
              if (localObject2 == null)
              {
                ab.i("MicroMsg.FileDownloadInfoStorage", "cursor is null");
                localObject1 = null;
                break;
              }
              localObject1 = new LinkedList();
              while (((Cursor)localObject2).moveToNext())
              {
                localObject3 = new com.tencent.mm.plugin.downloader.f.a();
                ((com.tencent.mm.plugin.downloader.f.a)localObject3).d((Cursor)localObject2);
                ((LinkedList)localObject1).add(localObject3);
              }
              ((Cursor)localObject2).close();
            }
            catch (Exception localException)
            {
              while (true)
                ab.e("MicroMsg.PluginDownloader", localException.getMessage());
            }
          }
        }
        if (((FileDownloadTaskInfo)localObject3).status != 1)
        {
          h.pYm.a(710L, 14L, 1L, false);
          ab.i("MicroMsg.PluginDownloader", "download fail, all process dead, appId: " + localException.field_appId);
          l = (System.currentTimeMillis() - localException.field_updateTime) / 1000L;
          ab.i("MicroMsg.PluginDownloader", "lastTime = ".concat(String.valueOf(l)));
          if (l <= 1800L)
          {
            boolean bool = ((com.tencent.mm.game.report.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.game.report.a.b.class)).a(a.a.lFS);
            ab.i("MicroMsg.PluginDownloader", "in half hour, net: %s, downloadInWifi: %b, expt: %b", new Object[] { at.getNetTypeString(ah.getContext()), Boolean.valueOf(((FileDownloadTaskInfo)localObject3).kNt), Boolean.valueOf(bool) });
            if (at.isWifi(ah.getContext()))
            {
              ab.i("MicroMsg.PluginDownloader", "in half hour, in wifi, restart");
              com.tencent.mm.plugin.downloader.model.d.bij().hp(localException.field_downloadId);
              h.pYm.a(710L, 15L, 1L, false);
            }
            else if ((!((FileDownloadTaskInfo)localObject3).kNt) && (bool))
            {
              ab.i("MicroMsg.PluginDownloader", "download not in wifi");
              com.tencent.mm.plugin.downloader.model.d.bij().hp(localException.field_downloadId);
              h.pYm.a(710L, 19L, 1L, false);
            }
            else
            {
              h.pYm.a(710L, 17L, 1L, false);
            }
          }
          else
          {
            while (true)
            {
              localException.field_finishTime = System.currentTimeMillis();
              localException.field_status = 4;
              localException.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJU;
              com.tencent.mm.plugin.downloader.model.c.e(localException);
              localObject3 = com.tencent.mm.plugin.downloader.model.d.bij();
              l = localException.field_downloadId;
              int i = localException.field_errCode;
              if (((com.tencent.mm.plugin.downloader.model.d)localObject3).kMT == null)
                break;
              ((com.tencent.mm.plugin.downloader.model.d)localObject3).kMT.d(l, i, false);
              break;
              h.pYm.a(710L, 16L, 1L, false);
              if (!at.isWifi(ah.getContext()))
                h.pYm.a(710L, 17L, 1L, false);
            }
          }
        }
        else
        {
          ab.i("MicroMsg.PluginDownloader", "download process alive, still downloading: " + localException.field_appId);
          h.pYm.a(710L, 13L, 1L, false);
        }
      }
    }
    label708: AppMethodBeat.o(2281);
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(2278);
    ab.d("MicroMsg.PluginDownloader", "execute");
    if (paramg.SG())
    {
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.downloader.a.d.class, new b());
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.cdndownloader.b.a.class, new com.tencent.mm.plugin.cdndownloader.a());
      paramg = new a(com.tencent.mm.plugin.downloader.model.a.kMy);
      kJK = paramg;
      paramg.startWatching();
    }
    AppMethodBeat.o(2278);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(2279);
    ab.i("MicroMsg.PluginDownloader", "onAccountInitialized");
    com.tencent.mm.plugin.downloader.e.a.bie();
    com.tencent.mm.plugin.cdndownloader.g.a.aNS().m(new PluginDownloader.1(this), 500L);
    com.tencent.mm.plugin.downloader.b.a.bie();
    AppMethodBeat.o(2279);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(2280);
    ab.i("MicroMsg.PluginDownloader", "onAccountRelease");
    com.tencent.mm.plugin.downloader.e.a.bgr();
    com.tencent.mm.plugin.downloader.b.a.bgr();
    com.tencent.mm.plugin.downloader.a.c.clearCache();
    AppMethodBeat.o(2280);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.PluginDownloader
 * JD-Core Version:    0.6.2
 */