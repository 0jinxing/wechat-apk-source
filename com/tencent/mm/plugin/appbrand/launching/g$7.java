package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ba.k;
import com.tencent.mm.kernel.e;

final class g$7
  implements Runnable
{
  g$7(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131783);
    Object localObject = com.tencent.mm.plugin.appbrand.config.p.zl(this.igR.username);
    if ((localObject != null) && (localObject.length > 0))
    {
      int i = localObject.length;
      for (int j = 0; j < i; j++)
      {
        String str = localObject[j];
        com.tencent.mm.modelappbrand.a.b.abR().pC(str);
      }
    }
    if (com.tencent.mm.kernel.g.RP().isSDCardAvailable())
    {
      localObject = new k(12);
      com.tencent.mm.kernel.g.RO().eJo.a((m)localObject, 0);
    }
    AppMethodBeat.o(131783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.g.7
 * JD-Core Version:    0.6.2
 */