package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class y$4
  implements Runnable
{
  y$4(y paramy, int paramInt, j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19656);
    if (!y.b(this.lxl, this.lrv, this.lxm))
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp failed!!!");
    AppMethodBeat.o(19656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.y.4
 * JD-Core Version:    0.6.2
 */