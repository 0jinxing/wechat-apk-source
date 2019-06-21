package com.tencent.mm.plugin.exdevice.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.e.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.e;
import com.tencent.mm.plugin.exdevice.model.h;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceAddDataSourceUI$4 extends BroadcastReceiver
{
  ExdeviceAddDataSourceUI$4(ExdeviceAddDataSourceUI paramExdeviceAddDataSourceUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(19777);
    if (paramIntent == null)
    {
      ab.i("MicroMsg.ExdeviceAddDataSourceUI", "Receive action broadcast failed...");
      AppMethodBeat.o(19777);
    }
    while (true)
    {
      return;
      paramContext = paramIntent.getAction();
      if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(paramContext))
      {
        if (paramIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", -2147483648) != 12)
          break label177;
        if (a.aVH())
        {
          this.lyl.runOnUiThread(new ExdeviceAddDataSourceUI.4.1(this));
          if ((!ExdeviceAddDataSourceUI.a(this.lyl)) || (ExdeviceAddDataSourceUI.b(this.lyl).isProviderEnabled("gps")))
          {
            ad.bph();
            e.boJ();
          }
        }
      }
      while (true)
        if ((ExdeviceAddDataSourceUI.a(this.lyl)) && ("android.location.MODE_CHANGED".equals(paramContext)))
        {
          if (ExdeviceAddDataSourceUI.b(this.lyl).isProviderEnabled("gps"))
          {
            this.lyl.runOnUiThread(new ExdeviceAddDataSourceUI.4.3(this));
            if (!a.aVH())
              break label241;
            ad.bph();
            e.boJ();
            AppMethodBeat.o(19777);
            break;
            label177: if ((paramIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", -2147483648) != 10) || (a.aVH()))
              continue;
            this.lyl.runOnUiThread(new ExdeviceAddDataSourceUI.4.2(this));
            ad.bpi().stopScan();
            continue;
          }
          this.lyl.runOnUiThread(new ExdeviceAddDataSourceUI.4.4(this));
          ad.bpi().stopScan();
        }
      label241: AppMethodBeat.o(19777);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.4
 * JD-Core Version:    0.6.2
 */