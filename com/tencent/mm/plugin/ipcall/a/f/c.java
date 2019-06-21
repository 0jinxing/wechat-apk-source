package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.a.b;
import com.tencent.mm.plugin.ipcall.a.d.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends b
{
  private h nzp;

  public final void b(com.tencent.mm.plugin.ipcall.a.a.c paramc)
  {
    AppMethodBeat.i(21901);
    if (this.nvN != null)
    {
      this.nzp = new h(this.nvN.nwu, this.nvN.nwv, this.nvN.nww);
      aw.Rg().a(this.nzp, 0);
    }
    AppMethodBeat.o(21901);
  }

  public final int[] bHC()
  {
    return new int[] { 824 };
  }

  public final int bHD()
  {
    return 50000;
  }

  public final void bHE()
  {
    AppMethodBeat.i(21902);
    ab.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopSuccess");
    AppMethodBeat.o(21902);
  }

  public final void bHF()
  {
    AppMethodBeat.i(21903);
    ab.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopFailed");
    AppMethodBeat.o(21903);
  }

  public final int getServiceType()
  {
    return 5;
  }

  public final void onDestroy()
  {
  }

  public final void onStop()
  {
    AppMethodBeat.i(21900);
    if (this.nzp != null)
      aw.Rg().c(this.nzp);
    AppMethodBeat.o(21900);
  }

  public final void wO()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f.c
 * JD-Core Version:    0.6.2
 */