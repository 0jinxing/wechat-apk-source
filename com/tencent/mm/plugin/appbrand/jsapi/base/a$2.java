package com.tencent.mm.plugin.appbrand.jsapi.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.sdk.platformtools.al;

final class a$2
  implements f.c
{
  a$2(a parama, e parame, int paramInt, v.b paramb)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(91045);
    this.hCK.b(this);
    al.d(new a.2.1(this));
    this.hCK.aBf().pA(this.hCN);
    this.hAt.recycle();
    System.gc();
    AppMethodBeat.o(91045);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.a.2
 * JD-Core Version:    0.6.2
 */