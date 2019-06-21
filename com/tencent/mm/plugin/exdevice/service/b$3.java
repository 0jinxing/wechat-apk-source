package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$3
  implements Runnable
{
  b$3(b paramb, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19541);
    if (!b.a(this.lww, this.lrv))
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.stopScanImp failed!!!");
    AppMethodBeat.o(19541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.b.3
 * JD-Core Version:    0.6.2
 */