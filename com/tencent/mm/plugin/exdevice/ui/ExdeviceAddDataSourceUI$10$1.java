package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ExdeviceAddDataSourceUI$10$1
  implements DialogInterface.OnClickListener
{
  ExdeviceAddDataSourceUI$10$1(ExdeviceAddDataSourceUI.10 param10)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(19784);
    ExdeviceAddDataSourceUI.d(this.lyq.lyl).remove(this.lyq.lyp);
    ExdeviceAddDataSourceUI.c(this.lyq.lyl).bw(ExdeviceAddDataSourceUI.d(this.lyq.lyl));
    ExdeviceAddDataSourceUI.c(this.lyq.lyl).notifyDataSetChanged();
    AppMethodBeat.o(19784);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.10.1
 * JD-Core Version:    0.6.2
 */