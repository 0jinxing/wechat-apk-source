package com.tencent.mm.ui.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class a$2
  implements n.c
{
  a$2(a parama)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(29927);
    if (this.yrl.yrj == null)
    {
      ab.e("MicroMsg.AppBrandServiceActionSheet", "resetOnCreateMenuListener, state is null");
      AppMethodBeat.o(29927);
    }
    while (true)
    {
      return;
      this.yrl.yrj.a(paraml);
      AppMethodBeat.o(29927);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.a.2
 * JD-Core Version:    0.6.2
 */