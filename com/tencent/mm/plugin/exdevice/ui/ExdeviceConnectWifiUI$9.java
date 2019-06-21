package com.tencent.mm.plugin.exdevice.ui;

import android.net.wifi.WifiManager.MulticastLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class ExdeviceConnectWifiUI$9
  implements j.a
{
  ExdeviceConnectWifiUI$9(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final void g(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(19885);
    if ((paramInt != 0) || (paramArrayOfObject == null) || (paramArrayOfObject.length < 2) || (!(paramArrayOfObject[0] instanceof Integer)) || (!(paramArrayOfObject[1] instanceof Integer)))
      AppMethodBeat.o(19885);
    while (true)
    {
      return;
      paramInt = ((Integer)paramArrayOfObject[0]).intValue();
      int i = ((Integer)paramArrayOfObject[1]).intValue();
      if (ExdeviceConnectWifiUI.f(this.lAf).isHeld())
        ExdeviceConnectWifiUI.f(this.lAf).release();
      ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "AirKiss jni callback (%d, %d)", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      if ((paramInt == 0) && (i == 0))
      {
        al.d(new ExdeviceConnectWifiUI.9.1(this));
        AppMethodBeat.o(19885);
      }
      else
      {
        this.lAf.runOnUiThread(new ExdeviceConnectWifiUI.9.2(this));
        AppMethodBeat.o(19885);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.9
 * JD-Core Version:    0.6.2
 */