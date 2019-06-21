package com.tencent.mm.plugin.freewifi.e;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.ConnectSsidPasswordHelper.2;
import com.tencent.mm.plugin.freewifi.c;
import com.tencent.mm.plugin.freewifi.c.1;
import com.tencent.mm.plugin.freewifi.c.a;
import com.tencent.mm.plugin.freewifi.e;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class f$1
  implements Runnable
{
  f$1(f paramf, c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20809);
    Object localObject1 = this.mwI;
    c.1 local1 = new c.1((c)localObject1, new f.1.1(this));
    if ((((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (((c)localObject1).ssid.equals(d.byO())))
    {
      local1.onSuccess();
      AppMethodBeat.o(20809);
      return;
    }
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      localObject1 = new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
      AppMethodBeat.o(20809);
      throw ((Throwable)localObject1);
    }
    ((c)localObject1).broadcastReceiver = new ConnectSsidPasswordHelper.2((c)localObject1);
    Object localObject3 = new IntentFilter();
    ((IntentFilter)localObject3).addAction("android.net.wifi.STATE_CHANGE");
    ((IntentFilter)localObject3).addAction("android.net.wifi.supplicant.STATE_CHANGE");
    while (true)
    {
      boolean bool;
      try
      {
        while (true)
        {
          ((c)localObject1).aCZ.lock();
          ((c)localObject1).activity.registerReceiver(((c)localObject1).broadcastReceiver, (IntentFilter)localObject3);
          if (!((c)localObject1).bJj.isWifiEnabled())
          {
            localObject3 = new com/tencent/mm/plugin/freewifi/e;
            ((e)localObject3).<init>(((c)localObject1).activity);
            i = ((e)localObject3).bye();
            ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "enable ret = ".concat(String.valueOf(i)));
            if (i != 0)
            {
              local1.onFail(i);
              ((c)localObject1).byc();
              ((c)localObject1).aCZ.unlock();
              AppMethodBeat.o(20809);
              break;
            }
          }
          int i = d.c(((c)localObject1).ssid, ((c)localObject1).gDC, 3, false);
          if (i != 0)
          {
            ((c)localObject1).byc();
            local1.onFail(i);
            ((c)localObject1).byc();
            ((c)localObject1).aCZ.unlock();
            AppMethodBeat.o(20809);
            break;
          }
          try
          {
            if ((((c)localObject1).connected) || (((c)localObject1).mtH))
              break label492;
            bool = ((c)localObject1).cbS.await(((c)localObject1).ftP, TimeUnit.MILLISECONDS);
            if (bool)
              break label436;
            local1.onFail(-16);
          }
          catch (InterruptedException localInterruptedException)
          {
            ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "sessionKey=%s, step=%d, desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { m.V(((c)localObject1).activity.getIntent()), Integer.valueOf(m.W(((c)localObject1).activity.getIntent())), localInterruptedException.getMessage() });
            local1.onFail(-17);
          }
        }
        break;
        label436: if (((c)localObject1).connected)
        {
          local1.onSuccess();
          continue;
        }
      }
      finally
      {
        ((c)localObject1).byc();
        ((c)localObject1).aCZ.unlock();
        AppMethodBeat.o(20809);
      }
      if (((c)localObject1).mtH)
      {
        localObject2.onFail(-18);
        continue;
        label492: bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.f.1
 * JD-Core Version:    0.6.2
 */