package com.tencent.mm.plugin.d.a.a;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$9
  implements Runnable
{
  f$9(f paramf, int paramInt, BluetoothDevice paramBluetoothDevice, e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18342);
    f.d(this.jFf).a(this.jFi, this.jFl.getAddress(), this.jFk);
    AppMethodBeat.o(18342);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.f.9
 * JD-Core Version:    0.6.2
 */