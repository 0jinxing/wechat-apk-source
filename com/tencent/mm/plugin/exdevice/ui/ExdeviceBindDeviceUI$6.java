package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;

final class ExdeviceBindDeviceUI$6
  implements Runnable
{
  ExdeviceBindDeviceUI$6(ExdeviceBindDeviceUI paramExdeviceBindDeviceUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19830);
    Java2CExDevice.stopScanWCLanDevice();
    Java2CExDevice.releaseWCLanDeviceLib();
    AppMethodBeat.o(19830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.6
 * JD-Core Version:    0.6.2
 */