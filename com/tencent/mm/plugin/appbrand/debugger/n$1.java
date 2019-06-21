package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;

final class n$1
  implements u.a
{
  n$1(n paramn)
  {
  }

  public final void azf()
  {
    AppMethodBeat.i(101828);
    this.hjY.destroy();
    g.a(this.hjY.hjV.getAppId(), g.d.gNm);
    this.hjY.hjV.xL().finish();
    AppMethodBeat.o(101828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.n.1
 * JD-Core Version:    0.6.2
 */