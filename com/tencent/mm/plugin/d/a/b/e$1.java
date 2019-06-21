package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.a.c;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;

final class e$1
  implements c.a
{
  e$1(e parame)
  {
  }

  public final void a(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18403);
    long l = b.KK(paramBluetoothDevice.getAddress());
    if (!this.jGm.jGj.contains(Long.valueOf(l)))
    {
      ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "------onDiscover------ device Name = %s, mac = %s(%d), scanRecord = %s", new Object[] { paramBluetoothDevice.getName(), paramBluetoothDevice.getAddress(), Long.valueOf(l), b.aN(paramArrayOfByte) });
      this.jGm.jGj.add(Long.valueOf(l));
      if (c.au(paramArrayOfByte))
        this.jGm.jGi.a(paramBluetoothDevice.getAddress(), paramBluetoothDevice.getName(), paramInt, paramArrayOfByte);
    }
    AppMethodBeat.o(18403);
  }

  public final void aVx()
  {
    AppMethodBeat.i(18404);
    ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "------onDiscoverFinished------");
    if (this.jGm.jGi != null)
      this.jGm.jGi.aVx();
    while (true)
    {
      this.jGm.jGj.clear();
      AppMethodBeat.o(18404);
      return;
      ab.w("MicroMsg.exdevice.BluetoothLESimpleManager", "no SimpleBLEManagerCallback");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.e.1
 * JD-Core Version:    0.6.2
 */