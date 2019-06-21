package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.d.g;

public final class b
{
  private static b nzn;
  private g nzo;

  public static b bHU()
  {
    AppMethodBeat.i(21898);
    if (nzn == null)
      nzn = new b();
    b localb = nzn;
    AppMethodBeat.o(21898);
    return localb;
  }

  public final void it(boolean paramBoolean)
  {
    AppMethodBeat.i(21899);
    aw.Rg().c(this.nzo);
    this.nzo = null;
    if (paramBoolean);
    for (this.nzo = new g(1); ; this.nzo = new g(0))
    {
      aw.Rg().a(this.nzo, 0);
      AppMethodBeat.o(21899);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f.b
 * JD-Core Version:    0.6.2
 */