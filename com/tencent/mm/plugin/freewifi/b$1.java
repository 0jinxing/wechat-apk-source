package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class b$1 extends BroadcastReceiver
{
  b$1(b paramb)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(20560);
    if (paramIntent.getAction().equals("android.net.wifi.STATE_CHANGE"))
    {
      paramContext = (NetworkInfo)paramIntent.getParcelableExtra("networkInfo");
      if (paramContext != null)
        ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "WifiManager.NETWORK_STATE_CHANGED_ACTION broadcastReceiver, targetssid=%s, Utils.getConnectedWifiSsid(TAG)=%s,networkInfo.isConnected()=%b, networkInfo.isConnectedOrConnecting()=%b, networkInfo.getExtraInfo()=%s, networkInfo.getType()=%d, networkInfo.toString()=%s", new Object[] { this.mtG.ssid, m.Mx("MicroMsg.FreeWifi.ConnectNetworkHelper"), Boolean.valueOf(paramContext.isConnected()), Boolean.valueOf(paramContext.isConnectedOrConnecting()), paramContext.getExtraInfo(), Integer.valueOf(paramContext.getType()), paramContext.toString() });
      if ((paramContext == null) || (!paramContext.isConnected()) || (paramContext.getType() != 1) || (!this.mtG.ssid.equals(m.Mv(paramContext.getExtraInfo()))));
    }
    while (true)
    {
      try
      {
        this.mtG.aCZ.lock();
        this.mtG.mtC = true;
        ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "WifiManager.NETWORK_STATE_CHANGED_ACTION broadcastreceiver signal connected state.");
        this.mtG.cbS.signalAll();
        return;
      }
      finally
      {
        this.mtG.aCZ.unlock();
        AppMethodBeat.o(20560);
      }
      AppMethodBeat.o(20560);
      continue;
      if (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
      {
        paramContext = (NetworkInfo)paramIntent.getParcelableExtra("networkInfo");
        if (paramContext != null)
          ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "ConnectivityManager.CONNECTIVITY_ACTION broadcastReceiver, targetssid=%s, Utils.getConnectedWifiSsid(TAG)=%s,networkInfo.isConnected()=%b, networkInfo.isConnectedOrConnecting()=%b, networkInfo.getExtraInfo()=%s, networkInfo.getType()=%d, networkInfo.toString()=%s", new Object[] { this.mtG.ssid, m.Mx("MicroMsg.FreeWifi.ConnectNetworkHelper"), Boolean.valueOf(paramContext.isConnected()), Boolean.valueOf(paramContext.isConnectedOrConnecting()), paramContext.getExtraInfo(), Integer.valueOf(paramContext.getType()), paramContext.toString() });
        if ((paramContext == null) || (!paramContext.isConnected()) || (paramContext.getType() != 1) || (!this.mtG.ssid.equals(m.Mv(paramContext.getExtraInfo()))));
      }
      try
      {
        this.mtG.aCZ.lock();
        this.mtG.mtD = true;
        ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "ConnectivityManager.CONNECTIVITY_ACTION broadcastreceiver signal connected state.");
        this.mtG.cbS.signalAll();
        this.mtG.aCZ.unlock();
        AppMethodBeat.o(20560);
      }
      finally
      {
        this.mtG.aCZ.unlock();
        AppMethodBeat.o(20560);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b.1
 * JD-Core Version:    0.6.2
 */