package com.tencent.mm.plugin.wenote.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fav.a.ae;

public final class a extends q
  implements b
{
  public a()
  {
    super(com.tencent.mm.bp.c.akt("wenote"));
    AppMethodBeat.i(26593);
    AppMethodBeat.o(26593);
  }

  public final void parallelsDependency()
  {
    AppMethodBeat.i(26594);
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(ae.class));
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(com.tencent.mm.plugin.record.a.a.class));
    AppMethodBeat.o(26594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.a
 * JD-Core Version:    0.6.2
 */