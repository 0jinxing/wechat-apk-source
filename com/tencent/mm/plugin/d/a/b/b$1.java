package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18363);
    this.jFH.jFB = false;
    this.jFH.fv(false);
    ab.i("MicroMsg.exdevice.BluetoothLEManager", "Time out for discovering. Stop it");
    this.jFH.aVv();
    if (this.jFH.jFz != null)
      this.jFH.jFz.aVx();
    AppMethodBeat.o(18363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.b.1
 * JD-Core Version:    0.6.2
 */