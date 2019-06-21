package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.ipcall.a.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1 extends n.a
{
  g$1(g paramg)
  {
  }

  public final void gl(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(21743);
    ab.i("MicroMsg.IPCallSvrLogic", "onNetworkChange, st: %d", new Object[] { Integer.valueOf(paramInt) });
    if (i.bHr().nxA)
    {
      f localf = i.bHu();
      if ((localf.mCurrentState == 4) || (localf.mCurrentState == 5))
        i = 1;
      if ((i != 0) && (paramInt == 4) && (this.nvR.nvM != null))
        this.nvR.nvM.a(this.nvR.nvN);
    }
    AppMethodBeat.o(21743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.1
 * JD-Core Version:    0.6.2
 */