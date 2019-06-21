package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.j.a;
import java.util.List;

final class k$2
  implements j.a
{
  k$2(k paramk)
  {
  }

  public final boolean j(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126398);
    synchronized (this.hWc.hWa)
    {
      if (this.hWc.hWa.isEmpty())
      {
        bool = false;
        AppMethodBeat.o(126398);
        return bool;
      }
      this.hWc.hWb.run();
      boolean bool = true;
      AppMethodBeat.o(126398);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.k.2
 * JD-Core Version:    0.6.2
 */