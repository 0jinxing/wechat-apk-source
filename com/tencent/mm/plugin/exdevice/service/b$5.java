package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$5
  implements Runnable
{
  b$5(b paramb, long paramLong, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19543);
    if (!b.a(this.lww, this.lwB, this.lwC))
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.sendDataImp failed!!!");
    AppMethodBeat.o(19543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.b.5
 * JD-Core Version:    0.6.2
 */