package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class FreeWifiNetworkReceiver extends BroadcastReceiver
{
  public FreeWifiNetworkReceiver.b mvX;
  public FreeWifiNetworkReceiver.a mvY;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(20729);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.FreeWifi.WifiStateChangedReceiver", "intent is null");
      AppMethodBeat.o(20729);
    }
    while (true)
    {
      return;
      paramContext = paramIntent.getAction();
      ab.i("MicroMsg.FreeWifi.WifiStateChangedReceiver", "FreeWifiNetworkReceiver action : %s", new Object[] { paramContext });
      if (bo.isNullOrNil(paramContext))
      {
        ab.e("MicroMsg.FreeWifi.WifiStateChangedReceiver", "action is null");
        AppMethodBeat.o(20729);
      }
      else if (paramContext.equals("android.net.wifi.WIFI_STATE_CHANGED"))
      {
        int i = paramIntent.getIntExtra("wifi_state", 0);
        ab.i("MicroMsg.FreeWifi.WifiStateChangedReceiver", "now wifi state : %d", new Object[] { Integer.valueOf(i) });
        if (this.mvX != null)
          this.mvX.vS(i);
        AppMethodBeat.o(20729);
      }
      else
      {
        if (paramContext.equals("android.net.wifi.STATE_CHANGE"))
        {
          paramContext = paramIntent.getParcelableExtra("networkInfo");
          if (paramContext != null)
          {
            paramContext = (NetworkInfo)paramContext;
            if ((paramContext != null) && (this.mvY != null))
              this.mvY.a(paramContext.getState());
          }
        }
        AppMethodBeat.o(20729);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver
 * JD-Core Version:    0.6.2
 */