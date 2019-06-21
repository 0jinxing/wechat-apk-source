package com.tencent.mm.plugin.downloader_app.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.downloader.model.FileDownloadPendingReceive;
import com.tencent.mm.plugin.downloader.model.FileDownloadService;
import com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static Map<String, Long> kOE;
  private static Map<String, Integer> kOF;
  private static Object lock;

  static
  {
    AppMethodBeat.i(136084);
    kOE = new HashMap();
    kOF = new HashMap();
    lock = new Object();
    AppMethodBeat.o(136084);
  }

  private static PendingIntent ID(String paramString)
  {
    AppMethodBeat.i(136083);
    Intent localIntent = new Intent(ah.getContext(), DownloadMainUI.class);
    localIntent.putExtra("appId", paramString);
    localIntent.putExtra("view_task", true);
    paramString = PendingIntent.getActivity(ah.getContext(), (int)System.currentTimeMillis(), localIntent, 0);
    AppMethodBeat.o(136083);
    return paramString;
  }

  private static void cancelNotification(String paramString)
  {
    AppMethodBeat.i(136082);
    synchronized (lock)
    {
      Integer localInteger = (Integer)kOF.get(paramString);
      if (localInteger == null)
      {
        ab.i("MicroMsg.DownloadNotificationManager", "No notification id found");
        AppMethodBeat.o(136082);
        return;
      }
      ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(localInteger.intValue());
      ab.i("MicroMsg.DownloadNotificationManager", "cancelNotification, id = ".concat(String.valueOf(localInteger)));
      kOF.remove(paramString);
      kOE.remove(paramString);
      AppMethodBeat.o(136082);
    }
  }

  public static void h(com.tencent.mm.plugin.downloader.f.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(136081);
    if (parama == null)
    {
      ab.e("MicroMsg.DownloadNotificationManager", "updateNotification failed: null task info");
      AppMethodBeat.o(136081);
    }
    while (true)
    {
      return;
      if (parama.field_fromDownloadApp)
        break;
      ab.i("MicroMsg.DownloadNotificationManager", "updateNotification not from download app");
      AppMethodBeat.o(136081);
    }
    if (parama.field_totalSize > 0L);
    for (int i = (int)(parama.field_downloadedSize * 100L / parama.field_totalSize); ; i = 0)
      while (true)
      {
        Object localObject1 = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id");
        Object localObject2 = (Long)kOE.get(parama.field_downloadUrl);
        ??? = localObject2;
        if (localObject2 == null)
        {
          ??? = Long.valueOf(System.currentTimeMillis());
          kOE.put(parama.field_downloadUrl, ???);
        }
        ((v.c)localObject1).j(((Long)???).longValue());
        ((v.c)localObject1).d(parama.field_fileName);
        switch (parama.field_status)
        {
        default:
          cancelNotification(parama.field_downloadUrl);
          AppMethodBeat.o(136081);
          break;
        case 1:
          ((v.c)localObject1).as(com.tencent.mm.bo.a.bWV());
          int j = i;
          if (i == 0)
            j = 1;
          if (j == 0)
            bool = true;
          ((v.c)localObject1).b(100, j, bool);
          if (parama.field_reserveInWifi)
          {
            ((v.c)localObject1).e(ah.getContext().getString(2131299780) + "·" + ah.getContext().getString(2131299778));
            ((v.c)localObject1).k(2, true);
            ((v.c)localObject1).EI = ID(parama.field_appId);
          }
        case 4:
        case 2:
        case 5:
        case 3:
          label283: synchronized (lock)
          {
            while (true)
            {
              localObject2 = (Integer)kOF.get(parama.field_downloadUrl);
              if (localObject2 != null)
                break label741;
              i = ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().c(((v.c)localObject1).build());
              kOF.put(parama.field_downloadUrl, Integer.valueOf(i));
              if (parama.field_status == 4)
              {
                kOF.remove(parama.field_downloadUrl);
                kOE.remove(parama.field_downloadUrl);
              }
              AppMethodBeat.o(136081);
              break;
              ((v.c)localObject1).e(ah.getContext().getString(2131299778));
              break label283;
              ((v.c)localObject1).as(com.tencent.mm.bo.a.bWV());
              ((v.c)localObject1).z(true);
              ((v.c)localObject1).EI = ID(parama.field_appId);
              if ((parama.field_errCode == com.tencent.mm.plugin.downloader.a.a.kKa) || (parama.field_errCode == com.tencent.mm.plugin.downloader.a.a.kJW))
                ((v.c)localObject1).e(ah.getContext().getString(2131301780));
              else
                ((v.c)localObject1).e(ah.getContext().getString(2131301779));
            }
            cancelNotification(parama.field_downloadUrl);
            AppMethodBeat.o(136081);
            break;
            cancelNotification(parama.field_downloadUrl);
            AppMethodBeat.o(136081);
            break;
            cancelNotification(parama.field_downloadUrl);
            Context localContext = ah.getContext();
            ??? = com.tencent.mm.bo.a.bt(localContext, "reminder_channel_id");
            ((v.c)???).d(parama.field_fileName);
            ((v.c)???).as(com.tencent.mm.bo.a.bWV());
            ((v.c)???).z(true);
            localObject1 = new Intent();
            localObject2 = ah.getContext();
            ((Intent)localObject1).setClass((Context)localObject2, FileDownloadPendingReceive.class);
            ((Intent)localObject1).putExtra(FileDownloadService.kNn, 3);
            ((Intent)localObject1).putExtra(FileDownloadService.kNo, parama.field_filePath);
            ((Intent)localObject1).putExtra(FileDownloadService.kNp, parama.field_md5);
            ((Intent)localObject1).putExtra("downloadId", parama.field_downloadId);
            ((v.c)???).EI = PendingIntent.getBroadcast((Context)localObject2, (int)System.currentTimeMillis(), (Intent)localObject1, 0);
            if (parama.field_reserveInWifi)
              ((v.c)???).e(localContext.getString(2131305878));
            while (true)
            {
              ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().c(((v.c)???).build());
              AppMethodBeat.o(136081);
              break;
              ((v.c)???).e(localContext.getString(2131299777));
            }
            label741: ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().notify(((Integer)localObject2).intValue(), ((v.c)localObject1).build());
          }
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.b
 * JD-Core Version:    0.6.2
 */