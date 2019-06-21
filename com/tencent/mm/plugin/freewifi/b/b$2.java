package com.tencent.mm.plugin.freewifi.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI;
import com.tencent.mm.sdk.platformtools.ah;

final class b$2
  implements Runnable
{
  b$2(b paramb, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20669);
    Intent localIntent = new Intent();
    localIntent.putExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Ssid", this.mvg);
    localIntent.putExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Bssid", this.mvh);
    localIntent.setClass(ah.getContext(), FreeWifiManufacturerLoadingUI.class);
    localIntent.addFlags(268435456);
    ah.getContext().startActivity(localIntent);
    AppMethodBeat.o(20669);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b.b.2
 * JD-Core Version:    0.6.2
 */