package com.tencent.mm.plugin.appbrand.config.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Timer;

final class b$1$1$1
  implements Runnable
{
  b$1$1$1(b.1.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86930);
    ab.w("MicroMsg.AppBrandDeviceOrientationRetrier", "hy: still not cancelled, trigger retry");
    b localb = this.hja.hiZ.hiY;
    localb.hiU += 1;
    if (this.hja.hiZ.hiY.hiU > 3)
    {
      if (this.hja.hiZ.hiY.hiV != null)
        this.hja.hiZ.hiY.hiV.ayR();
      this.hja.hiZ.hiY.hiW.cancel();
      AppMethodBeat.o(86930);
    }
    while (true)
    {
      return;
      if (this.hja.hiZ.hiY.hiV != null)
        this.hja.hiZ.hiY.hiV.ayS();
      AppMethodBeat.o(86930);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.b.1.1.1
 * JD-Core Version:    0.6.2
 */