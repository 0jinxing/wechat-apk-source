package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.r;
import com.tencent.mm.plugin.appbrand.jsapi.h;

final class n$3
  implements Runnable
{
  n$3(n paramn, n.a parama, JsApiSetStorageTask paramJsApiSetStorageTask, h paramh, int paramInt, String paramString1, String paramString2, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102074);
    if (this.hXu != null)
      this.hXu.a(this.hXv.result, this.hBK, this.eIl);
    n.b(1, r.by(this.val$key, this.gdK), this.fEG, this.hBK);
    this.hXv.aBW();
    AppMethodBeat.o(102074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.n.3
 * JD-Core Version:    0.6.2
 */