package com.tencent.mm.plugin.freewifi;

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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class b
{
  Lock aCZ;
  private WifiManager bJj;
  private BroadcastReceiver broadcastReceiver;
  Condition cbS;
  private Context context;
  private long ftP;
  boolean mtC;
  boolean mtD;
  String ssid;

  public b(String paramString, Context paramContext)
  {
    AppMethodBeat.i(20561);
    this.mtC = false;
    this.mtD = false;
    this.ftP = 15000L;
    this.ssid = paramString;
    this.aCZ = new ReentrantLock();
    this.cbS = this.aCZ.newCondition();
    this.bJj = ((WifiManager)paramContext.getSystemService("wifi"));
    this.context = paramContext;
    AppMethodBeat.o(20561);
  }

  private void byc()
  {
    AppMethodBeat.i(20563);
    try
    {
      this.context.unregisterReceiver(this.broadcastReceiver);
      AppMethodBeat.o(20563);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        AppMethodBeat.o(20563);
    }
  }

  public final int byd()
  {
    AppMethodBeat.i(20562);
    int i;
    if ((((ConnectivityManager)this.context.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (this.ssid.equals(d.byO())))
    {
      AppMethodBeat.o(20562);
      i = 0;
    }
    while (true)
    {
      return i;
      Object localObject1;
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        localObject1 = new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
        AppMethodBeat.o(20562);
        throw ((Throwable)localObject1);
      }
      this.broadcastReceiver = new b.1(this);
      try
      {
        this.aCZ.lock();
        localObject1 = new android/content/IntentFilter;
        ((IntentFilter)localObject1).<init>();
        ((IntentFilter)localObject1).addAction("android.net.wifi.STATE_CHANGE");
        ((IntentFilter)localObject1).addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.context.registerReceiver(this.broadcastReceiver, (IntentFilter)localObject1);
        if (!this.bJj.isWifiEnabled())
        {
          localObject1 = new com/tencent/mm/plugin/freewifi/f;
          ((f)localObject1).<init>(this.context);
          i = ((f)localObject1).bye();
          ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "enable ret = ".concat(String.valueOf(i)));
          if (i != 0)
          {
            byc();
            this.aCZ.unlock();
            AppMethodBeat.o(20562);
            continue;
          }
        }
        i = d.ME(this.ssid);
        if (i != 0)
        {
          byc();
          byc();
          this.aCZ.unlock();
          AppMethodBeat.o(20562);
          continue;
        }
        boolean bool1 = false;
        boolean bool2;
        while (true)
        {
          try
          {
            if (this.mtC)
            {
              bool2 = bool1;
              if (this.mtD)
                break label419;
            }
            l = System.currentTimeMillis();
            bool1 = this.cbS.await(this.ftP, TimeUnit.MILLISECONDS);
            bool2 = bool1;
            if (!bool1)
              break label419;
            l = System.currentTimeMillis() - l;
            this.ftP -= l;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("costMillis=");
            ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", l + "; left timeout=" + this.ftP);
            if (this.ftP <= 0L)
              break label411;
            l = this.ftP;
            this.ftP = l;
            continue;
          }
          catch (InterruptedException localInterruptedException)
          {
            ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { localInterruptedException.getMessage() });
            byc();
            this.aCZ.unlock();
            i = -17;
            AppMethodBeat.o(20562);
          }
          break;
          label411: long l = 3000L;
        }
        label419: if (!bool2)
        {
          byc();
          this.aCZ.unlock();
          i = -16;
          AppMethodBeat.o(20562);
          continue;
        }
        byc();
        this.aCZ.unlock();
        AppMethodBeat.o(20562);
        i = 0;
      }
      finally
      {
        byc();
        this.aCZ.unlock();
        AppMethodBeat.o(20562);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b
 * JD-Core Version:    0.6.2
 */