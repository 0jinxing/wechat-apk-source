package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class WiFiConnector$2 extends BroadcastReceiver
{
  public WiFiConnector$2(a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(94388);
    if (paramIntent == null)
      AppMethodBeat.o(94388);
    while (true)
    {
      return;
      paramContext = paramIntent.getAction();
      if (TextUtils.isEmpty(paramContext))
      {
        AppMethodBeat.o(94388);
        continue;
      }
      if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
      {
        paramIntent = this.idB.idx.getActiveNetworkInfo();
        paramContext = c.getConnectionInfo();
        if ((paramIntent != null) && (paramContext != null) && (paramIntent.getType() == 1) && (paramIntent.getDetailedState() == NetworkInfo.DetailedState.CONNECTED) && (paramContext.getNetworkId() == this.idB.idw.networkId))
        {
          this.idB.i(true, "");
          ab.i("MicroMsg.wifi_event", "CONNECTIVITY_ACTION CONNECTED.");
        }
        AppMethodBeat.o(94388);
        continue;
      }
      if ("android.net.wifi.supplicant.STATE_CHANGE".equals(paramContext));
      try
      {
        i = paramIntent.getIntExtra("supplicantError", -1);
        if (i == 1)
        {
          ab.e("MicroMsg.WiFiConnector", "ERROR_AUTHENTICATING");
          ab.i("MicroMsg.wifi_event", "ERROR_AUTHENTICATING FAIL.");
          paramIntent = this.idB;
          if (this.idB.idA)
          {
            paramContext = "wifi config may be expired";
            paramIntent.i(false, paramContext);
          }
        }
        else
        {
          AppMethodBeat.o(94388);
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.e("MicroMsg.WiFiConnector", paramContext.getMessage());
          int i = -1;
          continue;
          paramContext = "password error";
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.WiFiConnector.2
 * JD-Core Version:    0.6.2
 */