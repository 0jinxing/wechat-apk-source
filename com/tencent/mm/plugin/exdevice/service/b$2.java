package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements Runnable
{
  b$2(b paramb, int paramInt, r paramr, int[] paramArrayOfInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19540);
    if (!b.a(this.lww, this.lrv, this.lwx, this.lwy))
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.scanImp failed!!!");
    AppMethodBeat.o(19540);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.b.2
 * JD-Core Version:    0.6.2
 */