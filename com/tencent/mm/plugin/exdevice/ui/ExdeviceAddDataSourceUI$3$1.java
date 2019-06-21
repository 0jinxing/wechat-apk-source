package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;

final class ExdeviceAddDataSourceUI$3$1
  implements DialogInterface.OnCancelListener
{
  ExdeviceAddDataSourceUI$3$1(ExdeviceAddDataSourceUI.3 param3)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(19771);
    aw.Rg().c(ExdeviceAddDataSourceUI.g(this.lyn.lyl));
    ExdeviceAddDataSourceUI.h(this.lyn.lyl);
    paramDialogInterface = ExdeviceAddDataSourceUI.c(this.lyn.lyl).KA(this.lyn.lym);
    if (paramDialogInterface != null)
      paramDialogInterface.lys = ExdeviceAddDataSourceUI.c.lyt;
    AppMethodBeat.o(19771);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.3.1
 * JD-Core Version:    0.6.2
 */