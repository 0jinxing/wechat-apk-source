package com.tencent.mm.plugin.exdevice.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.e.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceBindDeviceGuideUI$4 extends BroadcastReceiver
{
  ExdeviceBindDeviceGuideUI$4(ExdeviceBindDeviceGuideUI paramExdeviceBindDeviceGuideUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(19814);
    ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Action broadcast receive...");
    if (paramIntent == null)
      AppMethodBeat.o(19814);
    while (true)
    {
      return;
      paramContext = paramIntent.getAction();
      ab.d("MicroMsg.ExdeviceBindDeviceGuideUI", "Receiver action(%s)", new Object[] { paramContext });
      int i;
      if (("android.bluetooth.adapter.action.STATE_CHANGED".equals(paramContext)) && (ExdeviceBindDeviceGuideUI.m(this.lyM)))
      {
        i = paramIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (i == 12)
        {
          if ((!ExdeviceBindDeviceGuideUI.o(this.lyM)) || (ExdeviceBindDeviceGuideUI.p(this.lyM).isProviderEnabled("gps")))
          {
            ExdeviceBindDeviceGuideUI.a(this.lyM, 2);
            AppMethodBeat.o(19814);
          }
        }
        else
        {
          if (i == 10)
            ExdeviceBindDeviceGuideUI.a(this.lyM, 3);
          AppMethodBeat.o(19814);
        }
      }
      else if (("android.net.wifi.WIFI_STATE_CHANGED".equals(paramContext)) && (ExdeviceBindDeviceGuideUI.n(this.lyM)))
      {
        i = paramIntent.getIntExtra("wifi_state", -1);
        ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Wifi state changed action: wifiState(%d)", new Object[] { Integer.valueOf(i) });
        if (i == 3)
        {
          ExdeviceBindDeviceGuideUI.a(this.lyM, 1);
          AppMethodBeat.o(19814);
        }
        else
        {
          if (i == 1)
            ExdeviceBindDeviceGuideUI.a(this.lyM, 5);
          AppMethodBeat.o(19814);
        }
      }
      else if ((ExdeviceBindDeviceGuideUI.o(this.lyM)) && ("android.location.MODE_CHANGED".equals(paramContext)))
      {
        if (ExdeviceBindDeviceGuideUI.p(this.lyM).isProviderEnabled("gps"))
        {
          if (!a.aVH())
          {
            ExdeviceBindDeviceGuideUI.a(this.lyM, 3);
            AppMethodBeat.o(19814);
          }
          else
          {
            ExdeviceBindDeviceGuideUI.a(this.lyM, 2);
            AppMethodBeat.o(19814);
          }
        }
        else
          ExdeviceBindDeviceGuideUI.a(this.lyM, 6);
      }
      else
      {
        AppMethodBeat.o(19814);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI.4
 * JD-Core Version:    0.6.2
 */