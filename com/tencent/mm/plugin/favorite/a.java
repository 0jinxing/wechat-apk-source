package com.tencent.mm.plugin.favorite;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fts.a.n;

public final class a extends q
  implements b
{
  public a()
  {
    super(com.tencent.mm.bp.c.akt("favorite"));
    AppMethodBeat.i(20496);
    AppMethodBeat.o(20496);
  }

  public final void parallelsDependency()
  {
    AppMethodBeat.i(20497);
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(n.class));
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(ae.class));
    AppMethodBeat.o(20497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.a
 * JD-Core Version:    0.6.2
 */