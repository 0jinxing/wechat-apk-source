package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class c$2
  implements Runnable
{
  c$2(c paramc, BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18380);
    for (int i = 0; i < c.a(this.jFR).size(); i++)
      ((c.a)c.a(this.jFR).get(i)).a(this.jFl, this.jFi, this.jFI);
    AppMethodBeat.o(18380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.c.2
 * JD-Core Version:    0.6.2
 */