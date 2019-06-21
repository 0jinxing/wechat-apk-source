package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class d$2
  implements ap.a
{
  d$2(d paramd, boolean paramBoolean)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(21819);
    if (!this.nxw)
    {
      ab.i("MicroMsg.IPCallSensorManager", "off screen");
      if (this.nxv.nxu != null)
        this.nxv.nxu.iq(true);
    }
    while (true)
    {
      AppMethodBeat.o(21819);
      return false;
      ab.i("MicroMsg.IPCallSensorManager", "light screen");
      if (this.nxv.nxu != null)
        this.nxv.nxu.iq(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.d.2
 * JD-Core Version:    0.6.2
 */