package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;

final class ExdeviceDeviceProfileUI$10
  implements DialogInterface.OnCancelListener
{
  ExdeviceDeviceProfileUI$10(ExdeviceDeviceProfileUI paramExdeviceDeviceProfileUI, m paramm)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(19947);
    aw.Rg().b(536, this.lAM);
    paramDialogInterface = new dc();
    paramDialogInterface.cwj.opType = 2;
    paramDialogInterface.cwj.cwn = this.crb;
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(19947);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.10
 * JD-Core Version:    0.6.2
 */