package com.tencent.mm.plugin.appbrand.canvas;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$7
  implements Runnable
{
  b$7(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103146);
    ab.i("MicroMsg.DrawActionDelegateImpl", "clear draw actions");
    this.hcy.hch = null;
    this.hcy.hcg = null;
    this.hcy.hcf = true;
    AppMethodBeat.o(103146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.7
 * JD-Core Version:    0.6.2
 */