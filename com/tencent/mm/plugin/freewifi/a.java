package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a
{
  Lock aCZ;
  Activity activity;
  private WifiManager bJj;
  private BroadcastReceiver broadcastReceiver;
  Condition cbS;
  private long ftP;
  boolean mtC;
  boolean mtD;
  String ssid;

  public a(String paramString, Activity paramActivity)
  {
    AppMethodBeat.i(20557);
    this.mtC = false;
    this.mtD = false;
    this.activity = paramActivity;
    this.ftP = 15000L;
    this.ssid = paramString;
    this.aCZ = new ReentrantLock();
    this.cbS = this.aCZ.newCondition();
    this.bJj = ((WifiManager)ah.getContext().getSystemService("wifi"));
    AppMethodBeat.o(20557);
  }

  private void byc()
  {
    AppMethodBeat.i(20559);
    try
    {
      this.activity.unregisterReceiver(this.broadcastReceiver);
      AppMethodBeat.o(20559);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        AppMethodBeat.o(20559);
    }
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(20558);
    parama = new a.1(this, parama);
    if ((((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (this.ssid.equals(d.byO())))
    {
      parama.onSuccess();
      AppMethodBeat.o(20558);
    }
    while (true)
    {
      return;
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        parama = new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
        AppMethodBeat.o(20558);
        throw parama;
      }
      this.broadcastReceiver = new a.2(this);
      try
      {
        this.aCZ.lock();
        Object localObject = new android/content/IntentFilter;
        ((IntentFilter)localObject).<init>();
        ((IntentFilter)localObject).addAction("android.net.wifi.STATE_CHANGE");
        ((IntentFilter)localObject).addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.activity.registerReceiver(this.broadcastReceiver, (IntentFilter)localObject);
        int i;
        if (!this.bJj.isWifiEnabled())
        {
          localObject = new com/tencent/mm/plugin/freewifi/e;
          ((e)localObject).<init>(this.activity);
          i = ((e)localObject).bye();
          ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "enable ret = ".concat(String.valueOf(i)));
          if (i != 0)
          {
            parama.onFail(i);
            byc();
            this.aCZ.unlock();
            AppMethodBeat.o(20558);
          }
        }
        else
        {
          i = d.ME(this.ssid);
          if (i != 0)
          {
            byc();
            parama.onFail(i);
            byc();
            this.aCZ.unlock();
            AppMethodBeat.o(20558);
          }
          else
          {
            int j = 0;
            while (true)
            {
              try
              {
                if ((this.mtC) && (this.mtD))
                  break label484;
                l = System.currentTimeMillis();
                boolean bool = this.cbS.await(this.ftP, TimeUnit.MILLISECONDS);
                j = bool;
                if (!bool)
                  break label484;
                l = System.currentTimeMillis() - l;
                this.ftP -= l;
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>("costMillis=");
                ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", l + "; left timeout=" + this.ftP);
                if (this.ftP <= 0L)
                  break label476;
                l = this.ftP;
                this.ftP = l;
                j = bool;
                continue;
              }
              catch (InterruptedException localInterruptedException)
              {
                ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "sessionKey=%s, step=%d, desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { m.V(this.activity.getIntent()), Integer.valueOf(m.W(this.activity.getIntent())), localInterruptedException.getMessage() });
                parama.onFail(-17);
              }
              break;
              label476: long l = 3000L;
            }
            label484: if (j == 0)
              parama.onFail(-16);
            while (true)
            {
              byc();
              this.aCZ.unlock();
              AppMethodBeat.o(20558);
              break;
              parama.onSuccess();
            }
          }
        }
      }
      finally
      {
        byc();
        this.aCZ.unlock();
        AppMethodBeat.o(20558);
      }
    }
    throw parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.a
 * JD-Core Version:    0.6.2
 */