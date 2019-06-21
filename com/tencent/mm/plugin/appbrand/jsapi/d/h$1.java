package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.o;

final class h$1
  implements Runnable
{
  h$1(h paramh, u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123545);
    if (o.a(this.hCx, this.hKt, this.hKx, this.hKy))
    {
      this.hCx.M(this.eIl, this.hKz.j("ok", null));
      AppMethodBeat.o(123545);
    }
    while (true)
    {
      return;
      this.hCx.M(this.eIl, this.hKz.j("fail:invalid data", null));
      AppMethodBeat.o(123545);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.h.1
 * JD-Core Version:    0.6.2
 */