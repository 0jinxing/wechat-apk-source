package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.i;

final class b$8
  implements Runnable
{
  b$8(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135326);
    a locala = a.cMn();
    if (locala.sTj != null)
      locala.sTj.Gx(0);
    AppMethodBeat.o(135326);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.8
 * JD-Core Version:    0.6.2
 */