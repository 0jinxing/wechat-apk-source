package com.tencent.mm.plugin.exdevice.ui;

import android.location.LocationManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceAddDataSourceUI$4$1
  implements Runnable
{
  ExdeviceAddDataSourceUI$4$1(ExdeviceAddDataSourceUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19773);
    if ((ExdeviceAddDataSourceUI.a(this.lyo.lyl)) && (!ExdeviceAddDataSourceUI.b(this.lyo.lyl).isProviderEnabled("gps")))
    {
      ExdeviceAddDataSourceUI.a(this.lyo.lyl, 4);
      AppMethodBeat.o(19773);
    }
    while (true)
    {
      return;
      ExdeviceAddDataSourceUI.a(this.lyo.lyl, 3);
      ab.i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
      AppMethodBeat.o(19773);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.4.1
 * JD-Core Version:    0.6.2
 */