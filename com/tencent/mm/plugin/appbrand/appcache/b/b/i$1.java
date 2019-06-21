package com.tencent.mm.plugin.appbrand.appcache.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.vending.g.f;

final class i$1
  implements a<Void, Void>
{
  i$1(i parami)
  {
  }

  private Void asR()
  {
    AppMethodBeat.i(129477);
    try
    {
      i.a(this.gWh);
      AppMethodBeat.o(129477);
      return null;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", localThrowable, "handleRetry()", new Object[0]);
        f.dMj().cR(null);
        synchronized (this.gWh)
        {
          i.b(this.gWh);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.b.i.1
 * JD-Core Version:    0.6.2
 */