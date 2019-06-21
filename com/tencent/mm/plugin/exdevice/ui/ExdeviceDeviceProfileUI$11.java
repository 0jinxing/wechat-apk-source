package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.f;

final class ExdeviceDeviceProfileUI$11
  implements Runnable
{
  ExdeviceDeviceProfileUI$11(ExdeviceDeviceProfileUI paramExdeviceDeviceProfileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19948);
    ExdeviceDeviceProfileUI.a(this.lAM, true);
    ExdeviceDeviceProfileUI.f(this.lAM);
    this.lAM.yCw.notifyDataSetChanged();
    AppMethodBeat.o(19948);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.11
 * JD-Core Version:    0.6.2
 */