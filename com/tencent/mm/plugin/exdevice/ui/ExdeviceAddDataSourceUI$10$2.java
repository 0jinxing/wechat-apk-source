package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.model.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ExdeviceAddDataSourceUI$10$2
  implements DialogInterface.OnClickListener
{
  ExdeviceAddDataSourceUI$10$2(ExdeviceAddDataSourceUI.10 param10)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(19785);
    f.ao(this.lyq.lyl.mController.ylL, "https://hw.weixin.qq.com/steprank/step/connect-help.html");
    AppMethodBeat.o(19785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.10.2
 * JD-Core Version:    0.6.2
 */