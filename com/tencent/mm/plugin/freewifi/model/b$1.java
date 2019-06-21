package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1 extends BroadcastReceiver
{
  b$1(b paramb)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(20688);
    if (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"));
    while (true)
    {
      try
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "connChangedBroadcastReceiver");
        paramIntent = (NetworkInfo)paramIntent.getParcelableExtra("networkInfo");
        if (paramIntent == null)
        {
          ab.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo is null");
          AppMethodBeat.o(20688);
          return;
        }
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("networkInfo=");
        ab.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", paramIntent.toString() + "; networkInfo.isConnected()=%b, networkInfo.getState()=%s, networkInfo.getDetailedState()=%s, networkInfo.getExtraInfo()=%s, networkInfo.isConnectedOrConnecting()=%b, networkInfo.isAvailable()=%b, ", new Object[] { Boolean.valueOf(paramIntent.isConnected()), paramIntent.getState(), paramIntent.getDetailedState(), paramIntent.getExtraInfo(), Boolean.valueOf(paramIntent.isConnectedOrConnecting()), Boolean.valueOf(paramIntent.isAvailable()) });
        if (!paramIntent.isConnected())
        {
          ab.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "network is not connected.");
          AppMethodBeat.o(20688);
          continue;
        }
        if ((paramIntent.getType() != 0) && (paramIntent.getType() != 1))
        {
          ab.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "network type is not wifi or mobile.");
          AppMethodBeat.o(20688);
          continue;
        }
        if (paramContext == null)
        {
          ab.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "context is null.");
          AppMethodBeat.o(20688);
          continue;
        }
        if (paramIntent.getType() == 1)
        {
          localObject = m.Mv(m.Mx("MicroMsg.FreeWifi.FreeWifiConnChangedManager"));
          paramContext = m.My("MicroMsg.FreeWifi.FreeWifiConnChangedManager").toLowerCase();
          paramIntent = m.Mv(m.Mw(paramIntent.getExtraInfo()));
          ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo.getExtraInfo()=%s, wifiInfo.getSsid()=%s, wifiInfo.getBssid=%s", new Object[] { paramIntent, localObject, paramContext });
          if (!m.Mw(paramIntent).equals(localObject))
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "wifiManage ssid is not equal to networkInfo.getExtraInfo(). networkwork might changed. return.");
            AppMethodBeat.o(20688);
            continue;
          }
          if ((this.mvD.mvB.type == 1) && (m.Mw(this.mvD.mvB.ssid).equals(localObject)) && (m.Mw(this.mvD.mvB.bssid).equals(paramContext)))
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "Dulplicated intent.");
            AppMethodBeat.o(20688);
            continue;
          }
          paramIntent = new com/tencent/mm/plugin/freewifi/model/b$a;
          paramIntent.<init>((byte)0);
          paramIntent.mvE = System.currentTimeMillis();
          paramIntent.type = 1;
          paramIntent.ssid = ((String)localObject);
          paramIntent.bssid = paramContext;
          paramIntent.mvF = "";
          b.b(this.mvD.mvB.byG(), paramIntent);
          this.mvD.mvB = paramIntent;
          AppMethodBeat.o(20688);
          continue;
        }
        if (paramIntent.getType() == 0)
        {
          if ((this.mvD.mvB.type == 0) && (m.Mw(this.mvD.mvB.mvF).equals(m.Mw(paramIntent.getExtraInfo()))))
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "Dulplicated intent.");
            AppMethodBeat.o(20688);
            continue;
          }
          paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
          if (paramContext == null)
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "connManager is null.");
            AppMethodBeat.o(20688);
            continue;
          }
          paramContext = paramContext.getNetworkInfo(1);
          if (paramContext == null)
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi is null.");
            AppMethodBeat.o(20688);
            continue;
          }
          ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi.getState()=%s, networkInfoWifi.getDetailedState()=%s", new Object[] { paramContext.getState(), paramContext.getDetailedState() });
          if (paramContext.getDetailedState() != NetworkInfo.DetailedState.DISCONNECTED)
          {
            ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "It receives a type mobile connected event, but wifi network is not disconnected, so in fact user is probably switching wifi among ssids, not trying to connect to mobile network. ");
            AppMethodBeat.o(20688);
            continue;
          }
          paramContext = new com/tencent/mm/plugin/freewifi/model/b$a;
          paramContext.<init>((byte)0);
          paramContext.mvE = System.currentTimeMillis();
          paramContext.type = 0;
          paramContext.ssid = "";
          paramContext.bssid = "";
          paramContext.mvF = m.Mw(paramIntent.getExtraInfo());
          b.a(this.mvD.mvB.byG(), paramContext);
          this.mvD.mvB = paramContext;
          AppMethodBeat.o(20688);
          continue;
        }
        AppMethodBeat.o(20688);
        continue;
      }
      catch (Exception paramIntent)
      {
        paramContext = k.byo();
        paramContext.cuH = "UnExpectedException";
        paramContext.result = -1;
        paramContext.ehr = m.g(paramIntent);
        paramContext.byq().byp();
        ab.e("MicroMsg.FreeWifi.UnExcepctedException", m.h(paramIntent));
      }
      AppMethodBeat.o(20688);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.b.1
 * JD-Core Version:    0.6.2
 */