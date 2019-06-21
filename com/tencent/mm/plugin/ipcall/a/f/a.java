package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends com.tencent.mm.plugin.ipcall.a.a.a
{
  public final void b(c paramc)
  {
    AppMethodBeat.i(21897);
    if (paramc != null)
    {
      ab.d("MicroMsg.IPCallCancelService", "call cancel scene, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(paramc.nwu), Integer.valueOf(paramc.nwx) });
      paramc = new com.tencent.mm.plugin.ipcall.a.d.a(paramc.nwu, paramc.nwv, paramc.cMr, paramc.nwW, paramc.nwx, paramc.nww);
      aw.Rg().a(paramc, 0);
    }
    AppMethodBeat.o(21897);
  }

  public final int[] bHC()
  {
    return new int[] { 843 };
  }

  public final int getServiceType()
  {
    return 3;
  }

  public final void onDestroy()
  {
  }

  public final void wO()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f.a
 * JD-Core Version:    0.6.2
 */