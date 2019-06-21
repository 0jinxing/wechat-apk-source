package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.UUID;

public final class f$6
  implements Runnable
{
  public f$6(f paramf, UUID paramUUID)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18339);
    if (!f.a(this.jFf, this.jFh))
      ab.e("MicroMsg.exdevice.IBeaconServer", "startRanging failed!!!");
    AppMethodBeat.o(18339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.f.6
 * JD-Core Version:    0.6.2
 */