package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ab;

final class g$8
  implements Runnable
{
  g$8(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19258);
    ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "releaseWCLanDeviceLib...");
    Java2CExDevice.releaseWCLanDeviceLib();
    AppMethodBeat.o(19258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g.8
 * JD-Core Version:    0.6.2
 */