package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceWCLanSDKUtil$5
  implements Runnable
{
  ExdeviceWCLanSDKUtil$5(ExdeviceWCLanSDKUtil paramExdeviceWCLanSDKUtil)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19288);
    ab.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "releaseWCLanDeviceLib...");
    Java2CExDevice.releaseWCLanDeviceLib();
    AppMethodBeat.o(19288);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil.5
 * JD-Core Version:    0.6.2
 */