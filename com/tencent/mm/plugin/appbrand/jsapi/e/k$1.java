package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.a;
import com.tencent.mm.plugin.appbrand.page.a.a;
import com.tencent.mm.plugin.appbrand.page.a.c.a;

final class k$1
  implements Runnable
{
  k$1(k paramk, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74746);
    if (this.hKS.hKR != null)
      this.hKS.hKR.dismiss();
    this.hKS.hKR = a.z(this.gVf).a(a.a.iqG);
    this.hKS.hKQ = System.currentTimeMillis();
    AppMethodBeat.o(74746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.k.1
 * JD-Core Version:    0.6.2
 */