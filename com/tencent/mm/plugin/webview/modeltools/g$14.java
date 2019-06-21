package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.webview.model.ao;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class g$14 extends n.a
{
  private final byte[] ecf;

  g$14(g paramg)
  {
    AppMethodBeat.i(6986);
    this.ecf = new byte[0];
    AppMethodBeat.o(6986);
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(6987);
    synchronized (this.ecf)
    {
      if (at.getNetType(ah.getContext()) == 0)
      {
        ao.cXP().setNetWorkState(1);
        g.IR(paramInt);
        AppMethodBeat.o(6987);
        return;
      }
      ao.cXP().setNetWorkState(2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.g.14
 * JD-Core Version:    0.6.2
 */