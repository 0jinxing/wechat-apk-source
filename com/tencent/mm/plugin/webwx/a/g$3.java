package com.tencent.mm.plugin.webwx.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.g.a.pt.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.c;

final class g$3 extends c<pt>
{
  g$3(g paramg)
  {
    AppMethodBeat.i(26511);
    this.xxI = pt.class.getName().hashCode();
    AppMethodBeat.o(26511);
  }

  private boolean a(pt parampt)
  {
    AppMethodBeat.i(26512);
    if ((parampt != null) && ((parampt instanceof pt)))
    {
      d locald = new d(parampt.cLX.cLY);
      parampt = new g.3.1(this, locald, parampt);
      aw.Rg().a(971, parampt);
      aw.Rg().a(locald, 0);
    }
    AppMethodBeat.o(26512);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.g.3
 * JD-Core Version:    0.6.2
 */