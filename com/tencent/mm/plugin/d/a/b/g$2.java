package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class g$2
  implements Runnable
{
  g$2(g paramg, BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18446);
    for (int i = 0; i < g.a(this.jGF).size(); i++)
      ((g.a)g.a(this.jGF).get(i)).a(this.jFl, this.jFi, this.jFI);
    AppMethodBeat.o(18446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.g.2
 * JD-Core Version:    0.6.2
 */