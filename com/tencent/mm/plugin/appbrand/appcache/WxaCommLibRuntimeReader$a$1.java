package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class WxaCommLibRuntimeReader$a$1
  implements Runnable
{
  WxaCommLibRuntimeReader$a$1(WxaCommLibRuntimeReader.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(59457);
    if (!g.RN().eJb)
      AppMethodBeat.o(59457);
    while (true)
    {
      return;
      try
      {
        ((b)g.K(b.class)).dy(false);
        AppMethodBeat.o(59457);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.WxaCommLibRuntimeReader", localException, "[NOT CRASH]", new Object[0]);
        AppMethodBeat.o(59457);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader.a.1
 * JD-Core Version:    0.6.2
 */