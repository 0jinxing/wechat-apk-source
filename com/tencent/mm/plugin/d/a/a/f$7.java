package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.UUID;

public final class f$7
  implements Runnable
{
  public f$7(f paramf, UUID paramUUID)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18340);
    if (!f.b(this.jFf, this.jFh))
      ab.e("MicroMsg.exdevice.IBeaconServer", "stopRanging failed!!!");
    AppMethodBeat.o(18340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.f.7
 * JD-Core Version:    0.6.2
 */