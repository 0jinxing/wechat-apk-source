package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.a;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fts.a.n;

public final class f extends q
  implements b
{
  public f()
  {
    super(com.tencent.mm.bp.c.akt("search"));
    AppMethodBeat.i(18254);
    AppMethodBeat.o(18254);
  }

  public final void parallelsDependency()
  {
    AppMethodBeat.i(18255);
    a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(n.class));
    AppMethodBeat.o(18255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.f
 * JD-Core Version:    0.6.2
 */