package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class b$2
  implements c.a
{
  b$2(b paramb)
  {
  }

  public final void a(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18365);
    ab.d("MicroMsg.exdevice.BluetoothLEManager", "------onDiscover------ device Name = %s, mac = %s(%d)", new Object[] { paramBluetoothDevice.getName(), paramBluetoothDevice.getAddress(), Long.valueOf(com.tencent.mm.plugin.exdevice.j.b.KK(paramBluetoothDevice.getAddress())) });
    this.jFH.mHandler.post(new b.2.1(this, paramBluetoothDevice, paramInt, paramArrayOfByte));
    AppMethodBeat.o(18365);
  }

  public final void aVx()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.b.2
 * JD-Core Version:    0.6.2
 */