package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceAddDataSourceUI$8
  implements Runnable
{
  ExdeviceAddDataSourceUI$8(ExdeviceAddDataSourceUI paramExdeviceAddDataSourceUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19782);
    ExdeviceAddDataSourceUI.c(this.lyl).bw(ExdeviceAddDataSourceUI.d(this.lyl));
    ExdeviceAddDataSourceUI.c(this.lyl).notifyDataSetChanged();
    AppMethodBeat.o(19782);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.8
 * JD-Core Version:    0.6.2
 */