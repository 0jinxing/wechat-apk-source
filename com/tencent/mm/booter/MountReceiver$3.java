package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;

final class MountReceiver$3
  implements Runnable
{
  MountReceiver$3(MountReceiver paramMountReceiver)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15847);
    ab.d("MicroMsg.MountReceiver", "dkmount [EJECT] action:%s hasuin:%b", new Object[] { MountReceiver.a(this.ebX), Boolean.valueOf(aw.RK()) });
    if (!aw.RK())
      AppMethodBeat.o(15847);
    while (true)
    {
      return;
      g.RP().RC();
      aw.ZK();
      c.RA();
      AppMethodBeat.o(15847);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MountReceiver.3
 * JD-Core Version:    0.6.2
 */