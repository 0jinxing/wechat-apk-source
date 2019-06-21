package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$2
  implements Runnable
{
  d$2(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18393);
    ab.e("MicroMsg.exdevice.BluetoothLESession", "Write data timeout");
    if (this.jGg.jFU != null)
      this.jGg.jFU.jFz.m(this.jGg.mSessionId, false);
    this.jGg.aVA();
    AppMethodBeat.o(18393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.d.2
 * JD-Core Version:    0.6.2
 */