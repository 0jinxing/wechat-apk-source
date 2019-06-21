package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.n;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends a
{
  public int nzr = 1;
  public boolean nzs = false;

  public final void b(c paramc)
  {
    AppMethodBeat.i(21910);
    if (paramc != null)
    {
      ab.d("MicroMsg.IPCallShutDownService", "call shutdown scene, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(paramc.nwu), Integer.valueOf(paramc.nwx) });
      paramc = new n(paramc.nwu, paramc.nwv, paramc.nww, this.nzr);
      aw.Rg().a(paramc, 0);
    }
    AppMethodBeat.o(21910);
  }

  public final int[] bHC()
  {
    return new int[] { 723 };
  }

  public final int getServiceType()
  {
    return 4;
  }

  public final void onDestroy()
  {
  }

  public final void wO()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f.h
 * JD-Core Version:    0.6.2
 */