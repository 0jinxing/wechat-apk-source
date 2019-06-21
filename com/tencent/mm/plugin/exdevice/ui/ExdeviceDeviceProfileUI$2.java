package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ExdeviceDeviceProfileUI$2
  implements Runnable
{
  ExdeviceDeviceProfileUI$2(ExdeviceDeviceProfileUI paramExdeviceDeviceProfileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19935);
    if ((ExdeviceDeviceProfileUI.g(this.lAM) != null) && (ExdeviceDeviceProfileUI.g(this.lAM).isShowing()))
      ExdeviceDeviceProfileUI.g(this.lAM).dismiss();
    if ((ExdeviceDeviceProfileUI.h(this.lAM) != null) && (ExdeviceDeviceProfileUI.h(this.lAM).isShowing()))
      ExdeviceDeviceProfileUI.h(this.lAM).dismiss();
    AppMethodBeat.o(19935);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.2
 * JD-Core Version:    0.6.2
 */