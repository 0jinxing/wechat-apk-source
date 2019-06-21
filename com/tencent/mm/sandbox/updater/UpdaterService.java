package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.app.v.c;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.service.MMService;
import com.tencent.mm.ui.MMActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@k
@JgClassChecked(author=20, fComment="checked", lastDate="20141015", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class UpdaterService extends MMService
{
  private static UpdaterService xxh = null;
  static final long xxj = 1800000L;
  private boolean caA;
  Map<Integer, a> xxi;
  private ap xxk;
  private UpdaterService.a xxl;

  public UpdaterService()
  {
    AppMethodBeat.i(28987);
    this.xxi = new HashMap();
    this.caA = false;
    this.xxk = new ap(new UpdaterService.1(this), true);
    this.xxl = null;
    AppMethodBeat.o(28987);
  }

  public static UpdaterService dnH()
  {
    return xxh;
  }

  private boolean dnI()
  {
    AppMethodBeat.i(28994);
    boolean bool;
    if (this.xxi.size() > 0)
    {
      Iterator localIterator = this.xxi.values().iterator();
      while (localIterator.hasNext())
        if (((a)localIterator.next()).isBusy())
        {
          ab.i("MicroMsg.UpdaterService", "checkAndTryStopSelf, dont stop, some download mgr still busy");
          bool = false;
          AppMethodBeat.o(28994);
        }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.UpdaterService", "checkAndTryStopSelf, UpdaterService killed self");
      al.n(new UpdaterService.2(this), 10000L);
      bool = true;
      AppMethodBeat.o(28994);
    }
  }

  public static void ev()
  {
    AppMethodBeat.i(28988);
    ab.i("MicroMsg.UpdaterService", "UpdaterService stopInstance()");
    if (xxh != null)
      xxh.dnI();
    AppMethodBeat.o(28988);
  }

  private void o(Intent paramIntent)
  {
    AppMethodBeat.i(28993);
    if (paramIntent == null)
      AppMethodBeat.o(28993);
    while (true)
    {
      return;
      int i = paramIntent.getIntExtra("intent_extra_download_type", 0);
      ab.i("MicroMsg.UpdaterService", "handleCommand, downloadType = %d", new Object[] { Integer.valueOf(i) });
      a locala = (a)this.xxi.get(Integer.valueOf(i));
      if (locala != null)
      {
        boolean bool = locala.aJ(paramIntent);
        ab.i("MicroMsg.UpdaterService", "handleCommand ret = %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          dnI();
      }
      AppMethodBeat.o(28993);
    }
  }

  public final IBinder Iu()
  {
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.UpdaterService";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(28989);
    super.onCreate();
    ab.i("MicroMsg.UpdaterService", "onCreate");
    c.l(hashCode(), this);
    xxh = this;
    this.xxi.put(Integer.valueOf(0), j.a.xxg);
    this.xxi.put(Integer.valueOf(1), d.dnn());
    this.xxi.put(Integer.valueOf(2), d.dnn());
    this.xxi.put(Integer.valueOf(4), k.a.xxn);
    this.xxi.put(Integer.valueOf(5), k.a.xxn);
    MMActivity.initLanguage(ah.getContext());
    Object localObject = this.xxk;
    long l = xxj;
    ((ap)localObject).ae(l, l);
    localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.net.conn.CONNECTIVITY_CHANGE");
    this.xxl = new UpdaterService.a();
    UpdaterService.a locala = this.xxl;
    this.xFe.registerReceiver(locala, (IntentFilter)localObject);
    AppMethodBeat.o(28989);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(28992);
    ab.i("MicroMsg.UpdaterService", "onDestroy");
    this.xxk.stopTimer();
    if (this.xxl != null);
    try
    {
      Object localObject = this.xxl;
      this.xFe.unregisterReceiver((BroadcastReceiver)localObject);
      if (this.caA)
        dqz();
      localObject = this.xxi.values().iterator();
      while (((Iterator)localObject).hasNext())
        ((a)((Iterator)localObject).next()).onDestroy();
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.UpdaterService", "unregisterReceiver(UpdaterService.ConnectivityReceiver) exception = %s", new Object[] { localException.getMessage() });
      this.xxi.clear();
      xxh = null;
      c.m(hashCode(), this);
      super.onDestroy();
      AppMethodBeat.o(28992);
    }
  }

  public final void onStart(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(28990);
    ab.i("MicroMsg.UpdaterService", "onStart intent = %s", new Object[] { paramIntent });
    o(paramIntent);
    AppMethodBeat.o(28990);
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(28991);
    ab.i("MicroMsg.UpdaterService", "onStartCommand intent = %s", new Object[] { paramIntent });
    if (paramIntent != null)
    {
      if (!paramIntent.getBooleanExtra("intent_extra_run_in_foreground", false))
        break label136;
      ab.i("MicroMsg.UpdaterService", "runServiceInForground");
      Object localObject = new Intent();
      PendingIntent localPendingIntent = PendingIntent.getService(ah.getContext(), 0, (Intent)localObject, 0);
      localObject = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g("updater service running forground").j(System.currentTimeMillis()).d("Updater Service").e("updater service running forground");
      ((v.c)localObject).EI = localPendingIntent;
      startForeground(0, ((v.c)localObject).build());
    }
    for (this.caA = true; ; this.caA = true)
    {
      label136: 
      do
      {
        o(paramIntent);
        AppMethodBeat.o(28991);
        return 2;
      }
      while ((Build.VERSION.SDK_INT >= 18) || (this.caA));
      startForeground(-1314, new Notification());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.UpdaterService
 * JD-Core Version:    0.6.2
 */