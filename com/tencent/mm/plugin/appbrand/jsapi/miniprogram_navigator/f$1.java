package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;

final class f$1
  implements c.c
{
  f$1(f paramf, d paramd, int paramInt)
  {
  }

  public final void dY(boolean paramBoolean)
  {
    AppMethodBeat.i(101983);
    d locald = this.hJo;
    int i = this.eIl;
    f localf = this.hQU;
    if (paramBoolean);
    for (String str = "ok"; ; str = "fail")
    {
      locald.M(i, localf.j(str, null));
      AppMethodBeat.o(101983);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.f.1
 * JD-Core Version:    0.6.2
 */