package com.tencent.mm.plugin.downloader.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  private static BroadcastReceiver kNB = null;
  private static int kNC = -1;

  public static void bgr()
  {
    AppMethodBeat.i(2480);
    if (kNB != null);
    try
    {
      ah.getContext().unregisterReceiver(kNB);
      kNB = null;
      AppMethodBeat.o(2480);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.Downloader.NetWorkManager", localException.getMessage());
    }
  }

  public static void bie()
  {
    AppMethodBeat.i(2479);
    if (kNB == null)
      kNB = new a((byte)0);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    try
    {
      ah.getContext().registerReceiver(kNB, localIntentFilter);
      AppMethodBeat.o(2479);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Downloader.NetWorkManager", localException.getMessage());
        AppMethodBeat.o(2479);
      }
    }
  }

  static final class a extends BroadcastReceiver
  {
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      AppMethodBeat.i(2478);
      if ((!g.RK()) || (com.tencent.mm.kernel.a.QT()))
      {
        ab.e("MicroMsg.Downloader.NetWorkManager", "acc has not ready");
        AppMethodBeat.o(2478);
      }
      while (true)
      {
        return;
        int i = at.getNetType(ah.getContext());
        if (i == a.kNC)
        {
          AppMethodBeat.o(2478);
        }
        else
        {
          a.tO(i);
          ab.i("MicroMsg.Downloader.NetWorkManager", "onNetStateChange, netState = ".concat(String.valueOf(i)));
          Object localObject;
          long l;
          if (at.isWifi(i))
          {
            paramContext = c.XS();
            if (paramContext == null)
            {
              paramContext = null;
              if (paramContext != null)
                paramContext = paramContext.iterator();
            }
            else
            {
              while (true)
              {
                if (!paramContext.hasNext())
                  break label401;
                localObject = (com.tencent.mm.plugin.downloader.f.a)paramContext.next();
                ab.i("MicroMsg.Downloader.NetWorkManager", "resumeTask, appId = %s, state = %d", new Object[] { ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId, Integer.valueOf(((com.tencent.mm.plugin.downloader.f.a)localObject).field_status) });
                if (((com.tencent.mm.plugin.downloader.f.a)localObject).field_status == 2)
                {
                  paramIntent = d.bij();
                  l = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId;
                  localObject = c.hv(l);
                  if ((localObject != null) && (((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloaderType == 3))
                  {
                    paramIntent = paramIntent.bio();
                    com.tencent.mm.game.report.api.b.eBF.a(l, new com.tencent.mm.game.report.api.a(14));
                    paramIntent.n(l, true);
                    continue;
                    ab.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = ".concat(String.valueOf("select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1")));
                    localObject = paramContext.rawQuery("select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1", new String[0]);
                    paramIntent = new LinkedList();
                    paramContext = paramIntent;
                    if (localObject == null)
                      break;
                    while (((Cursor)localObject).moveToNext())
                    {
                      paramContext = new com.tencent.mm.plugin.downloader.f.a();
                      paramContext.d((Cursor)localObject);
                      paramIntent.add(paramContext);
                    }
                    ((Cursor)localObject).close();
                    paramContext = paramIntent;
                    break;
                  }
                  paramIntent = paramIntent.bin();
                  com.tencent.mm.game.report.api.b.eBF.a(l, new com.tencent.mm.game.report.api.a(14));
                  paramIntent.n(l, true);
                  continue;
                }
                if ((((com.tencent.mm.plugin.downloader.f.a)localObject).field_status == 0) && (((com.tencent.mm.plugin.downloader.f.a)localObject).field_reserveInWifi))
                {
                  paramIntent = d.bij();
                  if (((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloaderType == 3)
                    paramIntent.bio().a((com.tencent.mm.plugin.downloader.f.a)localObject);
                  else
                    paramIntent.bik().a((com.tencent.mm.plugin.downloader.f.a)localObject);
                }
              }
            }
            label401: AppMethodBeat.o(2478);
          }
          else
          {
            paramContext = c.bii();
            if (paramContext != null)
            {
              paramContext = paramContext.iterator();
              while (paramContext.hasNext())
              {
                localObject = (com.tencent.mm.plugin.downloader.f.a)paramContext.next();
                ab.i("MicroMsg.Downloader.NetWorkManager", "pauseTask, appId: " + ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId);
                paramIntent = d.bij();
                l = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId;
                localObject = c.hv(l);
                if ((localObject != null) && (((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloaderType == 3))
                {
                  paramIntent.bio().hq(l);
                }
                else
                {
                  paramIntent = paramIntent.bin();
                  com.tencent.mm.game.report.api.b.eBF.a(l, new com.tencent.mm.game.report.api.a(13));
                  paramIntent.hn(l);
                }
              }
            }
            AppMethodBeat.o(2478);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.e.a
 * JD-Core Version:    0.6.2
 */