package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$3
  implements Runnable
{
  e$3(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18409);
    this.jGm.jFC.a(false, this.jGm.jFF);
    ab.i("MicroMsg.exdevice.BluetoothLESimpleManager", "Time out for discovering. Stop it");
    AppMethodBeat.o(18409);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.e.3
 * JD-Core Version:    0.6.2
 */