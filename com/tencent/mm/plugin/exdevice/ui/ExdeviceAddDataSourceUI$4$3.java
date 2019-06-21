package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.e.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceAddDataSourceUI$4$3
  implements Runnable
{
  ExdeviceAddDataSourceUI$4$3(ExdeviceAddDataSourceUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19775);
    if (a.aVH())
    {
      ExdeviceAddDataSourceUI.a(this.lyo.lyl, 3);
      ab.i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
      AppMethodBeat.o(19775);
    }
    while (true)
    {
      return;
      ExdeviceAddDataSourceUI.a(this.lyo.lyl, 1);
      AppMethodBeat.o(19775);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.4.3
 * JD-Core Version:    0.6.2
 */