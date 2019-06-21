package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class f$5
  implements ap.a
{
  f$5(f paramf)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(18338);
    ab.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]time out ,let's stop this new method scan");
    f.k(this.jFf);
    AppMethodBeat.o(18338);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.f.5
 * JD-Core Version:    0.6.2
 */