package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class ConnectSsidPasswordHelper$2 extends BroadcastReceiver
{
  public ConnectSsidPasswordHelper$2(c paramc)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(20566);
    if ("android.net.wifi.STATE_CHANGE".equals(paramIntent.getAction()))
    {
      paramContext = (NetworkInfo)paramIntent.getParcelableExtra("networkInfo");
      if (paramContext != null)
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "WifiManager.NETWORK_STATE_CHANGED_ACTION broadcastReceiver, targetssid=%s, Utils.getConnectedWifiSsid(TAG)=%s, networkInfo.isConnected()=%b, networkInfo.isConnectedOrConnecting()=%b, networkInfo.getExtraInfo()=%s, networkInfo.getType()=%d, networkInfo.toString()=%s", new Object[] { this.mtJ.ssid, m.Mx("MicroMsg.FreeWifi.ConnectSsidPasswordHelper"), Boolean.valueOf(paramContext.isConnected()), Boolean.valueOf(paramContext.isConnectedOrConnecting()), paramContext.getExtraInfo(), Integer.valueOf(paramContext.getType()), paramContext.toString() });
      if ((paramContext == null) || (!paramContext.isConnected()) || (paramContext.getType() != 1) || (!this.mtJ.ssid.equals(m.Mv(paramContext.getExtraInfo()))));
    }
    while (true)
    {
      try
      {
        this.mtJ.aCZ.lock();
        this.mtJ.connected = true;
        this.mtJ.mtH = false;
        this.mtJ.cbS.signalAll();
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "WifiManager connect successs! signal success!");
        return;
      }
      finally
      {
        this.mtJ.byc();
        this.mtJ.aCZ.unlock();
        AppMethodBeat.o(20566);
      }
      AppMethodBeat.o(20566);
      continue;
      if ("android.net.wifi.supplicant.STATE_CHANGE".equals(paramIntent.getAction()))
      {
        paramContext = (SupplicantState)paramIntent.getParcelableExtra("newState");
        switch (c.2.mtK[paramContext.ordinal()])
        {
        default:
          ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, Unknown");
          label359: if (paramIntent.getIntExtra("supplicantError", -1) != 1)
            break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        }
      }
      try
      {
        this.mtJ.aCZ.lock();
        this.mtJ.connected = false;
        this.mtJ.mtH = true;
        this.mtJ.cbS.signalAll();
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "WifiManager connect AUTHENTICATING error! signal error!");
        this.mtJ.byc();
        this.mtJ.aCZ.unlock();
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "ERROR_AUTHENTICATING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        AppMethodBeat.o(20566);
        continue;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, ASSOCIATED");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, ASSOCIATING");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, Authenticating...");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, Connected");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, Disconnected");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, DORMANT");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, FOUR_WAY_HANDSHAKE");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, GROUP_HANDSHAKE");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, INACTIVE");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, INTERFACE_DISABLED");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, INVALID");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, SCANNING");
        break label359;
        ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "SupplicantState, UNINITIALIZED");
      }
      finally
      {
        this.mtJ.byc();
        this.mtJ.aCZ.unlock();
        AppMethodBeat.o(20566);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ConnectSsidPasswordHelper.2
 * JD-Core Version:    0.6.2
 */