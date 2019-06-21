package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceAddDataSourceUI$11
  implements Runnable
{
  ExdeviceAddDataSourceUI$11(ExdeviceAddDataSourceUI paramExdeviceAddDataSourceUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19787);
    ExdeviceAddDataSourceUI.c(this.lyl).notifyDataSetChanged();
    AppMethodBeat.o(19787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.11
 * JD-Core Version:    0.6.2
 */