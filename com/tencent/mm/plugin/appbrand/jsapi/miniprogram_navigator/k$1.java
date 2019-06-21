package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.sdk.platformtools.al;

final class k$1
  implements b
{
  k$1(k paramk, c.b paramb, d paramd)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(131355);
    if (paramInt == 0)
    {
      this.hRe.proceed();
      AppMethodBeat.o(131355);
    }
    while (true)
    {
      return;
      this.hRe.cancel();
      al.d(new k.1.1(this));
      AppMethodBeat.o(131355);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k.1
 * JD-Core Version:    0.6.2
 */