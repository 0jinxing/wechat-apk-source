package com.tencent.mm.plugin.d.a.c;

import android.bluetooth.BluetoothAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18476);
    if (a.b(this.jIB).isDiscovering())
      a.b(this.jIB).cancelDiscovery();
    AppMethodBeat.o(18476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.a.2
 * JD-Core Version:    0.6.2
 */