package com.tencent.mm.plugin.appbrand.dynamic.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.BaseIPCService;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$1
  implements ap.a
{
  public final boolean BI()
  {
    AppMethodBeat.i(10945);
    BaseIPCService localBaseIPCService = h.PO().lj("com.tencent.mm:support");
    if (localBaseIPCService != null)
      localBaseIPCService.ci(false);
    AppMethodBeat.o(10945);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.b.1
 * JD-Core Version:    0.6.2
 */