package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class d$3
  implements Runnable
{
  d$3(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18394);
    ab.e("MicroMsg.exdevice.BluetoothLESession", "Write descriptor timeout!!!");
    if (3 == this.jGg.jGe)
    {
      ab.w("MicroMsg.exdevice.BluetoothLESession", "Bluetooth device is aready disconnet or close, just leave");
      AppMethodBeat.o(18394);
    }
    while (true)
    {
      return;
      this.jGg.mHandler.removeCallbacks(this.jGg.jGa);
      this.jGg.jGe = 2;
      if (this.jGg.jFU != null)
        this.jGg.jFU.jFz.l(this.jGg.mSessionId, false);
      AppMethodBeat.o(18394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.d.3
 * JD-Core Version:    0.6.2
 */