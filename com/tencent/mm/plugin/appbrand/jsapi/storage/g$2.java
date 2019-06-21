package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.h;

final class g$2
  implements Runnable
{
  g$2(g paramg, JsApiGetStorageInfoTask paramJsApiGetStorageInfoTask, h paramh, int paramInt, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102041);
    g.a(this.hXj, this.hXk.hXl, this.hXk.size, this.hXk.limit, this.hBK, this.eIl);
    g.a(1, this.hXk.hXl, this.hXk.size * 1000, this.fEG, this.hBK);
    AppMethodBeat.o(102041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.g.2
 * JD-Core Version:    0.6.2
 */