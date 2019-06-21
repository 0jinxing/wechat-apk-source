package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class g
{
  private static n.a hlG;

  static
  {
    AppMethodBeat.i(10696);
    hlG = new g.1();
    AppMethodBeat.o(10696);
  }

  public static void initialize()
  {
    AppMethodBeat.i(10694);
    if (!ah.bqo())
      AppMethodBeat.o(10694);
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().a(hlG);
      AppMethodBeat.o(10694);
    }
  }

  public static void release()
  {
    AppMethodBeat.i(10695);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().b(hlG);
    AppMethodBeat.o(10695);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.g
 * JD-Core Version:    0.6.2
 */