package com.tencent.mm.plugin.game.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class h
{
  static void cancelDownload(String paramString)
  {
    AppMethodBeat.i(111541);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(111541);
    while (true)
    {
      return;
      d locald = new d();
      locald.field_appId = paramString;
      boolean bool = ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().a(locald, new String[0]);
      ab.i("MicroMsg.GameSilentDownloader", "remove SilentDownload DB, appid:%s, ret:%b", new Object[] { paramString, Boolean.valueOf(bool) });
      if (bool)
      {
        paramString = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
        if ((paramString != null) && (paramString.id > 0L))
        {
          long l = paramString.id;
          com.tencent.mm.plugin.downloader.model.d.bij().hl(l);
          ab.i("MicroMsg.GameSilentDownloader", "remove download task, appid:%s", new Object[] { paramString.appId });
        }
      }
      AppMethodBeat.o(111541);
    }
  }

  public static void pauseDownload()
  {
    AppMethodBeat.i(111540);
    Object localObject1 = ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().bEZ();
    if (bo.ek((List)localObject1))
      AppMethodBeat.o(111540);
    while (true)
    {
      return;
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (d)((Iterator)localObject1).next();
        if (localObject2 != null)
          if (((d)localObject2).field_expireTime <= bo.anT())
          {
            ab.i("MicroMsg.GameSilentDownloader", "pauseDownload, task expire time, appId:%s", new Object[] { ((d)localObject2).field_appId });
            f.Oa(((d)localObject2).field_appId);
            cancelDownload(((d)localObject2).field_appId);
          }
          else
          {
            localObject2 = ((d)localObject2).field_appId;
            localObject2 = com.tencent.mm.plugin.downloader.model.d.bij().Ir((String)localObject2);
            if ((localObject2 != null) && (((FileDownloadTaskInfo)localObject2).id > 0L) && (((FileDownloadTaskInfo)localObject2).status == 1))
            {
              boolean bool = b.hn(((FileDownloadTaskInfo)localObject2).id);
              ab.i("MicroMsg.GameSilentDownloader", "pauseDownload, appid:%s, ret:%b", new Object[] { ((FileDownloadTaskInfo)localObject2).appId, Boolean.valueOf(bool) });
            }
          }
      }
      AppMethodBeat.o(111540);
    }
  }

  public final void hO(boolean paramBoolean)
  {
    AppMethodBeat.i(111539);
    d locald = ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().bEY();
    if (locald == null)
    {
      ab.i("MicroMsg.GameSilentDownloader", "silentDownload witch can check is empty!");
      AppMethodBeat.o(111539);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.GameSilentDownloader", "[appid:%s] in DB to check download", new Object[] { locald.field_appId });
      if (locald.field_expireTime <= bo.anT())
      {
        ab.i("MicroMsg.GameSilentDownloader", "task expire time, appId:%s", new Object[] { locald.field_appId });
        f.Oa(locald.field_appId);
        cancelDownload(locald.field_appId);
        paramBoolean = false;
        break;
      }
      if (!at.isWifi(ah.getContext()))
      {
        ab.i("MicroMsg.GameSilentDownloader", "NetType is not WIFI");
        AppMethodBeat.o(111539);
      }
      else
      {
        ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().Oc(locald.field_appId);
        com.tencent.mm.kernel.g.RQ();
        if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
        {
          ab.i("MicroMsg.GameSilentDownloader", "sdcard isnt available");
          AppMethodBeat.o(111539);
        }
        else
        {
          ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().Od(locald.field_appId);
          if ((locald.field_size > 0L) && (!com.tencent.mm.compatible.util.f.eW(locald.field_size)))
          {
            ab.i("MicroMsg.GameSilentDownloader", "sdcard dont have enough space");
            AppMethodBeat.o(111539);
          }
          else
          {
            ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().Oe(locald.field_appId);
            ab.i("MicroMsg.GameSilentDownloader", "fromBattery：%b", new Object[] { Boolean.valueOf(paramBoolean) });
            if (paramBoolean)
              break label387;
            a.a locala = a.bEX();
            ab.i("MicroMsg.GameSilentDownloader", "battery isCharging:%b  percent:%f", new Object[] { Boolean.valueOf(locala.iSd), Float.valueOf(locala.mYY) });
            if ((locala.iSd) || (locala.mYY >= 0.2D))
              break label345;
            ab.i("MicroMsg.GameSilentDownloader", "battery is low");
            AppMethodBeat.o(111539);
          }
        }
      }
    }
    label345: ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().Of(locald.field_appId);
    while (true)
    {
      com.tencent.mm.ce.a.post(new h.1(this, locald));
      AppMethodBeat.o(111539);
      break;
      label387: ((c)com.tencent.mm.kernel.g.K(c.class)).bDa().Of(locald.field_appId);
    }
  }

  public static final class a
  {
    private static h mZh;

    static
    {
      AppMethodBeat.i(111538);
      mZh = new h((byte)0);
      AppMethodBeat.o(111538);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.h
 * JD-Core Version:    0.6.2
 */