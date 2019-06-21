package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.base.h;

final class ExdeviceDeviceProfileUI$4
  implements Runnable
{
  ExdeviceDeviceProfileUI$4(ExdeviceDeviceProfileUI paramExdeviceDeviceProfileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19939);
    ExdeviceDeviceProfileUI localExdeviceDeviceProfileUI = this.lAM;
    this.lAM.getString(2131297061);
    new ap(new ExdeviceDeviceProfileUI.4.1(this, h.b(localExdeviceDeviceProfileUI, this.lAM.getString(2131299275), false, null)), false).ae(1000L, 1000L);
    AppMethodBeat.o(19939);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.4
 * JD-Core Version:    0.6.2
 */