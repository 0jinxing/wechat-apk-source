package com.tencent.mm.plugin.downloader.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a
  implements k
{
  private static Set<a.b> jfv;
  private static a kKh;
  private static BroadcastReceiver kKi;
  private static com.tencent.mm.sdk.b.c kKj;

  static
  {
    AppMethodBeat.i(2300);
    kKh = null;
    kKi = null;
    jfv = new CopyOnWriteArraySet();
    kKj = new a.1();
    AppMethodBeat.o(2300);
  }

  private static void D(int paramInt, long paramLong)
  {
    AppMethodBeat.i(2298);
    ab.i("MicroMsg.DownloadEventBus", "dispatch event = %d, id = %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if (locala == null)
      AppMethodBeat.o(2298);
    while (true)
    {
      return;
      Iterator localIterator = jfv.iterator();
      while (localIterator.hasNext())
        ((a.b)localIterator.next()).E(paramInt, locala.field_downloadId);
      AppMethodBeat.o(2298);
    }
  }

  public static void a(a.b paramb)
  {
    AppMethodBeat.i(2286);
    if (paramb != null)
      jfv.add(paramb);
    AppMethodBeat.o(2286);
  }

  public static void b(a.b paramb)
  {
    AppMethodBeat.i(2287);
    if (paramb != null)
      jfv.remove(paramb);
    AppMethodBeat.o(2287);
  }

  public static void bgr()
  {
    AppMethodBeat.i(2289);
    d.bij();
    com.tencent.mm.plugin.downloader.model.b.b(kKh);
    ah.getContext().unregisterReceiver(kKi);
    kKh = null;
    kKi = null;
    jfv.clear();
    com.tencent.mm.sdk.b.a.xxA.d(kKj);
    AppMethodBeat.o(2289);
  }

  public static void bie()
  {
    AppMethodBeat.i(2288);
    if (kKh == null)
      kKh = new a();
    if (kKi == null)
      kKi = new a((byte)0);
    d.bij();
    com.tencent.mm.plugin.downloader.model.b.a(kKh);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
    localIntentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
    localIntentFilter.addDataScheme("package");
    ah.getContext().registerReceiver(kKi, localIntentFilter);
    com.tencent.mm.sdk.b.a.xxA.c(kKj);
    AppMethodBeat.o(2288);
  }

  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(2292);
    D(5, paramLong);
    AppMethodBeat.o(2292);
  }

  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(2291);
    D(3, paramLong);
    AppMethodBeat.o(2291);
  }

  public final void gm(long paramLong)
  {
    AppMethodBeat.i(2295);
    D(6, paramLong);
    AppMethodBeat.o(2295);
  }

  public final void gn(long paramLong)
  {
    AppMethodBeat.i(2297);
    D(8, paramLong);
    AppMethodBeat.o(2297);
  }

  public final void i(long paramLong, String paramString)
  {
    AppMethodBeat.i(2296);
    D(7, paramLong);
    AppMethodBeat.o(2296);
  }

  public final void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(2294);
    D(2, paramLong);
    AppMethodBeat.o(2294);
  }

  public final void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(2293);
    D(4, paramLong);
    AppMethodBeat.o(2293);
  }

  public final void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(2290);
    D(1, paramLong);
    AppMethodBeat.o(2290);
  }

  static final class a extends BroadcastReceiver
  {
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      AppMethodBeat.i(2285);
      if ((paramContext == null) || (paramIntent == null))
        AppMethodBeat.o(2285);
      while (true)
      {
        return;
        paramContext = paramIntent.getAction();
        ab.i("MicroMsg.DownloadEventBus", paramContext);
        if (bo.isNullOrNil(paramContext))
        {
          ab.e("MicroMsg.DownloadEventBus", "action is null or nill, ignore");
          AppMethodBeat.o(2285);
        }
        else if ((!paramContext.equals("android.intent.action.PACKAGE_ADDED")) && (!paramContext.equals("android.intent.action.PACKAGE_REPLACED")))
        {
          AppMethodBeat.o(2285);
        }
        else
        {
          paramContext = "";
          try
          {
            paramIntent = paramIntent.getDataString();
            paramContext = paramIntent;
            ab.i("MicroMsg.DownloadEventBus", "get added package name : %s", new Object[] { paramContext });
            if (bo.isNullOrNil(paramContext))
            {
              ab.e("MicroMsg.DownloadEventBus", "get installed broadcast, while the package name is null or nil");
              AppMethodBeat.o(2285);
            }
          }
          catch (Exception paramIntent)
          {
            while (true)
              ab.e("MicroMsg.DownloadEventBus", "%s", new Object[] { bo.l(paramIntent) });
            paramIntent = paramContext;
            if (paramContext.startsWith("package:"))
              paramIntent = paramContext.substring(8);
            if ((!g.RK()) || (com.tencent.mm.kernel.a.QT()))
            {
              ab.e("MicroMsg.DownloadEventBus", "no user login");
              AppMethodBeat.o(2285);
            }
            else
            {
              paramContext = com.tencent.mm.plugin.downloader.model.c.XS();
              if (paramContext != null)
                break label221;
            }
          }
        }
      }
      paramContext = null;
      label208: label221: Cursor localCursor;
      while (true)
        if (paramContext == null)
        {
          AppMethodBeat.o(2285);
          break;
          if (bo.isNullOrNil(paramIntent))
          {
            ab.e("MicroMsg.FileDownloadInfoStorage", "Null or nil PakcageName");
            paramContext = null;
          }
          else
          {
            localCursor = paramContext.rawQuery("select * from FileDownloadInfo where packageName='" + paramIntent + "' order by downloadId desc limit 1", new String[0]);
            if (localCursor == null)
            {
              paramContext = null;
            }
            else
            {
              if (!localCursor.moveToFirst())
                break label334;
              paramIntent = new com.tencent.mm.plugin.downloader.f.a();
              paramIntent.d(localCursor);
            }
          }
        }
      while (true)
      {
        paramContext = paramIntent;
        if (localCursor == null)
          break label208;
        localCursor.close();
        paramContext = paramIntent;
        break label208;
        a.hk(paramContext.field_downloadId);
        AppMethodBeat.o(2285);
        break;
        label334: paramIntent = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.b.a
 * JD-Core Version:    0.6.2
 */