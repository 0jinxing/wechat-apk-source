package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.n.a;
import com.tencent.mm.plugin.appbrand.appstorage.r;
import com.tencent.mm.plugin.appbrand.jsapi.h;

final class f$1
  implements Runnable
{
  f$1(f paramf, int paramInt1, String paramString1, String paramString2, h paramh, int paramInt2, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102034);
    Object localObject1 = com.tencent.mm.plugin.appbrand.appstorage.f.gXv;
    Object localObject2 = com.tencent.mm.plugin.appbrand.appstorage.f.k(this.hXe, this.val$appId, this.val$key);
    if ((n.a)localObject2[0] == n.a.gXV)
    {
      localObject1 = (String)localObject2[1];
      localObject2 = (String)localObject2[2];
    }
    while (true)
    {
      if (localObject1 == null);
      for (String str = "fail:data not found"; ; str = "ok")
      {
        f.a(this.hXh, str, (String)localObject1, (String)localObject2, this.hBK, this.eIl);
        f.a(2, r.by(this.val$key, (String)localObject1), this.fEG, this.hBK);
        AppMethodBeat.o(102034);
        return;
      }
      localObject2 = null;
      localObject1 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.f.1
 * JD-Core Version:    0.6.2
 */