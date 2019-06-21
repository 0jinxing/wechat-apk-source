package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.vending.g.f;

final class d$4
  implements a<Void, avx>
{
  d$4(d paramd)
  {
  }

  private Void b(avx paramavx)
  {
    AppMethodBeat.i(102249);
    try
    {
      d.a(this.iwr, paramavx);
      AppMethodBeat.o(102249);
      return null;
    }
    catch (Exception paramavx)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth appId = %s, e = %s", new Object[] { d.a(this.iwr), paramavx });
        f.dMj().cR(paramavx);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d.4
 * JD-Core Version:    0.6.2
 */