package com.tencent.mm.plugin.appbrand.config.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$2
  implements Runnable
{
  public b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86933);
    ab.i("MicroMsg.AppBrandDeviceOrientationRetrier", "hy: stop count fail");
    b.a(this.hiY);
    AppMethodBeat.o(86933);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.b.2
 * JD-Core Version:    0.6.2
 */