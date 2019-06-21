package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.sport.a.d;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.p;

final class ExdeviceProfileUI$29$1
  implements DialogInterface.OnClickListener
{
  ExdeviceProfileUI$29$1(ExdeviceProfileUI.29 param29)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(20056);
    aw.ZK();
    paramDialogInterface = com.tencent.mm.model.c.XM().aoO(ExdeviceProfileUI.u(this.lCC.lCu));
    d.kT(37);
    t.g(paramDialogInterface);
    ExdeviceProfileUI.v(this.lCC.lCu).dnU();
    if (ExdeviceProfileUI.d(this.lCC.lCu) != null)
      ExdeviceProfileUI.d(this.lCC.lCu).show();
    AppMethodBeat.o(20056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.29.1
 * JD-Core Version:    0.6.2
 */