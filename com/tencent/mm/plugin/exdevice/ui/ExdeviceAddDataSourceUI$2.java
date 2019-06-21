package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ExdeviceAddDataSourceUI$2
  implements Runnable
{
  ExdeviceAddDataSourceUI$2(ExdeviceAddDataSourceUI paramExdeviceAddDataSourceUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19770);
    if ((ExdeviceAddDataSourceUI.f(this.lyl) != null) && (ExdeviceAddDataSourceUI.f(this.lyl).isShowing()))
      ExdeviceAddDataSourceUI.f(this.lyl).dismiss();
    AppMethodBeat.o(19770);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.2
 * JD-Core Version:    0.6.2
 */