package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class MountReceiver$2
  implements Runnable
{
  MountReceiver$2(MountReceiver paramMountReceiver)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15846);
    ab.d("MicroMsg.MountReceiver", "dkmount [MOUNT] action:%s hasuin:%b", new Object[] { MountReceiver.a(this.ebX), Boolean.valueOf(aw.RK()) });
    if (!aw.RK())
      AppMethodBeat.o(15846);
    while (true)
    {
      return;
      g.RP().RC();
      aw.ZK();
      c.RA();
      MountReceiver.c(this.ebX).sendEmptyMessage(0);
      AppMethodBeat.o(15846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MountReceiver.2
 * JD-Core Version:    0.6.2
 */