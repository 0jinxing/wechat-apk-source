package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.sdk.platformtools.al;

final class k$2
  implements Runnable
{
  k$2(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74748);
    if (this.hKS.hKR == null)
      AppMethodBeat.o(74748);
    while (true)
    {
      return;
      long l = System.currentTimeMillis() - this.hKS.hKQ;
      if (l < 3000L)
      {
        al.n(new k.2.1(this), 3000L - l);
        AppMethodBeat.o(74748);
      }
      else
      {
        this.hKS.hKR.dismiss();
        AppMethodBeat.o(74748);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.k.2
 * JD-Core Version:    0.6.2
 */