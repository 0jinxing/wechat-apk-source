package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;

final class f$3
  implements Runnable
{
  f$3(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18422);
    ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Connected timeout!!!, mac=%s, name=%s", new Object[] { b.ie(f.g(this.jGA)), f.h(this.jGA).getName() });
    if (3 == f.e(this.jGA))
    {
      ab.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already disconnet or close, just leave");
      AppMethodBeat.o(18422);
    }
    while (true)
    {
      return;
      if (f.e(this.jGA) == 1)
      {
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already connected, just leave.");
        AppMethodBeat.o(18422);
      }
      else
      {
        this.jGA.aVB();
        AppMethodBeat.o(18422);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.f.3
 * JD-Core Version:    0.6.2
 */