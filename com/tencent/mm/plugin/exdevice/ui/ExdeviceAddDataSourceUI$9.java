package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceAddDataSourceUI$9
  implements Runnable
{
  ExdeviceAddDataSourceUI$9(ExdeviceAddDataSourceUI paramExdeviceAddDataSourceUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19783);
    ExdeviceAddDataSourceUI.e(this.lyl).setVisibility(8);
    ExdeviceAddDataSourceUI.c(this.lyl).notifyDataSetChanged();
    AppMethodBeat.o(19783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.9
 * JD-Core Version:    0.6.2
 */