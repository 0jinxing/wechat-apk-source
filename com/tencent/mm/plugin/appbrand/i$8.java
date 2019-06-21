package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentLinkedQueue;

final class i$8
  implements i.a
{
  i$8(i parami, ConcurrentLinkedQueue paramConcurrentLinkedQueue, i.b paramb, i.a parama)
  {
  }

  public final void done()
  {
    AppMethodBeat.i(86659);
    if (!this.gOi.remove(this.gOj))
    {
      ab.e("MicroMsg.AppBrandRuntime", "[%s]prepare duplicate ready() called", new Object[] { this.gOb.mAppId });
      AppMethodBeat.o(86659);
    }
    while (true)
    {
      return;
      if (this.gOi.isEmpty())
        this.gOk.done();
      AppMethodBeat.o(86659);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.8
 * JD-Core Version:    0.6.2
 */