package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.o;

public final class ILaunchWxaAppInfoNotify$a$2
  implements c.a
{
  public ILaunchWxaAppInfoNotify$a$2(o paramo, MMToClientEvent.c paramc)
  {
  }

  public final void a(String paramString, b paramb)
  {
    AppMethodBeat.i(131827);
    if (paramb == b.gWw)
      MMToClientEvent.b(this.gQw.mAppId, this.hce);
    AppMethodBeat.o(131827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify.a.2
 * JD-Core Version:    0.6.2
 */