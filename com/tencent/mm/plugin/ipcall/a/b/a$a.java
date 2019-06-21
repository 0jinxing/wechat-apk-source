package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.voip.model.c;

public final class a$a
  implements Runnable
{
  private c nxe = null;

  public a$a(a parama, c paramc)
  {
    this.nxe = paramc;
  }

  public final void run()
  {
    AppMethodBeat.i(21799);
    if (this.nxe != null)
    {
      this.nxe.cIr();
      this.nxe.cIo();
      this.nxe = null;
      this.nxd.nxc = false;
    }
    aw.ZL().setMode(0);
    AppMethodBeat.o(21799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.a.a
 * JD-Core Version:    0.6.2
 */