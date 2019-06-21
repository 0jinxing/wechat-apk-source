package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.f;
import com.tencent.mm.plugin.appbrand.jsapi.h;

final class a$1
  implements Runnable
{
  a$1(a parama, int paramInt, h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102022);
    f localf = f.gXv;
    f.F(this.hXe, this.hwr.getAppId());
    AppMethodBeat.o(102022);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.a.1
 * JD-Core Version:    0.6.2
 */